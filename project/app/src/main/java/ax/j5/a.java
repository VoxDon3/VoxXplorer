/*
 * Decompiled with CFR 0.152.
 */
package ax.j5;

import android.util.Log;
import ax.h5.b;
import ax.h5.d;
import ax.j5.c;
import java.io.IOException;

public class a
extends ax.e5.c {
    private static final String e = "a";
    private b d;

    private a(ax.e5.a a8, c c8) {
        super(a8, c8.a());
    }

    public static a a(c c8, ax.e5.a a8) throws IOException {
        try {
            a a9 = new a(a8, c8);
            a9.d = ax.h5.d.a(c8, a9);
            return a9;
        }
        catch (d.a a10) {
            Log.w((String)e, (String)"Unsupported fs on partition");
            return null;
        }
    }

    public b b() {
        return this.d;
    }
}

