
package lexicalanalyzer;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author pratik
 */
public class LexicalAnalyzer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int nav=1;
        String str[]=new String[20];
        int j=0,i=0;
        String strng[]=new String[20];
        String alpha="a b c d e f g h i j k l m n o p q r s t u v w x y z a s A B C D E F G H I J K L M N O P Q R S T U V W X Y Z " ;
        String alphabets[]=alpha.split("");
        String num="0,1,2,3,4,5,6,7,8,9";
        String numbers[]=num.split("");
        
        System.out.println("enter an expression ");
        Scanner sobj=new Scanner(System.in);
        String s= sobj.nextLine();
        StringTokenizer st=new StringTokenizer(s);
        
        while(st.hasMoreElements()){
            str[j]=(String) st.nextElement();
                 //System.out.println("the next token is "+str[j]);
            j++;
        }String c;
        while( str[i]!=null){
            c =Character.toString(str[i].charAt(0));
             i++;
         int len=c.length();
            for(int t=0;t<109;t++){
                if(c.equals(alphabets[t])){
                strng[nav]="id,(id)";
                nav++;}}
         
        for(int k=0;k<10;k++){
        if(c.equals(numbers[k])){
        strng[nav]="id,(id)";nav++;
        }
        while()       
        }
                
    }
}
}