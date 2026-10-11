/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http;

import ax.Gb.l;
import ax.xc.g;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

public final class RealResponseBody
extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final g source;

    public RealResponseBody(String string, long l8, g g8) {
        l.f(g8, "source");
        this.contentTypeString = string;
        this.contentLength = l8;
        this.source = g8;
    }

    @Override
    public long contentLength() {
        return this.contentLength;
    }

    @Override
    public MediaType contentType() {
        String string = this.contentTypeString;
        if (string != null) {
            return MediaType.Companion.parse(string);
        }
        return null;
    }

    @Override
    public g source() {
        return this.source;
    }
}

