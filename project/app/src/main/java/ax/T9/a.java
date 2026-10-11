/*
 * Decompiled with CFR 0.152.
 */
package ax.T9;

import android.util.Base64;
import java.text.ParseException;

public final class a {
    public static byte[] a(String string) throws ParseException {
        return Base64.decode((String)string, (int)2);
    }

    public static String b(byte[] byArray) {
        return Base64.encodeToString((byte[])byArray, (int)2);
    }
}

