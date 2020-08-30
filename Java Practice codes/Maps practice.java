import java.util.*;

public class Main {

	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<String> teacher = new ArrayList<String>();
        ArrayList<String> computer = new ArrayList<String>();
        
        for(int i = 0 ; i < size ; i++) {
            teacher.add(sc.next());
        }
        
        for(int i = 0 ; i < size ; i++) {
            computer.add(sc.next());
        }
        
        HashMap<String,String> map = new HashMap<>();
        boolean flag = true;
        for(int i = 0; i < size ; i++) {
            
            if(teacher.get(i).equals(computer.get(i))) {
                continue;
            }
            else {
                boolean t = false;
                boolean c = false;
                
                t = teacher.get(i).matches("[0-9]+");
                c = computer.get(i).matches("[0-9]+");
                
                if(t && c)
                {
                    System.out.println("false");
                    flag=false;
                    break;
                }
                else if(t && !c) {
                    if(!map.containsKey(computer.get(i)))
                    { 
                        map.put(computer.get(i),teacher.get(i));
                    }
                    else
                    {
                        if(!map.get(computer.get(i)).equals(teacher.get(i))){
                            System.out.println("false");
                            flag=false;
                    		break;
                        }
                    }
                    
                }
                else if(c && !t) {
                    if(!map.containsKey(teacher.get(i)))
                    { 
                        map.put(teacher.get(i),computer.get(i));
                    }
                    else
                    {
                        if(!map.get(teacher.get(i)).equals(computer.get(i))){
                            System.out.println("false");
                            flag=false;
                    		break;
                        }
                    }
                    
                }
                else if(!c && !t){
                    if(!map.containsKey(teacher.get(i)) &&!map.containsKey(computer.get(i))){
                        continue;
                    }
                    else  if(map.containsKey(teacher.get(i)) &&!map.containsKey(computer.get(i))){
                          map.put(computer.get(i),map.get(teacher.get(i)));
                    }
                    else  if(!map.containsKey(teacher.get(i)) && map.containsKey(computer.get(i))){
                          map.put(teacher.get(i),map.get(computer.get(i)));
                    }
                    else  if(map.containsKey(teacher.get(i)) && map.containsKey(computer.get(i))){
                          if(!map.get(teacher.get(i)).equals(map.get(computer.get(i)))){
                              flag=false;
                              System.out.println("false");
                    		  break;
                          }
                    }
                    
                }
            }
            
            
        }
        if(flag){
            System.out.println("true");
        }
        
	}

}