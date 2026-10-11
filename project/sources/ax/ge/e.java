package ax.ge;

import ax.be.C1735c;
import ax.be.C1741i;
import java.io.DataInputStream;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class e {
    private final byte[] a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private int f = 0;
    private int g = 0;
    private int h = 0;

    public e(int i, byte[] bArr, C1735c c1735c) {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.b = i;
        byte[] a = c1735c.a(i, false);
        this.a = a;
        if (bArr != null) {
            int min = Math.min(bArr.length, i);
            this.d = min;
            this.e = min;
            this.c = min;
            System.arraycopy(bArr, bArr.length - min, a, 0, min);
        }
    }

    public void a(DataInputStream dataInputStream, int i) throws IOException {
        int min = Math.min(this.b - this.d, i);
        dataInputStream.readFully(this.a, this.d, min);
        int i2 = this.d + min;
        this.d = i2;
        if (this.e < i2) {
            this.e = i2;
        }
    }

    public int b(byte[] bArr, int i) {
        int i2 = this.d;
        int i3 = this.c;
        int i4 = i2 - i3;
        if (i2 == this.b) {
            this.d = 0;
        }
        System.arraycopy(this.a, i3, bArr, i, i4);
        this.c = this.d;
        return i4;
    }

    public int c(int i) {
        int i2 = this.d;
        int i3 = (i2 - i) - 1;
        if (i >= i2) {
            i3 += this.b;
        }
        return this.a[i3] & 255;
    }

    public int d() {
        return this.d;
    }

    public boolean e() {
        return this.g > 0;
    }

    public boolean f() {
        return this.d < this.f;
    }

    public void g(C1735c c1735c) {
        c1735c.d(this.a);
    }

    public void h(byte b) {
        byte[] bArr = this.a;
        int i = this.d;
        int i2 = i + 1;
        this.d = i2;
        bArr[i] = b;
        if (this.e < i2) {
            this.e = i2;
        }
    }

    public void i(int i, int i2) throws IOException {
        int i3;
        if (i < 0 || i >= this.e) {
            throw new C1741i();
        }
        int min = Math.min(this.f - this.d, i2);
        this.g = i2 - min;
        this.h = i;
        int i4 = (this.d - i) - 1;
        if (i4 < 0) {
            int i5 = this.b;
            int i6 = i4 + i5;
            int min2 = Math.min(i5 - i6, min);
            byte[] bArr = this.a;
            System.arraycopy(bArr, i6, bArr, this.d, min2);
            this.d += min2;
            min -= min2;
            if (min == 0) {
                return;
            } else {
                i4 = 0;
            }
        }
        do {
            int min3 = Math.min(min, this.d - i4);
            byte[] bArr2 = this.a;
            System.arraycopy(bArr2, i4, bArr2, this.d, min3);
            i3 = this.d + min3;
            this.d = i3;
            min -= min3;
        } while (min > 0);
        if (this.e < i3) {
            this.e = i3;
        }
    }

    public void j() throws IOException {
        int i = this.g;
        if (i > 0) {
            i(this.h, i);
        }
    }

    public void k() {
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.a[this.b - 1] = 0;
    }

    public void l(int i) {
        int i2 = this.b;
        int i3 = this.d;
        if (i2 - i3 <= i) {
            this.f = i2;
        } else {
            this.f = i3 + i;
        }
    }
}
