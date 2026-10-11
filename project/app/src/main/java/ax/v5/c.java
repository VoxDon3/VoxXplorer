/*
 * Decompiled with CFR 0.152.
 */
package ax.v5;

import ax.n5.j;
import ax.p5.i;
import ax.p5.p;
import ax.p5.u;
import ax.v5.a;
import ax.v5.b;
import ax.v5.e;
import ax.w5.x;
import ax.x5.d;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

public class c
implements e {
    private static final Logger f = Logger.getLogger(u.class.getName());
    private final x a;
    private final Executor b;
    private final ax.q5.e c;
    private final d d;
    private final ax.y5.b e;

    public c(Executor executor, ax.q5.e e8, x x8, d d8, ax.y5.b b8) {
        this.b = executor;
        this.c = e8;
        this.a = x8;
        this.d = d8;
        this.e = b8;
    }

    public static /* synthetic */ Object b(c c8, p p8, i i8) {
        c8.d.E(p8, i8);
        c8.a.a(p8, 1);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* synthetic */ void c(c object, p object2, j j8, i object3) {
        Exception exception2;
        block3: {
            Object object4;
            object.getClass();
            try {
                object4 = ((c)object).c.i(((p)object2).b());
                if (object4 == null) {
                    object = String.format("Transport backend '%s' is not registered", ((p)object2).b());
                    f.warning((String)object);
                    object2 = new IllegalArgumentException((String)object);
                    j8.a((Exception)object2);
                    return;
                }
            }
            catch (Exception exception2) {
                break block3;
            }
            object3 = object4.a((i)object3);
            object4 = ((c)object).e;
            b b8 = new b((c)object, (p)object2, (i)object3);
            object4.a(b8);
            j8.a(null);
            return;
        }
        object3 = f;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Error scheduling event ");
        ((StringBuilder)object2).append(exception2.getMessage());
        ((Logger)object3).warning(((StringBuilder)object2).toString());
        j8.a(exception2);
    }

    @Override
    public void a(p p8, i i8, j j8) {
        this.b.execute(new a(this, p8, j8, i8));
    }
}

