package ax.q8;

import ax.D7.C0661c;
import ax.D7.InterfaceC0663e;
import ax.D7.h;
import ax.D7.j;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ax.q8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2887b implements j {
    public static /* synthetic */ Object b(String str, C0661c c0661c, InterfaceC0663e interfaceC0663e) {
        try {
            C2888c.b(str);
            return c0661c.h().a(interfaceC0663e);
        } finally {
            C2888c.a();
        }
    }

    @Override // ax.D7.j
    public List<C0661c<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final C0661c<?> c0661c : componentRegistrar.getComponents()) {
            final String i = c0661c.i();
            if (i != null) {
                c0661c = c0661c.r(new h() { // from class: ax.q8.a
                    @Override // ax.D7.h
                    public final Object a(InterfaceC0663e interfaceC0663e) {
                        return C2887b.b(i, c0661c, interfaceC0663e);
                    }
                });
            }
            arrayList.add(c0661c);
        }
        return arrayList;
    }
}
