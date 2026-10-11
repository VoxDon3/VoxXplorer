package ax.xc;

import ax.tb.C3133i;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class x {
    public static final a h = new a(null);
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public x f;
    public x g;

    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    public x() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final void a() {
        int i;
        x xVar = this.g;
        if (xVar == this) {
            throw new IllegalStateException("cannot compact");
        }
        ax.Gb.l.c(xVar);
        if (xVar.e) {
            int i2 = this.c - this.b;
            x xVar2 = this.g;
            ax.Gb.l.c(xVar2);
            int i3 = 8192 - xVar2.c;
            x xVar3 = this.g;
            ax.Gb.l.c(xVar3);
            if (xVar3.d) {
                i = 0;
            } else {
                x xVar4 = this.g;
                ax.Gb.l.c(xVar4);
                i = xVar4.b;
            }
            if (i2 > i3 + i) {
                return;
            }
            x xVar5 = this.g;
            ax.Gb.l.c(xVar5);
            g(xVar5, i2);
            b();
            y.b(this);
        }
    }

    public final x b() {
        x xVar = this.f;
        if (xVar == this) {
            xVar = null;
        }
        x xVar2 = this.g;
        ax.Gb.l.c(xVar2);
        xVar2.f = this.f;
        x xVar3 = this.f;
        ax.Gb.l.c(xVar3);
        xVar3.g = this.g;
        this.f = null;
        this.g = null;
        return xVar;
    }

    public final x c(x xVar) {
        ax.Gb.l.f(xVar, "segment");
        xVar.g = this;
        xVar.f = this.f;
        x xVar2 = this.f;
        ax.Gb.l.c(xVar2);
        xVar2.g = xVar;
        this.f = xVar;
        return xVar;
    }

    public final x d() {
        this.d = true;
        return new x(this.a, this.b, this.c, true, false);
    }

    public final x e(int i) {
        x c;
        if (i <= 0 || i > this.c - this.b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i >= 1024) {
            c = d();
        } else {
            c = y.c();
            byte[] bArr = this.a;
            byte[] bArr2 = c.a;
            int i2 = this.b;
            C3133i.h(bArr, bArr2, 0, i2, i2 + i, 2, null);
        }
        c.c = c.b + i;
        this.b += i;
        x xVar = this.g;
        ax.Gb.l.c(xVar);
        xVar.c(c);
        return c;
    }

    public final x f() {
        byte[] bArr = this.a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        ax.Gb.l.e(copyOf, "copyOf(this, size)");
        return new x(copyOf, this.b, this.c, false, true);
    }

    public final void g(x xVar, int i) {
        ax.Gb.l.f(xVar, "sink");
        if (!xVar.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = xVar.c;
        if (i2 + i > 8192) {
            if (xVar.d) {
                throw new IllegalArgumentException();
            }
            int i3 = xVar.b;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = xVar.a;
            C3133i.h(bArr, bArr, 0, i3, i2, 2, null);
            xVar.c -= xVar.b;
            xVar.b = 0;
        }
        byte[] bArr2 = this.a;
        byte[] bArr3 = xVar.a;
        int i4 = xVar.c;
        int i5 = this.b;
        C3133i.d(bArr2, bArr3, i4, i5, i5 + i);
        xVar.c += i;
        this.b += i;
    }

    public x(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        ax.Gb.l.f(bArr, "data");
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }
}
