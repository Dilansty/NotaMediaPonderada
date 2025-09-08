import java.util.Scanner;

public class NotaMedia {
    public double p1;
    public double p2;
    public double p3;
    public int mp1;
    public int mp2;
    public int mp3;
    public double media;
    public String nome;

    public void obterDados() {
        Scanner leitorInt = new Scanner(System.in);
        Scanner leitorString = new Scanner(System.in);


        System.out.println("Dados do aluno");
        System.out.println("-------------------------- ");
        System.out.println("digite o nome do aluno: ");
        nome = leitorString.nextLine();

        System.out.print("nota P1: ");
        p1 = leitorInt.nextDouble();

        System.out.print("peso: ");
        mp1 = leitorInt.nextInt();

        System.out.print("Nota P2: ");
        p2 = leitorInt.nextDouble();

        System.out.print("peso: ");
        mp2 = leitorInt.nextInt();

        System.out.print("nota P3: ");
        p3 = leitorInt.nextDouble();

        System.out.print("peso: ");
        mp3 = leitorInt.nextInt();
        exibirResultados();

    }

    public void calcularMedia() {
        double somaNotasVersusPeso = (p1*mp1) + (p2*mp2) + (p3*mp3);
        double somaPesoDasNotas = mp1+mp2+mp3;
        double mediaDasProvas;
        mediaDasProvas = media / 100.0;
        media = somaNotasVersusPeso / somaPesoDasNotas;
    }

    public void exibirResultados() {
        calcularMedia();
        System.out.println("Calculando media do aluno...");

        System.out.println("****************");
        System.out.println("                ");
        System.out.println("a media ponderada do aluno: " + nome +" é: "+media);
        System.out.println("                ");
        System.out.println("****************");
        }
    }

