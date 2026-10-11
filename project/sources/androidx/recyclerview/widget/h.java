package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class h implements Runnable {
    static final ThreadLocal<h> f0 = new ThreadLocal<>();
    static Comparator<c> g0 = new a();
    long c0;
    long d0;
    ArrayList<RecyclerView> q = new ArrayList<>();
    private ArrayList<c> e0 = new ArrayList<>();

    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.d;
            if ((recyclerView == null) != (cVar2.d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.a;
            if (z != cVar2.a) {
                return z ? -1 : 1;
            }
            int i = cVar2.b - cVar.b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.c - cVar2.c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    static class b implements RecyclerView.p.c {
        int a;
        int b;
        int[] c;
        int d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.d;
            int i4 = i3 * 2;
            int[] iArr = this.c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i4 >= iArr.length) {
                int[] iArr3 = new int[i3 * 4];
                this.c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.c;
            iArr4[i4] = i;
            iArr4[i4 + 1] = i2;
            this.d++;
        }

        void b() {
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.d = 0;
        }

        void c(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.n;
            if (recyclerView.m == null || pVar == null || !pVar.z0()) {
                return;
            }
            if (z) {
                if (!recyclerView.e.p()) {
                    pVar.v(recyclerView.m.l(), this);
                }
            } else if (!recyclerView.v0()) {
                pVar.u(this.a, this.b, recyclerView.j0, this);
            }
            int i = this.d;
            if (i > pVar.m) {
                pVar.m = i;
                pVar.n = z;
                recyclerView.c.P();
            }
        }

        boolean d(int i) {
            if (this.c != null) {
                int i2 = this.d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i, int i2) {
            this.a = i;
            this.b = i2;
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

    h() {
    }

    private void b() {
        c cVar;
        int size = this.q.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.q.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.i0.c(recyclerView, false);
                i += recyclerView.i0.d;
            }
        }
        this.e0.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.q.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.i0;
                int abs = Math.abs(bVar.a) + Math.abs(bVar.b);
                for (int i5 = 0; i5 < bVar.d * 2; i5 += 2) {
                    if (i3 >= this.e0.size()) {
                        cVar = new c();
                        this.e0.add(cVar);
                    } else {
                        cVar = this.e0.get(i3);
                    }
                    int[] iArr = bVar.c;
                    int i6 = iArr[i5 + 1];
                    cVar.a = i6 <= abs;
                    cVar.b = abs;
                    cVar.c = i6;
                    cVar.d = recyclerView2;
                    cVar.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.e0, g0);
    }

    private void c(c cVar, long j) {
        RecyclerView.F i = i(cVar.d, cVar.e, cVar.a ? Long.MAX_VALUE : j);
        if (i == null || i.b == null || !i.t() || i.u()) {
            return;
        }
        h(i.b.get(), j);
    }

    private void d(long j) {
        for (int i = 0; i < this.e0.size(); i++) {
            c cVar = this.e0.get(i);
            if (cVar.d == null) {
                return;
            }
            c(cVar, j);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i) {
        int j = recyclerView.f.j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.F n0 = RecyclerView.n0(recyclerView.f.i(i2));
            if (n0.c == i && !n0.u()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.F && recyclerView.f.j() != 0) {
            recyclerView.i1();
        }
        b bVar = recyclerView.i0;
        bVar.c(recyclerView, true);
        if (bVar.d != 0) {
            try {
                ax.Y.u.a("RV Nested Prefetch");
                recyclerView.j0.f(recyclerView.m);
                for (int i = 0; i < bVar.d * 2; i += 2) {
                    i(recyclerView, bVar.c[i], j);
                }
            } finally {
                ax.Y.u.b();
            }
        }
    }

    private RecyclerView.F i(RecyclerView recyclerView, int i, long j) {
        if (e(recyclerView, i)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.c;
        try {
            recyclerView.S0();
            RecyclerView.F N = wVar.N(i, false, j);
            if (N != null) {
                if (!N.t() || N.u()) {
                    wVar.a(N, false);
                } else {
                    wVar.G(N.a);
                }
            }
            recyclerView.U0(false);
            return N;
        } catch (Throwable th) {
            recyclerView.U0(false);
            throw th;
        }
    }

    public void a(RecyclerView recyclerView) {
        if (RecyclerView.D0 && this.q.contains(recyclerView)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        this.q.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow()) {
            if (RecyclerView.D0 && !this.q.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.c0 == 0) {
                this.c0 = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        recyclerView.i0.e(i, i2);
    }

    void g(long j) {
        b();
        d(j);
    }

    public void j(RecyclerView recyclerView) {
        boolean remove = this.q.remove(recyclerView);
        if (RecyclerView.D0 && !remove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ax.Y.u.a("RV Prefetch");
            if (!this.q.isEmpty()) {
                int size = this.q.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.q.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j) + this.d0);
                }
            }
        } finally {
            this.c0 = 0L;
            ax.Y.u.b();
        }
    }
}
