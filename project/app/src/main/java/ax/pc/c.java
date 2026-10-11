/*
 * Decompiled with CFR 0.152.
 */
package ax.pc;

import ax.tc.b;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class c {
    public static String a(byte[] byArray, boolean bl, Charset object) {
        if (object != null) {
            return new String(byArray, (Charset)object);
        }
        if (bl) {
            return new String(byArray, b.b);
        }
        try {
            object = new String(byArray, "Cp437");
            return object;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return new String(byArray);
        }
    }
}

