/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionaryanhviet;

/**
 *
 * @author GiangMung
 */
public class DictionaryComandline extends DictionaryManagement{
    
    public void showAllWords(){
        DictionaryManagement DM = new DictionaryManagement();
        System.out.println("No" + "\t|English " + "\t|Vietnamese\n");
        for(int i = 0; i < numWord; i++){
            System.out.println((i+1) + "\t" + word_spell[i]+word_explain[i]);
        }
        
    }
    public void dictionaryBasic(){
        //insertFromCommandline();
        insertFromFile();
        showAllWords();
      
    }
    public void dictionaryAdvanced(){
        insertFromFile();
        showAllWords();
        dictionaryLookup();
        
        
    }
    public static void main(String [] args){
        DictionaryComandline run = new DictionaryComandline();
        run.dictionaryAdvanced();
        run.deleteWord();
        
        
    }
}

    

    
