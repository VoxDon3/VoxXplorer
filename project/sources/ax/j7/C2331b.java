package ax.j7;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

/* renamed from: ax.j7.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2331b implements InterfaceC2330a {
    private final Proxy a;

    public C2331b() {
        this(null);
    }

    @Override // ax.j7.InterfaceC2330a
    public HttpURLConnection a(URL url) throws IOException {
        Proxy proxy = this.a;
        return (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
    }

    public C2331b(Proxy proxy) {
        this.a = proxy;
    }
}
