/*
 * Decompiled with CFR 0.152.
 */
package ax.T0;

import ax.S0.G;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class e {
    public final int a;

    private e(int n8) {
        this.a = n8;
    }

    public static String a(int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append((char)(n8 >> 24 & 0xFF));
        stringBuilder.append((char)(n8 >> 16 & 0xFF));
        stringBuilder.append((char)(n8 >> 8 & 0xFF));
        stringBuilder.append((char)(n8 & 0xFF));
        return stringBuilder.toString();
    }

    public String toString() {
        return e.a(this.a);
    }

    public static final class b
    extends e {
        public final long b;
        public final List<c> c;
        public final List<b> d;

        public b(int n8, long l8) {
            super(n8);
            this.b = l8;
            this.c = new ArrayList<c>();
            this.d = new ArrayList<b>();
        }

        public void b(b b8) {
            this.d.add(b8);
        }

        public void c(c c8) {
            this.c.add(c8);
        }

        public b d(int n8) {
            int n9 = this.d.size();
            for (int i8 = 0; i8 < n9; ++i8) {
                b b8 = this.d.get(i8);
                if (b8.a != n8) continue;
                return b8;
            }
            return null;
        }

        public c e(int n8) {
            int n9 = this.c.size();
            for (int i8 = 0; i8 < n9; ++i8) {
                c c8 = this.c.get(i8);
                if (c8.a != n8) continue;
                return c8;
            }
            return null;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(e.a(this.a));
            stringBuilder.append(" leaves: ");
            stringBuilder.append(Arrays.toString(this.c.toArray()));
            stringBuilder.append(" containers: ");
            stringBuilder.append(Arrays.toString(this.d.toArray()));
            return stringBuilder.toString();
        }
    }

    public static final class c
    extends e {
        public final G b;

        public c(int n8, G g8) {
            super(n8);
            this.b = g8;
        }
    }
}

