Lecture au clavier et chaînes de caractères
===========================================

Les lectures au clavier vont nous permettre d'interagir avec nos logiciels et
les chaînes de caractères sont un type de données important que l'on manipule
continuellement. Cet atelier vise à mettre en pratique ces deux éléments.

Objectifs
---------

* Effectuer des lectures de différents types de données au clavier.
* Manipuler des chaînes de caractères et faire des opérations élémentaires sur
  les chaînes.
* Faire du formattage de données.

Exercices
---------

1. Écrivez un programme qui lit deux nombres au clavier puis qui affiche le 
   résultat d'opérations mathématiques. Par exemple :
   ```
    Entrez x: 123
    Entrez y: 567.78
    x + y = 690.780000
    x - y = -444.780000
    x * y = 69836.940000
    x / y = 0.216633
   ```

2. Faites en sorte que les résultats affichés dans l'exercice #1 soient
   formattés ainsi :
   ```
    x + y =    +690.78
    x - y =    -444.78
    x * y = +69,836.94
    x / y =      +0.22
   ```

3. Écrivez un programme qui demande le nom d'un mois de l'année puis affiche le
   nombre de jours dans ce mois. Pour simplifier, lorsque le mois demandé
   est `février`, affichez toujours `28`.

4. Écrivez un programme qui demande une année puis indique si cette année est
   bissextile ou non. Voici le pseudo-code:
   ```
    Si l'année n'est pas divisible par 4 alors c'est une année normale
    Sinon, si l'année n'est pas divisible par 100 alors c'est une année bissextile
    Sinon, si l'année n'est pas divisible par 400 alors c'est une année normale
    Sinon, c'est une année bissextile.
   ```

5. Améliorez le programme de l'exercice #3 en demandant l'année lorsque le mois
   est `février` puis en affichant `29` lorsqu'il s'agit d'une année bissextile.

6. Améliorer le programme de l'exercice #2 en demandant l'opération mathématique
   à effectuer à l'utilisateur. Par exemple:
   ```
    Entrez x: 123
    Entrez y: 567.78
    Entrez l'opération: addition
    x + y =    +690.78
   ```
   Si l'opération saisie n'existe pas, le programme doit
   afficher `Désolé, cette opération n'est pas supportée`.

Solutions
---------

* [Exercices #1 à #4](Solutions.java)
