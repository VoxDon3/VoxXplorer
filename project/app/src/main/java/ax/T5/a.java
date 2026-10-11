/*
 * Decompiled with CFR 0.152.
 */
package ax.T5;

import android.os.IBinder;
import android.os.IInterface;
import ax.T5.c;
import ax.Z5.b;

public interface a
extends IInterface {

    public static abstract class a
    extends b
    implements a {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a w(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (iInterface instanceof a) {
                return (a)iInterface;
            }
            return new c(iBinder);
        }
    }
}

