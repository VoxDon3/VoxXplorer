/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.measurement.internal.f3;
import com.google.android.gms.measurement.internal.k5;
import com.google.android.gms.measurement.internal.q5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;

public final class Y1
extends k5 {
    public Y1(q5 q52) {
        super(q52);
    }

    static /* bridge */ /* synthetic */ byte[] y(Y1 y12, HttpURLConnection httpURLConnection) {
        return Y1.z(httpURLConnection);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static byte[] z(HttpURLConnection object) throws IOException {
        Throwable throwable2;
        Object object2;
        block5: {
            ByteArrayOutputStream byteArrayOutputStream;
            Object object3;
            object2 = object3 = null;
            try {
                object2 = object3;
                byteArrayOutputStream = new ByteArrayOutputStream();
                object2 = object3;
                object2 = object = ((URLConnection)object).getInputStream();
                object3 = new byte[1024];
                while (true) {
                    object2 = object;
                    int n8 = ((InputStream)object).read((byte[])object3);
                    if (n8 > 0) {
                        object2 = object;
                        byteArrayOutputStream.write((byte[])object3, 0, n8);
                        continue;
                    }
                    break;
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            object2 = object;
            object3 = byteArrayOutputStream.toByteArray();
            ((InputStream)object).close();
            return object3;
        }
        if (object2 != null) {
            ((InputStream)object2).close();
        }
        throw throwable2;
    }

    public final boolean A() {
        NetworkInfo networkInfo;
        this.u();
        ConnectivityManager connectivityManager = (ConnectivityManager)((f3)this).a().getSystemService("connectivity");
        NetworkInfo networkInfo2 = networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo2 = connectivityManager.getActiveNetworkInfo();
            }
            catch (SecurityException securityException) {
                networkInfo2 = networkInfo;
            }
        }
        return networkInfo2 != null && networkInfo2.isConnected();
    }

    @Override
    protected final boolean x() {
        return false;
    }
}

