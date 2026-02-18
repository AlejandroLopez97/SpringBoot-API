package com.api.SoftU.services;

import com.api.SoftU.models.ProfesorModel;
import com.api.SoftU.repositories.IProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ProfesorService {

    @Autowired
    IProfesorRepository ProfesorRepository;

    public ArrayList<ProfesorModel> getProfesores(){
        return (ArrayList<ProfesorModel>) ProfesorRepository.findAll();
    }

    public Optional<ProfesorModel> getProfesorById(int id){
        return ProfesorRepository.findById(id);
    }

    public Boolean deleteProfesor(int id){
        try{
            ProfesorRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public ProfesorModel saveProfesor(ProfesorModel profesor){
        return ProfesorRepository.save(profesor);
    }

    public ProfesorModel putProfesor(ProfesorModel request, int id){
        Optional<ProfesorModel> optional = ProfesorRepository.findById(id);
        if (optional.isEmpty()) {
            return null;
        }
        ProfesorModel profesor = optional.get();
        profesor.setNombre(request.getNombre());
        profesor.setEmail(request.getEmail());
        profesor.setEspecialidad(request.getEspecialidad());
        profesor.setFechaDeContratacion(request.getFechaDeContratacion());
        return ProfesorRepository.save(profesor);
    }
}
