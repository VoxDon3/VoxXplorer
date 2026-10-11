package com.voxdon.xplorer.shizuku;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.Keep;
import ax.p3.C2761a;
import ax.u3.C3200r;
import com.voxdon.xplorer.shizuku.a;
import java.util.List;

/* loaded from: classes.dex */
public class ShizukuUserService extends a.AbstractBinderC0528a {
    @Keep
    public ShizukuUserService() {
    }

    @Override // com.voxdon.xplorer.shizuku.a
    public List<String> A0(String str, long j) throws RemoteException {
        try {
            return C3200r.h(str, j);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.voxdon.xplorer.shizuku.a
    public ParcelFileDescriptor G1(String str, boolean z) throws RemoteException {
        return b.k(str, z);
    }

    @Override // com.voxdon.xplorer.shizuku.a
    public int K1(String str, boolean z) throws RemoteException {
        return b.j(str, z);
    }

    @Override // com.voxdon.xplorer.shizuku.a
    public C2761a L0(String str) throws RemoteException {
        return b.h(str);
    }

    @Override // com.voxdon.xplorer.shizuku.a
    public boolean W1(String str) throws RemoteException {
        return b.n(str);
    }

    @Override // com.voxdon.xplorer.shizuku.a
    public boolean X0(String str, String str2) throws RemoteException {
        return b.o(str, str2);
    }

    @Override // com.voxdon.xplorer.shizuku.a
    public List<C2761a> d1(String str) throws RemoteException {
        return b.m(str);
    }

    @Override // com.voxdon.xplorer.shizuku.a
    @Keep
    public void destroy() throws RemoteException {
        Log.i("ShizukuUserService", "destroy");
        System.exit(0);
    }

    @Override // com.voxdon.xplorer.shizuku.a
    public boolean h(String str) throws RemoteException {
        return b.d(str);
    }

    @Override // com.voxdon.xplorer.shizuku.a
    public boolean l0(String str, long j) throws RemoteException {
        return b.p(str, j);
    }

    @Override // com.voxdon.xplorer.shizuku.a
    public ParcelFileDescriptor w0(String str) throws RemoteException {
        return b.l(str);
    }

    @Override // com.voxdon.xplorer.shizuku.a
    public boolean x1(String str) throws RemoteException {
        return b.b(str);
    }

    @Override // com.voxdon.xplorer.shizuku.a
    public C2761a z(String str) throws RemoteException {
        return b.f(str);
    }

    @Override // com.voxdon.xplorer.shizuku.a
    public ParcelFileDescriptor z0(String str) throws RemoteException {
        return b.i(str);
    }

    @Keep
    public ShizukuUserService(Context context) {
    }
}
