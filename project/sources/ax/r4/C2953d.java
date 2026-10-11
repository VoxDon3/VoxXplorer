package ax.r4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import ax.Gb.l;
import ax.p4.q;
import ax.p4.z;
import ax.r4.C2951b;
import com.dropbox.core.android.AuthActivity;
import okhttp3.HttpUrl;

/* renamed from: ax.r4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2953d {
    public static final C2953d a = new C2953d();

    private C2953d() {
    }

    public final Intent a() {
        Intent intent = new Intent("com.dropbox.android.AUTHENTICATE_V2");
        intent.setPackage("com.dropbox.android");
        return intent;
    }

    public final Intent b(C2951b.C0436b c0436b, String str, AuthActivity authActivity) {
        l.f(c0436b, "mState");
        l.f(str, "stateNonce");
        l.f(authActivity, "authActivity");
        String name = authActivity.getClass().getName();
        String packageName = authActivity.getPackageName();
        Intent a2 = a();
        a2.putExtra("CONSUMER_KEY", c0436b.c());
        a2.putExtra("CONSUMER_SIG", HttpUrl.FRAGMENT_ENCODE_SET);
        a2.putExtra("CALLING_CLASS", name);
        a2.putExtra("DESIRED_UID", c0436b.e());
        a2.putExtra("ALREADY_AUTHED_UIDS", (String[]) c0436b.a().toArray(new String[0]));
        a2.putExtra("SESSION_ID", c0436b.k());
        a2.putExtra("CALLING_PACKAGE", packageName);
        a2.putExtra("AUTH_STATE", str);
        a2.putExtra("DROPBOX_SDK_JAVA_VERSION", "7.0.0");
        Integer c = a.c(authActivity);
        if (c != null) {
            a2.putExtra("TARGET_SDK_VERSION", c.intValue());
        }
        if (c0436b.l() != null) {
            C2954e c2954e = C2954e.a;
            z l = c0436b.l();
            String j = c0436b.j();
            q g = c0436b.g();
            String c2 = c0436b.h().c();
            l.e(c2, "getCodeChallenge(...)");
            a2.putExtra("AUTH_QUERY_PARAMS", c2954e.a(l, j, g, c2));
        }
        return a2;
    }

    public final Integer c(Context context) {
        l.f(context, "<this>");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            l.e(packageInfo, "getPackageInfo(...)");
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            return Integer.valueOf(applicationInfo != null ? applicationInfo.targetSdkVersion : 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
