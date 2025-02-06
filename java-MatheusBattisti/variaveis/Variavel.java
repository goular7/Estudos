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


        // 6 - Int

        int n = 42;

        System.out.println(n);

        System.out.println(n + 5);

        System.out.println(n * 10);

        System.out.println(n / 5);

        int soma = n +12;

        System.out.println(soma);


        // 7 - long

        long populacaoMundial = 78000000000L;

        System.out.println(populacaoMundial);

        long grandeNumero = 1_000_000L;

        System.out.println(grandeNumero + 1);


        // 8 - Double

        double preco = 19.99;

        System.out.println(preco - 12);

        System.out.println(preco / 2);

        double pi = 3.141_592_123;

        System.out.println(pi);

        double valorComD = 12.1D;

        System.out.println(valorComD);


        // 9 - Operadores Aritmeticos

        int soma2 = 12 + 5;

        System.out.println(soma2);

        System.out.println(12 + 5);

        System.out.println(10 - 5);

        System.out.println(10 * 5);

        System.out.println(10 / 2.5);

        System.out.println(10.0 / 2.5);

        // para ter um resultado quebrado (1.5), pelo menos um da divisão tem que ser double

        System.out.println(10 / 3);

        System.out.println(10.0 / 3.0);

        System.out.println(10 % 3); // %  = modulo (resto da divisão)


        // 10 - Operadores Aritmeticos II
        /* 
         * (++) Incremento - Incrementa o valor de uma variavel em 1
         * (--) Decremento - Decrementa o valor de uma variavel em 1
         * (+=) Atribuição aditiva - Soma e atribui o resultado de uma variavel
         * (-=) Atribuição subtrativa - Subtrai e atribui o resultado a uma variavel
        */

        int x = 5;
        x++; //6
        x++; //7
        x++; //8
        x++; //9
        x++; //10
        System.out.println(x);

        int y = 5;
        y--; //4
        y--; //3
        y--; //2
        System.out.println(y);

        int a = 10;
        a += 5; //15
        a += 5; //20
        a += 5; //25
        System.out.println("a = " + a);

        int b = 10;
        b -= 5; //5
        b -= 5; //0
        b -= 5; //-5
        System.out.println("b = " + b);

        b -= a;
        System.out.println(b);


        // 11 - Type casting
        /*
         * Widening (Casting implícito) - Converte tipos menores para maiores ex: int para long
         * Narrowing (Casting explicito) - COnverte tipos maiores para menores ex: double para int
         * obs: para realizar Narrowing, é necessário especificar o tipo de destino entre parênteses
         */

        int numero2 = 42;

        //Widening
        long numeroLong = numero2;

        double numeroDouble = numero2;

        System.out.println(numeroLong);

        System.out.println(numeroDouble);

        //Narrowing
        double valorDouble = 9.78;
        int valorInt = (int) valorDouble;

        System.out.println(valorInt);

        //casting de char para int
        char letra2 = 'A';

        int codigoAscII = (int) letra2;

        System.out.println(codigoAscII);

    }
    
}