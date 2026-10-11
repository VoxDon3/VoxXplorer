package com.google.firebase.installations;

import androidx.annotation.Keep;
import ax.D7.C0661c;
import ax.D7.F;
import ax.D7.InterfaceC0663e;
import ax.D7.r;
import ax.E7.k;
import ax.x7.C3471f;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes3.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static /* synthetic */ ax.b8.e a(InterfaceC0663e interfaceC0663e) {
        return new c((C3471f) interfaceC0663e.a(C3471f.class), interfaceC0663e.d(ax.Z7.i.class), (ExecutorService) interfaceC0663e.c(F.a(ax.C7.a.class, ExecutorService.class)), k.b((Executor) interfaceC0663e.c(F.a(ax.C7.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0661c<?>> getComponents() {
        return Arrays.asList(C0661c.e(ax.b8.e.class).g(LIBRARY_NAME).b(r.j(C3471f.class)).b(r.h(ax.Z7.i.class)).b(r.i(F.a(ax.C7.a.class, ExecutorService.class))).b(r.i(F.a(ax.C7.b.class, Executor.class))).e(new ax.D7.h() { // from class: ax.b8.f
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                return FirebaseInstallationsRegistrar.a(interfaceC0663e);
            }
        }).c(), ax.Z7.h.a(), ax.h8.h.b(LIBRARY_NAME, "18.0.0"));
    }
}
