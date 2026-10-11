/*
 * Decompiled with CFR 0.152.
 */
package ax.h7;

import ax.g7.a;
import ax.i7.r;
import ax.i7.w;
import ax.l7.c;
import ax.l7.e;
import java.util.Arrays;
import java.util.Collections;

public abstract class a
extends ax.g7.a {
    protected a(a a8) {
        super(a8);
    }

    public final c k() {
        return this.l().b();
    }

    public e l() {
        return (e)super.d();
    }

    public static abstract class a
    extends a.a {
        protected a(w w8, c collection, String string, String string2, r r8, boolean bl) {
            e.a a8 = new e.a((c)((Object)collection));
            collection = bl ? Arrays.asList("data", "error") : Collections.EMPTY_SET;
            super(w8, string, string2, a8.b(collection).a(), r8);
        }

        public a e(String string) {
            return (a)super.a(string);
        }

        public a f(String string) {
            return (a)super.c(string);
        }

        public a g(String string) {
            return (a)super.d(string);
        }
    }
}

