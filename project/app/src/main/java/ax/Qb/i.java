/*
 * Decompiled with CFR 0.152.
 */
package ax.Qb;

import ax.Fb.p;
import ax.Gb.l;
import ax.Qb.B0;
import ax.Qb.C0;
import ax.Qb.F;
import ax.Qb.J;
import ax.Qb.J0;
import ax.Qb.L;
import ax.Qb.P0;
import ax.Qb.Q;
import ax.Qb.S;
import ax.Qb.U;
import ax.Qb.a;
import ax.Qb.g;
import ax.Qb.s0;
import ax.Qb.w0;
import ax.Vb.B;
import ax.sb.t;
import ax.wb.e;
import ax.wb.f;
import ax.wb.j;
import ax.xb.b;
import ax.yb.h;

final class i {
    public static final <T> Q<T> a(J s8, ax.wb.i i8, L l8, p<? super J, ? super e<? super T>, ? extends Object> p8) {
        s8 = F.d(s8, i8);
        s8 = l8.j() ? new B0((ax.wb.i)s8, p8) : new S(s8, true);
        s8.N0(l8, s8, p8);
        return s8;
    }

    public static /* synthetic */ Q b(J j8, ax.wb.i i8, L l8, p p8, int n8, Object object) {
        if ((n8 & 1) != 0) {
            i8 = j.q;
        }
        if ((n8 & 2) != 0) {
            l8 = L.q;
        }
        return g.a(j8, i8, l8, p8);
    }

    public static final s0 c(J object, ax.wb.i i8, L l8, p<? super J, ? super e<? super t>, ? extends Object> p8) {
        object = F.d((J)object, i8);
        object = l8.j() ? new C0((ax.wb.i)object, p8) : new J0((ax.wb.i)object, true);
        ((a)object).N0(l8, object, p8);
        return object;
    }

    public static /* synthetic */ s0 d(J j8, ax.wb.i i8, L l8, p p8, int n8, Object object) {
        if ((n8 & 1) != 0) {
            i8 = j.q;
        }
        if ((n8 & 2) != 0) {
            l8 = L.q;
        }
        return g.c(j8, i8, l8, p8);
    }

    public static final <T> Object e(ax.wb.i object, p<? super J, ? super e<? super T>, ? extends Object> p8, e<? super T> e8) {
        ax.wb.i i8 = e8.b();
        object = F.e(i8, (ax.wb.i)object);
        w0.f((ax.wb.i)object);
        if (object == i8) {
            object = new B<T>((ax.wb.i)object, e8);
            object = ax.Wb.b.b(object, object, p8);
        } else {
            Object object2 = f.b0;
            if (l.a(object.a(object2), i8.a(object2))) {
                object = new P0<T>((ax.wb.i)object, e8);
                i8 = ((a)object).b();
                object2 = ax.Vb.J.c(i8, null);
                try {
                    object = ax.Wb.b.b(object, object, p8);
                }
                finally {
                    ax.Vb.J.a(i8, object2);
                }
            } else {
                object = new U<T>((ax.wb.i)object, e8);
                ax.Wb.a.d(p8, object, (e)object, null, 4, null);
                object = ((U)object).O0();
            }
        }
        if (object == b.c()) {
            h.c(e8);
        }
        return object;
    }
}

