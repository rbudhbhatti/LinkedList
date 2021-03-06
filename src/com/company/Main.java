package com.company;

import java.util.Hashtable;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(1);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(7);

        System.out.println("Remove duplicate from linked list" + removeDup(list));
        System.out.println("Remove dups w/o buffer" + removeDupNoBuffer(list));
    }

    private static LinkedList removeDupNoBuffer(LinkedList list) {
        int i=0;
        Object temp;
        int length= list.size();
        for(i=0;i<length;i++){
            temp = list.get(i);
            for(int j=i+1;j<length;j++){
               if (temp == list.get(j)){
                   list.remove(j);
               }
            }
        }
        return list;
    }

    private static LinkedList removeDup(LinkedList list) {
        Hashtable table = new Hashtable();
        int i=0;
        int length = list.size();
        //System.out.print(list.get(i));
        while(i<list.size()){
            Object a = list.get(i);
            if(table.containsKey(a)){
                list.remove(i);
            }else
            {
                table.put(list.get(i),true);
                i++;
            }
        }
        return list;
    }
}
