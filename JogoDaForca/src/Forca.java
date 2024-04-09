import java.util.Scanner;

public class Forca {
    public static void main(String[] args) {

        //Criando array das palavras
        String[] palavras = {"carro", "moto", "bicicleta", "helicoptero"};

        //Sorteando uma das palavras para incluir na forca, utilizando o math random
        //Está gerando um número aleatório do tamanho do array, no caso, multiplicamos o Math.random * palavras.lenght
        //no caso o array possuí 4 palavras (que seria o lenght)
        String palavraSorteada = palavras[(int) (Math.random() * palavras.length)];

        //Criando um novo array, com o comprimento da palavraEscolhida. Aqui estamos verificando quantas letras a palavra sorteada possui, e atribuindo o seu valor a variavel "quantidadeDeLetras"
        char[] quantidadeDeLetras = new char[palavraSorteada.length()];

        //No loop, enquanto o contador (i) for menos que o comprimento da variavel "quantidadeDeLetras" ele irá adicionar a underline. Para que no console imprima da seguinte forma : Palavra ______"
        for (int i = 0; i < quantidadeDeLetras.length; i++) {
            quantidadeDeLetras[i] = '_';
        }

        int tentativas = 7; //Numero de tentativas que o usuário possui
        Scanner scanner = new Scanner(System.in);

        //Enquanto o jogador possuir mais de 0 tentativas, ele irá imprimir no console a palavra. Utilizando o array "quantidadeDeLetras" criado anteriormente, ele irá imprimir a quantidade de underline correta
        while (tentativas > 0) {
            System.out.println("Palavra: ");
            // Aqui estamos iterando as variaveis
            for (char letra : quantidadeDeLetras) {
                System.out.print(letra + " ");
            }

            //Imprime para o jogador o numero de tentativas restantes
            System.out.println("\nTentativas restantes: " + tentativas);
            System.out.print("Digite uma letra: ");
            char tentativa = scanner.next().charAt(0);

            //Aqui criamos a variavel "letraDigitada" do tipo booleana, e a definimos como falsa
            boolean letraDigitada = false;

            //No loop for, enquanto o contador (i) tiver um numero menor que o numero de letras da palavra sorteada, ele irá acrescentar mais um no contador
            for (int i = 0; i < palavraSorteada.length(); i++) {
                if (palavraSorteada.charAt(i) == tentativa) {  //Aqui verificamos se a alguma letra da palavra é igual a letra digitada pelo jogador
                    quantidadeDeLetras[i] = tentativa; //Se for, vamos substituir a underline pela letra digitada pelo jogador
                    letraDigitada = true; //Definimos a letra digitada pelo jogador como true, e dessa forma nao iremos tirar uma tentativa do jogador
                }
            }

            //Caso a letra digitada pelo usuário seja diferente de alguma letra que contém na palavra, ou seja, uma letra incorreta
            if (!letraDigitada) {
                tentativas--; //Diminuimos uma tentativa do jogador, pois a letra digitada não pertence a palavra da forca
                System.out.println("Letra incorreta. Tente novamente.");
            } else {
                System.out.println("Letra correta!"); //Se o usuario digita a letra correta, ele é notificado
            }
            //Aqui verificamos se a "quantidadeDeLetras e a palavraSorteada são iguais, se forem, quer dizer que o jogador ganhou
            if (String.valueOf(quantidadeDeLetras).equals(palavraSorteada)) {
                System.out.println("Vitória, você ACERTOU =D! A palavra era: " + palavraSorteada);
                break;
            }
        }
        // Caso o jogador possua 0 tentativas, ele perdeu o jogo
        if (tentativas == 0) {
            System.out.println("Infelizmente você PERDEU :( ! A palavra era: " + palavraSorteada);
        }
    }
}
