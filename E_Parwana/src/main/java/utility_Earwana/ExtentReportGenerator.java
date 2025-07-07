package utility_Earwana;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator extends BaseClassA {

 

    static Date date1 = new Date();

 

    static SimpleDateFormat formatter = new SimpleDateFormat("dd_MMM_yyyy_HH_mm");

 

    // System.out.println();

 

    public static String filename1 = "Maha DBT" + formatter.format(date1);

 

    public static ExtentReports getExtentReport() {

 

        System.out.println(filename1);

 

        try {

            System.out.println(UtilClass.getPFdata("extentReport_path"));

            

        } catch (IOException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

        }

 

        ExtentReports extent = new ExtentReports();

 

        File file;

        

        try {

            file = new File(UtilClass.getPFdata("extentReport_path") + filename1 + ".html");

 

            ExtentSparkReporter sparkReprter = new ExtentSparkReporter(file);

 

            sparkReprter.config().setTheme(Theme.DARK);

 

            sparkReprter.config().setReportName("E_Parwana Project Details");

 

            sparkReprter.config().setDocumentTitle("E_Parwana");

 

            // sparkReprter.config().setCss(null);

 

        

            extent.attachReporter(sparkReprter);

            

        } catch (IOException e) {

            // TODO Auto-generated catch block

            e.printStackTrace();

        }

 

        return extent;

 

    }
}

 
