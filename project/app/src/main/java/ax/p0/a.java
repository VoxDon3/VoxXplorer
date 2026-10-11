/*
 * Decompiled with CFR 0.152.
 */
package ax.p0;

import android.content.Context;
import ax.Gb.l;
import ax.Qb.J;
import ax.Qb.K;
import ax.Qb.L0;
import ax.Qb.Y;
import ax.n0.d;
import ax.n0.f;
import ax.o0.b;
import ax.p0.c;
import java.util.List;

public final class a {
    public static final ax.Ib.a<Context, f<ax.q0.d>> a(String string, b<ax.q0.d> b8, ax.Fb.l<? super Context, ? extends List<? extends d<ax.q0.d>>> l8, J j8) {
        l.f(string, "name");
        l.f(l8, "produceMigrations");
        l.f(j8, "scope");
        return new c(string, b8, l8, j8);
    }

    public static /* synthetic */ ax.Ib.a b(String string, b b8, ax.Fb.l l8, J j8, int n8, Object object) {
        if ((n8 & 2) != 0) {
            b8 = null;
        }
        if ((n8 & 4) != 0) {
            l8 = a.q;
        }
        if ((n8 & 8) != 0) {
            j8 = K.a(Y.b().p(L0.b(null, 1, null)));
        }
        return a.a(string, b8, l8, j8);
    }
}

