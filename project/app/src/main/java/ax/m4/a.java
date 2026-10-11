/*
 * Decompiled with CFR 0.152.
 */
package ax.m4;

public class a {
    private String a;
    private String b;

    public a(String string, String string2) {
        if (string != null && string2 != null) {
            this.a = string;
            this.b = string2;
            return;
        }
        throw new IllegalArgumentException("username and password cannot be null");
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }
}

