import java.util.Scanner;
 public class SecretMessage{
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            String input=sc.nextLine();
            System.out.println("you entered :"+input);
            char[] ch=input.toCharArray();
            for(int i=0;i<ch.length;i++){
                if(Character.isLetter(ch[i])) {
                    if(ch[i]>=97 && ch[i]<=122)
                        ch[i]=(char)(122-(int)ch[i]+97);
                    else if(ch[i]>=65 && ch[i]<=90)
                        ch[i]=(char)(90-(int)ch[i]+65);
                }
            }
            System.out.println("The secret messege is :" +new String(ch).toLowerCase());
        }
    }

