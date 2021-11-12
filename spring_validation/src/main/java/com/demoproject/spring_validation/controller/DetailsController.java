package com.sample.validation.controller;
import com.sample.validation.model.Details;
import com.sample.validation.repository.DetailsRepository;
import com.sample.validation.service.Details_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class Details_Controller {
    @Autowired
    Details_Service details_service;
    @GetMapping("/Details")
    private List<Details> getALlDetails()
    {
        return details_service.getALlDetails();
    }
    @PostMapping("/Details")
    private Details saveDetails(@RequestBody Details details)
    {
        Details_Service.SaveOrUpdate(details);
        return details;
    }
}
