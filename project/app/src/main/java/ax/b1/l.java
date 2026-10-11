/*
 * Decompiled with CFR 0.152.
 */
package ax.b1;

import ax.P0.y;
import ax.S0.a;
import ax.U0.g;
import ax.U0.n;
import ax.b1.O;
import ax.b1.P;
import ax.b1.S;
import ax.b1.h;
import ax.b1.w;
import ax.b1.z;
import ax.m1.m;
import ax.u7.f;
import java.util.Map;

public final class l
implements z {
    private final Object a = new Object();
    private y.f b;
    private w c;
    private g.a d;
    private String e;
    private m f;

    private w b(y.f f8) {
        Object object = this.d;
        if (object == null) {
            object = new n.b().c(this.e);
        }
        Object object2 = f8.c;
        object2 = object2 == null ? null : object2.toString();
        object = new P((String)object2, f8.h, (g.a)object);
        Object object3 = f8.e.g().n();
        while (object3.hasNext()) {
            object2 = (Map.Entry)object3.next();
            ((P)object).c((String)object2.getKey(), (String)object2.getValue());
        }
        object3 = new h.b().f(f8.a, O.d).c(f8.f).d(f8.g).e(ax.u7.f.o(f8.j));
        object2 = this.f;
        if (object2 != null) {
            ((h.b)object3).b((m)object2);
        }
        object = ((h.b)object3).a((S)object);
        ((h)object).G(0, f8.c());
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public w a(y object) {
        ax.S0.a.e(((y)object).b);
        y.f f8 = ((y)object).b.c;
        if (f8 == null) {
            return w.a;
        }
        object = this.a;
        synchronized (object) {
            try {
                if (((Object)f8).equals(this.b)) return ax.S0.a.e(this.c);
                this.b = f8;
                this.c = this.b(f8);
                return ax.S0.a.e(this.c);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

