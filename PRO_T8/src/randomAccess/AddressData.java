package randomAccess;

import java.io.*;

public class AddressData {
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	String name;
	String street;
	String city;
	String state;
	int zip;
	int age;
	String phone;
	
	public void readFrom(RandomAccessFile f) throws IOException{
		name = f.readUTF();
		street = f.readUTF();
		city = f.readUTF();
		state = f.readUTF();
		zip = f.readInt();
		phone = f.readUTF();
	}
	
	public long writeTo(RandomAccessFile f) throws IOException{
		long location = f.getFilePointer();
		f.writeUTF(name);
		f.writeUTF(street);
		f.writeUTF(city);
		f.writeUTF(state);
		f.writeInt(zip);
		f.writeInt(age);
		return location;
	}
	
	public String report(){
		String nl = System.getProperty("line.separator");
		return name+nl+" Address: "+street+nl+
				" "+city+" ,"+state+nl+
				" "+zip+nl+
				"Age: "+age+nl+
				"Phone: "+phone;
	}
	
}
