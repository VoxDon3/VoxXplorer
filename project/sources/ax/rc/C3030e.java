package ax.rc;

import j$.util.Objects;

/* renamed from: ax.rc.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3030e extends AbstractC3027b {
    private int t = 0;
    private long u;

    public C3030e() {
        a(ax.pc.b.CENTRAL_DIRECTORY);
    }

    private long J(C3030e c3030e) {
        return c3030e.m() != null ? c3030e.m().c() : c3030e.K();
    }

    public long K() {
        return this.u;
    }

    @Override // ax.rc.AbstractC3027b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && super.equals(obj) && J(this) == J((C3030e) obj);
    }

    public int hashCode() {
        return Objects.hash(i(), Long.valueOf(J(this)));
    }

    public String toString() {
        return i();
    }
}
