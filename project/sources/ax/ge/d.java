package ax.ge;

import ax.be.C1735c;
import okhttp3.internal.http2.Settings;

/* loaded from: classes3.dex */
final class d extends b {
    private final int b;
    private final int[] c;
    private final int[] d;
    private final int[] e;
    private final int f;
    private int g = 0;
    private int h = 0;
    private int i = 0;

    d(int i, C1735c c1735c) {
        this.c = c1735c.c(1024, true);
        this.d = c1735c.c(65536, true);
        int e = e(i);
        this.f = e;
        this.e = c1735c.c(e, true);
        this.b = e - 1;
    }

    static int e(int i) {
        int i2 = i - 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = ((i5 | (i5 >>> 8)) >>> 1) | Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        if (i6 > 16777216) {
            i6 >>>= 1;
        }
        return i6 + 1;
    }

    void a(byte[] bArr, int i) {
        int[] iArr = b.a;
        int i2 = iArr[bArr[i] & 255] ^ (bArr[i + 1] & 255);
        this.g = i2 & 1023;
        int i3 = i2 ^ ((bArr[i + 2] & 255) << 8);
        this.h = 65535 & i3;
        this.i = ((iArr[bArr[i + 3] & 255] << 5) ^ i3) & this.b;
    }

    int b() {
        return this.c[this.g];
    }

    int c() {
        return this.d[this.h];
    }

    int d() {
        return this.e[this.i];
    }

    void f(int i) {
        f.p(this.c, 1024, i);
        f.p(this.d, 65536, i);
        f.p(this.e, this.f, i);
    }

    void g(C1735c c1735c) {
        c1735c.e(this.e);
        c1735c.e(this.d);
        c1735c.e(this.c);
    }

    void h(int i) {
        this.c[this.g] = i;
        this.d[this.h] = i;
        this.e[this.i] = i;
    }
}
