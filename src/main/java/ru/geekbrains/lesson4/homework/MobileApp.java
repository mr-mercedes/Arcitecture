package main.java.ru.geekbrains.lesson4.homework;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * Мобильное приложение
 */
public class MobileApp {
    private final Customer customer;
    private final TicketProvider ticketProvider;
    private final CustomerProvider customerProvider;


    public MobileApp(TicketProvider ticketProvider, CustomerProvider customerProvider) {
        this.ticketProvider = ticketProvider;
        this.customerProvider = customerProvider;
        customer = customerProvider.getCustomer("<login>", "<password>");

    }

    public Collection<Ticket> getTickets(){
        return customer.getTickets();
    }

    public void searchTicket(Date date){
        customer.setTickets(ticketProvider.searchTicket(customer.getId(), new Date()));
    }

    public boolean buyTicket(String cardNo){
        Ticket ticket = ticketProvider.buyTicket(customer.getId(), cardNo);
        customer.setTickets(List.of(ticket));
        return true;
    }
}
