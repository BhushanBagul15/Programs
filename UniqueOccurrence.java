import java.util.*;
public class UniqueOccurrence {
    public static boolean uniqueOccurrence(int arr[]){
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Set<Integer> set = new HashSet<>();
        for(int i : map.values()){
            set.add(i);
        }
        return map.size() == set.size();
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        for(int i=0; i<n; i++){
            System.out.println("Enter the "+(i+1)+" element of the array :");
            arr[i] = sc.nextInt();
        }
        boolean result = uniqueOccurrence(arr);
        System.out.println("The array has unique occurence : "+result );
    }
}