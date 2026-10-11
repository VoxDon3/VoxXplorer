package ax.p4;

import java.io.IOException;
import java.security.cert.CertPathValidatorException;
import javax.net.ssl.SSLHandshakeException;

/* loaded from: classes.dex */
public class t extends C2773j {
    public t(IOException iOException) {
        super(a(iOException), iOException);
    }

    private static String a(IOException iOException) {
        String message = iOException.getMessage();
        if (iOException instanceof SSLHandshakeException) {
            Throwable cause = iOException.getCause();
            if (cause instanceof CertPathValidatorException) {
                return message + "[CERT PATH: " + ((CertPathValidatorException) cause).getCertPath() + "]";
            }
        }
        return message;
    }

    @Override // java.lang.Throwable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public IOException getCause() {
        return (IOException) super.getCause();
    }
}
