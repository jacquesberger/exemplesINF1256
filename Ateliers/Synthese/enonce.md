Synthèse
========

Quelques exercices pour mettre en pratique ce que vous avez appris jusqu'à date
dans ce cours.

Les solutions de ces exercices ne seront pas données. Voyez-le comme un défi
visant à vous préparer à l'examen final.

Objectifs
---------

* Manipuler les boucles, variables, fichiers, objets, fonctions, tableaux,
  chaînes de caractères.
* Tester votre débrouillardise dans le code.

Exercices
---------

1. Écrivez une fonction prenant en paramètre un nombre entier `n` et retournant un
   tableau contenant `n` nombres aléatoires entre 1 et 1000. La fonction doit
   retourner `null` si `n` est plus petit ou égal à 0. Utilisez la classe
   [Random](https://docs.oracle.com/javase/8/docs/api/java/util/Random.html)
   pour générer les nombres aléatoires.

2. Écrivez un programme qui sert à saisir une liste de personnes et qui les trie
   en fonction de leur âge. Le programme demande dans un premier lieu combien de
   personnes vont être saisi. Ensuite, pour chaque personne, il pose les
   questions suivantes :
   ```
   Quel est le nom complet de la personne?
   Quel est l'âge de <insérer le nom de la personne>?
   ```
   Vous devez créer une classe Personne pour y stocker ces données. Les
   personnes doivent être placées dans un tableau. Ensuite, votre programme doit
   trier le tableau en ordre croissant d'âge. Voici un pseudo-code pour un
   algorithme de tri bulle :
   ```
   n = taille de tableau
   POUR i de 0 à n-2
     POUR j de i+1 à n-1
       SI tableau[j] < tableau[i] ALORS
         temporaire = tableau[i]
         tableau[i] = tableau[j]
         tableau[j] = temporaire
   ```
   Une fois le tri terminé, le programme affiche le nom et l'âge des personnes,
   du plus jeune au plus vieux.

3. Écrivez une fonction qui prend en paramètre un code permanent et retourne un
   entier représentant l'âge de la personne en date d'aujourd'hui. N'oubliez pas
   que le mois est augmenté de 50 pour les femmes.

4. Dans un fichier nommé `prenoms.txt`, écrivez 10 prénoms. Dans un fichier
   nommé `noms.txt`, écrivez 10 noms de famille. Écrivez un programme qui lira
   ces 2 fichiers et placera les prénoms dans un tableau et les noms dans un
   autre tableau. Ensuite, votre logiciel doit écrire dans un nouveau fichier 30
   noms complets générés aléatoirement à partir des 2 tableaux. Vous n'avez pas
   besoin de garantir l'unicité des noms générés.
