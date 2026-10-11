package ax.oe;

import android.os.IBinder;
import android.os.Parcel;
import ax.ne.i;
import ax.ne.o;

/* loaded from: classes3.dex */
public class a {
    private static boolean a;

    public static boolean a(String str) {
        IBinder c = c();
        if (c == null) {
            a = false;
            return false;
        }
        i.E(c, str);
        a = true;
        return true;
    }

    public static boolean b() {
        return a;
    }

    private static IBinder c() {
        IBinder a2 = o.a("activity");
        if (a2 == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.app.IActivityManager");
            obtain.writeInt(2);
            a2.transact(1599296841, obtain, obtain2, 0);
            obtain2.readException();
            IBinder readStrongBinder = obtain2.readStrongBinder();
            if (readStrongBinder != null) {
                return readStrongBinder;
            }
        } finally {
            try {
                return null;
            } finally {
            }
        }
        return null;
    }
}
