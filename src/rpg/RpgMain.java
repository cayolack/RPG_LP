package rpg;

import java.util.Scanner;

public class RpgMain {

    public static Personagem escolhaDeHeroi() {
        int escolha;
        Personagem personagem = null;
        System.out.println("1-Arqueiro\n2-Soldado\n3-Aprendiz\n4-Feiticeiro");
        Scanner rc = new Scanner(System.in);

        escolha = rc.nextInt();

        switch (escolha) {

            case 1:
                personagem = new Arqueiro("robinhood", "chuva de flechas", 300, 500, 400, 200);
                System.out.println("Arqueiro pronto para a batalha\n");
                break;
            case 2:
                personagem = new Soldado("james lanniste", "guarda dourada", 300, 500, 200, 400);
                System.out.println("Soldado pronto para a batalha\n");
                break;
            case 3:
                personagem = new Aprendiz("Bruxa", "Drogon", 400, 500, 200, 200);
                System.out.println("Aprendiz pronto para a batalha\n");
                break;
            case 4:
                personagem = new Feiticeiro("Gandolf", "healing", 500, 300, 300, 200);
                System.out.println("Feiticeiro pronto para a batalha\n");
                break;

        }
        return personagem;
    }

    public static void main(String[] args) {

        Personagem play1;
        Personagem play2;

        System.out.println("Bem Vindo!!!");
        System.out.println("**************");
        System.out.println("NEXUS");
        System.out.println("**************");
        System.out.println("Escolha seu personagem!");

        play1 = escolhaDeHeroi();
        play2 = escolhaDeHeroi();

        System.out.print(play1.Nome() + "Vs");
        System.out.println(play2.Nome());
        battle(play1, play2);

    }

    public static void battle(Personagem play1, Personagem play2) {

        while (play1.Saude() > 0 || play2.Saude() > 0) {
            play1.TakeDamage(play2.Forca());
            play2.TakeDamage(play1.Forca());

        }
        if (play1.Saude() <= 0) {
            System.out.println(play1.Nome() + " Moorreu!");
            System.out.println(play2.Nome() + " é o vencedor");
        } else {
            if (play2.Saude() <= 0) {
                System.out.println(play2.Nome() + " Morreuuu!");
                System.out.println(play1.Nome() + " é o vencedor");
            } else {
                if (play2.Saude() <= 0 && play1.Saude() <= 0) {
                    System.out.println("Deu Empate!!!");
                }
            }

        }
    }
}
