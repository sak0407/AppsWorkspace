import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Class {
	
	public static void main(String[] args) {
		
	

	String s="I:alove,java:8,program:89 ";
	
	String[] str= Arrays.stream(s.split("\\,")).map(String::toUpperCase).toArray(String[]::new);
	
	Stream<String> st= Stream.of(str);
	
	st.forEach(x->System.out.println(x));
	
    Map<Object, Object> map=Arrays.asList(str).stream().map(e->e.split(":")).collect(Collectors.toMap(e->e[0], e->e[1],(e1,e2)->e1,
    		LinkedHashMap::new));
    
    
    System.out.println(map);
    
    
    Arrays.stream(s.split("\\,")).map(String::toUpperCase).toArray(String[]::new);
    
    Arrays.asList(str).stream().map(e1->e1.split(":")).collect(Collectors.toMap(e1->e1[0], e1->e1[1],(e1,e2)->e1,LinkedHashMap::new));
    
    
    
    
    
    
    
    String[] str2=Arrays.stream(s.split("\\,")).map(e->e.toUpperCase()).toArray(String[]::new);
    
    
    Arrays.asList(str).stream().map(e->e.split(":")).collect(Collectors.toMap(e->e[0], e->e[1],(e1,e2)->e1,LinkedHashMap::new));
    
    
    
    
    
    list.stream().sorted(Comparator.comparingLong(Hosting::getWebsite).reversed())
    .collect(Collectors.toMap(Hosting::getName, Hosting::getWebsite,(e1,e2)->e1,LinkedHashMap::new));
    
    
    Stream<String> s=Sream.of("A","B","C")
    s.collect(Collectors.toList());
    
    
    Set items=list.stream().filter(n->!items.add(n)).collect(Collectors.toSet())
    
    list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
     .entrySet.stream().filter(m->m.getValue()>1).map(Map.Entry::getkey).collect(Collectors.toList());
    
    
    list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
       .entrySet().stream().filter(m->m.getValue()>1).map(m->m.getKey).collect(Collectors.toList());
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
	
	
}		
	
}
