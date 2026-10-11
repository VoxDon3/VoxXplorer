/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.g;
import ax.Gb.l;
import java.io.IOException;

public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final Companion Companion;
    private final String protocol;

    static {
        Companion = new Companion(null);
    }

    private Protocol(String string2) {
        this.protocol = string2;
    }

    public static final Protocol get(String string) throws IOException {
        return Companion.get(string);
    }

    public String toString() {
        return this.protocol;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g g8) {
            this();
        }

        public final Protocol get(String string) throws IOException {
            l.f(string, "protocol");
            Object object = HTTP_1_0;
            if (l.a(string, ((Protocol)object).protocol)) {
                return object;
            }
            object = HTTP_1_1;
            if (l.a(string, ((Protocol)object).protocol)) {
                return object;
            }
            object = H2_PRIOR_KNOWLEDGE;
            if (l.a(string, ((Protocol)object).protocol)) {
                return object;
            }
            object = HTTP_2;
            if (l.a(string, ((Protocol)object).protocol)) {
                return object;
            }
            object = SPDY_3;
            if (l.a(string, ((Protocol)object).protocol)) {
                return object;
            }
            object = QUIC;
            if (l.a(string, ((Protocol)object).protocol)) {
                return object;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Unexpected protocol: ");
            ((StringBuilder)object).append(string);
            throw new IOException(((StringBuilder)object).toString());
        }
    }
}

