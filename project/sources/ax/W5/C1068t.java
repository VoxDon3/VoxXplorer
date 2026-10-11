package ax.W5;

import android.net.Uri;
import okhttp3.HttpUrl;

/* renamed from: ax.W5.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1068t {
    private final ax.B.k a;

    C1068t(ax.B.k kVar) {
        this.a = kVar;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        ax.B.k kVar;
        if (uri != null) {
            kVar = (ax.B.k) this.a.get(uri.toString());
        } else {
            kVar = null;
        }
        if (kVar == null) {
            return null;
        }
        return (String) kVar.get(HttpUrl.FRAGMENT_ENCODE_SET.concat(str3));
    }
}
