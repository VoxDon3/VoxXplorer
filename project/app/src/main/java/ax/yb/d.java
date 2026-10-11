/*
 * Decompiled with CFR 0.152.
 */
package ax.yb;

import ax.Gb.l;
import ax.wb.e;
import ax.wb.f;
import ax.wb.i;
import ax.yb.a;
import ax.yb.c;

public abstract class d
extends a {
    private final i c0;
    private transient e<Object> d0;

    public d(e<Object> e8) {
        i i8 = e8 != null ? e8.b() : null;
        this(e8, i8);
    }

    public d(e<Object> e8, i i8) {
        super(e8);
        this.c0 = i8;
    }

    @Override
    public i b() {
        i i8 = this.c0;
        l.c(i8);
        return i8;
    }

    @Override
    protected void q() {
        e<Object> e8 = this.d0;
        if (e8 != null && e8 != this) {
            f f8 = this.b().a(f.b0);
            l.c(f8);
            f8.s0(e8);
        }
        this.d0 = c.q;
    }

    public final e<Object> t() {
        Object object;
        block2: {
            block4: {
                block3: {
                    e<Object> e8;
                    object = e8 = this.d0;
                    if (e8 != null) break block2;
                    object = this.b().a(f.b0);
                    if (object == null) break block3;
                    object = e8 = object.A(this);
                    if (e8 != null) break block4;
                }
                object = this;
            }
            this.d0 = object;
        }
        return object;
    }
}

