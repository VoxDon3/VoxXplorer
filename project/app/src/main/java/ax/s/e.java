/*
 * Decompiled with CFR 0.152.
 */
package ax.s;

import android.view.View;
import android.view.animation.Interpolator;
import ax.c0.n0;
import ax.c0.o0;
import ax.c0.p0;
import java.util.ArrayList;

public class e {
    final ArrayList<n0> a;
    private long b = -1L;
    private Interpolator c;
    o0 d;
    private boolean e;
    private final p0 f = new p0(this){
        private boolean a;
        private int b;
        final e c;
        {
            this.c = e8;
            this.a = false;
            this.b = 0;
        }

        @Override
        public void b(View object) {
            int n8;
            this.b = n8 = this.b + 1;
            if (n8 == this.c.a.size()) {
                object = this.c.d;
                if (object != null) {
                    object.b(null);
                }
                this.d();
            }
        }

        @Override
        public void c(View object) {
            if (!this.a) {
                this.a = true;
                object = this.c.d;
                if (object != null) {
                    object.c(null);
                }
            }
        }

        void d() {
            this.b = 0;
            this.a = false;
            this.c.b();
        }
    };

    public e() {
        this.a = new ArrayList();
    }

    public void a() {
        if (!this.e) {
            return;
        }
        ArrayList<n0> arrayList = this.a;
        int n8 = arrayList.size();
        for (int i8 = 0; i8 < n8; ++i8) {
            n0 n02 = arrayList.get(i8);
            n02.c();
        }
        this.e = false;
    }

    void b() {
        this.e = false;
    }

    public e c(n0 n02) {
        if (!this.e) {
            this.a.add(n02);
        }
        return this;
    }

    public e d(n0 n02, n0 n03) {
        this.a.add(n02);
        n03.i(n02.d());
        this.a.add(n03);
        return this;
    }

    public e e(long l8) {
        if (!this.e) {
            this.b = l8;
        }
        return this;
    }

    public e f(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public e g(o0 o02) {
        if (!this.e) {
            this.d = o02;
        }
        return this;
    }

    public void h() {
        if (this.e) {
            return;
        }
        ArrayList<n0> arrayList = this.a;
        int n8 = arrayList.size();
        int n9 = 0;
        while (n9 < n8) {
            Interpolator interpolator;
            n0 n02 = arrayList.get(n9);
            ++n9;
            long l8 = this.b;
            if (l8 >= 0L) {
                n02.e(l8);
            }
            if ((interpolator = this.c) != null) {
                n02.f(interpolator);
            }
            if (this.d != null) {
                n02.g(this.f);
            }
            n02.k();
        }
        this.e = true;
    }
}

