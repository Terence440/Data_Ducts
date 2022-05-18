package manipulate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting {
    //Method (c) sort the rows by the column
    public static void sort(List<List<String>> List,int col){
        //use arratlist firstrow to store header
        List<String> firstrow=new ArrayList<>();
        for (int i=0;i<List.get(0).size();i++){
            firstrow.add(List.get(0).get(i));
        }
        //remove header as header is not needed for sort
        List.remove(0);
        
        
        
        String [] tempo = new String [List.size()];
        
             
           for (int j=0 ; j<List.size () ; j++){
            tempo[j]="";
            for (int i=0;i<List.get(j).size();i++){
                tempo[j]+=List.get(j).get(i);
                if(i==List.get(j).size()-1){
                    break;
                }
                tempo[j]+=",";
            }
            }
        
        
        
        double [] column= new double [List.size ()];
         for (int k=0 ; k<List.size () ; k++)
             column [k] = Double.parseDouble(List.get(k).get(col-1));
        
         
        for(int pass=0; pass<column.length-1; pass++) 
        {
          
            for(int i=0; i<column.length-1-pass; i++)
            {
              if (column[i] > column[i+1])  
                {
                 double hold = column[i];
                 String hold1 = tempo[i];
		 column[i] = column[i+1];  
                 tempo[i] = tempo[i+1];
		 column[i+1] = hold;
                 tempo[i+1] = hold1;
	        
                }
            }
        }
        

        

       
        String [] tempo1;
        for (int j=0 ; j<List.size () ; j++){
           
            tempo1 = tempo[j].split(",");
               for(int k=0; k<tempo1.length ; k++)
                  List.get(j).set(k, tempo1[k]);
               
            }
            
            
            
        
        //add back header
        List.add(0,firstrow);
        //Print out sorted dataframe
        for (int i=0;i<List.size();i++){
            for (int j=0;j<List.get(0).size();j++){
                System.out.printf("%-28s",List.get(i).get(j));
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
