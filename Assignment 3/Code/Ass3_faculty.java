import java.io.*;
import java.util.Date;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle; 
import org.apache.poi.ss.usermodel.DataFormat; 
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//send http request and extract all text and html tags
import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;
import java.util.*;
public class Crawler{
            static int url_cnt=0;
            static String file = "C:/Users/Admin/Desktop//5thSEM/WEB_TECH/Faculty_aTags.xls";
            static HSSFWorkbook book = new HSSFWorkbook();
            static HSSFSheet sheet = book.createSheet("Faculty_ATags Worksheet");
            static HashSet<String>s=new HashSet<String>();//--hashset for unique urls-- 
            static Queue<String>q=new LinkedList<>();
            static int row_cnt=0;
            static Row row=sheet.createRow(row_cnt);
            static Cell cell;static Cell text;static Cell link;
    public static void fun(String URl,int row_cnt)throws IOException
    {
        Document doc=Jsoup.connect(URl).get();
        Elements urls;
        urls=doc.select("a[href]");
        for(Element url:urls)
        {
            if(!s.contains(url.attr("href")))
            {
                if(url.attr("href").contains("http"))
                {
                    if(url.attr("href").contains("Faculty")||url.attr("href").contains("faculty"))
                    {
                    s.add(url.attr("href"));
                    q.add(url.attr("href"));
                    row_cnt+=1;
                    row=sheet.createRow(row_cnt);
                    text= row.createCell(0);
                    link=row.createCell(1);
                    text.setCellValue(url.text());
                    url_cnt+=1;
                    link.setCellValue(url.attr("href"));
                    }
                }
                else
                {
                    if(url.attr("href").contains("Faculty")||url.attr("href").contains("faculty"))
                    {
                    s.add(URl+url.attr("href"));
                    q.add(URl+url.attr("href"));
                    row_cnt+=1;
                    row=sheet.createRow(row_cnt);
                    text= row.createCell(0);
                    link=row.createCell(1);
                    text.setCellValue(url.text());
                    url_cnt+=1;
                    link.setCellValue(URl+url.attr("href"));
                    }
                    //System.out.println("anchor text"+url.text());
                    //System.out.println("anchor link:"+URl+url.attr("href"));   

                }
            }
            
        }

        
    }
    public static void main(String[]args)throws IOException
    {
        try {
    
                    Cell text=row.createCell(0);
                    Cell link=row.createCell(1);
                    text.setCellValue("Text");
                    link.setCellValue("URLs");
 
             
        String Seedurl;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Seedurl:");
        Seedurl=sc.nextLine();
        Document doc=Jsoup.connect(Seedurl).get();
        int cnt=0;
        Elements urls;
        urls=doc.select("a[href]");
        for(Element url:urls)
        {
            cnt++;
            if(!s.contains(url.attr("href")))
            {
                if(url.attr("href").contains("http"))
                {
                    if(url.attr("href").contains("Faculty")||url.attr("href").contains("faculty"))
                    {
                    s.add(url.attr("href"));
                    q.add(url.attr("href"));
                    row_cnt+=1;
                    row=sheet.createRow(row_cnt);
                    text=row.createCell(0);
                    link=row.createCell(1);
                    text.setCellValue(url.text());
                    url_cnt+=1;
                    link.setCellValue(url.attr("href"));
                }
                }
                else
                {
                    if(url.attr("href").contains("Faculty")||url.attr("href").contains("faculty"))
                   { 
                    s.add(Seedurl+url.attr("href"));
                    q.add(Seedurl+url.attr("href"));

                    row_cnt+=1;
                    row=sheet.createRow(row_cnt);
                    text= row.createCell(0);
                    link=row.createCell(1);
                    text.setCellValue(url.text());
                    url_cnt+=1;
                    link.setCellValue(Seedurl+url.attr("href"));
                }
                }
            }
      }
      
        while(!q.isEmpty()&&url_cnt<=10000)
        {
            cnt++;
        try{
            fun(q.remove(),row_cnt);
        }
        catch(Exception e)
        {

            System.out.println("added!!");break;
        }
        }

        book.write(new FileOutputStream(file));
        book.close();
        }

         catch (IOException e) {
            e.printStackTrace();
        }
    }
}
