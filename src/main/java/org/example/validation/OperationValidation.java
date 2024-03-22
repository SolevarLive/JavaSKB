package org.example.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Constraint(validatedBy = OperationValidator.class)
public @interface OperationValidation {
    String message() default "price is less than or equal to 0";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
