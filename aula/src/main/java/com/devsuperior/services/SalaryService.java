package com.devsuperior.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    @Autowired
    private com.devsuperior.services.TaxService taxService;

    @Autowired
    private PensionService pensionService;

    public double netSalary(double grossSalary) {
        return grossSalary - taxService.tax(grossSalary) - pensionService.discount(grossSalary);
    }
}