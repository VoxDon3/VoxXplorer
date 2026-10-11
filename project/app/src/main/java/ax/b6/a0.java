/*
 * Decompiled with CFR 0.152.
 */
package ax.b6;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

public class a0 {
    private static final ClassLoader a = a0.class.getClassLoader();

    private a0() {
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (T)((Parcelable)creator.createFromParcel(parcel));
    }

    public static HashMap b(Parcel parcel) {
        return parcel.readHashMap(a);
    }

    public static void c(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
            return;
        }
        parcel.writeStrongBinder(iInterface.asBinder());
    }

    public static void d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void e(Parcel parcel, boolean bl) {
        parcel.writeInt(bl ? 1 : 0);
    }

    public static void f(Parcel object) {
        int n8 = object.dataAvail();
        if (n8 <= 0) {
            return;
        }
        object = new StringBuilder("Parcel data not fully consumed, unread size: ");
        ((StringBuilder)object).append(n8);
        throw new BadParcelableException(((StringBuilder)object).toString());
    }

    public static void g(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }

    public static boolean h(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}

