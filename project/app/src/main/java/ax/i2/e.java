/*
 * Decompiled with CFR 0.152.
 */
package ax.i2;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import ax.b0.g;
import ax.i2.A;
import ax.i2.C;
import ax.i2.D;
import ax.i2.I;
import ax.i2.J;
import ax.i2.p;
import ax.i2.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class e<K>
extends I<K>
implements C {
    private final D<K> a = new D();
    private final List<I.b<K>> b = new ArrayList<I.b<K>>(1);
    private final p<K> c;
    private final I.c<K> d;
    private final J<K> e;
    private final b f;
    private final a g;
    private final boolean h;
    private final String i;
    private A j;

    public e(String string, p<K> p8, I.c<K> c8, J<K> j8) {
        boolean bl = false;
        boolean bl2 = string != null;
        ax.b0.g.a(bl2);
        ax.b0.g.a(string.trim().isEmpty() ^ true);
        bl2 = p8 != null;
        ax.b0.g.a(bl2);
        bl2 = c8 != null;
        ax.b0.g.a(bl2);
        bl2 = bl;
        if (j8 != null) {
            bl2 = true;
        }
        ax.b0.g.a(bl2);
        this.i = string;
        this.c = p8;
        this.d = c8;
        this.e = j8;
        this.f = new b(this);
        this.h = c8.a() ^ true;
        this.g = new a(this);
    }

    private void A() {
        for (int i8 = this.b.size() - 1; i8 >= 0; --i8) {
            this.b.get(i8).b();
        }
    }

    private void B() {
        Iterator<I.b<K>> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            iterator.next().c();
        }
    }

    private void C(D<K> object) {
        Iterator iterator = ((D)object).q.iterator();
        while (iterator.hasNext()) {
            this.z(iterator.next(), false);
        }
        object = ((D)object).c0.iterator();
        while (object.hasNext()) {
            this.z(object.next(), false);
        }
    }

    private void D() {
        for (int i8 = this.b.size() - 1; i8 >= 0; --i8) {
            this.b.get(i8).d();
        }
    }

    private boolean F(Iterable<K> object, boolean bl) {
        object = object.iterator();
        boolean bl2 = false;
        while (object.hasNext()) {
            Object e8 = object.next();
            boolean bl3 = true;
            if (!(bl ? this.s(e8, true) && this.a.add(e8) : this.s(e8, false) && this.a.remove(e8))) {
                bl3 = false;
            }
            if (bl3) {
                this.z(e8, bl);
            }
            bl2 |= bl3;
        }
        return bl2;
    }

    private boolean s(K k8, boolean bl) {
        return this.d.c(k8, bl);
    }

    private void t() {
        if (!this.k()) {
            return;
        }
        this.C(this.v());
        this.A();
    }

    private D<K> v() {
        this.j = null;
        t t8 = new t();
        if (this.k()) {
            this.w(t8);
            this.a.clear();
        }
        return t8;
    }

    private void y(int n8, int n9) {
        if (!this.l()) {
            Log.e((String)"DefaultSelectionTracker", (String)"Ignoring attempt to extend unestablished range. Ignoring.");
            return;
        }
        if (n8 == -1) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Ignoring attempt to extend range to invalid position: ");
            stringBuilder.append(n8);
            Log.w((String)"DefaultSelectionTracker", (String)stringBuilder.toString());
            return;
        }
        this.j.b(n8, n9);
        this.A();
    }

    private void z(K k8, boolean bl) {
        boolean bl2 = k8 != null;
        ax.b0.g.a(bl2);
        for (int i8 = this.b.size() - 1; i8 >= 0; --i8) {
            this.b.get(i8).a(k8, bl);
        }
    }

    void E() {
        ArrayList<K> arrayList;
        int n8;
        if (this.a.isEmpty()) {
            Log.d((String)"DefaultSelectionTracker", (String)"Ignoring onDataSetChange. No active selection.");
            return;
        }
        this.a.e();
        this.D();
        Iterator<K> iterator = this.a.iterator();
        ArrayList<K> arrayList2 = null;
        while (iterator.hasNext()) {
            K k8 = iterator.next();
            if (this.c.b(k8) != -1 && this.s(k8, true)) {
                for (n8 = this.b.size() - 1; n8 >= 0; --n8) {
                    this.b.get(n8).a(k8, true);
                }
                continue;
            }
            arrayList = arrayList2;
            if (arrayList2 == null) {
                arrayList = new ArrayList<K>();
            }
            arrayList.add(k8);
            arrayList2 = arrayList;
        }
        if (arrayList2 != null) {
            int n9 = arrayList2.size();
            for (n8 = 0; n8 < n9; ++n8) {
                arrayList = arrayList2.get(n8);
                this.f(arrayList);
            }
        }
        this.A();
    }

    void G(int n8, int n9, boolean bl) {
        boolean bl2 = n9 >= n8;
        ax.b0.g.a(bl2);
        while (n8 <= n9) {
            block1: {
                K k8;
                block3: {
                    block2: {
                        k8 = this.c.a(n8);
                        if (k8 == null) break block1;
                        if (!bl) break block2;
                        if (!this.s(k8, true) || this.a.q.contains(k8)) break block1;
                        this.a.c0.add(k8);
                        break block3;
                    }
                    this.a.c0.remove(k8);
                }
                this.z(k8, bl);
            }
            ++n8;
        }
        this.A();
    }

    void H(int n8, int n9, boolean bl) {
        boolean bl2 = n9 >= n8;
        ax.b0.g.a(bl2);
        while (n8 <= n9) {
            K k8 = this.c.a(n8);
            if (k8 != null) {
                if (bl) {
                    this.o(k8);
                } else {
                    this.f(k8);
                }
            }
            ++n8;
        }
    }

    @Override
    public void a() {
        this.e();
        this.j = null;
    }

    @Override
    public void b(I.b<K> b8) {
        boolean bl = b8 != null;
        ax.b0.g.a(bl);
        this.b.add(b8);
    }

    @Override
    public void c(int n8) {
        boolean bl = n8 != -1;
        ax.b0.g.a(bl);
        ax.b0.g.a(this.a.contains(this.c.a(n8)));
        this.j = new A(n8, this.f);
    }

    @Override
    public boolean d() {
        return this.k() || this.l();
        {
        }
    }

    @Override
    public boolean e() {
        if (!this.k()) {
            return false;
        }
        this.u();
        this.t();
        this.B();
        return true;
    }

    @Override
    public boolean f(K k8) {
        boolean bl = k8 != null;
        ax.b0.g.a(bl);
        if (this.a.contains(k8)) {
            if (!this.s(k8, false)) {
                return false;
            }
            this.a.remove(k8);
            this.z(k8, false);
            this.A();
            if (this.a.isEmpty() && this.l()) {
                this.x();
            }
            return true;
        }
        return false;
    }

    @Override
    public void g(int n8) {
        if (this.h) {
            return;
        }
        this.y(n8, 1);
    }

    @Override
    public void h(int n8) {
        this.y(n8, 0);
    }

    @Override
    protected RecyclerView.j i() {
        return this.g;
    }

    @Override
    public D<K> j() {
        return this.a;
    }

    @Override
    public boolean k() {
        return this.a.isEmpty() ^ true;
    }

    @Override
    public boolean l() {
        return this.j != null;
    }

    @Override
    public boolean m(K k8) {
        return this.a.contains(k8);
    }

    @Override
    public void n() {
        this.a.i();
        this.A();
    }

    @Override
    public boolean o(K k8) {
        boolean bl = k8 != null;
        ax.b0.g.a(bl);
        if (this.a.contains(k8)) {
            return false;
        }
        if (!this.s(k8, true)) {
            return false;
        }
        if (this.h && this.k()) {
            this.C(this.v());
        }
        this.a.add(k8);
        this.z(k8, true);
        this.A();
        return true;
    }

    @Override
    public boolean p(Iterable<K> iterable, boolean bl) {
        bl = this.F(iterable, bl);
        this.A();
        return bl;
    }

    @Override
    public void q(Set<K> object) {
        if (this.h) {
            return;
        }
        for (Map.Entry<K, Boolean> entry : this.a.k((Set<Map.Entry<K, Boolean>>)((Object)object)).entrySet()) {
            this.z(entry.getKey(), entry.getValue());
        }
        this.A();
    }

    @Override
    public void r(int n8) {
        if (!this.a.contains(this.c.a(n8)) && !this.o(this.c.a(n8))) {
            return;
        }
        this.c(n8);
    }

    public void u() {
        Iterator iterator = this.a.c0.iterator();
        while (iterator.hasNext()) {
            this.z(iterator.next(), false);
        }
        this.a.e();
    }

    public void w(t<K> t8) {
        t8.g(this.a);
    }

    public void x() {
        this.j = null;
        this.u();
    }

    private static final class a
    extends RecyclerView.j {
        private final e<?> a;

        a(e<?> e8) {
            boolean bl = e8 != null;
            ax.b0.g.a(bl);
            this.a = e8;
        }

        @Override
        public void a() {
            this.a.E();
        }

        @Override
        public void c(int n8, int n9, Object object) {
            if (!"Selection-Changed".equals(object)) {
                this.a.E();
            }
        }

        @Override
        public void d(int n8, int n9) {
            this.a.x();
        }

        @Override
        public void e(int n8, int n9, int n10) {
            this.a.x();
        }

        @Override
        public void f(int n8, int n9) {
            this.a.x();
            this.a.E();
        }
    }

    private final class b
    extends A.a {
        final e a;

        b(e e8) {
            this.a = e8;
        }

        @Override
        void a(int n8, int n9, boolean bl, int n10) {
            if (n10 != 0) {
                if (n10 == 1) {
                    this.a.G(n8, n9, bl);
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid range type: ");
                stringBuilder.append(n10);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.a.H(n8, n9, bl);
        }
    }
}

