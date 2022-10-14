
package com.portfolioYoProgramo.mma.Repository;

import com.portfolioYoProgramo.mma.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository 
public interface IPersonaReposity extends JpaRepository<Persona,Long>{
    
}
