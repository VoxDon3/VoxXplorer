package ax.G0;

import android.os.Bundle;
import androidx.savedstate.a;
import ax.sb.C3077i;
import ax.sb.InterfaceC3076h;
import java.util.Map;

/* loaded from: classes.dex */
public final class q implements a.c {
    private final androidx.savedstate.a a;
    private boolean b;
    private Bundle c;
    private final InterfaceC3076h d;

    static final class a extends ax.Gb.m implements ax.Fb.a<r> {
        final /* synthetic */ v q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v vVar) {
            super(0);
            this.q = vVar;
        }

        @Override // ax.Fb.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r invoke() {
            return androidx.lifecycle.m.e(this.q);
        }
    }

    public q(androidx.savedstate.a aVar, v vVar) {
        ax.Gb.l.f(aVar, "savedStateRegistry");
        ax.Gb.l.f(vVar, "viewModelStoreOwner");
        this.a = aVar;
        this.d = C3077i.a(new a(vVar));
    }

    private final r c() {
        return (r) this.d.getValue();
    }

    @Override // androidx.savedstate.a.c
    public Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry<String, androidx.lifecycle.l> entry : c().f().entrySet()) {
            String key = entry.getKey();
            Bundle a2 = entry.getValue().c().a();
            if (!ax.Gb.l.a(a2, Bundle.EMPTY)) {
                bundle.putBundle(key, a2);
            }
        }
        this.b = false;
        return bundle;
    }

    public final Bundle b(String str) {
        ax.Gb.l.f(str, "key");
        d();
        Bundle bundle = this.c;
        Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
        Bundle bundle3 = this.c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.c;
        if (bundle4 != null && bundle4.isEmpty()) {
            this.c = null;
        }
        return bundle2;
    }

    public final void d() {
        if (this.b) {
            return;
        }
        Bundle b = this.a.b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (b != null) {
            bundle.putAll(b);
        }
        this.c = bundle;
        this.b = true;
        c();
    }
}
