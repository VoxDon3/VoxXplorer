/*
 * Decompiled with CFR 0.152.
 */
package ax.q1;

import ax.P0.k;
import ax.P0.v;
import ax.S0.G;
import java.io.IOException;
import java.util.Arrays;

public interface U {
    public int a(k var1, int var2, boolean var3) throws IOException;

    public void b(G var1, int var2, int var3);

    public int c(k var1, int var2, boolean var3, int var4) throws IOException;

    public void d(long var1);

    public void e(v var1);

    public void f(long var1, int var3, int var4, int var5, a var6);

    public void g(G var1, int var2);

    public static final class a {
        public final int a;
        public final byte[] b;
        public final int c;
        public final int d;

        public a(int n8, byte[] byArray, int n9, int n10) {
            this.a = n8;
            this.b = byArray;
            this.c = n9;
            this.d = n10;
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object != null && a.class == object.getClass()) {
                object = (a)object;
                if (this.a == ((a)object).a && this.c == ((a)object).c && this.d == ((a)object).d && Arrays.equals(this.b, ((a)object).b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((this.a * 31 + Arrays.hashCode(this.b)) * 31 + this.c) * 31 + this.d;
        }
    }
}

