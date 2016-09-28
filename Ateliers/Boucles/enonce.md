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

2. Modifiez le programme de l'exercice #1 afin qu'il demande continuellement à
   l'utilisateur de spécifier une valeur entre 4 et 20 s'il a spécifié une
   valeur invalide. Attention : l'utilisateur doit aussi pouvoir écrire des
   lettres ou autres caractères. Par exemple :
   ```
     Veuillez entrer un nombre entre 4 et 20 inclusivement : 3
     Nombre invalide.
     Veuillez entrer un nombre entre 4 et 20 inclusivement : 4a
     Nombre invalide.
     Veuillez entrer un nombre entre 4 et 20 inclusivement : hello
     Nombre invalide.
     Veuillez entrer un nombre entre 4 et 20 inclusivement : 21
     Nombre invalide.
     Veuillez entrer un nombre entre 4 et 20 inclusivement : 100000
     Nombre invalide.
     Veuillez entrer un nombre entre 4 et 20 inclusivement : c
     Nombre invalide.
     Veuillez entrer un nombre entre 4 et 20 inclusivement : -1
     Nombre invalide.
     Veuillez entrer un nombre entre 4 et 20 inclusivement : 4
     La factorielle de 4 est 24.
   ```
