import java.util.*;
public class anagram{
    public static void Anagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            System.out.println("not anagram");
            return;
        }
        else{
          char arr1[] = s1.toCharArray();
          char arr2[] = s2.toCharArray();
          Arrays.sort(arr1);
          Arrays.sort(arr2);
          for(int i = 0; i<s1.length();i++){
            if(arr1[i]!=arr2[i]){
                System.out.println("not anagram");
                return;
            }
          }
        }
        System.out.println("Its an anagram");
    }
   public static void main(String[] args) {
    String s1 = "TEA";
    String s2 = "EAT";
    Anagram(s1, s2);

   }

}