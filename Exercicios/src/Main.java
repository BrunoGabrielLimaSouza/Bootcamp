import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //Dia01
       /*** System.out.println("Digite dois numeros inteiros:");
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
        ***/
        //dia02
       /* Pessoa pessoa1 = new Pessoa("luiza",35);
        Pessoa pessoa2 = new Pessoa("Bruno",17);

        System.out.println(pessoa1.getNome() + " é mais velho(a) que " + pessoa2.getNome() + " ? " + pessoa1.difIdade(pessoa2));
        */
/*
        Produto produto1 = new Produto(60);
        System.out.println("Digite a porcentagem do desconto (apenas o numero): ");
        double descontoDigitado = read.nextDouble();
        produto1.setDesconto(descontoDigitado);
        System.out.println(produto1.simularDesconto());

*/
//Dia03
        Frota frota = new Frota();
        Carro carro1 = new Carro("Ford", "Ford KA", 2015, 4);
        frota.adicionarVeiculo(carro1);
        Caminhao caminhao1 = new Caminhao("Ferrari", "XRL8", 2010,  100);
        frota.adicionarVeiculo(caminhao1);
        carro1.exibirInfo();
        caminhao1.exibirInfo();

        Motorista motorista1 = new Motorista("Carlos", "01234567890");
        Motorista motorista2 = new Motorista("Bruno", "01234567890");
        motorista2.atribuirVeiculo(caminhao1);
        motorista1.atribuirVeiculo(carro1);

        read.close();
    }
}