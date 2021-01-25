package com.client.model;

import java.time.LocalDateTime;
import java.util.Set;

import com.client.model.enums.DocumentType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client {

    private String nameClient;

    private DocumentType documentType;

    private String documentNumber;

    private DocumentType numberDoicument;

    private boolean deleted = false;

    private Set<Telephone> telephone;

    private LocalDateTime generationDate = LocalDateTime.now();

}
