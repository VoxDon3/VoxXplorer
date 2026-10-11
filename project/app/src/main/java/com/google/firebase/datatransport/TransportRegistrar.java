/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import ax.D7.F;
import ax.D7.c;
import ax.D7.r;
import ax.S7.b;
import ax.S7.d;
import ax.S7.e;
import ax.h8.h;
import ax.n5.i;
import ax.p5.u;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
public class TransportRegistrar
implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ i a(ax.D7.e e8) {
        u.f(e8.a(Context.class));
        return u.c().g(a.g);
    }

    public static /* synthetic */ i b(ax.D7.e e8) {
        u.f(e8.a(Context.class));
        return u.c().g(a.h);
    }

    public static /* synthetic */ i c(ax.D7.e e8) {
        u.f(e8.a(Context.class));
        return u.c().g(a.h);
    }

    @Override
    public List<c<?>> getComponents() {
        return Arrays.asList(c.e(i.class).g(LIBRARY_NAME).b(r.j(Context.class)).e(new ax.S7.c()).c(), c.c(F.a(ax.S7.a.class, i.class)).b(r.j(Context.class)).e(new d()).c(), c.c(F.a(b.class, i.class)).b(r.j(Context.class)).e(new e()).c(), h.b(LIBRARY_NAME, "19.0.0"));
    }
}

