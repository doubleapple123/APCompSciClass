public class Toyota extends Car {

    public Toyota(String x_S) {
        String[] parsed = x_S.split(",");
        location[0] = Double.parseDouble(parsed[0]);
        location[1] = Double.parseDouble(parsed[1]);
    }
    /*public int getID(){
		return id;
	}
	public void move(double x_val, double y_val){
		location [0] = location [0] + x_val;
		location [1] = location [1] + y_val; 
	}
	public double [] getLoc(){
		return location;
	}*/
}