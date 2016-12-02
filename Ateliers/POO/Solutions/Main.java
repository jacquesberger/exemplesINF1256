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

class Main {
    public static void main(String[] args) {
      Rectangle r = new Rectangle(2.0, 3.0);
      System.out.println(r.aire());

      Carre c = new Carre(2.0);
      System.out.println(c.aire());

      Ellipse e = new Ellipse(2.0, 3.0);
      System.out.println(e.aire());

      Cercle ce = new Cercle(2.0);
      System.out.println(ce.aire());

      Forme[] formes = { r, c, e, ce };
      // Alternativement:
      /*
      Forme[] formes = new Forme[4];
      formes[0] = r;
      formes[1] = c;
      formes[2] = e;
      formes[3] = ce;
      */
      for (Forme f : formes) {
          System.out.println(f.aire());
      }
    }
}
