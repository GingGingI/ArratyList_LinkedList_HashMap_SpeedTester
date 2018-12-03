package Tests;

import Utils.util;

import java.util.ArrayList;

public class ArrayListTest extends util {

    private Integer[] testarr;
    private Integer[] values;
    private ArrayList arrayList;
    private final String TestTag = "ArrayList";

    public ArrayListTest(Integer[] testarr, Integer[] values) {
        this.testarr = testarr;
        this.values = values;
    }

    public void ArrayTestStart() {
        Init();
        Timer();putData();Timer();TextOutput(TestTag, "입력");
        Timer();SerchData();Timer();TextOutput(TestTag, "탐색");
        Timer();DeleteData();Timer();TextOutput(TestTag, "삭제");
    }


    private void putData() {
        for (Integer i : testarr) {
            arrayList.add(i);
        }
    }

    private void SerchData() {
        for(Integer value : values) {
            arrayList.get(value);
        }
    }

    private void DeleteData() {
        for(Integer value : values) {
            arrayList.remove(value);
        }
    }

    private void Init() {
        arrayList = new ArrayList();
        TimerSwitch = true;
    }

}