package ax.i2;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.C1446g;
import ax.i2.AbstractC2244I;
import ax.i2.C2252c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: ax.i2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2263n<K> {
    private final b<K> a;
    private final p<K> b;
    private final AbstractC2244I.c<K> c;
    private Point j;
    private e k;
    private e l;
    private boolean m;
    private final RecyclerView.u o;
    private final List<f<K>> d = new ArrayList();
    private final SparseArray<SparseIntArray> e = new SparseArray<>();
    private final List<c> f = new ArrayList();
    private final List<c> g = new ArrayList();
    private final SparseBooleanArray h = new SparseBooleanArray();
    private final Set<K> i = new LinkedHashSet();
    private int n = -1;

    /* renamed from: ax.i2.n$a */
    class a extends RecyclerView.u {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i, int i2) {
            C2263n.this.q(recyclerView, i, i2);
        }
    }

    /* renamed from: ax.i2.n$b */
    static abstract class b<K> extends C2252c.AbstractC0333c<K> {
        b() {
        }

        abstract Point e(Point point);

        abstract Rect f(int i);

        abstract int g(int i);

        abstract int h();

        abstract int i();

        abstract boolean j(int i);

        abstract void k(RecyclerView.u uVar);
    }

    /* renamed from: ax.i2.n$c */
    private static class c implements Comparable<c> {
        public int c0;
        public int q;

        c(int i, int i2) {
            this.q = i;
            this.c0 = i2;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return this.q - cVar.q;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.q == this.q && cVar.c0 == this.c0;
        }

        public int hashCode() {
            return this.q ^ this.c0;
        }

        public String toString() {
            return "(" + this.q + ", " + this.c0 + ")";
        }
    }

    /* renamed from: ax.i2.n$d */
    private static class d implements Comparable<d> {
        public c c0;
        public c d0;
        public c e0;
        public c f0;
        public final int q;

        d(List<c> list, int i) {
            int binarySearch = Collections.binarySearch(list, new c(i, i));
            if (binarySearch >= 0) {
                this.q = 3;
                this.c0 = list.get(binarySearch);
                return;
            }
            int i2 = ~binarySearch;
            if (i2 == 0) {
                this.q = 1;
                this.e0 = list.get(0);
                return;
            }
            if (i2 == list.size()) {
                c cVar = list.get(list.size() - 1);
                if (cVar.q > i || i > cVar.c0) {
                    this.q = 0;
                    this.f0 = cVar;
                    return;
                } else {
                    this.q = 3;
                    this.c0 = cVar;
                    return;
                }
            }
            int i3 = i2 - 1;
            c cVar2 = list.get(i3);
            if (cVar2.q <= i && i <= cVar2.c0) {
                this.q = 3;
                this.c0 = list.get(i3);
            } else {
                this.q = 2;
                this.c0 = list.get(i3);
                this.d0 = list.get(i2);
            }
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return h() - dVar.h();
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && h() == ((d) obj).h();
        }

        int h() {
            int i = this.q;
            return i == 1 ? this.e0.q - 1 : i == 0 ? this.f0.c0 + 1 : i == 2 ? this.c0.c0 + 1 : this.c0.q;
        }

        public int hashCode() {
            int i = this.e0.q ^ this.f0.c0;
            c cVar = this.c0;
            return (i ^ cVar.c0) ^ cVar.q;
        }
    }

    /* renamed from: ax.i2.n$e */
    private static class e {
        final d a;
        final d b;

        e(d dVar, d dVar2) {
            this.a = dVar;
            this.b = dVar2;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && this.b.equals(eVar.b);
        }

        public int hashCode() {
            return this.a.h() ^ this.b.h();
        }
    }

    /* renamed from: ax.i2.n$f */
    public static abstract class f<K> {
        abstract void a(Set<K> set);
    }

    C2263n(b<K> bVar, p<K> pVar, AbstractC2244I.c<K> cVar) {
        C1446g.a(bVar != null);
        C1446g.a(pVar != null);
        C1446g.a(cVar != null);
        this.a = bVar;
        this.b = pVar;
        this.c = cVar;
        a aVar = new a();
        this.o = aVar;
        bVar.a(aVar);
    }

    private boolean b(e eVar, e eVar2) {
        return h(eVar.a, eVar2.a) && h(eVar.b, eVar2.b);
    }

    private boolean c(K k) {
        return this.c.c(k, true);
    }

    private Rect d() {
        Rect rect = new Rect();
        rect.left = i(n(this.k.a, this.l.a), this.f, true);
        rect.right = i(m(this.k.a, this.l.a), this.f, false);
        rect.top = i(n(this.k.b, this.l.b), this.g, true);
        rect.bottom = i(m(this.k.b, this.l.b), this.g, false);
        return rect;
    }

    private int e() {
        d dVar = this.k.b;
        int i = !dVar.equals(n(dVar, this.l.b)) ? 1 : 0;
        d dVar2 = this.k.a;
        return dVar2.equals(n(dVar2, this.l.a)) ? i : i | 2;
    }

    private void f() {
        if (b(this.l, this.k)) {
            z(d());
        } else {
            this.i.clear();
            this.n = -1;
        }
    }

    private boolean h(d dVar, d dVar2) {
        int i = dVar.q;
        if (i == 1 && dVar2.q == 1) {
            return false;
        }
        if (i == 0 && dVar2.q == 0) {
            return false;
        }
        return (i == 2 && dVar2.q == 2 && dVar.c0.equals(dVar2.c0) && dVar.d0.equals(dVar2.d0)) ? false : true;
    }

    private int i(d dVar, List<c> list, boolean z) {
        int i = dVar.q;
        if (i == 0) {
            return list.get(list.size() - 1).c0;
        }
        if (i == 1) {
            return list.get(0).q;
        }
        if (i == 2) {
            return z ? dVar.d0.q : dVar.c0.c0;
        }
        if (i == 3) {
            return dVar.c0.q;
        }
        throw new RuntimeException("Invalid coordinate value.");
    }

    private boolean k() {
        return this.f.size() == 0 || this.g.size() == 0;
    }

    private boolean l(int i, int i2, int i3, int i4, int i5, int i6) {
        int e2 = e();
        if (e2 == 0) {
            return i == i2 && i4 == i5;
        }
        if (e2 == 1) {
            return i == i2 && i4 == i6;
        }
        if (e2 == 2) {
            return i == i3 && i4 == i5;
        }
        if (e2 == 3) {
            return i4 == i6;
        }
        throw new RuntimeException("Invalid corner type.");
    }

    private d m(d dVar, d dVar2) {
        return dVar.compareTo(dVar2) > 0 ? dVar : dVar2;
    }

    private d n(d dVar, d dVar2) {
        return dVar.compareTo(dVar2) < 0 ? dVar : dVar2;
    }

    private void o() {
        Iterator<f<K>> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().a(this.i);
        }
    }

    private void r(Rect rect, int i) {
        if (this.f.size() != this.a.h()) {
            s(this.f, new c(rect.left, rect.right));
        }
        s(this.g, new c(rect.top, rect.bottom));
        SparseIntArray sparseIntArray = this.e.get(rect.left);
        if (sparseIntArray == null) {
            sparseIntArray = new SparseIntArray();
            this.e.put(rect.left, sparseIntArray);
        }
        sparseIntArray.put(rect.top, i);
    }

    private void s(List<c> list, c cVar) {
        int binarySearch = Collections.binarySearch(list, cVar);
        if (binarySearch < 0) {
            list.add(~binarySearch, cVar);
        }
    }

    private void t() {
        for (int i = 0; i < this.a.i(); i++) {
            int g = this.a.g(i);
            if (this.a.j(g) && this.c.b(g, true) && !this.h.get(g)) {
                this.h.put(g, true);
                r(this.a.f(i), g);
            }
        }
    }

    private void x() {
        C1446g.i(!k());
        e eVar = this.l;
        e g = g(this.j);
        this.l = g;
        if (g.equals(eVar)) {
            return;
        }
        f();
        o();
    }

    private void y(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        this.i.clear();
        for (int i9 = i; i9 <= i2; i9++) {
            SparseIntArray sparseIntArray = this.e.get(this.f.get(i9).q);
            int i10 = i3;
            while (i10 <= i4) {
                int i11 = sparseIntArray.get(this.g.get(i10).q, -1);
                if (i11 != -1) {
                    K a2 = this.b.a(i11);
                    if (a2 != null && c(a2)) {
                        this.i.add(a2);
                    }
                    i5 = i;
                    i6 = i2;
                    i7 = i3;
                    i8 = i4;
                    if (l(i9, i5, i6, i10, i7, i8)) {
                        this.n = i11;
                    }
                } else {
                    i5 = i;
                    i6 = i2;
                    i7 = i3;
                    i8 = i4;
                }
                i10++;
                i = i5;
                i2 = i6;
                i3 = i7;
                i4 = i8;
            }
        }
    }

    private void z(Rect rect) {
        List<c> list = this.f;
        int i = rect.left;
        int binarySearch = Collections.binarySearch(list, new c(i, i));
        C1446g.b(binarySearch >= 0, "Rect doesn't intesect any known column.");
        int i2 = binarySearch;
        int i3 = i2;
        while (i2 < this.f.size() && this.f.get(i2).q <= rect.right) {
            i3 = i2;
            i2++;
        }
        List<c> list2 = this.g;
        int i4 = rect.top;
        int binarySearch2 = Collections.binarySearch(list2, new c(i4, i4));
        if (binarySearch2 < 0) {
            this.n = -1;
            return;
        }
        int i5 = binarySearch2;
        int i6 = i5;
        while (i5 < this.g.size() && this.g.get(i5).q <= rect.bottom) {
            i6 = i5;
            i5++;
        }
        y(binarySearch, i3, binarySearch2, i6);
    }

    void a(f<K> fVar) {
        this.d.add(fVar);
    }

    e g(Point point) {
        C1446g.j(!this.f.isEmpty(), "Column bounds not established.");
        C1446g.j(!this.g.isEmpty(), "Row bounds not established.");
        return new e(new d(this.f, point.x), new d(this.g, point.y));
    }

    int j() {
        return this.n;
    }

    void p() {
        this.d.clear();
        this.a.k(this.o);
    }

    void q(RecyclerView recyclerView, int i, int i2) {
        if (this.m) {
            Point point = this.j;
            point.x += i;
            point.y += i2;
            t();
            if (k()) {
                return;
            }
            x();
        }
    }

    void u(Point point) {
        this.j = this.a.e(point);
        if (k()) {
            return;
        }
        x();
    }

    void v(Point point) {
        t();
        if (k()) {
            return;
        }
        this.m = true;
        Point e2 = this.a.e(point);
        this.j = e2;
        this.k = g(e2);
        this.l = g(this.j);
        f();
        o();
    }

    void w() {
        this.m = false;
    }
}
