package ax.Jb;

import ax.Gb.g;
import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class c {
    public static final a q = new a(null);
    private static final c c0 = ax.Ab.b.a.b();

    public static final class a extends c implements Serializable {
        public /* synthetic */ a(g gVar) {
            this();
        }

        @Override // ax.Jb.c
        public int b() {
            return c.c0.b();
        }

        @Override // ax.Jb.c
        public int c(int i) {
            return c.c0.c(i);
        }

        private a() {
        }
    }

    public abstract int b();

    public abstract int c(int i);
}
