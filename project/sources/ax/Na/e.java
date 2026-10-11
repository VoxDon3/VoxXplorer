package ax.Na;

import okhttp3.HttpUrl;

/* loaded from: classes3.dex */
public class e extends h {
    public e(HttpUrl httpUrl, HttpUrl httpUrl2, boolean z) {
        e("Destination", httpUrl2.uri().toASCIIString());
        e("Overwrite", z ? "T" : "F");
        h(httpUrl);
    }

    @Override // ax.Na.h
    public String c() {
        return "MOVE";
    }

    public e(String str, String str2, boolean z) {
        this(HttpUrl.parse(str), HttpUrl.parse(str2), z);
    }
}
