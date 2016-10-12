/* Copyright 2016 Jacques Berger

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

import java.util.*;

class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner keyboard = new Scanner(System.in);
        int countLosses = 0;
        int countVictories = 0;

        // Jusqu'à ce qu'on obtienne 3 victoires ou 3 défaites
        do {
            // Choisir le coup de l'ordinateur
            int computerPlays = random.nextInt(3) + 1;

            System.out.print("1- Roche\n2- Papier\n3- Ciseaux\nVotre coup?");
            // Lire le choix de l'utilisateur
            String choice = keyboard.nextLine();

            boolean validInput = false
            do {
                switch (choice) {
                    case "1":
                    case "2":
                    case "3":
                        // Le coup est valide
                        validInput = true;
                        System.out.print("Le coup de l'ordinateur : ");
                        switch (computerPlays) {
                            case 1:
                                System.out.println("Roche");
                                break;
                            case 2:
                                System.out.println("Papier");
                                break;
                            case 3:
                                System.out.println("Ciseaux");
                                break;
                        }

                        // Déterminer le gagnant
                        int userPlays = Integer.parseInt(choice);
                        if (userPlays == computerPlays) {
                            System.out.println("Partie nulle.");
                        } else if ((userPlays == 1 && computerPlays == 3) || (userPlays == 2 && computerPlays == 1) || (userPlays == 3 && computerPlays == 2)) {
                            System.out.println("Vous gagnez!");
                            countVictories++;
                        } else {
                            System.out.println("Vous perdez!");
                            countLosses++;
                        }
                        break;
                    default:
                        // Le coup est invalide
                        System.out.print("Coup rejeté. Recommencez :");
                        choice = keyboard.nextLine();
                }
            } while (!validInput);
        } while (countVictories < 3 && countLosses < 3);
    }
}
