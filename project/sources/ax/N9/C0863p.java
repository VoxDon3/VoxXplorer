package ax.N9;

import java.util.List;

/* renamed from: ax.N9.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0863p extends ax.O9.i implements U {
    public C0863p(String str, ax.M9.f fVar, List<ax.S9.c> list) {
        super(str, fVar, list);
    }

    @Override // ax.N9.U
    public U h(String str) {
        return new C0863p(d() + ":/" + str + ":", i(), null);
    }
}
