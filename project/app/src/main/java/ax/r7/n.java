/*
 * Decompiled with CFR 0.152.
 */
package ax.r7;

import java.util.Comparator;

public abstract class n {
    private static final n a = new n(){

        @Override
        public n d(int n8, int n9) {
            return this.k(Integer.compare(n8, n9));
        }

        @Override
        public n e(long l8, long l9) {
            return this.k(Long.compare(l8, l9));
        }

        @Override
        public <T> n f(T t8, T t9, Comparator<T> comparator) {
            return this.k(comparator.compare(t8, t9));
        }

        @Override
        public n g(boolean bl, boolean bl2) {
            return this.k(Boolean.compare(bl, bl2));
        }

        @Override
        public n h(boolean bl, boolean bl2) {
            return this.k(Boolean.compare(bl2, bl));
        }

        @Override
        public int i() {
            return 0;
        }

        n k(int n8) {
            if (n8 < 0) {
                return b;
            }
            if (n8 > 0) {
                return c;
            }
            return a;
        }
    };
    private static final n b = new b(-1);
    private static final n c = new b(1);

    private n() {
    }

    public static n j() {
        return a;
    }

    public abstract n d(int var1, int var2);

    public abstract n e(long var1, long var3);

    public abstract <T> n f(T var1, T var2, Comparator<T> var3);

    public abstract n g(boolean var1, boolean var2);

    public abstract n h(boolean var1, boolean var2);

    public abstract int i();

    private static final class b
    extends n {
        final int d;

        b(int n8) {
            this.d = n8;
        }

        @Override
        public n d(int n8, int n9) {
            return this;
        }

        @Override
        public n e(long l8, long l9) {
            return this;
        }

        @Override
        public <T> n f(T t8, T t9, Comparator<T> comparator) {
            return this;
        }

        @Override
        public n g(boolean bl, boolean bl2) {
            return this;
        }

        @Override
        public n h(boolean bl, boolean bl2) {
            return this;
        }

        @Override
        public int i() {
            return this.d;
        }
    }
}

