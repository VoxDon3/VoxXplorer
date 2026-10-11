/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import ax.J5.A;
import ax.J5.C;
import ax.J5.F;
import ax.J5.J;
import ax.J5.M;
import ax.J5.O;
import ax.J5.v;
import ax.J5.w;
import ax.J5.x;
import ax.J5.y;
import ax.J5.z;
import ax.M5.X;
import ax.M5.Y;
import ax.M5.p;
import ax.R5.a;
import ax.R5.j;
import ax.T5.b;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;

final class E {
    static final C a = new w(A.B("0\u0082\u0005\u00c80\u0082\u0003\u00b0\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bs\u00f9/\u008eQ\u00ed"));
    static final C b = new x(A.B("0\u0082\u0006\u00040\u0082\u0003\u00ec\u00a0\u0003\u0002\u0001\u0002\u0002\u0014\u0003\u00a3\u00b2\u00ad\u00d7\u00e1r\u00cak\u00ec"));
    static final C c = new y(A.B("0\u0082\u0004C0\u0082\u0003+\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00c2\u00e0\u0087FdJ0\u008d0"));
    static final C d = new z(A.B("0\u0082\u0004\u00a80\u0082\u0003\u0090\u00a0\u0003\u0002\u0001\u0002\u0002\t\u0000\u00d5\u0085\u00b8l}\u00d3N\u00f50"));
    private static volatile Y e;
    private static final Object f;
    private static Context g;

    static {
        f = new Object();
    }

    static O a(String object, A a8, boolean bl, boolean bl2) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.allowThreadDiskReads();
        try {
            object = E.f((String)object, a8, bl, bl2);
            return object;
        }
        finally {
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        }
    }

    static O b(String string, boolean bl, boolean bl2, boolean bl3) {
        return E.g(string, bl, false, false, true);
    }

    static /* synthetic */ String c(boolean bl, String string, A a8) throws Exception {
        String string2 = !bl && E.f((String)string, (A)a8, (boolean)true, (boolean)false).a ? "debug cert rejected" : "not allowed";
        MessageDigest messageDigest = ax.R5.a.b("SHA-256");
        p.l(messageDigest);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", string2, string, j.a(messageDigest.digest(a8.a2())), bl, "12451000.false");
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void d(Context context) {
        synchronized (E.class) {
            Throwable throwable2;
            block5: {
                block6: {
                    try {
                        if (g != null) break block5;
                        if (context == null) break block6;
                        g = context.getApplicationContext();
                    }
                    catch (Throwable throwable2) {}
                    return;
                }
                return;
            }
            Log.w((String)"GoogleCertificates", (String)"GoogleCertificates has been initialized already");
            return;
            throw throwable2;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static boolean e() {
        Throwable throwable2;
        StrictMode.ThreadPolicy threadPolicy;
        block7: {
            boolean bl;
            block5: {
                Throwable var1_5;
                threadPolicy = StrictMode.allowThreadDiskReads();
                try {
                    try {
                        E.h();
                        bl = e.d();
                        break block5;
                    }
                    catch (RemoteException remoteException) {
                    }
                    catch (DynamiteModule.a a8) {
                        // empty catch block
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                Log.e((String)"GoogleCertificates", (String)"Failed to get Google certificates from remote", (Throwable)var1_5);
                bl = false;
            }
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
            return bl;
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)threadPolicy);
        throw throwable2;
    }

    private static O f(String string, A a8, boolean bl, boolean bl2) {
        block4: {
            try {
                E.h();
            }
            catch (DynamiteModule.a a9) {
                Log.e((String)"GoogleCertificates", (String)"Failed to get Google certificates from remote", (Throwable)a9);
                return O.d("module init: ".concat(String.valueOf(a9.getMessage())), a9);
            }
            p.l(g);
            J j8 = new J(string, a8, bl, bl2);
            try {
                bl2 = e.Y1(j8, ax.T5.b.a2(g.getPackageManager()));
                if (!bl2) break block4;
            }
            catch (RemoteException remoteException) {
                Log.e((String)"GoogleCertificates", (String)"Failed to get Google certificates from remote", (Throwable)remoteException);
                return O.d("module call", remoteException);
            }
            return O.b();
        }
        return new M(new v(bl, string, a8), null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    private static O g(String var0, boolean var1_4, boolean var2_5, boolean var3_6, boolean var4_7) {
        block7: {
            block10: {
                block8: {
                    block9: {
                        block11: {
                            var8_8 = StrictMode.allowThreadDiskReads();
                            p.l(E.g);
                            E.h();
                            var5_9 /* !! */  = new F((String)var0, var1_4, false, (IBinder)ax.T5.b.a2(E.g), false, true);
                            if (!var4_7) ** GOTO lbl16
                            var0 = E.e.X(var5_9 /* !! */ );
                            break block11;
                            catch (Throwable var0_1) {
                                break block7;
                            }
                            catch (RemoteException var0_2) {}
                            break block8;
lbl16:
                            // 1 sources

                            var0 = E.e.C(var5_9 /* !! */ );
                        }
                        if (!var0.y()) break block9;
                        var0 = O.f(var0.z());
                        break block10;
                    }
                    var7_10 = var0.k();
                    var5_9 /* !! */  = var0.B() == 4 ? new PackageManager.NameNotFoundException() : null;
                    var6_11 = var7_10;
                    if (var7_10 == null) {
                        var6_11 = "error checking package certificate";
                    }
                    var0 = O.g(var0.z(), var0.B(), var6_11, (Throwable)var5_9 /* !! */ );
                    break block10;
                }
                Log.e((String)"GoogleCertificates", (String)"Failed to get Google certificates from remote", (Throwable)var0_2);
                var0 = O.d("module call", var0_2);
                break block10;
                catch (DynamiteModule.a var0_3) {
                    Log.e((String)"GoogleCertificates", (String)"Failed to get Google certificates from remote", (Throwable)var0_3);
                    var0 = O.d("module init: ".concat(String.valueOf(var0_3.getMessage())), var0_3);
                }
            }
            StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var8_8);
            return var0;
        }
        StrictMode.setThreadPolicy((StrictMode.ThreadPolicy)var8_8);
        throw var0_1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void h() throws DynamiteModule.a {
        if (e != null) {
            return;
        }
        p.l(g);
        Object object = f;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        if (e != null) break block4;
                        e = X.w(DynamiteModule.e(g, DynamiteModule.f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

