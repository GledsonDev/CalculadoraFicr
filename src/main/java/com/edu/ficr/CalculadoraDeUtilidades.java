package com.edu.ficr;

import java.text.DecimalFormat;

public class CalculadoraDeUtilidades {
  
  static private DecimalFormat decimalFormat = new DecimalFormat("#.##");

  static double soma(double n1, double n2){
    String resultado = decimalFormat.format(n1 + n2).replace(",", ".");
    return Double.parseDouble(resultado);
  }
  
  static double subtracao(double n1, double n2){
    String resultado = decimalFormat.format(n1 - n2).replace(",", ".");
    return Double.parseDouble(resultado);
  }
  
  static double multiplicacao(double n1, double n2){
    String resultado = decimalFormat.format(n1 * n2).replace(",", ".");
    return Double.parseDouble(resultado);
  }
  
  static double divisao(double n1, double n2){
    String resultado = decimalFormat.format(n1 / n2).replace(",", ".");
    return Double.parseDouble(resultado);
  }
  
  static double potenciacao(double n, double expo){
    String resultado = decimalFormat.format(Math.pow(n, expo)).replace(",", ".");
    return Double.parseDouble(resultado);
  }
  
  static double raizQuadrada(double n){
    String resultado = decimalFormat.format(Math.sqrt(n)).replace(",", ".");
    return Double.parseDouble(resultado);
  }
  
  static double porcentagem(double n, double porcentagem){
    String resultado = decimalFormat.format((n * porcentagem) / 100).replace(",", ".");
    return Double.parseDouble(resultado);
  }
  
  static double jurosSimples(double valor, double juros, int meses){
    String resultado = decimalFormat.format(valor * juros * meses).replace(",", ".");
    return Double.parseDouble(resultado);
  }
  
  static double areaCirculo(double raio){
    String resultado = decimalFormat.format(3.14 * Math.pow(raio, 2)).replace(",", ".");
    return Double.parseDouble(resultado);
  }
  
  static double areaTriangulo(double base, double altura){
    String resultado = decimalFormat.format(( base * altura ) / 2).replace(",", ".");
    return Double.parseDouble(resultado);
  }
  
  static double celsiusParaFahrenheit(double temp){
    String resultado = decimalFormat.format((temp * 9/5) + 32).replace(",", ".");
    return Double.parseDouble(resultado);
  }
  
  static double fahrenheitParaCelsius(double temp){
    String resultado = decimalFormat.format((temp - 32) * 5/9).replace(",", ".");
    return Double.parseDouble(resultado);
  }
  
  static String imparOuPar(int n){
    if (n % 2 == 0) {
      return "Par";
    } else {
      return "Impar";
    }
  }

}
