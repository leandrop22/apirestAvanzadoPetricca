package apiRest.controllers;

import org.springframework.web.bind.annotation.*;
import apiRest.entities.Libro;
import apiRest.services.LibroServiceImpl;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/libros")

public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl>{
}