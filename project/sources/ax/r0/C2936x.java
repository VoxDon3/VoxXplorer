package ax.r0;

/* renamed from: ax.r0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2936x implements Q {
    private static final C2936x a = new C2936x();

    private C2936x() {
    }

    public static C2936x c() {
        return a;
    }

    @Override // ax.r0.Q
    public P a(Class<?> cls) {
        if (!AbstractC2937y.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (P) AbstractC2937y.x(cls.asSubclass(AbstractC2937y.class)).q();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }

    @Override // ax.r0.Q
    public boolean b(Class<?> cls) {
        return AbstractC2937y.class.isAssignableFrom(cls);
    }
}
