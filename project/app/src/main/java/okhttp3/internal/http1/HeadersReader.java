/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.http1;

import ax.Gb.g;
import ax.Gb.l;
import okhttp3.Headers;

public final class HeadersReader {
    public static final Companion Companion = new Companion(null);
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;
    private final ax.xc.g source;

    public HeadersReader(ax.xc.g g8) {
        l.f(g8, "source");
        this.source = g8;
        this.headerLimit = 262144L;
    }

    public final ax.xc.g getSource() {
        return this.source;
    }

    public final Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        String string;
        while ((string = this.readLine()).length() != 0) {
            builder.addLenient$okhttp(string);
        }
        return builder.build();
    }

    public final String readLine() {
        String string = this.source.U(this.headerLimit);
        this.headerLimit -= (long)string.length();
        return string;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }
    }
}

