package main.java.ru.geekbrains.lesson2;

public class ProgrammerAdapter extends Clown implements Programmer{
    @Override
    public Object refactoring() {
        return makeJoke();
    }

    @Override
    public Object debug() {
        return makeMove();
    }

    @Override
    public Object cry() {
        return makeFocus();
    }
}
