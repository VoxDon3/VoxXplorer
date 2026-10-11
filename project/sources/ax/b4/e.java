package ax.b4;

import ax.P3.p;

/* loaded from: classes.dex */
public class e extends ax.Z3.a<c> implements p {
    public e(c cVar) {
        super(cVar);
    }

    @Override // ax.P3.p
    public void a() {
        ((c) this.q).d().prepareToDraw();
    }

    @Override // ax.P3.s
    public Class<c> b() {
        return c.class;
    }

    @Override // ax.P3.s
    public int getSize() {
        return ((c) this.q).h();
    }

    @Override // ax.P3.s
    public void recycle() {
        ((c) this.q).stop();
        ((c) this.q).i();
    }
}
