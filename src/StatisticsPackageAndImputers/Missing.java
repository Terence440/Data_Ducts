
package StatisticsPackageAndImputers;

import java.util.List;


public class Missing {
    public static void fillinmissing(List<List<String>>list, int column, String value){
        for(int i=0;i<list.size();i++){
            if(list.get(i).get(column).isBlank()){
                list.get(i).set(column,value);
            }
        }
        System.out.println("");
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<list.get(0).size(); j++){
                System.out.printf("%-28s",list.get(i).get(j));
            }
            System.out.println("");
        }
    }
}
