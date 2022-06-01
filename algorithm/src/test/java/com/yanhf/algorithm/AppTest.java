package com.yanhf.algorithm;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

//baiqimin@didichuxing.com对所有人说 (4:12 下午)
//反转英文句子 how old are you为you are old how；
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    public static void main(String[] args) {
        String str="how old are you";
        str= func(str,0,str.length()-1);
        StringBuilder stringBui=new StringBuilder();
        int index=0;
        for (int i=0;i<str.length();i++){
            if(String.valueOf(str.charAt(i))==" "){
                func(str,index,i-1);
                index=i+1;
            }
        }
        System.out.println(str);

    }

    //how old are you
    //uoy old are woh

    public  static String func(String str,int i,int j){
        char[] chars=str.toCharArray();
        while (i<j){
            swap(chars,i,j);
            i++;
            j--;
        }
        return String.valueOf(chars);
    }

    public  static void  swap(char[] arr,int i,int j){

        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
