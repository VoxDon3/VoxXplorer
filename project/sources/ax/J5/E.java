package ax.J5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import ax.M5.C0821p;
import ax.M5.X;
import ax.M5.Y;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
final class E {
    private static volatile Y e;
    private static Context g;
    static final C a = new w(A.B("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final C b = new x(A.B("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final C c = new y(A.B("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final C d = new z(A.B("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final Object f = new Object();

    static O a(String str, A a2, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, a2, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    static O b(String str, boolean z, boolean z2, boolean z3) {
        return g(str, z, false, false, true);
    }

    static /* synthetic */ String c(boolean z, String str, A a2) throws Exception {
        String str2 = (z || !f(str, a2, true, false).a) ? "not allowed" : "debug cert rejected";
        MessageDigest b2 = ax.R5.a.b("SHA-256");
        C0821p.l(b2);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, ax.R5.j.a(b2.digest(a2.a2())), Boolean.valueOf(z), "12451000.false");
    }

    static synchronized void d(Context context) {
        synchronized (E.class) {
            if (g != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                g = context.getApplicationContext();
            }
        }
    }

    static boolean e() {
        boolean z;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                z = e.d();
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.a e2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
            z = false;
        }
        return z;
    }

    private static O f(final String str, final A a2, final boolean z, boolean z2) {
        try {
            h();
            C0821p.l(g);
            try {
                return e.Y1(new J(str, a2, z, z2), ax.T5.b.a2(g.getPackageManager())) ? O.b() : new M(new Callable() { // from class: ax.J5.v
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return E.c(z, str, a2);
                    }
                }, null);
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return O.d("module call", e2);
            }
        } catch (DynamiteModule.a e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return O.d("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [android.os.IBinder, ax.T5.a] */
    private static O g(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        O d2;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            C0821p.l(g);
            try {
                h();
                F f2 = new F(str, z, false, ax.T5.b.a2(g), false, true);
                try {
                    H X = z4 ? e.X(f2) : e.C(f2);
                    if (X.y()) {
                        d2 = O.f(X.z());
                    } else {
                        String k = X.k();
                        PackageManager.NameNotFoundException nameNotFoundException = X.B() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (k == null) {
                            k = "error checking package certificate";
                        }
                        d2 = O.g(X.z(), X.B(), k, nameNotFoundException);
                    }
                } catch (RemoteException e2) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                    d2 = O.d("module call", e2);
                }
            } catch (DynamiteModule.a e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                d2 = O.d("module init: ".concat(String.valueOf(e3.getMessage())), e3);
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return d2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    private static void h() throws DynamiteModule.a {
        if (e != null) {
            return;
        }
        C0821p.l(g);
        synchronized (f) {
            try {
                if (e == null) {
                    e = X.w(DynamiteModule.e(g, DynamiteModule.f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
