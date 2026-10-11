/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Qb.H;
import ax.Vb.h;
import ax.sb.a;
import ax.wb.i;

public final class I {
    public static final void a(i i8, Throwable throwable) {
        Throwable throwable22;
        block4: {
            block3: {
                H h8;
                try {
                    h8 = i8.a(H.b);
                    if (h8 == null) break block3;
                }
                catch (Throwable throwable22) {}
                h8.d0(i8, throwable);
                return;
                break block4;
            }
            h.a(i8, throwable);
            return;
        }
        h.a(i8, I.b(throwable, throwable22));
    }

    public static final Throwable b(Throwable throwable, Throwable throwable2) {
        if (throwable == throwable2) {
            return throwable;
        }
        throwable2 = new RuntimeException("Exception while trying to handle coroutine exception", throwable2);
        a.a(throwable2, throwable);
        return throwable2;
    }
}

