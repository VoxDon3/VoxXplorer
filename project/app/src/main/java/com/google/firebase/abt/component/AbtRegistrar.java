/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import ax.D7.c;
import ax.D7.e;
import ax.D7.r;
import ax.h8.h;
import com.google.firebase.abt.component.a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
public class AbtRegistrar
implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ a a(e e8) {
        return new a(e8.a(Context.class), e8.d(ax.A7.a.class));
    }

    @Override
    public List<c<?>> getComponents() {
        return Arrays.asList(c.e(a.class).g(LIBRARY_NAME).b(r.j(Context.class)).b(r.h(ax.A7.a.class)).e(new ax.z7.a()).c(), h.b(LIBRARY_NAME, "21.1.1"));
    }
}

