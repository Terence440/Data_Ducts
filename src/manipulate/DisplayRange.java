
package manipulate;

import java.util.List;

public class DisplayRange {
    //Method (b) Method to obtain a subset of DataFrame with range of row or column
    //for row
    public static void rowRange(List<List<String>> List,int a,int b){
        int i=0;
        //Print out header
        while(i==0){
            for (int j=0;j<List.get(0).size();j++){
                System.out.printf("%-28s",List.get(i).get(j));
            }
            System.out.println("");
            i++;
        }
        //Print out the row between the range 
        for (int j=a+1;j<=b;j++){
            for (int k=0;k<List.get(j).size();k++){
                System.out.printf("%-28s",List.get(j).get(k));
            }
            System.out.println("");
        }
        System.out.println("");
    }
    //for column
    public static void colRange(List<List<String>> List,int a,int b){
        //Print out choosen columns
        for (int i=0;i<List.size();i++){
                for (int j=a-1;j<=b-1;j++){
                    if (j==(a-1) || j==(b-1)){
                        System.out.printf("%-28s",List.get(i).get(j));
                    }
                }
                System.out.println("");
            }
    }
}
