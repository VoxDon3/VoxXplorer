package ax.B7;

import android.os.Bundle;
import ax.A7.a;
import ax.e6.C1982a;

/* loaded from: classes3.dex */
final class e implements C1982a.InterfaceC0296a {
    private final /* synthetic */ c a;

    public e(c cVar) {
        this.a = cVar;
    }

    @Override // ax.f6.InterfaceC2072t
    public final void a(String str, String str2, Bundle bundle, long j) {
        a.b bVar;
        if (str == null || !b.i(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j);
        bundle2.putBundle("params", bundle);
        bVar = this.a.a;
        bVar.a(3, bundle2);
    }
}
