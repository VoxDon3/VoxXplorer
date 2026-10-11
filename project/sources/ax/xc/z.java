package ax.xc;

import ax.tb.C3133i;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public final class z extends h {
    private final transient byte[][] g0;
    private final transient int[] h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(byte[][] bArr, int[] iArr) {
        super(h.f0.p());
        ax.Gb.l.f(bArr, "segments");
        ax.Gb.l.f(iArr, "directory");
        this.g0 = bArr;
        this.h0 = iArr;
    }

    private final h O() {
        return new h(J());
    }

    @Override // ax.xc.h
    public boolean A(int i, h hVar, int i2, int i3) {
        ax.Gb.l.f(hVar, "other");
        if (i < 0 || i > G() - i3) {
            return false;
        }
        int i4 = i3 + i;
        int b = ax.yc.c.b(this, i);
        while (i < i4) {
            int i5 = b == 0 ? 0 : M()[b - 1];
            int i6 = M()[b] - i5;
            int i7 = M()[N().length + b];
            int min = Math.min(i4, i6 + i5) - i;
            if (!hVar.B(i2, N()[b], i7 + (i - i5), min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }

    @Override // ax.xc.h
    public boolean B(int i, byte[] bArr, int i2, int i3) {
        ax.Gb.l.f(bArr, "other");
        if (i < 0 || i > G() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int b = ax.yc.c.b(this, i);
        while (i < i4) {
            int i5 = b == 0 ? 0 : M()[b - 1];
            int i6 = M()[b] - i5;
            int i7 = M()[N().length + b];
            int min = Math.min(i4, i6 + i5) - i;
            if (!C3484b.a(N()[b], i7 + (i - i5), bArr, i2, min)) {
                return false;
            }
            i2 += min;
            i += min;
            b++;
        }
        return true;
    }

    @Override // ax.xc.h
    public h I() {
        return O().I();
    }

    @Override // ax.xc.h
    public byte[] J() {
        byte[] bArr = new byte[G()];
        int length = N().length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int i4 = M()[length + i];
            int i5 = M()[i];
            int i6 = i5 - i2;
            C3133i.d(N()[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // ax.xc.h
    public void L(C3487e c3487e, int i, int i2) {
        ax.Gb.l.f(c3487e, "buffer");
        int i3 = i + i2;
        int b = ax.yc.c.b(this, i);
        while (i < i3) {
            int i4 = b == 0 ? 0 : M()[b - 1];
            int i5 = M()[b] - i4;
            int i6 = M()[N().length + b];
            int min = Math.min(i3, i5 + i4) - i;
            int i7 = i6 + (i - i4);
            x xVar = new x(N()[b], i7, i7 + min, true, false);
            x xVar2 = c3487e.q;
            if (xVar2 == null) {
                xVar.g = xVar;
                xVar.f = xVar;
                c3487e.q = xVar;
            } else {
                ax.Gb.l.c(xVar2);
                x xVar3 = xVar2.g;
                ax.Gb.l.c(xVar3);
                xVar3.c(xVar);
            }
            i += min;
            b++;
        }
        c3487e.b1(c3487e.size() + i2);
    }

    public final int[] M() {
        return this.h0;
    }

    public final byte[][] N() {
        return this.g0;
    }

    @Override // ax.xc.h
    public String d() {
        return O().d();
    }

    @Override // ax.xc.h
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.G() == G() && A(0, hVar, 0, G())) {
                return true;
            }
        }
        return false;
    }

    @Override // ax.xc.h
    public int hashCode() {
        int q = q();
        if (q != 0) {
            return q;
        }
        int length = N().length;
        int i = 0;
        int i2 = 0;
        int i3 = 1;
        while (i < length) {
            int i4 = M()[length + i];
            int i5 = M()[i];
            byte[] bArr = N()[i];
            int i6 = (i5 - i2) + i4;
            while (i4 < i6) {
                i3 = (i3 * 31) + bArr[i4];
                i4++;
            }
            i++;
            i2 = i5;
        }
        C(i3);
        return i3;
    }

    @Override // ax.xc.h
    public h l(String str) {
        ax.Gb.l.f(str, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        int length = N().length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = M()[length + i];
            int i4 = M()[i];
            messageDigest.update(N()[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        ax.Gb.l.c(digest);
        return new h(digest);
    }

    @Override // ax.xc.h
    public int r() {
        return M()[N().length - 1];
    }

    @Override // ax.xc.h
    public String t() {
        return O().t();
    }

    @Override // ax.xc.h
    public String toString() {
        return O().toString();
    }

    @Override // ax.xc.h
    public byte[] u() {
        return J();
    }

    @Override // ax.xc.h
    public byte w(int i) {
        C3484b.b(M()[N().length - 1], i, 1L);
        int b = ax.yc.c.b(this, i);
        return N()[b][(i - (b == 0 ? 0 : M()[b - 1])) + M()[N().length + b]];
    }
}
