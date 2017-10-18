import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Demo {

    public static void main(String[] args) throws IOException {

     //        Map<Character, Integer> map = new TreeMap<>();

//        Map<Character, Integer> countChar =
//                Files.lines(Paths.get("src" + File.separator + "pushkin.txt"))
//                        .collect(Collectors.joining(" ")).chars()
//                        .mapToObj(e->(char)e)
//                        .collect(Collectors.toList()).stream()
//                            .collect(Collector.of(HashMap<Character, Integer>::new, (map, entrySet) -> {
//                            if(map.containsKey(entrySet))
//                                map.put(entrySet, map.get(entrySet) + 1);
//                            else
//                                map.put(((Character)entrySet).getKey, 1);
//                        }, HashMap::putAll));

//        long result =
//        Map<Character, Integer> countChar =
//                Files.lines(Paths.get("src" + File.separator + "pushkin.txt"))
//                  .collect(Collectors.joining(" ")).chars()
//                  .collect(Collector.of(HashMap<Character, Integer>::new, (map, entrySet) -> {
//                      if(map.containsKey(entrySet))
//                          map.put(entrySet, map.get(c) + 1);
//                      else
//                          map.put(((Character)entrySet).getKey, 1);
//                  }, HashMap::putAll));

//        ( ()-> new HashMap<String,Integer>(),
//                (mutableMap,entryItem)->
//                        mutableMap.put(entryItem.getKey(),Integer.parseInt(entryItem.getValue())),
//                (map1,map2)->{ map1.putAll(map2); return map1;}
//                  .map(String::valueOf)
//                  .map(chars -> );
//                  .filter("a"::equals).count();
//                  .forEach(System.out::println);
//                  .map(lines -> lines.toCharArray())
//                  .filter(p -> p.equals("о")).count()
//                  .forEach(System.out::println);


//        ArrayList<Character> list= Arrays.("asas");

//                  .filter(chars -> chars.toString().)
//                .sorted(Comparator.comparing(String::length))
//                .map(StringBuilder::new)
//                .map(StringBuilder::reverse)
//                .map(StringBuilder::toString)
//                .collect(Collectors.joining("\n"));

//        System.out.println(result);

//        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)))) {
//            while (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                for (int i = 0; i < line.length(); i++) {
//                    addToMap(map, line.toLowerCase().charAt(i));
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
