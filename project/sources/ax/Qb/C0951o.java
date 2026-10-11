package ax.Qb;

import ax.Vb.C1003j;

/* renamed from: ax.Qb.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0951o {
    public static final void a(InterfaceC0945l<?> interfaceC0945l, Z z) {
        interfaceC0945l.r(new C0924a0(z));
    }

    public static final <T> C0947m<T> b(ax.wb.e<? super T> eVar) {
        if (!(eVar instanceof C1003j)) {
            return new C0947m<>(eVar, 1);
        }
        C0947m<T> o = ((C1003j) eVar).o();
        if (o != null) {
            if (!o.M()) {
                o = null;
            }
            if (o != null) {
                return o;
            }
        }
        return new C0947m<>(eVar, 2);
    }
}
