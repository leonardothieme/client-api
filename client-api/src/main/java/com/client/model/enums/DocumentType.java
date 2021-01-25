package com.client.model.enums;

import java.util.Arrays;
import java.util.Optional;

import com.client.util.validator.impl.ValidCPFValidator;

public enum DocumentType {

    INVALID {
        @Override
        public boolean isValid(String document) {
            return false;
        }
    },
    CPF {
        @Override
        public boolean isValid(String document) {
            return new ValidCPFValidator().isValid(document, null);
        }

    };

    public static boolean isMember(String documentName) {
        DocumentType[] documents = DocumentType.values();

        for (DocumentType document : documents)
            if (document.toString().equals(documentName))
                return true;

        return false;
    }

    public abstract boolean isValid(String document);

    public static Optional<DocumentType> findType(String document) {
        return Arrays.stream(values()).filter(type -> type.isValid(document)).findFirst();
    }

}
