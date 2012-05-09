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

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Kevin Haring <K.KevinHaring@gmail.com>
 */
public class SpeakingInTongues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final String INPUT_FILE_PATH = "input/input.in";
        final String OUTPUT_FILE_PATH = "output/output.out";
        
        Mapper mapper = new Mapper();
        ReadWriteManager manager = new ReadWriteManager();
        Data input = new Data(), output = new Data();
        
        try {
            input = manager.read(INPUT_FILE_PATH);
        } catch (Exception ex) {
            Logger.getLogger(SpeakingInTongues.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        output.setNumberOfLines(input.getNumberOfLines());
        ArrayList<String> inputText = input.getText(), outputText = new ArrayList<String>();
        
        for(int i = 0; i < input.getNumberOfLines(); ++i) {
            String inputString = inputText.get(i), outputString = new String();
            
            outputString += "Case #" + (i + 1) + ": ";
            
            for(int j = 0; j < inputString.length(); ++j) {
                outputString += mapper.translate(inputString.charAt(j));
            } 
            
            outputText.add(outputString);
        }
        
        output.setText(outputText);
        
        try {
            manager.write(OUTPUT_FILE_PATH, output);
        } catch (Exception ex) {
            Logger.getLogger(SpeakingInTongues.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}


