package ax.Na;

import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class d extends h {
    public d(String str) {
        this(HttpUrl.parse(str));
    }

    @Override // ax.Na.h
    public String c() {
        return "MKCOL";
    }

    public d(HttpUrl httpUrl) {
        h(httpUrl);
    }
}
