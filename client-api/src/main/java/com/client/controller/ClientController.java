package com.client.controller;

import static org.springframework.http.HttpStatus.CREATED;

import javax.validation.Valid;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.client.api.ClientApi;
import com.client.model.payload.CreateClientPayload;
import com.client.model.response.ClientResponse;
import com.client.service.ClientService;

import lombok.RequiredArgsConstructor;

@Validated
@CrossOrigin
@RestController
@RequestMapping("/client/")
@RequiredArgsConstructor
public class ClientController implements ClientApi {

    private final ClientService clientService;

    @Override
    @PostMapping
    @ResponseStatus(code = CREATED)
    public ClientResponse createTicketFee(@Valid CreateClientPayload payload) {
        // TODO Auto-generated method stub
        return null;
    }

}
