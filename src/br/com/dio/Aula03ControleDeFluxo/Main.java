package br.com.dio.Aula03ControleDeFluxo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Atividade Meses
        System.out.println("Digite o número do mês:");
        int mes = scan.nextInt();
        Meses.meses(mes);

        //Atividade dia da semana
        System.out.println("Digite o dia da semana:");
        String dia = scan.next();
        DiaDaSemana.numeroDia(dia);

        //Atividade Valores

        System.out.println("Digite um valor inteiro entre 1 e 5:");
        int valor = scan.nextInt();
        VerificandoValor.verificador(valor);
    }
}
