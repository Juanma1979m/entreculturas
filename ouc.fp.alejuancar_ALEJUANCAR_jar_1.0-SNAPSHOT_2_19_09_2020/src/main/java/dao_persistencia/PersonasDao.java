/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao_persistencia;

import entidades.Personas;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import jpaController.PersonasJpaController;
import jpaController.exceptions.NonexistentEntityException;

/**
 *
 * @author juanm
 */
public class PersonasDao {
    private final PersonasJpaController personasController;
    private final EntityManagerFactory emf;
   
    

    public PersonasDao() {
        
        emf= Persistence.createEntityManagerFactory("juanma_persistencia");
        personasController = new PersonasJpaController(emf);
    }
    public void addPersona(Personas personas){
        personasController.create(personas);
    }
    public void editPersona(Personas personas) throws Exception{
        personasController.edit(personas);
    }
    public void removePersona(int personaId) throws NonexistentEntityException{
        personasController.destroy(personaId);
    }
    public List<Personas> getAllPersonas(){
        return personasController.findPersonasEntities();
    }
    public Personas getPersonasById(int personaId){
        return personasController.findPersonas(personaId);
    }
}




