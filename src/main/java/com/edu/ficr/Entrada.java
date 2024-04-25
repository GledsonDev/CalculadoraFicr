package com.edu.ficr;

import static com.edu.ficr.CalculadoraDeUtilidades.*;

public class Entrada {
  public static void main(String[] args) {
    
    while (true) {
      System.out.println("");
      System.out.println("  [DIGITA A OPERACAO DESEJADA]");
      System.out.println("+------------------------------+");
      System.out.println("| 1 - Soma                     |");
      System.out.println("| 2 - Subtração                |");
      System.out.println("| 3 - Multiplicação            |");
      System.out.println("| 4 - Divisão                  |");
      System.out.println("| 5 - Potenciação              |");
      System.out.println("| 6 - Raiz Quadrada            |");
      System.out.println("| 7 - Porcentagem              |");
      System.out.println("| 8 - Juros Simples            |");
      System.out.println("| 9 - Área do Círculo          |");
      System.out.println("| 10 - Área do Triângulo       |");
      System.out.println("| 11 - Celsius para Fahrenheit |");
      System.out.println("| 12 - Fahrenheit para Celsius |");
      System.out.println("| 13 - Impar ou Par            |");
      System.out.println("| 0 - Sair                     |");
      System.out.println("+------------------------------+");
      
      Integer escolha = 0;
      
      try {
        escolha = Integer.parseInt(System.console().readLine());
        System.out.println("");
      } catch (Exception e) {
        System.out.println("\nERRO: [apenas numeros sao permitidos, digite '1-13' ou '0' para sair]");
        System.out.print(e.getMessage() + "\n");
        return;
      }

      try {
        
        switch (escolha) {
          case 1:
            System.out.println("Digite o primeiro numero: ");
            double case1n1 = Double.parseDouble(System.console().readLine());
            
            System.out.println("Digite o segundo numero: ");
            double case1n2 = Double.parseDouble(System.console().readLine()); 
            
            System.out.println("Resultado da Soma: " + soma(case1n1, case1n2));
            break;
            
          case 2:
            System.out.println("Digite o primeiro numero: ");
            double case2n1 = Double.parseDouble(System.console().readLine());
            
            System.out.println("Digite o segundo numero: ");
            double case2n2 = Double.parseDouble(System.console().readLine());
            
            System.out.println("Resultado da Subtração: " + subtracao(case2n1, case2n2));
            break;
  
          case 3:
            System.out.println("Digite o primeiro numero: ");
            double case3n1 = Double.parseDouble(System.console().readLine());
            
            System.out.println("Digite o segundo numero: ");
            double case3n2 = Double.parseDouble(System.console().readLine());
            
            System.out.println("Resultado da Multiplicação: " + multiplicacao(case3n1, case3n2));
            break;
            
          case 4:
            System.out.println("Digite o primeiro numero: ");
            double case4n1 = Double.parseDouble(System.console().readLine());
            
            System.out.println("Digite o segundo numero: ");
            double case4n2 = Double.parseDouble(System.console().readLine());
            
            System.out.println("Resultado da Divisão: " + divisao(case4n1, case4n2));
            break;
            
          case 5:
            System.out.println("Digite o numero: ");
            double case5n1 = Double.parseDouble(System.console().readLine());
            
            System.out.println("Digite o expoente: ");
            double case5n2 = Double.parseDouble(System.console().readLine());
            
            System.out.println("Resultado da Potenciação: " + potenciacao(case5n1, case5n2));
            break;
            
          case 6:
            System.out.println("Digite o numero: ");
            double case6n1 = Double.parseDouble(System.console().readLine());
            
            System.out.println("Resultado da Raiz Quadrada: " + raizQuadrada(case6n1));
            break;
            
          case 7:
            System.out.println("Digite o numero: ");
            double case7n1 = Double.parseDouble(System.console().readLine());
            
            System.out.println("Digite a porcentagem: ");
            double case7n2 = Double.parseDouble(System.console().readLine());
            
            System.out.println("Resultado da Porcentagem: " + porcentagem(case7n1, case7n2));
            break;
            
          case 8:
            System.out.println("Digite o valor: ");
            double case8n1 = Double.parseDouble(System.console().readLine());
            
            System.out.println("Digite a porcentagem: ");
            double case8n2 = Double.parseDouble(System.console().readLine());
            
            System.out.println("Digite a quantidade de meses: ");
            int case8n3 = Integer.parseInt(System.console().readLine());
            
            System.out.println("Resultado do Juros Simples: " + jurosSimples(case8n1, case8n2, case8n3));
            break;
            
          case 9:  
            System.out.println("Digite o raio: ");
            double case9n1 = Double.parseDouble(System.console().readLine());
            
            System.out.println("Resultado da Área do Círculo: " + areaCirculo(case9n1));
            break;
            
          case 10:
            System.out.println("Digite a base: ");
            double case10n1 = Double.parseDouble(System.console().readLine());
            
            System.out.println("Digite a altura: ");
            double case10n2 = Double.parseDouble(System.console().readLine());
            
            System.out.println("Resultado da Área do Triângulo: " + areaTriangulo(case10n1, case10n2));
            break;
          
          case 11:
            System.out.println("Digite a temperatura: ");
            double case11n1 = Double.parseDouble(System.console().readLine());
            
            System.out.println("Resultado da Conversão de Celsius para Fahrenheit: " + celsiusParaFahrenheit(case11n1));
            break;
          
          case 12:
            System.out.println("Digite a temperatura: ");
            double case12n1 = Double.parseDouble(System.console().readLine());
  
            System.out.println("Resultado da Conversão de Fahrenheit para Celsius: " + fahrenheitParaCelsius(case12n1));
            break;
          case 13:
            System.out.println("Digite o numero: ");
            int case13n1 = Integer.parseInt(System.console().readLine());
  
            System.out.println("Resultado: " + imparOuPar(case13n1));
            break;
          
          case 0:
            System.out.println("SAINDO....");
            return;
          
          default:
            System.out.println("\nERRO: [valor fora da tabela, digite '1-13' ou '0' para sair]\n");
            break;
        }

      } catch (Exception e) {
        System.out.println("ERRO: [valor invalido]");
        System.out.println(e.getMessage() + "\n");
      }

    }
  
  }
}
