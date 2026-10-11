/*
 * Decompiled with CFR 0.152.
 */
package ax.B2;

import android.util.Log;

public abstract class i {
    private static final Object a = new Object();
    private static volatile i b;
    private static final int c = 20;

    public i(int n8) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static i e() {
        Object object = a;
        synchronized (object) {
            try {
                if (b != null) return b;
                i i8 = new a(3);
                b = i8;
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void h(i i8) {
        Object object = a;
        synchronized (object) {
            b = i8;
            return;
        }
    }

    public static String i(String string) {
        int n8 = string.length();
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append("WM-");
        int n9 = c;
        if (n8 >= n9) {
            stringBuilder.append(string.substring(0, n9));
        } else {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public abstract void a(String var1, String var2);

    public abstract void b(String var1, String var2, Throwable var3);

    public abstract void c(String var1, String var2);

    public abstract void d(String var1, String var2, Throwable var3);

    public abstract void f(String var1, String var2);

    public abstract void g(String var1, String var2, Throwable var3);

    public abstract void j(String var1, String var2);

    public abstract void k(String var1, String var2);

    public abstract void l(String var1, String var2, Throwable var3);

    public static class a
    extends i {
        private final int d;

        public a(int n8) {
            super(n8);
            this.d = n8;
        }

        @Override
        public void a(String string, String string2) {
            if (this.d <= 3) {
                Log.d((String)string, (String)string2);
            }
        }

        @Override
        public void b(String string, String string2, Throwable throwable) {
            if (this.d <= 3) {
                Log.d((String)string, (String)string2, (Throwable)throwable);
            }
        }

        @Override
        public void c(String string, String string2) {
            if (this.d <= 6) {
                Log.e((String)string, (String)string2);
            }
        }

        @Override
        public void d(String string, String string2, Throwable throwable) {
            if (this.d <= 6) {
                Log.e((String)string, (String)string2, (Throwable)throwable);
            }
        }

        @Override
        public void f(String string, String string2) {
            if (this.d <= 4) {
                Log.i((String)string, (String)string2);
            }
        }

        @Override
        public void g(String string, String string2, Throwable throwable) {
            if (this.d <= 4) {
                Log.i((String)string, (String)string2, (Throwable)throwable);
            }
        }

        @Override
        public void j(String string, String string2) {
            if (this.d <= 2) {
                Log.v((String)string, (String)string2);
            }
        }

        @Override
        public void k(String string, String string2) {
            if (this.d <= 5) {
                Log.w((String)string, (String)string2);
            }
        }

        @Override
        public void l(String string, String string2, Throwable throwable) {
            if (this.d <= 5) {
                Log.w((String)string, (String)string2, (Throwable)throwable);
            }
        }
    }
}

