package ax.b6;

/* renamed from: ax.b6.v2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1685v2 {
    private static InterfaceC1717z2 a;

    public static synchronized InterfaceC1717z2 a() {
        InterfaceC1717z2 interfaceC1717z2;
        synchronized (C1685v2.class) {
            try {
                if (a == null) {
                    b(new C1701x2());
                }
                interfaceC1717z2 = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1717z2;
    }

    private static synchronized void b(InterfaceC1717z2 interfaceC1717z2) {
        synchronized (C1685v2.class) {
            if (a != null) {
                throw new IllegalStateException("init() already called");
            }
            a = interfaceC1717z2;
        }
    }
}
