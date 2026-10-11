package ax.o8;

import ax.Gb.l;

/* renamed from: ax.o8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2733b {

    /* renamed from: ax.o8.b$a */
    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* renamed from: ax.o8.b$b, reason: collision with other inner class name */
    public static final class C0407b {
        private final String a;

        public C0407b(String str) {
            l.f(str, "sessionId");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0407b) && l.a(this.a, ((C0407b) obj).a);
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.a + ')';
        }
    }

    boolean a();

    a b();

    void c(C0407b c0407b);
}
