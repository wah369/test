import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 联想
 * Date: 2020-11-02
 * Time: 14:29
 */
public class TestDemo {

    //map ，在map中存放元素的顺序，不一定是打印的顺序
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("老师","博哥");
        map.put("学生","wah");
        System.out.println(map);
        map.put(null,"WAH");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get("老师")); //输入key查找value
        System.out.println(map.getOrDefault("学生","369"));
        System.out.println(map.containsKey("wwww"));
        System.out.println(map.containsValue("wah"));
        System.out.println(map.isEmpty()); //判断是否为空
        //Set<Map.Entry<key,value>> entrySet()
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        for (Map.Entry<String,String> entry : entrySet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

    }

    //collection是接口，ArrayList 类似顺序表结构  LinkedList类似双向链表
    public static void main1(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);
        System.out.println(collection);
        System.out.println(collection.remove(3));
        System.out.println(collection);
        Collection<String> collection1 = new LinkedList<>();
        collection1.add("hello");
        collection1.add("tomorrow");
        System.out.println(collection1);
        for (String s : collection1) {
            System.out.print(s + " ");
        }
    }
}
