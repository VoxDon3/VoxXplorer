package ax.z;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import ax.d.InterfaceC1860a;
import ax.d.InterfaceC1861b;

/* renamed from: ax.z.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3531c {
    private final InterfaceC1861b a;
    private final ComponentName b;
    private final Context c;

    C3531c(InterfaceC1861b interfaceC1861b, ComponentName componentName, Context context) {
        this.a = interfaceC1861b;
        this.b = componentName;
        this.c = context;
    }

    public static boolean a(Context context, String str, AbstractServiceConnectionC3533e abstractServiceConnectionC3533e) {
        abstractServiceConnectionC3533e.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, abstractServiceConnectionC3533e, 33);
    }

    private InterfaceC1860a.AbstractBinderC0271a b(C3530b c3530b) {
        return new a(c3530b);
    }

    private C3534f d(C3530b c3530b, PendingIntent pendingIntent) {
        boolean O1;
        InterfaceC1860a.AbstractBinderC0271a b = b(c3530b);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                O1 = this.a.D0(b, bundle);
            } else {
                O1 = this.a.O1(b);
            }
            if (O1) {
                return new C3534f(this.a, b, this.b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public C3534f c(C3530b c3530b) {
        return d(c3530b, null);
    }

    public boolean e(long j) {
        try {
            return this.a.H0(j);
        } catch (RemoteException unused) {
            return false;
        }
    }

    /* renamed from: ax.z.c$a */
    class a extends InterfaceC1860a.AbstractBinderC0271a {
        private Handler e = new Handler(Looper.getMainLooper());

        a(C3530b c3530b) {
        }

        @Override // ax.d.InterfaceC1860a
        public Bundle r0(String str, Bundle bundle) throws RemoteException {
            return null;
        }

        @Override // ax.d.InterfaceC1860a
        public void K0(Bundle bundle) throws RemoteException {
        }

        @Override // ax.d.InterfaceC1860a
        public void P0(Bundle bundle) throws RemoteException {
        }

        @Override // ax.d.InterfaceC1860a
        public void Q1(Bundle bundle) throws RemoteException {
        }

        @Override // ax.d.InterfaceC1860a
        public void n1(Bundle bundle) throws RemoteException {
        }

        @Override // ax.d.InterfaceC1860a
        public void I1(String str, Bundle bundle) throws RemoteException {
        }

        @Override // ax.d.InterfaceC1860a
        public void j1(String str, Bundle bundle) throws RemoteException {
        }

        @Override // ax.d.InterfaceC1860a
        public void t1(int i, Bundle bundle) {
        }

        @Override // ax.d.InterfaceC1860a
        public void W0(int i, int i2, Bundle bundle) throws RemoteException {
        }

        @Override // ax.d.InterfaceC1860a
        public void S1(int i, Uri uri, boolean z, Bundle bundle) throws RemoteException {
        }

        @Override // ax.d.InterfaceC1860a
        public void Y(int i, int i2, int i3, int i4, int i5, Bundle bundle) throws RemoteException {
        }
    }
}
