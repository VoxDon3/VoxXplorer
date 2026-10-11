/*
 * Decompiled with CFR 0.152.
 */
package ax.wa;

import ax.wa.c;
import ax.xa.a;
import java.io.IOException;

public class d
extends c {
    private int b;
    private a.a c;

    @Override
    public void a(ax.pa.c c8) throws IOException {
        super.a(c8);
        a.a a8 = this.c;
        if (a8 != null) {
            c8.k(a8);
        }
    }

    @Override
    public void c(ax.pa.c c8) throws IOException {
        super.c(c8);
        this.b = (int)c8.h();
        if (c8.j() != 0) {
            this.c = new a.a();
            return;
        }
        this.c = null;
    }

    public a.a e() {
        return this.c;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof d)) {
            return false;
        }
        d d8 = (d)object;
        return super.equals(object) && this.b == d8.b && j.Objects.equals((Object)this.e(), (Object)d8.e());
    }

    public int f() {
        return this.b;
    }

    @Override
    public int hashCode() {
        return super.hashCode() * 31 + j.Objects.hash((Object[])new Object[]{this.f(), this.e()});
    }

    public String toString() {
        return String.format("SHARE_INFO_1{shi1_netname: %s, shi1_type: %d, shi1_remark: %s}", this.d(), this.f(), this.e());
    }
}

