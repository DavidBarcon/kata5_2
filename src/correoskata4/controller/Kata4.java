/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correoskata4.controller;

import correoskata4.model.Histogram;
import correoskata4.view.HistogramDisplay;
import correoskata4.model.Mail;
import correoskata4.view.MailHistogramBuilder;
import correoskata4.view.MailListReader;
import java.util.List;

/**
 *
 * @author david
 */
public class Kata4 {
    
    public static void main(String[] args) {
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
                
        HistogramDisplay histoDisplay = new HistogramDisplay("title", histogram);
        histoDisplay.execute();
        
    }
}
