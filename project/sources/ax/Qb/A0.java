package ax.Qb;

/* loaded from: classes3.dex */
public final class A0 {
    private static final ax.Vb.F a = new ax.Vb.F("COMPLETING_ALREADY");
    public static final ax.Vb.F b = new ax.Vb.F("COMPLETING_WAITING_CHILDREN");
    private static final ax.Vb.F c = new ax.Vb.F("COMPLETING_RETRY");
    private static final ax.Vb.F d = new ax.Vb.F("TOO_LATE_TO_CANCEL");
    private static final ax.Vb.F e = new ax.Vb.F("SEALED");
    private static final C0926b0 f = new C0926b0(false);
    private static final C0926b0 g = new C0926b0(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC0950n0 ? new C0952o0((InterfaceC0950n0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC0950n0 interfaceC0950n0;
        C0952o0 c0952o0 = obj instanceof C0952o0 ? (C0952o0) obj : null;
        return (c0952o0 == null || (interfaceC0950n0 = c0952o0.a) == null) ? obj : interfaceC0950n0;
    }
}
