package ax.f6;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.A5;
import com.google.android.gms.measurement.internal.C3649f;
import com.google.android.gms.measurement.internal.C3669h5;
import com.google.android.gms.measurement.internal.E5;
import java.util.List;

/* renamed from: ax.f6.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC2057e extends IInterface {
    void A1(E5 e5) throws RemoteException;

    List<C3669h5> B1(E5 e5, Bundle bundle) throws RemoteException;

    List<C3649f> F(String str, String str2, E5 e5) throws RemoteException;

    void F0(long j, String str, String str2, String str3) throws RemoteException;

    void I(E5 e5) throws RemoteException;

    void I0(E5 e5) throws RemoteException;

    List<C3649f> J0(String str, String str2, String str3) throws RemoteException;

    List<A5> J1(E5 e5, boolean z) throws RemoteException;

    void M0(C3649f c3649f) throws RemoteException;

    void N(com.google.android.gms.measurement.internal.D d, String str, String str2) throws RemoteException;

    void P(A5 a5, E5 e5) throws RemoteException;

    void U1(E5 e5) throws RemoteException;

    List<A5> Z(String str, String str2, String str3, boolean z) throws RemoteException;

    void f0(E5 e5) throws RemoteException;

    void g0(Bundle bundle, E5 e5) throws RemoteException;

    void h0(E5 e5) throws RemoteException;

    byte[] h1(com.google.android.gms.measurement.internal.D d, String str) throws RemoteException;

    C2053a k1(E5 e5) throws RemoteException;

    String p0(E5 e5) throws RemoteException;

    List<A5> u1(String str, String str2, boolean z, E5 e5) throws RemoteException;

    void w1(com.google.android.gms.measurement.internal.D d, E5 e5) throws RemoteException;

    void y0(C3649f c3649f, E5 e5) throws RemoteException;
}
