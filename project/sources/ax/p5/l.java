package ax.p5;

import android.annotation.SuppressLint;
import ax.t5.C3102a;

/* loaded from: classes.dex */
public final class l {
    @SuppressLint({"DiscouragedApi"})
    public static void a(ax.n5.h<?> hVar, ax.n5.e eVar) {
        if (!(hVar instanceof s)) {
            C3102a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", hVar);
        } else {
            u.c().e().l(((s) hVar).d().f(eVar), 1);
        }
    }
}
