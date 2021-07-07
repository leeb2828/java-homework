public class Main {
    public static void main(String[] args) {
        PersonalInformation myself = new PersonalInformation("Lee");
        myself.setAge(27);
        myself.setAddress("1600 Broad Street");
        myself.setPhoneNumber(8675309);
        myself.displayEntireInfo();

        System.out.println();

        PersonalInformation friend1 = new PersonalInformation("Jane", "1603 Broad Street", 26, 9705467);
        System.out.println(friend1.getName());
        System.out.println(friend1.getAge());
        System.out.println(friend1.getPhoneNumber());
        System.out.println(friend1.getAddress());

        System.out.println();

        PersonalInformation friend2 = new PersonalInformation("Lena", "450 Market Street", 31, 9804356);
        System.out.println(friend2.getName());
        System.out.println(friend2.getAge());
        System.out.println(friend2.getPhoneNumber());
        System.out.println(friend2.getAddress());
    }
}