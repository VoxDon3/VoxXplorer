/*
 * Decompiled with CFR 0.152.
 */
package ax.Na;

import ax.Na.h;
import okhttp3.HttpUrl;

public class d
extends h {
    public d(String string) {
        this(HttpUrl.parse(string));
    }

    public d(HttpUrl httpUrl) {
        this.h(httpUrl);
    }

    @Override
    public String c() {
        return "MKCOL";
    }
}

