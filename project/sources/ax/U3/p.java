package ax.U3;

import ax.N3.b;
import ax.U3.m;
import ax.b0.InterfaceC1443d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class p<Model, Data> implements m<Model, Data> {
    private final List<m<Model, Data>> a;
    private final InterfaceC1443d<List<Exception>> b;

    static class a<Data> implements ax.N3.b<Data>, b.a<Data> {
        private final InterfaceC1443d<List<Exception>> c0;
        private int d0;
        private ax.J3.g e0;
        private b.a<? super Data> f0;
        private List<Exception> g0;
        private final List<ax.N3.b<Data>> q;

        a(List<ax.N3.b<Data>> list, InterfaceC1443d<List<Exception>> interfaceC1443d) {
            this.c0 = interfaceC1443d;
            ax.k4.h.c(list);
            this.q = list;
            this.d0 = 0;
        }

        private void g() {
            if (this.d0 >= this.q.size() - 1) {
                this.f0.c(new ax.P3.o("Fetch failed", new ArrayList(this.g0)));
            } else {
                this.d0++;
                e(this.e0, this.f0);
            }
        }

        @Override // ax.N3.b
        public Class<Data> a() {
            return this.q.get(0).a();
        }

        @Override // ax.N3.b
        public void b() {
            List<Exception> list = this.g0;
            if (list != null) {
                this.c0.a(list);
            }
            this.g0 = null;
            Iterator<ax.N3.b<Data>> it = this.q.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // ax.N3.b.a
        public void c(Exception exc) {
            this.g0.add(exc);
            g();
        }

        @Override // ax.N3.b
        public void cancel() {
            Iterator<ax.N3.b<Data>> it = this.q.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // ax.N3.b
        public ax.M3.a d() {
            return this.q.get(0).d();
        }

        @Override // ax.N3.b
        public void e(ax.J3.g gVar, b.a<? super Data> aVar) {
            this.e0 = gVar;
            this.f0 = aVar;
            this.g0 = this.c0.b();
            this.q.get(this.d0).e(gVar, this);
        }

        @Override // ax.N3.b.a
        public void f(Data data) {
            if (data != null) {
                this.f0.f(data);
            } else {
                g();
            }
        }
    }

    p(List<m<Model, Data>> list, InterfaceC1443d<List<Exception>> interfaceC1443d) {
        this.a = list;
        this.b = interfaceC1443d;
    }

    @Override // ax.U3.m
    public m.a<Data> a(Model model, int i, int i2, ax.M3.j jVar) {
        m.a<Data> a2;
        int size = this.a.size();
        ArrayList arrayList = new ArrayList(size);
        ax.M3.h hVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            m<Model, Data> mVar = this.a.get(i3);
            if (mVar.b(model) && (a2 = mVar.a(model, i, i2, jVar)) != null) {
                hVar = a2.a;
                arrayList.add(a2.c);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new m.a<>(hVar, new a(arrayList, this.b));
    }

    @Override // ax.U3.m
    public boolean b(Model model) {
        Iterator<m<Model, Data>> it = this.a.iterator();
        while (it.hasNext()) {
            if (it.next().b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiModelLoader{modelLoaders=");
        List<m<Model, Data>> list = this.a;
        sb.append(Arrays.toString(list.toArray(new m[list.size()])));
        sb.append('}');
        return sb.toString();
    }
}
