package ax.Hd;

import java.security.AlgorithmParameters;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;

/* loaded from: classes3.dex */
public class a implements b {
    @Override // ax.Hd.b
    public MessageDigest a(String str) throws NoSuchAlgorithmException {
        return MessageDigest.getInstance(str);
    }

    @Override // ax.Hd.b
    public AlgorithmParameters b(String str) throws NoSuchAlgorithmException {
        return AlgorithmParameters.getInstance(str);
    }

    @Override // ax.Hd.b
    public Signature c(String str) throws NoSuchAlgorithmException {
        return Signature.getInstance(str);
    }
}
