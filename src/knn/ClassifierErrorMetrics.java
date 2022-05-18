
package knn;
public class ClassifierErrorMetrics {
    //Method to calculate JaccardIndex
    public static void JaccardIndex(String[]m,String[]n,int a){
       int count=0;
       double accuracy=0;
       for(int i=0;i<a;i++){
       if(m[i].equalsIgnoreCase(n[i])){
          count++; 
       }
       }
       accuracy=((double)count/(a+a-count));
       System.out.printf("Jaccard Index : %.2f", accuracy);
       System.out.println("");
   }
   
//Method to calculate F1 score
    public static void F1_score(String[]m,String[]n,int a){
       //F1_score for Artificial Intelligence 
        int count_TP_AI=0,count_FN_AI=0,count_FP_AI=0,count_TN_AI=0,count_AI=0;
        double F1_score_AI=0,F1_score1_AI=0;
        double precision_AI,precision1_AI;
        double recall_AI,recall1_AI;
        for(int i=0;i<a;i++){
            if(m[i].equalsIgnoreCase("Artificial Intelligence") && n[i].equalsIgnoreCase("Artificial Intelligence")){
                count_TP_AI++; 
            }
            else if(!m[i].equalsIgnoreCase("Artificial Intelligence") && n[i].equalsIgnoreCase("Artificial Intelligence")){
                count_FN_AI++;
            }
            else if(m[i].equalsIgnoreCase("Artificial Intelligence") && !n[i].equalsIgnoreCase("Artificial Intelligence")){
                count_FP_AI++;
            }
            else if(!m[i].equalsIgnoreCase("Artificial Intelligence") && !n[i].equalsIgnoreCase("Artificial Intelligence")){
                count_TN_AI++;
            }
            else{
                count_AI=0;
            }
        }
       
        precision_AI=(double)count_TP_AI/(count_TP_AI+count_FP_AI);
        precision1_AI=(double)count_TN_AI/(count_TN_AI+count_FN_AI);
        recall_AI=(double)count_TP_AI/(count_TP_AI+count_FN_AI);
        recall1_AI=(double)count_TN_AI/(count_TN_AI+count_FP_AI);
        F1_score_AI=2.0*(precision_AI*recall_AI)/(precision_AI+recall_AI);
        F1_score1_AI=2.0*(precision1_AI*recall1_AI)/(precision1_AI+recall1_AI);
        System.out.println("                                   precision\t\trecall\t\tF1_score");
        System.out.printf("Not Artificial Intelligence\t\t%.2f\t\t %.2f\t\t  %.2f",precision1_AI,recall1_AI,F1_score1_AI);
        System.out.println("");
        System.out.printf("Artificial Intelligence\t\t%.2f\t\t %.2f\t\t  %.2f",precision_AI,recall_AI,F1_score_AI);
        System.out.println("");
        System.out.printf("Average F1 score of Artificial Intelligence : %.2f",(precision_AI+precision1_AI)/2);
        System.out.println("\n");
       
        //F1_score for Software Engineering
        int count_TP_SE=0,count_FN_SE=0,count_FP_SE=0,count_TN_SE=0,count_SE=0;
        double F1_score_SE=0,F1_score1_SE=0;
        double precision_SE,precision1_SE;
        double recall_SE,recall1_SE;
        for(int i=0;i<a;i++){
            if(m[i].equalsIgnoreCase("Software Engineering") && n[i].equalsIgnoreCase("Software Engineering")){
                count_TP_SE++; 
            }
            else if(!m[i].equalsIgnoreCase("Software Engineering") && n[i].equalsIgnoreCase("Software Engineering")){
                count_FN_SE++;
            }
            else if(m[i].equalsIgnoreCase("Software Engineering") && !n[i].equalsIgnoreCase("Software Engineering")){
                count_FP_SE++;
            }
            else if(!m[i].equalsIgnoreCase("Software Engineering") && !n[i].equalsIgnoreCase("Software Engineering")){
                count_TN_SE++;
            }
            else{
                count_SE=0;
            }
        }
       
        precision_SE=(double)count_TP_SE/(count_TP_SE+count_FP_SE);
        precision1_SE=(double)count_TN_SE/(count_TN_SE+count_FN_SE);
        recall_SE=(double)count_TP_SE/(count_TP_SE+count_FN_SE);
        recall1_SE=(double)count_TN_SE/(count_TN_SE+count_FP_SE);
        F1_score_SE=2.0*(precision_SE*recall_SE)/(precision_SE+recall_SE);
        F1_score1_SE=2.0*(precision1_SE*recall1_SE)/(precision1_SE+recall1_SE);
        System.out.println("                                   precision\t\trecall\t\tF1_score");
        System.out.printf("Not Software Engineering\t\t%.2f\t\t %.2f\t\t  %.2f",precision1_SE,recall1_SE,F1_score1_SE);
        System.out.println("");
        System.out.printf("Software Engineering    \t\t%.2f\t\t %.2f\t\t  %.2f",precision_SE,recall_SE,F1_score_SE);
        System.out.println("");
        System.out.printf("Average F1 score of Software Engineering : %.2f",(precision_SE+precision1_SE)/2);
        System.out.println("\n");
       
       
        //F1_score for Information Systems
        int count_TP_IS=0,count_FN_IS=0,count_FP_IS=0,count_TN_IS=0,count_IS=0;
        double F1_score_IS=0,F1_score1_IS=0;
        double precision_IS,precision1_IS;
        double recall_IS,recall1_IS;
        for(int i=0;i<a;i++){
            if(m[i].equalsIgnoreCase("Information Systems") && n[i].equalsIgnoreCase("Information Systems")){
                count_TP_IS++; 
            }
            else if(!m[i].equalsIgnoreCase("Information Systems") && n[i].equalsIgnoreCase("Information Systems")){
                count_FN_IS++;
            }
            else if(m[i].equalsIgnoreCase("Information Systems") && !n[i].equalsIgnoreCase("Information Systems")){
                count_FP_IS++;
            }
            else if(!m[i].equalsIgnoreCase("Information Systems") && !n[i].equalsIgnoreCase("Information Systems")){
                count_TN_IS++;
            }
            else{
                count_IS=0;
            }
        }
       
        precision_IS=(double)count_TP_IS/(count_TP_IS+count_FP_IS);
        precision1_IS=(double)count_TN_IS/(count_TN_IS+count_FN_IS);
        recall_IS=(double)count_TP_IS/(count_TP_IS+count_FN_IS);
        recall1_IS=(double)count_TN_IS/(count_TN_IS+count_FP_IS);
        F1_score_IS=2.0*(precision_IS*recall_IS)/(precision_IS+recall_IS);
        F1_score1_IS=2.0*(precision1_IS*recall1_IS)/(precision1_IS+recall1_IS);
        System.out.println("                                   precision\t\trecall\t\tF1_score");
        System.out.printf("Not Information Systems\t\t%.2f\t\t %.2f\t\t  %.2f",precision1_IS,recall1_IS,F1_score1_IS);
        System.out.println("");
        System.out.printf("Information Systems    \t\t%.2f\t\t %.2f\t\t  %.2f",precision_IS,recall_IS,F1_score_IS);
        System.out.println("");
        System.out.printf("Average F1 score of Information Systems : %.2f",(precision_IS+precision1_IS)/2);
        System.out.println("\n");

    }
}
