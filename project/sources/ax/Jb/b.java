package ax.Jb;

import ax.Gb.l;
import java.util.Random;

/* loaded from: classes3.dex */
public final class b extends ax.Jb.a {
    private final a d0 = new a();

    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // ax.Jb.a
    public Random d() {
        Random random = this.d0.get();
        l.e(random, "get(...)");
        return random;
    }
}
