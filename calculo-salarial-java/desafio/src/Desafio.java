// Para ler e escrever dados em java, aqui no DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixos "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) throws Exception {
        // Lê os valores de entrada:
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            // Atribuir a aliquota de 5% mediante ao salário:
            valorImposto = 5f * valorSalario;
        }
        // TODO Criar as demais condições para as aliquotas de 10.00% e 15.00%.

        // Calcula e imprime a saída (com 2 casas decimais):
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
}
