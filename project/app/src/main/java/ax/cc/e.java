/*
 * Decompiled with CFR 0.152.
 */
package ax.cc;

import ax.cc.a;
import ax.cc.c;
import ax.ec.c;
import ax.ec.d;

public class e<T>
extends a<T>
implements ax.dc.c<T> {
    public e() {
        super(new ax.ec.a().e(c.a.a()));
    }

    public e(d d8) {
        super(d8);
    }

    public e(ax.fc.a a8) {
        super(new ax.ec.a().e(c.a.a()).d(a8));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public c a(T object) {
        object = this.c(object);
        try {
            object.execute();
            return object;
        }
        catch (Throwable throwable) {
            try {
                ax.fc.d d8 = new ax.fc.d();
                this.f(d8.d("Error during publication of message").c(throwable).e((c)object));
                return object;
            }
            catch (Throwable throwable2) {
                return object;
            }
        }
    }
}

