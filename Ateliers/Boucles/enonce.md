Boucles
=======

Les boucles sont une structure récurrente en programmation. Leur particularité
vient du fait qu'elles modifient le chemin d'exécution du programme afin de
répéter plusieurs un ensemble d'instructions.

Il y a 3 types de boucles : for, while et do/while. Utiliser le bon type de
boucle pour un problème donné permet de simplifier le code.

Objectifs
---------

* Manipuler les différents types de boucles.

Exercices
---------

1. Écrivez un programme qui demande à l'utilisateur de spécifier un nombre
   entier situé entre 4 et 20 inclusivement. Ensuite, votre programme devra calculer et
   afficher la factorielle du nombre donné par l'utilisateur.

2. Que se passe-t-il avec la factorielle de 20? Que doit-on faire pour obtenir
   la bonne valeur? Corrigez le problème.

3. Modifiez le programme de l'exercice #1 afin qu'il demande continuellement à
   l'utilisateur de spécifier une valeur entre 4 et 20 s'il a spécifié une
   valeur invalide. Par exemple :
   ```
     Veuillez entrer un nombre entre 4 et 20 inclusivement : 3
     Nombre invalide.
     Veuillez entrer un nombre entre 4 et 20 inclusivement : 21
     Nombre invalide.
     Veuillez entrer un nombre entre 4 et 20 inclusivement : 100000
     Nombre invalide.
     Veuillez entrer un nombre entre 4 et 20 inclusivement : -1
     Nombre invalide.
     Veuillez entrer un nombre entre 4 et 20 inclusivement : 4
     La factorielle de 4 est 24.
   ```

4. Transformer le code suivant pour utiliser une boucle `while` à la place d'une
   boucle `for`.
   ```java
    // Trouver les 4 premiers multiples de 17 entre 1 et 100 inclusivement
    int nombreMultiples = 0;
    for (int i = 1; i <= 100 && nombreMultiples < 4; i++) {
        if (i % 17 == 0) {
            System.out.println(i);
            nombreMultiples++;
        }
    }
    ```

Solutions
---------

* [Exercices #1 à #3](Solution.java)
* [Exercice #4](Solution4.java)
