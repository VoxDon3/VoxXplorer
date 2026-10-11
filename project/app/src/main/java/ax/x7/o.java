/*
 * Decompiled with CFR 0.152.
 */
package ax.x7;

import android.os.SystemClock;
import ax.x7.a;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class o {
    public static o a(long l8, long l9, long l10) {
        return new a(l8, l9, l10);
    }

    public static o e() {
        return o.a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}

