/*
 * Decompiled with CFR 0.152.
 */
package com.voxdon.xplorer.shizuku;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Keep;
import ax.p3.a;
import ax.u3.r;
import com.voxdon.xplorer.shizuku.a;
import com.voxdon.xplorer.shizuku.b;
import java.util.List;

public class ShizukuUserService
extends a.a {
    @Keep
    public ShizukuUserService() {
    }

    @Keep
    public ShizukuUserService(Context context) {
    }

    @Override
    public List<String> A0(String object, long l8) throws RemoteException {
        try {
            object = r.h((String)object, l8);
            return object;
        }
        catch (Exception exception) {
            return null;
        }
    }

    @Override
    public ParcelFileDescriptor G1(String string, boolean bl) throws RemoteException {
        return b.k(string, bl);
    }

    @Override
    public int K1(String string, boolean bl) throws RemoteException {
        return b.j(string, bl);
    }

    @Override
    public a L0(String string) throws RemoteException {
        return b.h(string);
    }

    @Override
    public boolean W1(String string) throws RemoteException {
        return b.n(string);
    }

    @Override
    public boolean X0(String string, String string2) throws RemoteException {
        return b.o(string, string2);
    }

    @Override
    public List<a> d1(String string) throws RemoteException {
        return b.m(string);
    }

    @Override
    @Keep
    public void destroy() throws RemoteException {
        Log.i((String)"ShizukuUserService", (String)"destroy");
        System.exit(0);
    }

    @Override
    public boolean h(String string) throws RemoteException {
        return b.d(string);
    }

    @Override
    public boolean l0(String string, long l8) throws RemoteException {
        return b.p(string, l8);
    }

    @Override
    public ParcelFileDescriptor w0(String string) throws RemoteException {
        return b.l(string);
    }

    @Override
    public boolean x1(String string) throws RemoteException {
        return b.b(string);
    }

    @Override
    public a z(String string) throws RemoteException {
        return b.f(string);
    }

    @Override
    public ParcelFileDescriptor z0(String string) throws RemoteException {
        return b.i(string);
    }
}

