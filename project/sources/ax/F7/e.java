package ax.F7;

import android.os.Bundle;
import ax.A7.a;
import ax.G7.g;
import java.util.Locale;

/* loaded from: classes3.dex */
class e implements a.b {
    private ax.H7.b a;
    private ax.H7.b b;

    e() {
    }

    private static void b(ax.H7.b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.A(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        b("clx".equals(bundle.getString("_o")) ? this.a : this.b, str, bundle);
    }

    @Override // ax.A7.a.b
    public void a(int i, Bundle bundle) {
        String string;
        g.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle));
        if (bundle == null || (string = bundle.getString("name")) == null) {
            return;
        }
        Bundle bundle2 = bundle.getBundle("params");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        c(string, bundle2);
    }

    public void d(ax.H7.b bVar) {
        this.b = bVar;
    }

    public void e(ax.H7.b bVar) {
        this.a = bVar;
    }
}
