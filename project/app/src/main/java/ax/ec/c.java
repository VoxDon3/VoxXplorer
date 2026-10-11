/*
 * Decompiled with CFR 0.152.
 */
package ax.ec;

import ax.cc.d;
import ax.jc.i;
import ax.kc.g;

public interface c {

    public static class a
    implements c {
        private d.a a;
        private i b;
        private g c;
        private ax.kc.c d;

        public static final a a() {
            return new a().f(new i()).g(new d.a()).h(new g()).i(new ax.kc.i());
        }

        public i b() {
            return this.b;
        }

        public d.a c() {
            return this.a;
        }

        public g d() {
            return this.c;
        }

        public ax.kc.c e() {
            return this.d;
        }

        public a f(i i8) {
            this.b = i8;
            return this;
        }

        public a g(d.a a8) {
            this.a = a8;
            return this;
        }

        public a h(g g8) {
            this.c = g8;
            return this;
        }

        public a i(ax.kc.c c8) {
            this.d = c8;
            return this;
        }
    }
}

