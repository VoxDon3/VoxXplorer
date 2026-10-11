/*
 * Decompiled with CFR 0.152.
 */
package ax.R5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import ax.S5.e;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class a {
    @Deprecated
    public static byte[] a(Context context, String object) throws PackageManager.NameNotFoundException {
        context = e.a(context).d((String)object, 64);
        object = context.signatures;
        if (object != null && ((Signature[])object).length == 1 && (object = a.b("SHA1")) != null) {
            return ((MessageDigest)object).digest(context.signatures[0].toByteArray());
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MessageDigest b(String string) {
        int n8 = 0;
        while (n8 < 2) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(string);
                if (messageDigest != null) {
                    return messageDigest;
                }
            }
            catch (NoSuchAlgorithmException noSuchAlgorithmException) {}
            ++n8;
        }
        return null;
    }
}

