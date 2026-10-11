/*
 * Decompiled with CFR 0.152.
 */
package ax.q7;

import ax.q7.n;
import ax.q7.o;

public abstract class d
implements o<Character> {
    protected d() {
    }

    public static d d(char c8) {
        return new b(c8);
    }

    public static d f() {
        return d.c0;
    }

    private static String g(char c8) {
        char[] cArray = new char[6];
        char c9 = '\u0000';
        cArray[0] = 92;
        cArray[1] = 117;
        cArray[2] = '\u0000';
        cArray[3] = '\u0000';
        cArray[4] = '\u0000';
        cArray[5] = '\u0000';
        char c10 = c8;
        for (c8 = c9; c8 < '\u0004'; c8 = (char)(c8 + 1)) {
            cArray[5 - c8] = "0123456789ABCDEF".charAt(c10 & 0xF);
            c10 = (char)(c10 >> 4);
        }
        return String.copyValueOf(cArray);
    }

    @Deprecated
    public boolean b(Character c8) {
        return this.e(c8.charValue());
    }

    public int c(CharSequence charSequence, int n8) {
        int n9 = charSequence.length();
        n.q(n8, n9);
        while (n8 < n9) {
            if (this.e(charSequence.charAt(n8))) {
                return n8;
            }
            ++n8;
        }
        return -1;
    }

    public abstract boolean e(char var1);

    static abstract class a
    extends d {
        a() {
        }
    }

    private static final class b
    extends a {
        private final char q;

        b(char c8) {
            this.q = c8;
        }

        @Override
        public boolean e(char c8) {
            return c8 == this.q;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CharMatcher.is('");
            stringBuilder.append(d.g(this.q));
            stringBuilder.append("')");
            return stringBuilder.toString();
        }
    }

    static abstract class c
    extends a {
        private final String q;

        c(String string) {
            this.q = n.n(string);
        }

        public final String toString() {
            return this.q;
        }
    }

    private static final class d
    extends c {
        static final d c0 = new d();

        private d() {
            super("CharMatcher.none()");
        }

        @Override
        public int c(CharSequence charSequence, int n8) {
            n.q(n8, charSequence.length());
            return -1;
        }

        @Override
        public boolean e(char c8) {
            return false;
        }
    }
}

