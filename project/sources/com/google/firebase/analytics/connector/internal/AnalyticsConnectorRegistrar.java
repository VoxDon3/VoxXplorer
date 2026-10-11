package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import ax.A7.b;
import ax.D7.C0661c;
import ax.D7.InterfaceC0663e;
import ax.D7.h;
import ax.D7.r;
import ax.Y7.d;
import ax.x7.C3471f;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<C0661c<?>> getComponents() {
        return Arrays.asList(C0661c.e(ax.A7.a.class).b(r.j(C3471f.class)).b(r.j(Context.class)).b(r.j(d.class)).e(new h() { // from class: com.google.firebase.analytics.connector.internal.a
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                ax.A7.a g;
                g = b.g((C3471f) interfaceC0663e.a(C3471f.class), (Context) interfaceC0663e.a(Context.class), (d) interfaceC0663e.a(d.class));
                return g;
            }
        }).d().c(), ax.h8.h.b("fire-analytics", "22.0.2"));
    }
}
