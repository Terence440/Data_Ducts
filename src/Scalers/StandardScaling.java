
package Scalers;

import java.util.ArrayList;
import java.util.List;

public class StandardScaling {
    public static void getStandardScaling(List<List<String>> List,int a){
        ArrayList<String> column = new ArrayList<String>();
        for (int i=1;i<List.size();i++){
                column.add(List.get(i).get(a-1));
        }

        double sum = 0;
        double sum_sq = 0;
        for (int i=1;i<column.size();i++){
            sum_sq += Math.pow(Double.parseDouble(column.get(i)), 2);
            sum += Double.parseDouble(column.get(i)) ;
        }
                
        double mean  = 0;
        mean = sum / column.size();
        
        double variance = 0 ;
        double std = 0;
        variance  = (sum_sq - (Math.pow(sum, 2)/column.size()))/(column.size()-1);
        std = Math.sqrt(variance);
        
        ArrayList<Double> scaling = new ArrayList<Double>();
        for(int i=0; i<column.size(); i++){
            scaling.add(( Double.parseDouble(column.get(i)) - mean )/ std);
        }
        
        System.out.println("Standard Scaling");
        System.out.println(scaling);
     }
}
