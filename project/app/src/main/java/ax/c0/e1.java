/*
 * Decompiled with CFR 0.152.
 */
package ax.c0;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import ax.B.k;
import ax.c0.P;
import ax.c0.T;
import ax.c0.W;
import ax.c0.f1;
import ax.c0.g1;
import ax.c0.h1;

public final class e1 {
    private final e a;

    public e1(Window window, View object) {
        object = new P((View)object);
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 30) {
            this.a = new d(window, this, (P)object);
            return;
        }
        if (n8 >= 26) {
            this.a = new c(window, (P)object);
            return;
        }
        if (n8 >= 23) {
            this.a = new b(window, (P)object);
            return;
        }
        this.a = new a(window, (P)object);
    }

    @Deprecated
    private e1(WindowInsetsController windowInsetsController) {
        this.a = new d(windowInsetsController, this, new P(windowInsetsController));
    }

    @Deprecated
    public static e1 f(WindowInsetsController windowInsetsController) {
        return new e1(windowInsetsController);
    }

    public void a(int n8) {
        this.a.a(n8);
    }

    public boolean b() {
        return this.a.b();
    }

    public void c(boolean bl) {
        this.a.c(bl);
    }

    public void d(boolean bl) {
        this.a.d(bl);
    }

    public void e(int n8) {
        this.a.e(n8);
    }

    private static class a
    extends e {
        protected final Window a;
        private final P b;

        a(Window window, P p8) {
            this.a = window;
            this.b = p8;
        }

        private void f(int n8) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 8) {
                        return;
                    }
                    this.b.a();
                    return;
                }
                this.g(2);
                return;
            }
            this.g(4);
        }

        private void i(int n8) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 8) {
                        return;
                    }
                    this.b.b();
                    return;
                }
                this.j(2);
                return;
            }
            this.j(4);
            this.k(1024);
        }

        @Override
        void a(int n8) {
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((n8 & i8) == 0) continue;
                this.f(i8);
            }
        }

        @Override
        void e(int n8) {
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((n8 & i8) == 0) continue;
                this.i(i8);
            }
        }

        protected void g(int n8) {
            View view = this.a.getDecorView();
            view.setSystemUiVisibility(n8 | view.getSystemUiVisibility());
        }

        protected void h(int n8) {
            this.a.addFlags(n8);
        }

        protected void j(int n8) {
            View view = this.a.getDecorView();
            view.setSystemUiVisibility(~n8 & view.getSystemUiVisibility());
        }

        protected void k(int n8) {
            this.a.clearFlags(n8);
        }
    }

    private static class b
    extends a {
        b(Window window, P p8) {
            super(window, p8);
        }

        @Override
        public boolean b() {
            return (this.a.getDecorView().getSystemUiVisibility() & 0x2000) != 0;
        }

        @Override
        public void d(boolean bl) {
            if (bl) {
                this.k(0x4000000);
                this.h(Integer.MIN_VALUE);
                this.g(8192);
                return;
            }
            this.j(8192);
        }
    }

    private static class c
    extends b {
        c(Window window, P p8) {
            super(window, p8);
        }

        @Override
        public void c(boolean bl) {
            if (bl) {
                this.k(0x8000000);
                this.h(Integer.MIN_VALUE);
                this.g(16);
                return;
            }
            this.j(16);
        }
    }

    private static class d
    extends e {
        final e1 a;
        final WindowInsetsController b;
        final P c;
        private final k<Object, WindowInsetsController.OnControllableInsetsChangedListener> d = new k();
        protected Window e;

        d(Window window, e1 e12, P p8) {
            this(f1.a(window), e12, p8);
            this.e = window;
        }

        d(WindowInsetsController windowInsetsController, e1 e12, P p8) {
            this.b = windowInsetsController;
            this.a = e12;
            this.c = p8;
        }

        @Override
        void a(int n8) {
            if ((n8 & 8) != 0) {
                this.c.a();
            }
            W.a(this.b, n8 & 0xFFFFFFF7);
        }

        @Override
        public boolean b() {
            g1.a(this.b, 0, 0);
            return (h1.a(this.b) & 8) != 0;
        }

        @Override
        public void c(boolean bl) {
            if (bl) {
                if (this.e != null) {
                    this.f(16);
                }
                g1.a(this.b, 16, 16);
                return;
            }
            if (this.e != null) {
                this.g(16);
            }
            g1.a(this.b, 0, 16);
        }

        @Override
        public void d(boolean bl) {
            if (bl) {
                if (this.e != null) {
                    this.f(8192);
                }
                g1.a(this.b, 8, 8);
                return;
            }
            if (this.e != null) {
                this.g(8192);
            }
            g1.a(this.b, 0, 8);
        }

        @Override
        void e(int n8) {
            if ((n8 & 8) != 0) {
                this.c.b();
            }
            T.a(this.b, n8 & 0xFFFFFFF7);
        }

        protected void f(int n8) {
            View view = this.e.getDecorView();
            view.setSystemUiVisibility(n8 | view.getSystemUiVisibility());
        }

        protected void g(int n8) {
            View view = this.e.getDecorView();
            view.setSystemUiVisibility(~n8 & view.getSystemUiVisibility());
        }
    }

    private static class e {
        e() {
        }

        void a(int n8) {
            throw null;
        }

        public boolean b() {
            return false;
        }

        public void c(boolean bl) {
        }

        public void d(boolean bl) {
        }

        void e(int n8) {
            throw null;
        }
    }
}

