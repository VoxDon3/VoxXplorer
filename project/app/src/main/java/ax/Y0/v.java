/*
 * Decompiled with CFR 0.152.
 */
package ax.Y0;

import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import java.util.concurrent.Executor;

public final class v {
    public static /* bridge */ /* synthetic */ void a(MediaRouter2 mediaRouter2, Executor executor, MediaRouter2.RouteCallback routeCallback, RouteDiscoveryPreference routeDiscoveryPreference) {
        mediaRouter2.registerRouteCallback(executor, routeCallback, routeDiscoveryPreference);
    }
}

