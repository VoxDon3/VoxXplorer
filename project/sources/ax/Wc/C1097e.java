package ax.Wc;

import java.io.IOException;

/* renamed from: ax.Wc.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1097e extends A {
    static final O c0 = new a(C1097e.class, 1);
    public static final C1097e d0 = new C1097e((byte) 0);
    public static final C1097e e0 = new C1097e((byte) -1);
    private final byte q;

    /* renamed from: ax.Wc.e$a */
    static class a extends O {
        a(Class cls, int i) {
            super(cls, i);
        }

        @Override // ax.Wc.O
        A d(C1127t0 c1127t0) {
            return C1097e.C(c1127t0.G());
        }
    }

    private C1097e(byte b) {
        this.q = b;
    }

    static C1097e C(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        byte b = bArr[0];
        return b != -1 ? b != 0 ? new C1097e(b) : d0 : e0;
    }

    public static C1097e D(Object obj) {
        if (obj == null || (obj instanceof C1097e)) {
            return (C1097e) obj;
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
        }
        try {
            return (C1097e) c0.b((byte[]) obj);
        } catch (IOException e) {
            throw new IllegalArgumentException("failed to construct boolean from byte[]: " + e.getMessage());
        }
    }

    public static C1097e E(boolean z) {
        return z ? e0 : d0;
    }

    @Override // ax.Wc.A
    A A() {
        return G() ? e0 : d0;
    }

    public boolean G() {
        return this.q != 0;
    }

    @Override // ax.Wc.A, ax.Wc.AbstractC1126t
    public int hashCode() {
        return G() ? 1 : 0;
    }

    @Override // ax.Wc.A
    boolean r(A a2) {
        return (a2 instanceof C1097e) && G() == ((C1097e) a2).G();
    }

    @Override // ax.Wc.A
    void s(C1136y c1136y, boolean z) throws IOException {
        c1136y.m(z, 1, this.q);
    }

    @Override // ax.Wc.A
    boolean t() {
        return false;
    }

    public String toString() {
        return G() ? "TRUE" : "FALSE";
    }

    @Override // ax.Wc.A
    int w(boolean z) {
        return C1136y.g(z, 1);
    }
}
