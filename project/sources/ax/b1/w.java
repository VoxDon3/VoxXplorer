package ax.b1;

import android.os.Looper;
import ax.P0.C0912v;
import ax.Z0.I1;
import ax.b1.InterfaceC1465n;
import ax.b1.InterfaceC1471u;

/* loaded from: classes.dex */
public interface w {
    public static final w a = new a();

    public interface b {
        public static final b a = new b() { // from class: ax.b1.x
            @Override // ax.b1.w.b
            public final void d() {
                y.a();
            }
        };

        void d();
    }

    int a(C0912v c0912v);

    InterfaceC1465n b(InterfaceC1471u.a aVar, C0912v c0912v);

    void c(Looper looper, I1 i1);

    void d();

    b e(InterfaceC1471u.a aVar, C0912v c0912v);

    void k();

    class a implements w {
        a() {
        }

        @Override // ax.b1.w
        public int a(C0912v c0912v) {
            return c0912v.s != null ? 1 : 0;
        }

        @Override // ax.b1.w
        public InterfaceC1465n b(InterfaceC1471u.a aVar, C0912v c0912v) {
            if (c0912v.s == null) {
                return null;
            }
            return new C1451C(new InterfaceC1465n.a(new U(1), 6001));
        }

        @Override // ax.b1.w
        public /* synthetic */ void d() {
            C1472v.c(this);
        }

        @Override // ax.b1.w
        public /* synthetic */ b e(InterfaceC1471u.a aVar, C0912v c0912v) {
            return C1472v.a(this, aVar, c0912v);
        }

        @Override // ax.b1.w
        public /* synthetic */ void k() {
            C1472v.b(this);
        }

        @Override // ax.b1.w
        public void c(Looper looper, I1 i1) {
        }
    }
}
