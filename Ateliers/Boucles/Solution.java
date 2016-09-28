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

public class Solution {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int nombre;
        boolean estValide = false;
        do {
            System.out.println("Veuillez entrer un nombre entre 4 et 20 inclusivement : ");
            nombre = clavier.nextInt();
            if (nombre >= 4 && nombre <= 20) {
                estValide = true;
            }
            if (!estValide) {
                System.out.println("Nombre invalide.");
            }
        } while (!estValide);
        
        long factorielle = 1;
        for (int i = 2; i <= nombre; i++) {
            factorielle *= i;
        }
        
        System.out.println(String.format("La factorielle de %d est %d.", nombre, factorielle));
    }
}