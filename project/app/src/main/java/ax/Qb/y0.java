/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Gb.l;
import ax.Qb.B;
import ax.Qb.E0;
import ax.Qb.N;
import ax.Qb.Z;
import ax.Qb.n0;
import ax.Qb.z0;

public abstract class y0
extends B
implements Z,
n0 {
    public z0 e0;

    @Override
    public E0 a() {
        return null;
    }

    @Override
    public void d() {
        this.y().r0(this);
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(N.a(this));
        stringBuilder.append('@');
        stringBuilder.append(N.b(this));
        stringBuilder.append("[job@");
        stringBuilder.append(N.b(this.y()));
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final z0 y() {
        z0 z02 = this.e0;
        if (z02 != null) {
            return z02;
        }
        l.t("job");
        return null;
    }

    public final void z(z0 z02) {
        this.e0 = z02;
    }
}

