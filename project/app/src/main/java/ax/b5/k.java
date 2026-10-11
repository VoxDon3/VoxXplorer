/*
 * Decompiled with CFR 0.152.
 */
package ax.b5;

import java.io.Serializable;

public class k
implements Serializable {
    private final char c0;
    private final char d0;
    private final char q;

    public k() {
        this(':', ',', ',');
    }

    public k(char c8, char c9, char c10) {
        this.q = c8;
        this.c0 = c9;
        this.d0 = c10;
    }

    public static k a() {
        return new k();
    }

    public char b() {
        return this.d0;
    }

    public char c() {
        return this.c0;
    }

    public char d() {
        return this.q;
    }
}

