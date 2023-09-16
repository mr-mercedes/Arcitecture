package main.java.ru.geekbrains.lesson6.database;


import main.java.ru.geekbrains.lesson6.notes.infrastructure.persistance.Database;

public class NotesDatabase implements Database {

    private NotesTable notesTable;

    public NotesTable getNotesTable() {
        if (notesTable == null)
            notesTable = new NotesTable();
        return notesTable;
    }

    public void addNoteRecord(NotesRecord notesRecord){
        notesTable.addRecord(notesRecord);
    }

    public void removeNoteRecord(int id){
        notesTable.removeRecord(id);
    }
    public NotesRecord editNoteRecord(NotesRecord notesRecord){
        return notesTable.editRecord(notesRecord);
    }
}
