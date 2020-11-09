package DansDilemma;

import java.util.HashSet;
import java.util.Set;

public class DansDilemma {

    public Integer dilemmaOfTwo(Double input1, Double input2) {
        Set<Double> set = new HashSet<Double>();

        set.add(input1-input2);
        set.add(input1*input2);
        set.add(input1+input2);
        if(input2!=0)
        set.add(input1/input2);

        set.add(input2-input1);
        if(input1!=0)
        set.add(input2/input1);

        return set.size();
    }

    public Integer dilemmaOfThree(Double input1, Double input2, Double input3) {
        double[] arr = new double[3];
        arr[0]=input1;
        arr[1]=input2;
        arr[2]=input3;
        Set<Double> set = new HashSet<Double>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                set.add(arr[i]-arr[j]);
                set.add(arr[i]*arr[j]);
                if(arr[j]!=0)
                    set.add(arr[i]/arr[j]);
                set.add(arr[i]+arr[j]);


                set.add(arr[j]-arr[i]);
                if(arr[i]!=0)
                    set.add(arr[j]/arr[i]);

            }
        }
        return set.size();
    }

    public Integer dilemmaOfN(Double... args){
        Set<Double> set = new HashSet<Double>();
        for(int i=0;i<args.length;i++){
            for(int j=i+1;j<args.length;j++){
                set.add(args[i]-args[j]);
                set.add(args[i]*args[j]);
                if(args[j]!=0)
                set.add(args[i]/args[j]);
                set.add(args[i]+args[j]);


                set.add(args[j]-args[i]);
                if(args[i]!=0)
                set.add(args[j]/args[i]);

            }
        }
        return set.size();
    }
}
