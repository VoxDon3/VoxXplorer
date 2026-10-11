/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import java.util.Arrays;
import java.util.List;

public final class c
extends RecyclerView.h<RecyclerView.F> {
    private final d d;

    public c(a object, List<? extends RecyclerView.h<? extends RecyclerView.F>> list) {
        this.d = new d(this, (a)object);
        object = list.iterator();
        while (object.hasNext()) {
            this.N((RecyclerView.h)object.next());
        }
        super.K(this.d.s());
    }

    @SafeVarargs
    public c(a a8, RecyclerView.h<? extends RecyclerView.F> ... hArray) {
        this(a8, Arrays.asList(hArray));
    }

    @Override
    public void A(RecyclerView recyclerView) {
        this.d.v(recyclerView);
    }

    @Override
    public void B(RecyclerView.F f8, int n8) {
        this.d.w(f8, n8);
    }

    @Override
    public RecyclerView.F D(ViewGroup viewGroup, int n8) {
        return this.d.x(viewGroup, n8);
    }

    @Override
    public void E(RecyclerView recyclerView) {
        this.d.y(recyclerView);
    }

    @Override
    public boolean F(RecyclerView.F f8) {
        return this.d.z(f8);
    }

    @Override
    public void G(RecyclerView.F f8) {
        this.d.A(f8);
    }

    @Override
    public void H(RecyclerView.F f8) {
        this.d.B(f8);
    }

    @Override
    public void I(RecyclerView.F f8) {
        this.d.C(f8);
    }

    public boolean N(RecyclerView.h<? extends RecyclerView.F> h8) {
        return this.d.h(h8);
    }

    void O(RecyclerView.h.a a8) {
        super.L(a8);
    }

    @Override
    public int k(RecyclerView.h<? extends RecyclerView.F> h8, RecyclerView.F f8, int n8) {
        return this.d.p(h8, f8, n8);
    }

    @Override
    public int l() {
        return this.d.q();
    }

    @Override
    public long m(int n8) {
        return this.d.n(n8);
    }

    @Override
    public int n(int n8) {
        return this.d.o(n8);
    }

    public static final class androidx.recyclerview.widget.c$a {
        public static final androidx.recyclerview.widget.c$a c = new androidx.recyclerview.widget.c$a(true, b.q);
        public final boolean a;
        public final b b;

        androidx.recyclerview.widget.c$a(boolean bl, b b8) {
            this.a = bl;
            this.b = b8;
        }

        public static final class a {
            private boolean a;
            private b b;

            public a() {
                androidx.recyclerview.widget.c$a a8 = c;
                this.a = a8.a;
                this.b = a8.b;
            }

            public androidx.recyclerview.widget.c$a a() {
                return new androidx.recyclerview.widget.c$a(this.a, this.b);
            }

            public a b(boolean bl) {
                this.a = bl;
                return this;
            }

            public a c(b b8) {
                this.b = b8;
                return this;
            }
        }

        public static final class b
        extends Enum<b> {
            public static final /* enum */ b c0;
            public static final /* enum */ b d0;
            private static final b[] e0;
            public static final /* enum */ b q;

            static {
                b b8;
                b b9;
                b b10;
                q = b10 = new b();
                c0 = b9 = new b();
                d0 = b8 = new b();
                e0 = new b[]{b10, b9, b8};
            }

            public static b valueOf(String string) {
                return Enum.valueOf(b.class, string);
            }

            public static b[] values() {
                return (b[])e0.clone();
            }
        }
    }
}

