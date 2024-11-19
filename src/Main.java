import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        int count =0;

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(0,20);
            numbers.add(randomNumber);
            count+=randomNumber;
        }
        System.out.println("Numbers " + numbers);
        System.out.println("Summa " + count);

        Set<Integer> setNumbers = new HashSet<>(numbers);
        int counter =0;
        for (Integer i : setNumbers){
           counter+=i;
        }
        System.out.println("HashSet Numbers " + setNumbers);
        System.out.println("Sum of HashSet numbers " + counter);






//        Set<String>students = new HashSet<>();
//
//        students.add("Fatima");
//        students.add("Gulnur");
//        students.add("Nurbol");
//        students.add("Azmar");
//        students.add("Adilet");
//        students.add("Nurbol");
//
//        System.out.println(students);
//
//        Set<Integer>numbers = new LinkedHashSet<>();
//        numbers.add(65);
//        numbers.add(9);
//        numbers.add(45);
//        numbers.add(5);
//        numbers.add(20);
//
//        System.out.println(numbers);
//
//
//        Set<String>treeSet = new TreeSet<>();
//        treeSet.add("Donny");
//        treeSet.add("Mike");
//        treeSet.add("Brad");
//
//        System.out.println(treeSet);








    }
}