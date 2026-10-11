package com.box.androidsdk.content.auth;

import android.content.Context;
import android.content.Intent;
import ax.E3.h;
import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.auth.BoxApiAuthentication;
import com.box.androidsdk.content.models.BoxEntity;
import com.box.androidsdk.content.models.BoxJsonObject;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.models.BoxUser;
import com.box.androidsdk.content.requests.BoxResponse;
import com.box.androidsdk.content.utils.SdkUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class BoxAuthentication {
    private static final BoxAuthentication e = new BoxAuthentication();
    private static final ThreadPoolExecutor f = SdkUtils.f(1, 1, 3600, TimeUnit.SECONDS);
    private static final String g = BoxAuthentication.class.getName();
    public static final String[] h = {"type", "id", "name", "login", "space_amount", "space_used", "max_upload_size", "status", "enterprise", "created_at"};
    private ConcurrentHashMap<String, BoxAuthenticationInfo> b;
    private ConcurrentLinkedQueue<WeakReference<e>> a = new ConcurrentLinkedQueue<>();
    private final ConcurrentHashMap<String, FutureTask> c = new ConcurrentHashMap<>();
    private f d = new f();

    class a implements Callable<BoxAuthenticationInfo> {
        final /* synthetic */ BoxAuthenticationInfo a;

        a(BoxAuthenticationInfo boxAuthenticationInfo) {
            this.a = boxAuthenticationInfo;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BoxAuthenticationInfo call() throws Exception {
            return this.a;
        }
    }

    class b implements Callable<BoxAuthenticationInfo> {
        final /* synthetic */ BoxSession a;
        final /* synthetic */ String b;

        b(BoxSession boxSession, String str) {
            this.a = boxSession;
            this.b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BoxAuthenticationInfo call() throws Exception {
            BoxApiAuthentication.BoxCreateAuthRequest c = new BoxApiAuthentication(this.a).c(this.b, this.a.u(), this.a.w());
            BoxAuthenticationInfo boxAuthenticationInfo = new BoxAuthenticationInfo();
            BoxAuthenticationInfo.E(boxAuthenticationInfo, this.a.r());
            BoxAuthenticationInfo x = c.x();
            boxAuthenticationInfo.N(x.C());
            boxAuthenticationInfo.S(x.M());
            boxAuthenticationInfo.Q(x.G());
            boxAuthenticationInfo.R(Long.valueOf(System.currentTimeMillis()));
            boxAuthenticationInfo.T((BoxUser) new ax.E3.e(new BoxSession(this.a.q(), boxAuthenticationInfo, (g) null)).d().E(BoxAuthentication.h).x());
            BoxAuthentication.o().u(boxAuthenticationInfo, this.a.q());
            return boxAuthenticationInfo;
        }
    }

    class c implements h.b<BoxUser> {
        final /* synthetic */ BoxAuthenticationInfo a;
        final /* synthetic */ Context b;

        c(BoxAuthenticationInfo boxAuthenticationInfo, Context context) {
            this.a = boxAuthenticationInfo;
            this.b = context;
        }

        @Override // ax.E3.h.b
        public void a(BoxResponse<BoxUser> boxResponse) {
            if (!boxResponse.c()) {
                BoxAuthentication.o().v(this.a, boxResponse.a());
            } else {
                this.a.T(boxResponse.b());
                BoxAuthentication.o().u(this.a, this.b);
            }
        }
    }

    class d implements Callable<BoxAuthenticationInfo> {
        final /* synthetic */ BoxSession a;
        final /* synthetic */ BoxAuthenticationInfo b;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ boolean e;

        d(BoxSession boxSession, BoxAuthenticationInfo boxAuthenticationInfo, String str, String str2, boolean z) {
            this.a = boxSession;
            this.b = boxAuthenticationInfo;
            this.c = str;
            this.d = str2;
            this.e = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BoxAuthenticationInfo call() throws Exception {
            this.a.B();
            BoxAuthentication.c(BoxAuthentication.this);
            String M = this.b.M() != null ? this.b.M() : HttpUrl.FRAGMENT_ENCODE_SET;
            String u = this.a.u() != null ? this.a.u() : ax.E3.g.c;
            String w = this.a.w() != null ? this.a.w() : ax.E3.g.d;
            if (SdkUtils.k(u) || SdkUtils.k(w)) {
                throw BoxAuthentication.this.s(this.a, new BoxException("client id or secret not specified", 400, "{\"error\": \"bad_request\",\n  \"error_description\": \"client id or secret not specified\"}", null), this.b, this.d);
            }
            try {
                BoxAuthenticationInfo x = new BoxApiAuthentication(this.a).e(M, u, w).x();
                if (x != null) {
                    x.R(Long.valueOf(System.currentTimeMillis()));
                }
                BoxAuthenticationInfo.E(this.a.r(), x);
                if (this.e) {
                    this.b.T((BoxUser) new ax.E3.e(this.a).d().E(BoxAuthentication.h).x());
                } else {
                    this.a.B();
                    BoxAuthentication.c(BoxAuthentication.this);
                }
                BoxAuthentication.this.m(this.a.q()).put(this.b.K().G(), x);
                BoxAuthentication.this.n().c(BoxAuthentication.this.b, this.a.q());
                Iterator it = BoxAuthentication.this.a.iterator();
                while (it.hasNext()) {
                    e eVar = (e) ((WeakReference) it.next()).get();
                    if (eVar != null) {
                        eVar.g(x);
                    }
                }
                if (!this.a.G().equals(this.b.K().G())) {
                    this.a.e(this.b, new BoxException("Session User Id has changed!"));
                }
                BoxAuthentication.this.c.remove(this.c);
                return this.b;
            } catch (BoxException e) {
                BoxAuthentication.this.c.remove(this.c);
                throw BoxAuthentication.this.s(this.a, e, this.b, this.d);
            }
        }
    }

    public interface e {
        void e(BoxAuthenticationInfo boxAuthenticationInfo, Exception exc);

        void g(BoxAuthenticationInfo boxAuthenticationInfo);

        void h(BoxAuthenticationInfo boxAuthenticationInfo);
    }

    public static class f {
        private static final String a = f.class.getCanonicalName() + "_SharedPref";
        private static final String b = f.class.getCanonicalName() + "_authInfoMap";
        private static final String c = f.class.getCanonicalName() + "_lastAuthUserId";

        protected String a(Context context) {
            return context.getSharedPreferences(a, 0).getString(c, null);
        }

        protected ConcurrentHashMap<String, BoxAuthenticationInfo> b(Context context) {
            BoxAuthenticationInfo boxAuthenticationInfo;
            ConcurrentHashMap<String, BoxAuthenticationInfo> concurrentHashMap = new ConcurrentHashMap<>();
            String string = context.getSharedPreferences(a, 0).getString(b, HttpUrl.FRAGMENT_ENCODE_SET);
            if (string.length() > 0) {
                BoxEntity boxEntity = new BoxEntity();
                boxEntity.k(string);
                for (String str : boxEntity.n()) {
                    ax.O4.g w = boxEntity.w(str);
                    if (w.r()) {
                        boxAuthenticationInfo = new BoxAuthenticationInfo();
                        boxAuthenticationInfo.k(w.k());
                    } else if (w.q()) {
                        boxAuthenticationInfo = new BoxAuthenticationInfo();
                        boxAuthenticationInfo.i(w.i());
                    } else {
                        boxAuthenticationInfo = null;
                    }
                    concurrentHashMap.put(str, boxAuthenticationInfo);
                }
            }
            return concurrentHashMap;
        }

        protected void c(Map<String, BoxAuthenticationInfo> map, Context context) {
            ax.O4.d dVar = new ax.O4.d();
            for (Map.Entry<String, BoxAuthenticationInfo> entry : map.entrySet()) {
                dVar.B(entry.getKey(), entry.getValue().B());
            }
            context.getSharedPreferences(a, 0).edit().putString(b, new BoxEntity(dVar).A()).commit();
        }

        protected void d(String str, Context context) {
            if (SdkUtils.l(str)) {
                context.getSharedPreferences(a, 0).edit().remove(c).commit();
            } else {
                context.getSharedPreferences(a, 0).edit().putString(c, str).commit();
            }
        }
    }

    public interface g {
    }

    private BoxAuthentication() {
    }

    static /* synthetic */ g c(BoxAuthentication boxAuthentication) {
        boxAuthentication.getClass();
        return null;
    }

    private FutureTask<BoxAuthenticationInfo> i(BoxSession boxSession, String str) {
        return new FutureTask<>(new b(boxSession, str));
    }

    private FutureTask<BoxAuthenticationInfo> j(BoxSession boxSession, BoxAuthenticationInfo boxAuthenticationInfo) {
        boolean z = boxAuthenticationInfo.K() == null && boxSession.D() == null;
        String C = (SdkUtils.k(boxSession.G()) && z) ? boxAuthenticationInfo.C() : boxSession.G();
        FutureTask<BoxAuthenticationInfo> futureTask = new FutureTask<>(new d(boxSession, boxAuthenticationInfo, C, boxAuthenticationInfo.K() != null ? boxAuthenticationInfo.K().G() : boxSession.G(), z));
        this.c.put(C, futureTask);
        f.execute(futureTask);
        return futureTask;
    }

    private h<BoxUser> k(Context context, BoxAuthenticationInfo boxAuthenticationInfo) {
        h D = new ax.E3.e(new BoxSession(context, boxAuthenticationInfo.C(), (g) null)).d().E(h).D();
        D.a(new c(boxAuthenticationInfo, context));
        f.execute(D);
        return D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ConcurrentHashMap<String, BoxAuthenticationInfo> m(Context context) {
        if (this.b == null) {
            this.b = this.d.b(context);
        }
        return this.b;
    }

    public static BoxAuthentication o() {
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BoxException.RefreshFailure s(BoxSession boxSession, BoxException boxException, BoxAuthenticationInfo boxAuthenticationInfo, String str) {
        BoxException.RefreshFailure refreshFailure = new BoxException.RefreshFailure(boxException);
        if (refreshFailure.g() || refreshFailure.c() == BoxException.ErrorType.TERMS_OF_SERVICE_REQUIRED) {
            if (str != null && str.equals(n().a(boxSession.q()))) {
                n().d(null, boxSession.q());
            }
            m(boxSession.q()).remove(str);
            n().c(this.b, boxSession.q());
        }
        o().v(boxAuthenticationInfo, refreshFailure);
        return refreshFailure;
    }

    public static boolean t(Context context) {
        return context.getPackageManager().queryIntentActivities(new Intent("com.box.android.action.AUTHENTICATE_VIA_BOX_APP"), 65600).size() > 0;
    }

    private synchronized void x(BoxSession boxSession) {
        try {
            Context q = boxSession.q();
            Intent j = OAuthActivity.j(q, boxSession, t(q) && boxSession.I());
            j.addFlags(268435456);
            q.startActivity(j);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void g(e eVar) {
        if (p().contains(eVar)) {
            return;
        }
        this.a.add(new WeakReference<>(eVar));
    }

    public synchronized FutureTask<BoxAuthenticationInfo> h(BoxSession boxSession, String str) {
        FutureTask<BoxAuthenticationInfo> i;
        i = i(boxSession, str);
        f.submit(i);
        return i;
    }

    public BoxAuthenticationInfo l(String str, Context context) {
        if (str == null) {
            return null;
        }
        return m(context).get(str);
    }

    public f n() {
        return this.d;
    }

    public Set<e> p() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<WeakReference<e>> it = this.a.iterator();
        while (it.hasNext()) {
            e eVar = it.next().get();
            if (eVar != null) {
                linkedHashSet.add(eVar);
            }
        }
        if (this.a.size() > linkedHashSet.size()) {
            this.a = new ConcurrentLinkedQueue<>();
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                this.a.add(new WeakReference<>((e) it2.next()));
            }
        }
        return linkedHashSet;
    }

    public g q() {
        return null;
    }

    public Map<String, BoxAuthenticationInfo> r(Context context) {
        return m(context);
    }

    public void u(BoxAuthenticationInfo boxAuthenticationInfo, Context context) {
        BoxAuthenticationInfo U = BoxAuthenticationInfo.U(boxAuthenticationInfo);
        if (!SdkUtils.k(U.C()) && (U.K() == null || SdkUtils.k(U.K().G()))) {
            k(context, U);
            return;
        }
        m(context).put(U.K().G(), U.clone());
        this.d.d(U.K().G(), context);
        this.d.c(this.b, context);
        Iterator<e> it = p().iterator();
        while (it.hasNext()) {
            it.next().h(U);
        }
    }

    public void v(BoxAuthenticationInfo boxAuthenticationInfo, Exception exc) {
        String str = "failure:";
        if (n() != null) {
            str = "failure:auth storage :" + n().toString();
        }
        BoxAuthenticationInfo U = BoxAuthenticationInfo.U(boxAuthenticationInfo);
        if (U != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(U.K() == null ? "null user" : U.K().G() == null ? "null user id" : Integer.valueOf(U.K().G().length()));
            str = sb.toString();
        }
        ax.H3.b.f("BoxAuthfail", str, exc);
        Iterator<e> it = p().iterator();
        while (it.hasNext()) {
            it.next().e(U, exc);
        }
    }

    public synchronized FutureTask<BoxAuthenticationInfo> w(BoxSession boxSession) {
        BoxUser D = boxSession.D();
        if (D == null) {
            return j(boxSession, boxSession.r());
        }
        m(boxSession.q());
        BoxAuthenticationInfo boxAuthenticationInfo = this.b.get(D.G());
        if (boxAuthenticationInfo == null) {
            this.b.put(D.G(), boxSession.r());
            boxAuthenticationInfo = this.b.get(D.G());
        }
        if (boxSession.r().C() != null && (boxSession.r().C().equals(boxAuthenticationInfo.C()) || boxAuthenticationInfo.J() == null || System.currentTimeMillis() - boxAuthenticationInfo.J().longValue() >= 15000)) {
            FutureTask<BoxAuthenticationInfo> futureTask = this.c.get(D.G());
            if (futureTask != null && !futureTask.isCancelled() && !futureTask.isDone()) {
                return futureTask;
            }
            return j(boxSession, boxAuthenticationInfo);
        }
        BoxAuthenticationInfo.E(boxSession.r(), boxAuthenticationInfo);
        FutureTask<BoxAuthenticationInfo> futureTask2 = new FutureTask<>(new a(boxAuthenticationInfo));
        f.execute(futureTask2);
        return futureTask2;
    }

    public synchronized void y(BoxSession boxSession) {
        x(boxSession);
    }

    public static class BoxAuthenticationInfo extends BoxJsonObject {
        private static final long serialVersionUID = 2878150977399126399L;

        public static void E(BoxAuthenticationInfo boxAuthenticationInfo, BoxAuthenticationInfo boxAuthenticationInfo2) {
            boxAuthenticationInfo.i(boxAuthenticationInfo2.B());
        }

        public static BoxAuthenticationInfo U(BoxAuthenticationInfo boxAuthenticationInfo) {
            if (boxAuthenticationInfo == null) {
                return null;
            }
            return new BoxImmutableAuthenticationInfo(boxAuthenticationInfo);
        }

        public String C() {
            return u("access_token");
        }

        @Override // 
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public BoxAuthenticationInfo clone() {
            BoxAuthenticationInfo boxAuthenticationInfo = new BoxAuthenticationInfo();
            E(boxAuthenticationInfo, this);
            return boxAuthenticationInfo;
        }

        public Long G() {
            return t("expires_in");
        }

        @Deprecated
        public String I() {
            return u("base_domain");
        }

        public Long J() {
            return t("refresh_time");
        }

        public BoxUser K() {
            return (BoxUser) r(BoxEntity.E(), "user");
        }

        public String M() {
            return u("refresh_token");
        }

        public void N(String str) {
            z("access_token", str);
        }

        @Deprecated
        public void O(String str) {
            z("base_domain", str);
        }

        public void P(String str) {
            z("client_id", str);
        }

        public void Q(Long l) {
            y("expires_in", l);
        }

        public void R(Long l) {
            y("refresh_time", l);
        }

        public void S(String str) {
            z("refresh_token", str);
        }

        public void T(BoxUser boxUser) {
            x("user", boxUser);
        }

        public static class BoxImmutableAuthenticationInfo extends BoxAuthenticationInfo {
            private static final long serialVersionUID = 494874517008319105L;

            BoxImmutableAuthenticationInfo(BoxAuthenticationInfo boxAuthenticationInfo) {
                super.i(boxAuthenticationInfo.B());
            }

            @Override // com.box.androidsdk.content.auth.BoxAuthentication.BoxAuthenticationInfo
            public void N(String str) {
                ax.H3.b.c("trying to modify ImmutableBoxAuthenticationInfo", new RuntimeException());
            }

            @Override // com.box.androidsdk.content.auth.BoxAuthentication.BoxAuthenticationInfo
            public void O(String str) {
                ax.H3.b.c("trying to modify ImmutableBoxAuthenticationInfo", new RuntimeException());
            }

            @Override // com.box.androidsdk.content.auth.BoxAuthentication.BoxAuthenticationInfo
            public void P(String str) {
                ax.H3.b.c("trying to modify ImmutableBoxAuthenticationInfo", new RuntimeException());
            }

            @Override // com.box.androidsdk.content.auth.BoxAuthentication.BoxAuthenticationInfo
            public void Q(Long l) {
                ax.H3.b.c("trying to modify ImmutableBoxAuthenticationInfo", new RuntimeException());
            }

            @Override // com.box.androidsdk.content.auth.BoxAuthentication.BoxAuthenticationInfo
            public void R(Long l) {
                ax.H3.b.c("trying to modify ImmutableBoxAuthenticationInfo", new RuntimeException());
            }

            @Override // com.box.androidsdk.content.auth.BoxAuthentication.BoxAuthenticationInfo
            public void S(String str) {
                ax.H3.b.c("trying to modify ImmutableBoxAuthenticationInfo", new RuntimeException());
            }

            @Override // com.box.androidsdk.content.auth.BoxAuthentication.BoxAuthenticationInfo
            public void T(BoxUser boxUser) {
                ax.H3.b.c("trying to modify ImmutableBoxAuthenticationInfo", new RuntimeException());
            }

            @Override // com.box.androidsdk.content.auth.BoxAuthentication.BoxAuthenticationInfo
            public /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

            @Override // com.box.androidsdk.content.models.BoxJsonObject
            public void k(String str) {
            }

            @Override // com.box.androidsdk.content.models.BoxJsonObject
            public void i(ax.O4.d dVar) {
            }
        }
    }
}
