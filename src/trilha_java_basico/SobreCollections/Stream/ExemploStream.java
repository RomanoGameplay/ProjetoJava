package trilha_java_basico.SobreCollections.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExemploStream {
    public static void main(String[] args) {
        List<String> numerosAleatorios = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        numerosAleatorios.forEach(System.out::println);
        System.out.println("\n");
        numerosAleatorios.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("\n");
        List<Integer> collectList = numerosAleatorios.stream().map(Integer::parseInt).collect(Collectors.toList());
        collectList.forEach(System.out::println);

        System.out.println("\n");
        List<Integer> listaMaiorQueDois = numerosAleatorios.stream().map(Integer::parseInt).filter(integer -> (integer%2==0 && integer>2)).collect(Collectors.toList());
        System.out.println(listaMaiorQueDois);

        System.out.println("\n");
        numerosAleatorios.stream().mapToInt(Integer::parseInt).average().ifPresent(System.out::println);

        System.out.println("\n");
        collectList.removeIf( integer -> (integer % 2 != 0));
        System.out.println(collectList);



    }
}
