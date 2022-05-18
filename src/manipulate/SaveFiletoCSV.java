
package manipulate;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class SaveFiletoCSV {
    public static void saveFile(List<List<String>> List){
        try{
            PrintWriter Out_File=new PrintWriter(new FileOutputStream("C:\\Users\\User\\Documents\\NetBeansProjects\\Data Duct(Witout User Input)\\Test 2.csv"));
                for (int i=0;i<List.size();i++){
                    for (int j=0;j<List.get(0).size();j++){
                        Out_File.print(List.get(i).get(j));
                        Out_File.print(",");
                    } 
                Out_File.println("");
                }
            Out_File.close();
        }catch(IOException e){
            System.out.println("Problem with file output.");
        }
    }
}
