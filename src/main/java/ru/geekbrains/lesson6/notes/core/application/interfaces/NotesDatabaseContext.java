package main.java.ru.geekbrains.lesson6.notes.core.application.interfaces;

import main.java.ru.geekbrains.lesson6.notes.core.domain.Note;

import java.util.Collection;

public interface NotesDatabaseContext {

    Collection<Note> getAll();
    void add(Note note);
    void remove(Note note);
    Note edit(Note note);

    boolean saveChanges();

}
