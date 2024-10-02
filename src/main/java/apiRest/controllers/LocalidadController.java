package apiRest.controllers;

import org.springframework.web.bind.annotation.*;
import apiRest.entities.Localidad;
import apiRest.services.LocalidadServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad,LocalidadServiceImpl> {
}