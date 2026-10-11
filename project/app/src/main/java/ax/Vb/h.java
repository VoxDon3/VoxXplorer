/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Qb.H;
import ax.Qb.I;
import ax.Vb.g;
import ax.Vb.i;
import ax.sb.a;

public final class h {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void a(ax.wb.i i8, Throwable throwable) {
        for (H h8 : g.a()) {
            try {
                h8.d0(i8, throwable);
            }
            catch (Throwable throwable2) {
                g.b(I.b(throwable, throwable2));
            }
        }
        try {
            Object object = new i(i8);
            a.a(throwable, (Throwable)object);
        }
        catch (Throwable throwable3) {}
        g.b(throwable);
    }
}

