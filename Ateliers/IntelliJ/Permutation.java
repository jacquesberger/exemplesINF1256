/* Copyright 2016 Jacques Berger

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

public class Permutation {
    public static void main(String[] args) {
        int variable1 = 77;
        int variable2 = 144;

        int temporaire = variable1;
        variable1 = variable2;
        variable2 = temporaire;

        System.out.println("variable1 : " + variable1);
        System.out.println("variable2 : " + variable2);
    }
}