package ax.c3;

import ax.u3.C3183a;
import com.voxdon.xplorer.file.AbstractC3595n;
import com.voxdon.xplorer.file.C3605y;
import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: ax.c3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1829q {
    static HashMap<String, C1829q> c = new HashMap<>();
    Comparator<AbstractC3595n> a;
    boolean b;

    /* renamed from: ax.c3.q$a */
    public static class a implements Comparator<AbstractC3595n> {
        Collator q;

        public a() {
            Collator collator = Collator.getInstance();
            this.q = collator;
            try {
                collator.setDecomposition(1);
            } catch (IllegalArgumentException unused) {
                ax.Ha.c.h().f().c("COLLATOR EXCEPTION 2").g(Locale.getDefault().toString()).h();
            }
            this.q.setStrength(3);
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            return this.q.compare(abstractC3595n2.B(), abstractC3595n.B());
        }
    }

    /* renamed from: ax.c3.q$b */
    public static class b implements Comparator<AbstractC3595n> {
        Collator q;

        public b() {
            Collator collator = Collator.getInstance();
            this.q = collator;
            try {
                collator.setDecomposition(1);
            } catch (IllegalArgumentException unused) {
                ax.Ha.c.h().f().c("COLLATOR EXCEPTION 1").g(Locale.getDefault().toString()).h();
            }
            this.q.setStrength(3);
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            return this.q.compare(abstractC3595n.B(), abstractC3595n2.B());
        }
    }

    /* renamed from: ax.c3.q$c */
    public static class c implements Comparator<AbstractC3595n> {
        h q = new h();

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            long q = abstractC3595n.q();
            long q2 = abstractC3595n2.q();
            if (q < q2) {
                return 1;
            }
            if (q == q2) {
                return this.q.compare(abstractC3595n, abstractC3595n2);
            }
            return -1;
        }
    }

    /* renamed from: ax.c3.q$d */
    public static class d implements Comparator<AbstractC3595n> {
        h q = new h();

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            boolean z = abstractC3595n instanceof C3605y;
            long D0 = z ? ((C3605y) abstractC3595n).D0() : abstractC3595n.q();
            long D02 = z ? ((C3605y) abstractC3595n2).D0() : abstractC3595n2.q();
            if (D0 < D02) {
                return 1;
            }
            if (D0 == D02) {
                return this.q.compare(abstractC3595n, abstractC3595n2);
            }
            return -1;
        }
    }

    /* renamed from: ax.c3.q$e */
    public static class e implements Comparator<AbstractC3595n> {
        h q = new h();

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            boolean z = abstractC3595n instanceof C3605y;
            long D0 = z ? ((C3605y) abstractC3595n).D0() : abstractC3595n.q();
            long D02 = z ? ((C3605y) abstractC3595n2).D0() : abstractC3595n2.q();
            if (D0 < D02) {
                return -1;
            }
            if (D0 == D02) {
                return this.q.compare(abstractC3595n, abstractC3595n2);
            }
            return 1;
        }
    }

    /* renamed from: ax.c3.q$f */
    public static class f implements Comparator<AbstractC3595n> {
        h q = new h();

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            long q = abstractC3595n.q();
            long q2 = abstractC3595n2.q();
            if (q < q2) {
                return -1;
            }
            if (q == q2) {
                return this.q.compare(abstractC3595n, abstractC3595n2);
            }
            return 1;
        }
    }

    /* renamed from: ax.c3.q$g */
    public static class g implements Comparator<AbstractC3595n> {
        Collator c0;
        C3183a q;

        public g() {
            Collator collator = Collator.getInstance();
            this.c0 = collator;
            try {
                collator.setDecomposition(1);
            } catch (IllegalArgumentException unused) {
                ax.Ha.c.h().f().c("COLLATOR EXCEPTION 2").g(Locale.getDefault().toString()).h();
            }
            this.c0.setStrength(3);
            this.q = new C3183a(this.c0);
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            try {
                return this.q.compare(abstractC3595n2.B(), abstractC3595n.B());
            } catch (Exception unused) {
                ax.Ha.c.h().f().d("ALPHANUM EXCEPTION 2").g("name:" + abstractC3595n.B() + "," + abstractC3595n2.B()).h();
                return this.c0.compare(abstractC3595n2.B(), abstractC3595n.B());
            }
        }
    }

    /* renamed from: ax.c3.q$h */
    public static class h implements Comparator<AbstractC3595n> {
        Collator c0;
        C3183a q;

        public h() {
            Collator collator = Collator.getInstance();
            this.c0 = collator;
            try {
                collator.setDecomposition(1);
            } catch (IllegalArgumentException unused) {
                ax.Ha.c.h().f().c("COLLATOR EXCEPTION 1").g(Locale.getDefault().toString()).h();
            }
            this.c0.setStrength(3);
            this.q = new C3183a(this.c0);
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            try {
                return this.q.compare(abstractC3595n.B(), abstractC3595n2.B());
            } catch (Exception unused) {
                ax.Ha.c.h().f().d("ALPHANUM EXCEPTION 1").g("name:" + abstractC3595n.B() + "," + abstractC3595n2.B()).h();
                return this.c0.compare(abstractC3595n.B(), abstractC3595n2.B());
            }
        }
    }

    /* renamed from: ax.c3.q$i */
    public static class i implements Comparator<AbstractC3595n> {
        Collator q;

        public i() {
            Collator collator = Collator.getInstance();
            this.q = collator;
            try {
                collator.setDecomposition(1);
            } catch (IllegalArgumentException unused) {
                ax.Ha.c.h().f().c("COLLATOR EXCEPTION 1").g(Locale.getDefault().toString()).h();
            }
            this.q.setStrength(3);
        }

        private boolean b(AbstractC3595n abstractC3595n) {
            String W;
            if (C1809B.P(abstractC3595n) && (W = abstractC3595n.W()) != null && W.equals("/Android")) {
                return true;
            }
            return abstractC3595n.h();
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            boolean b = b(abstractC3595n);
            boolean b2 = b(abstractC3595n2);
            if (b && !b2) {
                return 1;
            }
            if (b || !b2) {
                return this.q.compare(abstractC3595n.B(), abstractC3595n2.B());
            }
            return -1;
        }
    }

    /* renamed from: ax.c3.q$j */
    public static class j implements Comparator<AbstractC3595n> {
        Collator q;

        public j() {
            Collator collator = Collator.getInstance();
            this.q = collator;
            try {
                collator.setDecomposition(1);
            } catch (IllegalArgumentException unused) {
                ax.Ha.c.h().f().c("COLLATOR EXCEPTION 1").g(Locale.getDefault().toString()).h();
            }
            this.q.setStrength(3);
        }

        private boolean b(AbstractC3595n abstractC3595n) {
            String W;
            if (C1809B.P(abstractC3595n) && (W = abstractC3595n.W()) != null && d0.H("/Android", W)) {
                return true;
            }
            return abstractC3595n.h();
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            boolean b = b(abstractC3595n);
            boolean b2 = b(abstractC3595n2);
            if (b && !b2) {
                return 1;
            }
            if (!b && b2) {
                return -1;
            }
            String T = abstractC3595n.T();
            String T2 = abstractC3595n2.T();
            if (T != null && T2 != null) {
                int compare = this.q.compare(T, T2);
                if (compare != 0) {
                    return compare;
                }
            } else {
                if (T == null && T2 != null) {
                    return 1;
                }
                if (T != null && T2 == null) {
                    return -1;
                }
            }
            return this.q.compare(abstractC3595n.B(), abstractC3595n2.B());
        }
    }

    /* renamed from: ax.c3.q$k */
    public static class k implements Comparator<AbstractC3595n> {
        private Comparator<AbstractC3595n> c0;
        Collator q;

        k(Comparator<AbstractC3595n> comparator) {
            this.c0 = comparator;
            Collator collator = Collator.getInstance();
            this.q = collator;
            try {
                collator.setDecomposition(1);
            } catch (IllegalArgumentException unused) {
                ax.Ha.c.h().f().c("COLLATOR EXCEPTION 1").g(Locale.getDefault().toString()).h();
            }
            this.q.setStrength(3);
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            int compare = this.c0.compare(abstractC3595n, abstractC3595n2);
            if (compare != 0) {
                return compare;
            }
            String T = abstractC3595n.T();
            String T2 = abstractC3595n2.T();
            if (T == null && T2 != null) {
                return 1;
            }
            if (T != null && T2 == null) {
                return -1;
            }
            if (T == null || T2 == null) {
                return 0;
            }
            return this.q.compare(T, T2);
        }

        public Comparator<AbstractC3595n> b() {
            return this.c0;
        }
    }

    /* renamed from: ax.c3.q$l */
    public static class l implements Comparator<AbstractC3595n> {
        Collator q = Collator.getInstance();

        l() {
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int compare(com.voxdon.xplorer.file.AbstractC3595n r8, com.voxdon.xplorer.file.AbstractC3595n r9) {
            /*
                r7 = this;
                boolean r0 = r8 instanceof com.voxdon.xplorer.file.C3605y
                r1 = -1
                r2 = 1
                if (r0 == 0) goto L34
                boolean r0 = r9 instanceof com.voxdon.xplorer.file.C3605y
                if (r0 == 0) goto L34
                boolean r0 = r8.isDirectory()
                boolean r3 = r9.isDirectory()
                if (r0 == 0) goto L21
                if (r3 == 0) goto L21
                int r0 = r9.r(r2)
                int r3 = r8.r(r2)
                int r0 = r0 - r3
                long r3 = (long) r0
                goto L3d
            L21:
                if (r0 == 0) goto L26
                if (r3 != 0) goto L26
                return r2
            L26:
                if (r0 != 0) goto L2b
                if (r3 == 0) goto L2b
                return r1
            L2b:
                long r3 = r9.p()
                long r5 = r8.p()
                goto L3c
            L34:
                long r3 = r9.p()
                long r5 = r8.p()
            L3c:
                long r3 = r3 - r5
            L3d:
                r5 = 0
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 != 0) goto L52
                java.text.Collator r0 = r7.q
                java.lang.String r8 = r8.B()
                java.lang.String r9 = r9.B()
                int r8 = r0.compare(r8, r9)
                return r8
            L52:
                if (r0 <= 0) goto L55
                return r2
            L55:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.c3.C1829q.l.compare(com.voxdon.xplorer.file.n, com.voxdon.xplorer.file.n):int");
        }
    }

    /* renamed from: ax.c3.q$m */
    public static class m implements Comparator<AbstractC3595n> {
        Collator q = Collator.getInstance();

        m() {
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int compare(com.voxdon.xplorer.file.AbstractC3595n r8, com.voxdon.xplorer.file.AbstractC3595n r9) {
            /*
                r7 = this;
                boolean r0 = r8 instanceof com.voxdon.xplorer.file.C3605y
                r1 = -1
                r2 = 1
                if (r0 == 0) goto L34
                boolean r0 = r9 instanceof com.voxdon.xplorer.file.C3605y
                if (r0 == 0) goto L34
                boolean r0 = r8.isDirectory()
                boolean r3 = r9.isDirectory()
                if (r0 == 0) goto L21
                if (r3 == 0) goto L21
                int r0 = r8.r(r2)
                int r3 = r9.r(r2)
                int r0 = r0 - r3
                long r3 = (long) r0
                goto L3d
            L21:
                if (r0 == 0) goto L26
                if (r3 != 0) goto L26
                return r1
            L26:
                if (r0 != 0) goto L2b
                if (r3 == 0) goto L2b
                return r2
            L2b:
                long r3 = r8.p()
                long r5 = r9.p()
                goto L3c
            L34:
                long r3 = r8.p()
                long r5 = r9.p()
            L3c:
                long r3 = r3 - r5
            L3d:
                r5 = 0
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 != 0) goto L52
                java.text.Collator r0 = r7.q
                java.lang.String r8 = r8.B()
                java.lang.String r9 = r9.B()
                int r8 = r0.compare(r8, r9)
                return r8
            L52:
                if (r0 <= 0) goto L55
                return r2
            L55:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.c3.C1829q.m.compare(com.voxdon.xplorer.file.n, com.voxdon.xplorer.file.n):int");
        }
    }

    /* renamed from: ax.c3.q$n */
    public static class n implements Comparator<AbstractC3595n> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            long Y = ax.T2.h.T(abstractC3595n).Y(abstractC3595n);
            long Y2 = ax.T2.h.T(abstractC3595n2).Y(abstractC3595n2);
            if (Y > Y2) {
                return -1;
            }
            return Y == Y2 ? 0 : 1;
        }
    }

    /* renamed from: ax.c3.q$o */
    public static class o implements Comparator<AbstractC3595n> {
        Collator c0;
        g q = new g();

        public o() {
            Collator collator = Collator.getInstance();
            this.c0 = collator;
            collator.setDecomposition(1);
            this.c0.setStrength(3);
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            if (abstractC3595n.isDirectory() && abstractC3595n2.isDirectory()) {
                return this.q.compare(abstractC3595n, abstractC3595n2);
            }
            int compare = this.c0.compare(d0.j(abstractC3595n2.B()), d0.j(abstractC3595n.B()));
            return compare == 0 ? this.q.compare(abstractC3595n, abstractC3595n2) : compare;
        }
    }

    /* renamed from: ax.c3.q$p */
    public static class p implements Comparator<AbstractC3595n> {
        Collator c0;
        h q = new h();

        public p() {
            Collator collator = Collator.getInstance();
            this.c0 = collator;
            collator.setDecomposition(1);
            this.c0.setStrength(3);
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            if (abstractC3595n.isDirectory() && abstractC3595n2.isDirectory()) {
                return this.q.compare(abstractC3595n, abstractC3595n2);
            }
            int compare = this.c0.compare(d0.j(abstractC3595n.B()), d0.j(abstractC3595n2.B()));
            return compare == 0 ? this.q.compare(abstractC3595n, abstractC3595n2) : compare;
        }
    }

    C1829q(Comparator<AbstractC3595n> comparator, boolean z) {
        this.a = comparator;
        this.b = z;
    }

    public static C1829q a(String str) {
        if ("SearchPath".equals(str)) {
            return c(str);
        }
        C1829q c2 = c(str);
        return c2 == null ? c("SearchPath") : new C1829q(new k(c2.b()), false);
    }

    public static C1829q c(String str) {
        C1829q c1829q = c.get(str);
        return c1829q != null ? c1829q : e(str);
    }

    private static C1829q e(String str) {
        C1829q c1829q = null;
        if (!str.equals("None")) {
            if (str.equals("NameUp")) {
                c1829q = new C1829q(new h(), true);
            } else if (str.equals("NameDown")) {
                c1829q = new C1829q(new g(), true);
            } else if (str.equals("CollatorNameUp")) {
                c1829q = new C1829q(new b(), true);
            } else if (str.equals("CollatorNameDown")) {
                c1829q = new C1829q(new a(), true);
            } else if (str.equals("SizeUp")) {
                c1829q = new C1829q(new m(), true);
            } else if (str.equals("SizeDown")) {
                c1829q = new C1829q(new l(), true);
            } else if (str.equals("DateUp")) {
                c1829q = new C1829q(new f(), true);
            } else if (str.equals("DateDown")) {
                c1829q = new C1829q(new c(), true);
            } else if (str.equals("DateTakenUp")) {
                c1829q = new C1829q(new e(), true);
            } else if (str.equals("DateTakenDown")) {
                c1829q = new C1829q(new d(), true);
            } else if (str.equals("DateDownNoSeparate")) {
                c1829q = new C1829q(new c(), false);
            } else if (str.equals("DateUpNoSeparate")) {
                c1829q = new C1829q(new f(), false);
            } else if (str.equals("TypeUp")) {
                c1829q = new C1829q(new p(), true);
            } else if (str.equals("TypeDown")) {
                c1829q = new C1829q(new o(), true);
            } else if (str.equals("RecursiveUp")) {
                c1829q = new C1829q(Collections.reverseOrder(new n()), false);
            } else if (str.equals("RecursiveDown")) {
                c1829q = new C1829q(new n(), false);
            } else if (str.equals("Search")) {
                c1829q = new C1829q(new i(), false);
            } else if (str.equals("SearchPath")) {
                c1829q = new C1829q(new j(), false);
            }
        }
        c.put(str, c1829q);
        return c1829q;
    }

    public static boolean f(String str) {
        return "DateTakenUp".equals(str) || "DateTakenDown".equals(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<com.voxdon.xplorer.file.AbstractC3595n> g(java.util.List<com.voxdon.xplorer.file.AbstractC3595n> r10, ax.c3.C1829q r11) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.c3.C1829q.g(java.util.List, ax.c3.q):java.util.List");
    }

    public static void h(List<AbstractC3595n> list, C1829q c1829q) {
        if (list == null || c1829q == null || c1829q.b() == null) {
            return;
        }
        try {
            Collections.sort(list, c1829q.b());
        } catch (IllegalArgumentException unused) {
            if (c1829q.b() instanceof k) {
                k kVar = (k) c1829q.b();
                try {
                    if (kVar.b() instanceof h) {
                        Collections.sort(list, new k(c("CollatorNameUp").b()));
                    } else if (!(kVar.b() instanceof g)) {
                    } else {
                        Collections.sort(list, new k(c("CollatorNameDown").b()));
                    }
                } catch (IllegalArgumentException unused2) {
                }
            }
        }
    }

    public Comparator<AbstractC3595n> b() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }
}
