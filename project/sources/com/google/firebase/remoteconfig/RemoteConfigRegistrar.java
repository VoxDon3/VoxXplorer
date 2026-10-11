package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import ax.D7.C0661c;
import ax.D7.F;
import ax.D7.InterfaceC0663e;
import ax.D7.h;
import ax.D7.r;
import ax.b8.e;
import ax.l8.InterfaceC2482a;
import ax.x7.C3471f;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

@Keep
/* loaded from: classes3.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    public static /* synthetic */ c a(F f, InterfaceC0663e interfaceC0663e) {
        return new c((Context) interfaceC0663e.a(Context.class), (ScheduledExecutorService) interfaceC0663e.c(f), (C3471f) interfaceC0663e.a(C3471f.class), (e) interfaceC0663e.a(e.class), ((com.google.firebase.abt.component.a) interfaceC0663e.a(com.google.firebase.abt.component.a.class)).b("frc"), interfaceC0663e.d(ax.A7.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0661c<?>> getComponents() {
        final F a = F.a(ax.C7.b.class, ScheduledExecutorService.class);
        return Arrays.asList(C0661c.f(c.class, InterfaceC2482a.class).g(LIBRARY_NAME).b(r.j(Context.class)).b(r.i(a)).b(r.j(C3471f.class)).b(r.j(e.class)).b(r.j(com.google.firebase.abt.component.a.class)).b(r.h(ax.A7.a.class)).e(new h() { // from class: ax.i8.o
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                return RemoteConfigRegistrar.a(F.this, interfaceC0663e);
            }
        }).d().c(), ax.h8.h.b(LIBRARY_NAME, "22.0.0"));
    }
}
