/*
 * Decompiled with CFR 0.152.
 */
package ax.Hd;

import ax.Hd.b;
import java.security.AlgorithmParameters;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;

public class a
implements b {
    @Override
    public MessageDigest a(String string) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(string);
    }

    @Override
    public AlgorithmParameters b(String string) throws NoSuchAlgorithmException {
        return AlgorithmParameters.getInstance(string);
    }

    @Override
    public Signature c(String string) throws NoSuchAlgorithmException {
        return Signature.getInstance(string);
    }
}

