import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


        System.out.println("Digite dois numeros inteiros:");
        int a = read.nextInt();
        int b = read.nextInt();
        int soma = a + b;
        System.out.println("A soma de " + a + " e " + b + " é: " + soma);

        System.out.println("----------------------------------------------");
        if (soma % 2 == 0) {
            System.out.println(soma + " é par");
        } else {
            System.out.println(soma + " é impar");
        }

        System.out.println("----------------------------------------------");


        System.out.println("Digite as 3 notas do aluno: ");
        double n1 = read.nextInt();
        double n2 = read.nextInt();
        double n3 = read.nextInt();
        double media = (n1 + n2 + n3)/3;

        if (media >= 7) {
            System.out.println("O aluno foi aprovado com média: " + media);
        } else {
            System.out.println("Aluno reprovado com média: " + media);
        }
        System.out.println("----------------------------------------------");
        int n = 8;
        int resultado = 0;
        for (int i = 0; i <= 10; i++){
            resultado = n*i;
            System.out.println("5 x " + i + " = " + resultado);
        }
        read.close();
    }
}