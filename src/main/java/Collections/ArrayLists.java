package Collections;

import java.util.ArrayList;


public class ArrayLists {

    public ArrayList<Integer> addShit(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(int n : list2){
            list1.add(n);
        }
        return list1;
    }

    public Integer addShitTogether(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int sum=0;
        for(int i:list1){
            sum+=i;
        }
        for(int j:list2){
            sum+=j;
        }
        return sum;
    }

    public ArrayList<Integer> removeAll(ArrayList<Integer> original, Integer toRemove) {
        if(toRemove==null)
            return original;
        int size = original.size();
        ArrayList<Integer> list = new ArrayList<Integer>(original);
        for(int i=size-1;i>=0;i--){
            if(list.get(i)==toRemove){
                list.remove(i);
            }
        }
        return list;
    }

    public boolean happyList(ArrayList<String> original) {
        if(original.size()==0||original.size()==1) return true;
        for(int i=1;i<original.size();i++){
            String s = original.get(i-1);
            String t = original.get(i);
            int count = 0;
            for(char c:s.toCharArray()){
                for(char j:t.toCharArray()){
                    if(c==j){
                        count++;
                    }
                }
            }
            if(count==0)
                return false;
        }
        return true;
    }
}
