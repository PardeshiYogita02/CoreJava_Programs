import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
public class MapExample {

public static void main(String[] args) {
    Map m = new HashMap();
    m.put(1, "Mango");
    m.put(2, "Kiwi");
    m.put(3, "Banana");
    m.put(4, "Grapse");
    m.put(5, "Apple");
    m.put(5, "Mango");
    m.put(5,"pinapple");
    System.out.println(m);
    Set s=m.entrySet();
    Iterator it=s.iterator();

/*while(it.hasNext())

{

System.out.println(it.next());

}*/

    while(it.hasNext())
    {
        Map.Entry e=(Map.Entry)it.next();
        System.out.println(e.getKey()+" "+e.getValue());
}
}
}