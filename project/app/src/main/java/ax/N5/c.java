/*
 * Decompiled with CFR 0.152.
 */
package ax.N5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class c {
    public static int a(Parcel parcel) {
        return c.r(parcel, 20293);
    }

    public static void b(Parcel parcel, int n8) {
        c.s(parcel, n8);
    }

    public static void c(Parcel parcel, int n8, boolean bl) {
        c.t(parcel, n8, 4);
        parcel.writeInt(bl ? 1 : 0);
    }

    public static void d(Parcel parcel, int n8, Boolean bl, boolean bl2) {
        if (bl == null) {
            if (bl2) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        c.t(parcel, n8, 4);
        parcel.writeInt(bl.booleanValue() ? 1 : 0);
    }

    public static void e(Parcel parcel, int n8, Bundle bundle, boolean bl) {
        if (bundle == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        n8 = c.r(parcel, n8);
        parcel.writeBundle(bundle);
        c.s(parcel, n8);
    }

    public static void f(Parcel parcel, int n8, Double d8, boolean bl) {
        if (d8 == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        c.t(parcel, n8, 8);
        parcel.writeDouble(d8.doubleValue());
    }

    public static void g(Parcel parcel, int n8, Float f8, boolean bl) {
        if (f8 == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        c.t(parcel, n8, 4);
        parcel.writeFloat(f8.floatValue());
    }

    public static void h(Parcel parcel, int n8, IBinder iBinder, boolean bl) {
        if (iBinder == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        n8 = c.r(parcel, n8);
        parcel.writeStrongBinder(iBinder);
        c.s(parcel, n8);
    }

    public static void i(Parcel parcel, int n8, int n9) {
        c.t(parcel, n8, 4);
        parcel.writeInt(n9);
    }

    public static void j(Parcel parcel, int n8, int[] nArray, boolean bl) {
        if (nArray == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        n8 = c.r(parcel, n8);
        parcel.writeIntArray(nArray);
        c.s(parcel, n8);
    }

    public static void k(Parcel parcel, int n8, long l8) {
        c.t(parcel, n8, 8);
        parcel.writeLong(l8);
    }

    public static void l(Parcel parcel, int n8, Long l8, boolean bl) {
        if (l8 == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        c.t(parcel, n8, 8);
        parcel.writeLong(l8.longValue());
    }

    public static void m(Parcel parcel, int n8, Parcelable parcelable, int n9, boolean bl) {
        if (parcelable == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        n8 = c.r(parcel, n8);
        parcelable.writeToParcel(parcel, n9);
        c.s(parcel, n8);
    }

    public static void n(Parcel parcel, int n8, String string, boolean bl) {
        if (string == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        n8 = c.r(parcel, n8);
        parcel.writeString(string);
        c.s(parcel, n8);
    }

    public static void o(Parcel parcel, int n8, List<String> list, boolean bl) {
        if (list == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        n8 = c.r(parcel, n8);
        parcel.writeStringList(list);
        c.s(parcel, n8);
    }

    public static <T extends Parcelable> void p(Parcel parcel, int n8, T[] TArray, int n9, boolean bl) {
        if (TArray == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        int n10 = c.r(parcel, n8);
        int n11 = TArray.length;
        parcel.writeInt(n11);
        for (n8 = 0; n8 < n11; ++n8) {
            T t8 = TArray[n8];
            if (t8 == null) {
                parcel.writeInt(0);
                continue;
            }
            c.u(parcel, t8, n9);
        }
        c.s(parcel, n10);
    }

    public static <T extends Parcelable> void q(Parcel parcel, int n8, List<T> list, boolean bl) {
        if (list == null) {
            if (bl) {
                c.t(parcel, n8, 0);
            }
            return;
        }
        int n9 = c.r(parcel, n8);
        int n10 = list.size();
        parcel.writeInt(n10);
        for (n8 = 0; n8 < n10; ++n8) {
            Parcelable parcelable = (Parcelable)list.get(n8);
            if (parcelable == null) {
                parcel.writeInt(0);
                continue;
            }
            c.u(parcel, parcelable, 0);
        }
        c.s(parcel, n9);
    }

    private static int r(Parcel parcel, int n8) {
        parcel.writeInt(n8 | 0xFFFF0000);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void s(Parcel parcel, int n8) {
        int n9 = parcel.dataPosition();
        parcel.setDataPosition(n8 - 4);
        parcel.writeInt(n9 - n8);
        parcel.setDataPosition(n9);
    }

    private static void t(Parcel parcel, int n8, int n9) {
        parcel.writeInt(n8 | n9 << 16);
    }

    private static void u(Parcel parcel, Parcelable parcelable, int n8) {
        int n9 = parcel.dataPosition();
        parcel.writeInt(1);
        int n10 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, n8);
        n8 = parcel.dataPosition();
        parcel.setDataPosition(n9);
        parcel.writeInt(n8 - n10);
        parcel.setDataPosition(n8);
    }
}

