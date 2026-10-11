package ax.mb;

/* renamed from: ax.mb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2549c extends AbstractC2550d {
    public int b;

    public C2549c(int i) {
        this.b = i;
    }

    @Override // ax.mb.AbstractC2550d
    public void a(C2547a c2547a) throws C2548b {
        this.b = c2547a.c();
    }

    @Override // ax.mb.AbstractC2550d
    public void b(C2547a c2547a) throws C2548b {
        c2547a.h(this.b);
    }
}
