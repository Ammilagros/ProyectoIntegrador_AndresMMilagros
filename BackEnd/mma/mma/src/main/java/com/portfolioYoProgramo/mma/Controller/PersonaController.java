
package com.portfolioYoProgramo.mma.Controller;

import com.portfolioYoProgramo.mma.Entity.Persona;
import com.portfolioYoProgramo.mma.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    
    @GetMapping("Personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    @PostMapping("/Personas/crear")
    public String createPersona (@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    
    @DeleteMapping("/Personas/borrar/{id}")
    public String deletePersona (@PathVariable Long id){
        ipersonaService.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    
    @PutMapping("/Personas/editar/{id}")
    public Persona editPersona(@PathVariable  Long id,
                            @RequestParam ("nombre")   String  nuevoNombre,
                            @RequestParam ("apellido") String  nuevoApellido){
        Persona persona = ipersonaService.findPersona(id);
  
        
        persona.setNombre   (nuevoNombre);
        persona.setApellido (nuevoApellido);
        
        
        ipersonaService.savePersona(persona);
        return persona;
    }
 
            
    @GetMapping("/personas/traer/perfil")        
    public Persona findPersona(){
        return ipersonaService.findPersona((long)1);
    }       
}