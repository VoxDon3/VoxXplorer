/*
 * Decompiled with CFR 0.152.
 */
package ax.j9;

import java.util.Arrays;

public class b {
    private final String a;
    private final char[] b;
    private final String c;

    public b(String string, char[] cArray, String string2) {
        this.a = string;
        this.b = Arrays.copyOf(cArray, cArray.length);
        this.c = string2;
    }

    public String a() {
        return this.c;
    }

    public char[] b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public boolean d() {
        return this.a.isEmpty() && this.b.length == 0;
    }

    public boolean e() {
        return this.a.equals("Guest") && this.b.length == 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AuthenticationContext[");
        stringBuilder.append(this.a);
        stringBuilder.append('@');
        stringBuilder.append(this.c);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

