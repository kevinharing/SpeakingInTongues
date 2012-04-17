/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tongues;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class ReadWriteManager {
    
    private final static String NEW_LINE = "\n";
    private String fileName;
    private String encoding;
    
    public ReadWriteManager() {
        this.setEncoding("UTF-8");
    }
    
    public Data read(String fileName) throws Exception {
        System.out.println("READING FILE!");
        
        this.setFileName(fileName);
        Data input = new Data();
        Scanner scanner = new Scanner(new FileInputStream(this.getFileName()), this.getEncoding());
        
        try {
            if(scanner.hasNextInt()) {
                input.setNumberOfLines(scanner.nextInt());
                scanner.nextLine();
            } else {
                throw new Exception("Number of lines not set!");
            }
            
            ArrayList<String> text = new ArrayList<String>();
            while(scanner.hasNextLine()) {
                text.add(scanner.nextLine());
            }
            
            input.setText(text);
        } finally {
            scanner.close();
        }
        
        System.out.println("FINISHED READING FILE!");
        return input;
    }
    
    public void write(String fileName, Data output) throws Exception {
        System.out.println("WRITING TO FILE!");
        
        this.setFileName(fileName);
        
        Writer out = new OutputStreamWriter(new FileOutputStream(this.getFileName()), this.getEncoding());
        
        try {
            for(int i = 0; i < output.getNumberOfLines(); ++i) {
                out.write(output.getText().get(i));
                out.write(NEW_LINE);
            }
        } finally {
            out.close();
        }
        
        System.out.println("FINISHED WRITING TO FILE!");
    }
    
    /**
     * @return the fileName
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * @param fileName the fileName to set
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * @return the encoding
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * @param encoding the encoding to set
     */
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }
    
    
    
}


