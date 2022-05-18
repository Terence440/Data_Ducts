
package manipulate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Concatenate {
    //Method (a) Method to concatenate DataFrames
    //Column concatenation
    public static void columnConcatenation(List<List<String>> List1,
                                           List<List<String>> List2){
        stop :
        //for loop to add the new column element to each row
        for (int i=0;i<List1.size();i++){
            //check if both size are match
            if(List1.size()==List2.size()){
                for(int j=0;j<List2.get(i).size();j++){
                    //if size matches add the a new column to the dataframe
                    List1.get(i).add(List1.get(i).size(),List2.get(i).get(j));
                }
            }
            //show error if size not match and break the for loop 
            else{
                System.out.println("Error.Size not match.");
                break stop;
            }
        }
    }
    
    //Row Concatenation
    public static void rowConcatenation(List<List<String>> List1,
                                           List<String> List2){
        //check if both size match
        if(List1.get(0).size()==List2.size()){
            //if match, add new row to the dataframe
            List1.add(List2);
        }
        //show error if size not match and break the for loop 
        else{
            System.out.println("Error.Size not match.");
        }
    }   
}
