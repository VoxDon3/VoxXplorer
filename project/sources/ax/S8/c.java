package ax.S8;

import ax.Y8.c;
import ax.Z8.a;
import ax.h9.C2171b;

/* loaded from: classes3.dex */
public abstract class c {
    private d a;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[d.values().length];
            a = iArr;
            try {
                iArr[d.SMB2_PREAUTH_INTEGRITY_CAPABILITIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[d.SMB2_ENCRYPTION_CAPABILITIES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[d.SMB2_COMPRESSION_CAPABILITIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[d.SMB2_NETNAME_NEGOTIATE_CONTEXT_ID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    protected c(d dVar) {
        this.a = dVar;
    }

    public static c a(C2171b c2171b) throws a.b {
        int J = c2171b.J();
        d dVar = (d) c.a.f(J, d.class, null);
        int i = a.a[dVar.ordinal()];
        if (i == 1) {
            return new f().c(c2171b);
        }
        if (i == 2) {
            return new b().c(c2171b);
        }
        if (i == 3) {
            return new ax.S8.a().c(c2171b);
        }
        if (i == 4) {
            return new e().c(c2171b);
        }
        throw new ax.k9.d("Unknown SMB2NegotiateContextType encountered: " + J + " / " + dVar);
    }

    private int e(C2171b c2171b) throws a.b {
        int J = c2171b.J();
        c2171b.U(4);
        return J;
    }

    private void h(C2171b c2171b, int i) {
        c2171b.s((int) this.a.getValue());
        c2171b.s(i);
        c2171b.Y();
    }

    public d b() {
        return this.a;
    }

    public final c c(C2171b c2171b) throws a.b {
        int e = e(c2171b);
        d(c2171b, e);
        int i = e % 8;
        int i2 = i == 0 ? 0 : 8 - i;
        if (i2 > 0 && c2171b.c() >= i2) {
            c2171b.U(i2);
        }
        return this;
    }

    protected void d(C2171b c2171b, int i) throws a.b {
        throw new UnsupportedOperationException("Should be implemented by specific message type");
    }

    public final int f(C2171b c2171b) {
        C2171b c2171b2 = new C2171b();
        int g = g(c2171b2);
        h(c2171b, g);
        c2171b.i(c2171b2);
        return g + 8;
    }

    protected int g(C2171b c2171b) {
        throw new UnsupportedOperationException("Should be implemented by specific SMB2NegotiateContext");
    }
}
