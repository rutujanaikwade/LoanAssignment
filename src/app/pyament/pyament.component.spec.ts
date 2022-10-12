import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PyamentComponent } from './pyament.component';

describe('PyamentComponent', () => {
  let component: PyamentComponent;
  let fixture: ComponentFixture<PyamentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PyamentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PyamentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
