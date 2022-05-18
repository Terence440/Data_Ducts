
package Scalers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxScaling {
    public static void getMinMaxScaling(List<List<String>> List,int a){
        ArrayList<String> column = new ArrayList<String>();
        for (int i=1;i<List.size();i++){
                column.add(List.get(i).get(a-1));
        }
        
        Collections.sort(column);
        
        double Q1 = Double.parseDouble(column.get(0));
        double Q2 = Double.parseDouble(column.get(column.size()-1));
        
        double range = 0;
        range = Q2 - Q1;
        
        ArrayList<Double> scaling = new ArrayList<Double>();
        for(int i=0; i<column.size(); i++){
            scaling.add(( Double.parseDouble(column.get(i)) - Q1 )/ range);
        }
        System.out.println("Min Max Scaling");
         System.out.println(scaling);
     }
}
