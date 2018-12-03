import Tests.ArrayListTest;
import Tests.HashMapTest;
import Tests.LinkedListTest;
import Utils.util;

/* ArrayList, LinkedList, HashTable 속도 측정 */
/* 출처 : http://nnoco.tistory.com/73?category=345945 */

public class Main extends util {

    static Integer[] testArr = new Integer[5000000];
    static Integer[] value = new Integer[4990];

    public static void main(String[] args) {
        Main main = new Main();

        main.TestStart();
    }

    public void TestStart() {

        System.out.println("-------------Start-------------");

        makeTestArr();

        HashMapTest HashTest  = new HashMapTest(testArr, value);
        ArrayListTest ArrTest = new ArrayListTest(testArr, value);
        LinkedListTest LinkTest = new LinkedListTest(testArr, value);

        HashTest.HashTestStart();
        ArrTest.ArrayTestStart();
        LinkTest.LinkedTestStart();

        System.out.println("--------------End--------------");
    }

    private void makeTestArr() {
        TimerSwitch = true;
        Timer();
        for (int i = 0; i < testArr.length; i++) {
            testArr[i] = i;
        }
        Timer();
        TextOutput("testArr", "데이터 생성");

        TimerSwitch = true;
        Timer();
        for (int v = 0; v < value.length; v++) {
            value[v] = v * 1000;
        }
        Timer();
        TextOutput("value", "데이터 생성");
    }
}
