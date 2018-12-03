package Tests;

import Utils.util;
import com.sun.tools.javac.Main;

import java.util.HashMap;

public class HashMapTest extends util {

    private Integer[] testarr;
    private Integer[] values;
    private HashMap hashMap;
    private final String TestTag = "HashMap";

    public HashMapTest(Integer[] testarr, Integer[] values) {
        this.testarr = testarr;
        this.values = values;
    }

    public void HashTestStart() {
        Init();
        Timer();putData();Timer();TextOutput(TestTag, "입력");
        Timer();SerchData();Timer();TextOutput(TestTag, "탐색");
        Timer();DeleteData();Timer();TextOutput(TestTag, "삭제");
    }


    private void putData() {
        for (Integer i : testarr) {
            hashMap.put(i, i);
        }
    }

    private void SerchData() {
        for(Integer value : values) {
            hashMap.get(value);
        }
    }

    private void DeleteData() {
        for(Integer value : values) {
            hashMap.remove(value);
        }
    }

    private void Init() {
        hashMap = new HashMap();
        TimerSwitch = true;
    }

}
