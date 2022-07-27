import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoAPComponent } from './components/logo-ap/logo-ap.component';
import { SocialComponent } from './components/social/social.component';
import { BannerComponent } from './components/banner/banner.component';
import { TarjetaPresentacionComponent } from './components/tarjeta-presentacion/tarjeta-presentacion.component';
import { ExperienciaLaboralComponent } from './components/experiencia-laboral/experiencia-laboral.component';
import { EstudiosComponent } from './components/estudios/estudios.component';
import { HardAndSoftKillsComponent } from './components/hard-and-soft-kills/hard-and-soft-kills.component';
import { FooterComponent } from './components/footer/footer.component';
import { LoginComponent } from './components/login/login.component';
import { ModalLoginComponent } from './components/modal-login/modal-login.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoAPComponent,
    SocialComponent,
    BannerComponent,
    TarjetaPresentacionComponent,
    ExperienciaLaboralComponent,
    EstudiosComponent,
    HardAndSoftKillsComponent,
    FooterComponent,
    LoginComponent,
    ModalLoginComponent,
  ],
  imports: [
    BrowserModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
