package com.client.api;

import javax.validation.Valid;

import com.client.common.model.ErrorResponse;
import com.client.model.payload.CreateClientPayload;
import com.client.model.response.ClientResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Client")
public interface ClientApi {

    @ApiOperation("Create new client.")
    @ApiResponses({ @ApiResponse(code = 400, message = "Invalid information in payload field(s)", response = ErrorResponse.class),
            @ApiResponse(code = 201, message = "New client fee was created with success", response = ClientResponse.class),
            @ApiResponse(code = 500, message = "Unexpected error") })
    ClientResponse createTicketFee(@ApiParam("Payload to create new client") @Valid final CreateClientPayload payload);

}
