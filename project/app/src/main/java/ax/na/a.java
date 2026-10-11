/*
 * Decompiled with CFR 0.152.
 */
package ax.na;

import java.io.IOException;
import java.util.Locale;

public class a
extends IOException {
    private final int q;

    public a(int n8, String string) {
        super(String.format(Locale.US, "API returned '%d - %s' HTTP error.", n8, string));
        this.q = n8;
    }

    public int a() {
        return this.q;
    }
}

