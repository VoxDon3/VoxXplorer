package ax.Hd;

import java.security.AlgorithmParameters;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;

/* loaded from: classes3.dex */
public interface b {
    MessageDigest a(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

    AlgorithmParameters b(String str) throws NoSuchAlgorithmException, NoSuchProviderException;

    Signature c(String str) throws NoSuchAlgorithmException, NoSuchProviderException;
}
