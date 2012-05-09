/*
 * The MIT License
 *
 * Copyright 2012 Kevin Haring <K.KevinHaring@gmail.com>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
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
 * @author Kevin Haring <K.KevinHaring@gmail.com>
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


