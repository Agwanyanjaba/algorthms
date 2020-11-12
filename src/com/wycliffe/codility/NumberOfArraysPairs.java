//@author wycliffe
package com.wycliffe.codility;

public class NumberOfArraysPairs {

    public static void main(String args[]) {
        int[] array = {4,5,6,1,2,5,4,8,9,1,2,4,7,8,9,6,2,3,1,2,3};
        

        NumberOfArraysPairs obj = new NumberOfArraysPairs();
        obj.solution(array);
    }

    public int solution(int[] A) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int k = i + 1; k < A.length; k++) {
                int firstElement = A[i];
                int secondElement = A[k];
                if (firstElement == secondElement) {
                    count++;
                }
                System.out.printf("Pairs are: %d and %d", firstElement , secondElement );
                if(firstElement==secondElement){
                    System.out.println("*" );
                }
                System.out.printf("%n");
            }

        }
        System.out.printf("Number of pairs: %d%n", count);
        return count;
    }
}
