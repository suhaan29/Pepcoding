
package pepcoding.arrayQ;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
 
public class d {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		char[] s = in.next().toCharArray();
		int[] x = new int[m+1];
		int[] y = new int[m+1];
		for(int i=0; i<m; i++){
			int a = in.nextInt()-1;
			int b = in.nextInt()-1;
			x[i]=a;
			y[i]=b;
		
			
		}
			ArrayList<TreeSet<Integer>> adj = new ArrayList<>();
		int[] incoming = new int[n];
		for(int i=0; i<n; i++)
			adj.add(new TreeSet<Integer>());
		for(int i=0; i<m; i++){
		
			if(!adj.get(x[i]).contains(y[i])){
				adj.get(x[i]).add(y[i]);
				incoming[y[i]]++;
			}
		}
		int[][] dp = new int[n][26];
		for(int i=0; i<n; i++)
			dp[i][s[i]-'a'] = 1;
		
		int best = Integer.MIN_VALUE;
		boolean[] visited = new boolean[n];
		
		
		ArrayDeque<Integer> que = new ArrayDeque<Integer>();
		
		for(int i=0; i<n; i++)
			if(incoming[i] == 0) que.add(i);
		
		while(!que.isEmpty()){
			int cur = que.poll();
			
			visited[cur] = true;
			
			Iterator<Integer> i = adj.get(cur).iterator();
			while(i.hasNext()){
				int next = i.next();
				incoming[next]--;
				
				for(int j=0; j<26; j++){
					dp[next][j] = Math.max(dp[next][j], dp[cur][j] + ((j == (s[next]-'a')) ? 1 : 0));
					best = Math.max(best, dp[next][j]);
				}
				
				if(incoming[next] == 0)
					que.add(next);
			}
		}
 
		boolean cycle = false;
		for(int i=0; i<n; i++){
			if(!visited[i]){
				cycle = true;
			}
		}
		
		System.out.println(best);
	}
}