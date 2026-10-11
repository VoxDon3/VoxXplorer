/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.g;
import ax.i2.I;
import ax.i2.c;
import ax.i2.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

final class n<K> {
    private final b<K> a;
    private final p<K> b;
    private final I.c<K> c;
    private final List<f<K>> d = new ArrayList<f<K>>();
    private final SparseArray<SparseIntArray> e = new SparseArray();
    private final List<c> f = new ArrayList<c>();
    private final List<c> g = new ArrayList<c>();
    private final SparseBooleanArray h = new SparseBooleanArray();
    private final Set<K> i = new LinkedHashSet<K>();
    private Point j;
    private e k;
    private e l;
    private boolean m;
    private int n = -1;
    private final RecyclerView.u o;

    n(b<K> b8, p<K> object, I.c<K> c8) {
        boolean bl = false;
        boolean bl2 = b8 != null;
        ax.b0.g.a(bl2);
        bl2 = object != null;
        ax.b0.g.a(bl2);
        bl2 = bl;
        if (c8 != null) {
            bl2 = true;
        }
        ax.b0.g.a(bl2);
        this.a = b8;
        this.b = object;
        this.c = c8;
        this.o = object = new RecyclerView.u(this){
            final n a;
            {
                this.a = n8;
            }

            @Override
            public void b(RecyclerView recyclerView, int n8, int n9) {
                this.a.q(recyclerView, n8, n9);
            }
        };
        b8.a((RecyclerView.u)object);
    }

    private boolean b(e e8, e e9) {
        return this.h(e8.a, e9.a) && this.h(e8.b, e9.b);
    }

    private boolean c(K k8) {
        return this.c.c(k8, true);
    }

    private Rect d() {
        Rect rect = new Rect();
        rect.left = this.i(this.n(this.k.a, this.l.a), this.f, true);
        rect.right = this.i(this.m(this.k.a, this.l.a), this.f, false);
        rect.top = this.i(this.n(this.k.b, this.l.b), this.g, true);
        rect.bottom = this.i(this.m(this.k.b, this.l.b), this.g, false);
        return rect;
    }

    private int e() {
        d d8 = this.k.b;
        int n8 = d8.equals(this.n(d8, this.l.b)) ^ 1;
        d8 = this.k.a;
        if (d8.equals(this.n(d8, this.l.a))) {
            return n8;
        }
        return n8 | 2;
    }

    private void f() {
        if (this.b(this.l, this.k)) {
            this.z(this.d());
            return;
        }
        this.i.clear();
        this.n = -1;
    }

    private boolean h(d d8, d d9) {
        int n8 = d8.q;
        if (n8 == 1 && d9.q == 1) {
            return false;
        }
        if (n8 == 0 && d9.q == 0) {
            return false;
        }
        return n8 != 2 || d9.q != 2 || !d8.c0.equals(d9.c0) || !d8.d0.equals(d9.d0);
    }

    private int i(d d8, List<c> list, boolean bl) {
        int n8 = d8.q;
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 == 3) {
                        return d8.c0.q;
                    }
                    throw new RuntimeException("Invalid coordinate value.");
                }
                if (bl) {
                    return d8.d0.q;
                }
                return d8.c0.c0;
            }
            return list.get((int)0).q;
        }
        return list.get((int)(list.size() - 1)).c0;
    }

    private boolean k() {
        return this.f.size() == 0 || this.g.size() == 0;
        {
        }
    }

    private boolean l(int n8, int n9, int n10, int n11, int n12, int n13) {
        int n14 = this.e();
        if (n14 != 0) {
            if (n14 != 1) {
                if (n14 != 2) {
                    if (n14 == 3) {
                        return n11 == n13;
                    }
                    throw new RuntimeException("Invalid corner type.");
                }
                return n8 == n10 && n11 == n12;
            }
            return n8 == n9 && n11 == n13;
        }
        return n8 == n9 && n11 == n12;
    }

    private d m(d d8, d d9) {
        if (d8.d(d9) > 0) {
            return d8;
        }
        return d9;
    }

    private d n(d d8, d d9) {
        if (d8.d(d9) < 0) {
            return d8;
        }
        return d9;
    }

    private void o() {
        Iterator<f<K>> iterator = this.d.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this.i);
        }
    }

    private void r(Rect rect, int n8) {
        SparseIntArray sparseIntArray;
        if (this.f.size() != this.a.h()) {
            this.s(this.f, new c(rect.left, rect.right));
        }
        this.s(this.g, new c(rect.top, rect.bottom));
        SparseIntArray sparseIntArray2 = sparseIntArray = (SparseIntArray)this.e.get(rect.left);
        if (sparseIntArray == null) {
            sparseIntArray2 = new SparseIntArray();
            this.e.put(rect.left, (Object)sparseIntArray2);
        }
        sparseIntArray2.put(rect.top, n8);
    }

    private void s(List<c> list, c c8) {
        int n8 = Collections.binarySearch(list, c8);
        if (n8 < 0) {
            list.add(~n8, c8);
        }
    }

    private void t() {
        for (int i8 = 0; i8 < this.a.i(); ++i8) {
            int n8 = this.a.g(i8);
            if (!this.a.j(n8) || !this.c.b(n8, true) || this.h.get(n8)) continue;
            this.h.put(n8, true);
            this.r(this.a.f(i8), n8);
        }
    }

    private void x() {
        e e8;
        ax.b0.g.i(this.k() ^ true);
        e e9 = this.l;
        this.l = e8 = this.g(this.j);
        if (e8.equals(e9)) {
            return;
        }
        this.f();
        this.o();
    }

    private void y(int n8, int n9, int n10, int n11) {
        this.i.clear();
        int n12 = n8;
        int n13 = n11;
        n11 = n9;
        int n14 = n8;
        for (n8 = n12; n8 <= n11; ++n8) {
            SparseIntArray sparseIntArray = (SparseIntArray)this.e.get(this.f.get((int)n8).q);
            n9 = n13;
            n13 = n14;
            for (n12 = n10; n12 <= n9; ++n12) {
                n14 = sparseIntArray.get(this.g.get((int)n12).q, -1);
                if (n14 == -1) continue;
                K k8 = this.b.a(n14);
                if (k8 != null && this.c(k8)) {
                    this.i.add(k8);
                }
                if (!this.l(n8, n13, n11, n12, n10, n9)) continue;
                this.n = n14;
            }
            n14 = n13;
            n13 = n9;
        }
    }

    private void z(Rect rect) {
        List<c> list = this.f;
        int n8 = rect.left;
        int n9 = Collections.binarySearch(list, new c(n8, n8));
        boolean bl = n9 >= 0;
        ax.b0.g.b(bl, "Rect doesn't intesect any known column.");
        int n10 = n8 = n9;
        while (n8 < this.f.size() && this.f.get((int)n8).q <= rect.right) {
            n10 = n8++;
        }
        list = this.g;
        n8 = rect.top;
        int n11 = Collections.binarySearch(list, new c(n8, n8));
        if (n11 < 0) {
            this.n = -1;
            return;
        }
        int n12 = n8 = n11;
        while (n8 < this.g.size() && this.g.get((int)n8).q <= rect.bottom) {
            n12 = n8++;
        }
        this.y(n9, n10, n11, n12);
    }

    void a(f<K> f8) {
        this.d.add(f8);
    }

    e g(Point point) {
        ax.b0.g.j(this.f.isEmpty() ^ true, "Column bounds not established.");
        ax.b0.g.j(this.g.isEmpty() ^ true, "Row bounds not established.");
        return new e(new d(this.f, point.x), new d(this.g, point.y));
    }

    int j() {
        return this.n;
    }

    void p() {
        this.d.clear();
        this.a.k(this.o);
    }

    void q(RecyclerView recyclerView, int n8, int n9) {
        if (this.m) {
            recyclerView = this.j;
            ((Point)recyclerView).x += n8;
            ((Point)recyclerView).y += n9;
            this.t();
            if (!this.k()) {
                this.x();
            }
        }
    }

    void u(Point point) {
        this.j = this.a.e(point);
        if (!this.k()) {
            this.x();
        }
    }

    void v(Point point) {
        this.t();
        if (this.k()) {
            return;
        }
        this.m = true;
        this.j = point = this.a.e(point);
        this.k = this.g(point);
        this.l = this.g(this.j);
        this.f();
        this.o();
    }

    void w() {
        this.m = false;
    }

    static abstract class b<K>
    extends c.c<K> {
        b() {
        }

        abstract Point e(Point var1);

        abstract Rect f(int var1);

        abstract int g(int var1);

        abstract int h();

        abstract int i();

        abstract boolean j(int var1);

        abstract void k(RecyclerView.u var1);
    }

    private static class c
    implements Comparable<c> {
        public int c0;
        public int q;

        c(int n8, int n9) {
            this.q = n8;
            this.c0 = n9;
        }

        public int d(c c8) {
            return this.q - c8.q;
        }

        public boolean equals(Object object) {
            if (!(object instanceof c)) {
                return false;
            }
            object = (c)object;
            return ((c)object).q == this.q && ((c)object).c0 == this.c0;
        }

        public int hashCode() {
            return this.q ^ this.c0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("(");
            stringBuilder.append(this.q);
            stringBuilder.append(", ");
            stringBuilder.append(this.c0);
            stringBuilder.append(")");
            return stringBuilder.toString();
        }
    }

    private static class d
    implements Comparable<d> {
        public c c0;
        public c d0;
        public c e0;
        public c f0;
        public final int q;

        d(List<c> object, int n8) {
            int n9 = Collections.binarySearch(object, new c(n8, n8));
            if (n9 >= 0) {
                this.q = 3;
                this.c0 = object.get(n9);
                return;
            }
            if ((n9 ^= 0xFFFFFFFF) == 0) {
                this.q = 1;
                this.e0 = object.get(0);
                return;
            }
            if (n9 == object.size()) {
                object = object.get(object.size() - 1);
                if (((c)object).q <= n8 && n8 <= ((c)object).c0) {
                    this.q = 3;
                    this.c0 = object;
                    return;
                }
                this.q = 0;
                this.f0 = object;
                return;
            }
            int n10 = n9 - 1;
            c c8 = object.get(n10);
            if (c8.q <= n8 && n8 <= c8.c0) {
                this.q = 3;
                this.c0 = (c)object.get(n10);
                return;
            }
            this.q = 2;
            this.c0 = (c)object.get(n10);
            this.d0 = (c)object.get(n9);
        }

        public int d(d d8) {
            return this.h() - d8.h();
        }

        public boolean equals(Object object) {
            if (!(object instanceof d)) {
                return false;
            }
            object = (d)object;
            return this.h() == ((d)object).h();
        }

        int h() {
            int n8 = this.q;
            if (n8 == 1) {
                return this.e0.q - 1;
            }
            if (n8 == 0) {
                return this.f0.c0 + 1;
            }
            if (n8 == 2) {
                return this.c0.c0 + 1;
            }
            return this.c0.q;
        }

        public int hashCode() {
            int n8 = this.e0.q;
            int n9 = this.f0.c0;
            c c8 = this.c0;
            return n8 ^ n9 ^ c8.c0 ^ c8.q;
        }
    }

    private static class e {
        final d a;
        final d b;

        e(d d8, d d9) {
            this.a = d8;
            this.b = d9;
        }

        public boolean equals(Object object) {
            if (!(object instanceof e)) {
                return false;
            }
            object = (e)object;
            return this.a.equals(((e)object).a) && this.b.equals(((e)object).b);
        }

        public int hashCode() {
            return this.a.h() ^ this.b.h();
        }
    }

    public static abstract class f<K> {
        abstract void a(Set<K> var1);
    }
}

