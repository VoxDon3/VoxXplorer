package ax.J5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import ax.M5.C0821p;
import com.google.errorprone.annotations.RestrictedInheritance;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
/* renamed from: ax.J5.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0753n {
    private static C0753n c;
    private final Context a;
    private volatile String b;

    public C0753n(Context context) {
        this.a = context.getApplicationContext();
    }

    public static C0753n a(Context context) {
        C0821p.l(context);
        synchronized (C0753n.class) {
            try {
                if (c == null) {
                    E.d(context);
                    c = new C0753n(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c;
    }

    static final A d(PackageInfo packageInfo, A... aArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            B b = new B(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < aArr.length; i++) {
                if (aArr[i].equals(b)) {
                    return aArr[i];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L27
            if (r4 == 0) goto L29
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L27
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = 0
            goto L27
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = 1
        L27:
            r2 = r4
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r4 == 0) goto L48
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L48
            if (r5 == 0) goto L39
            ax.J5.A[] r4 = ax.J5.D.a
            ax.J5.A r4 = d(r2, r4)
            goto L45
        L39:
            ax.J5.A[] r4 = ax.J5.D.a
            r4 = r4[r1]
            ax.J5.A[] r5 = new ax.J5.A[r0]
            r5[r1] = r4
            ax.J5.A r4 = d(r2, r5)
        L45:
            if (r4 == 0) goto L48
            return r0
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.J5.C0753n.e(android.content.pm.PackageInfo, boolean):boolean");
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final O f(String str, boolean z, boolean z2) {
        O c2;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return O.c("null pkg");
        }
        if (str.equals(this.b)) {
            return O.b();
        }
        if (E.e()) {
            c2 = E.b(str, C0752m.f(this.a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, 64);
                boolean f = C0752m.f(this.a);
                if (packageInfo == null) {
                    c2 = O.c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        c2 = O.c("single cert required");
                    } else {
                        B b = new B(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        O a = E.a(str2, b, f, false);
                        c2 = (!a.a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !E.a(str2, b, false, true).a) ? a : O.c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                return O.d("no pkg ".concat(str), e);
            }
        }
        if (c2.a) {
            this.b = str;
        }
        return c2;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (C0752m.f(this.a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i) {
        O c2;
        int length;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c2 = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    C0821p.l(c2);
                    break;
                }
                c2 = f(packagesForUid[i2], false, false);
                if (c2.a) {
                    break;
                }
                i2++;
            }
        } else {
            c2 = O.c("no pkgs");
        }
        c2.e();
        return c2.a;
    }
}
