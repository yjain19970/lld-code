package liveclass.designpattern.prototypeRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> map = new HashMap<>();

    public void register(String key, Student o){
        map.put(key,o);
    }

    public Student get(String key){
        return map.get(key);
    }
}
