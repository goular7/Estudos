package variaveis;

public class Variavel {

    public static void main(String[] args) {
        
        // 1 - O que são variáveis
        // tipo -> nome -> atribuir um valor;
        String nome = "Gustavo";

        // nome => "Gustavo"
        System.out.println(nome);


        // 2 - Atribuição de variável com outra
        String teste = "Teste";

        String testando = teste;

        System.out.println(testando);

        long numeroGrande = 999999999999L;

        // int numeroGrandeDois = numeroGrande;

        System.out.println(numeroGrande);


        // 3 - Comentários

        /* varias linhas

        Comentario linha 1
        Comentário linha 2
        Comentário linha 3

         */


         /* Documentação
          * 
          * Função para somar números
          * param1: Primeiro número
          * param2: Segundo número
          *
          * Retorno: A soma
          *
          */


        // 4 - String

        String firstName = "Gustavo";
        String lastName = "Goulart";

        System.out.println(firstName + " " + lastName);

        System.out.println("O nome dele é: " + firstName);

        String fullName = firstName + " " + lastName;

        // concatenação = operador + nas strings, para uni-las
        System.out.println(fullName);


        // 5 - Char
        char letra = 'G';

        System.out.println(letra);

        char simbolo = '$';

        System.out.println(simbolo);
    }
    
}