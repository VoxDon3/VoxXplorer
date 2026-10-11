/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import ax.b6.v0;
import ax.b6.x0;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

final class u0
extends v0 {
    private u0() {
    }

    /* synthetic */ u0(x0 x02) {
        this();
    }

    @Override
    public final URLConnection b(URL uRL, String string) throws IOException {
        return uRL.openConnection();
    }
}

