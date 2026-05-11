import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SavePaiement } from './save-paiement';

describe('SavePaiement', () => {
  let component: SavePaiement;
  let fixture: ComponentFixture<SavePaiement>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SavePaiement],
    }).compileComponents();

    fixture = TestBed.createComponent(SavePaiement);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
