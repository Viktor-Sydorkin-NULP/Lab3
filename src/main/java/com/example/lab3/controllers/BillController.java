package com.example.lab3.controllers;

import com.example.lab3.models.Bill;
import com.example.lab3.services.BillService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bills")
@AllArgsConstructor
public class BillController {

    @Autowired
    private BillService billService;

    @GetMapping("/{projectId}")
    public Bill showBill(@PathVariable long projectId) {
        return billService.showBill(projectId);
    }
}
