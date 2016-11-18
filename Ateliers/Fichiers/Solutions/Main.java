// This is free and unencumbered software released into the public domain.
// 
// Anyone is free to copy, modify, publish, use, compile, sell, or
// distribute this software, either in source code form or as a compiled
// binary, for any purpose, commercial or non-commercial, and by any
// means.
// 
// In jurisdictions that recognize copyright laws, the author or authors
// of this software dedicate any and all copyright interest in the
// software to the public domain. We make this dedication for the benefit
// of the public at large and to the detriment of our heirs and
// successors. We intend this dedication to be an overt act of
// relinquishment in perpetuity of all present and future rights to this
// software under copyright law.
// 
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
// EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
// MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
// IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
// OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
// ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
// OTHER DEALINGS IN THE SOFTWARE.
// 
// For more information, please refer to <http://unlicense.org/>

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
      
      // Exercice 1
        Scanner nombres = new Scanner(new File("nombres.txt"));
        double somme = 0.0;
        while (nombres.hasNext()) {
            String ligne = nombres.nextLine();
            somme += Double.parseDouble(ligne);
        }
        System.out.println(somme);
        
        // Exercice 2
        Scanner alice = new Scanner(new File("alice.txt"));
        Fiche fiche = new Fiche();
        while (alice.hasNext()) {
            String ligne = alice.nextLine();
            String[] parties = ligne.split(":");
            if (parties[0].equals("nom")) {
                fiche.nom = parties[1];
            } else if (parties[0].equals("age")) {
                fiche.age = Integer.parseInt(parties[1]);
            } if (parties[0].equals("adresse")) {
                fiche.adresse = parties[1];
            } 
        }
        System.out.println(fiche.nom + " " + fiche.age + " " + fiche.adresse);
        
        // Exercice 3
        Scanner cinqLignes = new Scanner(new File("cinq_lignes.txt"));
        String[] lignes = new String[5];
        for (int i = 0; i < 5; i++) {
            lignes[i] = cinqLignes.nextLine();
        }
        for (int i = 0; i < lignes.length; i++) {
            System.out.println(lignes[i]);
        }
    }
}
