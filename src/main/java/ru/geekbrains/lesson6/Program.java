package main.java.ru.geekbrains.lesson6;


import main.java.ru.geekbrains.lesson6.database.NotesDatabase;
import main.java.ru.geekbrains.lesson6.notes.core.application.ConcreteNoteEditor;
import main.java.ru.geekbrains.lesson6.notes.core.domain.Note;
import main.java.ru.geekbrains.lesson6.notes.infrastructure.persistance.NotesDbContext;
import main.java.ru.geekbrains.lesson6.notes.infrastructure.utils.NoteCreater;
import main.java.ru.geekbrains.lesson6.notes.presentation.queries.controllers.NotesController;
import main.java.ru.geekbrains.lesson6.notes.presentation.queries.views.NotesConsolePresenter;

public class Program {

    public static void main(String[] args) {
        NoteCreater noteCreater = new NoteCreater();

        NotesController controller = new NotesController(
                new ConcreteNoteEditor(new NotesDbContext(new NotesDatabase()), new NotesConsolePresenter()));

        System.out.println("________________  BEFORE  __________________");
        controller.routeGetAll();
        System.out.println("________________  BEFORE  __________________");
        noteCreater.getNotes().forEach(controller::routeAddNote);
        System.out.println("________________  AFTER  __________________");
        controller.routeGetAll();
        System.out.println("________________  AFTER  __________________");
        Note note = controller.getNote(1001);
        System.out.println("________________  EDIT  __________________");
        note.setDetails("EDIT DETAILS");
        note.setTitle("EDIT TITLE");
        controller.editNote(note);
        controller.routeGetAll();
        System.out.println("________________  EDIT  __________________");
    }

}
