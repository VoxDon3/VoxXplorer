/*
 * Decompiled with CFR 0.152.
 */
package ax.J5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import ax.J5.A;
import ax.J5.B;
import ax.J5.D;
import ax.J5.E;
import ax.J5.O;
import ax.J5.m;
import ax.M5.p;
import com.google.errorprone.annotations.RestrictedInheritance;

@RestrictedInheritance(allowedOnPath=".*java.*/com/google/android/gms/common/testing/.*", explanation="Sub classing of GMS Core's APIs are restricted to testing fakes.", link="go/gmscore-restrictedinheritance")
public class n {
    private static n c;
    private final Context a;
    private volatile String b;

    public n(Context context) {
        this.a = context.getApplicationContext();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static n a(Context context) {
        p.l(context);
        synchronized (n.class) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        n n8;
                        if (c != null) break block3;
                        E.d(context);
                        c = n8 = new n(context);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return c;
            }
            throw throwable2;
        }
    }

    static final A d(PackageInfo object, A ... aArray) {
        Signature[] signatureArray = object.signatures;
        if (signatureArray != null) {
            if (signatureArray.length != 1) {
                Log.w((String)"GoogleSignatureVerifier", (String)"Package has more than one signature.");
                return null;
            }
            object = object.signatures;
            object = new B(object[0].toByteArray());
            for (int i8 = 0; i8 < aArray.length; ++i8) {
                if (!aArray[i8].equals(object)) continue;
                return aArray[i8];
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static final boolean e(PackageInfo object, boolean bl) {
        Object object2;
        Object var1_4;
        block10: {
            block8: {
                boolean bl2;
                block7: {
                    block9: {
                        bl2 = var1_4;
                        if (var1_4 == false) break block7;
                        if (object == null) break block8;
                        if ("com.android.vending".equals(object.packageName)) break block9;
                        bl2 = var1_4;
                        if (!"com.google.android.gms".equals(object.packageName)) break block7;
                    }
                    bl2 = (object2 = object.applicationInfo) != null && (object2.flags & 0x81) != 0;
                }
                object2 = object;
                var1_4 = bl2;
                break block10;
            }
            object2 = null;
        }
        if (object != null && object2.signatures != null) {
            Object var0_3;
            if (var1_4 != false) {
                A a8 = n.d(object2, D.a);
            } else {
                A a9 = n.d(object2, new A[]{D.a[0]});
            }
            if (var0_3 != null) {
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @SuppressLint(value={"PackageManagerGetSignatures"})
    private final O f(String string, boolean bl, boolean bl2) {
        Object object;
        if (string == null) {
            return O.c("null pkg");
        }
        if (string.equals(this.b)) {
            return O.b();
        }
        if (E.e()) {
            object = E.b(string, m.f(this.a), false, false);
        } else {
            PackageInfo packageInfo;
            try {
                packageInfo = this.a.getPackageManager().getPackageInfo(string, 64);
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                return O.d("no pkg ".concat(string), nameNotFoundException);
            }
            bl = m.f(this.a);
            if (packageInfo == null) {
                object = O.c("null pkg");
            } else {
                object = packageInfo.signatures;
                if (object != null && ((Signature[])object).length == 1) {
                    B b8 = new B(packageInfo.signatures[0].toByteArray());
                    String string2 = packageInfo.packageName;
                    object = E.a(string2, b8, bl, false);
                    if (object.a && (packageInfo = packageInfo.applicationInfo) != null && (packageInfo.flags & 2) != 0 && E.a((String)string2, (A)b8, (boolean)false, (boolean)true).a) {
                        object = O.c("debuggable release cert app rejected");
                    }
                } else {
                    object = O.c("single cert required");
                }
            }
        }
        if (object.a) {
            this.b = string;
        }
        return object;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (n.e(packageInfo, false)) {
            return true;
        }
        if (n.e(packageInfo, true)) {
            if (m.f(this.a)) {
                return true;
            }
            Log.w((String)"GoogleSignatureVerifier", (String)"Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int n8) {
        O o8;
        block4: {
            int n9;
            String[] stringArray = this.a.getPackageManager().getPackagesForUid(n8);
            if (stringArray != null && (n9 = stringArray.length) != 0) {
                o8 = null;
                for (n8 = 0; n8 < n9; ++n8) {
                    o8 = this.f(stringArray[n8], false, false);
                    if (!o8.a) {
                        continue;
                    }
                    break block4;
                }
                p.l(o8);
            } else {
                o8 = O.c("no pkgs");
            }
        }
        o8.e();
        return o8.a;
    }
}

