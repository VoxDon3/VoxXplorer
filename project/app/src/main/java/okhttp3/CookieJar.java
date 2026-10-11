/*
 * Decompiled with CFR 0.152.
 */
package okhttp3;

import ax.Gb.l;
import ax.tb.o;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.HttpUrl;

public interface CookieJar {
    public static final Companion Companion = okhttp3.CookieJar$Companion.$$INSTANCE;
    public static final CookieJar NO_COOKIES = new Companion.NoCookies();

    public List<Cookie> loadForRequest(HttpUrl var1);

    public void saveFromResponse(HttpUrl var1, List<Cookie> var2);

    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        private static final class NoCookies
        implements CookieJar {
            @Override
            public List<Cookie> loadForRequest(HttpUrl httpUrl) {
                l.f(httpUrl, "url");
                return o.j();
            }

            @Override
            public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
                l.f(httpUrl, "url");
                l.f(list, "cookies");
            }
        }
    }
}

