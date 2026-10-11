/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class L {
    public static List<byte[]> a(byte[] byArray) {
        long l8 = L.k(L.f(byArray));
        long l9 = L.k(3840L);
        ArrayList<byte[]> arrayList = new ArrayList<byte[]>(3);
        arrayList.add(byArray);
        arrayList.add(L.b(l8));
        arrayList.add(L.b(l9));
        return arrayList;
    }

    private static byte[] b(long l8) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(l8).array();
    }

    public static int c(byte[] byArray) {
        return byArray[9] & 0xFF;
    }

    private static long d(byte by, byte by2) {
        int n8;
        int n9 = by & 3;
        if (n9 != 0) {
            int n10;
            n8 = n10 = 2;
            if (n9 != 1) {
                n8 = n10;
                if (n9 != 2) {
                    n8 = by2 & 0x3F;
                }
            }
        } else {
            n8 = 1;
        }
        by = (byte)((by & 0xFF) >> 3);
        by2 = (byte)(by & 3);
        by = by >= 16 ? (byte)(2500 << by2) : (by >= 12 ? (byte)(10000 << (by & 1)) : (by2 == 3 ? (byte)60000 : (byte)(10000 << by2)));
        return (long)n8 * (long)by;
    }

    public static long e(byte[] byArray) {
        byte by = 0;
        byte by2 = byArray[0];
        if (byArray.length > 1) {
            by = byArray[1];
        }
        return L.d(by2, by);
    }

    public static int f(byte[] byArray) {
        byte by = byArray[11];
        return byArray[10] & 0xFF | (by & 0xFF) << 8;
    }

    public static boolean g(long l8, long l9) {
        return l8 - l9 <= L.k(3840L) / 1000L;
    }

    public static int h(ByteBuffer byteBuffer) {
        int n8 = L.i(byteBuffer);
        n8 = byteBuffer.get(n8 + 26) + 27 + n8;
        byte by = byteBuffer.get(n8);
        byte by2 = byteBuffer.limit() - n8 > 1 ? byteBuffer.get(n8 + 1) : (byte)0;
        return (int)(L.d(by, by2) * 48000L / 1000000L);
    }

    public static int i(ByteBuffer byteBuffer) {
        int n8;
        int n9 = byteBuffer.get(5);
        int n10 = 0;
        if ((n9 & 2) == 0) {
            return 0;
        }
        int n11 = byteBuffer.get(26);
        int n12 = 28;
        n9 = 28;
        for (n8 = 0; n8 < n11; ++n8) {
            n9 += byteBuffer.get(n8 + 27);
        }
        n11 = byteBuffer.get(n9 + 26);
        for (n8 = n10; n8 < n11; ++n8) {
            n12 += byteBuffer.get(n9 + 27 + n8);
        }
        return n9 + n12;
    }

    public static int j(ByteBuffer byteBuffer) {
        byte by = 0;
        byte by2 = byteBuffer.get(0);
        if (byteBuffer.limit() > 1) {
            by = byteBuffer.get(1);
        }
        return (int)(L.d(by2, by) * 48000L / 1000000L);
    }

    private static long k(long l8) {
        return l8 * 1000000000L / 48000L;
    }
}

