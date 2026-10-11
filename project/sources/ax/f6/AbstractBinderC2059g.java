package ax.f6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import ax.b6.BinderC1514b0;
import ax.b6.C1505a0;
import com.google.android.gms.measurement.internal.A5;
import com.google.android.gms.measurement.internal.C3649f;
import com.google.android.gms.measurement.internal.C3669h5;
import com.google.android.gms.measurement.internal.E5;
import java.util.List;

/* renamed from: ax.f6.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractBinderC2059g extends BinderC1514b0 implements InterfaceC2057e {
    public AbstractBinderC2059g() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // ax.b6.BinderC1514b0
    protected final boolean r(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                com.google.android.gms.measurement.internal.D d = (com.google.android.gms.measurement.internal.D) C1505a0.a(parcel, com.google.android.gms.measurement.internal.D.CREATOR);
                E5 e5 = (E5) C1505a0.a(parcel, E5.CREATOR);
                C1505a0.f(parcel);
                w1(d, e5);
                parcel2.writeNoException();
                return true;
            case 2:
                A5 a5 = (A5) C1505a0.a(parcel, A5.CREATOR);
                E5 e52 = (E5) C1505a0.a(parcel, E5.CREATOR);
                C1505a0.f(parcel);
                P(a5, e52);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            default:
                return false;
            case 4:
                E5 e53 = (E5) C1505a0.a(parcel, E5.CREATOR);
                C1505a0.f(parcel);
                I0(e53);
                parcel2.writeNoException();
                return true;
            case 5:
                com.google.android.gms.measurement.internal.D d2 = (com.google.android.gms.measurement.internal.D) C1505a0.a(parcel, com.google.android.gms.measurement.internal.D.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                C1505a0.f(parcel);
                N(d2, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                E5 e54 = (E5) C1505a0.a(parcel, E5.CREATOR);
                C1505a0.f(parcel);
                A1(e54);
                parcel2.writeNoException();
                return true;
            case 7:
                E5 e55 = (E5) C1505a0.a(parcel, E5.CREATOR);
                boolean h = C1505a0.h(parcel);
                C1505a0.f(parcel);
                List<A5> J1 = J1(e55, h);
                parcel2.writeNoException();
                parcel2.writeTypedList(J1);
                return true;
            case 9:
                com.google.android.gms.measurement.internal.D d3 = (com.google.android.gms.measurement.internal.D) C1505a0.a(parcel, com.google.android.gms.measurement.internal.D.CREATOR);
                String readString3 = parcel.readString();
                C1505a0.f(parcel);
                byte[] h1 = h1(d3, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(h1);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                C1505a0.f(parcel);
                F0(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                E5 e56 = (E5) C1505a0.a(parcel, E5.CREATOR);
                C1505a0.f(parcel);
                String p0 = p0(e56);
                parcel2.writeNoException();
                parcel2.writeString(p0);
                break;
            case 12:
                C3649f c3649f = (C3649f) C1505a0.a(parcel, C3649f.CREATOR);
                E5 e57 = (E5) C1505a0.a(parcel, E5.CREATOR);
                C1505a0.f(parcel);
                y0(c3649f, e57);
                parcel2.writeNoException();
                break;
            case 13:
                C3649f c3649f2 = (C3649f) C1505a0.a(parcel, C3649f.CREATOR);
                C1505a0.f(parcel);
                M0(c3649f2);
                parcel2.writeNoException();
                break;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean h2 = C1505a0.h(parcel);
                E5 e58 = (E5) C1505a0.a(parcel, E5.CREATOR);
                C1505a0.f(parcel);
                List<A5> u1 = u1(readString7, readString8, h2, e58);
                parcel2.writeNoException();
                parcel2.writeTypedList(u1);
                break;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean h3 = C1505a0.h(parcel);
                C1505a0.f(parcel);
                List<A5> Z = Z(readString9, readString10, readString11, h3);
                parcel2.writeNoException();
                parcel2.writeTypedList(Z);
                break;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                E5 e59 = (E5) C1505a0.a(parcel, E5.CREATOR);
                C1505a0.f(parcel);
                List<C3649f> F = F(readString12, readString13, e59);
                parcel2.writeNoException();
                parcel2.writeTypedList(F);
                break;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                C1505a0.f(parcel);
                List<C3649f> J0 = J0(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(J0);
                break;
            case 18:
                E5 e510 = (E5) C1505a0.a(parcel, E5.CREATOR);
                C1505a0.f(parcel);
                I(e510);
                parcel2.writeNoException();
                break;
            case 19:
                Bundle bundle = (Bundle) C1505a0.a(parcel, Bundle.CREATOR);
                E5 e511 = (E5) C1505a0.a(parcel, E5.CREATOR);
                C1505a0.f(parcel);
                g0(bundle, e511);
                parcel2.writeNoException();
                break;
            case 20:
                E5 e512 = (E5) C1505a0.a(parcel, E5.CREATOR);
                C1505a0.f(parcel);
                f0(e512);
                parcel2.writeNoException();
                break;
            case 21:
                E5 e513 = (E5) C1505a0.a(parcel, E5.CREATOR);
                C1505a0.f(parcel);
                C2053a k1 = k1(e513);
                parcel2.writeNoException();
                C1505a0.g(parcel2, k1);
                break;
            case 24:
                E5 e514 = (E5) C1505a0.a(parcel, E5.CREATOR);
                Bundle bundle2 = (Bundle) C1505a0.a(parcel, Bundle.CREATOR);
                C1505a0.f(parcel);
                List<C3669h5> B1 = B1(e514, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(B1);
                break;
            case 25:
                E5 e515 = (E5) C1505a0.a(parcel, E5.CREATOR);
                C1505a0.f(parcel);
                U1(e515);
                parcel2.writeNoException();
                break;
            case 26:
                E5 e516 = (E5) C1505a0.a(parcel, E5.CREATOR);
                C1505a0.f(parcel);
                h0(e516);
                parcel2.writeNoException();
                break;
        }
        return true;
    }
}
