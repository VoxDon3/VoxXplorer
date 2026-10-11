package ax.b6;

/* loaded from: classes3.dex */
public abstract class P3 {
    private static volatile int b = 100;
    int a;

    public static long b(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    static P3 c(byte[] bArr, int i, int i2, boolean z) {
        O3 o3 = new O3(bArr, i2);
        try {
            o3.a(i2);
            return o3;
        } catch (C1663s4 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int a(int i) throws C1663s4;

    public abstract int d();

    private P3() {
        this.a = b;
    }
}
