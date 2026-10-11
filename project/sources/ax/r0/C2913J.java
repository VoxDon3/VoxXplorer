package ax.r0;

/* renamed from: ax.r0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2913J implements i0 {
    private static final Q b = new a();
    private final Q a;

    /* renamed from: ax.r0.J$a */
    static class a implements Q {
        a() {
        }

        @Override // ax.r0.Q
        public P a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // ax.r0.Q
        public boolean b(Class<?> cls) {
            return false;
        }
    }

    /* renamed from: ax.r0.J$b */
    private static class b implements Q {
        private Q[] a;

        b(Q... qArr) {
            this.a = qArr;
        }

        @Override // ax.r0.Q
        public P a(Class<?> cls) {
            for (Q q : this.a) {
                if (q.b(cls)) {
                    return q.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // ax.r0.Q
        public boolean b(Class<?> cls) {
            for (Q q : this.a) {
                if (q.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public C2913J() {
        this(b());
    }

    private static Q b() {
        return new b(C2936x.c(), c());
    }

    private static Q c() {
        try {
            return (Q) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return b;
        }
    }

    private static boolean d(P p) {
        return p.c() == c0.PROTO2;
    }

    private static <T> h0<T> e(Class<T> cls, P p) {
        return AbstractC2937y.class.isAssignableFrom(cls) ? d(p) ? V.N(cls, p, Z.b(), AbstractC2911H.b(), j0.M(), C2931s.b(), O.b()) : V.N(cls, p, Z.b(), AbstractC2911H.b(), j0.M(), null, O.b()) : d(p) ? V.N(cls, p, Z.a(), AbstractC2911H.a(), j0.H(), C2931s.a(), O.a()) : V.N(cls, p, Z.a(), AbstractC2911H.a(), j0.I(), null, O.a());
    }

    @Override // ax.r0.i0
    public <T> h0<T> a(Class<T> cls) {
        j0.J(cls);
        P a2 = this.a.a(cls);
        return a2.a() ? AbstractC2937y.class.isAssignableFrom(cls) ? W.l(j0.M(), C2931s.b(), a2.b()) : W.l(j0.H(), C2931s.a(), a2.b()) : e(cls, a2);
    }

    private C2913J(Q q) {
        this.a = (Q) C2904A.b(q, "messageInfoFactory");
    }
}
