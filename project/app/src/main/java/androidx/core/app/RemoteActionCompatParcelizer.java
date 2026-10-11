/*
 * Decompiled with CFR 0.152.
 */
package androidx.core.app;

import android.os.Parcelable;
import androidx.core.app.RemoteActionCompat;
import androidx.versionedparcelable.a;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a a8) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = a8.v(remoteActionCompat.a, 1);
        remoteActionCompat.b = a8.l(remoteActionCompat.b, 2);
        remoteActionCompat.c = a8.l(remoteActionCompat.c, 3);
        remoteActionCompat.d = a8.r(remoteActionCompat.d, 4);
        remoteActionCompat.e = a8.h(remoteActionCompat.e, 5);
        remoteActionCompat.f = a8.h(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a a8) {
        a8.x(false, false);
        a8.M(remoteActionCompat.a, 1);
        a8.D(remoteActionCompat.b, 2);
        a8.D(remoteActionCompat.c, 3);
        a8.H((Parcelable)remoteActionCompat.d, 4);
        a8.z(remoteActionCompat.e, 5);
        a8.z(remoteActionCompat.f, 6);
    }
}

