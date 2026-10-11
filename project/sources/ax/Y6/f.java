package ax.Y6;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import ax.Y6.b;
import ax.a6.AbstractC1387a;
import ax.a6.C1377G;
import ax.a6.C1392c0;
import j$.util.Objects;

/* loaded from: classes3.dex */
public final class f {

    public interface a {
        void b(@RecentlyNonNull e eVar);
    }

    public interface b {
        void a(@RecentlyNonNull ax.Y6.b bVar);
    }

    public static void a(@RecentlyNonNull final Activity activity, @RecentlyNonNull final b.a aVar) {
        if (AbstractC1387a.a(activity).b().a()) {
            aVar.a(null);
            return;
        }
        C1377G c = AbstractC1387a.a(activity).c();
        C1392c0.a();
        b bVar = new b() { // from class: ax.a6.E
            @Override // ax.Y6.f.b
            public final void a(ax.Y6.b bVar2) {
                bVar2.a(activity, aVar);
            }
        };
        Objects.requireNonNull(aVar);
        c.a(bVar, new a() { // from class: ax.a6.F
            @Override // ax.Y6.f.a
            public final void b(ax.Y6.e eVar) {
                b.a.this.a(eVar);
            }
        });
    }
}
