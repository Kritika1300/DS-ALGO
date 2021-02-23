import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Integer[] arr = {4,2,4,5,2,3,1};
	    HashMap<Integer,Integer> h = new HashMap<>();
	    ArrayList<Integer> a = new ArrayList<>();
	    for(int i = 0; i < arr.length; i++){
	        if(!h.containsKey(arr[i])){
	            h.put(arr[i],1);
	        }else{
	           h.put(arr[i], h.get(arr[i])+1);
	        }
	    }
	    for(Map.Entry<Integer,Integer> index : h.entrySet()){
	        int key = index.getKey();
	        int value = index.getValue();
	        if(value == 2){
	            a.add(key);
	        }
	    }
	     	System.out.println(a); 
	
	}
}
