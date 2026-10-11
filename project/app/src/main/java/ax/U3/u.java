/*
 * Decompiled with CFR 0.152.
 */
package ax.U3;

import ax.J3.g;
import ax.M3.j;
import ax.N3.b;
import ax.U3.m;
import ax.U3.n;
import ax.U3.q;

public class u<Model>
implements m<Model, Model> {
    @Override
    public m.a<Model> a(Model Model, int n8, int n9, j j8) {
        return new m.a<Model>(new ax.j4.b(Model), new b<Model>(Model));
    }

    @Override
    public boolean b(Model Model) {
        return true;
    }

    public static class a<Model>
    implements n<Model, Model> {
        @Override
        public m<Model, Model> b(q q8) {
            return new u();
        }
    }

    private static class b<Model>
    implements ax.N3.b<Model> {
        private final Model q;

        public b(Model Model) {
            this.q = Model;
        }

        @Override
        public Class<Model> a() {
            return this.q.getClass();
        }

        @Override
        public void b() {
        }

        @Override
        public void cancel() {
        }

        @Override
        public ax.M3.a d() {
            return ax.M3.a.q;
        }

        @Override
        public void e(g g8, b.a<? super Model> a8) {
            a8.f(this.q);
        }
    }
}

