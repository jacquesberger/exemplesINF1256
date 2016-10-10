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

import java.util.*;

class Solutions {
    public static void main(String[] args) {
    
        // Exercice 1
        /*
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez x: ");
        double x = clavier.nextDouble();
        System.out.print("Entrez y: ");
        double y = clavier.nextDouble();
        System.out.println(String.format("x + y = %f", x + y));
        System.out.println(String.format("x - y = %f", x - y));
        System.out.println(String.format("x * y = %f", x * y));
        System.out.println(String.format("x / y = %f", x / y));
        */
    
        // Exercice 2
        /*
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez x: ");
        double x = clavier.nextDouble();
        System.out.print("Entrez y: ");
        double y = clavier.nextDouble();
        System.out.println(String.format("x + y = %+,10.2f", x + y));
        System.out.println(String.format("x - y = %+,10.2f", x - y));
        System.out.println(String.format("x * y = %+,10.2f", x * y));
        System.out.println(String.format("x / y = %+,10.2f", x / y));
        */
    
        // Exercice 3
        /*
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez le nom du mois: ");
        String mois = clavier.nextLine();
        int nbJours = 0;
        switch (mois) {
            case "janvier":
            case "mars":
            case "mai":
            case "juillet":
            case "aout":
            case "octobre":
            case "décembre":
                nbJours = 31;
                break;
            case "avril":
            case "juin":
            case "septembre":
            case "novembre":
                nbJours = 30;
                break;
            case "février":
                nbJours = 28;
                break;
            default:
                break;
        }
        System.out.println(nbJours);
        */
    
        // Exercice 4
        /*
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez une année: ");
        int annee = clavier.nextInt();
        boolean bissextile = false;
        if (annee % 4 != 0) {
            bissextile = false;
        } else if (annee % 100 != 0) {
            bissextile = true;
        } else if (annee % 400 != 0) {
            bissextile = false;
        } else {
            bissextile = true;
        }
        if (bissextile) {
            System.out.println(String.format("%d est bissextile", annee));
        } else {
            System.out.println(String.format("%d n'est pas bissextile", annee));
        }
        */

        // Exercice 5
        /*
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez le nom du mois: ");
        String mois = clavier.nextLine();
        int nbJours = 0;
        switch (mois) {
            case "janvier":
            case "mars":
            case "mai":
            case "juillet":
            case "aout":
            case "octobre":
            case "décembre":
                nbJours = 31;
                break;
            case "avril":
            case "juin":
            case "septembre":
            case "novembre":
                nbJours = 30;
                break;
            case "février":
                System.out.println("Quelle année : ");
                String anneeBrute = clavier.nextLine();
                int annee = Integer.parseInt(anneeBrute);
                boolean bissextile = false;
                if (annee % 4 != 0) {
                    bissextile = false;
                } else if (annee % 100 != 0) {
                    bissextile = true;
                } else if (annee % 400 != 0) {
                    bissextile = false;
                } else {
                    bissextile = true;
                }
                if (bissextile) {
                    nbJours = 29;
                } else {
                    nbJours = 28;
                }
                break;
            default:
                break;
        }
        System.out.println(nbJours);
        */    
  }
}
