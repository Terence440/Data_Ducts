
package knn;
public class RegressorErrorMetrics {
    public static void MeanAbsoluteError(Double [] y1,Double[] y2,int n){
        double sum=0;
        //use for loop to get sum of |y1-y2|
        for (int i=0;i<y1.length;i++){
            sum+=Math.abs(y1[i]-y2[i]);
        }
        //formula for MAE is summation of |y1-y2| divide by number of data
        double MAE=sum/n;
        System.out.printf("Mean Absolute Error = %.2f ",MAE);
    }
    public static void RootMeanSquaredError(Double[] y1,Double[] y2,int n){
        double squaresum=0;
        //use for loop to find sum of square of (y1-y2)
        for (int i=0;i<y1.length;i++){
            squaresum+=Math.pow((y1[i]-y2[i]),2);
        }
        //formula for RMSE is squareroot of sum of square of (y1-y2) divide by number of data 
        double RMSE=Math.sqrt(squaresum/n);
        System.out.printf("Root Mean Squared Error = %.2f \n",RMSE);
    }
}
