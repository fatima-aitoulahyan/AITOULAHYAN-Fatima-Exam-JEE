import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SaveAssurance } from './save-assurance';

describe('SaveAssurance', () => {
  let component: SaveAssurance;
  let fixture: ComponentFixture<SaveAssurance>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SaveAssurance],
    }).compileComponents();

    fixture = TestBed.createComponent(SaveAssurance);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
