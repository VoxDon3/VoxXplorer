/*
 * Decompiled with CFR 0.152.
 */
package ax.Sb;

import ax.Sb.m;
import ax.Sb.n;
import ax.Vb.G;

public interface d<E>
extends n<E>,
m<E> {
    public static final a a = ax.Sb.d$a.a;

    public static final class a {
        static final a a = new a();
        private static final int b = G.b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 0x7FFFFFFE);

        private a() {
        }

        public final int a() {
            return b;
        }
    }
}

