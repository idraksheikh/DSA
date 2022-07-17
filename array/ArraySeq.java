package array;

import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraySeq{
    public static boolean checkArraySequence(int[] nums){
        Map<Integer,Integer> mapArray=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mapArray.containsKey(nums[i])){
               int  upVal=mapArray.get(nums[i]);
                mapArray.put(nums[i], (upVal+1));
            }
            else{
                mapArray.put(nums[i], 1);
            }
        }
        Set<Integer> setArray=new HashSet<>();
        for(Integer v: mapArray.values()){
            setArray.add(v);
        }
        if(setArray.size()==mapArray.size()){
            return true;
        }
        else{
            return false;
        }

        
        
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scan.nextInt();
        }

        System.out.println(checkArraySequence(arr));

    }
}