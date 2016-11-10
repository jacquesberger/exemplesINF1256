/*
 * Copyright 2016 Jacques Berger.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class Main {

    public static void main(String[] args) {
        // Exercice #2
        Personne jacques = new Personne();
        jacques.prenom = "Jacques";
        jacques.nom = "Berger";
        jacques.age = 33;
        jacques.assuranceMaladie = "ABCD12345678";
        jacques.assuranceSociale = "222333444";
        jacques.aimeLesChats = false;
        jacques.sexe = 1;
        
        changerSexe(jacques);
        Personne copie = copierPersonne(jacques);
        
        // Exercice #5
        Personne[] tableau = new Personne[4];
        
        tableau[0] = new Personne();
        tableau[0].sexe = 1;
        tableau[0].age = 44;
        tableau[0].aimeLesChats = false;
        tableau[0].assuranceMaladie = "URTU34343434";
        tableau[0].assuranceSociale = "345234456";
        tableau[0].nom = "Stevenson";
        tableau[0].prenom = "Steven";
        
        tableau[1] = new Personne();
        tableau[1].sexe = 2;
        tableau[1].age = 2;
        tableau[1].aimeLesChats = true;
        tableau[1].assuranceMaladie = "OIRE34343434";
        tableau[1].assuranceSociale = "645234456";
        tableau[1].nom = "Stevenson";
        tableau[1].prenom = "Michelle";
        
        tableau[2] = new Personne();
        tableau[2].sexe = 2;
        tableau[2].age = 39;
        tableau[2].aimeLesChats = false;
        tableau[2].assuranceMaladie = "OIOI34343434";
        tableau[2].assuranceSociale = "845234456";
        tableau[2].nom = "Funai";
        tableau[2].prenom = "Makiko";
        
        tableau[3] = new Personne();
        tableau[3].sexe = 1;
        tableau[3].age = 5;
        tableau[3].aimeLesChats = true;
        tableau[3].assuranceMaladie = "NNNN34343434";
        tableau[3].assuranceSociale = "145234456";
        tableau[3].nom = "Stevenson";
        tableau[3].prenom = "Michael";
    }
    
    // Exercice 3
    public static void changerSexe(Personne personne) {
        if (personne.sexe == 1) {
            personne.sexe = 2;
        } else {
            personne.sexe = 1;
        }
    }
    
    // Exercice 4
    public static Personne copierPersonne(Personne personne) {
        Personne copie = new Personne();
        copie.age = personne.age;
        copie.aimeLesChats = personne.aimeLesChats;
        copie.assuranceMaladie = personne.assuranceMaladie;
        copie.assuranceSociale = personne.assuranceSociale;
        copie.nom = personne.nom;
        copie.prenom = personne.prenom;
        copie.sexe = personne.sexe;
        return copie;
    }
    
    // Exercice 6
    public static int compterFemmes(Personne[] personnes) {
        int compteur = 0;
        for (int i = 0; i < personnes.length; i++) {
            if (personnes[i].sexe == 2) {
                compteur++;
            }
        }
        return compteur;
    }
    
    public static Personne trouverPersonneQuiAimeLesChats(Personne[] personnes) {
        for (int i = 0; i < personnes.length; i++) {
            if (personnes[i].aimeLesChats) {
                return personnes[i];
            }
        }
        return null;
    }
}