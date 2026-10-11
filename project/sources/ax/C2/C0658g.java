package ax.C2;

import ax.l2.AbstractC2464b;

/* renamed from: ax.C2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0658g extends AbstractC2464b {
    public static final C0658g c = new C0658g();

    private C0658g() {
        super(12, 13);
    }

    @Override // ax.l2.AbstractC2464b
    public void a(ax.o2.g gVar) {
        ax.Gb.l.f(gVar, "db");
        gVar.C("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        gVar.C("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
