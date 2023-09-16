package main.java.ru.geekbrains.lesson6.notes.infrastructure.persistance;


import main.java.ru.geekbrains.lesson6.database.NotesDatabase;
import main.java.ru.geekbrains.lesson6.database.NotesRecord;
import main.java.ru.geekbrains.lesson6.notes.core.application.interfaces.NotesDatabaseContext;
import main.java.ru.geekbrains.lesson6.notes.core.domain.Note;
import main.java.ru.geekbrains.lesson6.notes.infrastructure.persistance.configurations.NoteConfiguration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class NotesDbContext extends DbContext implements NotesDatabaseContext {
    @Override
    public void add(Note note) {
        ((NotesDatabase) database).addNoteRecord(new NotesRecord(note.getTitle(), note.getDetails()));
    }

    @Override
    public void remove(Note note) {
        ((NotesDatabase) database).removeNoteRecord(note.getId());
    }

    @Override
    public Note edit(Note note) {
        NotesRecord notesRecord = ((NotesDatabase) database).getNotesTable().getRecords().stream().filter(record -> record.getId() == note.getId()).findFirst().orElseThrow();
        notesRecord.setDetails(note.getDetails());
        notesRecord.setTitle(note.getTitle());
        notesRecord.setEditDate(new Date());
        NotesRecord newRecord = ((NotesDatabase) database).editNoteRecord(notesRecord);
        return new Note(newRecord.getId(), newRecord.getUserId(), newRecord.getTitle(), newRecord.getDetails(), newRecord.getCreationDate());
    }

    @Override
    public Collection<Note> getAll() {
        Collection<Note> notesList = new ArrayList<>();
        //TODO: Этого кастинга быть не должно, тут должен работать внутренний механизм фреймворка
        for (NotesRecord record : ((NotesDatabase) database).getNotesTable().getRecords()) {
            notesList.add(new Note(
                    record.getId(),
                    record.getUserId(),
                    record.getTitle(),
                    record.getDetails(),
                    record.getCreationDate()
            ));
        }
        return notesList;
    }

    public NotesDbContext(Database database) {
        super(database);
    }

    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
    }


}
