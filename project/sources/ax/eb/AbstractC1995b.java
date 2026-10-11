package ax.eb;

/* renamed from: ax.eb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1995b {

    /* renamed from: ax.eb.b$b, reason: collision with other inner class name */
    private static final class C0307b extends AbstractC1995b {
        private final c a;

        private C0307b() {
            this.a = c.a();
        }

        @Override // ax.eb.AbstractC1995b
        public c a() {
            return this.a;
        }
    }

    public static AbstractC1995b b() {
        return new C0307b();
    }

    public abstract c a();
}
