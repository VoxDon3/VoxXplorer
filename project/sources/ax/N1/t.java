package ax.N1;

import ax.P0.C0912v;
import ax.S0.InterfaceC0979l;

/* loaded from: classes.dex */
public interface t {

    public interface a {
        public static final a a = new C0153a();

        /* renamed from: ax.N1.t$a$a, reason: collision with other inner class name */
        class C0153a implements a {
            C0153a() {
            }

            @Override // ax.N1.t.a
            public int a(C0912v c0912v) {
                return 1;
            }

            @Override // ax.N1.t.a
            public boolean b(C0912v c0912v) {
                return false;
            }

            @Override // ax.N1.t.a
            public t c(C0912v c0912v) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        }

        int a(C0912v c0912v);

        boolean b(C0912v c0912v);

        t c(C0912v c0912v);
    }

    public static class b {
        private static final b c = new b(-9223372036854775807L, false);
        public final long a;
        public final boolean b;

        private b(long j, boolean z) {
            this.a = j;
            this.b = z;
        }

        public static b b() {
            return c;
        }

        public static b c(long j) {
            return new b(j, true);
        }
    }

    void a();

    k b(byte[] bArr, int i, int i2);

    void c(byte[] bArr, int i, int i2, b bVar, InterfaceC0979l<e> interfaceC0979l);

    int d();
}
