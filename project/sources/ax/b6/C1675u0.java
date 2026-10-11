package ax.b6;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: ax.b6.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1675u0 extends AbstractC1683v0 {
    @Override // ax.b6.AbstractC1683v0
    public final URLConnection b(URL url, String str) throws IOException {
        return url.openConnection();
    }

    private C1675u0() {
    }
}
