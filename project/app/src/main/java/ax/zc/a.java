/*
 * Decompiled with CFR 0.152.
 */
package ax.zc;

import java.io.IOException;

public class a
extends IOException {
    private final int c0;
    private final long q;

    public a(long l8, int n8) {
        super(a.a(l8, n8));
        this.q = l8;
        this.c0 = n8;
    }

    public a(long l8, int n8, Exception exception) {
        super(a.a(l8, n8), exception);
        this.q = l8;
        this.c0 = n8;
    }

    private static String a(long l8, int n8) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(l8);
        stringBuilder.append(" kb of memory would be needed; limit was ");
        stringBuilder.append(n8);
        stringBuilder.append(" kb. If the file is not corrupt, consider increasing the memory limit.");
        return stringBuilder.toString();
    }
}

