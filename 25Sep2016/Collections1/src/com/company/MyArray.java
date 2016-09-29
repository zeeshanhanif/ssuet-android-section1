package com.company;

/**
 * Created by zeeshanhanif-pc on 9/25/2016.
 */
public class MyArray {

    private int arr[];
    private int index;
    public MyArray(){
        arr = new int[3];
    }

    public void add(int value){
        if(index == arr.length){
            int temp[] = new int[arr.length*2];
            for(int i = 0;i<arr.length;i++){
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[index] = value;
        index++;
        System.out.println(arr.length);
    }
}
