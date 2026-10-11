/*
 * Decompiled with CFR 0.152.
 */
package ax.nb;

import ax.jb.a;
import ax.qb.d;
import java.io.UnsupportedEncodingException;

public class b {
    private static final String e = ax.jb.a.g("jcifs.netbios.scope");
    static final String f = ax.jb.a.h("jcifs.encoding", System.getProperty("file.encoding"));
    public String a;
    public String b;
    public int c;
    int d;

    b() {
    }

    public b(String string, int n8, String string2) {
        String string3 = string;
        if (string.length() > 15) {
            string3 = string.substring(0, 15);
        }
        this.a = string3.toUpperCase();
        this.c = n8;
        if (string2 == null || string2.length() <= 0) {
            string2 = e;
        }
        this.b = string2;
        this.d = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    int a(byte[] byArray, int n8) {
        StringBuffer stringBuffer;
        String string;
        int n9 = n8 + 1;
        int n10 = byArray[n8] & 0xFF;
        if (n10 == 0) {
            this.b = null;
            return 1;
        }
        try {
            string = new String(byArray, n9, n10, f);
            stringBuffer = new StringBuffer(string);
            n10 = n9 + n10;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return n9 - n8;
        }
        while (true) {
            n9 = n10 + 1;
            if ((n10 = byArray[n10] & 0xFF) == 0) break;
            try {
                stringBuffer.append('.');
                string = new String(byArray, n9, n10, f);
                stringBuffer.append(string);
                n10 += n9;
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                return n9 - n8;
            }
        }
        this.b = stringBuffer.toString();
        return n9 - n8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    int b(byte[] byArray, int n8) {
        int n9;
        byte[] byArray2 = new byte[33];
        int n10 = 15;
        for (n9 = 0; n9 < 15; ++n9) {
            byte by;
            int n11 = n9 * 2;
            byArray2[n9] = by = (byte)((byArray[n11 + 1 + n8] & 0xFF) - 65 << 4);
            byArray2[n9] = by = (byte)((byte)((byArray[n11 + 2 + n8] & 0xFF) - 65 & 0xF) | by);
            if (by == 32) continue;
            n10 = n9 + 1;
        }
        try {
            String string;
            this.a = string = new String(byArray2, 0, n10, f);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {}
        this.c = n9 = (byArray[n8 + 31] & 0xFF) - 65 << 4;
        this.c = n9 | 0xF & (byArray[n8 + 32] & 0xFF) - 65;
        return this.a(byArray, n8 + 33) + 33;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    int c(byte[] byArray, int n8) {
        String string = this.b;
        if (string == null) {
            byArray[n8] = 0;
            return 1;
        }
        int n9 = n8 + 1;
        byArray[n8] = 46;
        try {
            System.arraycopy(string.getBytes(f), 0, byArray, n9, this.b.length());
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {}
        n8 = n9 + this.b.length();
        byArray[n8] = 0;
        int n10 = n8 - 1;
        int n11 = this.b.length();
        n9 = 0;
        n8 = n10;
        while (true) {
            int n12;
            if (byArray[n12 = n8] == 46) {
                byArray[n12] = (byte)n9;
                n8 = 0;
            } else {
                n8 = n9 + 1;
            }
            if (n12 <= n10 - n11) {
                return this.b.length() + 2;
            }
            n9 = n8;
            n8 = --n12;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    int d(byte[] byArray, int n8) {
        int n9;
        byArray[n8] = 32;
        byte[] byArray2 = this.a.getBytes(f);
        int n10 = 0;
        while (true) {
            if (n10 >= byArray2.length) break;
            n9 = n10 * 2;
            byArray[n9 + 1 + n8] = (byte)(((byArray2[n10] & 0xF0) >> 4) + 65);
            byArray[n9 + 2 + n8] = (byte)((0xF & byArray2[n10]) + 65);
            ++n10;
        }
        for (n9 = n10; n9 < 15; ++n9) {
            n10 = n9 * 2;
            byArray[n10 + 1 + n8] = 67;
            byArray[n10 + 2 + n8] = 65;
        }
        try {
            n10 = this.c;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return this.c(byArray, n8 + 33) + 33;
        }
        byArray[n8 + 31] = (byte)(((n10 & 0xF0) >> 4) + 65);
        byArray[n8 + 32] = (byte)((n10 & 0xF) + 65);
        return this.c(byArray, n8 + 33) + 33;
    }

    public boolean equals(Object object) {
        if (!(object instanceof b)) {
            return false;
        }
        object = (b)object;
        if (this.b == null && ((b)object).b == null) {
            return this.a.equals(((b)object).a) && this.c == ((b)object).c;
        }
        return this.a.equals(((b)object).a) && this.c == ((b)object).c && this.b.equals(((b)object).b);
    }

    public int hashCode() {
        int n8 = this.a.hashCode() + this.c * 65599 + this.d * 65599;
        String string = this.b;
        int n9 = n8;
        if (string != null) {
            n9 = n8;
            if (string.length() != 0) {
                n9 = n8 + this.b.hashCode();
            }
        }
        return n9;
    }

    public String toString() {
        Object object;
        StringBuffer stringBuffer = new StringBuffer();
        String string = this.a;
        if (string == null) {
            object = "null";
        } else {
            object = string;
            if (string.charAt(0) == '\u0001') {
                object = string.toCharArray();
                object[0] = 46;
                object[1] = 46;
                object[14] = 46;
                object = new String((char[])object);
            }
        }
        stringBuffer.append((String)object);
        stringBuffer.append("<");
        stringBuffer.append(ax.qb.d.c(this.c, 2));
        stringBuffer.append(">");
        if (this.b != null) {
            stringBuffer.append(".");
            stringBuffer.append(this.b);
        }
        return stringBuffer.toString();
    }
}

