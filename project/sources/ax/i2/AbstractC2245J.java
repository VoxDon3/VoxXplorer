package ax.i2;

import ax.b0.C1446g;

/* renamed from: ax.i2.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2245J<K> {
    private final Class<K> a;

    /* renamed from: ax.i2.J$a */
    private static class a extends AbstractC2245J<Long> {
        a() {
            super(Long.class);
        }
    }

    public AbstractC2245J(Class<K> cls) {
        C1446g.a(cls != null);
        this.a = cls;
    }

    public static AbstractC2245J<Long> a() {
        return new a();
    }
}
