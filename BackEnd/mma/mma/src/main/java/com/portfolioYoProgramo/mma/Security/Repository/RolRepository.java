
package com.portfolioYoProgramo.mma.Security.Repository;

import com.portfolioYoProgramo.mma.Security.Entity.Rol;
import com.portfolioYoProgramo.mma.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
