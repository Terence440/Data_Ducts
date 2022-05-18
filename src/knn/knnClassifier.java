
package knn;

import static manipulate.Sorting.sort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class knnClassifier {
    public static String classifier (List<List<String>> List, int a, int b){
        
        String [][] classi = new String [2][List.size()-1];
        for (int i=1;i<List.size();i++)
            classi [0][i-1]=List.get(i).get(3);
        for (int i=1;i<List.size();i++)
            classi [1][i-1]=List.get(i).get(4);
  
        int l=a , v=b;
         
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
                List1.add(new ArrayList<String>(Arrays.asList(List.get(j).get(1)))); 
            }
           
        List<List<String>> List2=new ArrayList<>();
            for (int j=0;j<List.size()-1;j++){
                List2.add(new ArrayList<String>(Arrays.asList(String.valueOf(distance[j]))));
            }
        
        for (int i=0;i<List1.size();i++){
            if(List1.size()==List2.size()){
                for(int j=0;j<List2.get(i).size();j++){
                    List1.get(i).add(List1.get(i).size(),List2.get(i).get(j));
                }
            }
            else{
                System.out.println("Error");
            }
        }
        List1.add(0,Arrays.asList("Department","Distance"));
        System.out.println("");
        sort(List1,2);
        int count_AI=0,count_IS=0,count_SE=0;
        for (int i=1;i<=3;i++){
            if(List1.get(i).get(0).equalsIgnoreCase("Artificial Intelligence")){
                count_AI++;
            }
            else if(List1.get(i).get(0).equalsIgnoreCase("Information Systems")){
                count_IS++;
            }
            else if(List1.get(i).get(0).equalsIgnoreCase("Software Engineering")){
                count_SE++;
            }
        }
        String str ="Cannot be predicted (No Mode)";
        if(count_AI>count_IS && count_AI>count_SE){
            str="Artificial Intelligence";
        }
        else if(count_IS>count_AI && count_IS>count_SE){
            str="Information Systems";
        }
        else if(count_SE>count_AI && count_SE>count_IS){
            str="Software Engineering";
        }
        return str;
    }
}
