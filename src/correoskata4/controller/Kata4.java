
package correoskata4.controller;

import correoskata4.model.Histogram;
import correoskata4.view.HistogramDisplay;
import correoskata4.model.Mail;
import correoskata4.view.MailHistogramBuilder;
import correoskata4.view.MailListReaderBD;
import java.sql.SQLException;
import java.util.List;


public class Kata4 {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        
        List<Mail> mailList = MailListReaderBD.read();

        Histogram<String> histogram = MailHistogramBuilder.build(mailList);       
        HistogramDisplay histoDisplay = new HistogramDisplay("title", histogram);
        histoDisplay.execute();
        
    }
}
