/*
 * Decompiled with CFR 0.152.
 */
package ax.U3;

import ax.J3.g;
import ax.M3.j;
import ax.N3.b;
import ax.P3.o;
import ax.U3.m;
import ax.b0.d;
import ax.k4.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class p<Model, Data>
implements m<Model, Data> {
    private final List<m<Model, Data>> a;
    private final d<List<Exception>> b;

    p(List<m<Model, Data>> list, d<List<Exception>> d8) {
        this.a = list;
        this.b = d8;
    }

    @Override
    public m.a<Data> a(Model Model, int n8, int n9, j j8) {
        int n10 = this.a.size();
        ArrayList arrayList = new ArrayList(n10);
        ax.M3.h h8 = null;
        for (int i8 = 0; i8 < n10; ++i8) {
            Object object = this.a.get(i8);
            ax.M3.h h9 = h8;
            if (object.b(Model)) {
                object = object.a(Model, n8, n9, j8);
                h9 = h8;
                if (object != null) {
                    h9 = ((m.a)object).a;
                    arrayList.add(((m.a)object).c);
                }
            }
            h8 = h9;
        }
        if (!arrayList.isEmpty()) {
            return new m.a(h8, new a(arrayList, this.b));
        }
        return null;
    }

    @Override
    public boolean b(Model Model) {
        Iterator<m<Model, Data>> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().b(Model)) continue;
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MultiModelLoader{modelLoaders=");
        List<m<Model, Data>> list = this.a;
        stringBuilder.append(Arrays.toString(list.toArray(new m[list.size()])));
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    static class a<Data>
    implements b<Data>,
    b.a<Data> {
        private final d<List<Exception>> c0;
        private int d0;
        private g e0;
        private b.a<? super Data> f0;
        private List<Exception> g0;
        private final List<b<Data>> q;

        a(List<b<Data>> list, d<List<Exception>> d8) {
            this.c0 = d8;
            h.c(list);
            this.q = list;
            this.d0 = 0;
        }

        private void g() {
            if (this.d0 < this.q.size() - 1) {
                ++this.d0;
                this.e(this.e0, this.f0);
                return;
            }
            this.f0.c(new o("Fetch failed", new ArrayList<Exception>(this.g0)));
        }

        @Override
        public Class<Data> a() {
            return this.q.get(0).a();
        }

        @Override
        public void b() {
            List<Exception> list = this.g0;
            if (list != null) {
                this.c0.a(list);
            }
            this.g0 = null;
            list = this.q.iterator();
            while (list.hasNext()) {
                ((b)list.next()).b();
            }
        }

        @Override
        public void c(Exception exception) {
            this.g0.add(exception);
            this.g();
        }

        @Override
        public void cancel() {
            Iterator<b<Data>> iterator = this.q.iterator();
            while (iterator.hasNext()) {
                iterator.next().cancel();
            }
        }

        @Override
        public ax.M3.a d() {
            return this.q.get(0).d();
        }

        @Override
        public void e(g g8, b.a<? super Data> a8) {
            this.e0 = g8;
            this.f0 = a8;
            this.g0 = this.c0.b();
            this.q.get(this.d0).e(g8, this);
        }

        @Override
        public void f(Data Data) {
            if (Data != null) {
                this.f0.f(Data);
                return;
            }
            this.g();
        }
    }
}

