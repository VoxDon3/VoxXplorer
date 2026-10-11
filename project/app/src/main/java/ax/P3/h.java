/*
 * Decompiled with CFR 0.152.
 */
package ax.P3;

import ax.M3.a;
import ax.M3.c;

public abstract class h {
    public static final h a = new h(){

        @Override
        public boolean a() {
            return true;
        }

        @Override
        public boolean b() {
            return true;
        }

        @Override
        public boolean c(a a8) {
            return a8 == ax.M3.a.c0;
        }

        @Override
        public boolean d(boolean bl, a a8, c c8) {
            return a8 != ax.M3.a.e0 && a8 != ax.M3.a.f0;
        }
    };
    public static final h b = new h(){

        @Override
        public boolean a() {
            return false;
        }

        @Override
        public boolean b() {
            return false;
        }

        @Override
        public boolean c(a a8) {
            return false;
        }

        @Override
        public boolean d(boolean bl, a a8, c c8) {
            return false;
        }
    };
    public static final h c = new h(){

        @Override
        public boolean a() {
            return true;
        }

        @Override
        public boolean b() {
            return false;
        }

        @Override
        public boolean c(a a8) {
            return a8 != ax.M3.a.d0 && a8 != ax.M3.a.f0;
        }

        @Override
        public boolean d(boolean bl, a a8, c c8) {
            return false;
        }
    };
    public static final h d = new h(){

        @Override
        public boolean a() {
            return false;
        }

        @Override
        public boolean b() {
            return true;
        }

        @Override
        public boolean c(a a8) {
            return false;
        }

        @Override
        public boolean d(boolean bl, a a8, c c8) {
            return a8 != ax.M3.a.e0 && a8 != ax.M3.a.f0;
        }
    };
    public static final h e = new h(){

        @Override
        public boolean a() {
            return true;
        }

        @Override
        public boolean b() {
            return true;
        }

        @Override
        public boolean c(a a8) {
            return a8 == ax.M3.a.c0;
        }

        @Override
        public boolean d(boolean bl, a a8, c c8) {
            return (bl && a8 == ax.M3.a.d0 || a8 == ax.M3.a.q) && c8 == ax.M3.c.c0;
        }
    };

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(a var1);

    public abstract boolean d(boolean var1, a var2, c var3);
}

