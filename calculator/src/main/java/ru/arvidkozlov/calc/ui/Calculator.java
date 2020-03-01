package ru.arvidkozlov.calc.ui;

import ru.arvidkozlov.calc.data.CalculatorData;

import javax.inject.Named;

@Named
public class Calculator {

  private CalculatorData data = new CalculatorData();

  public CalculatorData getData() {
    return data;
  }

  public void setData(CalculatorData data) {
    this.data = data;
  }

}
