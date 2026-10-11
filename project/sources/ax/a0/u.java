package ax.a0;

import java.util.Locale;

/* loaded from: classes.dex */
public final class u {
    public static final t a = new e(null, false);
    public static final t b = new e(null, true);
    public static final t c;
    public static final t d;
    public static final t e;
    public static final t f;

    private static class a implements c {
        static final a b = new a(true);
        private final boolean a;

        private a(boolean z) {
            this.a = z;
        }

        @Override // ax.a0.u.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = u.a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                        i++;
                    } else if (!this.a) {
                        return 1;
                    }
                } else if (this.a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {
        static final b a = new b();

        private b() {
        }

        @Override // ax.a0.u.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = u.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    private static abstract class d implements t {
        private final c a;

        d(c cVar) {
            this.a = cVar;
        }

        private boolean c(CharSequence charSequence, int i, int i2) {
            int a = this.a.a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return b();
            }
            return false;
        }

        @Override // ax.a0.t
        public boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            return this.a == null ? b() : c(charSequence, i, i2);
        }

        protected abstract boolean b();
    }

    private static class e extends d {
        private final boolean b;

        e(c cVar, boolean z) {
            super(cVar);
            this.b = z;
        }

        @Override // ax.a0.u.d
        protected boolean b() {
            return this.b;
        }
    }

    private static class f extends d {
        static final f b = new f();

        f() {
            super(null);
        }

        @Override // ax.a0.u.d
        protected boolean b() {
            return v.a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.a;
        c = new e(bVar, false);
        d = new e(bVar, true);
        e = new e(a.b, false);
        f = f.b;
    }

    static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
