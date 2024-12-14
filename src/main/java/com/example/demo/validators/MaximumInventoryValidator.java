package com.example.demo.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.example.demo.domain.Part;

public class MaximumInventoryValidator implements ConstraintValidator<ValidMaximumInventory, Part> {
    @Autowired
    private ApplicationContext context;

    public static  ApplicationContext myContext;


    @Override
    public void initialize(ValidMaximumInventory constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() <= part.getMaxInv();
    }
}