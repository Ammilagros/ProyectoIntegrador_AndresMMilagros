
package com.portfolioYoProgramo.mma.Security.Controller;

import com.portfolioYoProgramo.mma.Security.Dto.JwtDto;
import com.portfolioYoProgramo.mma.Security.Dto.LoginUsuario;
import com.portfolioYoProgramo.mma.Security.Service.RolService;
import com.portfolioYoProgramo.mma.Security.Service.UsuarioService;
import com.portfolioYoProgramo.mma.Security.jwt.JwtProvider;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * Comunicacion con el FrontEnd del proyecto.
 */
@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {
    //Inyecciones//
    @Autowired
        PasswordEncoder passwordEncoder;
    @Autowired
        AuthenticationManager authenticationManager;
    @Autowired
        UsuarioService usuarioService;
    @Autowired
        RolService rolService;
    @Autowired
        JwtProvider jwtProvider;
    
    //Login
    
    @PostMapping("/login")
     public ResponseEntity<JwtDto> login(@Valid @RequestBody LoginUsuario loginUsuario, BindingResult bindingResult, Object JwtDto){
         
         if(bindingResult.hasErrors())
             return new ResponseEntity(new Mensaje("Campos mal puestos"), HttpStatus.BAD_REQUEST);  
         
         
         Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                                                                            loginUsuario.getNombreUsuario(), 
                                                                            loginUsuario.getPassword()));
         
        SecurityContextHolder.getContext().setAuthentication(authentication);
        
        String        jwt       = jwtProvider.generateToken(authentication);
        
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        
        JwtDto      jwtDto      = new JwtDto(jwt, userDetails.getUsername(),
                                             userDetails.getAuthorities());
  
            return new ResponseEntity(JwtDto ,HttpStatus.OK);
     }   
    
    //
    
    
    }
    
    
      
    
    
    
