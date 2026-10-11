/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import android.os.Looper;
import ax.Z0.I1;
import ax.b1.C;
import ax.b1.U;
import ax.b1.n;
import ax.b1.u;
import ax.b1.v;
import ax.b1.x;

public interface w {
    public static final w a = new w(){

        @Override
        public int a(ax.P0.v v8) {
            if (v8.s != null) {
                return 1;
            }
            return 0;
        }

        @Override
        public n b(u.a a8, ax.P0.v v8) {
            if (v8.s == null) {
                return null;
            }
            return new C(new n.a(new U(1), 6001));
        }

        @Override
        public void c(Looper looper, I1 i12) {
        }

        @Override
        public /* synthetic */ void d() {
            v.c(this);
        }

        @Override
        public /* synthetic */ b e(u.a a8, ax.P0.v v8) {
            return v.a(this, a8, v8);
        }

        @Override
        public /* synthetic */ void k() {
            v.b(this);
        }
    };

    public int a(ax.P0.v var1);

    public n b(u.a var1, ax.P0.v var2);

    public void c(Looper var1, I1 var2);

    public void d();

    public b e(u.a var1, ax.P0.v var2);

    public void k();

    public static interface b {
        public static final b a = new x();

        public void d();
    }
}

