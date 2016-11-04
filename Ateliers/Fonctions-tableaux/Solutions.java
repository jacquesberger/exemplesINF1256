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

class Solutions {
    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int min(int a, int b, int c) {
        return min(min(a, b), c);
    }

    public static int absolue(int a) {
        if (a < 0) {
            return a * -1;
        } else {
            return a;
        }
    }

    // attention: ne fonctionne que pour les tableaux avec au moins une valeur...
    public static int valeurMaximale(int[] tableau) {
        int max = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (max < tableau[i]) {
                max = tableau[i];
            }
        }
        return max;
    }

    public static boolean tousPairs(int[] tableau) {
        boolean tousPair = true;
        for (int i = 0; i < tableau.length; i++) {
            tousPair = tousPair && tableau[i] % 2 == 0;
        }
        return tousPair;
    }

    public static boolean existe(int valeur, int[] tableau) {
        boolean existe = false;
        int i = 0;
        while (i < tableau.length && !existe) {
            existe = tableau[i] == valeur;
            i++;
        }
        return existe;
    }

    public static int[] superieursA(int valeur, int[] tableau) {
        int taille = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] > valeur) {
                taille++;
            }
        }
        int[] superieurs = new int[taille];
        int j = 0;
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] > valeur) {
                superieurs[j] = tableau[i];
                j++;
            }
        }
        return superieurs;
    }

    public static void trier(int[] t) {
        for (int i = 1; i < t.length; i++) {
            int x = t[i];
            int j = i;
            while (j > 0 && t[j - 1] > x) {
                t[j] = t[j - 1];
                j--;
            }
            t[j] = x;
        }
    }

    public static void main(String[] args) {
        System.out.println(min(3, 2));

        System.out.println(min(3, 2, 1));

        System.out.println(absolue(-3));

        int[] t = {
            6, 4, 5, 2, 3, 1
        };

        System.out.println(valeurMaximale(t));

        System.out.println(tousPairs(t));

        System.out.println(existe(2, t));

        for (int chq: superieursA(3, t)) {
            System.out.println(chq);
        }

        trier(t);
        for (int chq: t) {
            System.out.println(chq);
        }
    }
}
