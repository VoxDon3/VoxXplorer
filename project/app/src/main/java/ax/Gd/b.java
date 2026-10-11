/*
 * Decompiled with CFR 0.152.
 */
package ax.Gd;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;

class b
extends OutputStream {
    private Signature q;

    b(Signature signature) {
        this.q = signature;
    }

    @Override
    public void write(int n8) throws IOException {
        try {
            this.q.update((byte)n8);
            return;
        }
        catch (SignatureException signatureException) {
            throw new IOException(signatureException.getMessage());
        }
    }

    @Override
    public void write(byte[] byArray) throws IOException {
        try {
            this.q.update(byArray);
            return;
        }
        catch (SignatureException signatureException) {
            throw new IOException(signatureException.getMessage());
        }
    }

    @Override
    public void write(byte[] byArray, int n8, int n9) throws IOException {
        try {
            this.q.update(byArray, n8, n9);
            return;
        }
        catch (SignatureException signatureException) {
            throw new IOException(signatureException.getMessage());
        }
    }
}

