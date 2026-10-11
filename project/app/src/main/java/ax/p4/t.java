/*
 * Decompiled with CFR 0.152.
 */
package ax.p4;

import ax.p4.j;
import java.io.IOException;
import java.security.cert.CertPathValidatorException;
import javax.net.ssl.SSLHandshakeException;

public class t
extends j {
    public t(IOException iOException) {
        super(t.a(iOException), iOException);
    }

    private static String a(IOException serializable) {
        String string = ((Throwable)serializable).getMessage();
        if (serializable instanceof SSLHandshakeException && (serializable = ((Throwable)serializable).getCause()) instanceof CertPathValidatorException) {
            CertPathValidatorException certPathValidatorException = (CertPathValidatorException)serializable;
            serializable = new StringBuilder();
            ((StringBuilder)serializable).append(string);
            ((StringBuilder)serializable).append("[CERT PATH: ");
            ((StringBuilder)serializable).append(certPathValidatorException.getCertPath());
            ((StringBuilder)serializable).append("]");
            return ((StringBuilder)serializable).toString();
        }
        return string;
    }

    public IOException b() {
        return (IOException)super.getCause();
    }
}

