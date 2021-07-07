import java.util.List;
import java.util.Map; 
import java.util.HashMap; 
import java.util.ArrayList; 

/*
"Teddy": ["Dog", "4 years old","male"],
"Ninja": ["Cat", "1 year old","female"],
"Chewy": ["Cat", "1 year old", "male"],
"Violet": ["Cat", "4 years old", "female"]

"Dog": ["Teddy"]
"Cat": ["Ninja", "Chewy", "Violet"]
"1 year old": ["Ninja", "Chewy"]
"4 years old": ["Teddy", "Violet"]
*/

public class Main 
{
    public static void main(String[] args) 
    {
        Map<String, List<String>> originalMap = new HashMap<String, List<String>>();
        List<String> values1 = new ArrayList<String>();
        values1.add("Dog");
        values1.add("4 years old");
        values1.add("male");

        List<String> values2 = new ArrayList<String>();
        values2.add("Cat");
        values2.add("1 year old");
        values2.add("female");

        List<String> values3 = new ArrayList<String>();
        values3.add("Cat");
        values3.add("1 year old");
        values3.add("male");

        List<String> values4 = new ArrayList<String>();
        values4.add("Cat");
        values4.add("4 years old");
        values4.add("female");

        originalMap.put("Teddy", values1);
        originalMap.put("Ninja", values2);
        originalMap.put("Chewy", values3);
        originalMap.put("Violet", values4);

        Map<String, List<String>> newMap = new HashMap<String, List<String>>();

        for(String key : originalMap.keySet())
        {
            for(String value : originalMap.get(key))
            {
                // If there's no list of values for the new key, create a new list
                if(newMap.get(value) == null)
                {
                    newMap.put(value, new ArrayList<String>());
                }

                newMap.get(value).add(key);
            }
        }

        System.out.println("Here, the pet names are the keys. The pet age, type, and gender are the values stored in a list inside this map: ");
        System.out.println("Original Map: " + originalMap + "\n");

        System.out.println("Now, the values are the keys and the pet names are the values. This list will show you which pets are cats, " +
        "which pets are 4 years old, etc. ");
        System.out.println("New Map: " + newMap);


    }
}