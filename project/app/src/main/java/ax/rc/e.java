/*
 * Decompiled with CFR 0.152.
 */
package ax.rc;

import ax.rc.b;

public class e
extends b {
    private int t = 0;
    private long u;

    public e() {
        this.a(ax.pc.b.e0);
    }

    private long J(e e8) {
        if (e8.m() != null) {
            return e8.m().c();
        }
        return e8.K();
    }

    public long K() {
        return this.u;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            if (!super.equals(object)) {
                return false;
            }
            object = (e)object;
            if (this.J(this) == this.J((e)object)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return j.Objects.hash((Object[])new Object[]{this.i(), this.J(this)});
    }

    public String toString() {
        return this.i();
    }
}

