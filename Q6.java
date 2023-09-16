package Programmers.Beginning;

/**[풀이 O]
 * 다음과 같이 출력하도록 코드를 작성해 주세요.
 * !@#$%^&*(\'"<>?:;
 * */
public class Q6 {
    public class Solution {
        public static void main(String[] args) {
            int [] ASCII = {33, 64, 35, 36, 37, 94, 38, 42, 40, 92, 39, 34, 60, 62, 63, 58, 59 };
            char[] charAscii = new char[ASCII.length];
            for(int i = 0; i < ASCII.length; i++) {
                charAscii[i] = (char) ASCII[i];
            }
            System.out.println(charAscii);
        }
    }
}
