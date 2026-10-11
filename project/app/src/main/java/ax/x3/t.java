/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;

public class t
extends i.e {
    private final a d;
    private boolean e;
    private boolean f;

    public t(a a8, boolean bl, boolean bl2) {
        this.d = a8;
        this.e = bl2;
        this.f = bl;
    }

    @Override
    public void A(RecyclerView.F f8, int n8) {
        if (n8 != 0) {
            this.d.b(f8);
        }
        super.A(f8, n8);
    }

    @Override
    public void B(RecyclerView.F f8, int n8) {
        this.d.g(f8);
    }

    @Override
    public void c(RecyclerView recyclerView, RecyclerView.F f8) {
        super.c(recyclerView, f8);
        this.d.e(f8);
    }

    @Override
    public int k(RecyclerView recyclerView, RecyclerView.F f8) {
        return i.e.t(3, i.e.s(1, 8));
    }

    @Override
    public boolean q() {
        return this.e;
    }

    @Override
    public boolean r() {
        return this.f;
    }

    @Override
    public boolean y(RecyclerView recyclerView, RecyclerView.F f8, RecyclerView.F f9) {
        if (f8.k() >= 0 && f9.k() >= 0) {
            this.d.c(f8.k(), f9.k());
            return true;
        }
        return false;
    }

    public static interface a {
        public void b(RecyclerView.F var1);

        public void c(int var1, int var2);

        public void e(RecyclerView.F var1);

        public void g(RecyclerView.F var1);
    }
}

