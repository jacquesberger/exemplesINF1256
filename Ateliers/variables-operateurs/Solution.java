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

public class Solution {
    public static void main(String[] args) {
        // Exercice #1
        int moyenne = (10 + 15 + 25 + 50 + 100) / 5;
        System.out.println(moyenne);


        // Exercice #2
        String prenom = "Jacques";
        String nom = "Berger";
        String nomComplet = prenom + " " + nom;
        System.out.println(nomComplet);


        // Exercice #3
        int dateDuJour = 11;
        int annee = 2016;
        String nomDuMois = "septembre";
        String dateComplete = dateDuJour + " " + nomDuMois + " " + annee;
        System.out.println(dateComplete);


        // Exercice #4
        double notePonderee = 0.56 * 30;
        System.out.println(notePonderee);


        // Exercice #5
        double valeurPeriodique = 17.0 / 3;
        System.out.println(valeurPeriodique);


        // Exercice #6
        int valeurEntiere = (int) valeurPeriodique;
        System.out.println(valeurEntiere);


        // Exercice #7
        int nombreFibo1 = 1;
        int nombreFibo2 = 1;
        int nombreFibo3 = nombreFibo1 + nombreFibo2;
        int nombreFibo4 = nombreFibo2 + nombreFibo3;
        int nombreFibo5 = nombreFibo3 + nombreFibo4;
        int nombreFibo6 = nombreFibo4 + nombreFibo5;
        int nombreFibo7 = nombreFibo5 + nombreFibo6;
        int nombreFibo8 = nombreFibo6 + nombreFibo7;
        String nombresFibo = nombreFibo1 + ", " + nombreFibo2 + ", " + nombreFibo3 + ", " + nombreFibo4 + ", " +
                             nombreFibo5 + ", " + nombreFibo6 + ", " + nombreFibo7 + ", " + nombreFibo8;
        System.out.println(nombresFibo);


        // Exercice #8
        int nombre = 77;
        String parite = "Le nombre " + nombre + " est ";
        if (nombre % 2 == 1) {
            parite = parite + "im";
        }
        parite = parite + "pair.";
        System.out.println(parite);


        // Exercice #9
        char lettre1 = 80;
        char lettre2 = 105;
        char lettre3 = 107;
        char lettre4 = 97;
        char lettre5 = 99;
        char lettre6 = 104;
        char lettre7 = 117;
        System.out.print(lettre1);
        System.out.print(lettre2);
        System.out.print(lettre3);
        System.out.print(lettre4);
        System.out.print(lettre5);
        System.out.print(lettre6);
        System.out.println(lettre7);
    }
}