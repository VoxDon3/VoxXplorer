package ax.U0;

import android.content.Context;
import ax.U0.g;
import ax.U0.n;

@Deprecated
/* loaded from: classes.dex */
public final class m implements g.a {
    private final Context a;
    private final z b;
    private final g.a c;

    public m(Context context, String str) {
        this(context, str, (z) null);
    }

    @Override // ax.U0.g.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public l a() {
        l lVar = new l(this.a, this.c.a());
        z zVar = this.b;
        if (zVar != null) {
            lVar.d(zVar);
        }
        return lVar;
    }

    public m(Context context, String str, z zVar) {
        this(context, zVar, new n.b().c(str));
    }

    public m(Context context, z zVar, g.a aVar) {
        this.a = context.getApplicationContext();
        this.b = zVar;
        this.c = aVar;
    }
}
