package ax.c0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class e1 {
    private final e a;

    private static class a extends e {
        protected final Window a;
        private final P b;

        a(Window window, P p) {
            this.a = window;
            this.b = p;
        }

        private void f(int i) {
            if (i == 1) {
                g(4);
            } else if (i == 2) {
                g(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.b.a();
            }
        }

        private void i(int i) {
            if (i == 1) {
                j(4);
                k(1024);
            } else if (i == 2) {
                j(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.b.b();
            }
        }

        @Override // ax.c0.e1.e
        void a(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    f(i2);
                }
            }
        }

        @Override // ax.c0.e1.e
        void e(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    i(i2);
                }
            }
        }

        protected void g(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        protected void h(int i) {
            this.a.addFlags(i);
        }

        protected void j(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        protected void k(int i) {
            this.a.clearFlags(i);
        }
    }

    private static class b extends a {
        b(Window window, P p) {
            super(window, p);
        }

        @Override // ax.c0.e1.e
        public boolean b() {
            return (this.a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // ax.c0.e1.e
        public void d(boolean z) {
            if (!z) {
                j(8192);
                return;
            }
            k(67108864);
            h(Integer.MIN_VALUE);
            g(8192);
        }
    }

    private static class c extends b {
        c(Window window, P p) {
            super(window, p);
        }

        @Override // ax.c0.e1.e
        public void c(boolean z) {
            if (!z) {
                j(16);
                return;
            }
            k(134217728);
            h(Integer.MIN_VALUE);
            g(16);
        }
    }

    @Deprecated
    private e1(WindowInsetsController windowInsetsController) {
        this.a = new d(windowInsetsController, this, new P(windowInsetsController));
    }

    @Deprecated
    public static e1 f(WindowInsetsController windowInsetsController) {
        return new e1(windowInsetsController);
    }

    public void a(int i) {
        this.a.a(i);
    }

    public boolean b() {
        return this.a.b();
    }

    public void c(boolean z) {
        this.a.c(z);
    }

    public void d(boolean z) {
        this.a.d(z);
    }

    public void e(int i) {
        this.a.e(i);
    }

    private static class d extends e {
        final e1 a;
        final WindowInsetsController b;
        final P c;
        private final ax.B.k<Object, WindowInsetsController.OnControllableInsetsChangedListener> d;
        protected Window e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        d(android.view.Window r2, ax.c0.e1 r3, ax.c0.P r4) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = ax.c0.f1.a(r2)
                r1.<init>(r0, r3, r4)
                r1.e = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.c0.e1.d.<init>(android.view.Window, ax.c0.e1, ax.c0.P):void");
        }

        @Override // ax.c0.e1.e
        void a(int i) {
            if ((i & 8) != 0) {
                this.c.a();
            }
            this.b.hide(i & (-9));
        }

        @Override // ax.c0.e1.e
        public boolean b() {
            int systemBarsAppearance;
            this.b.setSystemBarsAppearance(0, 0);
            systemBarsAppearance = this.b.getSystemBarsAppearance();
            return (systemBarsAppearance & 8) != 0;
        }

        @Override // ax.c0.e1.e
        public void c(boolean z) {
            if (z) {
                if (this.e != null) {
                    f(16);
                }
                this.b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.e != null) {
                    g(16);
                }
                this.b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // ax.c0.e1.e
        public void d(boolean z) {
            if (z) {
                if (this.e != null) {
                    f(8192);
                }
                this.b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.e != null) {
                    g(8192);
                }
                this.b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // ax.c0.e1.e
        void e(int i) {
            if ((i & 8) != 0) {
                this.c.b();
            }
            this.b.show(i & (-9));
        }

        protected void f(int i) {
            View decorView = this.e.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        protected void g(int i) {
            View decorView = this.e.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, e1 e1Var, P p) {
            this.d = new ax.B.k<>();
            this.b = windowInsetsController;
            this.a = e1Var;
            this.c = p;
        }
    }

    public e1(Window window, View view) {
        P p = new P(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.a = new d(window, this, p);
            return;
        }
        if (i >= 26) {
            this.a = new c(window, p);
        } else if (i >= 23) {
            this.a = new b(window, p);
        } else {
            this.a = new a(window, p);
        }
    }

    private static class e {
        e() {
        }

        void a(int i) {
            throw null;
        }

        public boolean b() {
            return false;
        }

        void e(int i) {
            throw null;
        }

        public void c(boolean z) {
        }

        public void d(boolean z) {
        }
    }
}
