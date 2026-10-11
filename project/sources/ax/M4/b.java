package ax.M4;

import ax.M4.c;
import ax.M4.h;
import ax.p4.C2769f;
import ax.p4.C2773j;
import ax.p4.p;
import ax.v4.C3277d;
import ax.x4.AbstractC3433d;

/* loaded from: classes.dex */
public class b {
    private final AbstractC3433d a;

    public b(AbstractC3433d abstractC3433d) {
        this.a = abstractC3433d;
    }

    public c a() throws C2769f, C2773j {
        try {
            AbstractC3433d abstractC3433d = this.a;
            return (c) abstractC3433d.n(abstractC3433d.g().h(), "2/users/get_current_account", null, false, C3277d.j(), c.a.b, C3277d.j());
        } catch (p e) {
            throw new C2769f(e.e(), e.f(), "Unexpected error response for \"get_current_account\":" + e.d());
        }
    }

    public h b() throws C2769f, C2773j {
        try {
            AbstractC3433d abstractC3433d = this.a;
            return (h) abstractC3433d.n(abstractC3433d.g().h(), "2/users/get_space_usage", null, false, C3277d.j(), h.a.b, C3277d.j());
        } catch (p e) {
            throw new C2769f(e.e(), e.f(), "Unexpected error response for \"get_space_usage\":" + e.d());
        }
    }
}
