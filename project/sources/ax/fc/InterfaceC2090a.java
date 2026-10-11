package ax.fc;

/* renamed from: ax.fc.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2090a {

    /* renamed from: ax.fc.a$a, reason: collision with other inner class name */
    public static final class C0312a implements InterfaceC2090a {
        private final boolean a;

        public C0312a() {
            this(false);
        }

        @Override // ax.fc.InterfaceC2090a
        public void a(C2093d c2093d) {
            System.out.println(c2093d);
            if (!this.a || c2093d.a() == null) {
                return;
            }
            c2093d.a().printStackTrace();
        }

        public C0312a(boolean z) {
            this.a = z;
        }
    }

    void a(C2093d c2093d);
}
