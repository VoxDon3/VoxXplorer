/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase;

import androidx.annotation.Keep;
import ax.D7.F;
import ax.D7.r;
import ax.Gb.l;
import ax.Qb.G;
import ax.tb.o;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;

@Keep
public final class FirebaseCommonKtxRegistrar
implements ComponentRegistrar {
    @Override
    public List<ax.D7.c<?>> getComponents() {
        ax.D7.c<G> c8 = ax.D7.c.c(F.a(ax.C7.a.class, G.class)).b(r.i(F.a(ax.C7.a.class, Executor.class))).e(a.a).c();
        l.e(c8, "builder(Qualified.qualif\u2026cher()\n    }\n    .build()");
        ax.D7.c<G> c9 = ax.D7.c.c(F.a(ax.C7.c.class, G.class)).b(r.i(F.a(ax.C7.c.class, Executor.class))).e(b.a).c();
        l.e(c9, "builder(Qualified.qualif\u2026cher()\n    }\n    .build()");
        ax.D7.c<G> c10 = ax.D7.c.c(F.a(ax.C7.b.class, G.class)).b(r.i(F.a(ax.C7.b.class, Executor.class))).e(c.a).c();
        l.e(c10, "builder(Qualified.qualif\u2026cher()\n    }\n    .build()");
        ax.D7.c<G> c11 = ax.D7.c.c(F.a(ax.C7.d.class, G.class)).b(r.i(F.a(ax.C7.d.class, Executor.class))).e(d.a).c();
        l.e(c11, "builder(Qualified.qualif\u2026cher()\n    }\n    .build()");
        return o.l(c8, c9, c10, c11);
    }
}

