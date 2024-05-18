package com.demo.ticketApi.service.serviceImpl;

import com.demo.ticketApi.model.Ticket;
import com.demo.ticketApi.service.TicketService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService {



    public final List<Ticket>ticketsList=new ArrayList<>();


    @Override
    public List<Ticket> findAllTickets() {
        return ticketsList;
    }

    @Override
    public Ticket addTicket(Ticket ticket) {
        ticketsList.add(ticket);
        return ticket ;
    }

    public Optional<Ticket> findTicketById(Long id) {

        Optional<Ticket> Ticket = ticketsList.stream()
                .filter(ticket -> ticket.getId().equals(id))
                .findFirst();
        return Ticket;
    }


}
