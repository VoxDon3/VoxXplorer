/*
 * Decompiled with CFR 0.152.
 */
package ax.p9;

import ax.Q8.q;
import ax.k9.e;
import ax.s9.n;

public interface c {
    public static final c a = new c(){

        @Override
        public n a() {
            return n.a;
        }

        @Override
        public <T> T b(ax.r9.b b8, e e8, b<T> b9) {
            return b9.a(e8);
        }

        @Override
        public <T> T c(ax.r9.b b8, q q8, e e8, b<T> b9) throws ax.p9.b {
            return b9.a(e8);
        }
    };

    public n a();

    public <T> T b(ax.r9.b var1, e var2, b<T> var3) throws ax.p9.b;

    public <T> T c(ax.r9.b var1, q var2, e var3, b<T> var4) throws ax.p9.b;

    public static interface b<T> {
        public T a(e var1);
    }
}

