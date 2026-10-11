/*
 * Decompiled with CFR 0.152.
 */
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
import android.os.Parcelable;
import android.util.Log;
import ax.ne.i;
import ax.oe.a;
import moe.shizuku.api.BinderContainer;

public class ShizukuProvider
extends ContentProvider {
    private static boolean a = false;
    private static boolean b = false;
    private static boolean c = true;

    private boolean a(Bundle bundle) {
        IBinder iBinder = i.z();
        if (iBinder != null && iBinder.pingBinder()) {
            bundle.putParcelable("moe.shizuku.privileged.api.intent.extra.BINDER", (Parcelable)new BinderContainer(iBinder));
            return true;
        }
        return false;
    }

    private void b(Bundle object) {
        if (i.F()) {
            Log.d((String)"ShizukuProvider", (String)"sendBinder is called when already a living binder");
            return;
        }
        if ((object = (BinderContainer)object.getParcelable("moe.shizuku.privileged.api.intent.extra.BINDER")) != null && object.q != null) {
            Log.d((String)"ShizukuProvider", (String)"binder received");
            i.E(object.q, this.getContext().getPackageName());
            if (a) {
                Log.d((String)"ShizukuProvider", (String)"broadcast binder");
                object = new Intent("moe.shizuku.api.action.BINDER_RECEIVED").putExtra("moe.shizuku.privileged.api.intent.extra.BINDER", (Parcelable)object).setPackage(this.getContext().getPackageName());
                this.getContext().sendBroadcast((Intent)object);
            }
        }
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.multiprocess) {
            if (providerInfo.exported) {
                b = true;
                return;
            }
            throw new IllegalStateException("android:exported must be true");
        }
        throw new IllegalStateException("android:multiprocess must be false");
    }

    public Bundle call(String string, String string2, Bundle bundle) {
        if (ax.oe.a.b()) {
            Log.w((String)"ShizukuProvider", (String)"Provider called when Sui is available. Are you using Shizuku and Sui at the same time?");
            return new Bundle();
        }
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(BinderContainer.class.getClassLoader());
        string2 = new Bundle();
        string.getClass();
        if (!string.equals("sendBinder")) {
            if (string.equals("getBinder") && !this.a((Bundle)string2)) {
                return null;
            }
            return string2;
        }
        this.b(bundle);
        return string2;
    }

    public final int delete(Uri uri, String string, String[] stringArray) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        if (c && !ax.oe.a.b()) {
            boolean bl = ax.oe.a.a(this.getContext().getPackageName());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Initialize Sui: ");
            stringBuilder.append(bl);
            Log.d((String)"ShizukuProvider", (String)stringBuilder.toString());
        }
        return true;
    }

    public final Cursor query(Uri uri, String[] stringArray, String string, String[] stringArray2, String string2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String string, String[] stringArray) {
        return 0;
    }
}

