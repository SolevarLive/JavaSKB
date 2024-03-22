package org.example.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.example.dto.Operation;


public class OperationValidator implements ConstraintValidator<OperationValidation, Operation> {

    @Override
    public boolean isValid(Operation operation, ConstraintValidatorContext context) {
        return operation.getPrice() >= 0;
    }
}
