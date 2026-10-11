package ax.H5;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C3609c;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class o {
    private static final ax.P5.a a = new ax.P5.a("GoogleSignInCommon", new String[0]);

    public static ax.K5.h a(ax.K5.g gVar, Context context, boolean z) {
        a.a("Revoking access", new Object[0]);
        String e = c.b(context).e();
        c(context);
        return z ? f.a(e) : gVar.a(new m(gVar));
    }

    public static ax.K5.h b(ax.K5.g gVar, Context context, boolean z) {
        a.a("Signing out", new Object[0]);
        c(context);
        return z ? ax.K5.i.b(Status.g0, gVar) : gVar.a(new k(gVar));
    }

    private static void c(Context context) {
        p.a(context).b();
        Iterator<ax.K5.g> it = ax.K5.g.b().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
        C3609c.a();
    }
}
