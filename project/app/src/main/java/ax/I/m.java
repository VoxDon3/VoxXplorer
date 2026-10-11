/*
 * Decompiled with CFR 0.152.
 */
package ax.I;

import ax.H.e;
import ax.I.c;
import ax.I.d;
import ax.I.f;
import ax.I.k;
import ax.I.l;
import ax.I.n;
import ax.I.p;
import java.util.ArrayList;

class m {
    public static int h;
    public int a = 0;
    public boolean b = false;
    p c = null;
    p d = null;
    ArrayList<p> e = new ArrayList();
    int f;
    int g;

    public m(p p8, int n8) {
        int n9;
        this.f = n9 = h;
        h = n9 + 1;
        this.c = p8;
        this.d = p8;
        this.g = n8;
    }

    private long c(f f8, long l8) {
        long l9;
        p p8 = f8.d;
        if (p8 instanceof k) {
            return l8;
        }
        int n8 = f8.k.size();
        long l10 = l8;
        for (int i8 = 0; i8 < n8; ++i8) {
            d d8 = f8.k.get(i8);
            l9 = l10;
            if (d8 instanceof f) {
                d8 = (f)d8;
                l9 = ((f)d8).d == p8 ? l10 : Math.min(l10, this.c((f)d8, (long)((f)d8).f + l8));
            }
            l10 = l9;
        }
        if (f8 == p8.i) {
            l9 = p8.j();
            f8 = p8.h;
            return Math.min(Math.min(l10, this.c(f8, l8 -= l9)), l8 - (long)p8.h.f);
        }
        return l10;
    }

    private long d(f f8, long l8) {
        long l9;
        p p8 = f8.d;
        if (p8 instanceof k) {
            return l8;
        }
        int n8 = f8.k.size();
        long l10 = l8;
        for (int i8 = 0; i8 < n8; ++i8) {
            d d8 = f8.k.get(i8);
            l9 = l10;
            if (d8 instanceof f) {
                d8 = (f)d8;
                l9 = ((f)d8).d == p8 ? l10 : Math.max(l10, this.d((f)d8, (long)((f)d8).f + l8));
            }
            l10 = l9;
        }
        if (f8 == p8.h) {
            l9 = p8.j();
            f8 = p8.i;
            return Math.max(Math.max(l10, this.d(f8, l8 += l9)), l8 - (long)p8.i.f);
        }
        return l10;
    }

    public void a(p p8) {
        this.e.add(p8);
        this.d = p8;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public long b(ax.H.f object, int n8) {
        long l8;
        Object var18_7;
        p p8 = this.c;
        boolean bl = p8 instanceof c;
        long l9 = 0L;
        if (bl ? ((c)p8).f != n8 : (n8 == 0 ? !(p8 instanceof l) : !(p8 instanceof n))) {
            return 0L;
        }
        if (n8 == 0) {
            l l10 = ((e)object).e;
        } else {
            n n9 = ((e)object).f;
        }
        f f8 = var18_7.h;
        object = n8 == 0 ? ((e)object).e : ((e)object).f;
        object = ((p)object).i;
        boolean bl2 = p8.h.l.contains(f8);
        bl = this.c.i.l.contains(object);
        long l11 = this.c.j();
        if (bl2 && bl) {
            float f9;
            l8 = this.d(this.c.h, 0L);
            long l12 = this.c(this.c.i, 0L);
            long l13 = l8 - l11;
            object = this.c;
            int n10 = ((p)object).i.f;
            l8 = l13;
            if (l13 >= (long)(-n10)) {
                l8 = l13 + (long)n10;
            }
            l13 = -l12;
            n10 = ((p)object).h.f;
            l13 = l12 = l13 - l11 - (long)n10;
            if (l12 >= (long)n10) {
                l13 = l12 - (long)n10;
            }
            if ((f9 = ((p)object).b.q(n8)) > 0.0f) {
                l9 = (long)((float)l13 / f9 + (float)l8 / (1.0f - f9));
            }
            float f10 = l9;
            l13 = (long)(f10 * f9 + 0.5f);
            l8 = (long)(f10 * (1.0f - f9) + 0.5f);
            object = this.c;
            l8 = (long)((p)object).h.f + (l13 + l11 + l8);
            n8 = ((p)object).i.f;
            return l8 - (long)n8;
        }
        if (bl2) {
            object = this.c.h;
            return Math.max(this.d((f)object, ((f)object).f), (long)this.c.h.f + l11);
        }
        if (bl) {
            object = this.c.i;
            long l14 = this.c((f)object, ((f)object).f);
            long l15 = -this.c.i.f;
            return Math.max(-l14, l15 + l11);
        }
        object = this.c;
        l8 = (long)((p)object).h.f + ((p)object).j();
        n8 = this.c.i.f;
        return l8 - (long)n8;
    }
}

