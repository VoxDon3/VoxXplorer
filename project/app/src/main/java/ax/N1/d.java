/*
 * Decompiled with CFR 0.152.
 */
package ax.N1;

import android.os.Bundle;
import android.os.Parcel;
import ax.N1.c;
import ax.R0.a;
import ax.S0.g;
import java.util.List;

public final class d {
    public byte[] a(List<a> parcel, long l8) {
        parcel = g.d(parcel, new c());
        Object object = new Bundle();
        object.putParcelableArrayList("c", parcel);
        object.putLong("d", l8);
        parcel = Parcel.obtain();
        parcel.writeBundle(object);
        object = parcel.marshall();
        parcel.recycle();
        return object;
    }
}

