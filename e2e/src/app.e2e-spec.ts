import { AppPage } from './app.po';
import { browser, logging, ElementFinder, by, element } from 'protractor';
import { identifierName } from '@angular/compiler';

describe('workspace-project App', () => {
  let page: AppPage;

  beforeEach(() => {
    page = new AppPage();
    page.navigateTo();
  });

  it('should display welcome message', () => {
    expect(page.getTitleText()).toEqual('Welcome to TestAutomation!');
  });

  it('Validade empty textboxes', () => {
    element.all(by.id('firstname')).getText().then(function (text) {
      expect(text == '').toBe(true);
    });

    element.all(by.id('lastname')).getText().then(function (text) {
      expect(text == '').toBe(true);
    });
  });

  it('Validate preenche textboxes', () => {
    element.all(by.id('firstname')).sendKeys('Jubileo');
    element.all(by.id('lastname')).sendKeys('Eteuvino');

    element.all(by.id('firstname')).getAttribute('value').then(function (text) {
      expect(text == 'Jubileo').toBe(true);
    });

    element.all(by.id('lastname')).getAttribute('value').then(function (text) {
      expect(text == 'Eteuvino').toBe(true);
    });
  });

  it('Validade elements by page', () => {
    let triple = element(by.css('.container')).
      element(by.css('.form-group')).
      element(by.css('.form-control')).
      element(by.css('.btn btn-primary'));
  });

  afterEach(async () => {
    // Assert that there are no errors emitted from the browser
    const logs = await browser.manage().logs().get(logging.Type.BROWSER);
    expect(logs).not.toContain(jasmine.objectContaining({
      level: logging.Level.SEVERE,
    } as logging.Entry));
  });
});
