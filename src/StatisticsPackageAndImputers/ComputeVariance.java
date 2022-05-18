
package StatisticsPackageAndImputers;

import java.util.List;

public class ComputeVariance {
    public static void getVariance(List<List<String>> List,int a){
    double sum_sq = 0;
    double sum = 0;
    for (int i=1;i<List.size();i++){
        sum_sq += Math.pow(Double.parseDouble(List.get(i).get(a-1)), 2);
        sum += Double.parseDouble(List.get(i).get(a-1)) ;
    }
    double variance = 0 ;
    variance  = (sum_sq - (Math.pow(sum, 2)/(List.size()-1)))/((List.size()-1)-1);
        System.out.printf("The Variance of this column = %.2f\n" , variance);
    }
}
