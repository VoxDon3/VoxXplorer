package ax.G9;

import okhttp3.internal.http2.Http2;

/* loaded from: classes3.dex */
public class a {
    private int[] a = new int[16];
    private int[] b = new int[16];
    private int c = Http2.INITIAL_MAX_FRAME_SIZE;
    private int d = 16383;

    private void b(int i, int i2) {
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException("Expected message of at least " + i + " bytes but got " + i2 + " bytes.");
    }

    private void d(int i) {
        int i2 = this.a[i];
        if ((this.c & i2) == 0) {
            m(i, i2, this.b[i]);
        } else {
            e(i, i2 & this.d, this.b[i]);
        }
    }

    public void a(int i, int i2) {
        throw null;
    }

    public void c(int i, int i2, int i3) {
        throw null;
    }

    public void f(int i, int i2, int i3) {
        throw null;
    }

    public void g(int i, int i2, int i3) {
        throw null;
    }

    public void h(byte[] bArr, int i, int i2) {
        b(1, i2);
        byte b = bArr[i];
        int i3 = b & 240;
        int i4 = b & 15;
        if (i3 == 128) {
            b(3, i2);
            f(i4, bArr[i + 1], bArr[i + 2]);
            return;
        }
        if (i3 == 144) {
            b(3, i2);
            byte b2 = bArr[i + 2];
            if (b2 == 0) {
                f(i4, bArr[i + 1], b2);
                return;
            } else {
                g(i4, bArr[i + 1], b2);
                return;
            }
        }
        if (i3 == 160) {
            b(3, i2);
            j(i4, bArr[i + 1], bArr[i + 2]);
            return;
        }
        if (i3 == 176) {
            b(3, i2);
            l(i4, bArr[i + 1], bArr[i + 2]);
            return;
        }
        if (i3 == 192) {
            b(2, i2);
            k(i4, bArr[i + 1]);
        } else if (i3 == 208) {
            b(2, i2);
            a(i4, bArr[i + 1]);
        } else {
            if (i3 != 224) {
                return;
            }
            b(3, i2);
            i(i4, (bArr[i + 2] << 7) + bArr[i + 1]);
        }
    }

    public void i(int i, int i2) {
        throw null;
    }

    public void k(int i, int i2) {
        throw null;
    }

    public void l(int i, int i2, int i3) {
        if (i2 == 6) {
            this.b[i] = i3 << 7;
            d(i);
            return;
        }
        if (i2 == 38) {
            int[] iArr = this.b;
            iArr[i] = i3 | (iArr[i] & (-128));
            d(i);
            return;
        }
        switch (i2) {
            case 98:
                int[] iArr2 = this.a;
                iArr2[i] = i3 | this.c | (iArr2[i] & (-128));
                break;
            case 99:
                this.a[i] = (i3 << 7) | this.c;
                break;
            case 100:
                int[] iArr3 = this.a;
                iArr3[i] = i3 | (iArr3[i] & (-128));
                break;
            case 101:
                this.a[i] = i3 << 7;
                break;
            default:
                c(i, i2, i3);
                break;
        }
    }

    public void m(int i, int i2, int i3) {
        throw null;
    }

    public void e(int i, int i2, int i3) {
    }

    public void j(int i, int i2, int i3) {
    }
}
