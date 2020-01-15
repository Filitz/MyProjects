
public class Dog {

	private String _name; // dog's name
	private int _size; // dog's size in cm
	
	// default constructor
	public Dog() {}; 
	
	// constructor that receives name and size of the dog
	public Dog(String name, int size) {
		_name = name;
		_size = size;
	}	
	
	// Getters of the size and name
	public int getSize() {
		return _size;
	}	
	public String getName() {
		return _name;
	}
	
	// Setters for the name and size	
	public void setName(String newName) {
		_name = newName;
	}	
	public void setSize(int newSize) {
		_size = newSize;
	}
		
}
