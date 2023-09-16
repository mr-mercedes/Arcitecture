package main.java.ru.geekbrains.lesson6.notes.infrastructure.utils;

import main.java.ru.geekbrains.lesson6.notes.core.domain.Note;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Random;

public class NoteCreater {

    Random random = new Random();
    Collection<Note> notes;


    public Collection<Note> getNotes() {
        return notes;
    }

    public Note getNote(int id){
        if (this.notes == null) throw new RuntimeException("Eternal error");
        return this.notes.stream().filter(note -> note.getId() == id).findFirst().orElseThrow();
    }
    public NoteCreater() {
        if (notes == null){
            notes = new ArrayList<>();
            for (int i = 10000; i < 10010; i++) {
                Note note = new Note(i, i* random.nextInt(1,9), String.format("Title #%d", i),String.format("Detales #%d", i), new Date());
                notes.add(note);
            }
        }
    }
}
