/*
 * Decompiled with CFR 0.152.
 */
package ax.f6;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import ax.b6.a0;
import ax.b6.b0;
import ax.f6.e;
import com.google.android.gms.measurement.internal.A5;
import com.google.android.gms.measurement.internal.D;
import com.google.android.gms.measurement.internal.E5;
import com.google.android.gms.measurement.internal.f;
import java.util.List;

public abstract class g
extends b0
implements e {
    public g() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override
    protected final boolean r(int n8, Parcel object, Parcel parcel, int n9) throws RemoteException {
        switch (n8) {
            default: {
                return false;
            }
            case 26: {
                E5 e52 = a0.a(object, E5.CREATOR);
                a0.f(object);
                this.h0(e52);
                parcel.writeNoException();
                break;
            }
            case 25: {
                E5 e53 = a0.a(object, E5.CREATOR);
                a0.f(object);
                this.U1(e53);
                parcel.writeNoException();
                break;
            }
            case 24: {
                E5 e54 = a0.a(object, E5.CREATOR);
                Bundle bundle = (Bundle)a0.a(object, Bundle.CREATOR);
                a0.f(object);
                object = this.B1(e54, bundle);
                parcel.writeNoException();
                parcel.writeTypedList((List)object);
                break;
            }
            case 21: {
                E5 e55 = a0.a(object, E5.CREATOR);
                a0.f(object);
                object = this.k1(e55);
                parcel.writeNoException();
                a0.g(parcel, (Parcelable)object);
                break;
            }
            case 20: {
                E5 e56 = a0.a(object, E5.CREATOR);
                a0.f(object);
                this.f0(e56);
                parcel.writeNoException();
                break;
            }
            case 19: {
                Bundle bundle = (Bundle)a0.a(object, Bundle.CREATOR);
                E5 e57 = a0.a(object, E5.CREATOR);
                a0.f(object);
                this.g0(bundle, e57);
                parcel.writeNoException();
                break;
            }
            case 18: {
                E5 e58 = a0.a(object, E5.CREATOR);
                a0.f(object);
                this.I(e58);
                parcel.writeNoException();
                break;
            }
            case 17: {
                String string = object.readString();
                String string2 = object.readString();
                String string3 = object.readString();
                a0.f(object);
                object = this.J0(string, string2, string3);
                parcel.writeNoException();
                parcel.writeTypedList((List)object);
                break;
            }
            case 16: {
                String string = object.readString();
                String string4 = object.readString();
                E5 e59 = a0.a(object, E5.CREATOR);
                a0.f(object);
                object = this.F(string, string4, e59);
                parcel.writeNoException();
                parcel.writeTypedList((List)object);
                break;
            }
            case 15: {
                String string = object.readString();
                String string5 = object.readString();
                String string6 = object.readString();
                boolean bl = a0.h(object);
                a0.f(object);
                object = this.Z(string, string5, string6, bl);
                parcel.writeNoException();
                parcel.writeTypedList((List)object);
                break;
            }
            case 14: {
                String string = object.readString();
                String string7 = object.readString();
                boolean bl = a0.h(object);
                E5 e510 = a0.a(object, E5.CREATOR);
                a0.f(object);
                object = this.u1(string, string7, bl, e510);
                parcel.writeNoException();
                parcel.writeTypedList((List)object);
                break;
            }
            case 13: {
                f f8 = a0.a(object, f.CREATOR);
                a0.f(object);
                this.M0(f8);
                parcel.writeNoException();
                break;
            }
            case 12: {
                f f9 = a0.a(object, f.CREATOR);
                E5 e511 = a0.a(object, E5.CREATOR);
                a0.f(object);
                this.y0(f9, e511);
                parcel.writeNoException();
                break;
            }
            case 11: {
                E5 e512 = a0.a(object, E5.CREATOR);
                a0.f(object);
                object = this.p0(e512);
                parcel.writeNoException();
                parcel.writeString((String)object);
                break;
            }
            case 10: {
                long l8 = object.readLong();
                String string = object.readString();
                String string8 = object.readString();
                String string9 = object.readString();
                a0.f(object);
                this.F0(l8, string, string8, string9);
                parcel.writeNoException();
                break;
            }
            case 9: {
                D d8 = a0.a(object, D.CREATOR);
                String string = object.readString();
                a0.f(object);
                object = this.h1(d8, string);
                parcel.writeNoException();
                parcel.writeByteArray((byte[])object);
                break;
            }
            case 7: {
                E5 e513 = a0.a(object, E5.CREATOR);
                boolean bl = a0.h(object);
                a0.f(object);
                object = this.J1(e513, bl);
                parcel.writeNoException();
                parcel.writeTypedList((List)object);
                break;
            }
            case 6: {
                E5 e514 = a0.a(object, E5.CREATOR);
                a0.f(object);
                this.A1(e514);
                parcel.writeNoException();
                break;
            }
            case 5: {
                D d9 = a0.a(object, D.CREATOR);
                String string = object.readString();
                String string10 = object.readString();
                a0.f(object);
                this.N(d9, string, string10);
                parcel.writeNoException();
                break;
            }
            case 4: {
                E5 e515 = a0.a(object, E5.CREATOR);
                a0.f(object);
                this.I0(e515);
                parcel.writeNoException();
                break;
            }
            case 2: {
                A5 a52 = a0.a(object, A5.CREATOR);
                E5 e516 = a0.a(object, E5.CREATOR);
                a0.f(object);
                this.P(a52, e516);
                parcel.writeNoException();
                break;
            }
            case 1: {
                D d10 = a0.a(object, D.CREATOR);
                E5 e517 = a0.a(object, E5.CREATOR);
                a0.f(object);
                this.w1(d10, e517);
                parcel.writeNoException();
            }
        }
        return true;
    }
}

