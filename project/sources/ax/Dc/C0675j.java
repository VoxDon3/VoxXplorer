package ax.Dc;

/* renamed from: ax.Dc.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0675j implements Cloneable {
    private boolean c0;
    private boolean d0;
    private boolean e0;
    private int f0;
    private int g0;
    private boolean q;

    public static C0675j f(byte[] bArr, int i) {
        int h = W.h(bArr, i);
        C0675j c0675j = new C0675j();
        c0675j.h((h & 8) != 0);
        c0675j.k((h & 2048) != 0);
        c0675j.j((h & 64) != 0);
        c0675j.i((h & 1) != 0);
        c0675j.f0 = (h & 2) != 0 ? 8192 : 4096;
        c0675j.g0 = (h & 4) != 0 ? 3 : 2;
        return c0675j;
    }

    public void b(byte[] bArr, int i) {
        W.i((this.c0 ? 8 : 0) | (this.q ? 2048 : 0) | (this.d0 ? 1 : 0) | (this.e0 ? 64 : 0), bArr, i);
    }

    int c() {
        return this.g0;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("GeneralPurposeBit is not Cloneable?", e);
        }
    }

    int d() {
        return this.f0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0675j)) {
            return false;
        }
        C0675j c0675j = (C0675j) obj;
        return c0675j.d0 == this.d0 && c0675j.e0 == this.e0 && c0675j.q == this.q && c0675j.c0 == this.c0;
    }

    public void h(boolean z) {
        this.c0 = z;
    }

    public int hashCode() {
        return (((((((this.d0 ? 1 : 0) * 17) + (this.e0 ? 1 : 0)) * 13) + (this.q ? 1 : 0)) * 7) + (this.c0 ? 1 : 0)) * 3;
    }

    public void i(boolean z) {
        this.d0 = z;
    }

    public void j(boolean z) {
        this.e0 = z;
        if (z) {
            i(true);
        }
    }

    public void k(boolean z) {
        this.q = z;
    }

    public boolean l() {
        return this.d0;
    }

    public boolean m() {
        return this.q;
    }
}
