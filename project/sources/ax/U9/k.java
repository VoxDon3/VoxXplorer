package ax.U9;

import android.net.Uri;

/* loaded from: classes3.dex */
public class k implements q {
    private static k e;
    private Uri a = Uri.parse("https://login.live.com/oauth20_authorize.srf");
    private Uri b = Uri.parse("https://login.live.com/oauth20_desktop.srf");
    private Uri c = Uri.parse("https://login.live.com/oauth20_logout.srf");
    private Uri d = Uri.parse("https://login.live.com/oauth20_token.srf");

    public static k e() {
        if (e == null) {
            e = new k();
        }
        return e;
    }

    @Override // ax.U9.q
    public Uri a() {
        return this.c;
    }

    @Override // ax.U9.q
    public Uri b() {
        return this.b;
    }

    @Override // ax.U9.q
    public Uri c() {
        return this.d;
    }

    @Override // ax.U9.q
    public Uri d() {
        return this.a;
    }
}
