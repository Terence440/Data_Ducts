package manipulate;

import java.util.List;

public class DropNull {
    //Method (e) if there is a null element remove the row
    public static void dropNull(List<List<String>> List,int col1,int col2){
        //for loop to check every row
        for (int i=0;i<List.size();i++){
            //for loop to check every column
            for(int j=0;j<List.get(i).size();j++){               
                if(List.get(i).get(col1-1)!=null && !List.get(i).get(col1-1).isEmpty() || List.get(i).get(col2-1)!=null && !List.get(i).get(col2-1).isEmpty()){
                }
                //remove that row if the both chosen columns are null on that particular row
                else{
                    List.remove(i);
                    break;
                }
            }
        }
        //Print out dataframe after removing
        for (int i=0;i<List.size();i++){
            for (int j=0;j<List.get(0).size();j++){
                System.out.printf("%-28s",List.get(i).get(j));
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
