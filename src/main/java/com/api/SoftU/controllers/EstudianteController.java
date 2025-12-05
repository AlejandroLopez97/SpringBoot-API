package com.api.SoftU.controllers;

import com.api.SoftU.models.EstudianteModel;
import com.api.SoftU.services.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping
    public ArrayList<EstudianteModel> get(){
        return this.estudianteService.getEstudiantes();
    }

    @GetMapping(path = "/{id}")
    public Optional<EstudianteModel> getEstudianteById(@PathVariable("id") int id){
        return this.estudianteService.getById(id);
    }

    @PostMapping
    public EstudianteModel post(@RequestBody EstudianteModel estudiante){
        return this.estudianteService.postEstudiante(estudiante);
    }

    @PutMapping(path = "/{id}")
    public EstudianteModel put(@RequestBody EstudianteModel request, @PathVariable("id") int id){
        return this.estudianteService.putEstudiante(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String delete(@PathVariable("id") int id){
        boolean ok = this.estudianteService.deleteEstudiante(id);
        return ok ? "Estudiante con id: " + id + " ha sido eliminado" : "Hubo un error en la solocitud";
    }

}

