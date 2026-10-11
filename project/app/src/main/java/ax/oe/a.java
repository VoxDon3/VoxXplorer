/*
 * Decompiled with CFR 0.152.
 */
package ax.oe;

import android.os.IBinder;
import android.os.Parcel;
import ax.ne.i;
import ax.ne.o;

public class a {
    private static boolean a;

    public static boolean a(String string) {
        IBinder iBinder = ax.oe.a.c();
        if (iBinder != null) {
            i.E(iBinder, string);
            a = true;
            return true;
        }
        a = false;
        return false;
    }

    public static boolean b() {
        return a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static IBinder c() {
        IBinder iBinder = o.a("activity");
        if (iBinder == null) {
            return null;
        }
        Parcel parcel = Parcel.obtain();
        Parcel parcel2 = Parcel.obtain();
        try {
            parcel.writeInterfaceToken("android.app.IActivityManager");
            parcel.writeInt(2);
            iBinder.transact(1599296841, parcel, parcel2, 0);
            parcel2.readException();
            iBinder = parcel2.readStrongBinder();
            if (iBinder == null) return null;
        }
        catch (Throwable throwable) {
            try {
                throwable.printStackTrace();
                return null;
            }
            finally {
                parcel.recycle();
                parcel2.recycle();
            }
        }
        parcel.recycle();
        parcel2.recycle();
        return iBinder;
    }
}

