package com.api.SoftU.controllers;

import com.api.SoftU.models.ProfesorModel;
import com.api.SoftU.services.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {

    @Autowired
    private ProfesorService profesorService;

    //header http: petición -> get
    //www.midominio.com.co/softu/profesor
    @GetMapping
    public ArrayList<ProfesorModel> get(){
        return this.profesorService.getProfesores();
    }

    @GetMapping(path = "/{id}")
    public Optional<ProfesorModel> getById(@PathVariable("id") int id){
        return this.profesorService.getProfesorById(id);
    }

    @PostMapping
    public ProfesorModel post(@RequestBody ProfesorModel profesor){
        return this.profesorService.saveProfesor(profesor);
    }

    @DeleteMapping(path = "/{id}")
    public String delete(@PathVariable("id") int id){
        boolean ok = this.profesorService.deleteProfesor(id);
        return ok ? "Profesor con id: " + id + " ha sido eliminado!" : "Hubo un fallo al eliminar";
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<ProfesorModel> put(@RequestBody ProfesorModel request, @PathVariable("id") int id){
        ProfesorModel updated = this.profesorService.putProfesor(request, id);
        return updated != null ? ResponseEntity.ok(updated) : ResponseEntity.notFound().build();
    }

}
