package com.example;

public class Solution {

    public static void main(String[] args) {
        String pcr = new String("ab");
        String ccc = new String("pqrs");
        System.out.println(mergeAlternately(pcr,ccc));
    }

    public static String mergeAlternately(String word1, String word2){

        String[] array1 = word1.split("");
        String[] array2 = word2.split("");
        StringBuilder stringBuilder = new StringBuilder();

        if(array1.length==array2.length){
            for(int i=0;i<array1.length;i++){
                stringBuilder.append(array1[i]+" ");
                stringBuilder.append(array2[i]+" ");
            }
            return stringBuilder.toString();
        }

        if(array1.length>array2.length){
            for(int i=0;i<array2.length;i++){
                stringBuilder.append(array1[i]+" ");
                stringBuilder.append(array2[i]+" ");
            }
            stringBuilder.append(array1[array2.length]+"   ");
            if(array1.length-array2.length>1){
                for(int q=array2.length+1;q< array1.length;q++){
                    stringBuilder.append(array1[q]+"   ");
                }
            }
            return stringBuilder.toString();
        }

        if (array1.length<array2.length){
            for(int i=0;i<array1.length;i++){
                stringBuilder.append(array1[i]+" ");
                stringBuilder.append(array2[i]+" ");
            }
            stringBuilder.append("  "+array2[array1.length]+"   ");
            if(array2.length-array1.length>1){
                for(int q=array1.length+1;q< array2.length;q++){
                    stringBuilder.append(array2[q]+"   ");
                }
            }
            return stringBuilder.toString();
        }
            return null;
    }
}
