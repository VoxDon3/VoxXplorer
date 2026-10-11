package ax.O9;

import ax.N9.C0874v;
import ax.N9.D0;
import ax.N9.InterfaceC0836b0;
import ax.N9.b1;
import java.util.List;

/* loaded from: classes3.dex */
public class q extends ax.P9.c implements H {
    public q(String str, ax.M9.f fVar, List<ax.S9.c> list) {
        super(str, fVar, list);
    }

    @Override // ax.O9.H
    public D0 a() {
        return q(o());
    }

    @Override // ax.O9.H
    public InterfaceC0836b0 l() {
        return new C0874v(p("drive"), i(), null);
    }

    public D0 q(List<ax.S9.c> list) {
        return new b1(d(), i(), list);
    }
}
