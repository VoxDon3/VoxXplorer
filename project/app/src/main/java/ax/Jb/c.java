/*
 * Decompiled with CFR 0.152.
 */
package ax.Jb;

import ax.Ab.b;
import ax.Gb.g;
import java.io.Serializable;

public abstract class c {
    private static final c c0;
    public static final a q;

    static {
        q = new a(null);
        c0 = b.a.b();
    }

    public abstract int b();

    public abstract int c(int var1);

    public static final class a
    extends c
    implements Serializable {
        private a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        @Override
        public int b() {
            return c0.b();
        }

        @Override
        public int c(int n8) {
            return c0.c(n8);
        }
    }
}

