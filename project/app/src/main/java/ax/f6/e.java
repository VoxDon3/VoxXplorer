/*
 * Decompiled with CFR 0.152.
 */
package ax.f6;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import ax.f6.a;
import com.google.android.gms.measurement.internal.A5;
import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.f;
import com.google.android.gms.measurement.internal.h5;
import java.util.List;

public interface e
extends IInterface {
    public void A1(E5 var1) throws RemoteException;

    public List<h5> B1(E5 var1, Bundle var2) throws RemoteException;

    public List<f> F(String var1, String var2, E5 var3) throws RemoteException;

    public void F0(long var1, String var3, String var4, String var5) throws RemoteException;

    public void I(E5 var1) throws RemoteException;

    public void I0(E5 var1) throws RemoteException;

    public List<f> J0(String var1, String var2, String var3) throws RemoteException;

    public List<A5> J1(E5 var1, boolean var2) throws RemoteException;

    public void M0(f var1) throws RemoteException;

    public void N(D var1, String var2, String var3) throws RemoteException;

    public void P(A5 var1, E5 var2) throws RemoteException;

    public void U1(E5 var1) throws RemoteException;

    public List<A5> Z(String var1, String var2, String var3, boolean var4) throws RemoteException;

    public void f0(E5 var1) throws RemoteException;

    public void g0(Bundle var1, E5 var2) throws RemoteException;

    public void h0(E5 var1) throws RemoteException;

    public byte[] h1(D var1, String var2) throws RemoteException;

    public a k1(E5 var1) throws RemoteException;

    public String p0(E5 var1) throws RemoteException;

    public List<A5> u1(String var1, String var2, boolean var3, E5 var4) throws RemoteException;

    public void w1(D var1, E5 var2) throws RemoteException;

    public void y0(f var1, E5 var2) throws RemoteException;
}

