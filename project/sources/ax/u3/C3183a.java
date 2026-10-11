package ax.u3;

import java.text.Collator;
import java.util.Comparator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: ax.u3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3183a implements Comparator<String> {
    Collator c0;
    c<b> q = new C0468a();

    /* renamed from: ax.u3.a$a, reason: collision with other inner class name */
    class C0468a extends c<b> {
        C0468a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ax.u3.C3183a.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public b b() {
            return C3183a.this.new b();
        }
    }

    /* renamed from: ax.u3.a$b */
    class b {
        int a;
        int b;
        int c;

        b() {
        }

        int a() {
            return this.c - this.b;
        }

        int b() {
            return this.b - this.a;
        }
    }

    /* renamed from: ax.u3.a$c */
    private static abstract class c<T> {
        private ConcurrentLinkedQueue<T> a = new ConcurrentLinkedQueue<>();

        public T a() {
            T poll = this.a.poll();
            return poll == null ? b() : poll;
        }

        protected abstract T b();

        public void c(T t) {
            this.a.offer(t);
        }
    }

    public C3183a(Collator collator) {
        this.c0 = collator;
    }

    private int b(char c2, char c3) {
        int e = e(c2) - e(c3);
        return e != 0 ? e : c2 - c3;
    }

    private int c(int i, String str) {
        while (i < str.length()) {
            if (!f(str.charAt(i))) {
                return i - 1;
            }
            i++;
        }
        return str.length() - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r0 != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r2 == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r8.length() == r10.length()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (r10.length() <= r8.length()) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
    
        if (f(r10.charAt(r8.length())) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        r9.a = r3;
        r11.a = r3;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
    
        if (r8.length() <= r10.length()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (f(r8.charAt(r10.length())) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b1, code lost:
    
        if (r0 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b3, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b4, code lost:
    
        r9.b = h(r9.a, r8);
        r11.b = h(r11.a, r10);
        r9.c = c(r9.b, r8);
        r11.c = c(r11.b, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d5, code lost:
    
        return 2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int d(java.lang.String r8, ax.u3.C3183a.b r9, java.lang.String r10, ax.u3.C3183a.b r11) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            int r4 = r8.length()
            r5 = 1
            if (r1 >= r4) goto L6e
            int r4 = r10.length()
            if (r1 >= r4) goto L6e
            char r4 = r8.charAt(r1)
            char r6 = r10.charAt(r1)
            if (r4 != r6) goto L2e
            char r4 = r8.charAt(r1)
            boolean r4 = r7.f(r4)
            if (r4 == 0) goto L2a
            if (r2 != 0) goto L2b
            r3 = r1
            r2 = 1
            goto L2b
        L2a:
            r2 = 0
        L2b:
            int r1 = r1 + 1
            goto L4
        L2e:
            boolean r0 = r7.f(r4)
            if (r0 == 0) goto L47
            boolean r0 = r7.f(r6)
            if (r0 == 0) goto L47
            if (r2 == 0) goto L41
            r9.a = r3
            r11.a = r3
            goto L45
        L41:
            r9.a = r1
            r11.a = r1
        L45:
            r0 = 1
            goto L6e
        L47:
            boolean r0 = r7.f(r4)
            if (r0 != 0) goto L66
            boolean r0 = r7.f(r6)
            if (r0 != 0) goto L66
            boolean r8 = r7.g(r4)
            if (r8 == 0) goto L65
            boolean r8 = r7.g(r6)
            if (r8 == 0) goto L65
            r9.a = r1
            r11.a = r1
            r8 = 3
            return r8
        L65:
            return r5
        L66:
            if (r2 == 0) goto L6d
            r9.a = r3
            r11.a = r3
            goto L45
        L6d:
            return r5
        L6e:
            if (r0 != 0) goto Lb1
            if (r2 == 0) goto Lb1
            int r1 = r8.length()
            int r2 = r10.length()
            if (r1 == r2) goto Lb1
            int r1 = r10.length()
            int r2 = r8.length()
            if (r1 <= r2) goto L94
            int r1 = r8.length()
            char r1 = r10.charAt(r1)
            boolean r1 = r7.f(r1)
            if (r1 != 0) goto Lac
        L94:
            int r1 = r8.length()
            int r2 = r10.length()
            if (r1 <= r2) goto Lb1
            int r1 = r10.length()
            char r1 = r8.charAt(r1)
            boolean r1 = r7.f(r1)
            if (r1 == 0) goto Lb1
        Lac:
            r9.a = r3
            r11.a = r3
            r0 = 1
        Lb1:
            if (r0 != 0) goto Lb4
            return r5
        Lb4:
            int r0 = r9.a
            int r0 = r7.h(r0, r8)
            r9.b = r0
            int r0 = r11.a
            int r0 = r7.h(r0, r10)
            r11.b = r0
            int r0 = r9.b
            int r8 = r7.c(r0, r8)
            r9.c = r8
            int r8 = r11.b
            int r8 = r7.c(r8, r10)
            r11.c = r8
            r8 = 2
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.u3.C3183a.d(java.lang.String, ax.u3.a$b, java.lang.String, ax.u3.a$b):int");
    }

    private int e(char c2) {
        if (c2 < 9312 || c2 > 9371) {
            if (c2 < 9450 || c2 > 9471) {
                if (c2 >= 10102 && c2 <= 10111) {
                    return c2 - 10101;
                }
            } else {
                if (c2 == 9450 || c2 == 9471) {
                    return 0;
                }
                if (c2 >= 9451 && c2 <= 9460) {
                    return c2 - 9440;
                }
                if (c2 >= 9461 && c2 <= 9470) {
                    return c2 - 9460;
                }
            }
        } else {
            if (c2 >= 9312 && c2 <= 9331) {
                return c2 - 9311;
            }
            if (c2 >= 9332 && c2 <= 9351) {
                return c2 - 9331;
            }
            if (c2 >= 9352 && c2 <= 9371) {
                return c2 - 9351;
            }
        }
        C3184b.g("NOT REACHABLE");
        return -1;
    }

    private boolean f(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    private boolean g(char c2) {
        if (c2 >= 9312 && c2 <= 9371) {
            return true;
        }
        if (c2 < 9450 || c2 > 9471) {
            return c2 >= 10102 && c2 <= 10111;
        }
        return true;
    }

    private int h(int i, String str) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (!f(charAt)) {
                return i - 1;
            }
            if (charAt != '0') {
                return i;
            }
            i++;
        }
        return str.length() - 1;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(String str, String str2) {
        if (str == null || str2 == null) {
            throw new NullPointerException("null argument");
        }
        b a = this.q.a();
        b a2 = this.q.a();
        try {
            int d = d(str, a, str2, a2);
            if (d == 1) {
                return this.c0.compare(str, str2);
            }
            if (d == 3) {
                return b(str.charAt(a.a), str2.charAt(a2.a));
            }
            int a3 = a.a() - a2.a();
            if (a3 != 0) {
                return a3;
            }
            int i = a.b;
            int i2 = a2.b;
            do {
                int charAt = str.charAt(i) - str2.charAt(i2);
                if (charAt != 0) {
                    return charAt;
                }
                i++;
                i2++;
            } while (i <= a.c);
            int b2 = a2.b() - a.b();
            if (b2 != 0) {
                return b2;
            }
            C3184b.g("Not reachable");
            this.q.c(a);
            this.q.c(a2);
            return 0;
        } finally {
            this.q.c(a);
            this.q.c(a2);
        }
    }
}
