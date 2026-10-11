package ax.ie;

import java.io.IOException;

/* loaded from: classes3.dex */
public abstract class b extends a {
    int a = 0;
    int b = 0;

    public int b(short[] sArr, int i) throws IOException {
        f();
        short s = sArr[i];
        int i2 = this.a;
        int i3 = (i2 >>> 11) * s;
        int i4 = this.b;
        if ((i4 ^ Integer.MIN_VALUE) < (Integer.MIN_VALUE ^ i3)) {
            this.a = i3;
            sArr[i] = (short) (s + ((2048 - s) >>> 5));
            return 0;
        }
        this.a = i2 - i3;
        this.b = i4 - i3;
        sArr[i] = (short) (s - (s >>> 5));
        return 1;
    }

    public int c(short[] sArr) throws IOException {
        int i = 1;
        do {
            i = b(sArr, i) | (i << 1);
        } while (i < sArr.length);
        return i - sArr.length;
    }

    public int d(int i) throws IOException {
        int i2 = 0;
        do {
            f();
            int i3 = this.a >>> 1;
            this.a = i3;
            int i4 = this.b;
            int i5 = (i4 - i3) >>> 31;
            this.b = i4 - (i3 & (i5 - 1));
            i2 = (i2 << 1) | (1 - i5);
            i--;
        } while (i != 0);
        return i2;
    }

    public int e(short[] sArr) throws IOException {
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (true) {
            int b = b(sArr, i3);
            i3 = (i3 << 1) | b;
            int i4 = i2 + 1;
            i |= b << i2;
            if (i3 >= sArr.length) {
                return i;
            }
            i2 = i4;
        }
    }

    public abstract void f() throws IOException;
}
