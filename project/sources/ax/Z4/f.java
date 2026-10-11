package ax.Z4;

import ax.T4.k;
import ax.T4.l;

/* loaded from: classes.dex */
public class f extends l {
    protected final f d;
    protected b e;
    protected f f;
    protected String g;
    protected Object h;
    protected boolean i;

    protected f(int i, f fVar, b bVar) {
        this.a = i;
        this.d = fVar;
        this.e = bVar;
        this.b = -1;
    }

    private final void i(b bVar, String str) throws k {
        if (bVar.c(str)) {
            Object b = bVar.b();
            throw new ax.T4.f("Duplicate field '" + str + "'", b instanceof ax.T4.g ? (ax.T4.g) b : null);
        }
    }

    public static f m(b bVar) {
        return new f(0, null, bVar);
    }

    @Override // ax.T4.l
    public final String b() {
        return this.g;
    }

    public f j() {
        this.h = null;
        return this.d;
    }

    public f k() {
        f fVar = this.f;
        if (fVar != null) {
            return fVar.n(1);
        }
        b bVar = this.e;
        f fVar2 = new f(1, this, bVar == null ? null : bVar.a());
        this.f = fVar2;
        return fVar2;
    }

    public f l() {
        f fVar = this.f;
        if (fVar != null) {
            return fVar.n(2);
        }
        b bVar = this.e;
        f fVar2 = new f(2, this, bVar == null ? null : bVar.a());
        this.f = fVar2;
        return fVar2;
    }

    public f n(int i) {
        this.a = i;
        this.b = -1;
        this.g = null;
        this.i = false;
        this.h = null;
        b bVar = this.e;
        if (bVar != null) {
            bVar.d();
        }
        return this;
    }

    public int o(String str) throws k {
        if (this.a != 2 || this.i) {
            return 4;
        }
        this.i = true;
        this.g = str;
        b bVar = this.e;
        if (bVar != null) {
            i(bVar, str);
        }
        return this.b < 0 ? 0 : 1;
    }

    public int p() {
        int i = this.a;
        if (i == 2) {
            if (!this.i) {
                return 5;
            }
            this.i = false;
            this.b++;
            return 2;
        }
        if (i == 1) {
            int i2 = this.b;
            this.b = i2 + 1;
            return i2 < 0 ? 0 : 1;
        }
        int i3 = this.b + 1;
        this.b = i3;
        return i3 == 0 ? 0 : 3;
    }
}
