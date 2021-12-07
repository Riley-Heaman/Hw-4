import java.text.BreakIterator;

//Riley Heaman
//CIS 219 - Tue, Thur @ 3:30PM 
//Mr. Swinarski
//12/6/2021
//"Homework #4: Loops"
public class Main {
    public static void main(String args[]){
        kount(10);
        }

    static void kount(int i){
        if (i != 0){
            System.out.println(i);
            kount(i-1); 
        }
    }
}
