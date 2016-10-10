Classe Math
===========

Les manipulations mathématiques sont très fréquentes dans les programmes
informatiques. Les fonctionnalités courantes sont disponibles au travers de la
classe Math.

Objectifs
---------

* Manipuler les fonctionnalités de base de la classe Math.

Exercices
---------

1. Les deux solutions de la formule quadratique sont données par l'équation suivante:

    ![equation](http://latex.codecogs.com/gif.latex?x=\\frac{-b\\pm\\sqrt{b^2-4ac}}{2a})

    À l'aide des fonctions appropriées du module `Math`, écrivez un programme qui calcule les deux valeurs de `x` si:
    ```
    a = 1.0
    b = 2.0
    c = 3.0
    ```

2. En utilisant les fonctions et constantes appropriées du module `Math`, calculez
   l'aire et le volume d'une sphère si son rayon est `3.0`.

    ![equation](http://latex.codecogs.com/gif.latex?A=4\\pi\ r^2)

    ![equation](http://latex.codecogs.com/gif.latex?V=\\frac{4}{3}\\pi\ r^3)

3. Il y a 600 ans, [Madhava de Sangamagrama](https://fr.wikipedia.org/wiki/Madhava_de_Sangamagrama) a découvert
   une formule pour calculer le nombre ![equation](http://latex.codecogs.com/gif.latex?\\pi):

    ![equation](http://latex.codecogs.com/gif.latex?\\pi=4\\left(1-\\frac13+\\frac15-\\frac17+\\cdots\\right)=4\\sum_{k=0}^{\\infty}\\frac{(-1)^k}{2k+1})

    En utilisant une boucle et les fonctions appropriées du module `Math`, calculez la valeur de ![equation](http://latex.codecogs.com/gif.latex?\\pi). Évidemment, puisque qu'il n'est pas pratique de faire une boucle infinie, limitez votre boucle à 1000 itérations.

4. En géométrie, pour décrire un point sur un plan euclidien, on peut utiliser
   un système de coordonnées cartésiennes (x, y) ou un système de coordonnées
   polaires (r, ![equation](http://latex.codecogs.com/gif.latex?\\theta)) (lettre grecque _theta_).

    Il est possible de convertir une coordonnée cartésienne en coordonnée polaire avec les formules suivantes:

    ![equation](http://latex.codecogs.com/gif.latex?r = \\sqrt{x^2 + y^2})

    ![equation](http://latex.codecogs.com/gif.latex?\\theta=\\begin{cases}
    \\arctan(\\frac yx)& \\mbox{si } x > 0 \\mbox{ et } y \\ge 0,\\\\
    \\arctan(\\frac yx) + 2\\pi & \\mbox{si } x > 0 \\mbox{ et } y < 0,\\\\
    \\arctan(\\frac yx) + \\pi  & \\mbox{si } x < 0,\\\\
    \\frac{\\pi}2& \\mbox{si } x = 0 \\mbox{ et } y > 0,\\\\
    \\frac{3\\pi}2& \\mbox{si } x = 0 \\mbox{ et } y < 0,\\\\
    0& \\mbox{si } x = 0 \\mbox{ et } y = 0.\\\\
    \\end{cases})

    À l'aide des fonctions appropriées du module `Math` et de conditions, écrivez un programme qui calcule `r` et ![equation](http://latex.codecogs.com/gif.latex?\\theta) si
    ```
    x = 2.0
    y = 3.0
    ```

Solutions
---------

* [Exercices #1 à #4](Solutions.java)
