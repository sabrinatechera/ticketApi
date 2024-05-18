package com.demo.ticketApi.service;

import com.demo.ticketApi.model.Ticket;

import java.util.List;

public interface TicketService {


    List<Ticket> findAllTickets();

    Ticket addTicket(Ticket ticket);

}
