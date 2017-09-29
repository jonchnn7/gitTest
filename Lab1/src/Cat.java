
public class Cat {
	private int legs;
	private int weight;
	private String name;
	
	Cat(int l, int w, String n){
		legs = l;
		weight = w;
		name = n;
	}
	
	Cat(String n, int w){
		name = n;
		weight = w;
	}
	Cat(String n, int l){
		name = n;
		legs = l;
	}
	//Big problem because one string, one int could be misinterpreted to be either weight or legs
}

