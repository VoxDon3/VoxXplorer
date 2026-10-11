/*
 * Decompiled with CFR 0.152.
 */
package ax.N5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class b {
    public static Bundle a(Parcel parcel, int n8) {
        int n9 = b.s(parcel, n8);
        n8 = parcel.dataPosition();
        if (n9 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(n8 + n9);
        return bundle;
    }

    public static int[] b(Parcel parcel, int n8) {
        n8 = b.s(parcel, n8);
        int n9 = parcel.dataPosition();
        if (n8 == 0) {
            return null;
        }
        int[] nArray = parcel.createIntArray();
        parcel.setDataPosition(n9 + n8);
        return nArray;
    }

    public static <T extends Parcelable> T c(Parcel parcel, int n8, Parcelable.Creator<T> parcelable) {
        n8 = b.s(parcel, n8);
        int n9 = parcel.dataPosition();
        if (n8 == 0) {
            return null;
        }
        parcelable = (Parcelable)parcelable.createFromParcel(parcel);
        parcel.setDataPosition(n9 + n8);
        return (T)parcelable;
    }

    public static String d(Parcel parcel, int n8) {
        n8 = b.s(parcel, n8);
        int n9 = parcel.dataPosition();
        if (n8 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(n9 + n8);
        return string;
    }

    public static ArrayList<String> e(Parcel parcel, int n8) {
        int n9 = b.s(parcel, n8);
        n8 = parcel.dataPosition();
        if (n9 == 0) {
            return null;
        }
        ArrayList arrayList = parcel.createStringArrayList();
        parcel.setDataPosition(n8 + n9);
        return arrayList;
    }

    public static <T> T[] f(Parcel parcel, int n8, Parcelable.Creator<T> objectArray) {
        int n9 = b.s(parcel, n8);
        n8 = parcel.dataPosition();
        if (n9 == 0) {
            return null;
        }
        objectArray = parcel.createTypedArray(objectArray);
        parcel.setDataPosition(n8 + n9);
        return objectArray;
    }

    public static <T> ArrayList<T> g(Parcel parcel, int n8, Parcelable.Creator<T> object) {
        int n9 = b.s(parcel, n8);
        n8 = parcel.dataPosition();
        if (n9 == 0) {
            return null;
        }
        object = parcel.createTypedArrayList(object);
        parcel.setDataPosition(n8 + n9);
        return object;
    }

    public static void h(Parcel parcel, int n8) {
        if (parcel.dataPosition() == n8) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(n8);
        throw new a(stringBuilder.toString(), parcel);
    }

    public static int i(int n8) {
        return (char)n8;
    }

    public static boolean j(Parcel parcel, int n8) {
        b.w(parcel, n8, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean k(Parcel parcel, int n8) {
        int n9 = b.s(parcel, n8);
        if (n9 == 0) {
            return null;
        }
        b.v(parcel, n8, n9, 4);
        boolean bl = parcel.readInt() != 0;
        return bl;
    }

    public static Double l(Parcel parcel, int n8) {
        int n9 = b.s(parcel, n8);
        if (n9 == 0) {
            return null;
        }
        b.v(parcel, n8, n9, 8);
        return parcel.readDouble();
    }

    public static Float m(Parcel parcel, int n8) {
        int n9 = b.s(parcel, n8);
        if (n9 == 0) {
            return null;
        }
        b.v(parcel, n8, n9, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int n(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder o(Parcel parcel, int n8) {
        n8 = b.s(parcel, n8);
        int n9 = parcel.dataPosition();
        if (n8 == 0) {
            return null;
        }
        IBinder iBinder = parcel.readStrongBinder();
        parcel.setDataPosition(n9 + n8);
        return iBinder;
    }

    public static int p(Parcel parcel, int n8) {
        b.w(parcel, n8, 4);
        return parcel.readInt();
    }

    public static long q(Parcel parcel, int n8) {
        b.w(parcel, n8, 8);
        return parcel.readLong();
    }

    public static Long r(Parcel parcel, int n8) {
        int n9 = b.s(parcel, n8);
        if (n9 == 0) {
            return null;
        }
        b.v(parcel, n8, n9, 8);
        return parcel.readLong();
    }

    public static int s(Parcel parcel, int n8) {
        if ((n8 & 0xFFFF0000) != -65536) {
            return (char)(n8 >> 16);
        }
        return parcel.readInt();
    }

    public static void t(Parcel parcel, int n8) {
        n8 = b.s(parcel, n8);
        parcel.setDataPosition(parcel.dataPosition() + n8);
    }

    public static int u(Parcel parcel) {
        int n8 = b.n(parcel);
        int n9 = b.s(parcel, n8);
        int n10 = b.i(n8);
        int n11 = parcel.dataPosition();
        if (n10 == 20293) {
            if ((n9 += n11) >= n11 && n9 <= parcel.dataSize()) {
                return n9;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Size read is invalid start=");
            stringBuilder.append(n11);
            stringBuilder.append(" end=");
            stringBuilder.append(n9);
            throw new a(stringBuilder.toString(), parcel);
        }
        throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(n8))), parcel);
    }

    private static void v(Parcel parcel, int n8, int n9, int n10) {
        if (n9 == n10) {
            return;
        }
        String string = Integer.toHexString(n9);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected size ");
        stringBuilder.append(n10);
        stringBuilder.append(" got ");
        stringBuilder.append(n9);
        stringBuilder.append(" (0x");
        stringBuilder.append(string);
        stringBuilder.append(")");
        throw new a(stringBuilder.toString(), parcel);
    }

    private static void w(Parcel parcel, int n8, int n9) {
        if ((n8 = b.s(parcel, n8)) == n9) {
            return;
        }
        String string = Integer.toHexString(n8);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected size ");
        stringBuilder.append(n9);
        stringBuilder.append(" got ");
        stringBuilder.append(n8);
        stringBuilder.append(" (0x");
        stringBuilder.append(string);
        stringBuilder.append(")");
        throw new a(stringBuilder.toString(), parcel);
    }

    public static class a
    extends RuntimeException {
        public a(String string, Parcel object) {
            int n8 = object.dataPosition();
            int n9 = object.dataSize();
            object = new StringBuilder();
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(" Parcel: pos=");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(" size=");
            ((StringBuilder)object).append(n9);
            super(((StringBuilder)object).toString());
        }
    }
}

