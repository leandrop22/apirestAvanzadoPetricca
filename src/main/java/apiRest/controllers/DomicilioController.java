package apiRest.controllers;

import org.springframework.web.bind.annotation.*;
import apiRest.entities.Domicilio;
import apiRest.services.DomicilioServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl>{
}