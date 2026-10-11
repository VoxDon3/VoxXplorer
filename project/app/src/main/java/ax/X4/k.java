/*
 * Decompiled with CFR 0.152.
 */
package ax.X4;

import ax.X4.l;
import java.math.BigInteger;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

class k {
    public static final BigInteger a = BigInteger.valueOf(5L);
    static final BigInteger b = BigInteger.valueOf(10000000000000000L);
    static final BigInteger c = BigInteger.valueOf(152587890625L);
    private static final BigInteger[] d;

    static {
        BigInteger bigInteger = BigInteger.valueOf(100L);
        BigInteger bigInteger2 = BigInteger.valueOf(1000L);
        BigInteger bigInteger3 = BigInteger.valueOf(10000L);
        BigInteger bigInteger4 = BigInteger.valueOf(100000L);
        BigInteger bigInteger5 = BigInteger.valueOf(1000000L);
        BigInteger bigInteger6 = BigInteger.valueOf(10000000L);
        BigInteger bigInteger7 = BigInteger.valueOf(100000000L);
        BigInteger bigInteger8 = BigInteger.valueOf(1000000000L);
        BigInteger bigInteger9 = BigInteger.valueOf(10000000000L);
        BigInteger bigInteger10 = BigInteger.valueOf(100000000000L);
        BigInteger bigInteger11 = BigInteger.valueOf(1000000000000L);
        BigInteger bigInteger12 = BigInteger.valueOf(10000000000000L);
        BigInteger bigInteger13 = BigInteger.valueOf(100000000000000L);
        BigInteger bigInteger14 = BigInteger.valueOf(1000000000000000L);
        d = new BigInteger[]{BigInteger.ONE, BigInteger.TEN, bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, bigInteger6, bigInteger7, bigInteger8, bigInteger9, bigInteger10, bigInteger11, bigInteger12, bigInteger13, bigInteger14};
    }

    static BigInteger a(NavigableMap<Integer, BigInteger> navigableMap, int n8) {
        Object object = d;
        if (n8 < ((BigInteger[])object).length) {
            return object[n8];
        }
        if (navigableMap != null) {
            Map.Entry<Integer, BigInteger> entry = navigableMap.floorEntry(n8);
            object = entry.getKey();
            if ((Integer)object == n8) {
                return entry.getValue();
            }
            return l.k(entry.getValue(), k.a(navigableMap, n8 - (Integer)object));
        }
        return a.pow(n8).shiftLeft(n8);
    }

    static BigInteger b(NavigableMap<Integer, BigInteger> navigableMap, int n8) {
        int n9 = n8 & 0xFFFFFFF0;
        Object object = navigableMap.floorEntry(n9);
        n8 = object.getKey();
        BigInteger bigInteger = object.getValue();
        if (n8 == n9) {
            return bigInteger;
        }
        n8 = n9 - n8;
        BigInteger bigInteger2 = (BigInteger)navigableMap.get(n8);
        object = bigInteger2;
        if (bigInteger2 == null) {
            object = k.b(navigableMap, n8);
            navigableMap.put(n8, (BigInteger)object);
        }
        return l.k(bigInteger, (BigInteger)object);
    }

    static NavigableMap<Integer, BigInteger> c() {
        TreeMap<Integer, BigInteger> treeMap = new TreeMap<Integer, BigInteger>();
        treeMap.put(0, BigInteger.ONE);
        treeMap.put(16, b);
        return treeMap;
    }

    public static long d(long l8) {
        return (l8 * 3402L >>> 10) + 1L;
    }

    static NavigableMap<Integer, BigInteger> e(int n8, int n9) {
        TreeMap<Integer, BigInteger> treeMap = new TreeMap<Integer, BigInteger>();
        treeMap.put(0, BigInteger.valueOf(5L));
        treeMap.put(16, c);
        k.f(treeMap, n8, n9);
        for (Map.Entry entry : treeMap.entrySet()) {
            entry.setValue(((BigInteger)entry.getValue()).shiftLeft((Integer)entry.getKey()));
        }
        return treeMap;
    }

    static void f(NavigableMap<Integer, BigInteger> navigableMap, int n8, int n9) {
        int n10;
        int n11;
        if (n9 - n8 > 18 && !navigableMap.containsKey(n11 = n9 - (n10 = k.h(n8, n9)))) {
            k.f(navigableMap, n8, n10);
            k.f(navigableMap, n10, n9);
            navigableMap.put(n11, k.b(navigableMap, n11));
        }
    }

    static b g(long l8, long l9) {
        long l10 = l8 & 0xFFFFFFFFL;
        long l11 = l9 & 0xFFFFFFFFL;
        long l12 = (l9 >>>= 32) * l10;
        l10 *= l11;
        l11 = (l8 >>>= 32) * l11 + (l10 >>> 32) + (l12 & 0xFFFFFFFFL);
        return new b(l8 * l9 + (l11 >>> 32) + (l12 >>> 32), l11 << 32 | 0xFFFFFFFFL & l10);
    }

    static int h(int n8, int n9) {
        return n9 - (n9 - (n8 + n9 >>> 1) + 15 >> 4 << 4);
    }

    static class b {
        final long a;
        final long b;

        private b(long l8, long l9) {
            this.a = l8;
            this.b = l9;
        }
    }
}

