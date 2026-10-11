package ax.Dc;

import java.io.Serializable;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public final class K implements Serializable {
    public static final K c0 = new K(0);
    private final BigInteger q;

    public K(long j) {
        this(BigInteger.valueOf(j));
    }

    public static byte[] b(long j) {
        return c(BigInteger.valueOf(j));
    }

    public static byte[] c(BigInteger bigInteger) {
        long longValue = bigInteger.longValue();
        byte[] bArr = {(byte) (255 & longValue), (byte) ((65280 & longValue) >> 8), (byte) ((16711680 & longValue) >> 16), (byte) ((4278190080L & longValue) >> 24), (byte) ((1095216660480L & longValue) >> 32), (byte) ((280375465082880L & longValue) >> 40), (byte) ((71776119061217280L & longValue) >> 48), (byte) ((longValue & 9151314442816847872L) >> 56)};
        if (bigInteger.testBit(63)) {
            bArr[7] = (byte) (bArr[7] | Byte.MIN_VALUE);
        }
        return bArr;
    }

    public static long e(byte[] bArr) {
        return f(bArr, 0);
    }

    public static long f(byte[] bArr, int i) {
        return h(bArr, i).longValue();
    }

    public static BigInteger h(byte[] bArr, int i) {
        int i2 = i + 7;
        BigInteger valueOf = BigInteger.valueOf(((bArr[i2] << 56) & 9151314442816847872L) + ((bArr[i + 6] << 48) & 71776119061217280L) + ((bArr[i + 5] << 40) & 280375465082880L) + ((bArr[i + 4] << 32) & 1095216660480L) + ((bArr[i + 3] << 24) & 4278190080L) + ((bArr[i + 2] << 16) & 16711680) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255));
        return (bArr[i2] & Byte.MIN_VALUE) == -128 ? valueOf.setBit(63) : valueOf;
    }

    public byte[] a() {
        return c(this.q);
    }

    public long d() {
        return this.q.longValue();
    }

    public boolean equals(Object obj) {
        if (obj instanceof K) {
            return this.q.equals(((K) obj).g());
        }
        return false;
    }

    public BigInteger g() {
        return this.q;
    }

    public int hashCode() {
        return this.q.hashCode();
    }

    public String toString() {
        return "ZipEightByteInteger value: " + this.q;
    }

    public K(BigInteger bigInteger) {
        this.q = bigInteger;
    }

    public K(byte[] bArr, int i) {
        this.q = h(bArr, i);
    }
}
