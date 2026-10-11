/*
 * Decompiled with CFR 0.152.
 */
package ax.f7;

import ax.f7.b;
import ax.i7.n;
import ax.i7.p;
import ax.i7.s;
import ax.i7.x;
import ax.m7.v;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class d
implements x,
n {
    static final Logger d = Logger.getLogger(d.class.getName());
    private final b a;
    private final n b;
    private final x c;

    public d(b b8, p p8) {
        this.a = v.d(b8);
        this.b = p8.g();
        this.c = p8.o();
        p8.v(this);
        p8.D(this);
    }

    @Override
    public boolean a(p p8, boolean bl) throws IOException {
        n n8 = this.b;
        bl = n8 != null && n8.a(p8, bl);
        if (bl) {
            try {
                this.a.l();
                return bl;
            }
            catch (IOException iOException) {
                d.log(Level.WARNING, "exception thrown while calling server callback", iOException);
            }
        }
        return bl;
    }

    @Override
    public boolean b(p p8, s s8, boolean bl) throws IOException {
        x x8 = this.c;
        boolean bl2 = x8 != null && x8.b(p8, s8, bl);
        if (bl2 && bl && s8.h() / 100 == 5) {
            try {
                this.a.l();
                return bl2;
            }
            catch (IOException iOException) {
                d.log(Level.WARNING, "exception thrown while calling server callback", iOException);
            }
        }
        return bl2;
    }
}

