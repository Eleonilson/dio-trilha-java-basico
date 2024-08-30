package io.github.jiangdequan;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
        //criando o objeto scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Digite o seu nome: ");
        String nome = sc.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = sc.next();

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite a sua altura: ");
        double altura = sc.nextDouble();


        //imprimido os dados obtidos pelo usuario
        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura é " + altura + " cm ");
        sc.close();
        }
        catch (InputMismatchException e){
            System.err.println("O campo de idade e altura precisam ser numéricos");
        }
    }
}