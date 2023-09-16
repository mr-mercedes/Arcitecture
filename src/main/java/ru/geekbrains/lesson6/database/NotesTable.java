package main.java.ru.geekbrains.lesson6.database;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class NotesTable {

    private final Random random = new Random();

    private Collection<NotesRecord> records;

    public Collection<NotesRecord> getRecords() {
        if (records == null) {
            records = new ArrayList<>();
            int recordsCount = 5 + random.nextInt(10);
            for (int i = 0; i < recordsCount; i++) {
                records.add(new NotesRecord("title #" + i, "details #" + i));
            }
        }
        return records;
    }

    public void addRecord(NotesRecord notesRecord) {
        records.add(notesRecord);
    }

    public void removeRecord(int id) {
        NotesRecord notesRecord = records.stream().filter(record -> record.getId() == id).findFirst().orElseThrow();
        records.remove(notesRecord);
    }

    public NotesRecord editRecord(NotesRecord notesRecord) {
        removeRecord(notesRecord.getId());
        records.add(notesRecord);
        return notesRecord;
    }
}
