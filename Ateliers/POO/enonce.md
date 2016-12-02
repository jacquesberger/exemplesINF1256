Programmation orientée-objets
=============================

La programmation orientée-objets inclut plusieurs principes comme l'héritage et
l'encapsulation.

Objectifs
---------

* Expérimenter l'héritage.
* Rédiger des méthodes.

Exercices
---------

1. Vous devez réaliser une classe nommée `Rectangle`. Cette classe doit avoir
une méthode nommée `aire`. Implémentez la classe et la méthode.

    ```java
    public class Rectangle {
      public double largeur = 0.0;
      public double longueur = 0.0;
      
      // votre code ici.
    }
    ```

2. Ajoutez un constructeur à la classe `Rectangle` qui permet d'initialiser les 
champs `longueur` et `largeur`. L'instanciation de la classe se ferait donc ainsi:

    ```java
    Rectangle r = new Rectangle(2.0, 3.0);
    double a = r.aire(); //=> 6.0
    ```

3. Créez la classe `Carre`. Cette nouvelle classe doit hériter de la classe 
`Rectangle`. Faites en sorte que le code suivant fonctionne:

    ```java
    Carre c = new Carre(2.0);
    double a = c.aire(); //=> 4.0
    ```

  **Important**: Vous ne devriez pas avoir à réécrire la méthode `aire`!

4. Refaites les exercices 2 et 3 mais cette fois-ci, avec les classes `Ellipse` 
et `Cercle`.

5. Faites en sorte que les classes `Rectangle`, `Carre`, `Ellipse` et `Cercle` 
hérite de la nouvelle classe `Forme`. Dessinez le diagramme de classes.

6. Faites un tableau d'instances de la classe `Forme` et calculez l'aire de
toutes les formes à l'aide d'une boucle.

Solutions
---------

* [Exercices #1 à #6](Solutions/)
