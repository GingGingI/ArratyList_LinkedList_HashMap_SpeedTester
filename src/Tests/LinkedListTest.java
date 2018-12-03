package Tests;

import Utils.util;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest extends util {

    private Integer[] testarr;
    private Integer[] values;
    private LinkedList linkedList;
    private final String TestTag = "LinkedList";

    public LinkedListTest(Integer[] testarr, Integer[] values) {
        this.testarr = testarr;
        this.values = values;
    }

    public void LinkedTestStart() {
        Init();
        Timer();putData();Timer();TextOutput(TestTag, "입력");
        Timer();SerchData();Timer();TextOutput(TestTag, "탐색");
        Timer();DeleteData();Timer();TextOutput(TestTag, "삭제");
    }


    private void putData() {
        for (Integer i : testarr) {
            linkedList.add(i);
        }
    }

    private void SerchData() {
        for (Integer value : values) {
            linkedList.get(value);
        }
    }

    private void DeleteData() {
        for (Integer value : values) {
            linkedList.remove(value);
        }
    }

    private void Init() {
        linkedList = new LinkedList();
        TimerSwitch = true;
    }
}

