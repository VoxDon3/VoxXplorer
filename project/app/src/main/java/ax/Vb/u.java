/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Nb.h;
import ax.Qb.D0;
import ax.Vb.G;
import ax.Vb.t;
import ax.Vb.v;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

public final class u {
    public static final u a;
    public static final D0 b;

    static {
        u u8;
        a = u8 = new u();
        G.f("kotlinx.coroutines.fast.service.loader", true);
        b = u8.a();
    }

    private u() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final D0 a() {
        Throwable throwable2;
        block8: {
            try {
                Object object;
                List<t> list = h.m(h.d(ServiceLoader.load(t.class, t.class.getClassLoader()).iterator()));
                Iterator iterator = ((Iterable)list).iterator();
                if (!iterator.hasNext()) {
                    object = null;
                } else {
                    object = iterator.next();
                    if (iterator.hasNext()) {
                        int n8 = object.c();
                        Object object2 = object;
                        do {
                            Object t8 = iterator.next();
                            int n9 = ((t)t8).c();
                            object = object2;
                            int n10 = n8;
                            if (n8 < n9) {
                                object = t8;
                                n10 = n9;
                            }
                            object2 = object;
                            n8 = n10;
                        } while (iterator.hasNext());
                    }
                }
                object = (t)object;
                if (object != null && (object = v.e((t)object, list)) != null) {
                    return object;
                }
            }
            catch (Throwable throwable2) {
                break block8;
            }
            v.b(null, null, 3, null);
            return null;
        }
        v.b(throwable2, null, 2, null);
        return null;
    }
}

