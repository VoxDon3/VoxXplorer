/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import ax.Y.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class h
implements Runnable {
    static final ThreadLocal<h> f0 = new ThreadLocal();
    static Comparator<c> g0 = new Comparator<c>(){

        public int a(c c8, c c9) {
            int n8;
            RecyclerView recyclerView = c8.d;
            int n9 = recyclerView == null ? 1 : 0;
            if (n9 != (n8 = c9.d == null)) {
                if (recyclerView == null) {
                    return 1;
                }
                return -1;
            }
            boolean bl = c8.a;
            if (bl != c9.a) {
                if (bl) {
                    return -1;
                }
                return 1;
            }
            n9 = c9.b - c8.b;
            if (n9 != 0) {
                return n9;
            }
            n9 = c8.c - c9.c;
            if (n9 != 0) {
                return n9;
            }
            return 0;
        }
    };
    long c0;
    long d0;
    private ArrayList<c> e0;
    ArrayList<RecyclerView> q = new ArrayList();

    h() {
        this.e0 = new ArrayList();
    }

    private void b() {
        int n8;
        Object object;
        int n9;
        int n10 = this.q.size();
        int n11 = 0;
        for (n9 = 0; n9 < n10; ++n9) {
            object = this.q.get(n9);
            n8 = n11;
            if (object.getWindowVisibility() == 0) {
                ((RecyclerView)object).i0.c((RecyclerView)object, false);
                n8 = n11 + ((RecyclerView)object).i0.d;
            }
            n11 = n8;
        }
        this.e0.ensureCapacity(n11);
        n8 = 0;
        for (n11 = 0; n11 < n10; ++n11) {
            int n12;
            RecyclerView recyclerView = this.q.get(n11);
            if (recyclerView.getWindowVisibility() != 0) {
                n12 = n8;
            } else {
                b b8 = recyclerView.i0;
                int n13 = Math.abs(b8.a) + Math.abs(b8.b);
                n9 = 0;
                while (true) {
                    n12 = n8;
                    if (n9 >= b8.d * 2) break;
                    if (n8 >= this.e0.size()) {
                        object = new c();
                        this.e0.add((c)object);
                    } else {
                        object = this.e0.get(n8);
                    }
                    int[] nArray = b8.c;
                    n12 = nArray[n9 + 1];
                    boolean bl = n12 <= n13;
                    ((c)object).a = bl;
                    ((c)object).b = n13;
                    ((c)object).c = n12;
                    ((c)object).d = recyclerView;
                    ((c)object).e = nArray[n9];
                    ++n8;
                    n9 += 2;
                }
            }
            n8 = n12;
        }
        Collections.sort(this.e0, g0);
    }

    private void c(c object, long l8) {
        long l9 = ((c)object).a ? Long.MAX_VALUE : l8;
        object = this.i(((c)object).d, ((c)object).e, l9);
        if (object != null && ((RecyclerView.F)object).b != null && ((RecyclerView.F)object).t() && !((RecyclerView.F)object).u()) {
            this.h((RecyclerView)((RecyclerView.F)object).b.get(), l8);
        }
    }

    private void d(long l8) {
        for (int i8 = 0; i8 < this.e0.size(); ++i8) {
            c c8 = this.e0.get(i8);
            if (c8.d == null) break;
            this.c(c8, l8);
            c8.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int n8) {
        int n9 = recyclerView.f.j();
        for (int i8 = 0; i8 < n9; ++i8) {
            RecyclerView.F f8 = RecyclerView.n0(recyclerView.f.i(i8));
            if (f8.c != n8 || f8.u()) continue;
            return true;
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long l8) {
        block6: {
            Throwable throwable2;
            block7: {
                int n8;
                if (recyclerView == null) break block6;
                if (recyclerView.F && recyclerView.f.j() != 0) {
                    recyclerView.i1();
                }
                b b8 = recyclerView.i0;
                b8.c(recyclerView, true);
                if (b8.d == 0) break block6;
                try {
                    u.a("RV Nested Prefetch");
                    recyclerView.j0.f(recyclerView.m);
                    n8 = 0;
                }
                catch (Throwable throwable2) {}
                while (true) {
                    if (n8 < b8.d * 2) {
                        this.i(recyclerView, b8.c[n8], l8);
                        n8 += 2;
                        continue;
                    }
                    break;
                }
                break block7;
                u.b();
                return;
            }
            u.b();
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private RecyclerView.F i(RecyclerView recyclerView, int n8, long l8) {
        Throwable throwable2;
        block5: {
            RecyclerView.F f8;
            block3: {
                RecyclerView.w w8;
                block4: {
                    if (h.e(recyclerView, n8)) {
                        return null;
                    }
                    w8 = recyclerView.c;
                    try {
                        recyclerView.S0();
                        f8 = w8.N(n8, false, l8);
                        if (f8 == null) break block3;
                        if (!f8.t() || f8.u()) break block4;
                        w8.G(f8.a);
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                w8.a(f8, false);
            }
            recyclerView.U0(false);
            return f8;
        }
        recyclerView.U0(false);
        throw throwable2;
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.D0 && this.q.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.q.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int n8, int n9) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.D0 && !this.q.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.c0 == 0L) {
                this.c0 = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.i0.e(n8, n9);
    }

    void g(long l8) {
        this.b();
        this.d(l8);
    }

    public void j(RecyclerView recyclerView) {
        boolean bl = this.q.remove(recyclerView);
        if (RecyclerView.D0 && !bl) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void run() {
        Throwable throwable2;
        block7: {
            block6: {
                try {
                    u.a("RV Prefetch");
                    boolean bl = this.q.isEmpty();
                    if (bl) break block6;
                    int n8 = this.q.size();
                    long l8 = 0L;
                    for (int i8 = 0; i8 < n8; ++i8) {
                        RecyclerView recyclerView = this.q.get(i8);
                        long l9 = l8;
                        if (recyclerView.getWindowVisibility() == 0) {
                            l9 = Math.max(recyclerView.getDrawingTime(), l8);
                        }
                        l8 = l9;
                    }
                    if (l8 == 0L) break block6;
                    this.g(TimeUnit.MILLISECONDS.toNanos(l8) + this.d0);
                }
                catch (Throwable throwable2) {
                    break block7;
                }
            }
            this.c0 = 0L;
            u.b();
            return;
        }
        this.c0 = 0L;
        u.b();
        throw throwable2;
    }

    @SuppressLint(value={"VisibleForTests"})
    static class b
    implements RecyclerView.p.c {
        int a;
        int b;
        int[] c;
        int d;

        b() {
        }

        @Override
        public void a(int n8, int n9) {
            if (n8 >= 0) {
                if (n9 >= 0) {
                    int[] nArray;
                    int n10 = this.d;
                    int n11 = n10 * 2;
                    int[] nArray2 = this.c;
                    if (nArray2 == null) {
                        nArray = new int[4];
                        this.c = nArray;
                        Arrays.fill(nArray, -1);
                    } else if (n11 >= nArray2.length) {
                        nArray = new int[n10 * 4];
                        this.c = nArray;
                        System.arraycopy(nArray2, 0, nArray, 0, nArray2.length);
                    }
                    nArray = this.c;
                    nArray[n11] = n8;
                    nArray[n11 + 1] = n9;
                    ++this.d;
                    return;
                }
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        void b() {
            int[] nArray = this.c;
            if (nArray != null) {
                Arrays.fill(nArray, -1);
            }
            this.d = 0;
        }

        void c(RecyclerView recyclerView, boolean bl) {
            this.d = 0;
            Object object = this.c;
            if (object != null) {
                Arrays.fill(object, -1);
            }
            object = recyclerView.n;
            if (recyclerView.m != null && object != null && object.z0()) {
                int n8;
                if (bl) {
                    if (!recyclerView.e.p()) {
                        object.v(recyclerView.m.l(), this);
                    }
                } else if (!recyclerView.v0()) {
                    object.u(this.a, this.b, recyclerView.j0, this);
                }
                if ((n8 = this.d) > object.m) {
                    object.m = n8;
                    object.n = bl;
                    recyclerView.c.P();
                }
            }
        }

        boolean d(int n8) {
            if (this.c != null) {
                int n9 = this.d;
                for (int i8 = 0; i8 < n9 * 2; i8 += 2) {
                    if (this.c[i8] != n8) continue;
                    return true;
                }
            }
            return false;
        }

        void e(int n8, int n9) {
            this.a = n8;
            this.b = n9;
        }
    }

    static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;

        c() {
        }

        public void a() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = null;
            this.e = 0;
        }
    }
}

