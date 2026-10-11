package ax.l4;

/* renamed from: ax.l4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2469b {

    /* renamed from: ax.l4.b$b, reason: collision with other inner class name */
    private static class C0362b extends AbstractC2469b {
        private volatile boolean a;

        C0362b() {
            super();
        }

        @Override // ax.l4.AbstractC2469b
        public void b(boolean z) {
            this.a = z;
        }

        @Override // ax.l4.AbstractC2469b
        public void c() {
            if (this.a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public static AbstractC2469b a() {
        return new C0362b();
    }

    abstract void b(boolean z);

    public abstract void c();

    private AbstractC2469b() {
    }
}
