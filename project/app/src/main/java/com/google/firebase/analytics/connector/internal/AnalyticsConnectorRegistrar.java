/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import ax.A7.b;
import ax.D7.c;
import ax.D7.e;
import ax.D7.r;
import ax.Y7.d;
import ax.h8.h;
import ax.x7.f;
import com.google.firebase.analytics.connector.internal.a;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
public class AnalyticsConnectorRegistrar
implements ComponentRegistrar {
    static /* synthetic */ ax.A7.a lambda$getComponents$0(e e8) {
        return b.g(e8.a(f.class), e8.a(Context.class), e8.a(d.class));
    }

    @Override
    @SuppressLint(value={"MissingPermission"})
    @Keep
    public List<c<?>> getComponents() {
        return Arrays.asList(c.e(ax.A7.a.class).b(r.j(f.class)).b(r.j(Context.class)).b(r.j(d.class)).e(new a()).d().c(), h.b("fire-analytics", "22.0.2"));
    }
}

