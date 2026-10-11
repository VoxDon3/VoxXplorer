/*
 * Decompiled with CFR 0.152.
 */
package okhttp3.internal.connection;

import ax.Gb.l;
import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.Route;

public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet<Route>();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void connected(Route route) {
        synchronized (this) {
            l.f(route, "route");
            this.failedRoutes.remove(route);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void failed(Route route) {
        synchronized (this) {
            l.f(route, "failedRoute");
            this.failedRoutes.add(route);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean shouldPostpone(Route route) {
        synchronized (this) {
            l.f(route, "route");
            return this.failedRoutes.contains(route);
        }
    }
}

