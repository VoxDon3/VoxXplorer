package ax.n8;

import ax.yb.AbstractC3523d;

/* renamed from: ax.n8.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2617t {
    public static final a c = new a(null);
    private final String a;
    private final String b;

    /* renamed from: ax.n8.t$a */
    public static final class a {

        @ax.yb.f(c = "com.google.firebase.sessions.InstallationId$Companion", f = "InstallationId.kt", l = {32, 40}, m = "create")
        /* renamed from: ax.n8.t$a$a, reason: collision with other inner class name */
        static final class C0388a extends AbstractC3523d {
            Object e0;
            /* synthetic */ Object f0;
            int h0;

            C0388a(ax.wb.e<? super C0388a> eVar) {
                super(eVar);
            }

            @Override // ax.yb.AbstractC3520a
            public final Object p(Object obj) {
                this.f0 = obj;
                this.h0 |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|14|15|16)(2:19|20))(2:21|22))(3:29|30|(2:32|27))|23|24|25))|37|6|7|(0)(0)|23|24|25) */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        
            if (r10 != r1) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
        
            r10 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
        
            android.util.Log.w("InstallationId", "Error getting authentication token.", r10);
            r10 = r9;
            r9 = okhttp3.HttpUrl.FRAGMENT_ENCODE_SET;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0034, code lost:
        
            r10 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0093, code lost:
        
            android.util.Log.w("InstallationId", "Error getting Firebase installation id .", r10);
            r9 = r9;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
        /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v8 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(ax.b8.e r9, ax.wb.e<? super ax.n8.C2617t> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof ax.n8.C2617t.a.C0388a
                if (r0 == 0) goto L13
                r0 = r10
                ax.n8.t$a$a r0 = (ax.n8.C2617t.a.C0388a) r0
                int r1 = r0.h0
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.h0 = r1
                goto L18
            L13:
                ax.n8.t$a$a r0 = new ax.n8.t$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f0
                java.lang.Object r1 = ax.xb.C3479b.c()
                int r2 = r0.h0
                java.lang.String r3 = ""
                java.lang.String r4 = "InstallationId"
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L48
                if (r2 == r6) goto L3e
                if (r2 != r5) goto L36
                java.lang.Object r9 = r0.e0
                java.lang.String r9 = (java.lang.String) r9
                ax.sb.C3083o.b(r10)     // Catch: java.lang.Exception -> L34
                goto L8a
            L34:
                r10 = move-exception
                goto L93
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.e0
                ax.b8.e r9 = (ax.b8.e) r9
                ax.sb.C3083o.b(r10)     // Catch: java.lang.Exception -> L46
                goto L60
            L46:
                r10 = move-exception
                goto L6f
            L48:
                ax.sb.C3083o.b(r10)
                r10 = 0
                ax.j6.j r10 = r9.b(r10)     // Catch: java.lang.Exception -> L46
                java.lang.String r2 = "firebaseInstallations.getToken(false)"
                ax.Gb.l.e(r10, r2)     // Catch: java.lang.Exception -> L46
                r0.e0 = r9     // Catch: java.lang.Exception -> L46
                r0.h0 = r6     // Catch: java.lang.Exception -> L46
                java.lang.Object r10 = ax.ac.C1437b.a(r10, r0)     // Catch: java.lang.Exception -> L46
                if (r10 != r1) goto L60
                goto L89
            L60:
                com.google.firebase.installations.g r10 = (com.google.firebase.installations.g) r10     // Catch: java.lang.Exception -> L46
                java.lang.String r10 = r10.b()     // Catch: java.lang.Exception -> L46
                java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
                ax.Gb.l.e(r10, r2)     // Catch: java.lang.Exception -> L46
                r7 = r10
                r10 = r9
                r9 = r7
                goto L76
            L6f:
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r4, r2, r10)
                r10 = r9
                r9 = r3
            L76:
                ax.j6.j r10 = r10.a()     // Catch: java.lang.Exception -> L34
                java.lang.String r2 = "firebaseInstallations.id"
                ax.Gb.l.e(r10, r2)     // Catch: java.lang.Exception -> L34
                r0.e0 = r9     // Catch: java.lang.Exception -> L34
                r0.h0 = r5     // Catch: java.lang.Exception -> L34
                java.lang.Object r10 = ax.ac.C1437b.a(r10, r0)     // Catch: java.lang.Exception -> L34
                if (r10 != r1) goto L8a
            L89:
                return r1
            L8a:
                java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
                ax.Gb.l.e(r10, r0)     // Catch: java.lang.Exception -> L34
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L34
                r3 = r10
                goto L98
            L93:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r4, r0, r10)
            L98:
                ax.n8.t r10 = new ax.n8.t
                r0 = 0
                r10.<init>(r3, r9, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.n8.C2617t.a.a(ax.b8.e, ax.wb.e):java.lang.Object");
        }

        private a() {
        }
    }

    public /* synthetic */ C2617t(String str, String str2, ax.Gb.g gVar) {
        this(str, str2);
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    private C2617t(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
