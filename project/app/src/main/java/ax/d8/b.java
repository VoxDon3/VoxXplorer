/*
 * Decompiled with CFR 0.152.
 */
package ax.d8;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import ax.x7.f;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

public class b {
    private static final String[] c = new String[]{"*", "FCM", "GCM", ""};
    private final SharedPreferences a;
    private final String b;

    public b(f f8) {
        this.a = f8.k().getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = ax.d8.b.b(f8);
    }

    private String a(String string, String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("|T|");
        stringBuilder.append(string);
        stringBuilder.append("|");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    private static String b(f object) {
        String string = ((f)object).n().d();
        if (string != null) {
            return string;
        }
        if (!((String)(object = ((f)object).n().c())).startsWith("1:") && !((String)object).startsWith("2:")) {
            return object;
        }
        if (((String[])(object = ((String)object).split(":"))).length != 4) {
            return null;
        }
        if (((String)(object = object[1])).isEmpty()) {
            return null;
        }
        return object;
    }

    private static String c(PublicKey object) {
        object = object.getEncoded();
        try {
            object = MessageDigest.getInstance("SHA1").digest((byte[])object);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            Log.w((String)"ContentValues", (String)"Unexpected error, device missing required algorithms");
            return null;
        }
        object[0] = (byte)((object[0] & 0xF) + 112 & 0xFF);
        object = Base64.encodeToString((byte[])object, (int)0, (int)8, (int)11);
        return object;
    }

    private String d(String string) {
        try {
            JSONObject jSONObject = new JSONObject(string);
            string = jSONObject.getString("token");
            return string;
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private PublicKey e(String object) {
        Object var1_5;
        try {
            object = Base64.decode((String)object, (int)8);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec((byte[])object);
            object = keyFactory.generatePublic(x509EncodedKeySpec);
            return object;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid key stored ");
        stringBuilder.append(var1_5);
        Log.w((String)"ContentValues", (String)stringBuilder.toString());
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String g() {
        SharedPreferences sharedPreferences = this.a;
        synchronized (sharedPreferences) {
            return this.a.getString("|S|id", null);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String h() {
        SharedPreferences sharedPreferences = this.a;
        synchronized (sharedPreferences) {
            Throwable throwable2;
            block4: {
                Object object;
                try {
                    object = this.a.getString("|S||P|", null);
                    if (object == null) {
                        return null;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                if ((object = this.e((String)object)) != null) return ax.d8.b.c((PublicKey)object);
                return null;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String f() {
        SharedPreferences sharedPreferences = this.a;
        synchronized (sharedPreferences) {
            try {
                String string = this.g();
                if (string == null) return this.h();
                return string;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String i() {
        SharedPreferences sharedPreferences = this.a;
        synchronized (sharedPreferences) {
            Throwable throwable2;
            block7: {
                int n8;
                int n9;
                Object object;
                try {
                    object = c;
                    n9 = ((String[])object).length;
                    n8 = 0;
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                while (n8 < n9) {
                    String string = object[n8];
                    string = this.a(this.b, string);
                    string = this.a.getString(string, null);
                    if (string != null && !string.isEmpty()) {
                        object = string;
                        if (!string.startsWith("{")) return object;
                        return this.d(string);
                    }
                    ++n8;
                }
                return null;
            }
            throw throwable2;
        }
    }
}

