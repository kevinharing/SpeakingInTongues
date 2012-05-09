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

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Kevin Haring <K.KevinHaring@gmail.com>
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