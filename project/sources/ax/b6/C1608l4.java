package ax.b6;

import ax.b6.AbstractC1599k4;

/* renamed from: ax.b6.l4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1608l4 implements R4 {
    private static final C1608l4 a = new C1608l4();

    private C1608l4() {
    }

    public static C1608l4 c() {
        return a;
    }

    @Override // ax.b6.R4
    public final S4 a(Class<?> cls) {
        if (!AbstractC1599k4.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (S4) AbstractC1599k4.o(cls.asSubclass(AbstractC1599k4.class)).t(AbstractC1599k4.e.c, null, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }

    @Override // ax.b6.R4
    public final boolean b(Class<?> cls) {
        return AbstractC1599k4.class.isAssignableFrom(cls);
    }
}
