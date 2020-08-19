
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author trungdbkhe140257
 */
public class Manager {
    
    public Map letterCount(String input){
        Map<String, Integer> letterCounter = new LinkedHashMap<>();
        //break the input string into token    
        StringTokenizer stringToken = new StringTokenizer(input);
        //loop if there is still more token
        while(stringToken.hasMoreTokens()){
            String token = stringToken.nextToken();
            //if map didn't have token, create new
            if(!letterCounter.containsKey(token)){
                letterCounter.put(token, 1);
            }else{
                //else the token existed, add 1 more to token counter
                letterCounter.put(token, ((int) letterCounter.get(token) + 1));
            }
        }
        return letterCounter;
    }
    
    public Map charCount(String input){
        Map<Character, Integer> charCounter = new LinkedHashMap<>();
        // convert string to new character array
        for (char ch : input.toCharArray()) {
            //if the character is space then skip it
            if(Character.isSpaceChar(ch)) continue;
            //if map didn't have that character, create new
            if(!charCounter.containsKey(ch)){
                charCounter.put(ch, 1);
            }else{
                //if the character existed, add 1 more to that character counter
                charCounter.put(ch, ((int) charCounter.get(ch) + 1));
            }
        } 
        return charCounter;
    }
    
    
}
