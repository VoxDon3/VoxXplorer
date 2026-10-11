package ax.s9;

import ax.N8.v;
import ax.N8.w;
import ax.N8.x;
import ax.Q8.F;

/* renamed from: ax.s9.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3065b extends g<C3066c> {
    protected final ax.Xd.d g0;

    AbstractC3065b(ax.Q8.i iVar, C3066c c3066c, ax.k9.e eVar) {
        super(iVar, eVar, c3066c);
        this.g0 = ax.Xd.f.k(getClass());
    }

    public void A(String str, boolean z) throws F {
        W(str, z, 0L);
    }

    public void W(String str, boolean z, long j) throws F {
        o0(new w(z, j, str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC3065b abstractC3065b = (AbstractC3065b) obj;
        ax.k9.e eVar = this.e0;
        if (eVar == null) {
            if (abstractC3065b.e0 != null) {
                return false;
            }
        } else if (!eVar.equals(abstractC3065b.e0)) {
            return false;
        }
        S s = this.c0;
        if (s == 0) {
            if (abstractC3065b.c0 != 0) {
                return false;
            }
        } else if (!((C3066c) s).equals(abstractC3065b.c0)) {
            return false;
        }
        return true;
    }

    public void g() {
        ((C3066c) this.c0).F0(this.d0);
    }

    public int hashCode() {
        ax.k9.e eVar = this.e0;
        int hashCode = ((eVar == null ? 0 : eVar.hashCode()) + 31) * 31;
        S s = this.c0;
        return hashCode + (s != 0 ? ((C3066c) s).hashCode() : 0);
    }

    public <F extends x> void o0(F f) {
        ((C3066c) this.c0).j1(this.d0, f);
    }

    public C3066c p() {
        return (C3066c) this.c0;
    }

    public ax.N8.c q() throws F {
        return (ax.N8.c) u(ax.N8.c.class);
    }

    public <F extends v> F u(Class<F> cls) throws F {
        return (F) ((C3066c) this.c0).M0(this.d0, cls);
    }
}
