/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.s;
import ax.Qb.s0;
import ax.Qb.x;
import ax.Qb.y0;
import ax.Qb.z0;

public class v0
extends z0
implements x {
    private final boolean d0;

    public v0(s0 s02) {
        super(true);
        this.Z(s02);
        this.d0 = this.I0();
    }

    private final boolean I0() {
        Object object = this.V();
        object = object instanceof s ? (s)object : null;
        if (object != null) {
            z0 z02 = ((y0)object).y();
            object = z02;
            if (z02 != null) {
                do {
                    if (((z0)object).S()) {
                        return true;
                    }
                    if ((object = (object = ((z0)object).V()) instanceof s ? (s)object : null) == null) break;
                    z02 = ((y0)object).y();
                    object = z02;
                } while (z02 != null);
            }
        }
        return false;
    }

    @Override
    public boolean S() {
        return this.d0;
    }

    @Override
    public boolean T() {
        return true;
    }
}

