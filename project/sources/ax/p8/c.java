package ax.p8;

import android.util.Log;
import ax.Fb.p;
import ax.Gb.m;
import ax.Pb.a;
import ax.m.j;
import ax.n8.C2599b;
import ax.q0.AbstractC2835d;
import ax.sb.C3077i;
import ax.sb.C3083o;
import ax.sb.InterfaceC3076h;
import ax.sb.t;
import ax.wb.i;
import ax.xb.C3479b;
import ax.yb.AbstractC3523d;
import ax.yb.l;
import okhttp3.HttpUrl;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c implements h {
    private static final a g = new a(null);
    private final i a;
    private final ax.b8.e b;
    private final C2599b c;
    private final InterfaceC2782a d;
    private final InterfaceC3076h e;
    private final ax.Zb.a f;

    private static final class a {
        public /* synthetic */ a(ax.Gb.g gVar) {
            this();
        }

        private a() {
        }
    }

    static final class b extends m implements ax.Fb.a<g> {
        final /* synthetic */ ax.n0.f<AbstractC2835d> q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ax.n0.f<AbstractC2835d> fVar) {
            super(0);
            this.q = fVar;
        }

        @Override // ax.Fb.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return new g(this.q);
        }
    }

    @ax.yb.f(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {170, 76, 94}, m = "updateSettings")
    /* renamed from: ax.p8.c$c, reason: collision with other inner class name */
    static final class C0420c extends AbstractC3523d {
        Object e0;
        Object f0;
        /* synthetic */ Object g0;
        int i0;

        C0420c(ax.wb.e<? super C0420c> eVar) {
            super(eVar);
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            this.g0 = obj;
            this.i0 |= Integer.MIN_VALUE;
            return c.this.c(this);
        }
    }

    @ax.yb.f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {j.L0, 128, 131, 133, 134, 136}, m = "invokeSuspend")
    static final class d extends l implements p<JSONObject, ax.wb.e<? super t>, Object> {
        Object f0;
        Object g0;
        int h0;
        /* synthetic */ Object i0;

        d(ax.wb.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // ax.yb.AbstractC3520a
        public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
            d dVar = c.this.new d(eVar);
            dVar.i0 = obj;
            return dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0195, code lost:
        
            if (r13.k(r0, r12) == r4) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0177, code lost:
        
            if (r13.j(r0, r12) == r4) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0154, code lost:
        
            if (r13.j(r0, r12) == r4) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0134, code lost:
        
            if (r13.i(r1, r12) == r4) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0113, code lost:
        
            if (r13.m(r2, r12) == r4) goto L66;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x015d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x013d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x011d  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
        /* JADX WARN: Type inference failed for: r13v12, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
        @Override // ax.yb.AbstractC3520a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object p(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 430
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ax.p8.c.d.p(java.lang.Object):java.lang.Object");
        }

        @Override // ax.Fb.p
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(JSONObject jSONObject, ax.wb.e<? super t> eVar) {
            return ((d) a(jSONObject, eVar)).p(t.a);
        }
    }

    @ax.yb.f(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", l = {}, m = "invokeSuspend")
    static final class e extends l implements p<String, ax.wb.e<? super t>, Object> {
        int f0;
        /* synthetic */ Object g0;

        e(ax.wb.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // ax.yb.AbstractC3520a
        public final ax.wb.e<t> a(Object obj, ax.wb.e<?> eVar) {
            e eVar2 = new e(eVar);
            eVar2.g0 = obj;
            return eVar2;
        }

        @Override // ax.yb.AbstractC3520a
        public final Object p(Object obj) {
            C3479b.c();
            if (this.f0 != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C3083o.b(obj);
            Log.e("SessionConfigFetcher", "Error failing to fetch the remote configs: " + ((String) this.g0));
            return t.a;
        }

        @Override // ax.Fb.p
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(String str, ax.wb.e<? super t> eVar) {
            return ((e) a(str, eVar)).p(t.a);
        }
    }

    public c(i iVar, ax.b8.e eVar, C2599b c2599b, InterfaceC2782a interfaceC2782a, ax.n0.f<AbstractC2835d> fVar) {
        ax.Gb.l.f(iVar, "backgroundDispatcher");
        ax.Gb.l.f(eVar, "firebaseInstallationsApi");
        ax.Gb.l.f(c2599b, "appInfo");
        ax.Gb.l.f(interfaceC2782a, "configsFetcher");
        ax.Gb.l.f(fVar, "dataStore");
        this.a = iVar;
        this.b = eVar;
        this.c = c2599b;
        this.d = interfaceC2782a;
        this.e = C3077i.a(new b(fVar));
        this.f = ax.Zb.c.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g f() {
        return (g) this.e.getValue();
    }

    private final String g(String str) {
        return new ax.Ob.g("/").b(str, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    @Override // ax.p8.h
    public Boolean a() {
        return f().g();
    }

    @Override // ax.p8.h
    public ax.Pb.a b() {
        Integer e2 = f().e();
        if (e2 == null) {
            return null;
        }
        a.C0172a c0172a = ax.Pb.a.c0;
        return ax.Pb.a.h(ax.Pb.c.h(e2.intValue(), ax.Pb.d.f0));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c2 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:26:0x004f, B:27:0x00b4, B:29:0x00c2, B:32:0x00cd, B:37:0x008d, B:39:0x0097, B:42:0x00a2), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cd A[Catch: all -> 0x0053, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:26:0x004f, B:27:0x00b4, B:29:0x00c2, B:32:0x00cd, B:37:0x008d, B:39:0x0097, B:42:0x00a2), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:26:0x004f, B:27:0x00b4, B:29:0x00c2, B:32:0x00cd, B:37:0x008d, B:39:0x0097, B:42:0x00a2), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2 A[Catch: all -> 0x0053, TRY_ENTER, TryCatch #0 {all -> 0x0053, blocks: (B:26:0x004f, B:27:0x00b4, B:29:0x00c2, B:32:0x00cd, B:37:0x008d, B:39:0x0097, B:42:0x00a2), top: B:7:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r8v0, types: [int] */
    @Override // ax.p8.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(ax.wb.e<? super ax.sb.t> r18) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ax.p8.c.c(ax.wb.e):java.lang.Object");
    }

    @Override // ax.p8.h
    public Double d() {
        return f().f();
    }
}
