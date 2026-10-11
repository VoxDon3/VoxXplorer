package ax.q1;

import ax.P0.C0912v;
import ax.S0.d0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class B {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final a k;
    private final ax.P0.C l;

    public static class a {
        public final long[] a;
        public final long[] b;

        public a(long[] jArr, long[] jArr2) {
            this.a = jArr;
            this.b = jArr2;
        }
    }

    public B(byte[] bArr, int i) {
        ax.S0.F f = new ax.S0.F(bArr);
        f.p(i * 8);
        this.a = f.h(16);
        this.b = f.h(16);
        this.c = f.h(24);
        this.d = f.h(24);
        int h = f.h(20);
        this.e = h;
        this.f = j(h);
        this.g = f.h(3) + 1;
        int h2 = f.h(5) + 1;
        this.h = h2;
        this.i = e(h2);
        this.j = f.j(36);
        this.k = null;
        this.l = null;
    }

    private static int e(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int j(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public B a(List<ax.C1.a> list) {
        return new B(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, h(new ax.P0.C(list)));
    }

    public B b(a aVar) {
        return new B(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, aVar, this.l);
    }

    public B c(List<String> list) {
        return new B(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, h(X.d(list)));
    }

    public long d() {
        long j;
        long j2;
        int i = this.d;
        if (i > 0) {
            j = (i + this.c) / 2;
            j2 = 1;
        } else {
            int i2 = this.a;
            j = ((((i2 != this.b || i2 <= 0) ? 4096L : i2) * this.g) * this.h) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    public long f() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public C0912v g(byte[] bArr, ax.P0.C c) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        return new C0912v.b().y0("audio/flac").o0(i).T(this.g).z0(this.e).s0(d0.j0(this.h)).k0(Collections.singletonList(bArr)).r0(h(c)).P();
    }

    public ax.P0.C h(ax.P0.C c) {
        ax.P0.C c2 = this.l;
        return c2 == null ? c : c2.b(c);
    }

    public long i(long j) {
        return d0.q((j * this.e) / 1000000, 0L, this.j - 1);
    }

    private B(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, a aVar, ax.P0.C c) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = j(i5);
        this.g = i6;
        this.h = i7;
        this.i = e(i7);
        this.j = j;
        this.k = aVar;
        this.l = c;
    }
}
