package ax.Qb;

import ax.sb.C3082n;

/* renamed from: ax.Qb.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0963w {
    public static final <T> InterfaceC0961u<T> a(InterfaceC0959s0 interfaceC0959s0) {
        return new C0962v(interfaceC0959s0);
    }

    public static /* synthetic */ InterfaceC0961u b(InterfaceC0959s0 interfaceC0959s0, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC0959s0 = null;
        }
        return a(interfaceC0959s0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean c(InterfaceC0961u<T> interfaceC0961u, Object obj) {
        Throwable b = C3082n.b(obj);
        return b == null ? interfaceC0961u.u0(obj) : interfaceC0961u.o0(b);
    }
}
