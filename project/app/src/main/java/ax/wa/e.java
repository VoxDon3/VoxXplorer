/*
 * Decompiled with CFR 0.152.
 */
package ax.wa;

import ax.pa.c;
import ax.qa.a;
import ax.qa.b;
import ax.xa.a;
import java.io.IOException;

public class e
implements b {
    private a.a a;

    @Override
    public void a(c c8) throws IOException {
        a.a a8 = this.a;
        if (a8 != null) {
            c8.k(a8);
        }
    }

    @Override
    public void b(c c8) throws IOException {
    }

    @Override
    public void c(c c8) throws IOException {
        c8.a(ax.qa.a.e0);
        if (c8.j() != 0) {
            this.a = new a.a();
            return;
        }
        this.a = null;
    }

    public a.a d() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        object = (e)object;
        return j.Objects.equals((Object)this.a, (Object)((e)object).a);
    }

    public int hashCode() {
        return j.Objects.hash((Object[])new Object[]{this.a});
    }
}

