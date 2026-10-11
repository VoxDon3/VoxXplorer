/*
 * Decompiled with CFR 0.152.
 */
package ax.Vc;

import java.io.IOException;
import java.security.GeneralSecurityException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public class d {
    public static SSLContext a(String string, KeyManager keyManagerArray, TrustManager trustManagerArray) throws IOException {
        TrustManager[] trustManagerArray2 = null;
        if (keyManagerArray == null) {
            keyManagerArray = null;
        } else {
            KeyManager[] keyManagerArray2 = new KeyManager[]{keyManagerArray};
            keyManagerArray = keyManagerArray2;
        }
        if (trustManagerArray == null) {
            trustManagerArray = trustManagerArray2;
        } else {
            trustManagerArray2 = new TrustManager[]{trustManagerArray};
            trustManagerArray = trustManagerArray2;
        }
        return d.b(string, keyManagerArray, trustManagerArray);
    }

    public static SSLContext b(String object, KeyManager[] keyManagerArray, TrustManager[] trustManagerArray) throws IOException {
        try {
            object = SSLContext.getInstance((String)object);
            ((SSLContext)object).init(keyManagerArray, trustManagerArray, null);
            return object;
        }
        catch (GeneralSecurityException generalSecurityException) {
            object = new IOException("Could not initialize SSL context");
            ((Throwable)object).initCause(generalSecurityException);
            throw object;
        }
    }
}

