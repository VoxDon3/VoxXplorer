package ax.D5;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import ax.W5.AbstractBinderC1052n0;
import java.io.IOException;

/* loaded from: classes3.dex */
final class g implements h {
    final /* synthetic */ String a;
    final /* synthetic */ Bundle b;

    g(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // ax.D5.h
    public final /* bridge */ /* synthetic */ Object a(IBinder iBinder) throws RemoteException, IOException, a {
        Bundle p1 = AbstractBinderC1052n0.w(iBinder).p1(this.a, this.b);
        i.g(p1);
        String string = p1.getString("Error");
        if (p1.getBoolean("booleanResult")) {
            return null;
        }
        throw new a(string);
    }
}
