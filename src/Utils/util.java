package Utils;

public class util {

    protected boolean TimerSwitch;
    protected long start, end;

    protected void Timer() {
        if (TimerSwitch) {
            start = System.nanoTime();
            TimerSwitch = false;
        }else {
            end = System.nanoTime();
        }
    }

    protected void TextOutput(String Tag, String text) {
        System.out.println("\n"+ Tag +" Test");
        System.out.println("\t"+ text +" 소요 시간 " + ToSec(start, end) + "초");
    }

    protected double ToSec(long start, long end) {
        return (end - start) / Math.pow(10, 9);
    }

}
