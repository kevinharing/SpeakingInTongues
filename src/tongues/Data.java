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

/**
 *
 * @author Kevin Haring <K.KevinHaring@gmail.com>
 */
public class Data {
 
    private int numberOfLines;
    private ArrayList<String> text;

    /**
     * @return the numberOfLines
     */
    public int getNumberOfLines() {
        return numberOfLines;
    }

    /**
     * @param numberOfLines the numberOfLines to set
     */
    public void setNumberOfLines(int numberOfLines) {
        this.numberOfLines = numberOfLines;
    }

    /**
     * @return the input
     */
    public ArrayList<String> getText() {
        return text;
    }

    /**
     * @param text the input to set
     */
    public void setText(ArrayList<String> text) {
        this.text = text;
    }
    
    @Override
    public String toString() {
        String output = new String();
        
        for(int i = 0; i < this.getText().size(); ++i) {
            output += this.getText().get(i) + "\n";
        }
        
        return output;
    }
    
}
