import java.util.*;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<>();
            String Line = "Ехал Гркека через реку видит Грека в реке рак сунул Грека руку в реку рак за руку Греку цап";
            String[] findWodrs = new String[]{"Грека", "реку", "реке", "рак", "руку", "Греку"};
        ArrayList<String> Words = new ArrayList<>(Arrays.asList(Line.split(" ")));
        String[] results = new String[findWodrs.length];
        for (String findWodr : findWodrs) {
            int count = 0;
            for (String word : Words) {
                if (word.equals(findWodr)) {
                    count++;
                }
            }
            results[count] = results[count] + ", "+ findWodr;
        }
        for(int i = 1; i< results.length;i++){
            if(results[i] != null){
                System.out.println(i + " - " + results[i]);
            }
        }
    }
}
