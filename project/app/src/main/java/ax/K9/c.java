/*
 * Decompiled with CFR 0.152.
 */
package ax.K9;

import android.net.Uri;
import ax.U9.q;

class c
implements q {
    private static c a = new c();

    c() {
    }

    static c e() {
        return a;
    }

    @Override
    public Uri a() {
        return Uri.parse((String)"https://login.microsoftonline.com/common/oauth2/v2.0/logout");
    }

    @Override
    public Uri b() {
        return Uri.parse((String)"urn:ietf:wg:oauth:2.0:oob");
    }

    @Override
    public Uri c() {
        return Uri.parse((String)"https://login.microsoftonline.com/common/oauth2/v2.0/token");
    }

    @Override
    public Uri d() {
        return Uri.parse((String)"https://login.microsoftonline.com/common/oauth2/v2.0/authorize");
    }
}

