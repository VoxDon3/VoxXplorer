package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import ax.D7.C0661c;
import ax.D7.InterfaceC0663e;
import ax.D7.h;
import ax.D7.r;
import com.google.firebase.abt.component.AbtRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes3.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    public static /* synthetic */ a a(InterfaceC0663e interfaceC0663e) {
        return new a((Context) interfaceC0663e.a(Context.class), interfaceC0663e.d(ax.A7.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0661c<?>> getComponents() {
        return Arrays.asList(C0661c.e(a.class).g(LIBRARY_NAME).b(r.j(Context.class)).b(r.h(ax.A7.a.class)).e(new h() { // from class: ax.z7.a
            @Override // ax.D7.h
            public final Object a(InterfaceC0663e interfaceC0663e) {
                return AbtRegistrar.a(interfaceC0663e);
            }
        }).c(), ax.h8.h.b(LIBRARY_NAME, "21.1.1"));
    }
}
