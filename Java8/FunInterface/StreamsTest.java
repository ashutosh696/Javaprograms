package FunInterface;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsTest {

	public static void main(String[] args) {

Stream<String> stream = Stream.of("aa","aaa","vvvvv");
								//Predicate           //Function
System.out.println(stream.filter(s->s.length()>2).map(s->s.toUpperCase()).collect(Collectors.toList()));

Stream<Integer> stream2 = Stream.of(2,6,7);

 Object[] arr=stream2.toArray();
 
 System.out.println(Arrays.toString(arr));

	}

}
