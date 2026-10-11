/*
 * Decompiled with CFR 0.152.
 */
package ax.X5;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class d {
    static {
        d.class.getClassLoader();
    }

    private d() {
    }

    public static Parcelable a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable)creator.createFromParcel(parcel);
    }

    public static void b(Parcel object) {
        int n8 = object.dataAvail();
        if (n8 <= 0) {
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Parcel data not fully consumed, unread size: ");
        ((StringBuilder)object).append(n8);
        throw new BadParcelableException(((StringBuilder)object).toString());
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void d(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface.asBinder());
    }
}

