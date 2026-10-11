package ax.B7;

import android.os.Bundle;
import ax.A7.a;
import ax.e6.C1982a;

/* loaded from: classes3.dex */
final class d implements C1982a.InterfaceC0296a {
    private final /* synthetic */ a a;

    public d(a aVar) {
        this.a = aVar;
    }

    @Override // ax.f6.InterfaceC2072t
    public final void a(String str, String str2, Bundle bundle, long j) {
        a.b bVar;
        if (this.a.a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", b.c(str2));
            bVar = this.a.b;
            bVar.a(2, bundle2);
        }
    }
}
