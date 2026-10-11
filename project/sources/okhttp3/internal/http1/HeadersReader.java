package okhttp3.internal.http1;

import ax.Gb.l;
import ax.xc.g;
import okhttp3.Headers;

/* loaded from: classes3.dex */
public final class HeadersReader {
    public static final Companion Companion = new Companion(null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;
    private final g source;

    public static final class Companion {
        public /* synthetic */ Companion(ax.Gb.g gVar) {
            this();
        }

        private Companion() {
        }
    }

    public HeadersReader(g gVar) {
        l.f(gVar, "source");
        this.source = gVar;
        this.headerLimit = 262144L;
    }

    public final g getSource() {
        return this.source;
    }

    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readLine = readLine();
            if (readLine.length() == 0) {
                return builder.build();
            }
            builder.addLenient$okhttp(readLine);
        }
    }

    public final String readLine() {
        String U = this.source.U(this.headerLimit);
        this.headerLimit -= U.length();
        return U;
    }
}
