/*
 * Decompiled with CFR 0.152.
 */
package ax.Sd;

import ax.Sd.b;
import ax.Wd.g;
import ax.Wd.h;
import ax.Wd.i;
import ax.Wd.j;

public class f
extends b {
    private static final g f = new g();
    private static final h g = new h();
    private static final i h = new i();
    private static final j i = new j();
    private ax.Wd.b[] b;
    private int c;
    private b.a d;
    private String e;

    public f() {
        ax.Wd.b[] bArray = new ax.Wd.b[4];
        this.b = bArray;
        bArray[0] = new ax.Wd.b(f);
        this.b[1] = new ax.Wd.b(g);
        this.b[2] = new ax.Wd.b(h);
        this.b[3] = new ax.Wd.b(i);
        this.j();
    }

    @Override
    public String c() {
        return this.e;
    }

    @Override
    public float d() {
        return 0.99f;
    }

    @Override
    public b.a e() {
        return this.d;
    }

    @Override
    public b.a f(byte[] object, int n8, int n9) {
        int n10;
        int n11 = n8;
        while ((n10 = n11) < n9 + n8 && this.d == b.a.q) {
            for (n11 = this.c - 1; n11 >= 0; --n11) {
                int n12 = this.b[n11].c(object[n10]);
                if (n12 == 1) {
                    this.c = n12 = this.c - 1;
                    if (n12 <= 0) {
                        object = (Object)b.a.d0;
                        this.d = (b.a)((Object)object);
                        return object;
                    }
                    if (n11 == n12) continue;
                    ax.Wd.b[] bArray = this.b;
                    ax.Wd.b b8 = bArray[n12];
                    bArray[n12] = bArray[n11];
                    bArray[n11] = b8;
                    continue;
                }
                if (n12 != 2) continue;
                this.d = b.a.c0;
                this.e = this.b[n11].a();
                return this.d;
            }
            n11 = n10 + 1;
        }
        return this.d;
    }

    @Override
    public final void j() {
        ax.Wd.b[] bArray;
        this.d = b.a.q;
        for (int i8 = 0; i8 < (bArray = this.b).length; ++i8) {
            bArray[i8].d();
        }
        this.c = bArray.length;
        this.e = null;
    }
}

