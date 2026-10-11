package ax.Xd;

/* loaded from: classes3.dex */
public final /* synthetic */ class c {
    public static boolean a(d dVar, ax.Yd.b bVar) {
        int h = bVar.h();
        if (h == 0) {
            return dVar.o();
        }
        if (h == 10) {
            return dVar.e();
        }
        if (h == 20) {
            return dVar.l();
        }
        if (h == 30) {
            return dVar.c();
        }
        if (h == 40) {
            return dVar.j();
        }
        throw new IllegalArgumentException("Level [" + bVar + "] not recognized.");
    }
}
