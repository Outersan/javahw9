import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Radio {
    public int getCurrentFrequency;
    private int currentFrequency;

    private int getCurrentFrequency() {
        return currentFrequency;
    }
    public void setCurrentFrequency(int newCurrentFrequency) {
        if (newCurrentFrequency == currentFrequency) {
            return;
        }
        else {
            newCurrentFrequency = currentFrequency;
            return;
        }
    }
    public static void changeFrequencyNext(String args[]) {
        Scanner scan = new Scanner("0 1 2 3 4 5 6 7 8 9");
        String pattern = "\\d*";
        System.out.println(scan.next(pattern));
        System.out.println(scan.next());
    }
    public static void changeFrequencyPrev(String args[]) {
        ArrayList<Integer> arrListForPrev = new ArrayList<Integer>();

        arrListForPrev.add(0);
        arrListForPrev.add(1);
        arrListForPrev.add(2);
        arrListForPrev.add(3);
        arrListForPrev.add(4);
        arrListForPrev.add(5);
        arrListForPrev.add(6);
        arrListForPrev.add(7);
        arrListForPrev.add(8);
        arrListForPrev.add(9);

        ListIterator<Integer> iterator = arrListForPrev.listIterator();

        System.out.println(iterator.previousIndex());
    }

    }
