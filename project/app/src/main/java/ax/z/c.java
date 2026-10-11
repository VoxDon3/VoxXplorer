/*
 * Decompiled with CFR 0.152.
 */
package ax.z;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import ax.d.a;
import ax.z.b;
import ax.z.e;
import ax.z.f;

public class c {
    private final ax.d.b a;
    private final ComponentName b;
    private final Context c;

    c(ax.d.b b8, ComponentName componentName, Context context) {
        this.a = b8;
        this.b = componentName;
        this.c = context;
    }

    public static boolean a(Context context, String string, e e8) {
        e8.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            intent.setPackage(string);
        }
        return context.bindService(intent, (ServiceConnection)e8, 33);
    }

    private a.a b(b b8) {
        return new a.a(this, b8){
            private Handler e;
            final c f;
            {
                this.f = c8;
                this.e = new Handler(Looper.getMainLooper());
            }

            @Override
            public void I1(String string, Bundle bundle) throws RemoteException {
            }

            @Override
            public void K0(Bundle bundle) throws RemoteException {
            }

            @Override
            public void P0(Bundle bundle) throws RemoteException {
            }

            @Override
            public void Q1(Bundle bundle) throws RemoteException {
            }

            @Override
            public void S1(int n8, Uri uri, boolean bl, Bundle bundle) throws RemoteException {
            }

            @Override
            public void W0(int n8, int n9, Bundle bundle) throws RemoteException {
            }

            @Override
            public void Y(int n8, int n9, int n10, int n11, int n12, Bundle bundle) throws RemoteException {
            }

            @Override
            public void j1(String string, Bundle bundle) throws RemoteException {
            }

            @Override
            public void n1(Bundle bundle) throws RemoteException {
            }

            @Override
            public Bundle r0(String string, Bundle bundle) throws RemoteException {
                return null;
            }

            @Override
            public void t1(int n8, Bundle bundle) {
            }
        };
    }

    /*
     * Unable to fully structure code
     */
    private f d(b var1_1, PendingIntent var2_2) {
        var4_4 = this.b((b)var1_1);
        var1_1 = null;
        if (var2_2 == null) ** GOTO lbl9
        try {
            block4: {
                var5_5 = new Bundle();
                var5_5.putParcelable("android.support.customtabs.extra.SESSION_ID", (Parcelable)var2_2);
                var3_6 = this.a.D0(var4_4, var5_5);
                break block4;
lbl9:
                // 1 sources

                var3_6 = this.a.O1(var4_4);
            }
            if (!var3_6) {
                return null;
            }
            var1_1 = new f(this.a, var4_4, this.b, var2_2);
lbl14:
            // 2 sources

            return var1_1;
        }
        catch (RemoteException var2_3) {
            ** continue;
        }
    }

    public f c(b b8) {
        return this.d(b8, null);
    }

    public boolean e(long l8) {
        try {
            boolean bl = this.a.H0(l8);
            return bl;
        }
        catch (RemoteException remoteException) {
            return false;
        }
    }
}

