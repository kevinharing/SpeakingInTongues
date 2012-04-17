/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tongues;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kevin
 */
public class Mapper {
        
    private Map mapper = new HashMap<Character, Character>(27);

    public Mapper() {
        this.initialize();
    }

    private void initialize() {

            mapper.put(' ', ' ');
            mapper.put('y', 'a');
            mapper.put('n', 'b');
            mapper.put('f', 'c');
            mapper.put('i', 'd');
            mapper.put('c', 'e');
            mapper.put('w', 'f');
            mapper.put('l', 'g');
            mapper.put('b', 'h');
            mapper.put('k', 'i');
            mapper.put('u', 'j');
            mapper.put('o', 'k');
            mapper.put('m', 'l');
            mapper.put('x', 'm');
            mapper.put('s', 'n');
            mapper.put('e', 'o');
            mapper.put('v', 'p');
            mapper.put('z', 'q');
            mapper.put('p', 'r');
            mapper.put('d', 's');
            mapper.put('r', 't');
            mapper.put('j', 'u');
            mapper.put('g', 'v');
            mapper.put('t', 'w');
            mapper.put('h', 'x');
            mapper.put('a', 'y');
            mapper.put('q', 'z');

    }

    public char translate(char input) {  
        return (Character) mapper.get(input);
    }

}