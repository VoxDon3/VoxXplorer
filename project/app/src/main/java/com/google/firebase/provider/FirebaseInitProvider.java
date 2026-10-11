/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import ax.M5.p;
import ax.x7.f;
import ax.x7.o;
import java.util.concurrent.atomic.AtomicBoolean;

public class FirebaseInitProvider
extends ContentProvider {
    private static o a = o.e();
    private static AtomicBoolean b = new AtomicBoolean(false);

    private static void a(ProviderInfo providerInfo) {
        p.m(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (!"com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            return;
        }
        throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
    }

    public static o b() {
        return a;
    }

    public static boolean c() {
        return b.get();
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        FirebaseInitProvider.a(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    public int delete(Uri uri, String string, String[] stringArray) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean onCreate() {
        Throwable throwable2;
        block4: {
            block3: {
                block2: {
                    try {
                        b.set(true);
                        f f8 = f.q(this.getContext());
                        if (f8 != null) break block2;
                        Log.i((String)"FirebaseInitProvider", (String)"FirebaseApp initialization unsuccessful");
                        break block3;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                Log.i((String)"FirebaseInitProvider", (String)"FirebaseApp initialization successful");
            }
            b.set(false);
            return false;
        }
        b.set(false);
        throw throwable2;
    }

    public Cursor query(Uri uri, String[] stringArray, String string, String[] stringArray2, String string2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String string, String[] stringArray) {
        return 0;
    }
}

