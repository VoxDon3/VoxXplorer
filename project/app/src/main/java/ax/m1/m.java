/*
 * Decompiled with CFR 0.152.
 */
package ax.m1;

import ax.i1.B;
import ax.i1.y;
import java.io.IOException;

public interface m {
    public void a(long var1);

    public long b(c var1);

    public int c(int var1);

    public b d(a var1, c var2);

    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final int d;

        public a(int n8, int n9, int n10, int n11) {
            this.a = n8;
            this.b = n9;
            this.c = n10;
            this.d = n11;
        }

        public boolean a(int n8) {
            if (n8 == 1) {
                return this.a - this.b > 1;
            }
            return this.c - this.d > 1;
        }
    }

    public static final class b {
        public final int a;
        public final long b;

        public b(int n8, long l8) {
            boolean bl = l8 >= 0L;
            ax.S0.a.a(bl);
            this.a = n8;
            this.b = l8;
        }
    }

    public static final class c {
        public final y a;
        public final B b;
        public final IOException c;
        public final int d;

        public c(y y8, B b8, IOException iOException, int n8) {
            this.a = y8;
            this.b = b8;
            this.c = iOException;
            this.d = n8;
        }
    }
}

