package generic.pair;

public class ArrayAlg {
    // 获得中间值
    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }

    // 获得最小值
    public static <T extends Comparable> T min(T... a) {
        if (a == null || a.length == 0) return null;
        T smallest = a[0];
        for (T t : a) {
            if (t.compareTo(smallest) < 0) smallest = t;
        }
        return smallest;
    }

    // 获得最大值和最小值，返回Pair对象
    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if (a == null || a.length == 0) return null;
        T min = a[0];
        T max = a[0];
        for (T t : a) {
            if (min.compareTo(t) > 0) min = t;
            if (max.compareTo(t) < 0) max = t;
        }
        return new Pair<>(min, max);
    }
}
