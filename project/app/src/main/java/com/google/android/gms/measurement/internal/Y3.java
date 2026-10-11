/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import com.google.android.gms.measurement.internal.E2;
import com.google.android.gms.measurement.internal.e3;
import com.google.android.gms.measurement.internal.f3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;

public final class Y3
extends e3 {
    Y3(E2 e22) {
        super(e22);
    }

    static /* bridge */ /* synthetic */ byte[] u(Y3 y32, HttpURLConnection httpURLConnection) {
        return Y3.v(httpURLConnection);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static byte[] v(HttpURLConnection object) throws IOException {
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

    @Override
    protected final boolean t() {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean w() {
        this.p();
        ConnectivityManager connectivityManager = (ConnectivityManager)((f3)this).a().getSystemService("connectivity");
        if (connectivityManager == null) return false;
        try {
            connectivityManager = connectivityManager.getActiveNetworkInfo();
        }
        catch (SecurityException securityException) {
            return false;
        }
        if (connectivityManager == null) return false;
        if (!connectivityManager.isConnected()) return false;
        return true;
    }
}

