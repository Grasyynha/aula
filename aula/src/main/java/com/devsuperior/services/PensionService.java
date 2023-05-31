package com.devsuperior.services;

import org.springframework.stereotype.Service;

@Service
public class PensionService {

    double discount(double amount) {
        return amount * 0.1;
    }
}