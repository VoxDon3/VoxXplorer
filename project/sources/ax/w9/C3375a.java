package ax.w9;

/* renamed from: ax.w9.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3375a extends C3376b {
    @Override // ax.w9.C3376b, ax.w9.f
    protected void b(ax.D8.c cVar) throws e {
        if (cVar.p().toString().contains("not_defined_in_RFC4178@please_ignore")) {
            return;
        }
        int r = cVar.r();
        if (r == 0) {
            l(cVar.p());
            return;
        }
        if (r != 1) {
            if (r == 2) {
                k(cVar.p());
                return;
            }
            if (r == 3 || r == 4) {
                return;
            }
            throw new e("Unknown Object Tag " + cVar.r() + " encountered.");
        }
    }
}
