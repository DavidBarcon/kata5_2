/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correoskata4.view;

import correoskata4.model.Histogram;
import org.jfree.ui.ApplicationFrame;
import java.awt.Container;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class HistogramDisplay extends ApplicationFrame{
    
    private final Histogram<String> histogram;
    
    public HistogramDisplay(String title, Histogram histogram) {
        super(title);
        this.histogram = histogram;
        this.setContentPane(createPanel());
        this.pack();       
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataset){
        JFreeChart chart = ChartFactory.createBarChart("JFreeChart Histogram", "email domains", "nº emails", dataset, PlotOrientation.VERTICAL, false, false, rootPaneCheckingEnabled);
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        for(String key : histogram.keySet()){
            dataSet.addValue(histogram.get(key), "", key);
        }
        
        return dataSet;
    }
    
    
   public void execute(){
       this.setVisible(true);
       
   }
    
    
}
