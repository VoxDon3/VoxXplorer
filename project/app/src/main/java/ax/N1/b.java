/*
 * Decompiled with CFR 0.152.
 */
package ax.N1;

import android.os.Bundle;
import android.os.Parcel;
import ax.N1.a;
import ax.N1.e;
import ax.S0.g;
import java.util.List;

public final class b {
    public e a(long l8, byte[] object, int n8, int n9) {
        Object object2 = Parcel.obtain();
        object2.unmarshall(object, n8, n9);
        object2.setDataPosition(0);
        object = object2.readBundle(Bundle.class.getClassLoader());
        object2.recycle();
        object2 = ax.S0.a.e(object.getParcelableArrayList("c"));
        return new e(g.b(new a(), (List<Bundle>)object2), l8, object.getLong("d"));
    }
}

