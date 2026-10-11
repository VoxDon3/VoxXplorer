/*
 * Decompiled with CFR 0.152.
 */
package ax.Y0;

import android.media.MediaRouter2;
import java.util.concurrent.Executor;

public final class w {
    public static /* bridge */ /* synthetic */ void a(MediaRouter2 mediaRouter2, Executor executor, MediaRouter2.ControllerCallback controllerCallback) {
        mediaRouter2.registerControllerCallback(executor, controllerCallback);
    }
}

