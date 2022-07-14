package br.com.dio.Aula03ControleDeFluxo;

public class VerificandoValor {
    /*Verificar se uma variável inteira for entre 1 e 3 exibir o texto "Certo*
    se for 4 exibir "Errado, se for 5 exibir Talvez. Para demais valores exibir "Valor indefinido"*/

    public static void verificador(int valor) {
        switch (valor){
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor Indefinido");
                break;

        }
    }

}
