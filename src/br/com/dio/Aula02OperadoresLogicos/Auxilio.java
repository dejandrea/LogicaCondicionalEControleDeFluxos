package br.com.dio.Aula02OperadoresLogicos;

public class Auxilio {
    public static boolean recebeAuxilio(double salario, int dependentes) {
        double mediaSalario = 1200;
        int mediaDependentes = 2;

        boolean salarioBaixo = salario <= mediaSalario;
        boolean muitosDependentes = dependentes >= mediaDependentes;

        boolean recebeAuxilio = salarioBaixo && muitosDependentes;

        return recebeAuxilio;
    }
}
