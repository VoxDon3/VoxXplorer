package ax.ge;

import ax.be.C1735c;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public abstract class f {
    private final int a;
    private final int b;
    final int c;
    final int d;
    final byte[] e;
    final int f;
    int g = -1;
    private int h = -1;
    private boolean i = false;
    private int j = 0;
    private int k = 0;

    f(int i, int i2, int i3, int i4, int i5, C1735c c1735c) {
        int d = d(i, i2, i3, i5);
        this.f = d;
        this.e = c1735c.a(d, false);
        this.a = i2 + i;
        this.b = i3 + i5;
        this.c = i5;
        this.d = i4;
    }

    private static int d(int i, int i2, int i3, int i4) {
        return i2 + i + i3 + i4 + Math.min((i / 2) + 262144, 536870912);
    }

    public static f g(int i, int i2, int i3, int i4, int i5, int i6, int i7, C1735c c1735c) {
        if (i6 == 4) {
            return new c(i, i2, i3, i4, i5, i7, c1735c);
        }
        if (i6 == 20) {
            return new a(i, i2, i3, i4, i5, i7, c1735c);
        }
        throw new IllegalArgumentException();
    }

    private void o() {
        int i = ((this.g + 1) - this.a) & (-16);
        int i2 = this.j - i;
        byte[] bArr = this.e;
        System.arraycopy(bArr, i, bArr, 0, i2);
        this.g -= i;
        this.h -= i;
        this.j -= i;
    }

    static void p(int[] iArr, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            if (i4 <= i2) {
                iArr[i3] = 0;
            } else {
                iArr[i3] = i4 - i2;
            }
        }
    }

    private void q() {
        int i;
        int i2 = this.k;
        if (i2 <= 0 || (i = this.g) >= this.h) {
            return;
        }
        this.g = i - i2;
        this.k = 0;
        v(i2);
    }

    public void a(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.e, (this.g + 1) - i, i2);
    }

    public int b(byte[] bArr, int i, int i2) {
        if (this.g >= this.f - this.b) {
            o();
        }
        int i3 = this.f;
        int i4 = this.j;
        if (i2 > i3 - i4) {
            i2 = i3 - i4;
        }
        System.arraycopy(bArr, i, this.e, i4, i2);
        int i5 = this.j + i2;
        this.j = i5;
        int i6 = this.b;
        if (i5 >= i6) {
            this.h = i5 - i6;
        }
        q();
        return i2;
    }

    public int c() {
        return this.j - this.g;
    }

    public int e(int i) {
        return this.e[this.g - i] & 255;
    }

    public int f(int i, int i2) {
        return this.e[(this.g + i) - i2] & 255;
    }

    public int h(int i, int i2) {
        int i3 = (this.g - i) - 1;
        int i4 = 0;
        while (i4 < i2) {
            byte[] bArr = this.e;
            if (bArr[this.g + i4] != bArr[i3 + i4]) {
                break;
            }
            i4++;
        }
        return i4;
    }

    public int i(int i, int i2, int i3) {
        int i4 = this.g + i;
        int i5 = (i4 - i2) - 1;
        int i6 = 0;
        while (i6 < i3) {
            byte[] bArr = this.e;
            if (bArr[i4 + i6] != bArr[i5 + i6]) {
                break;
            }
            i6++;
        }
        return i6;
    }

    public abstract g j();

    public int k() {
        return this.g;
    }

    public boolean l(int i) {
        return this.g - i < this.h;
    }

    public boolean m() {
        return this.g != -1;
    }

    int n(int i, int i2) {
        int i3 = this.g + 1;
        this.g = i3;
        int i4 = this.j - i3;
        if (i4 >= i || (i4 >= i2 && this.i)) {
            return i4;
        }
        this.k++;
        return 0;
    }

    public void r(C1735c c1735c) {
        c1735c.d(this.e);
    }

    public void s() {
        this.h = this.j - 1;
        this.i = true;
        q();
    }

    public void t() {
        this.h = this.j - 1;
        q();
    }

    public void u(int i, byte[] bArr) {
        if (bArr != null) {
            int min = Math.min(bArr.length, i);
            System.arraycopy(bArr, bArr.length - min, this.e, 0, min);
            this.j += min;
            v(min);
        }
    }

    public abstract void v(int i);
}
