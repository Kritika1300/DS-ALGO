//https://classroom.codingninjas.com/app/classroom/me/4085/content/60380/offering/670279/problem/7054

import java.util.Scanner;

class Ind {
    int start;
    int end;
}

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();          // 110111
        while(t-->0){                 
            int max = 0;
            int size = sc.nextInt();
            Ind[] subs = new Ind[size];
            int[] banno = new int[size];
            int k = 0;
            for(int i = 0 ; i < size ; i++) {
            	banno[i] = sc.nextInt();
            }
            for(int i = 0 ; i < size ; i++) {
            	if(banno[i]==1){
                    subs[k] = new Ind();
                    subs[k].start = i;
                    while(i<size && banno[i]==1){
                        i++;
                    }
                    subs[k++].end = --i;
                    if(i==size-1){
                        break;
                    }
                }//111000
            }
            for(int i = 0 ; i<k-1;i++){
               if((subs[i+1].start - subs[i].end) <=3){
                   int tmp = (subs[i+1].end-subs[i].start)-1;
                   max = Math.max(max,tmp);
               }
              else{
                  int tmp = subs[i].end - subs[i].start +1;
                  int tmp2 = subs[i+1].end - subs[i+1].start +1;
                   max = Math.max(max,Math.max(tmp,tmp2));
              }
            }
            if(k == 0){
                System.out.println("0");
            }
            else if (k==1){
                System.out.println(subs[0].end - subs[0].start +1);
            }
            else{
                System.out.println(max);
            }
        }
        

	}

}
