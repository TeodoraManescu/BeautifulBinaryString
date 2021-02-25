 package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //String b="0101010";
        //String b="01100";
       // String b = "0100101010";
        //String b="100110110011111101110100011011101000011010111001001011010010110010111011100000000100011111100101010";
        String b="0101000010011100111110011000001000100101100010000011010111111101110110001110111110110101001011";

        StringBuffer bBuff = new StringBuffer(b);
        int numberOfStep=0;
        for(int i=2; i<bBuff.length(); i++){
            if(i>2){
                if(bBuff.charAt(i)=='0' && bBuff.charAt(i-1)=='1' && bBuff.charAt(i-2)=='0'){
                    bBuff.setCharAt(i, '1');
                    numberOfStep++;
                }
            }else if(bBuff.charAt(0)=='0' && bBuff.charAt(1)=='1' && bBuff.charAt(2)=='0'){
                bBuff.setCharAt(i, '1');
                numberOfStep++;
            }
        }
        System.out.println(bBuff);
        System.out.println(numberOfStep);

    }
}
