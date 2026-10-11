package com.google.firebase.crashlytics;

import ax.D7.C0661c;
import ax.D7.InterfaceC0663e;
import ax.D7.h;
import ax.D7.r;
import ax.b8.e;
import ax.l8.InterfaceC2482a;
import ax.o8.C2732a;
import ax.o8.InterfaceC2733b;
import ax.x7.C3471f;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    static {
        C2732a.a(InterfaceC2733b.a.CRASHLYTICS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public a b(InterfaceC0663e interfaceC0663e) {
        return a.b((C3471f) interfaceC0663e.a(C3471f.class), (e) interfaceC0663e.a(e.class), interfaceC0663e.i(ax.G7.a.class), interfaceC0663e.i(ax.A7.a.class), interfaceC0663e.i(InterfaceC2482a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0661c<?>> getComponents() {
        return Arrays.asList(C0661c.e(a.class).g("fire-cls").b(r.j(C3471f.class)).b(r.j(e.class)).b(r.a(ax.G7.a.class)).b(r.a(ax.A7.a.class)).b(r.a(InterfaceC2482a.class)).e(new h() { // from class: ax.F7.f
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                com.google.firebase.crashlytics.a b;
                b = CrashlyticsRegistrar.this.b(interfaceC0663e);
                return b;
            }
        }).d().c(), ax.h8.h.b("fire-cls", "19.0.3"));
    }
}
