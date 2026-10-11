package ax.J7;

import android.content.Context;
import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
class E {
    private String a;

    E() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? HttpUrl.FRAGMENT_ENCODE_SET : installerPackageName;
    }

    synchronized String a(Context context) {
        try {
            if (this.a == null) {
                this.a = b(context);
            }
        } finally {
        }
        return HttpUrl.FRAGMENT_ENCODE_SET.equals(this.a) ? null : this.a;
    }
}
