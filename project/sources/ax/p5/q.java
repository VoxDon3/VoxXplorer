package ax.p5;

import ax.n5.C2580b;
import java.util.Set;

/* loaded from: classes.dex */
final class q implements ax.n5.i {
    private final Set<C2580b> a;
    private final p b;
    private final t c;

    q(Set<C2580b> set, p pVar, t tVar) {
        this.a = set;
        this.b = pVar;
        this.c = tVar;
    }

    @Override // ax.n5.i
    public <T> ax.n5.h<T> a(String str, Class<T> cls, C2580b c2580b, ax.n5.g<T, byte[]> gVar) {
        if (this.a.contains(c2580b)) {
            return new s(this.b, str, c2580b, gVar, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c2580b, this.a));
    }
}
