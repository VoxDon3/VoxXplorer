package ax.Vc;

import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

/* loaded from: classes3.dex */
public class d {
    public static SSLContext a(String str, KeyManager keyManager, TrustManager trustManager) throws IOException {
        return b(str, keyManager == null ? null : new KeyManager[]{keyManager}, trustManager != null ? new TrustManager[]{trustManager} : null);
    }

    public static SSLContext b(String str, KeyManager[] keyManagerArr, TrustManager[] trustManagerArr) throws IOException {
        try {
            SSLContext sSLContext = SSLContext.getInstance(str);
            sSLContext.init(keyManagerArr, trustManagerArr, null);
            return sSLContext;
        } catch (GeneralSecurityException e) {
            IOException iOException = new IOException("Could not initialize SSL context");
            iOException.initCause(e);
            throw iOException;
        }
    }
}
