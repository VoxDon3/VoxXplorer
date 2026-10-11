/*
 * Decompiled with CFR 0.152.
 */
package ax.X0;

import android.content.Context;
import ax.I9.y;
import ax.X0.c;
import ax.X0.g;
import ax.X0.i;

final class h
extends ax.J9.g {
    private static final String[] d = new String[]{"wavetable", "GM2", "ringtone"};
    private static final Object e = new Object();
    private static h f;
    private final short[] c;

    private h(short[] sArray) {
        super("SonivoxVoiceDescription", i.c());
        this.c = sArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static h d(Context object) throws c {
        Object object2 = e;
        synchronized (object2) {
            try {
                h h8;
                if (f != null) return f;
                f = h8 = new h(i.h(object));
                return f;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public y a() {
        return new g(this.c);
    }
}

