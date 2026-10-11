package ax.p8;

import android.net.Uri;
import ax.Fb.p;
import ax.Qb.C0935g;
import ax.Qb.J;
import ax.n8.C2599b;
import ax.sb.t;
import ax.wb.i;
import ax.xb.C3479b;
import ax.yb.l;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d implements InterfaceC2782a {
    public static final a d = new a(null);
    private final C2599b a;
    private final i b;
    private final String c;

    public static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    @ax.yb.f(c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", f = "RemoteSettingsFetcher.kt", l = {68, 70, 73}, m = "invokeSuspend")
    static final class b extends l implements p<J, ax.wb.e<? super t>, Object> {
        int f0;
        final /* synthetic */ Map<String, String> h0;
        final /* synthetic */ p<JSONObject, ax.wb.e<? super t>, Object> i0;
        final /* synthetic */ p<String, ax.wb.e<? super t>, Object> j0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Map<String, String> map, p<? super JSONObject, ? super ax.wb.e<? super t>, ? extends Object> pVar, p<? super String, ? super ax.wb.e<? super t>, ? extends Object> pVar2, ax.wb.e<? super b> eVar) {
            super(2, eVar);
            this.h0 = map;
            this.i0 = pVar;
            this.j0 = pVar2;
        }

        @Override // ax.yb.AbstractC3520a
        public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
            return d.this.new b(this.h0, this.i0, this.j0, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x00cb, code lost:
        
            if (r8.j(r1, r7) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00e0, code lost:
        
            if (r1.j(r3, r7) != r0) goto L37;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
        @Override // ax.yb.AbstractC3520a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object p(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = ax.xb.C3479b.c()
                int r1 = r7.f0
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L26
                if (r1 == r4) goto L1e
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                ax.sb.C3083o.b(r8)
                goto Le3
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                ax.sb.C3083o.b(r8)     // Catch: java.lang.Exception -> L23
                goto Le3
            L23:
                r8 = move-exception
                goto Lce
            L26:
                ax.sb.C3083o.b(r8)
                ax.p8.d r8 = ax.p8.d.this     // Catch: java.lang.Exception -> L23
                java.net.URL r8 = ax.p8.d.b(r8)     // Catch: java.lang.Exception -> L23
                java.net.URLConnection r8 = r8.openConnection()     // Catch: java.lang.Exception -> L23
                java.lang.String r1 = "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection"
                ax.Gb.l.d(r8, r1)     // Catch: java.lang.Exception -> L23
                javax.net.ssl.HttpsURLConnection r8 = (javax.net.ssl.HttpsURLConnection) r8     // Catch: java.lang.Exception -> L23
                java.lang.String r1 = "GET"
                r8.setRequestMethod(r1)     // Catch: java.lang.Exception -> L23
                java.lang.String r1 = "Accept"
                java.lang.String r5 = "application/json"
                r8.setRequestProperty(r1, r5)     // Catch: java.lang.Exception -> L23
                java.util.Map<java.lang.String, java.lang.String> r1 = r7.h0     // Catch: java.lang.Exception -> L23
                java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Exception -> L23
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L23
            L50:
                boolean r5 = r1.hasNext()     // Catch: java.lang.Exception -> L23
                if (r5 == 0) goto L6c
                java.lang.Object r5 = r1.next()     // Catch: java.lang.Exception -> L23
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Exception -> L23
                java.lang.Object r6 = r5.getKey()     // Catch: java.lang.Exception -> L23
                java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L23
                java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Exception -> L23
                java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L23
                r8.setRequestProperty(r6, r5)     // Catch: java.lang.Exception -> L23
                goto L50
            L6c:
                int r1 = r8.getResponseCode()     // Catch: java.lang.Exception -> L23
                r5 = 200(0xc8, float:2.8E-43)
                if (r1 != r5) goto Lb2
                java.io.InputStream r8 = r8.getInputStream()     // Catch: java.lang.Exception -> L23
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L23
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L23
                r3.<init>(r8)     // Catch: java.lang.Exception -> L23
                r1.<init>(r3)     // Catch: java.lang.Exception -> L23
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
                r3.<init>()     // Catch: java.lang.Exception -> L23
                ax.Gb.v r5 = new ax.Gb.v     // Catch: java.lang.Exception -> L23
                r5.<init>()     // Catch: java.lang.Exception -> L23
            L8c:
                java.lang.String r6 = r1.readLine()     // Catch: java.lang.Exception -> L23
                r5.q = r6     // Catch: java.lang.Exception -> L23
                if (r6 == 0) goto L98
                r3.append(r6)     // Catch: java.lang.Exception -> L23
                goto L8c
            L98:
                r1.close()     // Catch: java.lang.Exception -> L23
                r8.close()     // Catch: java.lang.Exception -> L23
                org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L23
                java.lang.String r1 = r3.toString()     // Catch: java.lang.Exception -> L23
                r8.<init>(r1)     // Catch: java.lang.Exception -> L23
                ax.Fb.p<org.json.JSONObject, ax.wb.e<? super ax.sb.t>, java.lang.Object> r1 = r7.i0     // Catch: java.lang.Exception -> L23
                r7.f0 = r4     // Catch: java.lang.Exception -> L23
                java.lang.Object r8 = r1.j(r8, r7)     // Catch: java.lang.Exception -> L23
                if (r8 != r0) goto Le3
                goto Le2
            Lb2:
                ax.Fb.p<java.lang.String, ax.wb.e<? super ax.sb.t>, java.lang.Object> r8 = r7.j0     // Catch: java.lang.Exception -> L23
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L23
                r4.<init>()     // Catch: java.lang.Exception -> L23
                java.lang.String r5 = "Bad response code: "
                r4.append(r5)     // Catch: java.lang.Exception -> L23
                r4.append(r1)     // Catch: java.lang.Exception -> L23
                java.lang.String r1 = r4.toString()     // Catch: java.lang.Exception -> L23
                r7.f0 = r3     // Catch: java.lang.Exception -> L23
                java.lang.Object r8 = r8.j(r1, r7)     // Catch: java.lang.Exception -> L23
                if (r8 != r0) goto Le3
                goto Le2
            Lce:
                ax.Fb.p<java.lang.String, ax.wb.e<? super ax.sb.t>, java.lang.Object> r1 = r7.j0
                java.lang.String r3 = r8.getMessage()
                if (r3 != 0) goto Lda
                java.lang.String r3 = r8.toString()
            Lda:
                r7.f0 = r2
                java.lang.Object r8 = r1.j(r3, r7)
                if (r8 != r0) goto Le3
            Le2:
                return r0
            Le3:
                ax.sb.t r8 = ax.sb.t.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.p8.d.b.p(java.lang.Object):java.lang.Object");
        }

        @Override // ax.Fb.p
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(J j, ax.wb.e<? super t> eVar) {
            return ((b) a(j, eVar)).p(t.a);
        }
    }

    public d(C2599b c2599b, i iVar, String str) {
        ax.Gb.l.f(c2599b, "appInfo");
        ax.Gb.l.f(iVar, "blockingDispatcher");
        ax.Gb.l.f(str, "baseUrl");
        this.a = c2599b;
        this.b = iVar;
        this.c = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final URL c() {
        return new URL(new Uri.Builder().scheme("https").authority(this.c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.a.b()).appendPath("settings").appendQueryParameter("build_version", this.a.a().a()).appendQueryParameter("display_version", this.a.a().f()).build().toString());
    }

    @Override // ax.p8.InterfaceC2782a
    public Object a(Map<String, String> map, p<? super JSONObject, ? super ax.wb.e<? super t>, ? extends Object> pVar, p<? super String, ? super ax.wb.e<? super t>, ? extends Object> pVar2, ax.wb.e<? super t> eVar) {
        Object g = C0935g.g(this.b, new b(map, pVar, pVar2, null), eVar);
        return g == C3479b.c() ? g : t.a;
    }

    public /* synthetic */ d(C2599b c2599b, i iVar, String str, int i, ax.Gb.g gVar) {
        this(c2599b, iVar, (i & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }
}
