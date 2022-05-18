package manipulate;

import java.util.ArrayList;
import java.util.List;

public class DropDuplicate {
    //Method (d) check duplicate elements in same column, choose rows to keep and remove duplicate rows
    public static void dropDuplicates(List<List<String>> List,int col,int n){
        List<Integer> duplicate=new ArrayList<>(); 
        boolean gotDup;
        int rowtoberemove;
        //check if there is duplicate in the chosen column
        for (int i=1;i<List.size();i++){
            //set the i row and chosen column as the tobeCheck
            String tobeCheck=List.get(i).get(col-1);
            for (int j=1;j<List.size();j++){
                //Compare tobeCheck with the element in the chosen column for every row 
                if(tobeCheck.equals(List.get(j).get(col-1))){
                    //duplicate Arraylist save the index of the row if it is equal
                    duplicate.add(j);
                }
            }
            //if duplicate arraylist is more than 1,there is duplicate
            if (duplicate.size()>1){
                gotDup=true;
            }
            //else no duplicate,clear the element in duplicate arraylist
            else{
                gotDup=false;
                duplicate.clear();
            }
            //if there is duplicate,remove the unwanted duplicate row,then clear duplicate arraylist
            if (gotDup){
                for(int k=duplicate.size()-1;k>=0;k--){
                    if (k!=(n-1)){
                        rowtoberemove=duplicate.get(k);
                        List.remove(rowtoberemove);
                    }
                }
                duplicate.clear();
            }
        } 
        //Print out the dataframe after checking and dropping duplicate
        for (int i=0;i<List.size();i++){
            for (int j=0;j<List.get(0).size();j++){
                System.out.printf("%-28s",List.get(i).get(j));
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
