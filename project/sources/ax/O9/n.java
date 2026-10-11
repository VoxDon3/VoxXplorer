package ax.O9;

import ax.N9.C0863p;
import ax.N9.C0872u;
import ax.N9.InterfaceC0834a0;
import ax.N9.U;
import java.util.List;

/* loaded from: classes3.dex */
public class n extends ax.P9.c implements E {
    public n(String str, ax.M9.f fVar, List<ax.S9.c> list) {
        super(str, fVar, list);
    }

    @Override // ax.O9.E
    public InterfaceC0834a0 a() {
        return q(o());
    }

    @Override // ax.O9.E
    public U g() {
        return new C0863p(p("root"), i(), null);
    }

    @Override // ax.O9.E
    public U n(String str) {
        return new C0863p(p("items") + "/" + str, i(), null);
    }

    public InterfaceC0834a0 q(List<ax.S9.c> list) {
        return new C0872u(d(), i(), list);
    }
}
