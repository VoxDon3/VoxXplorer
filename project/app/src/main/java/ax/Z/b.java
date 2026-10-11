/*
 * Decompiled with CFR 0.152.
 */
package ax.Z;

import android.os.Handler;
import android.os.Looper;

class b {
    static Handler a() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}

