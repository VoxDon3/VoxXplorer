package ax.Vb;

import ax.Qb.AbstractC0928c0;
import ax.Qb.InterfaceC0959s0;
import ax.Qb.N0;
import ax.Qb.P0;
import ax.sb.C3082n;
import ax.sb.C3083o;
import java.util.concurrent.CancellationException;

/* renamed from: ax.Vb.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1004k {
    private static final F a = new F("UNDEFINED");
    public static final F b = new F("REUSABLE_CLAIMED");

    public static final <T> void b(ax.wb.e<? super T> eVar, Object obj, ax.Fb.l<? super Throwable, ax.sb.t> lVar) {
        if (!(eVar instanceof C1003j)) {
            eVar.f(obj);
            return;
        }
        C1003j c1003j = (C1003j) eVar;
        Object b2 = ax.Qb.D.b(obj, lVar);
        if (c1003j.e0.f(c1003j.b())) {
            c1003j.g0 = b2;
            c1003j.d0 = 1;
            c1003j.e0.b(c1003j.b(), c1003j);
            return;
        }
        AbstractC0928c0 b3 = N0.a.b();
        if (b3.g1()) {
            c1003j.g0 = b2;
            c1003j.d0 = 1;
            b3.c1(c1003j);
            return;
        }
        b3.e1(true);
        try {
            InterfaceC0959s0 interfaceC0959s0 = (InterfaceC0959s0) c1003j.b().a(InterfaceC0959s0.c);
            if (interfaceC0959s0 == null || interfaceC0959s0.e()) {
                ax.wb.e<T> eVar2 = c1003j.f0;
                Object obj2 = c1003j.h0;
                ax.wb.i b4 = eVar2.b();
                Object c = J.c(b4, obj2);
                P0<?> g = c != J.a ? ax.Qb.F.g(eVar2, b4, c) : null;
                try {
                    c1003j.f0.f(obj);
                    ax.sb.t tVar = ax.sb.t.a;
                } finally {
                    if (g == null || g.O0()) {
                        J.a(b4, c);
                    }
                }
            } else {
                CancellationException o = interfaceC0959s0.o();
                c1003j.c(b2, o);
                C3082n.a aVar = C3082n.q;
                c1003j.f(C3082n.a(C3083o.a(o)));
            }
            while (b3.j1()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static /* synthetic */ void c(ax.wb.e eVar, Object obj, ax.Fb.l lVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        b(eVar, obj, lVar);
    }
}
