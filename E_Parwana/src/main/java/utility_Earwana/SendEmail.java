package utility_Earwana;


import java.io.IOException;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;

 

public class SendEmail extends BaseClassA{

    
	public static void SendEmail() throws EmailException, IOException {

        // Create the attachment

        EmailAttachment attachment = new EmailAttachment();

        attachment.setPath(UtilClass.getPFdata("extentReport_path") + ExtentReportGenerator.filename1 + ".html");

        attachment.setDisposition(EmailAttachment.ATTACHMENT);

        attachment.setDescription("MAHADBTTestReport");

        attachment.setName(ExtentReportGenerator.filename1 + ".html");

 

 

 

        MultiPartEmail email = new MultiPartEmail();

        email.setHostName("smtp.office365.com");

        email.setSmtpPort(587);

        email.setStartTLSRequired(true);

        email.setAuthenticator(

                new DefaultAuthenticator(UtilClass.getPFdata("sender"),UtilClass.getPFdata("sender_password")));

 

 

 

        email.setFrom(UtilClass.getPFdata("sender"));

        email.setSubject("Automation test Report: WRD status");

        email.setMsg(

                "Please find WRD status automation test report and failed test case screenshots attached with this email.");

 

 


      //  String[] recipients = { "nisha.soni@mahait.org", "mallikarjun.kopuri@mahait.org"};

        String[] recipients = { "Pooja.Misale@mahait.org"};

 

 

 

        email.addTo(recipients);

 

 

 

        email.attach(attachment);

        email.send();

    }

 

}
   


 