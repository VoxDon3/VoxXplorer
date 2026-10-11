package ax.z;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import ax.d.InterfaceC1860a;
import ax.d.InterfaceC1861b;
import java.util.List;

/* renamed from: ax.z.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3534f {
    private final Object a = new Object();
    private final InterfaceC1861b b;
    private final InterfaceC1860a c;
    private final ComponentName d;
    private final PendingIntent e;

    C3534f(InterfaceC1861b interfaceC1861b, InterfaceC1860a interfaceC1860a, ComponentName componentName, PendingIntent pendingIntent) {
        this.b = interfaceC1861b;
        this.c = interfaceC1860a;
        this.d = componentName;
        this.e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
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
        try {
            return this.b.z1(this.c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
