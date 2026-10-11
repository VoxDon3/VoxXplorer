package ax.L2;

import android.os.PowerManager;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
final class z {
    public static final z a = new z();
    private static final WeakHashMap<PowerManager.WakeLock, String> b = new WeakHashMap<>();

    private z() {
    }

    public final WeakHashMap<PowerManager.WakeLock, String> a() {
        return b;
    }
}
