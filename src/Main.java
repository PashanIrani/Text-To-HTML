
public class Main {
    public static Gui ui;
    public static void main(String[] args) {
        ui = new Gui("Text To HTML - Pashan Irani");
    }
    
    public static String replaceTags(char c, String startTag, String endTag){
        //boolean changedFirst = false;
        
        appendAt(3, ui.getEditorPaneString(),"<b>");
        /*
        if(changedFirst){
            
        } else {
            
        }
        */
        return null;
    }
    
    /**
     * Appends String in a char position.
     * @param pos the position to append newContent in
     * @param s the string to append to
     * @param newContent the content to append
     * @return modified String
     */
    private static String appendAt(int pos, String s, String newContent) {
        String newString = "";
        Boolean done = false;
        for(int i = 0; i < s.length(); i++){
            if(i == pos && !done){
                done = true;
                newString += newContent;
                i--;
            } else {
                newString += s.charAt(i);
            }
        }
        
        
        System.out.println("the  string:::::   " + newString);
        return newString;
    }

}
