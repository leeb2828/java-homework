public class PersonalInformation {
    String name;
    String address;
    int age;
    int phone_number;

    public PersonalInformation(String input_name) {
        name = input_name;
    }

    public PersonalInformation(String name, String address, int age, int phone_number) {
        this.name = name;
        this.address = address;
        this.age  = age;
        this.phone_number = phone_number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setPhoneNumber(int phone_number) {
        this.phone_number = phone_number;
    }
    
    public int getPhoneNumber() {
        return this.phone_number;
    }

    // Display all information
    public void displayEntireInfo() {
        System.out.printf("Name: %s  Age: %d  Phone Number: %d\n", this.name, this.age, this.phone_number);
        System.out.printf("Address: %s\n", this.address);
    }
}