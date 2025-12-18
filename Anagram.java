import java.util.*;
public class Anagram {
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        Map<Character,Integer> map = new HashMap<>();
        for(char c : str1.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0; i<str2.length(); i++){
            if(!map.containsKey(str2.charAt(i)) || map.get(str2.charAt(i))==0){
                return false;
            }
            map.put(str2.charAt(i),map.getOrDefault(str2.charAt(i),0)-1);
        }
        return true;
    }
    public static void main(String [] args){
        System.out.println("Enter the first String: ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().toLowerCase();
        System.out.println("Enter the second String: ");
        String str2 = sc.nextLine().toLowerCase();

        boolean ans = isAnagram(str1,str2);
        System.out.println("The given String are Anagram or not : "+ans);
    }
    
}
