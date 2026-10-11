/*
 * Decompiled with CFR 0.152.
 */
package ax.Dc;

import java.io.Serializable;
import java.math.BigInteger;

public final class K
implements Serializable {
    public static final K c0 = new K(0L);
    private final BigInteger q;

    public K(long l8) {
        this(BigInteger.valueOf(l8));
    }

    public K(BigInteger bigInteger) {
        this.q = bigInteger;
    }

    public K(byte[] byArray, int n8) {
        this.q = K.h(byArray, n8);
    }

    public static byte[] b(long l8) {
        return K.c(BigInteger.valueOf(l8));
    }

    public static byte[] c(BigInteger bigInteger) {
        byte[] byArray = new byte[8];
        long l8 = bigInteger.longValue();
        byArray[0] = (byte)(0xFFL & l8);
        byArray[1] = (byte)((0xFF00L & l8) >> 8);
        byArray[2] = (byte)((0xFF0000L & l8) >> 16);
        byArray[3] = (byte)((0xFF000000L & l8) >> 24);
        byArray[4] = (byte)((0xFF00000000L & l8) >> 32);
        byArray[5] = (byte)((0xFF0000000000L & l8) >> 40);
        byArray[6] = (byte)((0xFF000000000000L & l8) >> 48);
        byArray[7] = (byte)((l8 & 0x7F00000000000000L) >> 56);
        if (bigInteger.testBit(63)) {
            byArray[7] = (byte)(byArray[7] | 0xFFFFFF80);
        }
        return byArray;
    }

    public static long e(byte[] byArray) {
        return K.f(byArray, 0);
    }

    public static long f(byte[] byArray, int n8) {
        return K.h(byArray, n8).longValue();
    }

    public static BigInteger h(byte[] byArray, int n8) {
        int n9 = n8 + 7;
        BigInteger bigInteger = BigInteger.valueOf(((long)byArray[n9] << 56 & 0x7F00000000000000L) + ((long)byArray[n8 + 6] << 48 & 0xFF000000000000L) + ((long)byArray[n8 + 5] << 40 & 0xFF0000000000L) + ((long)byArray[n8 + 4] << 32 & 0xFF00000000L) + ((long)byArray[n8 + 3] << 24 & 0xFF000000L) + ((long)byArray[n8 + 2] << 16 & 0xFF0000L) + ((long)byArray[n8 + 1] << 8 & 0xFF00L) + ((long)byArray[n8] & 0xFFL));
        if ((byArray[n9] & 0xFFFFFF80) == -128) {
            return bigInteger.setBit(63);
        }
        return bigInteger;
    }

    public byte[] a() {
        return K.c(this.q);
    }

    public long d() {
        return this.q.longValue();
    }

    public boolean equals(Object object) {
        if (!(object instanceof K)) {
            return false;
        }
        return this.q.equals(((K)object).g());
    }

    public BigInteger g() {
        return this.q;
    }

    public int hashCode() {
        return this.q.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ZipEightByteInteger value: ");
        stringBuilder.append(this.q);
        return stringBuilder.toString();
    }
}

