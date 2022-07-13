package br.com.dio.Aula02OperadoresLogicos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        int i1 = 10;
        int i2 = 20;

        float f1 = 2.6f;
        float f2 = 3.5f;

        System.out.println(b1 && b2);
        System.out.println(b1 && b3);
        System.out.println(b2 || b3);
        System.out.println(b2 || b4);
        System.out.println(b1 ^ b3);
        System.out.println(b4 ^ b1);
        System.out.println(!b1);
        System.out.println(!b2);

        System.out.println((i1>i2)||(f2<f1));
        System.out.println(((i1+i2)< (f2-f1))&& true);

        //Exercício Auxilio

        Scanner scan  = new Scanner(System.in);
        System.out.println("Digite o salário:");
        double salario = scan.nextDouble();
        System.out.println("Digite  quantidade de dependentes:");
        int dependentes = scan.nextInt();

        //boolean recebe = Auxilio.recebeAuxilio(salario,dependentes);

        if (Auxilio.recebeAuxilio(salario,dependentes)) {
            System.out.println("Você está apto a receber o auxílio");
        }else {
            System.out.println("Você não atende aos requisitos para receber o auxílio");
        }
    }
}
