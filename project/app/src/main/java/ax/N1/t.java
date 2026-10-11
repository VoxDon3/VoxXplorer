/*
 * Decompiled with CFR 0.152.
 */
package ax.N1;

import ax.N1.e;
import ax.N1.k;
import ax.P0.v;
import ax.S0.l;

public interface t {
    public void a();

    public k b(byte[] var1, int var2, int var3);

    public void c(byte[] var1, int var2, int var3, b var4, l<e> var5);

    public int d();

    public static interface a {
        public static final a a = new a(){

            @Override
            public int a(v v8) {
                return 1;
            }

            @Override
            public boolean b(v v8) {
                return false;
            }

            @Override
            public t c(v v8) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        };

        public int a(v var1);

        public boolean b(v var1);

        public t c(v var1);
    }

    public static class b {
        private static final b c = new b(-9223372036854775807L, false);
        public final long a;
        public final boolean b;

        private b(long l8, boolean bl) {
            this.a = l8;
            this.b = bl;
        }

        static /* synthetic */ b a() {
            return c;
        }

        public static b b() {
            return c;
        }

        public static b c(long l8) {
            return new b(l8, true);
        }
    }
}

