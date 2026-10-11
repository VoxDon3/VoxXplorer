package ax.Qb;

import ax.wb.f;
import ax.xb.C3479b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ax.Qb.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0939i {
    public static final <T> Q<T> a(J j, ax.wb.i iVar, L l, ax.Fb.p<? super J, ? super ax.wb.e<? super T>, ? extends Object> pVar) {
        ax.wb.i d = F.d(j, iVar);
        S b0 = l.j() ? new B0(d, pVar) : new S(d, true);
        ((AbstractC0923a) b0).N0(l, b0, pVar);
        return (Q<T>) b0;
    }

    public static /* synthetic */ Q b(J j, ax.wb.i iVar, L l, ax.Fb.p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = ax.wb.j.q;
        }
        if ((i & 2) != 0) {
            l = L.DEFAULT;
        }
        return C0935g.a(j, iVar, l, pVar);
    }

    public static final InterfaceC0959s0 c(J j, ax.wb.i iVar, L l, ax.Fb.p<? super J, ? super ax.wb.e<? super ax.sb.t>, ? extends Object> pVar) {
        ax.wb.i d = F.d(j, iVar);
        AbstractC0923a c0 = l.j() ? new C0(d, pVar) : new J0(d, true);
        c0.N0(l, c0, pVar);
        return c0;
    }

    public static /* synthetic */ InterfaceC0959s0 d(J j, ax.wb.i iVar, L l, ax.Fb.p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = ax.wb.j.q;
        }
        if ((i & 2) != 0) {
            l = L.DEFAULT;
        }
        return C0935g.c(j, iVar, l, pVar);
    }

    public static final <T> Object e(ax.wb.i iVar, ax.Fb.p<? super J, ? super ax.wb.e<? super T>, ? extends Object> pVar, ax.wb.e<? super T> eVar) {
        Object O0;
        ax.wb.i b = eVar.b();
        ax.wb.i e = F.e(b, iVar);
        w0.f(e);
        if (e == b) {
            ax.Vb.B b2 = new ax.Vb.B(e, eVar);
            O0 = ax.Wb.b.b(b2, b2, pVar);
        } else {
            f.b bVar = ax.wb.f.b0;
            if (ax.Gb.l.a(e.a(bVar), b.a(bVar))) {
                P0 p0 = new P0(e, eVar);
                ax.wb.i b3 = p0.b();
                Object c = ax.Vb.J.c(b3, null);
                try {
                    Object b4 = ax.Wb.b.b(p0, p0, pVar);
                    ax.Vb.J.a(b3, c);
                    O0 = b4;
                } catch (Throwable th) {
                    ax.Vb.J.a(b3, c);
                    throw th;
                }
            } else {
                U u = new U(e, eVar);
                ax.Wb.a.d(pVar, u, u, null, 4, null);
                O0 = u.O0();
            }
        }
        if (O0 == C3479b.c()) {
            ax.yb.h.c(eVar);
        }
        return O0;
    }
}
