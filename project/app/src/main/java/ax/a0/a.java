/*
 * Decompiled with CFR 0.152.
 */
package ax.a0;

import android.text.SpannableStringBuilder;
import ax.a0.t;
import ax.a0.u;
import ax.a0.v;
import java.util.Locale;

public final class a {
    static final t d;
    private static final String e;
    private static final String f;
    static final a g;
    static final a h;
    private final boolean a;
    private final int b;
    private final t c;

    static {
        t t8;
        d = t8 = u.c;
        e = Character.toString('\u200e');
        f = Character.toString('\u200f');
        g = new a(false, 2, t8);
        h = new a(true, 2, t8);
    }

    a(boolean bl, int n8, t t8) {
        this.a = bl;
        this.b = n8;
        this.c = t8;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new a().a();
    }

    static boolean e(Locale locale) {
        return v.a(locale) == 1;
    }

    private String f(CharSequence charSequence, t t8) {
        boolean bl = t8.a(charSequence, 0, charSequence.length());
        if (!this.a && (bl || ax.a0.a.b(charSequence) == 1)) {
            return e;
        }
        if (this.a && (!bl || ax.a0.a.b(charSequence) == -1)) {
            return f;
        }
        return "";
    }

    private String g(CharSequence charSequence, t t8) {
        boolean bl = t8.a(charSequence, 0, charSequence.length());
        if (!this.a && (bl || ax.a0.a.a(charSequence) == 1)) {
            return e;
        }
        if (this.a && (!bl || ax.a0.a.a(charSequence) == -1)) {
            return f;
        }
        return "";
    }

    public boolean d() {
        return (this.b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return this.i(charSequence, this.c, true);
    }

    public CharSequence i(CharSequence charSequence, t t8, boolean bl) {
        if (charSequence == null) {
            return null;
        }
        boolean bl2 = t8.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.d() && bl) {
            t8 = bl2 ? u.b : u.a;
            spannableStringBuilder.append((CharSequence)this.g(charSequence, t8));
        }
        if (bl2 != this.a) {
            char c8 = bl2 ? (char)'\u202b' : '\u202a';
            spannableStringBuilder.append(c8);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append('\u202c');
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (bl) {
            t8 = bl2 ? u.b : u.a;
            spannableStringBuilder.append((CharSequence)this.f(charSequence, t8));
        }
        return spannableStringBuilder;
    }

    public String j(String string) {
        return this.k(string, this.c, true);
    }

    public String k(String string, t t8, boolean bl) {
        if (string == null) {
            return null;
        }
        return this.i(string, t8, bl).toString();
    }

    public static final class a {
        private boolean a;
        private int b;
        private t c;

        public a() {
            this.c(ax.a0.a.e(Locale.getDefault()));
        }

        private static a b(boolean bl) {
            if (bl) {
                return h;
            }
            return g;
        }

        private void c(boolean bl) {
            this.a = bl;
            this.c = d;
            this.b = 2;
        }

        public a a() {
            if (this.b == 2 && this.c == d) {
                return ax.a0.a$a.b(this.a);
            }
            return new a(this.a, this.b, this.c);
        }
    }

    private static class b {
        private static final byte[] f = new byte[1792];
        private final CharSequence a;
        private final boolean b;
        private final int c;
        private int d;
        private char e;

        static {
            for (int i8 = 0; i8 < 1792; ++i8) {
                ax.a0.a$b.f[i8] = Character.getDirectionality(i8);
            }
        }

        b(CharSequence charSequence, boolean bl) {
            this.a = charSequence;
            this.b = bl;
            this.c = charSequence.length();
        }

        private static byte c(char c8) {
            if (c8 < '\u0700') {
                return f[c8];
            }
            return Character.getDirectionality(c8);
        }

        private byte f() {
            int n8;
            int n9 = this.d;
            while ((n8 = this.d) > 0) {
                char c8;
                CharSequence charSequence = this.a;
                this.d = --n8;
                this.e = c8 = charSequence.charAt(n8);
                if (c8 == '&') {
                    return 12;
                }
                if (c8 != ';') continue;
            }
            this.d = n9;
            this.e = (char)59;
            return 13;
        }

        private byte g() {
            int n8;
            while ((n8 = this.d) < this.c) {
                char c8;
                CharSequence charSequence = this.a;
                this.d = n8 + 1;
                this.e = c8 = charSequence.charAt(n8);
                if (c8 != ';') continue;
            }
            return 12;
        }

        private byte h() {
            int n8;
            int n9 = this.d;
            block0: while ((n8 = this.d) > 0) {
                char c8;
                CharSequence charSequence = this.a;
                this.d = --n8;
                this.e = c8 = charSequence.charAt(n8);
                if (c8 == '<') {
                    return 12;
                }
                if (c8 == '>') break;
                if (c8 != '\"' && c8 != '\'') continue;
                while ((n8 = this.d) > 0) {
                    char c9;
                    charSequence = this.a;
                    this.d = --n8;
                    this.e = c9 = charSequence.charAt(n8);
                    if (c9 == c8) continue block0;
                }
            }
            this.d = n9;
            this.e = (char)62;
            return 13;
        }

        private byte i() {
            int n8;
            int n9 = this.d;
            block0: while ((n8 = this.d) < this.c) {
                char c8;
                CharSequence charSequence = this.a;
                this.d = n8 + 1;
                this.e = c8 = charSequence.charAt(n8);
                if (c8 == '>') {
                    return 12;
                }
                if (c8 != '\"' && c8 != '\'') continue;
                while ((n8 = this.d) < this.c) {
                    char c9;
                    charSequence = this.a;
                    this.d = n8 + 1;
                    this.e = c9 = charSequence.charAt(n8);
                    if (c9 == c8) continue block0;
                }
            }
            this.d = n9;
            this.e = (char)60;
            return 13;
        }

        byte a() {
            byte by;
            char c8;
            this.e = c8 = this.a.charAt(this.d - 1);
            if (Character.isLowSurrogate(c8)) {
                int n8 = Character.codePointBefore(this.a, this.d);
                this.d -= Character.charCount(n8);
                return Character.getDirectionality(n8);
            }
            --this.d;
            byte by2 = by = ax.a0.a$b.c(this.e);
            if (this.b) {
                char c9 = this.e;
                if (c9 == '>') {
                    return this.h();
                }
                by2 = by;
                if (c9 == ';') {
                    by2 = this.f();
                }
            }
            return by2;
        }

        byte b() {
            byte by;
            char c8;
            this.e = c8 = this.a.charAt(this.d);
            if (Character.isHighSurrogate(c8)) {
                int n8 = Character.codePointAt(this.a, this.d);
                this.d += Character.charCount(n8);
                return Character.getDirectionality(n8);
            }
            ++this.d;
            byte by2 = by = ax.a0.a$b.c(this.e);
            if (this.b) {
                char c9 = this.e;
                if (c9 == '<') {
                    return this.i();
                }
                by2 = by;
                if (c9 == '&') {
                    by2 = this.g();
                }
            }
            return by2;
        }

        /*
         * Enabled aggressive block sorting
         */
        int d() {
            this.d = 0;
            int n8 = 0;
            int n9 = 0;
            int n10 = 0;
            while (this.d < this.c && n8 == 0) {
                block19: {
                    block17: {
                        block18: {
                            byte by = this.b();
                            if (by == 0) break block17;
                            if (by == 1 || by == 2) break block18;
                            if (by == 9) continue;
                            switch (by) {
                                default: {
                                    break block19;
                                }
                                case 18: {
                                    --n10;
                                    n9 = 0;
                                    break;
                                }
                                case 16: 
                                case 17: {
                                    ++n10;
                                    n9 = 1;
                                    break;
                                }
                                case 14: 
                                case 15: {
                                    ++n10;
                                    n9 = -1;
                                    break;
                                }
                            }
                            continue;
                        }
                        if (n10 == 0) {
                            return 1;
                        }
                        break block19;
                    }
                    if (n10 == 0) {
                        return -1;
                    }
                }
                n8 = n10;
            }
            if (n8 == 0) {
                return 0;
            }
            if (n9 != 0) {
                return n9;
            }
            block11: while (this.d > 0) {
                switch (this.a()) {
                    default: {
                        continue block11;
                    }
                    case 18: {
                        ++n10;
                        continue block11;
                    }
                    case 16: 
                    case 17: {
                        if (n8 != n10) break;
                        return 1;
                    }
                    case 14: 
                    case 15: {
                        if (n8 != n10) break;
                        return -1;
                    }
                }
                --n10;
            }
            return 0;
        }

        /*
         * Enabled aggressive block sorting
         */
        int e() {
            this.d = this.c;
            int n8 = 0;
            int n9 = 0;
            block5: while (true) {
                block11: {
                    block9: {
                        block10: {
                            if (this.d <= 0) {
                                return 0;
                            }
                            byte by = this.a();
                            if (by == 0) break block9;
                            if (by == 1 || by == 2) break block10;
                            if (by == 9) continue;
                            switch (by) {
                                default: {
                                    if (n9 != 0) continue block5;
                                    break block11;
                                }
                                case 18: {
                                    ++n8;
                                    continue block5;
                                }
                                case 16: 
                                case 17: {
                                    if (n9 != n8) break;
                                    return 1;
                                }
                                case 14: 
                                case 15: {
                                    if (n9 != n8) break;
                                    return -1;
                                }
                            }
                            --n8;
                            continue;
                        }
                        if (n8 == 0) {
                            return 1;
                        }
                        if (n9 != 0) continue;
                        break block11;
                    }
                    if (n8 == 0) {
                        return -1;
                    }
                    if (n9 != 0) continue;
                }
                n9 = n8;
            }
        }
    }
}

