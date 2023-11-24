import java.util.*;

class Group{
    public List<List<String>> groupAnagram(String[]s){

        HashMap<String,List<String>> map = new HashMap<>();
        if(s.length == 0 || s==null){
            return new ArrayList<>();
        }

        for(String str: s){
            String frequency_string = findFrequency(str);    //a2b2c1
            if(map.containsKey(frequency_string)){
                map.get(frequency_string).add(str);
            }
            else{
                List<String> temp_list = new ArrayList<>();
                temp_list.add(str);                     //aabbc
                map.put(frequency_string,temp_list);
            }
        }
        return new ArrayList<>(map.values());
    }

    public String findFrequency(String str){
        int arr[] = new int[26];
        for(char ch : str.toCharArray()){
            arr[ch - 'a']++;
        }
        StringBuffer sb = new StringBuffer();
        char c ='a';
        for(int i:arr){
            sb.append(c);
            sb.append(i);
            c++;
        }

        return sb.toString();
    }
}

public class GroupAnagram{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(num);
        String []arr = new String[num];
        System.out.println("Enter the string in array : ");
        for(int i=0;i<num;i++){
          arr[i] = sc.next();  
        }
        Group obj = new Group();
        System.out.println(obj.groupAnagram(arr));
    }
}