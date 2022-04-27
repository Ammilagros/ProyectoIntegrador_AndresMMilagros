import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-experiencia-laboral',
  templateUrl: './experiencia-laboral.component.html',
  styleUrls: ['./experiencia-laboral.component.css']
})
export class ExperienciaLaboralComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}


  /*
        * Por cada botón .boton-habilitar-edicion:
        *   Agregar escucha de evento CLICK
        *
        * Escucha CLICK:
        *   Hacer editable al div .text-item del .item al que pertenece el botón
        */

 
  const listaBotonesHabilitarEdicion = document.getElementsByClassName('boton-habilitar-edicion');
  const cantidadBotonesEdicion       = listaBotonesHabilitarEdicion.length;
  
  for (let i = 0; i < cantidadBotonesEdicion; i++) {
      const boton = listaBotonesHabilitarEdicion[i];
      boton.addEventListener('click', habilitarEdicionItem)
  }
  
  function habilitarEdicionItem(event: Event ): void {
      const botonClickeado     = event.target as Element;
      const divContenedorBoton = botonClickeado.parentElement as Element;
      const itemLista          = divContenedorBoton.parentElement as Element;
      const divTextItem        = itemLista.querySelector('.texto-item');
      if (divTextItem !== null) {
         divTextItem.setAttribute('contenteditable', 'true');
      }
  }