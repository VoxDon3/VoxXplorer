/*
 * Decompiled with CFR 0.152.
 */
package ax.n0;

import ax.Gb.g;
import ax.Gb.l;
import java.io.IOException;

public final class a
extends IOException {
    public a(String string, Throwable throwable) {
        l.f(string, "message");
        super(string, throwable);
    }

    public /* synthetic */ a(String string, Throwable throwable, int n8, g g8) {
        if ((n8 & 2) != 0) {
            throwable = null;
        }
        this(string, throwable);
    }
}

