/*
 * Decompiled with CFR 0.152.
 */
package ax.Na;

import ax.Na.h;
import okhttp3.HttpUrl;

public class a
extends h {
    public a(String string, String string2, boolean bl) {
        this(HttpUrl.parse(string), HttpUrl.parse(string2), bl);
    }

    public a(HttpUrl httpUrl, HttpUrl object, boolean bl) {
        this.e("Destination", ((HttpUrl)object).uri().toASCIIString());
        object = bl ? "T" : "F";
        this.e("Overwrite", (String)object);
        this.h(httpUrl);
    }

    @Override
    public String c() {
        return "COPY";
    }
}

