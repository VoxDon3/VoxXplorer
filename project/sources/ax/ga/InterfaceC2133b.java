package ax.ga;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import okhttp3.HttpUrl;

/* renamed from: ax.ga.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2133b {

    /* renamed from: ax.ga.b$a */
    public enum a {
        HTTP("http"),
        HTTPS("https"),
        FILE("file"),
        CONTENT("content"),
        ASSETS("assets"),
        DRAWABLE("drawable"),
        UNKNOWN(HttpUrl.FRAGMENT_ENCODE_SET);

        private String c0;
        private String q;

        a(String str) {
            this.q = str;
            this.c0 = str + "://";
        }

        private boolean h(String str) {
            return str.toLowerCase(Locale.US).startsWith(this.c0);
        }

        public static a l(String str) {
            if (str != null) {
                for (a aVar : values()) {
                    if (aVar.h(str)) {
                        return aVar;
                    }
                }
            }
            return UNKNOWN;
        }

        public String j(String str) {
            if (h(str)) {
                return str.substring(this.c0.length());
            }
            throw new IllegalArgumentException(String.format("URI [%1$s] doesn't have expected scheme [%2$s]", str, this.q));
        }

        public String n(String str) {
            return this.c0 + str;
        }
    }

    InputStream a(String str, Object obj) throws IOException;
}
