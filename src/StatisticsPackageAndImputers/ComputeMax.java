package StatisticsPackageAndImputers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputeMax {
    //Statistics package and imputers
    public static void getMax(List<List<String>> List,int a){
    double max = Integer.MIN_VALUE;
    for (int i=1;i<List.size();i++){
        if(Double.parseDouble(List.get(i).get(a-1)) > max){
            max = Double.parseDouble(List.get(i).get(a-1));
        }
    }
        System.out.println("The maximium number of this column = " + max);
    }   
}
