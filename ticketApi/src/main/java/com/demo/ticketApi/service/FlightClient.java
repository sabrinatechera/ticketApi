package com.demo.ticketApi.service;

import com.demo.ticketApi.model.FlightDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.Optional;


@FeignClient(name="flight-api")
public interface FlightClient {

    @GetMapping("/flights")
    List<FlightDTO> getAllFlights();

    @GetMapping("/dto/{idflight}")
    Optional<FlightDTO> findFlightById(@PathVariable Long idflight);


}
