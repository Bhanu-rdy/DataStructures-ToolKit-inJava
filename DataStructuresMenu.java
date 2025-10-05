import java.util.*;
public class DataStructuresMenu {
    static Scanner sc = new Scanner(System.in);
    public static void stringOperations(String myStr) {
        while (true) {
            System.out.println("*********************** STRING IMPLEMENTATION *******************");
            System.out.println("1. About Strings");
            System.out.println("2. Print String");
            System.out.println("3. Concatenate String");
            System.out.println("4. Length of String");
            System.out.println("5. Access Character using index in the string");
            System.out.println("6. Convert to UpperCase");
            System.out.println("7. Convert to LowerCase");
            System.out.println("8. Substring");
            System.out.println("9. Compare with another String");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();   // consumes newLine (\n) present in the input buffer
            switch (choice) {
                case 1:
                    System.out.println("Definition: A string is a collection of characters enclosed within double quotes.It is a non-primitive data type in java");
                    break;
                case 2:
                    System.out.println("String: " + myStr);
                    break;
                case 3:
                    System.out.print("Enter another string to concatenate : ");
                    String str2 = sc.nextLine();
                    System.out.println("Concatenated String: " + myStr + "" + str2);
                    break;
                case 4:
                    System.out.println("Lenght of string: " + myStr.length());
                    break;
                case 5:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    if (index >= 0 && index < myStr.length()) System.out.println("Character : " + myStr.charAt(index));
                    else System.out.println("Index out of range!");
                    break;
                case 6:
                    System.out.println("UpperCase: " + myStr.toUpperCase());
                    break;
                case 7:
                    System.out.println("LowerCase: " + myStr.toLowerCase());
                    break;
                case 8:
                    System.out.print("Enter start index: ");
                    int start = sc.nextInt();
                    System.out.print("Enter end index: ");
                    int end = sc.nextInt();
                    if (start >= 0 && end <= myStr.length() && start < end) {
                        System.out.println("Substring : " + myStr.substring(start, end));
                    } else System.out.println("Invalid range: ");
                    break;
                case 9:
                    System.out.print("Enter string to compare: ");
                    String strToCompare = sc.nextLine();
                    System.out.println(myStr.equals(strToCompare) ? "Strings are equal" : "Strings are not equal");
                case 10:
                    System.out.println("Returning to Main Menu");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 14");
            }
        }
    }
    public static void arrayListOperations() {
        ArrayList<String> list = new ArrayList<>();
        while(true) {
            System.out.println("******************** ArrayList Implementation *********************");
            System.out.println("1. About ArrayList");
            System.out.println("2. Add element");
            System.out.println("3. Insert Element at Index");
            System.out.println("4. Display ArrayList");
            System.out.println("5. Get Element by Index");
            System.out.println("6. Remove Element by Index");
            System.out.println("7. Remove Element by Value");
            System.out.println("8. Check if Element Exists");
            System.out.println("9. Get size of ArrayList");
            System.out.println("10. Replace Element at Index");
            System.out.println("11. Sort ArrayList");
            System.out.println("12. Reverse ArrayList");
            System.out.println("13. Clear ArrayList");
            System.out.println("14. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("An ArrayList is a resizable (dynamic) array. It is a part of java.util package");
                    break;
                case 2:
                    System.out.print("Enter element to add: ");
                    String element = sc.nextLine();
                    list.add(element);
                    System.out.println("Element added successfully");
                    break;
                case 3:
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    if(index>=0 && index<=list.size()) {
                        System.out.print("Enter element: ");
                        element = sc.nextLine();
                        list.add(index, element);
                        System.out.println("Element inserted successfullly!");
                    }
                    else System.out.println("Invalid index!");
                    break;
                case 4:
                    System.out.println("Current ArrayList: " + list);
                    break;
                case 5:
                    System.out.print("Enter index to get element: ");
                    index = sc.nextInt();
                    if (index>=0 && index<list.size()) System.out.println("Element at index " + index + ": " + list.get(index));
                    else System.out.println("Invalid index!");
                    break;
                case 6:
                    System.out.print("Enter index to remove element: ");
                    index = sc.nextInt();
                    if (index>=0 && index<list.size()) {
                        list.remove(index);
                        System.out.println("Element removed successfully!");
                    }
                    else System.out.println("Invalid index!");
                    break;
                case 7:
                    System.out.print("Enter element to remove: ");
                    element = sc.nextLine();
                    if(list.remove(element)) System.out.println("Element removed successfully");
                    else System.out.println("Element not found!");
                    break;
                case 8:
                    System.out.print("Enter element to check: ");
                    System.out.println("Exists: " + list.contains(sc.nextLine()));
                    break;
                case 9:
                    System.out.println("Size of ArrayList: " + list.size());
                    break;
                case 10:
                    System.out.print("Enter index to replace: ");
                    index = sc.nextInt();
                    sc.nextLine();
                    if(index>=0 && index<list.size()) {
                        System.out.print("Enter new element: ");
                        element = sc.nextLine();
                        list.set(index, element);
                    }
                    else System.out.println("Invalid index!");
                    break;
                case 11:
                    Collections.sort(list);
                    System.out.println("ArrayList sorted successfully!");
                    break;
                case 12:
                    Collections.reverse(list);
                    System.out.println("ArrayList reversed successfully!");
                    break;
                case 13:
                    list.clear();
                    System.out.println("ArrayList cleared!");
                    break;
                case 14:
                    System.out.println("Returning to Main Menu");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 14");
            }
        }
    }
    public static void hashMapOperations() {
        HashMap<String, String> map = new HashMap<>();
        while (true) {
            System.out.println("********************* HashMap Implementation ***********************");
            System.out.println("1. About HashMap");
            System.out.println("2. Add key-Value pair");
            System.out.println("3. Display HashMap");
            System.out.println("4. Get size of HashMap");
            System.out.println("5. Access value using Key");
            System.out.println("6. Display All Keys");
            System.out.println("7. Display All Values");
            System.out.println("8. Remove Key");
            System.out.println("9. Check if key exists");
            System.out.println("10. Check if value exists");
            System.out.println("11. Clear HashMap");
            System.out.println("12. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();   // consumes newLine (\n) present in the input buffer
            switch (choice) {
                case 1:
                    System.out.println("A HashMap stores items in key/value pairs (no sorting) where each key maps to a specific value. HashMap is  a part of java.util package");
                    break;
                case 2:
                    System.out.print("Enter Key: ");
                    String key = sc.nextLine();
                    System.out.print("Enter Value: ");
                    String value = sc.nextLine();
                    map.put(key, value);
                    System.out.println("Key-value pair added successfully");
                    break;
                case 3:
                    System.out.println("All Key-Value pairs : " + map.entrySet());
                    break;
                case 4:
                    System.out.println("Size of HashMap: " + map.size());
                    break;
                case 5:
                    System.out.print("Enter Key to access: ");
                    key = sc.nextLine();
                    System.out.println("Value: " + map.getOrDefault(key, "Key not found!"));
                    break;
                case 6:
                    System.out.println("All keys: " + map.keySet());
                    break;
                case 7:
                    System.out.println("All Values : " + map.values());
                    break;
                case 8:
                    System.out.print("Enter key to remove: ");
                    key = sc.nextLine();
                    if(map.containsKey(key)) {
                        map.remove(key);
                        System.out.println("key removed successfully");
                    }
                    else System.out.println("key not found!");
                    break;
                case 9:
                    System.out.print("Enter key to check: ");
                    key = sc.nextLine();
                    System.out.println(map.containsKey(key)? "Key exists in the HashMap" : "Key not exists in the HashMap");
                    break;
                case 10:
                    System.out.print("Enter Value to check: ");
                    value = sc.nextLine();
                    System.out.println(map.containsValue(value)? "Value exists in the HashMap" : "Value not exists in the HashMap");
                    break;
                case 11:
                    map.clear();
                    System.out.println("HashMap cleared");
                    break;
                case 12:
                    System.out.println("Returning to Main Menu");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 12");
            }
        }
    }
    public static void treeMapOperations() {
        TreeMap<String, String> map = new TreeMap<>();
        while (true) {
            System.out.println("********************* TreeMap Implementation ***********************");
            System.out.println("1. About TreeMap");
            System.out.println("2. Add key-Value pair");
            System.out.println("3. Display TreeMap");
            System.out.println("4. Get size of TreeMap");
            System.out.println("5. Access value using Key");
            System.out.println("6. Display All Keys");
            System.out.println("7. Display All Values");
            System.out.println("8. Remove Key");
            System.out.println("9. Check if key exists");
            System.out.println("10. Check if value exists");
            System.out.println("11. Clear TreeMap");
            System.out.println("12. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();   // consumes newLine (\n) present in the input buffer
            switch (choice) {
                case 1:
                    System.out.println("A TreeMap stores items in key/value pairs in sorted order where each key maps to a specific value. TreeMap is  a part of java.util package");
                    break;
                case 2:
                    System.out.print("Enter Key: ");
                    String key = sc.nextLine();
                    System.out.print("Enter Value: ");
                    String value = sc.nextLine();
                    map.put(key, value);
                    System.out.println("Key-value pair added successfully");
                    break;
                case 3:
                    System.out.println("All Key-Value pairs : " + map.entrySet());
                    break;
                case 4:
                    System.out.println("Size of TreeMap: " + map.size());
                    break;
                case 5:
                    System.out.print("Enter Key to access: ");
                    key = sc.nextLine();
                    System.out.println("Value: " + map.getOrDefault(key, "Key not found!"));
                    break;
                case 6:
                    System.out.println("All keys: " + map.keySet());
                    break;
                case 7:
                    System.out.println("All Values : " + map.values());
                    break;
                case 8:
                    System.out.print("Enter key to remove: ");
                    key = sc.nextLine();
                    if(map.containsKey(key)) {
                        map.remove(key);
                        System.out.println("key removed successfully");
                    }
                    else System.out.println("key not found!");
                    break;
                case 9:
                    System.out.print("Enter key to check: ");
                    key = sc.nextLine();
                    System.out.println(map.containsKey(key)? "Key exists in the HashMap" : "Key not exists in the HashMap");
                    break;
                case 10:
                    System.out.print("Enter Value to check: ");
                    value = sc.nextLine();
                    System.out.println(map.containsValue(value)? "Value exists in the HashMap" : "Value not exists in the HashMap");
                    break;
                case 11:
                    map.clear();
                    System.out.println("HashMap cleared");
                    break;
                case 12:
                    System.out.println("Returning to Main Menu");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 12");
            }
        }

    }
    public static void hashSetOperations() {
        HashSet<String> set = new HashSet<>();
        while (true) {
            System.out.println("********************* HashSet Implementation ***********************");
            System.out.println("1. About HashSet");
            System.out.println("2. Add Element");
            System.out.println("3. Display HashSet");
            System.out.println("4. Remove Element");
            System.out.println("5. Check if Element exists");
            System.out.println("6. Get size of HashSet");
            System.out.println("7. Check if HashSet is empty");
            System.out.println("8. Clear HashSet");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("A HashSet is a collection of elements (not in a sorted order) where every element is unique. It is part of java.util package");
                    break;
                case 2:
                    System.out.print("Enter element to add : ");
                    String ele = sc.nextLine();
                    set.add(ele);
                    System.out.println("Element added successfully!");
                    break;
                case 3:
                    System.out.println("Current HashSet: " + set);
                    break;
                case 4:
                    System.out.print("Enter element to remove : ");
                    ele = sc.nextLine();
                    if(set.contains(ele)) {
                        set.remove(ele);
                        System.out.println("Element removed successfully");
                    }
                    else System.out.println("Element doesn't exist in the HashSet");
                    break;
                case 5:
                    System.out.print("Enter element to check : ");
                    ele = sc.nextLine();
                    System.out.println(set.contains(ele)? ele + " Exists" : ele + " not Exists");
                    break;
                case 6:
                    System.out.println("Size of HashSet : " + set.size());
                    break;
                case 7:
                    System.out.println("Is HashSet Empty : " + set.isEmpty());
                    break;
                case 8:
                    set.clear();
                    System.out.println("HashSet Cleared");
                    break;
                case 9:
                    System.out.println("Returning to Main Menu");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 9");
            }
        }
    }
    public static void treeSetOperations() {
        TreeSet<String> set = new TreeSet<>();
        while (true) {
            System.out.println("********************* TreeSet Implementation ***********************");
            System.out.println("1. About TreeSet");
            System.out.println("2. Add Element");
            System.out.println("3. Display TreeSet");
            System.out.println("4. Remove Element");
            System.out.println("5. Check if Element exists");
            System.out.println("6. Get size of TreeSet");
            System.out.println("7. Check if TreeSet is empty");
            System.out.println("8. Clear TreeSet");
            System.out.println("9. Get First Element");
            System.out.println("10. Get Last Element");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("A TreeSet is a collection that stores unique elements in sorted order. It is part of java.util package");
                    break;
                case 2:
                    System.out.print("Enter element to add : ");
                    String ele = sc.nextLine();
                    set.add(ele);
                    System.out.println("Element added successfully!");
                    break;
                case 3:
                    System.out.println("Current TreeSet: " + set);
                    break;
                case 4:
                    System.out.print("Enter element to remove : ");
                    ele = sc.nextLine();
                    if(set.contains(ele)) {
                        set.remove(ele);
                        System.out.println("Element removed successfully");
                    }
                    else System.out.println("Element doesn't exist in TreeSet");
                    break;
                case 5:
                    System.out.print("Enter element to check : ");
                    ele = sc.nextLine();
                    System.out.println(set.contains(ele)? ele + " Exists" : ele + " not Exists");
                    break;
                case 6:
                    System.out.println("Size of TreeSet : " + set.size());
                    break;
                case 7:
                    System.out.println("Is TreeSet Empty : " + set.isEmpty());
                    break;
                case 8:
                    set.clear();
                    System.out.println("TreeSet Cleared");
                    break;
                case 9:
                    if(!set.isEmpty()) System.out.println("First element: " + set.first());
                    else System.out.println("TreeSet is empty");
                    break;
                case 10:
                    if(!set.isEmpty()) System.out.println("Last element: " + set.last());
                    else System.out.println("TreeSet is empty");
                    break;
                case 11:
                    System.out.println("Returning to Main Menu");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 11");
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("**************** IMPLEMENTATION OF BASIC DATA STRUCTURES ****************");
        System.out.println("---------------------------------------------------------------------------");
        while (true) {
            System.out.println("************* MAIN MENU ********************");
            System.out.println("1. String Implementation");
            System.out.println("2. ArrayList Implementation");
            System.out.println("3. HashMap Implementation");
            System.out.println("4. TreeMap Implementation");
            System.out.println("5. HashSet Implementation");
            System.out.println("6. TreeSet Implementation");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter a string: ");
                    String myStr = sc.nextLine();
                    stringOperations(myStr);
                    break;
                case 2:
                    arrayListOperations();
                    break;
                case 3:
                    hashMapOperations();
                    break;
                case 4:
                    treeMapOperations();
                    break;
                case 5:
                    hashSetOperations();
                    break;
                case 6:
                    treeSetOperations();
                    break;
                case 7:
                    System.out.println("Exiting the program!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7: ");
            }
        }
    }
}