/*
 * Decompiled with CFR 0.152.
 */
package ax.Hd;

import java.security.AlgorithmParameters;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;

public interface b {
    public MessageDigest a(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public AlgorithmParameters b(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;

    public Signature c(String var1) throws NoSuchAlgorithmException, NoSuchProviderException;
}

