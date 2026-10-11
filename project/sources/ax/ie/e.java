package ax.ie;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class e extends a {
    private static final int[] e = new int[128];
    private long a;
    private int b;
    long c;
    private byte d;

    static {
        for (int i = 8; i < 2048; i += 16) {
            int i2 = i;
            int i3 = 0;
            for (int i4 = 0; i4 < 4; i4++) {
                i2 *= i2;
                i3 <<= 1;
                while (((-65536) & i2) != 0) {
                    i2 >>>= 1;
                    i3++;
                }
            }
            e[i >> 4] = 161 - i3;
        }
    }

    public static int g(int i, int i2) {
        return e[(i ^ ((-i2) & 2047)) >>> 4];
    }

    public static int h(short[] sArr, int i) {
        int length = i | sArr.length;
        int i2 = 0;
        do {
            int i3 = length & 1;
            length >>>= 1;
            i2 += g(sArr[length], i3);
        } while (length != 1);
        return i2;
    }

    public static int i(int i) {
        return i << 4;
    }

    public static int k(short[] sArr, int i) {
        int length = i | sArr.length;
        int i2 = 0;
        int i3 = 1;
        do {
            int i4 = length & 1;
            length >>>= 1;
            i2 += g(sArr[i3], i4);
            i3 = (i3 << 1) | i4;
        } while (length != 1);
        return i2;
    }

    private void m() throws IOException {
        long j = this.a;
        int i = (int) (j >>> 32);
        if (i != 0 || j < 4278190080L) {
            byte b = this.d;
            while (true) {
                n(b + i);
                long j2 = this.c - 1;
                this.c = j2;
                if (j2 == 0) {
                    break;
                } else {
                    b = 255;
                }
            }
            this.d = (byte) (this.a >>> 24);
        }
        this.c++;
        this.a = (this.a & 16777215) << 8;
    }

    public void b(short[] sArr, int i, int i2) throws IOException {
        short s = sArr[i];
        int i3 = this.b;
        int i4 = (i3 >>> 11) * s;
        if (i2 == 0) {
            this.b = i4;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
        } else {
            this.a += i4 & 4294967295L;
            this.b = i3 - i4;
            sArr[i] = (short) (s - (s >>> 5));
        }
        int i5 = this.b;
        if (((-16777216) & i5) == 0) {
            this.b = i5 << 8;
            m();
        }
    }

    public void c(short[] sArr, int i) throws IOException {
        int length = sArr.length;
        int i2 = 1;
        do {
            length >>>= 1;
            int i3 = i & length;
            b(sArr, i2, i3);
            i2 <<= 1;
            if (i3 != 0) {
                i2 |= 1;
            }
        } while (length != 1);
    }

    public void d(int i, int i2) throws IOException {
        do {
            int i3 = this.b >>> 1;
            this.b = i3;
            i2--;
            this.a += (0 - ((i >>> i2) & 1)) & i3;
            if (((-16777216) & i3) == 0) {
                this.b = i3 << 8;
                m();
            }
        } while (i2 != 0);
    }

    public void e(short[] sArr, int i) throws IOException {
        int length = i | sArr.length;
        int i2 = 1;
        do {
            int i3 = length & 1;
            length >>>= 1;
            b(sArr, i2, i3);
            i2 = (i2 << 1) | i3;
        } while (length != 1);
    }

    public int f() throws IOException {
        for (int i = 0; i < 5; i++) {
            m();
        }
        return -1;
    }

    public int j() {
        throw new Error();
    }

    public void l() {
        this.a = 0L;
        this.b = -1;
        this.d = (byte) 0;
        this.c = 1L;
    }

    abstract void n(int i) throws IOException;
}
