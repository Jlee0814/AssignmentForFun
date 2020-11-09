package Collections;

import java.util.HashMap;
import java.util.Map;


public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        int count=0;
        for(Object o:map.keySet()){
            if(value.equals(map.get(o))){
                count++;
            }
        }
        Object[] obj = new Object[count];
        int i=0;
        for(Object o:map.keySet()){
            if(value.equals(map.get(o))){
                obj[i]=o;
                i++;
            }
        }
        return obj;
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        if(size==0)
            return map;
        map.put(1,1);
        if(size==1) return map;
        map.put(2,1);
        if(size==2) return map;
        for(int i=3;i<=size;i++){
            map.put(i,map.get(i-1)+map.get(i-2));
        }
        return map;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        if(size==0)
            return map;
        map.put(1,first);
        if(size==1)
            return map;
        map.put(2,second);
        if(size==2)
            return map;
        for(int i=3;i<=size;i++){
            map.put(i,map.get(i-1)+map.get(i-2));
        }
        return map;
    }
}
