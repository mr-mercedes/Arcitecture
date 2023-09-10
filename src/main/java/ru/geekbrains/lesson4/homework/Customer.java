package main.java.ru.geekbrains.lesson4.homework;

import main.java.ru.geekbrains.lesson4.homework.Ticket;

import java.util.Collection;
/**
 * Покупатель
 */
public class Customer {
    private static int counter;

    private final int id;

    private Collection<Ticket> tickets;

    {
        id = ++counter;
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }

    public int getId() {
        return id;
    }
}
