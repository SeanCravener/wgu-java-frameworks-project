package com.example.demo.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

import com.example.demo.domain.Part;

public class MinimumInventoryValidator implements ConstraintValidator<ValidMinimumInventory, Part> {
    @Autowired
    private ApplicationContext context;

    public static  ApplicationContext myContext;

    @Override
    public void initialize(ValidMinimumInventory constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {
        return part.getInv() >= part.getMinInv();
    }
}