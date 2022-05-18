


import static Scalers.MinMaxScaling.getMinMaxScaling;
import static Scalers.StandardScaling.getStandardScaling;
import static StatisticsPackageAndImputers.ComputeMax.getMax;
import static StatisticsPackageAndImputers.ComputeMean.getMean;
import static StatisticsPackageAndImputers.ComputeMedian.getMedian;
import static StatisticsPackageAndImputers.ComputeMin.getMin;
import static StatisticsPackageAndImputers.ComputeMode.getMode;
import static StatisticsPackageAndImputers.ComputeRange.getRange;
import static StatisticsPackageAndImputers.ComputeStandardDeviation.getStandardDeviation;
import static StatisticsPackageAndImputers.ComputeVariance.getVariance;
import static StatisticsPackageAndImputers.Missing.fillinmissing;
import static knn.ClassifierErrorMetrics.F1_score;
import static knn.ClassifierErrorMetrics.JaccardIndex;
import static knn.knnClassifier.classifier;
import static knn.knnRegressor.regressor;
import static knn.RegressorErrorMetrics.MeanAbsoluteError;
import static knn.RegressorErrorMetrics.RootMeanSquaredError;
import static manipulate.Concatenate.columnConcatenation;
import static manipulate.Concatenate.rowConcatenation;
import static manipulate.DisplayRange.colRange;
import static manipulate.DisplayRange.rowRange;
import static manipulate.DropDuplicate.dropDuplicates;
import static manipulate.DropNull.dropNull;
import static manipulate.SaveFiletoCSV.saveFile;
import static manipulate.Sorting.sort;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class DataDuct {
    public static void main(String[] args) {
        char[] line = new char[160];
        for(int i=0; i<line.length; i++){
            line[i] = '-';
        }
        char[] line2 = new char[160];
        for(int i=0; i<line2.length; i++){
            line2[i] = '=';
        }
        System.out.println(line2);
        
        //Method to save DataFrame to CSV file
        try{
            PrintWriter Out_File=new PrintWriter(new FileOutputStream("C:\\Users\\User\\Documents\\NetBeansProjects\\dataDuct_Final\\Test 1.csv"));
            //2d array initiate data
            String[][] data={{"Name","Department","CurrentCGPA","Expected Graduation Salary","Actual Graduation Salary"},
                             {"Meow","","3.7","","3500"},
                             {"Woof","Software Engineering","2.0","4500","3500"},
                             {"","Information Systems","4.3","8000","3500"},
                             {"Meow","Information Systems","4.1","","3200"},
                             {"GKY","Artificial Intelligence","3.8","","3400"},
                             {"TWC","Artificial Intelligence","2.5","8000","4300"},
                             {"YH","Software Engineering","","4000","3500"},
                             {"GF","Software Engineering","2.5","4000","3400"}
                            };
            //use for loop to input data into file in CSV form
            for (int i=0;i<data.length;i++){
                for (int j=0;j<data[i].length;j++){
                    Out_File.print(data[i][j]);
                    if (j==(data[i].length-1)){
                        break;
                    }
                    Out_File.print(",");
                } 
                Out_File.println("");
            }    
            Out_File.close();
        }catch(IOException e){
            System.out.println("Problem with file output.");
        }
        
        //Method to construct DataFrame from CSV file
        try{
            //call in csv file
            Scanner In_File_0=new Scanner(new FileInputStream("C:\\Users\\User\\Documents\\NetBeansProjects\\dataDuct_Final\\Test 1.csv"));
            //create 2d arraylist to store data
            List<List<String>> StudentList=new ArrayList<>();
            //use for loop to get data to store in 2d arraylist
            for (int i=0;In_File_0.hasNextLine();i++){
                StudentList.add(new ArrayList<String>());
                String[] rowOfElements=In_File_0.nextLine().split(",");
                for (int j=0;j<rowOfElements.length;j++){
                    StudentList.get(i).add(j,rowOfElements[j]);
                }
            }
            //use for loop to print out 2d arraylist elements
            System.out.println("");
            for (int i=0;i<StudentList.size();i++){
                for (int j=0;j<StudentList.get(0).size();j++){
                    System.out.printf("%-28s",StudentList.get(i).get(j));
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println(line2);
            
            //Method to concatenate DataFrames.
            //add new column
            //create 2d Arraylist as the new column needed to add
            List<List<String>> newColumn=new ArrayList<>();
            newColumn.add(new ArrayList<String>(Arrays.asList("WorkPlace")));
            newColumn.add(new ArrayList<String>(Arrays.asList("Intel")));
            newColumn.add(new ArrayList<String>(Arrays.asList("Google")));
            newColumn.add(new ArrayList<String>(Arrays.asList("Microsoft")));
            newColumn.add(new ArrayList<String>(Arrays.asList("Disney")));
            newColumn.add(new ArrayList<String>(Arrays.asList("Amway")));
            newColumn.add(new ArrayList<String>(Arrays.asList("Amway")));
            newColumn.add(new ArrayList<String>(Arrays.asList("Amway")));
            newColumn.add(new ArrayList<String>(Arrays.asList("Amway")));
            //use method to concatenate if axis matches
            columnConcatenation(StudentList,newColumn);
                    
            //add new row
            //create Arraylist as the row needed to add
            List<String> newRow=new ArrayList(Arrays.asList("CXE","Artificial Intelligence","4.0","6000","3000","Amway"));
            List<String> newRow1=new ArrayList(Arrays.asList("TTY","Artificial Intelligence","3.7","5000","3200","Disney"));
            List<String> newRow2=new ArrayList(Arrays.asList("UYI","Information Systems","2.2","8000","3000","Google"));
            //use method to concatenate if axis matches
            rowConcatenation(StudentList,newRow);
            rowConcatenation(StudentList,newRow1);
            rowConcatenation(StudentList,newRow2);
            
            //display Arraylist element after concatenation
            System.out.println("");
            System.out.println("Method to concatenate DataFrames.\n");
            for (int i=0;i<StudentList.size();i++){
                for (int j=0;j<StudentList.get(0).size();j++){
                    System.out.printf("%-28s",StudentList.get(i).get(j));
                }
                System.out.println("");
            }
            System.out.println("");
            
            //Method to obtain a subset of DataFrame with range of row.
            //Print out row in the range given
            //use method to display certain rows (start,end = 1,5)
            System.out.println(line2);
            System.out.println("");
            System.out.println("Method to obtain a subset of DataFrame with range of row.\n");
            rowRange(StudentList,1,5);
            System.out.println(line2);
            
            //Method to obtain a subset of DataFrame with range of column.
            //Print out column in the range given
            //use method to display certain columns (start,end = 1,6)
            System.out.println("");
            System.out.println("Method to obtain a subset of DataFrame with range of column.\n");
            colRange(StudentList,1,6);
            System.out.println("");
            System.out.println(line2);
            
            //Method to remove duplicate rows based on subset of columns.
            //dropDuplicates 
            //use method to remove duplicate and keep the row which user want (check,keep = 1,1)
            System.out.println("");
            System.out.println("Method to remove duplicate rows based on subset of columns.\n");
            dropDuplicates(StudentList,1,1);
            System.out.println(line2);
            
            //Method to remove rows containing missing data in subset of columns.
            //Use dropNull method to remove row and print out the new data
            //user choose 2 specified column to check Null element and remove the row if both are null
            //use method to remove row if both column are null (2,4)
            System.out.println("");
            System.out.println("Method to remove rows containing missing data in subset of columns.\n");
            dropNull(StudentList,2,4);
            System.out.println(line2);
            
            //Method to fill in missing values of specified columns with a specified value.
            //To fill in Missing Values
            System.out.println("\nMethod to fill in missing values of specified columns with a specified value.");
            fillinmissing(StudentList,0,"---MISSING---");
            fillinmissing(StudentList,2,"3.5");
            fillinmissing(StudentList,3,"4200");
            System.out.println("");
            System.out.println(line2);
            
            //Method to sort the rows by a column in the DataFrame.
            //sort the data and print out
            //user choose the column to sort
            //use method to sort (3/4/5)
            System.out.println("");
            System.out.println("Method to sort the rows by a column in the DataFrame.\n");
            sort(StudentList,3);
            System.out.println(line2);
            
            //Method compute Maximum number in the entire column (3/4/5)
            System.out.println("");
            System.out.println("Method compute max, min, mean, variance, standard deviation, median, range of a column and mode.\n");
            getMax(StudentList,3);
            System.out.println(line);
            
            //Method compute Minimum number in the entire column (3/4/5)
            getMin(StudentList,4);
            System.out.println(line);
            
            //Method compute Mean in the entire column (3/4/5)
            getMean(StudentList,3);
            System.out.println(line);
            
            //Method compute Variance in the entire column (3/4/5)
            getVariance(StudentList,3);
            System.out.println(line);
            
            //Method compute Standard Deviation in the entire column (3/4/5)
            getStandardDeviation(StudentList,3);
            System.out.println(line);
            
            //Method compute Median in the entire column (3/4/5)
            getMedian(StudentList,5);
            System.out.println(line);
            
            //Method compute Range in the entire column (3/4/5)
            getRange(StudentList,3);
            System.out.println(line);
            
            //Method compute Mode in the entire column (1/2/3/4/5/6)
            getMode(StudentList,2);
            System.out.println("");
            System.out.println(line2);
            
            //Method to perform Standard Scaling in the entire column (3/4/5)
            System.out.println("\nMethod to perform Standard Scaling.\n");
            getStandardScaling(StudentList,3);
            System.out.println("");
            System.out.println(line);
            
            //Method to perform Min Max Scaling in the entire column (3/4/5)
            System.out.println("\nMethod to perform Min Max Scaling.\n");
            getMinMaxScaling(StudentList,3);
            System.out.println("");
            System.out.println(line2);
            
            //Method to impute values for a column using 3-nn classifier using subset of other columns. (espected salary.actual salary)
            System.out.println("\nMethod to impute values for a column using k-nn classifier using subset of other columns.");
            String predict_department= classifier(StudentList,8000,5000);
            System.out.println("Predicted Department : " + predict_department);
            System.out.println("");
            System.out.println(line2);
            
            //Method to impute values for a column using 3-nn regressor using subset of other columns. (espected salary.actual salary)
            System.out.println("\nMethod to impute values for a column using k-nn regressor using subset of other columns.");
            Double cgpa = regressor(StudentList,7500,6500);
            System.out.println("Predicted CGPA : " + cgpa);
            System.out.println("");
            System.out.println(line2);
            
            //Classifier Error metrics
            // N = total number of data to be interpreted
            int N = 10;
            int []o = {4200,4000,6000,7500,2000,8000,6100,6200,6800,7800}; //store Expected Salary
            int []p = {3600,4000,3100,6000,3000,9000,3100,3200,7700,6100}; //store Actual Salary
            
            //store Actual Department
            String [] actualdepartment = {"Software Engineering","Artificial Intelligence","Artificial Intelligence","Software Engineering",
                                          "Information Systems","Information Systems","Software Engineering","Artificial Intelligence",
                                          "Information Systems","Information Systems"};
            
            //store Predic Department
            String[] predictdepartment=new String[o.length];
            System.out.println("\nError metrics for the classifier.");
            for(int j=0;j<predictdepartment.length;j++){
                //knn classifier
                System.out.println("");
                System.out.print("No. "+(j+1)+" Data ");
                predictdepartment[j]=classifier(StudentList,o[j],p[j]);
                System.out.println("Predicted Department : " + predictdepartment[j]);
                System.out.println("");
                System.out.println(line2);
            }
            
            //Method to perform two error metric for the classifier.
            //Method to calculate JaccardIndex
            System.out.println("");
            System.out.println("Method to perform two error metric for the classifier.\n");
            JaccardIndex(predictdepartment,actualdepartment,predictdepartment.length); 
            System.out.println(line);
            
            //Method to calculate F1_score
            System.out.println("");
            F1_score(predictdepartment,actualdepartment,predictdepartment.length); 
            System.out.println("NaN : answer undefined");
            System.out.println("");
            System.out.println(line2);
            
            
            //KNN regressor Error Metrics
            Double[] predict_cgpa=new Double[o.length];
            Double[] actual_cgpa={2.5,3.6,3.2,2.7,3.5,3.3,3.8,4.0,3.4,3.0};
            System.out.println("\nError metrics for the regressor.");
            for(int i=0;i<predict_cgpa.length;i++){
                //knn regressor
                System.out.println("");
                System.out.print("No. "+(i+1)+" Data ");
                predict_cgpa[i]=regressor(StudentList,o[i],p[i]);
                System.out.printf("Expected CGPA : %.1f\n",predict_cgpa[i]);
                System.out.println("");
                System.out.println(line2);
            }
            
            //Method to perform two error metric for the regressor.
            //calculate mean absolute error
            System.out.println("");
            System.out.println("Method to perform two error metric for the regressor.\n");
            MeanAbsoluteError(actual_cgpa,predict_cgpa,predict_cgpa.length);
            System.out.println("");
            System.out.println(line);
            
            //calculate root mean squared error
            RootMeanSquaredError(actual_cgpa,predict_cgpa,predict_cgpa.length);
            System.out.println("");
            System.out.println(line2);

            //Save the new dataframe to CSV file
            saveFile(StudentList);
            
            In_File_0.close();
        }catch(FileNotFoundException e){
            System.out.println("File was not found.");
        }
    }

}
