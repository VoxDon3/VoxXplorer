package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import ax.D7.C0661c;
import ax.D7.F;
import ax.D7.InterfaceC0663e;
import ax.D7.h;
import ax.D7.r;
import ax.S7.b;
import ax.n5.i;
import ax.p5.u;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ i a(InterfaceC0663e interfaceC0663e) {
        u.f((Context) interfaceC0663e.a(Context.class));
        return u.c().g(a.g);
    }

    public static /* synthetic */ i b(InterfaceC0663e interfaceC0663e) {
        u.f((Context) interfaceC0663e.a(Context.class));
        return u.c().g(a.h);
    }

    public static /* synthetic */ i c(InterfaceC0663e interfaceC0663e) {
        u.f((Context) interfaceC0663e.a(Context.class));
        return u.c().g(a.h);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0661c<?>> getComponents() {
        return Arrays.asList(C0661c.e(i.class).g(LIBRARY_NAME).b(r.j(Context.class)).e(new h() { // from class: ax.S7.c
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                return TransportRegistrar.c(interfaceC0663e);
            }
        }).c(), C0661c.c(F.a(ax.S7.a.class, i.class)).b(r.j(Context.class)).e(new h() { // from class: ax.S7.d
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                return TransportRegistrar.b(interfaceC0663e);
            }
        }).c(), C0661c.c(F.a(b.class, i.class)).b(r.j(Context.class)).e(new h() { // from class: ax.S7.e
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                return TransportRegistrar.a(interfaceC0663e);
            }
        }).c(), ax.h8.h.b(LIBRARY_NAME, "19.0.0"));
    }
}
