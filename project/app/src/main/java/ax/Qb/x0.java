/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.s0;
import ax.Qb.v0;
import ax.Qb.w0;
import ax.Qb.x;
import ax.wb.i;
import java.util.concurrent.CancellationException;

final class x0 {
    public static final x a(s0 s02) {
        return new v0(s02);
    }

    public static /* synthetic */ x b(s0 s02, int n8, Object object) {
        if ((n8 & 1) != 0) {
            s02 = null;
        }
        return w0.a(s02);
    }

    public static final void c(i i8, CancellationException cancellationException) {
        if ((i8 = i8.a(s0.c)) != null) {
            i8.L0(cancellationException);
        }
    }

    public static /* synthetic */ void d(i i8, CancellationException cancellationException, int n8, Object object) {
        if ((n8 & 1) != 0) {
            cancellationException = null;
        }
        w0.c(i8, cancellationException);
    }

    public static final void e(s0 s02) {
        if (s02.e()) {
            return;
        }
        throw s02.o();
    }

    public static final void f(i i8) {
        if ((i8 = i8.a(s0.c)) != null) {
            w0.e((s0)i8);
        }
    }
}

