/*
 * Decompiled with CFR 0.152.
 */
package ax.z;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import ax.d.a;
import ax.d.b;
import java.util.List;

public final class f {
    private final Object a = new Object();
    private final b b;
    private final a c;
    private final ComponentName d;
    private final PendingIntent e;

    f(b b8, a a8, ComponentName componentName, PendingIntent pendingIntent) {
        this.b = b8;
        this.c = a8;
        this.d = componentName;
        this.e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", (Parcelable)pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        this.a(bundle2);
        return bundle2;
    }

    IBinder c() {
        return this.c.asBinder();
    }

    ComponentName d() {
        return this.d;
    }

    PendingIntent e() {
        return this.e;
    }

    public boolean f(Uri uri, Bundle bundle, List<Bundle> list) {
        bundle = this.b(bundle);
        try {
            boolean bl = this.b.z1(this.c, uri, bundle, list);
            return bl;
        }
        catch (RemoteException remoteException) {
            return false;
        }
    }
}

