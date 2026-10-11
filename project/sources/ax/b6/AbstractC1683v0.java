package ax.b6;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: ax.b6.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1683v0 {
    private static AbstractC1683v0 a = new C1675u0();

    public static synchronized AbstractC1683v0 a() {
        AbstractC1683v0 abstractC1683v0;
        synchronized (AbstractC1683v0.class) {
            abstractC1683v0 = a;
        }
        return abstractC1683v0;
    }

    public abstract URLConnection b(URL url, String str) throws IOException;
}
