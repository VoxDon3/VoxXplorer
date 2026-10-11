package ax.Qb;

/* loaded from: classes3.dex */
public final class N0 {
    public static final N0 a = new N0();
    private static final ThreadLocal<AbstractC0928c0> b = ax.Vb.K.a(new ax.Vb.F("ThreadLocalEventLoop"));

    private N0() {
    }

    public final AbstractC0928c0 a() {
        return b.get();
    }

    public final AbstractC0928c0 b() {
        ThreadLocal<AbstractC0928c0> threadLocal = b;
        AbstractC0928c0 abstractC0928c0 = threadLocal.get();
        if (abstractC0928c0 != null) {
            return abstractC0928c0;
        }
        AbstractC0928c0 a2 = C0934f0.a();
        threadLocal.set(a2);
        return a2;
    }

    public final void c() {
        b.set(null);
    }

    public final void d(AbstractC0928c0 abstractC0928c0) {
        b.set(abstractC0928c0);
    }
}
