/*
 * Decompiled with CFR 0.152.
 */
package ax.a0;

import ax.a0.t;
import ax.a0.v;
import java.util.Locale;

public final class u {
    public static final t a = new e(null, false);
    public static final t b = new e(null, true);
    public static final t c;
    public static final t d;
    public static final t e;
    public static final t f;

    static {
        b b8 = ax.a0.u$b.a;
        c = new e(b8, false);
        d = new e(b8, true);
        e = new e(ax.a0.u$a.b, false);
        f = ax.a0.u$f.b;
    }

    static int a(int n8) {
        if (n8 != 0) {
            if (n8 != 1 && n8 != 2) {
                return 2;
            }
            return 0;
        }
        return 1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static int b(int n8) {
        if (n8 == 0) return 1;
        if (n8 == 1 || n8 == 2) return 0;
        switch (n8) {
            default: {
                return 2;
            }
            case 16: 
            case 17: {
                return 0;
            }
            case 14: 
            case 15: 
        }
        return 1;
    }

    private static class a
    implements c {
        static final a b = new a(true);
        private final boolean a;

        private a(boolean bl) {
            this.a = bl;
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public int a(CharSequence charSequence, int n8, int n9) {
            boolean bl = false;
            for (int i8 = n8; i8 < n9 + n8; ++i8) {
                int n10 = u.a(Character.getDirectionality(charSequence.charAt(i8)));
                if (n10 != 0) {
                    if (n10 != 1) continue;
                    if (!this.a) {
                        return 1;
                    }
                } else if (this.a) {
                    return 0;
                }
                bl = true;
            }
            if (bl) {
                return this.a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b
    implements c {
        static final b a = new b();

        private b() {
        }

        @Override
        public int a(CharSequence charSequence, int n8, int n9) {
            int n10 = 2;
            for (int i8 = n8; i8 < n9 + n8 && n10 == 2; ++i8) {
                n10 = u.b(Character.getDirectionality(charSequence.charAt(i8)));
            }
            return n10;
        }
    }

    private static interface c {
        public int a(CharSequence var1, int var2, int var3);
    }

    private static abstract class d
    implements t {
        private final c a;

        d(c c8) {
            this.a = c8;
        }

        private boolean c(CharSequence charSequence, int n8, int n9) {
            if ((n8 = this.a.a(charSequence, n8, n9)) != 0) {
                if (n8 != 1) {
                    return this.b();
                }
                return false;
            }
            return true;
        }

        @Override
        public boolean a(CharSequence charSequence, int n8, int n9) {
            if (charSequence != null && n8 >= 0 && n9 >= 0 && charSequence.length() - n9 >= n8) {
                if (this.a == null) {
                    return this.b();
                }
                return this.c(charSequence, n8, n9);
            }
            throw new IllegalArgumentException();
        }

        protected abstract boolean b();
    }

    private static class e
    extends d {
        private final boolean b;

        e(c c8, boolean bl) {
            super(c8);
            this.b = bl;
        }

        @Override
        protected boolean b() {
            return this.b;
        }
    }

    private static class f
    extends d {
        static final f b = new f();

        f() {
            super(null);
        }

        @Override
        protected boolean b() {
            return v.a(Locale.getDefault()) == 1;
        }
    }
}

