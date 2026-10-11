package ax.X4;

import java.math.BigInteger;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import okhttp3.internal.connection.RealConnection;

/* loaded from: classes.dex */
class k {
    public static final BigInteger a = BigInteger.valueOf(5);
    static final BigInteger b = BigInteger.valueOf(10000000000000000L);
    static final BigInteger c = BigInteger.valueOf(152587890625L);
    private static final BigInteger[] d = {BigInteger.ONE, BigInteger.TEN, BigInteger.valueOf(100), BigInteger.valueOf(1000), BigInteger.valueOf(10000), BigInteger.valueOf(100000), BigInteger.valueOf(1000000), BigInteger.valueOf(10000000), BigInteger.valueOf(100000000), BigInteger.valueOf(1000000000), BigInteger.valueOf(RealConnection.IDLE_CONNECTION_HEALTHY_NS), BigInteger.valueOf(100000000000L), BigInteger.valueOf(1000000000000L), BigInteger.valueOf(10000000000000L), BigInteger.valueOf(100000000000000L), BigInteger.valueOf(1000000000000000L)};

    static class b {
        final long a;
        final long b;

        private b(long j, long j2) {
            this.a = j;
            this.b = j2;
        }
    }

    static BigInteger a(NavigableMap<Integer, BigInteger> navigableMap, int i) {
        BigInteger[] bigIntegerArr = d;
        if (i < bigIntegerArr.length) {
            return bigIntegerArr[i];
        }
        if (navigableMap == null) {
            return a.pow(i).shiftLeft(i);
        }
        Map.Entry<Integer, BigInteger> floorEntry = navigableMap.floorEntry(Integer.valueOf(i));
        Integer key = floorEntry.getKey();
        return key.intValue() == i ? floorEntry.getValue() : l.k(floorEntry.getValue(), a(navigableMap, i - key.intValue()));
    }

    static BigInteger b(NavigableMap<Integer, BigInteger> navigableMap, int i) {
        int i2 = i & (-16);
        Map.Entry<Integer, BigInteger> floorEntry = navigableMap.floorEntry(Integer.valueOf(i2));
        int intValue = floorEntry.getKey().intValue();
        BigInteger value = floorEntry.getValue();
        if (intValue == i2) {
            return value;
        }
        int i3 = i2 - intValue;
        BigInteger bigInteger = navigableMap.get(Integer.valueOf(i3));
        if (bigInteger == null) {
            bigInteger = b(navigableMap, i3);
            navigableMap.put(Integer.valueOf(i3), bigInteger);
        }
        return l.k(value, bigInteger);
    }

    static NavigableMap<Integer, BigInteger> c() {
        TreeMap treeMap = new TreeMap();
        treeMap.put(0, BigInteger.ONE);
        treeMap.put(16, b);
        return treeMap;
    }

    public static long d(long j) {
        return ((j * 3402) >>> 10) + 1;
    }

    static NavigableMap<Integer, BigInteger> e(int i, int i2) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(0, BigInteger.valueOf(5L));
        treeMap.put(16, c);
        f(treeMap, i, i2);
        for (Map.Entry entry : treeMap.entrySet()) {
            entry.setValue(((BigInteger) entry.getValue()).shiftLeft(((Integer) entry.getKey()).intValue()));
        }
        return treeMap;
    }

    static void f(NavigableMap<Integer, BigInteger> navigableMap, int i, int i2) {
        if (i2 - i <= 18) {
            return;
        }
        int h = h(i, i2);
        int i3 = i2 - h;
        if (navigableMap.containsKey(Integer.valueOf(i3))) {
            return;
        }
        f(navigableMap, i, h);
        f(navigableMap, h, i2);
        navigableMap.put(Integer.valueOf(i3), b(navigableMap, i3));
    }

    static b g(long j, long j2) {
        long j3 = j & 4294967295L;
        long j4 = j >>> 32;
        long j5 = j2 & 4294967295L;
        long j6 = j2 >>> 32;
        long j7 = j4 * j6;
        long j8 = j6 * j3;
        long j9 = j3 * j5;
        long j10 = (j4 * j5) + (j9 >>> 32) + (j8 & 4294967295L);
        return new b(j7 + (j10 >>> 32) + (j8 >>> 32), (j10 << 32) | (4294967295L & j9));
    }

    static int h(int i, int i2) {
        return i2 - ((((i2 - ((i + i2) >>> 1)) + 15) >> 4) << 4);
    }
}
