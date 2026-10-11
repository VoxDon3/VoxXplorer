package ax.Na;

import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class g extends h {
    public g(String str) {
        h(HttpUrl.parse(str));
    }

    @Override // ax.Na.h
    public String c() {
        return "PUT";
    }
}
