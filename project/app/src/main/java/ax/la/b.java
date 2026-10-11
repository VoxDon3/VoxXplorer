/*
 * Decompiled with CFR 0.152.
 */
package ax.la;

import java.util.Locale;

public class b
extends Exception {
    private final String c0;
    private final int q;

    public b(int n8, String string) {
        super(String.format(Locale.US, "%d - %s", n8, string));
        this.q = n8;
        this.c0 = string;
    }

    public int a() {
        return this.q;
    }
}

