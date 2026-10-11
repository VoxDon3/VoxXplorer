package ax.p4;

import ax.p4.n;
import ax.s4.AbstractC3046a;
import ax.w4.C3344d;
import ax.w4.C3346f;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class l {
    private static final SecureRandom c = new SecureRandom();
    private String a;
    private String b;

    class a extends n.c<C2771h> {
        a() {
        }

        @Override // ax.p4.n.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2771h a(AbstractC3046a.b bVar) throws C2773j {
            if (bVar.d() == 200) {
                return (C2771h) n.u(C2771h.j, bVar);
            }
            throw n.A(bVar);
        }
    }

    public l() {
        String b = b();
        this.a = b;
        this.b = a(b);
    }

    static String a(String str) {
        try {
            return C3346f.h(MessageDigest.getInstance("SHA-256").digest(str.getBytes("US-ASCII"))).replaceAll("=+$", HttpUrl.FRAGMENT_ENCODE_SET);
        } catch (UnsupportedEncodingException e) {
            throw C3344d.a("Impossible", e);
        } catch (NoSuchAlgorithmException e2) {
            throw C3344d.a("Impossible", e2);
        }
    }

    String b() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~".charAt(c.nextInt(66)));
        }
        return sb.toString();
    }

    public String c() {
        return this.b;
    }

    public C2771h d(m mVar, String str, String str2, String str3, C2774k c2774k) throws C2773j {
        HashMap hashMap = new HashMap();
        hashMap.put("grant_type", "authorization_code");
        hashMap.put("code", str);
        hashMap.put("locale", mVar.d());
        hashMap.put("client_id", str2);
        hashMap.put("code_verifier", this.a);
        if (str3 != null) {
            hashMap.put("redirect_uri", str3);
        }
        return (C2771h) n.j(mVar, "OfficialDropboxJavaSDKv2", c2774k.h(), "oauth2/token", n.z(hashMap), null, new a());
    }
}
