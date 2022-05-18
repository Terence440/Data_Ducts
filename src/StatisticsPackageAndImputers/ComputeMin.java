
package StatisticsPackageAndImputers;

import java.util.List;

public class ComputeMin {
    public static void getMin(List<List<String>> List,int a){
    double min = Integer.MAX_VALUE;
    for (int i=1;i<List.size();i++){
        if(Double.parseDouble(List.get(i).get(a-1)) < min){
            min = Double.parseDouble(List.get(i).get(a-1));
        }
    }
        System.out.println("The minimum number of this column = " + min);
    }
}
