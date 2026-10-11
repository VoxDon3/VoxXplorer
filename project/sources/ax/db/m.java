package ax.db;

import ax.ab.InterfaceC1434a;
import ax.hb.C2179b;

/* loaded from: classes3.dex */
final class m {

    private static final class b implements InterfaceC1434a, AutoCloseable {
        private final q c0;
        private final boolean d0;
        private final k q;

        @Override // ax.ab.InterfaceC1434a, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C2179b.a().a(this.q);
            if (this.d0) {
                this.c0.f();
            }
        }

        private b(q qVar, boolean z) {
            this.c0 = qVar;
            this.d0 = z;
            this.q = C2179b.d(C2179b.a(), qVar).b();
        }
    }

    static q a() {
        return C2179b.b(C2179b.a());
    }

    static InterfaceC1434a b(q qVar, boolean z) {
        return new b(qVar, z);
    }
}
