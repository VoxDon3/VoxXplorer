package ax.N1;

import android.os.Bundle;
import android.os.Parcel;
import ax.S0.C0968a;
import ax.S0.C0974g;
import ax.q7.InterfaceC2879f;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {
    public e a(long j, byte[] bArr, int i, int i2) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, i, i2);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return new e(C0974g.b(new InterfaceC2879f() { // from class: ax.N1.a
            @Override // ax.q7.InterfaceC2879f
            public final Object apply(Object obj) {
                return ax.R0.a.b((Bundle) obj);
            }
        }, (ArrayList) C0968a.e(readBundle.getParcelableArrayList("c"))), j, readBundle.getLong(ax.ba.d.d));
    }
}
