package ax.U3;

import ax.N3.b;
import ax.U3.m;

/* loaded from: classes.dex */
public class u<Model> implements m<Model, Model> {

    public static class a<Model> implements n<Model, Model> {
        @Override // ax.U3.n
        public m<Model, Model> b(q qVar) {
            return new u();
        }
    }

    @Override // ax.U3.m
    public m.a<Model> a(Model model, int i, int i2, ax.M3.j jVar) {
        return new m.a<>(new ax.j4.b(model), new b(model));
    }

    @Override // ax.U3.m
    public boolean b(Model model) {
        return true;
    }

    private static class b<Model> implements ax.N3.b<Model> {
        private final Model q;

        public b(Model model) {
            this.q = model;
        }

        @Override // ax.N3.b
        public Class<Model> a() {
            return (Class<Model>) this.q.getClass();
        }

        @Override // ax.N3.b
        public ax.M3.a d() {
            return ax.M3.a.LOCAL;
        }

        @Override // ax.N3.b
        public void e(ax.J3.g gVar, b.a<? super Model> aVar) {
            aVar.f(this.q);
        }

        @Override // ax.N3.b
        public void b() {
        }

        @Override // ax.N3.b
        public void cancel() {
        }
    }
}
