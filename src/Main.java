import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
            String Line = new String("Ехал Гркека через реку видит Грека в реке рак сунул Грека руку в реку рак за руку Греку цап");
            String[] findWodrs = new String[]{"Грека", "реку", "реке", "рак", "руку", "Греку"};
        ArrayList<String> Words = new ArrayList<>(Arrays.asList(Line.split(" ")));
        for (String findWodr : findWodrs) {
            int count = 0;
            for (String word : Words) {
                if (word.equals(findWodr)) {
                    count++;
                }
            }
            System.out.println(findWodr + " - "+ count);
        }


    }
}