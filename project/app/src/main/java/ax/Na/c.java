/*
 * Decompiled with CFR 0.152.
 */
package ax.Na;

import ax.Na.h;
import okhttp3.HttpUrl;

public class c
extends h {
    public c(String string) {
        this.h(HttpUrl.parse(string));
    }

    @Override
    public String c() {
        return "GET";
    }
}

