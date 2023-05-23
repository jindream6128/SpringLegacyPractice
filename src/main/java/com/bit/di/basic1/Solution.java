package com.bit.di.basic1;

import java.io.IOException;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t= sc.nextInt();


        for(int tc =1; tc<=t;tc++){
            int ans =0;
            int result = sc.nextInt();
            for(int i = 1; i<=result ; i++){
                if(i%2==0){
                    ans -= i;
                }
                if(i%2 !=0){
                    ans +=i;
                }
            }
            System.out.println("#"+tc+" "+ans);

        }
    }
}
