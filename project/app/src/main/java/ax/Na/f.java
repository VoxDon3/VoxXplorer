/*
 * Decompiled with CFR 0.152.
 */
package ax.Na;

import ax.Na.h;
import okhttp3.HttpUrl;

public class f
extends h {
    public f(String string) {
        this(HttpUrl.parse(string));
    }

    public f(HttpUrl httpUrl) {
        this.i("1");
        this.h(httpUrl);
    }

    @Override
    public String c() {
        return "PROPFIND";
    }

    public f i(String string) {
        this.e("Depth", string);
        return this;
    }
}

