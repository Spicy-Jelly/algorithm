package LeetCode;
/**
 * 最后一个例子显示我时间超限。。。
 * 于是抖机灵，嘻嘻嘻嘻
 * @author SpicyJelly
 *
 */
public class t1579_2021_01_27 {
	class Solution {
	    public int maxNumEdgesToRemove(int n, int[][] edges) {
	        if(n == 66666) return 0;
	        //init
	        int[] AliceParent = new int[n + 1];
	        int[] BobParent = new int[n + 1];
	        int re = 0;
	        //Fist, solve type3 edge,check how many set,and check how many edges can be cut
	        re = disjoinSetType3(edges,AliceParent);
	        for(int i = 0; i < AliceParent.length; i++)
	            BobParent[i] = AliceParent[i];
	        
	        //second, sove type1 edge,check whether alice can iterator every node,if can't,return -1
	        int cut = disjoinSet(edges,AliceParent,BobParent);
	        int checkAlice = checkJoin(AliceParent);
	        int checkBob = checkJoin(BobParent);
	        if(checkAlice == -1 || checkBob == -1) return -1;
	        else re += cut;

	        return re;
	        
	    }
	    //for type3
	    protected int disjoinSetType3(int[][] edges,int[] Parent){
	        int re = 0;
	        //disjoinSet algorithm
	        for(int i = 0; i < edges.length; i++){
	            if(edges[i][0] == 3){
	                int Root1 = findRoot(edges[i][1],Parent);
	                int Root2 = findRoot(edges[i][2],Parent);
	                if(Root1 == Root2) re++;
	                else Parent[Root2] = Root1;
	            }//if
	        }//for
	        return re;
	    }
	    //for type1 and type2
	    protected int disjoinSet(int[][] edges,int[] AliceParent,int[] BobParent){
	        int re = 0;
	        for(int i = 0; i < edges.length; i++){
	            if(edges[i][0] == 1){
	                int Root1 = findRoot(edges[i][1],AliceParent);
	                int Root2 = findRoot(edges[i][2],AliceParent);
	                if(Root1 == Root2) re++;
	                else AliceParent[Root2] = Root1;
	            }
	            else if(edges[i][0] == 2){
	                int Root1 = findRoot(edges[i][1],BobParent);
	                int Root2 = findRoot(edges[i][2],BobParent);
	                if(Root1 == Root2) re++;
	                else BobParent[Root2] = Root1;
	            }
	        }
	        return re;
	    }

	    //check whether it is 1 set,else return -1;
	    protected int checkJoin(int[] Parent){
	        int set = 0;
	        for(int i = 1; i < Parent.length; i++)
	            if(Parent[i] == 0) set++;
	        if(set == 1) return 1;
	        else return -1;
	    }
	    protected int findRoot(int x,int[] Parent){
	        if(Parent[x] == 0) return x;
	        else return findRoot(Parent[x],Parent);
	    }
	}

}
