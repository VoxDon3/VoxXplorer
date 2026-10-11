/*
 * Decompiled with CFR 0.152.
 */
package ax.r4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import ax.Gb.l;
import ax.p4.q;
import ax.p4.z;
import ax.r4.b;
import ax.r4.e;
import com.dropbox.core.android.AuthActivity;
import java.util.Collection;

public final class d {
    public static final d a = new d();

    private d() {
    }

    public final Intent a() {
        Intent intent = new Intent("com.dropbox.android.AUTHENTICATE_V2");
        intent.setPackage("com.dropbox.android");
        return intent;
    }

    public final Intent b(b.b object, String object2, AuthActivity object3) {
        l.f(object, "mState");
        l.f(object2, "stateNonce");
        l.f(object3, "authActivity");
        Object object4 = ((Object)object3).getClass().getName();
        Object object5 = object3.getPackageName();
        Intent intent = this.a();
        intent.putExtra("CONSUMER_KEY", ((b.b)object).c());
        intent.putExtra("CONSUMER_SIG", "");
        intent.putExtra("CALLING_CLASS", object4);
        intent.putExtra("DESIRED_UID", ((b.b)object).e());
        intent.putExtra("ALREADY_AUTHED_UIDS", ((Collection)((b.b)object).a()).toArray(new String[0]));
        intent.putExtra("SESSION_ID", ((b.b)object).k());
        intent.putExtra("CALLING_PACKAGE", object5);
        intent.putExtra("AUTH_STATE", (String)object2);
        intent.putExtra("DROPBOX_SDK_JAVA_VERSION", "7.0.0");
        object2 = a.c((Context)object3);
        if (object2 != null) {
            intent.putExtra("TARGET_SDK_VERSION", ((Number)object2).intValue());
        }
        if (((b.b)object).l() != null) {
            object2 = e.a;
            object4 = ((b.b)object).l();
            object3 = ((b.b)object).j();
            object5 = ((b.b)object).g();
            object = ((b.b)object).h().c();
            l.e(object, "getCodeChallenge(...)");
            intent.putExtra("AUTH_QUERY_PARAMS", ((e)object2).a((z)((Object)object4), (String)object3, (q)((Object)object5), (String)object));
        }
        return intent;
    }

    public final Integer c(Context object) {
        int n8;
        block4: {
            PackageManager packageManager;
            l.f(object, "<this>");
            try {
                packageManager = object.getPackageManager();
                object = object.getPackageName();
                n8 = 0;
            }
            catch (Exception exception) {
                return null;
            }
            object = packageManager.getPackageInfo((String)object, 0);
            l.e(object, "getPackageInfo(...)");
            object = object.applicationInfo;
            if (object == null) break block4;
            n8 = object.targetSdkVersion;
        }
        return n8;
    }
}

