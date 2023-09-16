package Programmers.Beginning;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/** [풀이 O]
 * 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 함수를 작성해주세요.
 * */

public class Q5 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("양의 정수 n을 입력해 주세요 > ");
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
            for(int i = 0; i <= n; i++) {
                if(i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println("정수 " + n + " 이하 짝수의 합은 : " + sum);
        }
    }
