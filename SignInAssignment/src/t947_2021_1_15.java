/**
 * ���鼯�㷨
 * ���������ò��鼯�ܰ��й�ϵ�ĵ����ͬһ��������
 * ���㻮��Ϊ��ͬ�Ľ��
 * ɾ�����˸�֮������е㼴��
 * @author asus
 *
 */
public class t947_2021_1_15 {
	class Solution {
	    public int removeStones(int[][] stones) {
	        if(stones.length == 1) return 0; //special occasion
	        //init parent array
	        int[] parent = new int[stones.length];
	        init(parent);
	        for(int i = 0; i < stones.length; i++){ //stone i
	            for(int j = i+1; j < stones.length; j++){ //stone j
	                if(judge(i,j,stones)){ //on the same line
	                    int rooti = findRoot(i,parent);
	                    int rootj = findRoot(j,parent);
	                    if(rooti != rootj) parent[rootj] = rooti;
	                }//if
	            }//for j
	        }//for i
	        int rootSum = findRootSum(parent);
	        return stones.length - rootSum;
	    }

	    private void init(int[] array){
	        for(int i = 0; i < array.length; i++)
	            array[i] = -1;
	    }

	    private boolean judge(int i,int j,int[][] stones){
	        if(stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1])
	            return true;
	        else return false;
	    }

	    private int findRoot(int i,int[] parent){
	        int key = parent[i];
	        if(key == -1) return i;
	        else return findRoot(key,parent);
	    }

	    private int findRootSum(int[] parent){
	        int re = 0;
	        for(int i = 0; i < parent.length; i++)
	            if(parent[i] == -1) re++;
	        return re;
	    }
	}
}
