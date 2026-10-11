package ax.Qb;

import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final /* synthetic */ class x0 {
    public static final InterfaceC0964x a(InterfaceC0959s0 interfaceC0959s0) {
        return new v0(interfaceC0959s0);
    }

    public static /* synthetic */ InterfaceC0964x b(InterfaceC0959s0 interfaceC0959s0, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC0959s0 = null;
        }
        return w0.a(interfaceC0959s0);
    }

    public static final void c(ax.wb.i iVar, CancellationException cancellationException) {
        InterfaceC0959s0 interfaceC0959s0 = (InterfaceC0959s0) iVar.a(InterfaceC0959s0.c);
        if (interfaceC0959s0 != null) {
            interfaceC0959s0.L0(cancellationException);
        }
    }

    public static /* synthetic */ void d(ax.wb.i iVar, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        w0.c(iVar, cancellationException);
    }

    public static final void e(InterfaceC0959s0 interfaceC0959s0) {
        if (!interfaceC0959s0.e()) {
            throw interfaceC0959s0.o();
        }
    }

    public static final void f(ax.wb.i iVar) {
        InterfaceC0959s0 interfaceC0959s0 = (InterfaceC0959s0) iVar.a(InterfaceC0959s0.c);
        if (interfaceC0959s0 != null) {
            w0.e(interfaceC0959s0);
        }
    }
}
