package ax.N1;

import android.os.Bundle;
import android.os.Parcel;
import ax.S0.C0974g;
import ax.q7.InterfaceC2879f;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class d {
    public byte[] a(List<ax.R0.a> list, long j) {
        ArrayList<Bundle> d = C0974g.d(list, new InterfaceC2879f() { // from class: ax.N1.c
            @Override // ax.q7.InterfaceC2879f
            public final Object apply(Object obj) {
                return ((ax.R0.a) obj).d();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", d);
        bundle.putLong(ax.ba.d.d, j);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
