
package StatisticsPackageAndImputers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputeMedian {
    public static void getMedian(List<List<String>> List,int a){
        ArrayList<String> column = new ArrayList<String>();
        for (int i=1;i<List.size();i++){
            column.add(List.get(i).get(a-1));
        }
        Collections.sort(column);
        
        double middle = column.size()/2;
        
        if (column.size()%2 == 1) {
            middle = Double.parseDouble(column.get( ( (column.size()+1)/2) - 1 ) );
            System.out.println("The median of these data is " + middle);
        } 
        else {
            middle = Double.parseDouble(column.get( ( ( (column.size()/2) + ((column.size()/2)+1) )/2 ) - 1 ) );
            System.out.println("The median of these data is " + middle);
        }
    }
}
