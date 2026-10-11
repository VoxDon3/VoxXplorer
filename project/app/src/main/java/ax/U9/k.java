/*
 * Decompiled with CFR 0.152.
 */
package ax.U9;

import android.net.Uri;
import ax.U9.q;

public class k
implements q {
    private static k e;
    private Uri a = Uri.parse((String)"https://login.live.com/oauth20_authorize.srf");
    private Uri b = Uri.parse((String)"https://login.live.com/oauth20_desktop.srf");
    private Uri c = Uri.parse((String)"https://login.live.com/oauth20_logout.srf");
    private Uri d = Uri.parse((String)"https://login.live.com/oauth20_token.srf");

    public static k e() {
        if (e == null) {
            e = new k();
        }
        return e;
    }

    @Override
    public Uri a() {
        return this.c;
    }

    @Override
    public Uri b() {
        return this.b;
    }

    @Override
    public Uri c() {
        return this.d;
    }

    @Override
    public Uri d() {
        return this.a;
    }
}

