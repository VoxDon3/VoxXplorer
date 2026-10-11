/*
 * Decompiled with CFR 0.152.
 */
package ax.b4;

import ax.P3.p;
import ax.Z3.a;
import ax.b4.c;

public class e
extends a<c>
implements p {
    public e(c c8) {
        super(c8);
    }

    @Override
    public void a() {
        ((c)this.q).d().prepareToDraw();
    }

    @Override
    public Class<c> b() {
        return c.class;
    }

    @Override
    public int getSize() {
        return ((c)this.q).h();
    }

    @Override
    public void recycle() {
        ((c)this.q).stop();
        ((c)this.q).i();
    }
}

