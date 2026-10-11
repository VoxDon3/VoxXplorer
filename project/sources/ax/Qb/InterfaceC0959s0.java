package ax.Qb;

import ax.wb.i;
import java.util.concurrent.CancellationException;

/* renamed from: ax.Qb.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC0959s0 extends i.b {
    public static final b c = b.q;

    /* renamed from: ax.Qb.s0$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC0959s0 interfaceC0959s0, CancellationException cancellationException, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i & 1) != 0) {
                cancellationException = null;
            }
            interfaceC0959s0.L0(cancellationException);
        }

        public static <R> R b(InterfaceC0959s0 interfaceC0959s0, R r, ax.Fb.p<? super R, ? super i.b, ? extends R> pVar) {
            return (R) i.b.a.a(interfaceC0959s0, r, pVar);
        }

        public static <E extends i.b> E c(InterfaceC0959s0 interfaceC0959s0, i.c<E> cVar) {
            return (E) i.b.a.b(interfaceC0959s0, cVar);
        }

        public static /* synthetic */ Z d(InterfaceC0959s0 interfaceC0959s0, boolean z, boolean z2, ax.Fb.l lVar, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = true;
            }
            return interfaceC0959s0.A0(z, z2, lVar);
        }

        public static ax.wb.i e(InterfaceC0959s0 interfaceC0959s0, i.c<?> cVar) {
            return i.b.a.c(interfaceC0959s0, cVar);
        }

        public static ax.wb.i f(InterfaceC0959s0 interfaceC0959s0, ax.wb.i iVar) {
            return i.b.a.d(interfaceC0959s0, iVar);
        }
    }

    /* renamed from: ax.Qb.s0$b */
    public static final class b implements i.c<InterfaceC0959s0> {
        static final /* synthetic */ b q = new b();

        private b() {
        }
    }

    Z A0(boolean z, boolean z2, ax.Fb.l<? super Throwable, ax.sb.t> lVar);

    Z F(ax.Fb.l<? super Throwable, ax.sb.t> lVar);

    void L0(CancellationException cancellationException);

    boolean e();

    InterfaceC0959s0 getParent();

    boolean isCancelled();

    CancellationException o();

    r q(InterfaceC0960t interfaceC0960t);

    boolean start();
}
