/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tongues;

import java.util.ArrayList;

/**
 *
 * @author Kevin
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
