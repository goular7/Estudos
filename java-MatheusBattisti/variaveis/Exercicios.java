package variaveis;

public class Exercicios {
    public static void main(String[] args) {
    
    //Exercicio 1
    int valor = 10;
    int dobro = valor * 2;
    System.out.println(dobro);
   

    //Exercicio 2 
    char letra = 'B';
    int codigoAscII = (int) letra;
    System.out.println(codigoAscII);    

    // Exercicio 3
    double valor1 = 15.75;
    double valor2 = 20.40;
    double soma = valor1 + valor2;
    System.out.println(soma); 

    // Exercicio 4
    long bi = 2_000_000_000L;
    int cast = (int) bi;
    System.out.println(cast);

    // Exercicio 5
    String hello = "Olá, mundo!";
    String java = hello + " Bem-vindo ao Java!";
    System.out.println(java);

    }
}
