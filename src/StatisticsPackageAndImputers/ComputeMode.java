
package StatisticsPackageAndImputers;

import java.util.ArrayList;
import java.util.List;

public class ComputeMode {
    public static void getMode(List<List<String>> List,int a){
        ArrayList<String> column = new ArrayList<String>();
        for (int i=1;i<List.size();i++){
            column.add(List.get(i).get(a-1));
        }
        
        String m = "";
        int[] count = new int[column.size()];
        for(int i=0; i<column.size(); i++){
            m = column.get(i);
            for(int j=i; j<column.size(); j++){
            if(column.get(j).equalsIgnoreCase(m)){
                count[i]++;
            }
            else{}
        }
        }
        
        int mode = 0;
        int k = count[0];
        for(int i=1; i<column.size(); i++){
            if(count[i] > k){
                k = count[i];
                mode = i;
            }
        }
        if(k>1){
            System.out.println("The mode of this column is " + column.get(mode));
        } else{
            System.out.println("There is no mode.");
        }
    }
}
