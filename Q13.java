package Programmers.Beginning;

public class Q13 {
    class Solution {
        public int solution(int[] num_list) {
            int multi = 0;
            int numLeng = num_list.length;
            if(11 <= numLeng) {
                for(int i = 0; i < numLeng; i++){
                    multi *= i;
                }
                return multi;
            }
            return multi;
        }
    }
}
