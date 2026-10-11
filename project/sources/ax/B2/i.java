package ax.B2;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class i {
    private static final Object a = new Object();
    private static volatile i b = null;
    private static final int c = 20;

    public static class a extends i {
        private final int d;

        public a(int i) {
            super(i);
            this.d = i;
        }

        @Override // ax.B2.i
        public void a(String str, String str2) {
            if (this.d <= 3) {
                Log.d(str, str2);
            }
        }

        @Override // ax.B2.i
        public void b(String str, String str2, Throwable th) {
            if (this.d <= 3) {
                Log.d(str, str2, th);
            }
        }

        @Override // ax.B2.i
        public void c(String str, String str2) {
            if (this.d <= 6) {
                Log.e(str, str2);
            }
        }

        @Override // ax.B2.i
        public void d(String str, String str2, Throwable th) {
            if (this.d <= 6) {
                Log.e(str, str2, th);
            }
        }

        @Override // ax.B2.i
        public void f(String str, String str2) {
            if (this.d <= 4) {
                Log.i(str, str2);
            }
        }

        @Override // ax.B2.i
        public void g(String str, String str2, Throwable th) {
            if (this.d <= 4) {
                Log.i(str, str2, th);
            }
        }

        @Override // ax.B2.i
        public void j(String str, String str2) {
            if (this.d <= 2) {
                Log.v(str, str2);
            }
        }

        @Override // ax.B2.i
        public void k(String str, String str2) {
            if (this.d <= 5) {
                Log.w(str, str2);
            }
        }

        @Override // ax.B2.i
        public void l(String str, String str2, Throwable th) {
            if (this.d <= 5) {
                Log.w(str, str2, th);
            }
        }
    }

    public i(int i) {
    }

    public static i e() {
        i iVar;
        synchronized (a) {
            try {
                if (b == null) {
                    b = new a(3);
                }
                iVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    public static void h(i iVar) {
        synchronized (a) {
            b = iVar;
        }
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = c;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th);
}
