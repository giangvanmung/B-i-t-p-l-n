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
import java.io.File;
import java.util.Scanner;
public class DictionaryManagement extends Dictionary {
    static final Scanner input = new Scanner(System.in);
    // ham nhap vao tu moi
    //public void insertFromCommandline(){
//        int soTu;
//        System.out.println("Nhap vao so luong tu dien cua ban: ");
//        Scanner input = new Scanner(System.in);
//        soTu = Integer.parseInt(input.nextLine());
//                
//        for(int i = 1; i <= soTu; i++){
//            System.out.println("Nhap vao tu moi: ");
//            words.setSpell(input.nextLine());
//           System.out.println("Nhap vao nghia cua tu: ");
//            words.setExplain(input.nextLine());
//        }
//       
//    }
    public void insertFromFile(){
        File file = new File("C:\\Users\\84122\\Desktop\\DictionaryAnhViet\\src\\dictionaryanhviet\\tudien.txt");
        
        try(Scanner sc = new Scanner(file)) {
            int i = 0;
            while(sc.hasNext()){
               word_spell[i] = sc.next();
               word_explain[i] = sc.nextLine();
               i++;
            }
            numWord = i;
        } catch (Exception e){
        }
    }
    // tra cuu tu dien
    public void dictionaryLookup(){
        int count = 0;
        @SuppressWarnings("UnusedAssignment")
        String keyWord = new String();
        System.out.println("Nhap tu can tim");
        keyWord = input.nextLine();
        System.out.println("No"+ "\t|English"+ "\t|Vietnamese");
        for(int i = 0; i < numWord; i++){
            if(word_spell[i].equals(keyWord)){
                count = 1;
                System.out.println((i+1)+"\t"+word_spell[i] +"\t"+word_explain[i]);
                break;
        }
        }
        if(count == 0){
            System.err.println("Khong tim thay tu");
        } 

}
    public void deleteWord(){
        
        String delWord;
        System.out.println("Nhap tu ban muon xoa: ");
        delWord = input.next();
      
        for(int i = 0; i < numWord; i++){
        
            if(word_spell[i].equals(delWord)){
                for(int j = i; j < numWord - 1; j++){
                    word_spell[j] = word_spell[j+1];
                    word_explain[j] = word_explain[j+1];
                }
            }
        }
    }
    public void addWord(){
        String spell;
        System.out.println("Nhap tu: ");
        spell = input.nextLine();
        String explain;
        System.out.println("Nhap nghia: ");
        explain = input.nextLine();
        
    }
    public void editWord(){
        
    }
    

}
        
   
