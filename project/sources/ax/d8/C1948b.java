package ax.d8;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import ax.x7.C3471f;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ax.d8.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1948b {
    private static final String[] c = {"*", "FCM", "GCM", HttpUrl.FRAGMENT_ENCODE_SET};
    private final SharedPreferences a;
    private final String b;

    public C1948b(C3471f c3471f) {
        this.a = c3471f.k().getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = b(c3471f);
    }

    private String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    private static String b(C3471f c3471f) {
        String d = c3471f.n().d();
        if (d != null) {
            return d;
        }
        String c2 = c3471f.n().c();
        if (!c2.startsWith("1:") && !c2.startsWith("2:")) {
            return c2;
        }
        String[] split = c2.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    private static String c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    private String g() {
        String string;
        synchronized (this.a) {
            string = this.a.getString("|S|id", null);
        }
        return string;
    }

    private String h() {
        synchronized (this.a) {
            try {
                String string = this.a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey e = e(string);
                if (e == null) {
                    return null;
                }
                return c(e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String f() {
        synchronized (this.a) {
            try {
                String g = g();
                if (g != null) {
                    return g;
                }
                return h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String i() {
        synchronized (this.a) {
            try {
                for (String str : c) {
                    String string = this.a.getString(a(this.b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
