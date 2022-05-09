package mypack;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Groupbyjava {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("a","a","a","a","b","b","c","c","c","c");
		
Map<String,Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(map);

Map<String, Long> finalMap = new LinkedHashMap<>();

//Sort a map and add to finalMap
map.entrySet().stream()
        .sorted(Map.Entry.<String, Long>comparingByValue()
                .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

System.out.println(finalMap);
	}

}
