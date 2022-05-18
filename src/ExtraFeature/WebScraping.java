
package ExtraFeature;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class WebScraping {
    public static void main(String[] args) {
        //get the url to web scrape
        final String url="https://web.archive.org/web/20190104110157/http://shares.telegraph.co.uk/indices/?index=MCX";
        try{
            PrintWriter Out_File_Web=new PrintWriter(new FileOutputStream("C:\\Users\\User\\Documents\\NetBeansProjects\\dataDuct_Final\\Online Source.csv"));
            //header from webpage
            Out_File_Web.print("Epic,Name,Price(p),Change,% Change,30day %,Market Cap(m)");
            final Document sharelist=Jsoup.connect(url).get();
            for (org.jsoup.nodes.Element row : sharelist.select("table.tablesorter.full tr")){
                //write all the element into csv file
                //First column elements
                String epic=row.select("td:nth-of-type(1)").text();
                Out_File_Web.print(epic+",");
                //Second column elements
                String name=row.select("td:nth-of-type(2)").text();
                Out_File_Web.print(name+",");
                //Third column elements
                String tempPrice=row.select("td:nth-of-type(3)").text();
                //take out the comma in the price
                String price=tempPrice.replace(",","");
                Out_File_Web.print(price+",");
                //Fourth column elements
                String change=row.select("td:nth-of-type(4)").text();
                Out_File_Web.print(change+",");
                //Fifth column elements
                String PercentChange=row.select("td:nth-of-type(5)").text();
                Out_File_Web.print(PercentChange+",");
                //Sixth column elements
                String ThirtyDayPercent=row.select("td:nth-of-type(6)").text();
                Out_File_Web.print(ThirtyDayPercent+",");
                //Last column elements
                String tempMarketcap=row.select("td:nth-of-type(7)").text();
                //take out the comma in the market cap
                String Marketcap=tempMarketcap.replace(",","");
                Out_File_Web.print(Marketcap);
                Out_File_Web.println("");
            }
        //close file
        Out_File_Web.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
