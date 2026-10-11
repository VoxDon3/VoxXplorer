/*
 * Decompiled with CFR 0.152.
 */
package ax.n;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import ax.Q.g;
import ax.n.F;
import java.util.Calendar;

class G {
    private static G d;
    private final Context a;
    private final LocationManager b;
    private final a c = new a();

    G(Context context, LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }

    static G a(Context context) {
        if (d == null) {
            context = context.getApplicationContext();
            d = new G(context, (LocationManager)context.getSystemService("location"));
        }
        return d;
    }

    @SuppressLint(value={"MissingPermission"})
    private Location b() {
        int n8 = g.b(this.a, "android.permission.ACCESS_COARSE_LOCATION");
        Location location = null;
        Location location2 = n8 == 0 ? this.c("network") : null;
        if (g.b(this.a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = this.c("gps");
        }
        if (location != null && location2 != null) {
            if (location.getTime() > location2.getTime()) {
                return location;
            }
            return location2;
        }
        if (location != null) {
            return location;
        }
        return location2;
    }

    private Location c(String string) {
        try {
            if (this.b.isProviderEnabled(string)) {
                string = this.b.getLastKnownLocation(string);
                return string;
            }
        }
        catch (Exception exception) {
            Log.d((String)"TwilightManager", (String)"Failed to get last known location", (Throwable)exception);
        }
        return null;
    }

    private boolean e() {
        return this.c.b > System.currentTimeMillis();
    }

    private void f(Location location) {
        a a8 = this.c;
        long l8 = System.currentTimeMillis();
        F f8 = F.b();
        f8.a(l8 - 86400000L, location.getLatitude(), location.getLongitude());
        f8.a(l8, location.getLatitude(), location.getLongitude());
        boolean bl = f8.c == 1;
        long l9 = f8.b;
        long l10 = f8.a;
        f8.a(l8 + 86400000L, location.getLatitude(), location.getLongitude());
        long l11 = f8.b;
        if (l9 != -1L && l10 != -1L) {
            if (l8 <= l10) {
                l11 = l9;
                if (l8 > l9) {
                    l11 = l10;
                }
            }
            l11 += 60000L;
        } else {
            l11 = l8 + 43200000L;
        }
        a8.a = bl;
        a8.b = l11;
    }

    boolean d() {
        a a8 = this.c;
        if (this.e()) {
            return a8.a;
        }
        Location location = this.b();
        if (location != null) {
            this.f(location);
            return a8.a;
        }
        Log.i((String)"TwilightManager", (String)"Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int n8 = Calendar.getInstance().get(11);
        return n8 < 6 || n8 >= 22;
        {
        }
    }

    private static class a {
        boolean a;
        long b;

        a() {
        }
    }
}

