package fluxoContador;

import java.util.Scanner;

public class Contador extends Exception{
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite um numero inteiro para o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite um numero inteiro para o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException e) {
            System.out.println(" O segundo parâmetro deve ser maior que o primeiro!");
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm<parametroDois){
            int contagem = parametroDois - parametroUm;
            for (int i = 1; i <= contagem; i++){
                System.out.println("Contador: " +i);
            }
        } else {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!");
        }
    }
}