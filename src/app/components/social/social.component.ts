import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-social',
  templateUrl: './social.component.html',
  styleUrls: ['./social.component.css']
})
export class SocialComponent implements OnInit {

  constructor() {}


  ngOnInit(): void {
      const modalLogin = document.getElementById('modal-login');
      const botonLogin = document.getElementById('boton-login');

      if (modalLogin !== null && botonLogin !== null) {
          botonLogin.addEventListener('click', ev => {
              modalLogin.style.display = 'flex';
          }); 
      }
  }


  /**
   * Cuando el usuario haga click en  botonLogin 
   * se cambiará el display del elemento modalLogin para que sea visible.
   */

}
