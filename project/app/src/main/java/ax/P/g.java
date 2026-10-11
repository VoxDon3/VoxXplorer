/*
 * Decompiled with CFR 0.152.
 */
package ax.P;

import android.os.Bundle;
import android.os.IBinder;

@Deprecated
public final class g {
    public static IBinder a(Bundle bundle, String string) {
        return bundle.getBinder(string);
    }

    public static void b(Bundle bundle, String string, IBinder iBinder) {
        bundle.putBinder(string, iBinder);
    }
}

