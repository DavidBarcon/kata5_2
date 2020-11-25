package correoskata4.view;

import correoskata4.model.Histogram;
import correoskata4.model.Mail;
import java.util.List;

public class MailHistogramBuilder {

    public static Histogram<String> build(List<Mail> mailList) {
        Histogram<String> histogram = new Histogram();
        for (Mail mail : mailList){
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
    
}
