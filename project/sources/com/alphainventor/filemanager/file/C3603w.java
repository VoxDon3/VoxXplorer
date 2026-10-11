package com.voxdon.xplorer.file;

import android.content.Context;
import android.net.Uri;
import ax.b3.C1495j;
import ax.c3.C1808A;
import ax.c3.C1835x;
import ax.c3.d0;
import ax.r3.C2947d;
import ax.u3.AbstractC3199q;
import ax.u3.C3184b;
import ax.u3.C3197o;
import com.voxdon.xplorer.file.C3605y;
import j$.util.DesugarCollections;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.logging.Logger;

/* renamed from: com.voxdon.xplorer.file.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3603w extends AbstractC3199q<Void, Void, Boolean> {
    private static final Logger o = Logger.getLogger("FileManager.LibraryScanTask");
    private static HashSet<String> p = new HashSet<>();
    private static HashSet<String> q = new HashSet<>();
    private static HashSet<String> r = new HashSet<>();
    private static HashSet<String> s = new HashSet<>();
    static C3603w t;
    static final Object u;
    private static int v;
    private HashMap<ax.Q2.f, f> h;
    private HashMap<String, Boolean> i;
    private final List<d> j;
    private Context k;
    private boolean l;
    private boolean m;
    private boolean n;

    /* renamed from: com.voxdon.xplorer.file.w$a */
    class a implements Comparator<AbstractC3595n> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            return abstractC3595n2.E().compareTo(abstractC3595n.E());
        }
    }

    /* renamed from: com.voxdon.xplorer.file.w$b */
    class b implements Comparator<AbstractC3595n> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC3595n abstractC3595n, AbstractC3595n abstractC3595n2) {
            return abstractC3595n.E().compareTo(abstractC3595n2.E());
        }
    }

    /* renamed from: com.voxdon.xplorer.file.w$c */
    static class c {
        String a;
        Set<String> b = new HashSet();
        ax.c3.K c;
        C3596o d;
        File e;
        HashMap<String, List<A>> f;
        ArrayList<AbstractC3595n> g;
        boolean h;

        c(ax.c3.K k, String str, File file, boolean z) {
            this.c = k;
            this.d = C1835x.e(k);
            this.a = str;
            this.e = file;
            this.h = z;
        }

        void a(AbstractC3595n abstractC3595n) {
            this.g.add(abstractC3595n);
        }

        void b() {
            ArrayList<AbstractC3595n> arrayList = this.g;
            if (arrayList != null) {
                arrayList.clear();
                this.g = null;
            }
            c();
        }

        void c() {
            HashMap<String, List<A>> hashMap = this.f;
            if (hashMap != null) {
                hashMap.clear();
                this.f = null;
            }
        }

        List<A> d(String str) {
            return this.f.get(str);
        }

        void e() {
            this.f = new HashMap<>();
            this.g = new ArrayList<>();
        }

        boolean f() {
            return this.f != null;
        }

        boolean g() {
            return this.g != null;
        }

        void h(String str, List<A> list) {
            this.f.put(str, list);
        }
    }

    /* renamed from: com.voxdon.xplorer.file.w$d */
    public interface d {
        void a(boolean z);

        void b(HashMap<ax.Q2.f, f> hashMap);
    }

    /* renamed from: com.voxdon.xplorer.file.w$e */
    public static class e {
        public ax.c3.K a;
        public C3605y c;
        public Boolean d;
        public String h;
        public boolean b = false;
        public long e = 0;
        public int f = 0;
        public long g = 0;
    }

    /* renamed from: com.voxdon.xplorer.file.w$f */
    public static class f {
        public HashMap<String, e> a = new HashMap<>();
        public long b = 0;
        public int c = 0;
        public long d = 0;
        public long e = 0;
    }

    static {
        p.add("/Android/data/com.utorrent.client/files/Download");
        p.add("/Android/data/com.bittorrent.client/files/Download");
        p.add("/Android/data/com.android.chrome/files/Download");
        p.add("/Android/data/org.telegram.messenger/files/Telegram");
        q.add("mobiletmoney.txt");
        q.add("log.txt");
        q.add("log");
        r.add("/Android/media/com.google.android.gm/Notifications");
        r.add("/Android/media/com.google.android.talk/Notifications");
        r.add("/Android/media/com.google.android.talk/Ringtones");
        s.add("/Documents/Notebloc");
        u = new Object();
    }

    public C3603w(Context context, boolean z) {
        super(AbstractC3199q.e.LOW);
        this.j = DesugarCollections.synchronizedList(new ArrayList());
        this.k = context.getApplicationContext();
        this.m = z;
    }

    private static void A(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        file.delete();
    }

    public static C3603w C(Context context, d dVar) {
        try {
            return D(context.getApplicationContext(), dVar, false);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:4:0x0003, B:6:0x0007, B:10:0x0028, B:11:0x002d, B:12:0x002f, B:16:0x0012), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.voxdon.xplorer.file.C3603w D(android.content.Context r3, com.voxdon.xplorer.file.C3603w.d r4, boolean r5) {
        /*
            java.lang.Object r0 = com.voxdon.xplorer.file.C3603w.u
            monitor-enter(r0)
            com.voxdon.xplorer.file.w r1 = com.voxdon.xplorer.file.C3603w.t     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            ax.u3.q$f r1 = r1.m()     // Catch: java.lang.Throwable -> L10
            ax.u3.q$f r2 = ax.u3.AbstractC3199q.f.FINISHED     // Catch: java.lang.Throwable -> L10
            if (r1 != r2) goto L26
            goto L12
        L10:
            r3 = move-exception
            goto L31
        L12:
            java.util.logging.Logger r1 = com.voxdon.xplorer.file.C3603w.o     // Catch: java.lang.Throwable -> L10
            java.lang.String r2 = "Execute scan task"
            r1.fine(r2)     // Catch: java.lang.Throwable -> L10
            com.voxdon.xplorer.file.w r1 = new com.voxdon.xplorer.file.w     // Catch: java.lang.Throwable -> L10
            r1.<init>(r3, r5)     // Catch: java.lang.Throwable -> L10
            com.voxdon.xplorer.file.C3603w.t = r1     // Catch: java.lang.Throwable -> L10
            r3 = 0
            java.lang.Void[] r3 = new java.lang.Void[r3]     // Catch: java.lang.Throwable -> L10
            r1.i(r3)     // Catch: java.lang.Throwable -> L10
        L26:
            if (r4 == 0) goto L2d
            com.voxdon.xplorer.file.w r3 = com.voxdon.xplorer.file.C3603w.t     // Catch: java.lang.Throwable -> L10
            r3.w(r4)     // Catch: java.lang.Throwable -> L10
        L2d:
            com.voxdon.xplorer.file.w r3 = com.voxdon.xplorer.file.C3603w.t     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r3
        L31:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3603w.D(android.content.Context, com.voxdon.xplorer.file.w$d, boolean):com.voxdon.xplorer.file.w");
    }

    private boolean E(AbstractC3595n abstractC3595n) {
        return q.contains(abstractC3595n.B().toLowerCase());
    }

    private boolean F(AbstractC3595n abstractC3595n) {
        String lowerCase = abstractC3595n.B().toLowerCase();
        String f2 = d0.f(lowerCase);
        if ("log".equals(f2) || lowerCase.endsWith("_log.txt") || lowerCase.endsWith("_logs.txt")) {
            return true;
        }
        return (lowerCase.startsWith("filelog") && "txt".equals(f2)) || q.contains(lowerCase);
    }

    public static Set<String> G() {
        return r;
    }

    static File H(Context context, boolean z) {
        File q2 = ax.Q2.e.q(context);
        if (q2 != null) {
            return z ? new File(q2.getAbsolutePath(), "scanfile.full") : new File(q2.getAbsolutePath(), "scanfile.fast");
        }
        throw new IllegalStateException("Can not create index file");
    }

    static File I(Context context) {
        File q2 = ax.Q2.e.q(context);
        if (q2 != null) {
            return new File(q2.getAbsolutePath(), "scanfile_new.full");
        }
        throw new IllegalStateException("Can not create index file");
    }

    static File J(Context context, boolean z) {
        File q2 = ax.Q2.e.q(context);
        if (q2 != null) {
            return z ? new File(q2.getAbsolutePath(), "scanfile_sd.full") : new File(q2.getAbsolutePath(), "scanfile_sd.fast");
        }
        throw new IllegalStateException("Can not create index file");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void K(com.voxdon.xplorer.file.C3603w.c r20, com.voxdon.xplorer.file.AbstractC3595n r21, java.io.BufferedWriter r22, ax.Z2.i r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3603w.K(com.voxdon.xplorer.file.w$c, com.voxdon.xplorer.file.n, java.io.BufferedWriter, ax.Z2.i):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void L(com.voxdon.xplorer.file.C3603w.c r9, java.util.Stack<com.voxdon.xplorer.file.AbstractC3595n> r10, java.io.Writer r11) throws java.io.IOException {
        /*
            r8 = this;
            java.lang.Object r0 = r10.pop()
            com.voxdon.xplorer.file.n r0 = (com.voxdon.xplorer.file.AbstractC3595n) r0
            java.lang.String r1 = r0.E()
            java.util.Set<java.lang.String> r2 = r9.b
            boolean r1 = r2.contains(r1)
            if (r1 == 0) goto L14
            goto L92
        L14:
            java.lang.String r1 = r0.B()
            boolean r1 = com.voxdon.xplorer.file.J.k2(r1)
            if (r1 == 0) goto L20
            goto L92
        L20:
            r1 = 0
            if (r11 == 0) goto L25
            r2 = 1
            goto L26
        L25:
            r2 = 0
        L26:
            java.util.List r2 = r8.T(r9, r0, r2)     // Catch: java.lang.OutOfMemoryError -> L2b ax.b3.C1495j -> L3c
            goto L3d
        L2b:
            ax.Ha.b r2 = ax.Ha.c.h()
            ax.Ha.b r2 = r2.f()
            java.lang.String r3 = "SCAN: listFiles OUT OF MEMORY"
            ax.Ha.b r2 = r2.d(r3)
            r2.h()
        L3c:
            r2 = 0
        L3d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            if (r2 != 0) goto L4d
            r8.e0(r9, r0, r4, r11)
            return
        L4d:
            r5 = 0
        L4e:
            int r6 = r2.size()
            if (r5 >= r6) goto L75
            java.lang.Object r6 = r2.get(r5)
            com.voxdon.xplorer.file.n r6 = (com.voxdon.xplorer.file.AbstractC3595n) r6
            boolean r7 = r8.Q(r9, r6)
            if (r7 == 0) goto L6f
            java.lang.String r7 = r6.B()
            boolean r7 = ax.c3.d0.C(r7)
            if (r7 == 0) goto L6b
            goto L72
        L6b:
            r3.add(r6)
            goto L72
        L6f:
            r4.add(r6)
        L72:
            int r5 = r5 + 1
            goto L4e
        L75:
            r8.e0(r9, r0, r4, r11)
            com.voxdon.xplorer.file.w$a r9 = new com.voxdon.xplorer.file.w$a
            r9.<init>()
            java.util.Collections.sort(r3, r9)
        L80:
            int r9 = r3.size()
            if (r1 >= r9) goto L92
            java.lang.Object r9 = r3.get(r1)
            com.voxdon.xplorer.file.n r9 = (com.voxdon.xplorer.file.AbstractC3595n) r9
            r10.push(r9)
            int r1 = r1 + 1
            goto L80
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3603w.L(com.voxdon.xplorer.file.w$c, java.util.Stack, java.io.Writer):void");
    }

    private void M(c cVar, AbstractC3595n abstractC3595n, Writer writer) throws IOException {
        Stack<AbstractC3595n> stack = new Stack<>();
        stack.push(abstractC3595n);
        while (!stack.isEmpty()) {
            L(cVar, stack, writer);
        }
    }

    private void N(c cVar, String str, BufferedWriter bufferedWriter, ax.Z2.i iVar) throws IOException {
        Stack<String> stack = new Stack<>();
        stack.push(str);
        while (!stack.isEmpty()) {
            O(cVar, stack, bufferedWriter, iVar);
        }
    }

    private void O(c cVar, Stack<String> stack, BufferedWriter bufferedWriter, ax.Z2.i iVar) throws IOException {
        String pop = stack.pop();
        while (true) {
            String c2 = iVar.c();
            if (c2 == null) {
                return;
            }
            String[] split = c2.split("\u0000");
            String decode = Uri.decode(split[0]);
            if (!d0.B(decode)) {
                ax.Ha.c.h().f().d("ISCD").g(decode + ":" + c2.length() + ":" + c2).h();
                iVar.a();
            } else {
                if (!d0.r(decode).equals(pop) && pop != null) {
                    return;
                }
                try {
                    C3605y c3605y = (C3605y) cVar.d.z(decode);
                    if (c3605y.q() == Long.parseLong(split[1])) {
                        bufferedWriter.write(c2 + "\n");
                        X(cVar, decode, c3605y, split);
                        iVar.a();
                        stack.push(pop);
                        stack.push(decode);
                        return;
                    }
                    iVar.a();
                    K(cVar, c3605y, bufferedWriter, iVar);
                } catch (C1495j e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00e6 A[Catch: IOException -> 0x00e9, TRY_LEAVE, TryCatch #0 {IOException -> 0x00e9, blocks: (B:33:0x00e1, B:27:0x00e6), top: B:32:0x00e1 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void P(com.voxdon.xplorer.file.C3603w.c r8, com.voxdon.xplorer.file.AbstractC3595n r9) throws java.io.IOException {
        /*
            r7 = this;
            java.lang.String r0 = ","
            r1 = 0
            boolean r2 = r9.isDirectory()     // Catch: java.lang.Throwable -> L58
            if (r2 != 0) goto L5c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r2.<init>()     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = "location:"
            r2.append(r3)     // Catch: java.lang.Throwable -> L58
            ax.c3.K r3 = r8.c     // Catch: java.lang.Throwable -> L58
            r2.append(r3)     // Catch: java.lang.Throwable -> L58
            r2.append(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = r9.E()     // Catch: java.lang.Throwable -> L58
            r2.append(r3)     // Catch: java.lang.Throwable -> L58
            r2.append(r0)     // Catch: java.lang.Throwable -> L58
            ax.c3.K r3 = r8.c     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = r3.e()     // Catch: java.lang.Throwable -> L58
            r2.append(r3)     // Catch: java.lang.Throwable -> L58
            r2.append(r0)     // Catch: java.lang.Throwable -> L58
            boolean r0 = r9.n()     // Catch: java.lang.Throwable -> L58
            r2.append(r0)     // Catch: java.lang.Throwable -> L58
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L58
            boolean r2 = r9.n()     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L5c
            ax.Ha.b r2 = ax.Ha.c.h()     // Catch: java.lang.Throwable -> L58
            ax.Ha.b r2 = r2.f()     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = "SCAN ROOT IS NOT DIR"
            ax.Ha.b r2 = r2.b(r3)     // Catch: java.lang.Throwable -> L58
            ax.Ha.b r0 = r2.g(r0)     // Catch: java.lang.Throwable -> L58
            r0.h()     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            r8 = move-exception
            r4 = r1
            goto Ldf
        L5c:
            java.io.File r0 = r8.e     // Catch: java.lang.Throwable -> L58
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L58
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L58
            r3.<init>()     // Catch: java.lang.Throwable -> L58
            java.io.File r4 = r8.e     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L58
            r3.append(r4)     // Catch: java.lang.Throwable -> L58
            java.lang.String r4 = ".tmp"
            r3.append(r4)     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L58
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L58
            boolean r3 = r0.exists()     // Catch: java.lang.Throwable -> L58
            if (r3 == 0) goto L8b
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L58
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L58
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L58
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L58
            goto L8c
        L8b:
            r3 = r1
        L8c:
            java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> Ldc
            java.io.FileWriter r5 = new java.io.FileWriter     // Catch: java.lang.Throwable -> Ldc
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Ldc
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Ldc
            if (r3 == 0) goto La0
            java.lang.String r5 = r3.readLine()     // Catch: java.lang.Throwable -> L9d
            goto La1
        L9d:
            r8 = move-exception
        L9e:
            r1 = r3
            goto Ldf
        La0:
            r5 = r1
        La1:
            java.lang.String r6 = "6"
            boolean r5 = r6.equals(r5)     // Catch: java.lang.Throwable -> L9d
            if (r5 != 0) goto Lb5
            if (r3 == 0) goto Lb5
            r3.close()     // Catch: java.lang.Throwable -> L9d
            A(r0)     // Catch: java.lang.Throwable -> Lb3
            r3 = r1
            goto Lb5
        Lb3:
            r8 = move-exception
            goto Ldf
        Lb5:
            java.lang.String r5 = "6\n"
            r4.write(r5)     // Catch: java.lang.Throwable -> L9d
            if (r3 == 0) goto Lbf
            r3.readLine()     // Catch: java.lang.Throwable -> L9d
        Lbf:
            ax.Z2.i r5 = new ax.Z2.i     // Catch: java.lang.Throwable -> L9d
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L9d
            r7.K(r8, r9, r4, r5)     // Catch: java.lang.Throwable -> L9d
            if (r3 == 0) goto Lcd
            r3.close()     // Catch: java.lang.Throwable -> L9d
            r3 = r1
        Lcd:
            r4.close()     // Catch: java.lang.Throwable -> L9d
            A(r0)     // Catch: java.lang.Throwable -> Ldc
            r2.renameTo(r0)     // Catch: java.lang.Throwable -> Ldc
            if (r3 == 0) goto Ldb
            r3.close()     // Catch: java.io.IOException -> Ldb
        Ldb:
            return
        Ldc:
            r8 = move-exception
            r4 = r1
            goto L9e
        Ldf:
            if (r1 == 0) goto Le4
            r1.close()     // Catch: java.io.IOException -> Le9
        Le4:
            if (r4 == 0) goto Le9
            r4.close()     // Catch: java.io.IOException -> Le9
        Le9:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3603w.P(com.voxdon.xplorer.file.w$c, com.voxdon.xplorer.file.n):void");
    }

    private boolean Q(c cVar, AbstractC3595n abstractC3595n) {
        if (!cVar.h) {
            String B = abstractC3595n.B();
            if (B.length() > 4 && (B.charAt(B.length() - 3) == '.' || B.charAt(B.length() - 4) == '.')) {
                return false;
            }
        }
        return abstractC3595n.isDirectory();
    }

    private boolean R(Context context) {
        File H = H(context, true);
        File J = J(context, true);
        boolean z = H.exists() && H.length() > 0;
        return ax.Z2.j.F().t0() ? z && (J.exists() && (J.length() > 0L ? 1 : (J.length() == 0L ? 0 : -1)) > 0) : z;
    }

    public static boolean S(String str) {
        if (p.contains(str)) {
            return true;
        }
        return p.contains(d0.q(str, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.voxdon.xplorer.file.AbstractC3595n> T(com.voxdon.xplorer.file.C3603w.c r27, com.voxdon.xplorer.file.AbstractC3595n r28, boolean r29) throws ax.b3.C1495j {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3603w.T(com.voxdon.xplorer.file.w$c, com.voxdon.xplorer.file.n, boolean):java.util.List");
    }

    public static void W(Context context) {
        try {
            A(H(context, false));
            A(H(context, true));
            A(J(context, false));
            A(J(context, true));
            A(I(context));
        } catch (IllegalStateException unused) {
        }
    }

    private void X(c cVar, String str, C3605y c3605y, String[] strArr) {
        Boolean bool = null;
        for (int i = 2; i < strArr.length; i++) {
            String str2 = strArr[i];
            String[] split = str2.split("/");
            if (i != 2 || split.length >= 2) {
                if (i != 3 || split.length >= 2) {
                    f fVar = this.h.get(ax.Q2.f.valueOf(split[0]));
                    if (fVar == null) {
                        ax.Ha.c.h().f().b("NULL SCANINFO").g("loc:" + str2).h();
                    } else {
                        e eVar = new e();
                        eVar.f = Integer.valueOf(split[1]).intValue();
                        eVar.e = Long.valueOf(split[2]).longValue();
                        eVar.g = Long.valueOf(split[3]).longValue();
                        eVar.h = Uri.decode(split[4]);
                        eVar.b = false;
                        eVar.a = cVar.c;
                        eVar.c = c3605y;
                        eVar.d = bool;
                        fVar.a.put(c3605y.E(), eVar);
                    }
                } else if ("true".equalsIgnoreCase(str2) || "false".equalsIgnoreCase(str2)) {
                    this.i.put(str, Boolean.valueOf(str2));
                } else {
                    "null".equalsIgnoreCase(str2);
                }
            } else if ("true".equalsIgnoreCase(str2) || "false".equalsIgnoreCase(str2)) {
                bool = Boolean.valueOf(str2);
            } else if ("null".equalsIgnoreCase(str2)) {
                bool = null;
            }
        }
    }

    private void Y(String str, boolean z, ArrayList<AbstractC3595n> arrayList) {
        c cVar = new c(ax.c3.K.e, str, H(this.k, z), z);
        cVar.b.add(str + "/Android/data");
        cVar.b.add(str + "/.localcache");
        cVar.b.add(str + "/Android/media/com.voxdon.xplorer/.localcache");
        try {
            b0(cVar, cVar.d.z(cVar.a), arrayList);
        } catch (C1495j unused) {
            C3184b.f();
        }
    }

    private void Z(HashMap<String, C3602v> hashMap, List<AbstractC3595n> list) {
        File I = I(this.k);
        C3596o d2 = C1835x.d(ax.Q2.f.F0, 0);
        d2.n0();
        ax.c3.O o2 = new ax.c3.O((B) d2.u());
        try {
            o2.a(I, hashMap, list);
        } catch (IOException e2) {
            e2.printStackTrace();
            try {
                A(I);
                o2.a(I, hashMap, list);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            d2.k0(false);
        } catch (Exception e4) {
            e4.printStackTrace();
            ax.Ha.c.h().d("NEWSCAN1:").l(e4).h();
            A(I);
            o2.a(I, hashMap, list);
            d2.k0(false);
        }
        d2.k0(false);
    }

    private void a0(String str, boolean z, ArrayList<AbstractC3595n> arrayList) {
        c cVar = new c(ax.c3.K.f, str, J(this.k, z), z);
        cVar.b.add(str + "/Android/data");
        try {
            b0(cVar, cVar.d.z(cVar.a), arrayList);
        } catch (C1495j unused) {
            C3184b.f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
    
        if (ax.X2.Q.h1() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x016a, code lost:
    
        com.voxdon.xplorer.file.C3603w.o.severe("Retry Incremental Scan.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0171, code lost:
    
        r6.b();
        A(r6.e);
        P(r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0180, code lost:
    
        if (ax.X2.Q.h1() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0182, code lost:
    
        r6.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0186, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01f7, code lost:
    
        if (ax.X2.Q.h1() != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01f9, code lost:
    
        r6.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01fc, code lost:
    
        throw r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01c5, code lost:
    
        r7.printStackTrace();
        com.voxdon.xplorer.file.C3603w.o.severe("Incremental Scan Failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01d1, code lost:
    
        if (ax.X2.Q.h1() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0188, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x018c, code lost:
    
        r7.printStackTrace();
        ax.Ha.c.h().d("OOB2").l(r7).g("location:" + r6.c.toString()).h();
        com.voxdon.xplorer.file.C3603w.o.severe("Incremental Scan Failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c2, code lost:
    
        if (ax.X2.Q.h1() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0068, code lost:
    
        r6.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015b, code lost:
    
        if (ax.X2.Q.h1() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0066, code lost:
    
        if (ax.X2.Q.h1() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00d2, code lost:
    
        if (ax.X2.Q.h1() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0166, code lost:
    
        if (ax.X2.Q.h1() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0126, code lost:
    
        if (ax.X2.Q.h1() == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b0(com.voxdon.xplorer.file.C3603w.c r6, com.voxdon.xplorer.file.AbstractC3595n r7, java.util.ArrayList<com.voxdon.xplorer.file.AbstractC3595n> r8) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3603w.b0(com.voxdon.xplorer.file.w$c, com.voxdon.xplorer.file.n, java.util.ArrayList):void");
    }

    private void c0(ax.c3.K k, f fVar, HashMap<String, C3602v> hashMap, HashMap<String, C3605y.b> hashMap2, HashMap<String, Set<String>> hashMap3) {
        AbstractC3595n abstractC3595n;
        String H;
        C3596o e2 = C1835x.e(k);
        e2.n0();
        boolean z = false;
        try {
            try {
                AbstractC3595n z2 = e2.z(k.e());
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList(fVar.a.values());
                C3601u c3601u = (C3601u) e2.u();
                ax.Z2.b.k().a(arrayList2.size());
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    e eVar = (e) obj;
                    C3602v c3602v = (C3602v) c3601u.z0(eVar.c.F0(), eVar.a, z);
                    if (eVar.c.isDirectory()) {
                        long j = eVar.g;
                        if (j != 0) {
                            c3602v.H1(j);
                            c3602v.I1(eVar.h);
                            c3602v.v1();
                        }
                        c3602v.d0(eVar.f);
                        c3602v.k1(C3602v.E1(c3602v, eVar, this.i.get(eVar.c.T()), hashMap2, hashMap3));
                        if (eVar.b && (H = e2.H(c3602v)) != null) {
                            C2947d.B(this.k, H);
                        }
                    }
                    if (c3602v.h()) {
                        abstractC3595n = z2;
                    } else {
                        abstractC3595n = z2;
                        fVar.b += eVar.e;
                        fVar.c += eVar.f;
                        if (ax.c3.K.e.equals(c3602v.B0())) {
                            fVar.d += eVar.e;
                        } else {
                            fVar.e += eVar.e;
                        }
                        hashMap.put(eVar.c.E(), c3602v);
                    }
                    c3602v.r1();
                    if (c3602v.n()) {
                        arrayList.add(c3602v);
                    }
                    z2 = abstractC3595n;
                    z = false;
                }
                ax.Z2.b.k().m(z2, arrayList);
                arrayList2.clear();
                e2.k0(false);
            } catch (C1495j e3) {
                e3.printStackTrace();
                e2.k0(false);
            }
        } catch (Throwable th) {
            e2.k0(false);
            throw th;
        }
    }

    private void d0(c cVar, AbstractC3595n abstractC3595n) {
        Iterator<String> it = p.iterator();
        while (it.hasNext()) {
            try {
                AbstractC3595n z = cVar.d.z(d0.P(abstractC3595n.E(), it.next()));
                if (z.n()) {
                    try {
                        M(cVar, z, null);
                    } catch (IOException unused) {
                    }
                }
            } catch (C1495j e2) {
                e2.printStackTrace();
                C3184b.e("whiltelist scan failed");
            }
        }
    }

    private void e0(c cVar, AbstractC3595n abstractC3595n, List<AbstractC3595n> list, Writer writer) throws IOException {
        e eVar;
        HashMap hashMap = new HashMap();
        Boolean bool = null;
        Boolean bool2 = null;
        for (AbstractC3595n abstractC3595n2 : list) {
            String B = abstractC3595n2.B();
            ax.Q2.f l = C1808A.l(C1808A.g(d0.f(B)));
            if (l != ax.Q2.f.C0 || (!F(abstractC3595n2) && !E(abstractC3595n))) {
                if (l != null) {
                    if (hashMap.containsKey(l)) {
                        eVar = (e) hashMap.get(l);
                    } else {
                        eVar = new e();
                        hashMap.put(l, eVar);
                        eVar.c = (C3605y) abstractC3595n;
                        eVar.a = cVar.c;
                    }
                    try {
                        eVar.e += abstractC3595n2.p();
                        eVar.f++;
                        long q2 = abstractC3595n2.q();
                        if (eVar.g < q2 && !abstractC3595n2.h()) {
                            eVar.g = q2;
                            eVar.h = abstractC3595n2.B();
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                } else if (".nomedia".equals(B)) {
                    bool = Boolean.TRUE;
                } else if (".hidden".equals(B)) {
                    bool2 = Boolean.TRUE;
                }
            }
        }
        if (ax.X2.Q.h1()) {
            try {
                bool = Boolean.valueOf(((C3605y) cVar.d.z(d0.Q(abstractC3595n.E(), ".nomedia"))).x0());
                bool2 = Boolean.valueOf(((C3605y) cVar.d.z(d0.Q(abstractC3595n.E(), ".hidden"))).x0());
            } catch (C1495j e2) {
                e2.printStackTrace();
                C3184b.f();
            }
        } else {
            if (bool == null) {
                bool = Boolean.FALSE;
            }
            if (bool2 == null) {
                bool2 = Boolean.FALSE;
            }
        }
        if (bool2 != null) {
            this.i.put(abstractC3595n.E(), bool2);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Uri.encode(abstractC3595n.E()));
        stringBuffer.append("\u0000");
        stringBuffer.append(String.valueOf(abstractC3595n.q()));
        stringBuffer.append("\u0000");
        if (bool == null) {
            stringBuffer.append("null");
        } else {
            stringBuffer.append(String.valueOf(bool));
        }
        stringBuffer.append("\u0000");
        if (bool2 == null) {
            stringBuffer.append("null");
        } else {
            stringBuffer.append(String.valueOf(bool2));
        }
        for (ax.Q2.f fVar : hashMap.keySet()) {
            e eVar2 = (e) hashMap.get(fVar);
            stringBuffer.append("\u0000");
            stringBuffer.append(fVar.name());
            stringBuffer.append("/");
            stringBuffer.append(eVar2.f);
            stringBuffer.append("/");
            stringBuffer.append(eVar2.e);
            stringBuffer.append("/");
            stringBuffer.append(eVar2.g);
            stringBuffer.append("/");
            stringBuffer.append(Uri.encode(eVar2.h));
            eVar2.b = true;
            this.h.get(fVar).a.put(abstractC3595n.E(), eVar2);
            eVar2.d = bool;
        }
        stringBuffer.append("\n");
        if (writer != null) {
            writer.write(stringBuffer.toString());
        }
    }

    private void x(c cVar, boolean z) {
        System.currentTimeMillis();
        try {
            cVar.e();
            long c2 = ax.c3.O.c();
            String V = cVar.d.V();
            C3604x c3604x = (C3604x) cVar.d.u();
            C3605y c3605y = (C3605y) c3604x.z(V);
            if (!c3605y.isDirectory()) {
                if (ax.X2.Q.z0() && !C3197o.c()) {
                    return;
                }
                if (!"/sdcard".equals(V) && !"/storage/emulated/0".equals(V)) {
                    ax.Ha.c.h().f().b("LIBRARY ROOT IS NOT DIRECTORY").g("rootPath: " + V + "," + cVar.c).h();
                    return;
                }
            }
            List<A> q1 = c3604x.q1(c3605y, true, z ? c2 : 0L, 0L);
            if (q1 != null) {
                for (int i = 0; i < q1.size(); i++) {
                    A a2 = q1.get(i);
                    if (!z) {
                        String r2 = d0.r(a2.a);
                        if (d0.B(r2)) {
                            List<A> d2 = cVar.d(r2);
                            if (d2 == null) {
                                d2 = new ArrayList<>();
                                cVar.h(r2, d2);
                            }
                            d2.add(a2);
                        }
                    }
                    if (a2.c >= c2) {
                        cVar.a(c3604x.A0(c3605y.B0(), a2));
                    }
                }
            }
        } catch (RuntimeException e2) {
            e2.printStackTrace();
            C3184b.e("build media store cache");
        } finally {
        }
    }

    private static void y(C3603w c3603w) {
        synchronized (u) {
            try {
                if (c3603w == t) {
                    t = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void z(AbstractC3595n abstractC3595n, ax.Z2.i iVar) throws IOException {
        while (true) {
            String c2 = iVar.c();
            if (c2 == null) {
                return;
            }
            String decode = Uri.decode(c2.split("\u0000")[0]);
            if (d0.B(decode) && !d0.I(abstractC3595n.E(), decode)) {
                return;
            } else {
                iVar.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[Catch: IllegalArgumentException -> 0x010f, IllegalStateException -> 0x0112, TRY_ENTER, TRY_LEAVE, TryCatch #6 {IllegalArgumentException -> 0x010f, IllegalStateException -> 0x0112, blocks: (B:2:0x0000, B:6:0x0029, B:11:0x0036, B:16:0x005d, B:22:0x00c6, B:23:0x00dd, B:25:0x00e3, B:27:0x00f3, B:5:0x001f), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033 A[Catch: IllegalArgumentException | IllegalStateException -> 0x0018, IllegalStateException -> 0x001d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IllegalArgumentException | IllegalStateException -> 0x0018, blocks: (B:46:0x0005, B:49:0x000e, B:8:0x0033, B:13:0x003c, B:15:0x0040, B:19:0x00a2, B:21:0x00a8, B:38:0x00f0), top: B:45:0x0005 }] */
    @Override // ax.u3.AbstractC3199q
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Boolean g(java.lang.Void... r12) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.voxdon.xplorer.file.C3603w.g(java.lang.Void[]):java.lang.Boolean");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.u3.AbstractC3199q
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void q(Boolean bool) {
        synchronized (this.j) {
            try {
                Iterator<d> it = this.j.iterator();
                while (it.hasNext()) {
                    it.next().a(bool.booleanValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        y(this);
        if (this.l || !this.n) {
            return;
        }
        D(this.k, null, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ax.u3.AbstractC3199q
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public void s(Void... voidArr) {
        synchronized (this.j) {
            try {
                Iterator<d> it = this.j.iterator();
                while (it.hasNext()) {
                    it.next().b(this.h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ax.u3.AbstractC3199q
    protected void o() {
        synchronized (this.j) {
            try {
                Iterator<d> it = this.j.iterator();
                while (it.hasNext()) {
                    it.next().a(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        y(this);
    }

    @Override // ax.u3.AbstractC3199q
    protected void r() {
        this.h = new HashMap<>();
        this.i = new HashMap<>();
        Iterator<ax.c3.K> it = ax.c3.K.c().iterator();
        while (it.hasNext()) {
            this.h.put(it.next().d(), new f());
        }
    }

    public void w(d dVar) {
        if (dVar != null) {
            this.j.add(dVar);
        }
    }
}
