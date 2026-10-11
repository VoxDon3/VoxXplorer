/*
 * Decompiled with CFR 0.152.
 */
package ax.Za;

import ax.Za.b;
import java.util.logging.Level;
import java.util.logging.Logger;

final class d
extends b.g {
    private static final Logger a = Logger.getLogger(d.class.getName());
    static final ThreadLocal<b> b = new ThreadLocal();

    d() {
    }

    @Override
    public b b() {
        b b8;
        b b9 = b8 = b.get();
        if (b8 == null) {
            b9 = ax.Za.b.i0;
        }
        return b9;
    }

    @Override
    public void c(b b8, b b9) {
        if (this.b() != b8) {
            a.log(Level.SEVERE, "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (b9 != ax.Za.b.i0) {
            b.set(b9);
            return;
        }
        b.set(null);
    }

    @Override
    public b d(b b8) {
        b b9 = this.b();
        b.set(b8);
        return b9;
    }
}

