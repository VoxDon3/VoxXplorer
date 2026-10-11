package ax.b1;

import android.os.Build;
import java.util.UUID;

/* loaded from: classes.dex */
public final class F implements ax.V0.b {
    public static final boolean d;
    public final UUID a;
    public final byte[] b;

    @Deprecated
    public final boolean c;

    static {
        boolean z;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                d = z;
            }
        }
        z = false;
        d = z;
    }

    public F(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    @Deprecated
    public F(UUID uuid, byte[] bArr, boolean z) {
        this.a = uuid;
        this.b = bArr;
        this.c = z;
    }
}
