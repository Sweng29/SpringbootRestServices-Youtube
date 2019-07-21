package com.mantis.tech.controllers;

import com.mantis.tech.service.ManufacturerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/manufacturer")
public class ManufacturerController {

    private ManufacturerService manufacturerService;

    public ManufacturerController(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }
    // lets add Custom response object first, that we will do in next video, thanks for watching!

}
