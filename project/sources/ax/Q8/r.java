package ax.Q8;

import ax.Y8.c;
import ax.Z8.a;
import ax.h9.AbstractC2174e;
import ax.h9.C2171b;

/* loaded from: classes3.dex */
public class r extends AbstractC2174e<t> {
    public r(byte[] bArr) throws a.b {
        super(new t(), bArr);
    }

    public long d() {
        return b().i();
    }

    public boolean e() {
        return b().j() != 0;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return c.a.c(b().g(), o.SMB2_FLAGS_ASYNC_COMMAND) && b().m() == ax.K8.a.STATUS_PENDING.getValue();
    }

    public boolean h() {
        return b().i() == -1 && b().h() == m.SMB2_OPLOCK_BREAK;
    }

    protected boolean i() {
        long m = b().m();
        return ax.K8.a.j(m) && m != ax.K8.a.STATUS_PENDING.getValue();
    }

    public r j() throws a.b {
        if (e()) {
            return new r(this.b);
        }
        return null;
    }

    public String toString() {
        return b().h() + " with message id << " + b().i() + " >>";
    }

    r(C2171b c2171b) throws a.b {
        super(new t(), c2171b);
    }
}
