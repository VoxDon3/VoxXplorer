/*
 * Decompiled with CFR 0.152.
 */
package ax.xa;

import ax.pa.c;
import ax.qa.b;
import java.io.IOException;

public abstract class a
implements b {
    private String a = "";
    private int b;
    private int c;

    private int f(String string, c c8) throws IOException {
        long l8 = c8.h();
        if (l8 <= Integer.MAX_VALUE) {
            return (int)l8;
        }
        throw new ax.c.a(String.format("%s %d > %d", string, l8, Integer.MAX_VALUE));
    }

    @Override
    public void a(c c8) throws IOException {
        boolean bl;
        int n8;
        c8.a(ax.qa.a.d0);
        c8.b(this.b * 2);
        boolean bl2 = this.e();
        int n9 = 0;
        if (bl2 && (n8 = this.c) > 0) {
            bl = true;
            --n8;
        } else {
            n8 = this.c;
            bl = false;
        }
        StringBuilder stringBuilder = new StringBuilder(n8);
        while (n9 < n8) {
            stringBuilder.append(c8.d());
            ++n9;
        }
        this.a = stringBuilder.toString();
        if (bl) {
            c8.b(2);
        }
    }

    @Override
    public void b(c c8) throws IOException {
        c8.a(ax.qa.a.e0);
        c8.b(4);
    }

    @Override
    public void c(c c8) throws IOException {
        c8.a(ax.qa.a.e0);
        this.b = this.f("Offset", c8);
        this.c = this.f("ActualCount", c8);
    }

    public String d() {
        return this.a;
    }

    public abstract boolean e();

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
        return this.e() == ((a)object).e() && j.Objects.equals((Object)this.d(), (Object)((a)object).d());
    }

    public int hashCode() {
        return j.Objects.hash((Object[])new Object[]{this.e(), this.d()});
    }

    public String toString() {
        if (this.d() == null) {
            return "null";
        }
        return String.format("\"%s\"", this.d());
    }

    public static class a
    extends a {
        @Override
        public boolean e() {
            return true;
        }
    }
}

