import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.stream.Collectors;

public class JAVA8newFeatures {
    public static void main(String[] args) throws IOException {

        Files.lines(Paths.get("src" + File.separator + "pushkin.txt"))
             .collect(Collectors.joining(" ")).chars()
             .mapToObj(e -> (char)e)
             .filter(Character::isAlphabetic)
             .collect(HashMap<Character, Integer>::new, (map, character) -> map.put(character, map.containsKey(character) ? (map.get(character) + 1) : 1), HashMap::putAll)
             .forEach((chars, count) -> System.out.println(chars + " - " + count));
    }
}
