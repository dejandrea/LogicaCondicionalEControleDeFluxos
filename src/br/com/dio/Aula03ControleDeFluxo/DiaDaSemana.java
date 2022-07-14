package br.com.dio.Aula03ControleDeFluxo;

public class DiaDaSemana {
    /*Com Switch use String para a partir fo dia da semana, exibir seu número.*/

    public static void numeroDia(String dia) {
        switch (dia.toLowerCase().trim()){
            case "segunda":
                System.out.println("2");
                break;
            case "terça":
            case "terca":
                System.out.println("3");
                break;
            case "quarta":
                System.out.println("4");
                break;
            case "quinta":
                System.out.println("5");
                break;
            case "sexta":
                System.out.println("6");
                break;
            case "sábado":
            case "sabado":
                System.out.println("7");
                break;
            case "domingo":
                System.out.println("1");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
