package repLit_exercise;

import java.util.ArrayList;
import java.util.Arrays;

public class AppendPosSum {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(4,-6,3,-8,0,4,3));

        System.out.println(appendPososSum(list));
    }
public static ArrayList<Integer> appendPososSum(ArrayList<Integer>list){
        ArrayList<Integer>newlist=new ArrayList<>();

        for (Integer each:list){
            if (each>0){
                newlist.add(each);
            }
        }
         Integer sum=0;
        for (Integer each:newlist){
            sum+=each;
        }
        newlist.add(sum);
        return newlist;
}

}
/*
This method should:

Create a new ArrayList of Integers
Add only the positive Integers to the new ArrayList
Sum the positive Integers in the new ArrayList and add the Sum as the last element
For example, if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3), the ArrayList that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3). The original ArrayList should remain unchanged.
 */