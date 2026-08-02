import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CollectionsAss {

    //  ******** ArrayList *******************

    // 1. Create an ArrayList of type String with 10 string elements. Add 10 string elements to ArrayList and perform the below operations
    public void ArrayListCollection(){
        List<String> ITCompanies = new ArrayList<>();
 
        ITCompanies.add("JP Morgan");
        ITCompanies.add("TCS");
        ITCompanies.add("Tech Mahindra");
        ITCompanies.add("Wipro");
        ITCompanies.add("Infosys");
        ITCompanies.add("Accenture");
        ITCompanies.add("Cognizant");
        ITCompanies.add("Capgemini");
        ITCompanies.add("Virtusa");
        ITCompanies.add("Genpact");
        System.out.println("List of the IT companies  -  " + ITCompanies);

        // Adding element to ArrayList
        ITCompanies.add("Qualcomm");

        // Iterate through the ArrayList using iterator
        Iterator<String> iterator = ITCompanies.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        } 

        // Add an element at a specific index
        ITCompanies.add(5, "Dell Technologies");

        // Remove an element by index
        ITCompanies.remove(3);

        // Remove by value
        ITCompanies.remove("Wipro");

        // Update the element at a specific index
        ITCompanies.set(4, "HCL");

        // Check the element is present at a particular index
        System.out.println("Checking element is present at particular index - " + ITCompanies.get(7));

        // Get an element at a particular index
        System.out.println("Get element at index: " + ITCompanies.get(8));

        // Find out the size of the ArrayList
        System.out.println("Size of the list: " + ITCompanies.size());

        // Check the given element is present in the ArrayList
        System.out.println("Check for element present in list: " + ITCompanies.contains("Accenture"));

        // Remove all elements of the ArrayList
        List<String> temp = new ArrayList<>(ITCompanies);
        System.out.println("Temporary list: " + temp);
        temp.clear();
        System.out.println("Temporary list after removing all elements");
    }

    //  ******** HashMap *******************

    //2. Create a HashMap with at least 10 key value pairs of the Student ID and Name
    public void HashMapCollection(){
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Simran");
        students.put(102, "Sagar");
        students.put(103, "Ramesh");
        students.put(104, "Pushpa");
        students.put(105, "Aliya");
        students.put(106, "Rani");
        students.put(107, "Abbas");
        students.put(108, "Mohsin");
        students.put(109, "Johnson");
        students.put(110, "Kaviyan");
        System.out.println("Students list : " + students);

        // Insert a Key value mapping into the map
        students.put(111, "Mujahed");

        // Fetch the value of a Key
        System.out.println("Fetch value of a key: " + students.get(105));

        // Create a clone/copy of HashMap
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) students.clone();
        System.out.println("Copy of original map: " + clonedMap);
        
        // Check if the given Key is in the Map
        System.out.println("Checking key is present: " + students.containsKey(201));

        // Check if the value is in the Map
        System.out.println("Checking value is present: " + students.containsValue("Rani"));

        // Check if the map is empty
        System.out.println("Checking map is empty: " + students.isEmpty());
        
        // Print the size of the Map to the console
        System.out.println("Size of the map: " + students.size());

        // Print all the Keys of the map to the console
        System.out.println("Keys: " + students.keySet());

        // Print values of map
        System.out.println("Values: " + students.values());

        // Remove a specific Key-value pair
        System.out.println("Removing key-value pair: " + students.remove(107));
        System.out.println("Students list after removing a key-value pair : " + students);

        // Copy all the elements of the Map to another Map
        HashMap<Integer, String> copiedMap = new HashMap<>();
        copiedMap.putAll(students);
        System.out.println("Copied Map of the stdents map: " + copiedMap);
    }
    
    //  ******** HashSet *******************

    //3. Create a HashSet with at least 10 elements of type String
    public void HashSetCollection(){
        HashSet<String> animals = new HashSet<>();
        
        animals.add("Ant");
        animals.add("Bear");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Elephant");
        animals.add("Frog");
        animals.add("Gorilla");
        animals.add("Hippo");
        animals.add("Iguana");
        animals.add("Jaguar");
        System.out.println("Animals list : " + animals);

        // Insert a value into the set
        animals.add("Elephant");
        System.out.println("Animals set after adding duplicate value: " + animals);

        // Create a clone/copy of HashSet
        HashSet<String> clonedSet = (HashSet<String>) animals.clone();
        System.out.println("Copy of original set: " + clonedSet);
        
        // Check if the value is in the Set
        System.out.println("Checking value is present: " + animals.contains("Iguana"));

        // Check if the set is empty
        System.out.println("Checking set is empty: " + animals.isEmpty());
        
        // Print the size of the set to the console
        System.out.println("Size of the set: " + animals.size());
        
        // Remove a specific value
        System.out.println("Removing value: " + animals.remove("Dog"));
        System.out.println("Students list after removing a key-value pair : " + animals);

        // Copy all the elements of the Set to another Set
        HashSet<String> copiedSet = new HashSet<>();
        copiedSet.addAll(animals);
        System.out.println("Copied Map of the stdents set: " + copiedSet);
    }

    public static void main(String[] args) {
        CollectionsAss coll = new CollectionsAss();

        System.out.println("  === ArrayList Collection ===");
        coll.ArrayListCollection();

        System.out.println("  === HashMap Collection ===");
        coll.HashMapCollection();

        System.out.println("  === HashSet Collection ===");
        coll.HashSetCollection();
    }
}
