public class PhoneBookEntry {
    String name;
    int phone_number;

    PhoneBookEntry(String name, int phone_number) {
        this.name = name;
        this.phone_number = phone_number;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String get_name() {
        return this.name;
    }

    public void set_phone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public int get_phone_number() {
        return this.phone_number;
    }
}