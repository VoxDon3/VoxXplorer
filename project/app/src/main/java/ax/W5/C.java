/*
 * Decompiled with CFR 0.152.
 */
package ax.W5;

import android.net.Uri;
import ax.B.a;
import ax.B.k;

public final class C {
    private static final a a = new a();

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Uri a(String object) {
        synchronized (C.class) {
            Throwable throwable2;
            block5: {
                Uri uri;
                block4: {
                    try {
                        object = a;
                        uri = (Uri)((a)object).get("com.google.android.gms.auth_account");
                        if (uri != null) break block4;
                        uri = Uri.parse((String)"content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode((String)"com.google.android.gms.auth_account"))));
                        ((k)object).put("com.google.android.gms.auth_account", uri);
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    return uri;
                }
                return uri;
            }
            throw throwable2;
        }
    }
}

