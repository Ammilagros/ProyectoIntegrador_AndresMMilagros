
package com.portfolioYoProgramo.mma.Interface;

import com.portfolioYoProgramo.mma.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer  persona 
    public List<Persona> getPersona();
    
    //Guardar objeto del tipo Persona
    public void savePersona (Persona persona);
            
    //Eliminar objeto buscado por Id
    public void deletePersona (Long id);
    
    //Buscar persona por Id
    public Persona findPersona (Long id);
}
