/*
 * Decompiled with CFR 0.152.
 */
package ax.l1;

import android.media.Spatializer;
import java.util.concurrent.Executor;

public final class u {
    public static /* bridge */ /* synthetic */ void a(Spatializer spatializer, Executor executor, Spatializer.OnSpatializerStateChangedListener onSpatializerStateChangedListener) {
        spatializer.addOnSpatializerStateChangedListener(executor, onSpatializerStateChangedListener);
    }
}

