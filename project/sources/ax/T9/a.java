package ax.T9;

import android.util.Base64;
import java.text.ParseException;

/* loaded from: classes3.dex */
public final class a {
    public static byte[] a(String str) throws ParseException {
        return Base64.decode(str, 2);
    }

    public static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 2);
    }
}
