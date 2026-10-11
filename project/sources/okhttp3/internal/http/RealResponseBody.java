package okhttp3.internal.http;

import ax.Gb.l;
import ax.xc.g;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes3.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final g source;

    public RealResponseBody(String str, long j, g gVar) {
        l.f(gVar, "source");
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = gVar;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    public g source() {
        return this.source;
    }
}
