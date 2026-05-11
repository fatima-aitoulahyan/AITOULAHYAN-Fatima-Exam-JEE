import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SaveClient } from './save-client';

describe('SaveClient', () => {
  let component: SaveClient;
  let fixture: ComponentFixture<SaveClient>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [SaveClient],
    }).compileComponents();

    fixture = TestBed.createComponent(SaveClient);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
