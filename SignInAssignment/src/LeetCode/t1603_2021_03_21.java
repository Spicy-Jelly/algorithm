package LeetCode;

public class t1603_2021_03_21 {
	class ParkingSystem {
	    private int[] current;
	    private int[] parkinglot;
	    public ParkingSystem(int big, int medium, int small) {
	        current = new int[4];
	        parkinglot = new int[4];
	        parkinglot[1] = big;
	        parkinglot[2] = medium;
	        parkinglot[3] = small;
	    }
	    
	    public boolean addCar(int carType) {
	        if(current[carType] == parkinglot[carType]) return false;
	        else{
	            current[carType]++;
	            return true;
	        }
	    }
	}

	/**
	 * Your ParkingSystem object will be instantiated and called as such:
	 * ParkingSystem obj = new ParkingSystem(big, medium, small);
	 * boolean param_1 = obj.addCar(carType);
	 */
}
