import java.util.Scanner;

public class TransferirSalarioDesafio {
    public static void main(String[] args) {
        Scanner leitorDeEntradas = new Scanner(System.in);
        
        try {
            System.out.println("Digite o valor do salário:");
            float valorSalario = leitorDeEntradas.nextFloat();
            System.out.println("Digite o valor dos benefícios:");
            float valorBeneficios = leitorDeEntradas.nextFloat();

            float valorImposto = 0;

            if (valorSalario >= 0 && valorSalario <= 1100) {
                valorImposto = 0.05F * valorSalario;
            } else if (valorSalario > 1100 && valorSalario <= 2203.48) {
                valorImposto = 0.075F * valorSalario;
            } else if (valorSalario > 2203.48 && valorSalario <= 3305.22) {
                valorImposto = 0.15F * valorSalario;
            } else if (valorSalario > 3305.22 && valorSalario <= 6433.57) {
                valorImposto = 0.225F * valorSalario;
            } else {
                valorImposto = 0.275F * valorSalario;
            }

            float saida = valorSalario - valorImposto + valorBeneficios;
            System.out.println(String.format("O valor líquido após os impostos é: %.2f", saida));
        } catch (Exception e) {
            System.out.println("Por favor, insira valores numéricos válidos.");
        } finally {
            leitorDeEntradas.close();
        }
    }
}
