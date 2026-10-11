package okhttp3;

import ax.Gb.g;
import ax.Gb.l;
import java.io.IOException;

/* loaded from: classes3.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final Companion Companion = new Companion(null);
    private final String protocol;

    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Protocol get(String str) throws IOException {
            l.f(str, "protocol");
            Protocol protocol = Protocol.HTTP_1_0;
            if (l.a(str, protocol.protocol)) {
                return protocol;
            }
            Protocol protocol2 = Protocol.HTTP_1_1;
            if (l.a(str, protocol2.protocol)) {
                return protocol2;
            }
            Protocol protocol3 = Protocol.H2_PRIOR_KNOWLEDGE;
            if (l.a(str, protocol3.protocol)) {
                return protocol3;
            }
            Protocol protocol4 = Protocol.HTTP_2;
            if (l.a(str, protocol4.protocol)) {
                return protocol4;
            }
            Protocol protocol5 = Protocol.SPDY_3;
            if (l.a(str, protocol5.protocol)) {
                return protocol5;
            }
            Protocol protocol6 = Protocol.QUIC;
            if (l.a(str, protocol6.protocol)) {
                return protocol6;
            }
            throw new IOException("Unexpected protocol: " + str);
        }

        private Companion() {
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    public static final Protocol get(String str) throws IOException {
        return Companion.get(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
