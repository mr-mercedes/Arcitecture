package main.java.ru.geekbrains.lesson6.notes.presentation.queries.controllers;


import main.java.ru.geekbrains.lesson6.notes.core.application.interfaces.NoteEditor;
import main.java.ru.geekbrains.lesson6.notes.core.domain.Note;

public class NotesController extends Controller {

    private final NoteEditor notesEditor;

    public NotesController(NoteEditor notesEditor) {
        this.notesEditor = notesEditor;
    }

    public void routeAddNote(Note note) {
        this.notesEditor.add(note);
    }

    public void routeRemoveNote(Note note) {
        this.notesEditor.remove(note);
    }

    public Note editNote(Note note) {
       return this.notesEditor.edit(note);
    }
    public Note getNote(int id){
        return this.notesEditor.getById(id).orElseThrow();
    }

    public void routeGetAll() {
        this.notesEditor.printAll();
    }

}
