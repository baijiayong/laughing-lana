package com.baldurtech;

import java.util.ArrayList;
import java.util.List;
 
public class PrimeNumber
{
    public ArrayList say(Integer i)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        if(i % 2 == 1)
        {
           // System.out.println("null");
           return null;
        }
        
        if(i % 2 == 0){
           
            list.add(new Integer(2));
            list.add(new Integer(i/2));
           
        }
        return list;
    } 
}