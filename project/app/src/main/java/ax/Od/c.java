/*
 * Decompiled with CFR 0.152.
 */
package ax.Od;

import ax.Nd.j;
import ax.Od.a;
import ax.Od.b;
import ax.Od.d;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public class c {
    private static final d a = new d();

    public static byte[] a(String object, int n8, int n9) {
        try {
            object = a.a((String)object, n8, n9);
            return object;
        }
        catch (Exception exception) {
            object = new StringBuilder();
            ((StringBuilder)object).append("exception decoding Hex string: ");
            ((StringBuilder)object).append(exception.getMessage());
            throw new a(((StringBuilder)object).toString(), exception);
        }
    }

    public static byte[] b(byte[] byArray) {
        return c.c(byArray, 0, byArray.length);
    }

    public static byte[] c(byte[] byArray, int n8, int n9) {
        Object object = new ByteArrayOutputStream();
        try {
            a.b(byArray, n8, n9, (OutputStream)object);
            return ((ByteArrayOutputStream)object).toByteArray();
        }
        catch (Exception exception) {
            object = new StringBuilder();
            ((StringBuilder)object).append("exception encoding Hex string: ");
            ((StringBuilder)object).append(exception.getMessage());
            throw new b(((StringBuilder)object).toString(), exception);
        }
    }

    public static String d(byte[] byArray) {
        return c.e(byArray, 0, byArray.length);
    }

    public static String e(byte[] byArray, int n8, int n9) {
        return j.b(c.c(byArray, n8, n9));
    }
}

