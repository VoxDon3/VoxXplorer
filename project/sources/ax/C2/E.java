package ax.C2;

import android.content.Context;
import ax.l2.AbstractC2464b;

/* loaded from: classes.dex */
public final class E extends AbstractC2464b {
    private final Context c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(Context context) {
        super(9, 10);
        ax.Gb.l.f(context, "context");
        this.c = context;
    }

    @Override // ax.l2.AbstractC2464b
    public void a(ax.o2.g gVar) {
        ax.Gb.l.f(gVar, "db");
        gVar.C("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        ax.L2.s.c(this.c, gVar);
        ax.L2.l.c(this.c, gVar);
    }
}
