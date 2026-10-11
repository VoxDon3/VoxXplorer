/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import androidx.recyclerview.widget.x;
import ax.b0.g;

class m {
    private final x.c a;
    private final u.d b;
    public final RecyclerView.h<RecyclerView.F> c;
    final b d;
    int e;
    private RecyclerView.j f = new RecyclerView.j(this){
        final m a;
        {
            this.a = m8;
        }

        @Override
        public void a() {
            m m8 = this.a;
            m8.e = m8.c.l();
            m8 = this.a;
            m8.d.e(m8);
        }

        @Override
        public void b(int n8, int n9) {
            m m8 = this.a;
            m8.d.b(m8, n8, n9, null);
        }

        @Override
        public void c(int n8, int n9, Object object) {
            m m8 = this.a;
            m8.d.b(m8, n8, n9, object);
        }

        @Override
        public void d(int n8, int n9) {
            m m8 = this.a;
            m8.e += n9;
            m8.d.c(m8, n8, n9);
            m8 = this.a;
            if (m8.e > 0 && m8.c.o() == RecyclerView.h.a.c0) {
                m8 = this.a;
                m8.d.a(m8);
            }
        }

        @Override
        public void e(int n8, int n9, int n10) {
            boolean bl = true;
            if (n10 != 1) {
                bl = false;
            }
            g.b(bl, "moving more than 1 item is not supported in RecyclerView");
            m m8 = this.a;
            m8.d.d(m8, n8, n9);
        }

        @Override
        public void f(int n8, int n9) {
            m m8 = this.a;
            m8.e -= n9;
            m8.d.f(m8, n8, n9);
            m8 = this.a;
            if (m8.e < 1 && m8.c.o() == RecyclerView.h.a.c0) {
                m8 = this.a;
                m8.d.a(m8);
            }
        }

        @Override
        public void g() {
            m m8 = this.a;
            m8.d.a(m8);
        }
    };

    m(RecyclerView.h<RecyclerView.F> h8, b b8, x x8, u.d d8) {
        this.c = h8;
        this.d = b8;
        this.a = x8.b(this);
        this.b = d8;
        this.e = h8.l();
        h8.J(this.f);
    }

    int a() {
        return this.e;
    }

    public long b(int n8) {
        long l8 = this.c.m(n8);
        return this.b.a(l8);
    }

    int c(int n8) {
        return this.a.b(this.c.n(n8));
    }

    void d(RecyclerView.F f8, int n8) {
        this.c.h(f8, n8);
    }

    RecyclerView.F e(ViewGroup viewGroup, int n8) {
        n8 = this.a.a(n8);
        return this.c.D(viewGroup, n8);
    }

    static interface b {
        public void a(m var1);

        public void b(m var1, int var2, int var3, Object var4);

        public void c(m var1, int var2, int var3);

        public void d(m var1, int var2, int var3);

        public void e(m var1);

        public void f(m var1, int var2, int var3);
    }
}

