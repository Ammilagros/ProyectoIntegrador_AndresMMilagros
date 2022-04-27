import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HardAndSoftKillsComponent } from './hard-and-soft-kills.component';

describe('HardAndSoftKillsComponent', () => {
  let component: HardAndSoftKillsComponent;
  let fixture: ComponentFixture<HardAndSoftKillsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HardAndSoftKillsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HardAndSoftKillsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
