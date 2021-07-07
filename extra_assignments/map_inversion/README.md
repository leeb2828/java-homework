<h1>Assignment: Inverting a Map in Java</h1>

Take this original map <br /> 
Original Map: {Chewy=[Cat, 1 year old, male], Violet=[Cat, 4 years old, female], Ninja=[Cat, 1 year old, female], Teddy=[Dog, 4 years old, male]}<br />

Switch the key/value pairs so that all the pet names become values and all the pet attributes become keys:<br />
New Map: {Cat=[Chewy, Violet, Ninja], 4 years old=[Violet, Teddy], female=[Violet, Ninja], Dog=[Teddy], male=[Chewy, Teddy], 1 year old=[Chewy, Ninja]}
<br />
<br />

For help getting started on this assignment: <br />
```
import java.util.HashMap; 
import java.util.ArrayList; 

public class Main {
    public static void main(String[] args) {
        // Create your HashMap for key/value pairs. 
        // This will store keys to type "String" and "ArrayLists" for the values.
        HashMap<String, ArrayList<String>> user_map = new HashMap<String, ArrayList<String>>();
        
        // Create ArrayList to add to your HashMap
        ArrayList<String> user_values = new ArrayList<String>();
        // Add values to the ArrayList
        user_values.add("Dog");
        user_values.add("4 years old");
        user_values.add("male");

        // Create your key
        String user_key = "Teddy";

        // Add the key/values pair to your HashMap
        user_map.put(user_key, user_values);

        System.out.println(user_map); // { Teddy = [Dog, 4 years old, male] }

        // Create a new map to store inverted keys and values
        HashMap<String, ArrayList<String>> newMap = new HashMap<String, ArrayList<String>>();

        // this will loop through all the keys in the hashmap
        for (String key: user_map.keySet()) {
            // this will loop through all the values
            for (String value: user_map.get(key)) {
                // if a pet attribute(such as "age") isn't already listed as a "key" in the new hashmap, add the attribute as
                // a new key with an empty arraylist for its value.
                if (newMap.get(value) == null) {
                    newMap.put(value, new ArrayList<String>());
                }
                // adding the pet name ("Teddy") as the value for the key (such as age, type, or gender)
                newMap.get(value).add(key);
            }
        }

        System.out.println(newMap);
    }
}
```
