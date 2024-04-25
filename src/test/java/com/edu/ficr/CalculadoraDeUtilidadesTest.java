package com.edu.ficr;

import static com.edu.ficr.CalculadoraDeUtilidades.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraDeUtilidadesTest {
  
  @Test
  void testeSoma(){
    assertAll(
      () -> assertEquals(50, soma(25, 25), "valor deve ser 50"),
      () -> assertEquals(66, soma(30, 36), "valor deve ser 66"),
      () -> assertEquals(147, soma(100, 47), "valor deve ser 147"),
      () -> assertEquals(25.45, soma(5.40, 20.05), "valor deve ser 25.45")
    );
  }


  @Test
  void testeSubtracao(){
    assertAll(
      () -> assertEquals(-15, subtracao(13, 28), "valor deve ser -15"),
      () -> assertEquals(45.74, subtracao(50.3, 4.56), 0.01, "valor deve ser 45.74"),
      () -> assertEquals(78.55, subtracao(100.0, 21.45), 0.01, "valor deve ser 78.55"),
      () -> assertEquals(1056.96, subtracao(2365.71, 1308.75), 0.01, "valor deve ser 1056.96")
    );
  }

  @Test
  void testeMultiplicacao() {
    assertAll(
      () -> assertEquals(6.25, multiplicacao(2.5, 2.5), "valor deve ser 6.25"),
      () -> assertEquals(25, multiplicacao(5, 5), "valor deve ser 25.0"),
      () -> assertEquals(0.0, multiplicacao(0, 2.5), "valor deve ser 0.0"),
      () -> assertEquals(145.85, multiplicacao(29.17, 5), "valor deve ser 145.85")
    );
  }

  @Test
  void testeDivisao() {
    assertAll(
      () -> assertEquals(45, divisao(135, 3), "valor deve ser 45"),
      () -> assertEquals(17, divisao(51, 3), "valor deve ser 17"),
      () -> assertEquals(62.47, divisao(187.41, 3), "valor deve ser 62.47"),
      () -> assertEquals(145.99, divisao(437.98, 3), "valor deve ser 145.99")
    );
  }
  
  @Test
  void testePotenciacao() {
    assertAll(
      () -> assertEquals(32, potenciacao(2, 5), "valor deve ser 32"),
      () -> assertEquals(81, potenciacao(3, 4), "valor deve ser 81"),
      () -> assertEquals(348.5, potenciacao(2, 8.445), "valor deve ser 348.5"),
      () -> assertEquals(6.03, potenciacao(1.8, 3.058), "valor deve ser 6.03")
    );
  }

  @Test
  void testeRaizQuadrada() {
    assertAll(
      () -> assertEquals(4, raizQuadrada(16), "valor deve ser 4"),
      () -> assertEquals(9, raizQuadrada(81), "valor deve ser 9"),
      () -> assertEquals(16, raizQuadrada(256), "valor deve ser 16"),
      () -> assertEquals(27, raizQuadrada(729), "valor deve ser 27")
    );
  }

  @Test
  void testePorcentagem() {
    assertAll(
      () -> assertEquals(100, porcentagem(200, 50), "valor deve ser 100"),
      () -> assertEquals(120, porcentagem(400, 30), "valor deve ser 120"),
      () -> assertEquals(225, porcentagem(1500, 15), "valor deve ser 225"),
      () -> assertEquals(64, porcentagem(80, 80), "valor deve ser 64")
    );
  }

  @Test
  void testeJurosSimples() {
    assertAll(
      () -> assertEquals(500, jurosSimples(1000, 0.1, 5), "valor deve ser 500"),
      () -> assertEquals(1200, jurosSimples(1000, 0.12, 10), "valor deve ser 1200"),
      () -> assertEquals(150, jurosSimples(1000, 0.05, 3), "valor deve ser 150"),
      () -> assertEquals(1600, jurosSimples(1000, 0.16, 10), "valor deve ser 1600")
    );
  }

  @Test
  void testeAreaCirculo() {
    assertAll(
      () -> assertEquals(12.56, areaCirculo(2),"valor deve ser 12.56"),
      () -> assertEquals(50.24, areaCirculo(4),"valor deve ser 50.24"),
      () -> assertEquals(314, areaCirculo(10),"valor deve ser 314"),
      () -> assertEquals(7850, areaCirculo(50),"valor deve ser 7853.5")
    );
  }

  @Test
  void testeAreaTriangulo() {
    assertAll(
      () -> assertEquals(6, areaTriangulo(3, 4), "valor deve ser 6"),
      () -> assertEquals(12, areaTriangulo(6, 4), "valor deve ser 12"),
      () -> assertEquals(16, areaTriangulo(8, 4), "valor deve ser 16"),
      () -> assertEquals(50, areaTriangulo(10, 10), "valor deve ser 50")
    );
  }
  
  @Test
  void testeCelsiusParaFahrenheit() {
    assertAll(
      () -> assertEquals(32, celsiusParaFahrenheit(0),"valor deve ser 32"),
      () -> assertEquals(50, celsiusParaFahrenheit(10),"valor deve ser 50"),
      () -> assertEquals(86, celsiusParaFahrenheit(30),"valor deve ser 86"),
      () -> assertEquals(212, celsiusParaFahrenheit(100),"valor deve ser 212")
    );
  }
  
  @Test
  void testeFahrenheitParaCelsius() {
    assertAll(
        () -> assertEquals(0, fahrenheitParaCelsius(32),"valor deve ser 0"),
        () -> assertEquals(10, fahrenheitParaCelsius(50),"valor deve ser 10"),
        () -> assertEquals(30, fahrenheitParaCelsius(86),"valor deve ser 30"),
        () -> assertEquals(100, fahrenheitParaCelsius(212),"valor deve ser 100")
    );
  }
  
  @Test
  void testeImparOuPar() {
    assertAll(
      () -> assertEquals("Par", imparOuPar(2), "valor deve ser Par"),
      () -> assertEquals("Impar", imparOuPar(3), "valor deve ser Impar"),
      () -> assertEquals("Par", imparOuPar(0), "valor deve ser Par"),
      () -> assertEquals("Impar", imparOuPar(-5), "valor deve ser Impar")
    );
  }

}
