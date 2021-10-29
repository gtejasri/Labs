package Lab4.q1;

class Person {
	String name;
	float age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}

}

class Account {

	long AccNum;
	double balance=500;
	Person accHolder;

	public long getAccNum() {
		return AccNum;
	}

	public void setAccNum(long accNum) {
		AccNum = accNum;
	}
}