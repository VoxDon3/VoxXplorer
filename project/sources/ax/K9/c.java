package ax.K9;

import android.net.Uri;
import ax.U9.q;

/* loaded from: classes3.dex */
class c implements q {
    private static c a = new c();

    c() {
    }

    static c e() {
        return a;
    }

    @Override // ax.U9.q
    public Uri a() {
        return Uri.parse("https://login.microsoftonline.com/common/oauth2/v2.0/logout");
    }

    @Override // ax.U9.q
    public Uri b() {
        return Uri.parse("urn:ietf:wg:oauth:2.0:oob");
    }

    @Override // ax.U9.q
    public Uri c() {
        return Uri.parse("https://login.microsoftonline.com/common/oauth2/v2.0/token");
    }

    @Override // ax.U9.q
    public Uri d() {
        return Uri.parse("https://login.microsoftonline.com/common/oauth2/v2.0/authorize");
    }
}
