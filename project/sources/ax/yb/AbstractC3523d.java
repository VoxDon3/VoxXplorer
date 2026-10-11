package ax.yb;

import ax.wb.i;

/* renamed from: ax.yb.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3523d extends AbstractC3520a {
    private final ax.wb.i c0;
    private transient ax.wb.e<Object> d0;

    public AbstractC3523d(ax.wb.e<Object> eVar, ax.wb.i iVar) {
        super(eVar);
        this.c0 = iVar;
    }

    @Override // ax.wb.e
    public ax.wb.i b() {
        ax.wb.i iVar = this.c0;
        ax.Gb.l.c(iVar);
        return iVar;
    }

    @Override // ax.yb.AbstractC3520a
    protected void q() {
        ax.wb.e<?> eVar = this.d0;
        if (eVar != null && eVar != this) {
            i.b a = b().a(ax.wb.f.b0);
            ax.Gb.l.c(a);
            ((ax.wb.f) a).s0(eVar);
        }
        this.d0 = C3522c.q;
    }

    public final ax.wb.e<Object> t() {
        ax.wb.e<Object> eVar = this.d0;
        if (eVar == null) {
            ax.wb.f fVar = (ax.wb.f) b().a(ax.wb.f.b0);
            if (fVar == null || (eVar = fVar.A(this)) == null) {
                eVar = this;
            }
            this.d0 = eVar;
        }
        return eVar;
    }

    public AbstractC3523d(ax.wb.e<Object> eVar) {
        this(eVar, eVar != null ? eVar.b() : null);
    }
}
