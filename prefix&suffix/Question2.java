import java.util.*;
import java.io.*;
public class Question2{
	//solution 1
	// ArrayList<Integer> list=new ArrayList<>();
	// 		Iterator<ArrayList<Integer>> itQuery=queries.iterator();
	// 		Iterator<Integer> itList=list.iterator();
 //        	int xor=0;
	// 		while(itQuery.hasNext()){
	// 			ArrayList<Integer> quList=new ArrayList<>();
	// 			quList=itQuery.next();
	// 			if(quList.get(0)==1){
	// 				list.add((quList.get(1) ^ xor));
	// 			}
	// 			else if(quList.get(0)==2){					
	// 				xor ^=quList.get(1);

	// 			}

	// 		}
 //        	for(int i=0;i<list.size();i++){
	// 					list.set(i,(list.get(i) ^ xor));
						
	// 				}
	// 	// Write your code here
	// 	return list;

	public static ArrayList<Integer> xorQuery(ArrayList<ArrayList<Integer>> queries) {
			//Solution 2
			ArrayList<Integer> list=new ArrayList<>();
			Iterator<ArrayList<Integer>> itQuery=queries.iterator();
			Iterator<Integer> itList=list.iterator();
			while(itQuery.hasNext()){
				ArrayList<Integer> quList=new ArrayList<>();
				quList=itQuery.next();
				if(quList.get(0)==1){
					list.add(quList.get(1));
				}
				else if(quList.get(0)==2){
				
					for(int i=0;i<list.size();i++){
						list.set(i,(list.get(i) ^ quList.get(1)));
						
					}
					

				}

			}
	
		return list;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the no. of queries.");
		int q=Integer.parseInt(rd.readLine());
		ArrayList<ArrayList<Integer>> qur= new ArrayList<>();
		for(int i=0;i<q;i++){
        		ArrayList<Integer> list=new ArrayList<>();
        		System.out.println("Enter querylist "+(i+1)+" .");
				String[] strd1=rd.readLine().split(" ");        	
        		for(int j=0;j<2;j++){
        			
        			list.add(Integer.parseInt(strd1[j]));
				}
					
				qur.add(list);
		}
			
		ArrayList<Integer> result=new ArrayList<>();
		result=xorQuery(qur);
		System.out.println(result); 
	}
}