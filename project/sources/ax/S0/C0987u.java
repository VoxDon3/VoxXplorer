package ax.S0;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* renamed from: ax.S0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0987u {
    private static int b = 0;
    private static boolean c = true;
    private static final Object a = new Object();
    private static a d = a.a;

    /* renamed from: ax.S0.u$a */
    public interface a {
        public static final a a = new C0187a();

        /* renamed from: ax.S0.u$a$a, reason: collision with other inner class name */
        class C0187a implements a {
            C0187a() {
            }

            @Override // ax.S0.C0987u.a
            public void a(String str, String str2, Throwable th) {
                Log.e(str, C0987u.a(str2, th));
            }

            @Override // ax.S0.C0987u.a
            public void b(String str, String str2, Throwable th) {
                Log.w(str, C0987u.a(str2, th));
            }

            @Override // ax.S0.C0987u.a
            public void c(String str, String str2, Throwable th) {
                Log.d(str, C0987u.a(str2, th));
            }

            @Override // ax.S0.C0987u.a
            public void d(String str, String str2, Throwable th) {
                Log.i(str, C0987u.a(str2, th));
            }
        }

        void a(String str, String str2, Throwable th);

        void b(String str, String str2, Throwable th);

        void c(String str, String str2, Throwable th);

        void d(String str, String str2, Throwable th);
    }

    public static String a(String str, Throwable th) {
        String e = e(th);
        if (TextUtils.isEmpty(e)) {
            return str;
        }
        return str + "\n  " + e.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (a) {
            try {
                if (b == 0) {
                    d.c(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (a) {
            try {
                if (b <= 3) {
                    d.a(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void d(String str, String str2, Throwable th) {
        synchronized (a) {
            try {
                if (b <= 3) {
                    d.a(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String e(Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (a) {
            try {
                if (g(th)) {
                    return "UnknownHostException (no network)";
                }
                if (c) {
                    return Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
                return th.getMessage();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void f(String str, String str2) {
        synchronized (a) {
            try {
                if (b <= 1) {
                    d.d(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean g(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void h(String str, String str2) {
        synchronized (a) {
            try {
                if (b <= 2) {
                    d.b(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(String str, String str2, Throwable th) {
        synchronized (a) {
            try {
                if (b <= 2) {
                    d.b(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
