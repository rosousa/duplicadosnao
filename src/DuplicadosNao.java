import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class DuplicadosNao {
    public static void main(String[] args) {
//        final List<String> fruits = new ArrayList<String>(Arrays.asList("Morango", "Abacate", "Laranja", "Abacate", "Uva", "Morango", "Pessego", "Banana", "Uva"));
        final String[] fruits = new String[]
                {
                        "Morango", "Abacate", "Laranja",
                        "Abacate", "Uva", "Morango",
                        "Pessego", "Banana", "Uva",
                };
        List<String> aux = new ArrayList<>();

        for (int i = 0; i < fruits.length; i++) {
            final String fruit = fruits[i];
            if (aux.contains(fruit)) {
                System.out.println(fruit);
                continue;
            }
            aux.add(fruit);
        }
    }
}
