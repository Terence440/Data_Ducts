
package knn;

import static manipulate.Sorting.sort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class knnRegressor {
    public static double regressor (List<List<String>> List,int num1,int num2 ){
       
       String [][] classi = new String [2][List.size()-1];
        for (int i=1;i<List.size();i++)
            classi [0][i-1]=List.get(i).get(3);
        for (int i=1;i<List.size();i++)
            classi [1][i-1]=List.get(i).get(4);
        
        int l=num1 , v=num2;
         
        double [] distance = new double [List.size()-1];
        double [] x = new double [List.size()-1];
        double [] y = new double [List.size()-1];
        for(int i=0; i<List.size()-1; i++){ 
            x [i]= Double.parseDouble(classi[0][i]);
            y [i]= Double.parseDouble(classi[1][i]);
            distance [i]= Math.sqrt(Math.pow(x[i]-l, 2) + Math.pow(y[i]-v, 2)) ;
                
        }
        List<List<String>> List1=new ArrayList<>();
            for (int j=1;j<List.size();j++){   
                List1.add(new ArrayList<String>(Arrays.asList(List.get(j).get(2)))); 
            }
           
        List<List<String>> List2=new ArrayList<>();
            for (int j=0;j<List.size()-1;j++){
                List2.add(new ArrayList<String>(Arrays.asList(String.valueOf(distance[j]))));
            }
            
 
        
        for (int i=0;i<List1.size();i++){
            if(List1.size()==List2.size()){
                for(int j=0;j<List2.get(i).size();j++)
                    List1.get(i).add(List1.get(i).size(),List2.get(i).get(j));    
            }
            else
                System.out.println("Error");
                 
        }
                System.out.println();
                
        List1.add(0,Arrays.asList("CGPA","Distance"));
        sort(List1,2);
        
        
        String a = List1.get(1).get(0);
        double a1 = Double.parseDouble(a);
        String b = List1.get(2).get(0);
        double b1 = Double.parseDouble(b);
        String c = List1.get(3).get(0);
        double c1 = Double.parseDouble(c);
        
        double mean_cgpa = (a1+b1+c1)/3;
        return mean_cgpa;
   }
}
