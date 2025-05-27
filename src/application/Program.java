package application;

import entities.Champion;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String championName1, championName2;
        int championLife1, championLife2;
        int championAttack1, championAttack2;
        int championArmor1, championArmor2;
        int turns;

        System.out.println("Digite os dados do primeiro campeão:");
        System.out.print("Nome: ");
        championName1 = scanner.nextLine();
        System.out.print("Vida inicial: ");
        championLife1 = scanner.nextInt();
        System.out.print("Ataque: ");
        championAttack1 = scanner.nextInt();
        System.out.print("Armadura: ");
        championArmor1 = scanner.nextInt();

        System.out.println("\nDigite os dados do segundo campeão:");
        System.out.print("Nome: ");
        scanner.nextLine();
        championName2 = scanner.nextLine();
        System.out.print("Vida inicial: ");
        championLife2 = scanner.nextInt();
        System.out.print("Ataque: ");
        championAttack2 = scanner.nextInt();
        System.out.print("Armadura: ");
        championArmor2 = scanner.nextInt();

        System.out.print("\nQuantos turnos você deseja executar? ");
        turns = scanner.nextInt();

        Champion champion1 = new Champion(championName1, championLife1, championAttack1, championArmor1);
        Champion champion2 = new Champion(championName2, championLife2, championAttack2, championArmor2);

        for (int i = 1; i <= turns ; i++) {
            System.out.println("\nResultado do turno " + (i) + ":");

            champion1.takeDamage(champion2);
            champion2.takeDamage(champion1);

            System.out.println(champion1.status());
            System.out.println(champion2.status());


            if (champion1.getLife() == 0 || champion2.getLife() == 0){
                break;
            }
        }

        System.out.println("\nFIM DO COMBATE");
    }
}