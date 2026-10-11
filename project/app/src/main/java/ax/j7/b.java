/*
 * Decompiled with CFR 0.152.
 */
package ax.j7;

import ax.j7.a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

public class b
implements a {
    private final Proxy a;

    public b() {
        this(null);
    }

    public b(Proxy proxy) {
        this.a = proxy;
    }

    @Override
    public HttpURLConnection a(URL object) throws IOException {
        Proxy proxy = this.a;
        object = proxy == null ? ((URL)object).openConnection() : ((URL)object).openConnection(proxy);
        return (HttpURLConnection)object;
    }
}

