/*
 * Decompiled with CFR 0.152.
 */
package ax.Wb;

import ax.Fb.p;
import ax.Qb.A0;
import ax.Qb.z;
import ax.Qb.z0;
import ax.Vb.B;
import ax.Vb.J;
import ax.sb.n;
import ax.sb.o;
import ax.wb.e;
import ax.wb.i;
import ax.yb.h;

public final class b {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final <R, T> void a(p<? super R, ? super e<? super T>, ? extends Object> object, R r8, e<? super T> object2) {
        Throwable throwable2222222;
        e<T> e8;
        block7: {
            e8 = h.a(object2);
            object2 = object2.b();
            Object object3 = J.c((i)object2, null);
            {
                catch (Throwable throwable2222222) {
                    break block7;
                }
                try {
                    object = ((p)ax.Gb.z.c(object, 2)).j(r8, e8);
                }
                finally {
                    J.a((i)object2, object3);
                }
            }
        }
        object = n.q;
        e8.f(n.a(o.a(throwable2222222)));
    }

    public static final <T, R> Object b(B<? super T> object, R object2, p<? super R, ? super e<? super T>, ? extends Object> p8) {
        block7: {
            block5: {
                block6: {
                    block4: {
                        try {
                            object2 = ((p)ax.Gb.z.c(p8, 2)).j(object2, object);
                        }
                        catch (Throwable throwable) {
                            object2 = new z(throwable, false, 2, null);
                        }
                        if (object2 != ax.xb.b.c()) break block4;
                        object = ax.xb.b.c();
                        break block5;
                    }
                    if ((object = ((z0)object).f0(object2)) != A0.b) break block6;
                    object = ax.xb.b.c();
                    break block5;
                }
                if (object instanceof z) break block7;
                object = A0.h(object);
            }
            return object;
        }
        throw ((z)object).a;
    }
}

