package ax.T0;

import ax.S0.C0968a;

/* loaded from: classes.dex */
public final class j {
    private byte[] a;
    private int b;
    private int c;
    private int d;

    public j(byte[] bArr, int i, int i2) {
        j(bArr, i, i2);
    }

    private void a() {
        int i;
        int i2 = this.c;
        C0968a.g(i2 >= 0 && (i2 < (i = this.b) || (i2 == i && this.d == 0)));
    }

    private int g() {
        int i = 0;
        while (!e()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? f(i) : 0);
    }

    private boolean k(int i) {
        if (2 > i || i >= this.b) {
            return false;
        }
        byte[] bArr = this.a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i - 1] == 0;
    }

    public void b() {
        int i = this.d;
        if (i > 0) {
            m(8 - i);
        }
    }

    public boolean c(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.b) {
                break;
            }
            if (k(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    public boolean d() {
        int i = this.c;
        int i2 = this.d;
        int i3 = 0;
        while (this.c < this.b && !e()) {
            i3++;
        }
        boolean z = this.c == this.b;
        this.c = i;
        this.d = i2;
        return !z && c((i3 * 2) + 1);
    }

    public boolean e() {
        boolean z = (this.a[this.c] & (128 >> this.d)) != 0;
        l();
        return z;
    }

    public int f(int i) {
        int i2;
        this.d += i;
        int i3 = 0;
        while (true) {
            i2 = this.d;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.d = i4;
            byte[] bArr = this.a;
            int i5 = this.c;
            i3 |= (bArr[i5] & 255) << i4;
            if (!k(i5 + 1)) {
                r3 = 1;
            }
            this.c = i5 + r3;
        }
        byte[] bArr2 = this.a;
        int i6 = this.c;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.d = 0;
            this.c = i6 + (k(i6 + 1) ? 2 : 1);
        }
        a();
        return i7;
    }

    public int h() {
        int g = g();
        return (g % 2 == 0 ? -1 : 1) * ((g + 1) / 2);
    }

    public int i() {
        return g();
    }

    public void j(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.c = i;
        this.b = i2;
        this.d = 0;
        a();
    }

    public void l() {
        int i = this.d + 1;
        this.d = i;
        if (i == 8) {
            this.d = 0;
            int i2 = this.c;
            this.c = i2 + (k(i2 + 1) ? 2 : 1);
        }
        a();
    }

    public void m(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.c = i4;
        int i5 = this.d + (i - (i3 * 8));
        this.d = i5;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.c) {
                a();
                return;
            } else if (k(i2)) {
                this.c++;
                i2 += 2;
            }
        }
    }
}
