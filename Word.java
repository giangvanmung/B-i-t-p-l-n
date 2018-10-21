
package dictionaryanhviet;


public class Word {

    /**
     */
    public String word_spell;
    public String word_explain;
    
  
//    public void setSpell(String spell){
//        this.spell = spell;
//    }
//    public String getSpell(){
//        return spell;
//    }
//    public void setExplain(String explain){
//        this.explain = explain;
//    }
//    public String getExplain(){
//        return explain;
//    }
      
}
//public static void insertFromCommandline() {
//        int n;
//        System.out.println("So tu moi can them");
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        sc.nextLine();
//
//        for (int i = 0; i < n; i++) {
//            Word word = new Word();
//            System.out.println("Tieng Anh: ");
//            word.setWord_target(sc.nextLine());
//            System.out.println("Tieng Viet");
//            word.setWord_explain(sc.nextLine());
//            dic.arr.add(word);
//        }
//    }
//
//    public static void insertFromFile() {
//        File file = new File("dictioneries.txt");
//        try {
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            String line = "";
//            while ((line = br.readLine()) != null) {
//                Word word = new Word();
//                String[] w = line.split("\\s", 2);
//                word.setWord_target(w[0]);
//                word.setWord_explain(w[1].trim());
//                dic.arr.add(word);
//            }
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(DictionaryManagement.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(DictionaryManagement.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    public static void addfile(Word w) {
//        try {
//            File file = new File("dictioneries.txt");
//
//            FileReader fr = new FileReader(file);
//            BufferedReader br = new BufferedReader(fr);
//            String line = "";
//            String line1 = "";
//            while ((line = br.readLine()) != null) {
//                line1 += line + "\n";
//            }
//            line1 += w.getWord_target() + "\t" + w.getWord_explain();
//
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
//            bw.write(line1);
//            bw.close();
//            fw.close();
//            dic.arr.add(w);
//
//        } catch (IOException ex) {
//            Logger.getLogger(DictionaryManagement.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    public static void dictionaryLookup() {
//        System.out.println("Nhap tu muon tra: ");
//        String a = new String();
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextLine();
//        System.out.printf("%-5s%-25s%-35s%n", "No", "|English", "|Vietnamese");
//        int dem = 0;
//        for (int i = 0; i < dic.arr.size(); i++) {
//            if (dic.arr.get(i).getWord_target().equals(a)) {
//                dem = 1;
//                System.out.printf("%-5d%-25s%-35s%n", i + 1, "|" + dic.arr.get(i).getWord_target(), "|" + dic.arr.get(i).getWord_explain());
//            }
//        }
//        if (dem == 0) {
//            System.out.println("Khong tim thay!");
//        }
//
//    }

