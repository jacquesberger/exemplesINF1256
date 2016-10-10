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
    public static void main(String[] args) {

        // Exercice 1

        double a = 1.0;
        double b = 2.0;
        double c = 3.0;

        double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;
        double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / 2 * a;

        // Exercice 2

        double rayon = 3.0;

        double aire = 4 * Math.PI * Math.pow(rayon, 2);
        double volume = 4 / 3 * Math.PI * Math.pow(rayon, 3);

        // Exercice 3

        double pi = 0;
        for (int k = 0; k < 1000; k++) {
            pi = pi + Math.pow(-1, k) / (2 * k + 1);
        }
        pi = 4 * pi;
        System.out.println(pi);

        // Exercice 4

        double x = 2.0;
        double y = 3.0;

        double r = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double theta;
        if (x > 0 && y >= 0) {
            theta = Math.atan(y / x);
        } else if (x > 0 && y < 0) {
            theta = Math.atan(y / x) + 2 * Math.PI;
        } else if (x < 0) {
            theta = Math.atan(y / x) + Math.PI;
        } else if (x == 0 && y > 0) {
            theta = Math.PI / 2;
        } else if (x == 0 && y < 0) {
            theta = 3 * Math.PI / 2;
        } else {
            theta = 0;
        }
    }
}
