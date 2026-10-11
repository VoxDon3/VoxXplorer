package ax.b6;

import j$.util.DesugarCollections;
import java.util.List;
import java.util.Map;

/* renamed from: ax.b6.p5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1641p5 extends C1617m5 {
    C1641p5() {
        super();
    }

    @Override // ax.b6.C1617m5
    public final void m() {
        if (!o()) {
            for (int i = 0; i < a(); i++) {
                Map.Entry f = f(i);
                if (((InterfaceC1554f4) f.getKey()).f()) {
                    f.setValue(DesugarCollections.unmodifiableList((List) f.getValue()));
                }
            }
            for (Map.Entry entry : g()) {
                if (((InterfaceC1554f4) entry.getKey()).f()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.m();
    }
}
