
package StatisticsPackageAndImputers;
import java.util.List;

public class ComputeMean {
    public static void getMean(List<List<String>> List,int a){
    double sum = 0;
    for (int i=1;i<List.size();i++){
        sum += Double.parseDouble(List.get(i).get(a-1)) ;
    }
    double mean = 0 ;
    mean  = sum/(List.size()-1);
        System.out.printf("The Mean of this column = %.2f\n" , mean);
    }
}
