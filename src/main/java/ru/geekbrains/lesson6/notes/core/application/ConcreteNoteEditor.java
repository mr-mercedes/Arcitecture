package main.java.ru.geekbrains.lesson6.notes.core.application;


import main.java.ru.geekbrains.lesson6.notes.core.application.interfaces.NoteEditor;
import main.java.ru.geekbrains.lesson6.notes.core.application.interfaces.NotesDatabaseContext;
import main.java.ru.geekbrains.lesson6.notes.core.application.interfaces.NotesPresenter;
import main.java.ru.geekbrains.lesson6.notes.core.domain.Note;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

public class ConcreteNoteEditor implements NoteEditor {

    private final NotesDatabaseContext dbContext;
    private final NotesPresenter notesPresenter;

    public ConcreteNoteEditor(NotesDatabaseContext dbContext,
                              NotesPresenter notesPresenter) {
        this.dbContext = dbContext;
        this.notesPresenter = notesPresenter;
    }

    @Override
    public boolean add(Note item) {
        dbContext.add(item);
        return dbContext.saveChanges();
    }

    @Override
    public Note edit(Note item) {
        if (item == null)
            throw new RuntimeException();
        Optional<Note> note = getById(item.getId());
        if (note.isEmpty())
            throw new RuntimeException();
        note.get().setTitle(item.getTitle());
        note.get().setDetails(item.getDetails());
        note.get().setEditDate(new Date());
        return dbContext.edit(note.get());
    }

    @Override
    public void remove(Note item) {
        dbContext.getAll().remove(item);
        dbContext.saveChanges();
    }

    @Override
    public Optional<Note> getById(Integer id) {
        return dbContext.getAll().stream().filter(p -> p.getId() == id).findFirst();
    }

    @Override
    public Collection<Note> getAll() {
        return dbContext.getAll();
    }

    @Override
    public void printAll() {
        notesPresenter.printAll(getAll());
    }
}
