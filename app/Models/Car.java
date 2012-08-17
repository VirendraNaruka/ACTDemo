package Models;

@MongoEntity("collectionName")
public class Car extends MongoModel {

	public String name;
	public String colour;
	public int topSpeed;
	
}