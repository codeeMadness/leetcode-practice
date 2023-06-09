package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class _2558 {
//    2558. Take Gifts From the Richest Pile
    public static long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> giftsPile = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < gifts.length; i++) {
            giftsPile.add(gifts[i]);
        }

        while(k > 0) {
            giftsPile.add((int)Math.sqrt(giftsPile.poll()));
            k--;
        }
        long sum = 0;
        while(giftsPile.size() > 0) {
            sum += giftsPile.poll();
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] gifts = {25,64,9,4,100};
        long res = _2558.pickGifts(gifts, 4);
        System.out.println(res);
    }

}
