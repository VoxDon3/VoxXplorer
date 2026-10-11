/*
 * Decompiled with CFR 0.152.
 */
package ax.p4;

import ax.p4.h;
import ax.p4.j;
import ax.p4.k;
import ax.p4.m;
import ax.p4.n;
import ax.s4.a;
import ax.w4.d;
import ax.w4.f;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;

public class l {
    private static final SecureRandom c = new SecureRandom();
    private String a;
    private String b;

    public l() {
        String string;
        this.a = string = this.b();
        this.b = l.a(string);
    }

    static String a(String string) {
        NoSuchAlgorithmException noSuchAlgorithmException2;
        block3: {
            try {
                string = f.h(MessageDigest.getInstance("SHA-256").digest(string.getBytes("US-ASCII"))).replaceAll("=+$", "");
                return string;
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException2) {
                break block3;
            }
            throw d.a("Impossible", unsupportedEncodingException);
        }
        throw d.a("Impossible", noSuchAlgorithmException2);
    }

    String b() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i8 = 0; i8 < 128; ++i8) {
            stringBuilder.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789-._~".charAt(c.nextInt(66)));
        }
        return stringBuilder.toString();
    }

    public String c() {
        return this.b;
    }

    public h d(m m8, String string, String string2, String string3, k k8) throws j {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("grant_type", "authorization_code");
        hashMap.put("code", string);
        hashMap.put("locale", m8.d());
        hashMap.put("client_id", string2);
        hashMap.put("code_verifier", this.a);
        if (string3 != null) {
            hashMap.put("redirect_uri", string3);
        }
        return n.j(m8, "OfficialDropboxJavaSDKv2", k8.h(), "oauth2/token", n.z(hashMap), null, new n.c<h>(this){
            final l a;
            {
                this.a = l8;
            }

            public h b(a.b b8) throws j {
                if (b8.d() == 200) {
                    return n.u(h.j, b8);
                }
                throw n.A(b8);
            }
        });
    }
}

