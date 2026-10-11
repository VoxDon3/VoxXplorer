package ax.Wc;

/* loaded from: classes3.dex */
public abstract class r extends A {
    static final O q = new a(r.class, 5);

    static class a extends O {
        a(Class cls, int i) {
            super(cls, i);
        }

        @Override // ax.Wc.O
        A d(C1127t0 c1127t0) {
            return r.C(c1127t0.G());
        }
    }

    r() {
    }

    static r C(byte[] bArr) {
        if (bArr.length == 0) {
            return C1123r0.c0;
        }
        throw new IllegalStateException("malformed NULL encoding encountered");
    }

    @Override // ax.Wc.A, ax.Wc.AbstractC1126t
    public int hashCode() {
        return -1;
    }

    @Override // ax.Wc.A
    boolean r(A a2) {
        return a2 instanceof r;
    }

    public String toString() {
        return "NULL";
    }
}
