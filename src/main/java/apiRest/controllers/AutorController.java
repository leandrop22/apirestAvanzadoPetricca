package apiRest.controllers;

import org.springframework.web.bind.annotation.*;
import apiRest.entities.Autor;
import apiRest.services.AutorServiceImpl;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {
}