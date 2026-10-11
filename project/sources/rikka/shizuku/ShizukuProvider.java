package rikka.shizuku;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import ax.ne.i;
import ax.oe.a;
import moe.shizuku.api.BinderContainer;

/* loaded from: classes3.dex */
public class ShizukuProvider extends ContentProvider {
    private static boolean a = false;
    private static boolean b = false;
    private static boolean c = true;

    private boolean a(Bundle bundle) {
        IBinder z = i.z();
        if (z == null || !z.pingBinder()) {
            return false;
        }
        bundle.putParcelable("moe.shizuku.privileged.api.intent.extra.BINDER", new BinderContainer(z));
        return true;
    }

    private void b(Bundle bundle) {
        if (i.F()) {
            Log.d("ShizukuProvider", "sendBinder is called when already a living binder");
            return;
        }
        BinderContainer binderContainer = (BinderContainer) bundle.getParcelable("moe.shizuku.privileged.api.intent.extra.BINDER");
        if (binderContainer == null || binderContainer.q == null) {
            return;
        }
        Log.d("ShizukuProvider", "binder received");
        i.E(binderContainer.q, getContext().getPackageName());
        if (a) {
            Log.d("ShizukuProvider", "broadcast binder");
            getContext().sendBroadcast(new Intent("moe.shizuku.api.action.BINDER_RECEIVED").putExtra("moe.shizuku.privileged.api.intent.extra.BINDER", binderContainer).setPackage(getContext().getPackageName()));
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.multiprocess) {
            throw new IllegalStateException("android:multiprocess must be false");
        }
        if (!providerInfo.exported) {
            throw new IllegalStateException("android:exported must be true");
        }
        b = true;
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        if (a.b()) {
            Log.w("ShizukuProvider", "Provider called when Sui is available. Are you using Shizuku and Sui at the same time?");
            return new Bundle();
        }
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(BinderContainer.class.getClassLoader());
        Bundle bundle2 = new Bundle();
        str.getClass();
        if (str.equals("sendBinder")) {
            b(bundle);
            return bundle2;
        }
        if (str.equals("getBinder") && !a(bundle2)) {
            return null;
        }
        return bundle2;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (!c || a.b()) {
            return true;
        }
        Log.d("ShizukuProvider", "Initialize Sui: " + a.a(getContext().getPackageName()));
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
