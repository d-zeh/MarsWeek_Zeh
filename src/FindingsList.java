import java.util.*;
import java.util.Scanner;


public class FindingsList {

      public FindingsList() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000);
        System.out.println("Sargent: Welcome back from your trip!! *glares at you*");
        Thread.sleep(2000);
        List<String> array = new ArrayList<>(4);
        array.add("ROCK");
        array.add("wEiRd roCk");
        array.add("smooooooth rock");
        array.add("not ROCK");

        System.out.println("Sargent: ROCK and ROLL-CALL!");
        Thread.sleep(2000);

        for (String i : array) {
            System.out.println("Sargent:" + i + "?");
            Thread.sleep(1000);
            System.out.println(i + ": Present");
            Thread.sleep(1000);
        }
        Thread.sleep(2000);
        System.out.println("Sargent: Wait a second, you're not a rock! Eliminate them!");
        Thread.sleep(2000);
        System.out.println("*laser noises*");
        Thread.sleep(4000);
        array.remove(3);
        System.out.println("Sargent: ROCK and ROLL-CALL!");

        for (String i : array) {
            System.out.println("Sargent:" + i + "?");
            Thread.sleep(1000);
            System.out.println(i + ": Present");
            Thread.sleep(1000);
        }
        System.out.println("Sargent: Perfect");
        Thread.sleep(1000);

        Map<String, String> map = new HashMap<>();
        map.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        map.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        map.put("Tooth Fossil", "The tooth from an unknown fossil");
        System.out.println("Fossil data downloaded");
        System.out.println("Which of the fossils would you like to learn more about? (Bird, fish, or tooth)");
        String fossil = scanner.nextLine();
        fossil = fossil.toLowerCase();

        if (fossil.equals("bird")) {
            for (String key : map.keySet()) {
                if (key.contains("Bird")) {
                    fossil = map.get(key);
                    System.out.println(map.get(key));

                }
            }

        } else if (fossil.equals("fish")) {
            for (String key1 : map.keySet()) {
                if (key1.contains("Fish")) {
                    fossil = map.get(key1);
                    System.out.println(map.get(key1));
                }
            }
        } else if (fossil.equals("tooth")) {
            for (String key2 : map.keySet()) {
                if (key2.contains("Tooth")) {
                    fossil = map.get(key2);
                    System.out.println(map.get(key2));
                }
            }
        } else {
            System.out.println("I couldn't find it, sowwwy");

        }

        Thread.sleep(700);

        Map<Integer, String> stuff = new HashMap<>();
        stuff.put(0, "Mom's cookies");
        stuff.put(1, "Pencil and Paper");
        stuff.put(2, "A knife");
        System.out.println("Supplies before Expedition");
        for (Integer ref : stuff.keySet()) {
            System.out.println(stuff.get(ref));
        }
        stuff.remove(0);
        System.out.println("Supplies after Expedition");
        for (Integer ref : stuff.keySet()) {
            System.out.println(stuff.get(ref));
        }
    }
        }