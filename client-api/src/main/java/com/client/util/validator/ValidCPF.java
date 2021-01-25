package com.client.util.validator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.client.util.validator.impl.ValidCPFValidator;

@Documented
@Constraint(validatedBy = ValidCPFValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidCPF {

    String message() default "Invalid CPF";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}