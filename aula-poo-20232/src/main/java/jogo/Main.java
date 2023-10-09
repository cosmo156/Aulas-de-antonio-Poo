package jogo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Personagem barriga = new Personagem("Seu Barriga");
        Personagem madruga = new Personagem("Seu Madruga");
        Arma peixeira = new Arma("Peixeira", 20);
        Arma faca = new Arma("Faca Enferrujada", 20,20);
        Arma chinela = new Arma("Chinela havaiana", 10);
        Pocao corote = new Pocao("Corote", 5); //corote cura 5 de vida
        Pocao tGe51 = new Pocao("51 com Tira Gosto", 10,20); //Tira Gosto com 51 cura 10 de vida e consome 20 de mana



        Scanner teclado = new Scanner(System.in);
        boolean executando = true;
        boolean jogoIniciado= true;
        String vencedor="ninguem";

        while (executando) {
            System.out.println("Menu");
            System.out.println("1 - Iniciar"); // Parte iniciar jogo concluida!
            System.out.println("2 - Opções");
            System.out.println("3 - Sair");
            System.out.print("Digite uma opção: ");
            int opc = teclado.nextInt();
            switch (opc) {
                case 1:
                    jogoIniciado=true;
                    System.out.println("Jogo Iniciado!");
                    barriga.reiniciarVida();
                    madruga.reiniciarVida();
                    while (jogoIniciado){
                        if(barriga.getVida() <=0){
                            vencedor = madruga.getNome();
                            jogoIniciado=false;
                            break;
                        }
                        else if (madruga.getVida()<=0) {
                            vencedor = barriga.getNome();
                            break;
                        }
                        else {

                            faca.setPoder(20);
                            System.out.printf("1- %s atacar %s\n", madruga.getNome(), barriga.getNome());
                            System.out.printf("2- %s atacar %s\n", barriga.getNome(), madruga.getNome());
                            System.out.printf("3- %s Recuperar vida\n", madruga.getNome());
                            System.out.printf("4- %s Recuperar vida\n", barriga.getNome());
                            System.out.print("Digite uma opção: ");
                            int opic = teclado.nextInt();
                            switch (opic) {
                                case 1:

                                    System.out.printf("Escolha a arma:\n1- %s\n2- %s\n3- %s\n", peixeira.getNome(), chinela.getNome(), faca.getNome());
                                    System.out.print("Opção: ");
                                    int armaOpc = teclado.nextInt();

                                    switch (armaOpc) {
                                        case 1:
                                            madruga.setArma(peixeira);
                                            madruga.atacar(barriga);
                                            break;
                                        case 2:
                                            madruga.setArma(chinela);
                                            madruga.atacar(barriga);
                                            break;
                                        case 3:
                                            if(madruga.getMana() >= (faca.getPoder()+ faca.getConsumoMana())){
                                                faca.setPoder(faca.getConsumoMana());
                                                madruga.setArma(faca);
                                                madruga.atacar(barriga);
                                            }
                                            else{
                                                faca.setPoder(20);
                                                madruga.setArma(faca);
                                                madruga.atacar(barriga);

                                            }
                                            break;
                                        default:
                                            System.out.println("Arma inválida!!!");
                                            break;
                                    }
                                    break;

                                case 2:
                                    System.out.printf("Escolha a arma:\n1- %s\n2- %s\n3- %s\n", peixeira.getNome(), chinela.getNome(), faca.getNome());
                                    System.out.print("Opção: ");
                                    int armaOpc2 = teclado.nextInt();
                                    switch (armaOpc2) {
                                        case 1:
                                            barriga.setArma(peixeira);
                                            barriga.atacar(madruga);
                                            break;
                                        case 2:
                                            barriga.setArma(chinela);
                                            barriga.atacar(madruga);
                                            break;
                                        case 3:

                                            if(barriga.getMana() >= (faca.getPoder()+ faca.getConsumoMana())){
                                                faca.setPoder(faca.getConsumoMana());
                                                barriga.setArma(faca);
                                                barriga.atacar(madruga);
                                            }
                                            else{
                                                faca.setPoder(20);
                                                barriga.setArma(faca);
                                                barriga.atacar(madruga);

                                            }
                                            break;
                                        default:
                                            System.out.println("Arma inválida!!");
                                            break;
                                    }
                                    break;
                                case 3:
                                    System.out.printf("Escolha o item de cura:\n1- %s\n2-%s\n", tGe51.getNome(), corote.getNome());
                                    System.out.print("Opção: ");
                                    int curaOpc = teclado.nextInt();
                                    switch (curaOpc) {
                                        case 1:
                                            madruga.recuperarVida(tGe51);
                                            break;
                                        case 2:
                                            madruga.recuperarVida(corote);
                                            break;
                                        default:
                                            System.out.println("Cura inválida!!!");
                                            break;
                                    }
                                    break;
                                case 4:
                                    System.out.printf("Escolha o item de cura:\n1- %s\n2-%s\n", tGe51.getNome(), corote.getNome());
                                    System.out.print("Opção: ");
                                    int curaOpc2 = teclado.nextInt();
                                    switch (curaOpc2) {
                                        case 1:
                                            barriga.recuperarVida(tGe51);
                                            break;
                                        case 2:
                                            barriga.recuperarVida(corote);
                                            break;
                                        default:
                                            System.out.println("Cura inválida!!!");
                                            break;
                                    }
                                    break;
                                default:
                                    System.out.println("Opção inválida!!!");
                                    break;

                            }
                        }


                    }
                    System.out.printf("\n\n\nO jogo acabou!\n%s Vencedor!!!\n\n\n\n\n",vencedor);
                    break;
                case 2:
                    System.out.println("Você escolheu Opções");
                    break;
                case 3:
                    System.out.println("Você escolheu Sair");
                    executando = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
           // double randNum = Math.random(); // 0 >= num > 1.0
           // if (randNum < 0.3) {
           //     System.out.println("Encontrou um inimigo");
           // }
           // System.out.println(randNum);
        }
    }
}
