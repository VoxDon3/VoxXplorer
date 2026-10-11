/*
 * Decompiled with CFR 0.152.
 */
package ax.M3;

import java.io.IOException;

public final class e
extends IOException {
    private final int q;

    public e(int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Http request failed with status code: ");
        stringBuilder.append(n8);
        this(stringBuilder.toString(), n8);
    }

    public e(String string) {
        this(string, -1);
    }

    public e(String string, int n8) {
        this(string, n8, null);
    }

    public e(String string, int n8, Throwable throwable) {
        super(string, throwable);
        this.q = n8;
    }
}

