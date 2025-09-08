import java.util.Scanner;

public class Imc {
    double peso;
    double altura; /*Altura será inserida em centimetros*/
    double imc; /* resultado da conta*/
    String nome;
    public void ObterDados(){
        Scanner leitorInt = new Scanner(System.in);
        Scanner leitorString = new Scanner(System.in);

        System.out.print("digite o seu peso: ");
        peso = leitorInt.nextInt();
        System.out.print("digite sua altura em cm: ");
        altura = leitorInt.nextInt();
        System.out.print("digite o seu nome: ");
        nome = leitorString.nextLine();
        ExibirResultados();
    }
    public void CalcularImc(){
        double alturaEmMetros;
        alturaEmMetros = altura / 100.0;
        imc = peso/(alturaEmMetros * alturaEmMetros);
    }
    public void ExibirResultados(){
        CalcularImc();
        System.out.println("***************");
        System.out.println("Nome: "+nome);
        System.out.println("Peso: "+peso);
        System.out.println("Altura: "+altura);
        System.out.println("IMc: "+imc);
        System.out.println("***************");
    }
}
