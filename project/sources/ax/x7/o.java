package ax.x7;

import android.os.SystemClock;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes3.dex */
public abstract class o {
    public static o a(long j, long j2, long j3) {
        return new C3466a(j, j2, j3);
    }

    public static o e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
