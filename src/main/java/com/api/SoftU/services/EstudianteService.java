package com.api.SoftU.services;

import com.api.SoftU.models.EstudianteModel;
import com.api.SoftU.repositories.IEstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

@Service
public class EstudianteService {

    @Autowired
    IEstudianteRepository estudianteRepository;

    public ArrayList<EstudianteModel> getEstudiantes(){
        return (ArrayList<EstudianteModel>) estudianteRepository.findAll();
    }

    public Optional<EstudianteModel> getById(int id){
        return estudianteRepository.findById(id);
    }

    public EstudianteModel postEstudiante(EstudianteModel estudiante){
        return estudianteRepository.save(estudiante);
    }

    public Boolean deleteEstudiante(int id){
        try{
            estudianteRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public EstudianteModel putEstudiante(EstudianteModel request, int id){
        EstudianteModel estudianteModel = estudianteRepository.findById(id).get();

        estudianteModel.setNombre(request.getNombre());
        estudianteModel.setApellido(request.getApellido());
        estudianteModel.setEmail(request.getEmail());
        estudianteModel.setFechaDeCreacion(new Date());

        return estudianteModel;
    }
}
