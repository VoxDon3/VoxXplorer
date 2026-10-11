/*
 * Decompiled with CFR 0.152.
 */
package ax.wa;

import ax.pa.c;
import ax.qa.b;
import ax.wa.d;
import ax.wa.e;
import java.io.IOException;
import java.util.Arrays;

public abstract class f<T extends e>
implements b {
    private T[] a;

    private int g(String string, c c8) throws IOException {
        long l8 = c8.h();
        if (l8 <= Integer.MAX_VALUE) {
            return (int)l8;
        }
        throw new ax.c.a(String.format("%s %d > %d", string, l8, Integer.MAX_VALUE));
    }

    @Override
    public void a(c c8) throws IOException {
        if (this.a != null) {
            T[] TArray;
            int n8;
            c8.a(ax.qa.a.e0);
            c8.b(4);
            int n9 = 0;
            for (n8 = 0; n8 < (TArray = this.a).length; ++n8) {
                TArray[n8] = this.e();
                ((e)this.a[n8]).b(c8);
            }
            int n10 = TArray.length;
            for (n8 = 0; n8 < n10; ++n8) {
                ((e)TArray[n8]).c(c8);
            }
            TArray = this.a;
            n10 = TArray.length;
            for (n8 = n9; n8 < n10; ++n8) {
                ((e)TArray[n8]).a(c8);
            }
        }
    }

    @Override
    public void b(c c8) throws IOException {
    }

    @Override
    public void c(c c8) throws IOException {
        c8.a(ax.qa.a.e0);
        int n8 = this.g("EntriesRead", c8);
        if (c8.j() != 0) {
            if (n8 >= 0) {
                this.a = this.d(n8);
                return;
            }
            throw new ax.c.a(String.format("Expected entriesRead >= 0, got: %d", n8));
        }
        this.a = null;
    }

    abstract T[] d(int var1);

    abstract T e();

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof f)) {
            return false;
        }
        return Arrays.equals(this.a, ((f)object).a);
    }

    public T[] f() {
        return this.a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public static class a
    extends f<d> {
        d[] h(int n8) {
            return new d[n8];
        }

        d i() {
            return new d();
        }
    }
}

