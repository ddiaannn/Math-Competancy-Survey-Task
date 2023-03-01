public class Marks {

	float marks[];
	int numdata;
	
	//default constructor
	public Marks() {		
	}
	//class constructor
	public Marks(int numdata) {
		this.numdata = numdata;
	}
	
	//getter and setter method
	public void setMarks(int marks, int index) {
		this.marks[index] = marks;
	}
	public float getMarks(int index) {
		return marks[index];
	}
	
	//just an operations
	void createData(){
		float[] marks = new float[numdata];
		for(int i =0; i<numdata; i++) {
			marks[i]=i;			
		}
		this.marks = marks;
	}
	
	float average(){
		float sum =0;
        for (int i=0; i<numdata; i++) {
            sum += marks[i];
            }
        float avg = sum / numdata;
        return avg;
	}
	
	float stanDev(float avg){
		 float sum = 0;
	        float sd;

	        for(int i =0; i< numdata; i++){
	            sum += Math.pow((marks[i]-avg),2);
	        };

	        sd = (float) Math.sqrt(sum/(numdata-1));
	        return sd;
	}
}
