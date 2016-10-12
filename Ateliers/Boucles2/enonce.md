Boucles
=======

Quelques manipulations supplémentaires sur les boucles.

Exercices
---------

Vous allez construire un jeu de roche-papier-ciseaux. La roche bat les ciseaux;
le papier bat la roche; les ciseaux battent le papier.

1. Le programme doit jouer infiniment des parties de roche-papier-ciseaux contre
   l'utilisateur. Ex.:
   ```
   1- Roche
   2- Papier
   3- Ciseaux
   Votre coup? 2
   Le coup de l'ordinateur : Papier
   Partie nulle

   1- Roche
   2- Papier
   3- Ciseaux
   Votre coup? 2
   Le coup de l'ordinateur : Roche
   Vous gagnez.

   1- Roche
   2- Papier
   3- Ciseaux
   Votre coup? 2
   Le coup de l'ordinateur : Ciseaux
   Vous perdez.
   ```

2. Modifiez le programme afin de rejeter tous les coups qui seraient invalides.
   Ex.:
   ```
   1- Roche
   2- Papier
   3- Ciseaux
   Votre coup? 2d
   Coup rejeté. Recommencez : eeee
   Coup rejeté. Recommencez : test
   Coup rejeté. Recommencez : 1
   Le coup de l'ordinateur : Ciseaux
   Vous gagnez.
   ```

3. Faites en sorte que le programme se termine lorsqu'un des deux joueurs
   (l'utilisateur ou l'ordinateur) aura gagné 3 parties.

Solutions
---------

* [Exercice #3](Solution3.java)
