
package StatisticsPackageAndImputers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputeRange {
    public static void getRange(List<List<String>> List,int a){
        ArrayList<String> column = new ArrayList<String>();
        for (int i=1;i<List.size();i++){
            column.add(List.get(i).get(a-1));
        }
        
        Collections.sort(column);
        
        double Q1 = Double.parseDouble(column.get(0));
        double Q2 = Double.parseDouble(column.get(column.size()-1));
        
        double range = 0;
        range = Q2 - Q1;
         System.out.println("The range of this column is " + range);
    }
}
