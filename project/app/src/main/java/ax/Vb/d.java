/*
 * Decompiled with CFR 0.152.
 */
package ax.Vb;

import ax.Fb.p;
import ax.Vb.C;
import ax.Vb.D;
import ax.Vb.F;
import ax.Vb.e;

public final class d {
    private static final F a = new F("CLOSED");

    public static final <N extends e<N>> N b(N object) {
        Object object2;
        while ((object2 = e.a(object)) != d.a) {
            if ((object2 = (e)object2) == null) {
                if (!object.j()) continue;
                return object;
            }
            object = object2;
        }
        return object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final <S extends C<S>> Object c(S object, long l8, p<? super Long, ? super S, ? extends S> p8) {
        Object object2 = object;
        Object var1_7;
        while (((C)object2).d0 < var1_7 || ((C)object2).h()) {
            Object var0_4;
            Object object3 = e.a((e)object2);
            if (object3 == d.a) {
                return D.a(a);
            }
            C c8 = (C)((e)object3);
            if (c8 == null) {
                C var3_8;
                C c9 = (C)var3_8.j(((C)object2).d0 + 1L, object2);
                if (!((e)object2).l(c9)) continue;
                C c10 = c9;
                if (((C)object2).h()) {
                    ((e)object2).k();
                    C c11 = c9;
                }
            }
            object2 = var0_4;
        }
        return D.a(object2);
    }
}

