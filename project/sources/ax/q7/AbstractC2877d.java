package ax.q7;

/* renamed from: ax.q7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2877d implements o<Character> {

    /* renamed from: ax.q7.d$a */
    static abstract class a extends AbstractC2877d {
        a() {
        }

        @Override // ax.q7.o
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.b(ch);
        }
    }

    /* renamed from: ax.q7.d$b */
    private static final class b extends a {
        private final char q;

        b(char c) {
            this.q = c;
        }

        @Override // ax.q7.AbstractC2877d
        public boolean e(char c) {
            return c == this.q;
        }

        public String toString() {
            return "CharMatcher.is('" + AbstractC2877d.g(this.q) + "')";
        }
    }

    /* renamed from: ax.q7.d$c */
    static abstract class c extends a {
        private final String q;

        c(String str) {
            this.q = (String) n.n(str);
        }

        public final String toString() {
            return this.q;
        }
    }

    /* renamed from: ax.q7.d$d, reason: collision with other inner class name */
    private static final class C0430d extends c {
        static final AbstractC2877d c0 = new C0430d();

        private C0430d() {
            super("CharMatcher.none()");
        }

        @Override // ax.q7.AbstractC2877d
        public int c(CharSequence charSequence, int i) {
            n.q(i, charSequence.length());
            return -1;
        }

        @Override // ax.q7.AbstractC2877d
        public boolean e(char c) {
            return false;
        }
    }

    protected AbstractC2877d() {
    }

    public static AbstractC2877d d(char c2) {
        return new b(c2);
    }

    public static AbstractC2877d f() {
        return C0430d.c0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(char c2) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public boolean b(Character ch) {
        return e(ch.charValue());
    }

    public int c(CharSequence charSequence, int i) {
        int length = charSequence.length();
        n.q(i, length);
        while (i < length) {
            if (e(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public abstract boolean e(char c2);
}
