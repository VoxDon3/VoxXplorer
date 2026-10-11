package ax.Na;

import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class f extends h {
    public f(String str) {
        this(HttpUrl.parse(str));
    }

    @Override // ax.Na.h
    public String c() {
        return "PROPFIND";
    }

    public f i(String str) {
        e("Depth", str);
        return this;
    }

    public f(HttpUrl httpUrl) {
        i("1");
        h(httpUrl);
    }
}
