import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        HashMap<String, String> test = new HashMap<>();
        test.put("a", "candy");
        test.put("b", "dirt");

//        test.remove("b");


        test.put("ab", (test.get("a") + test.get("b")));


//        test.replace("b", test.get("a"));
//        test.replace("a", "");
//
        System.out.println(test);
//
//        System.out.println(test.get("b") == null);


    }

    public Map<String, String> mapBully(Map<String, String> map) {

        if(map.get("b") != null && map.get("a") != null){
            map.replace("b", map.get("a"));
            map.replace("a", "");
        } else if(map.get("a") == null){
            return map;
        }else {
            map.put("b", map.get("a"));
            map.replace("a", "");
        }
        return map;
    }
    public Map<String, String> mapShare(Map<String, String> map) {
        map.remove("c");

        if(map.containsKey("a")){
            map.put("b", map.get("a"));
        }

        return map;

    }
    public Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            map.put("ab", (map.get("a") + map.get("b")));
        }
        return map;
    }
    public Map<String, String> topping1(Map<String, String> map) {
        if(map.containsKey("ice cream")){
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");

        return map;
    }
    public Map<String, String> topping2(Map<String, String> map) {

        if(map.containsKey("ice cream")){
            map.put("yogurt", map.get("ice cream"));
        }
        if(map.containsKey("spinach")){
            map.put("spinach", "nuts");
        }

        return map;
    }
}