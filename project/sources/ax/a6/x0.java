package ax.a6;

/* loaded from: classes3.dex */
public final class x0 implements B0 {
    private static final Object c = new Object();
    private volatile B0 a;
    private volatile Object b = c;

    private x0(B0 b0) {
        this.a = b0;
    }

    public static B0 b(B0 b0) {
        return b0 instanceof x0 ? b0 : new x0(b0);
    }

    private final synchronized Object c() {
        try {
            Object obj = this.b;
            Object obj2 = c;
            if (obj != obj2) {
                return obj;
            }
            Object a = this.a.a();
            Object obj3 = this.b;
            if (obj3 != obj2 && obj3 != a) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + a + ". This is likely due to a circular dependency.");
            }
            this.b = a;
            this.a = null;
            return a;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ax.a6.C0
    public final Object a() {
        Object obj = this.b;
        return obj == c ? c() : obj;
    }
}
