Fonctions et tableaux
=====================

Les fonctions sont nécessaires à la maintenabilité du code source. Elles
permettent de réutiliser des bouts de code et de simplifier des processus
complexes. Les tableaux sont une structure courante dans la majorité des
langages de programmation. Maîtriser ces deux concepts permet de simplifier
grandement la rédaction des logiciels.

Objectifs
---------

* Initialiser et manipuler des tableaux de types natifs.
* Créer des fonctions.

Exercices
---------

1. Sans utiliser le module `Math`, complétez les fonctions suivantes:

    ```java
    public static int min (int a, int b) {
        // Retourne la valeur minimale entre a et b.
    }

    public static int min (int a, int b, int c) {
        // Retourne la valeur minimale entre a, b et c.
    }

    public static int absolue (int a) {
        // Retourne la valeur absolue de a.
    }
    ```

2. Complétez les fonctions suivantes:

    ```java
    public static int valeurMaximale (int[] tableau) {
        // Retourne la plus grande valeur du tableau.
    }

    public static boolean tousPair (int[] tableau) {
        // Retourne true si tous les nombres du tableau sont pairs et false autrement.
    }

    public static boolean existe (int valeur, int[] tableau) {
        // Retourne true si valeur existe dans le tableau; false autrement.
    }

    public static int[] superieursA (int valeur, int[] tableau) {
        // Retourne un nouveau tableau ne contenant que les nombres de tableau qui sont supérieurs à "valeur".
    }
    ```

3. Implémentez la fonction `trier` qui trie un tableau de valeur en ordre
   croissant. Vous pouvez utiliser le pseudo-code suivant: [Tri sélection](https://fr.wikipedia.org/wiki/Tri_par_insertion#Description_de_l.27algorithme)

    ```java
    public static void trier (int[] tableau) {
    }
    ```

Solutions
---------

* [Exercices #1 à #3](Solutions.java)
