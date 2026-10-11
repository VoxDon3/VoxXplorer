package ax.Na;

import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class c extends h {
    public c(String str) {
        h(HttpUrl.parse(str));
    }

    @Override // ax.Na.h
    public String c() {
        return "GET";
    }
}
