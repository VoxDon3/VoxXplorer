/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.auth;

import android.content.Context;
import android.content.Intent;
import ax.E3.h;
import ax.H3.b;
import ax.O4.d;
import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.auth.BoxApiAuthentication;
import com.box.androidsdk.content.auth.OAuthActivity;
import com.box.androidsdk.content.models.BoxEntity;
import com.box.androidsdk.content.models.BoxJsonObject;
import com.box.androidsdk.content.models.BoxSession;
import com.box.androidsdk.content.models.BoxUser;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.requests.BoxRequestsUser$GetUserInfo;
import com.box.androidsdk.content.requests.BoxResponse;
import com.box.androidsdk.content.utils.SdkUtils;
import java.io.Serializable;
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

public class BoxAuthentication {
    private static final BoxAuthentication e = new BoxAuthentication();
    private static final ThreadPoolExecutor f = SdkUtils.f(1, 1, 3600L, TimeUnit.SECONDS);
    private static final String g = BoxAuthentication.class.getName();
    public static final String[] h = new String[]{"type", "id", "name", "login", "space_amount", "space_used", "max_upload_size", "status", "enterprise", "created_at"};
    private ConcurrentLinkedQueue<WeakReference<e>> a = new ConcurrentLinkedQueue();
    private j.ConcurrentHashMap<String, BoxAuthenticationInfo> b;
    private final j.ConcurrentHashMap<String, FutureTask> c = new j.ConcurrentHashMap();
    private f d = new f();

    private BoxAuthentication() {
    }

    static /* synthetic */ g c(BoxAuthentication boxAuthentication) {
        boxAuthentication.getClass();
        return null;
    }

    private FutureTask<BoxAuthenticationInfo> i(BoxSession boxSession, String string) {
        return new FutureTask<BoxAuthenticationInfo>(new Callable<BoxAuthenticationInfo>(){
            final BoxSession a;
            final String b;
            final BoxAuthentication c;
            {
                this.c = boxAuthentication;
                this.a = boxSession;
                this.b = string;
            }

            public BoxAuthenticationInfo a() throws Exception {
                Serializable serializable = new BoxApiAuthentication(this.a).c(this.b, this.a.u(), this.a.w());
                BoxAuthenticationInfo boxAuthenticationInfo = new BoxAuthenticationInfo();
                BoxAuthenticationInfo.E(boxAuthenticationInfo, this.a.r());
                serializable = (BoxAuthenticationInfo)((BoxRequest)serializable).x();
                boxAuthenticationInfo.N(((BoxAuthenticationInfo)serializable).C());
                boxAuthenticationInfo.S(((BoxAuthenticationInfo)serializable).M());
                boxAuthenticationInfo.Q(((BoxAuthenticationInfo)serializable).G());
                boxAuthenticationInfo.R(System.currentTimeMillis());
                boxAuthenticationInfo.T((BoxUser)((BoxRequestsUser$GetUserInfo)new ax.E3.e(new BoxSession(this.a.q(), boxAuthenticationInfo, null)).d().E(h)).x());
                BoxAuthentication.o().u(boxAuthenticationInfo, this.a.q());
                return boxAuthenticationInfo;
            }
        });
    }

    private FutureTask<BoxAuthenticationInfo> j(BoxSession object, BoxAuthenticationInfo boxAuthenticationInfo) {
        boolean bl = boxAuthenticationInfo.K() == null && ((BoxSession)object).D() == null;
        String string = SdkUtils.k(((BoxSession)object).G()) && bl ? boxAuthenticationInfo.C() : ((BoxSession)object).G();
        String string2 = boxAuthenticationInfo.K() != null ? boxAuthenticationInfo.K().G() : ((BoxSession)object).G();
        object = new FutureTask<BoxAuthenticationInfo>(new Callable<BoxAuthenticationInfo>(){
            final BoxSession a;
            final BoxAuthenticationInfo b;
            final String c;
            final String d;
            final boolean e;
            final BoxAuthentication f;
            {
                this.f = boxAuthentication;
                this.a = boxSession;
                this.b = boxAuthenticationInfo;
                this.c = string;
                this.d = string2;
                this.e = bl;
            }

            public BoxAuthenticationInfo a() throws Exception {
                this.a.B();
                BoxAuthentication.c(this.f);
                Object object = this.b.M() != null ? this.b.M() : "";
                Object object2 = this.a.u() != null ? this.a.u() : ax.E3.g.c;
                Object object3 = this.a.w() != null ? this.a.w() : ax.E3.g.d;
                if (!SdkUtils.k((String)object2) && !SdkUtils.k((String)object3)) {
                    block7: {
                        object = new BoxApiAuthentication(this.a).e((String)object, (String)object2, (String)object3);
                        try {
                            object = (BoxAuthenticationInfo)((BoxRequest)object).x();
                            if (object == null) break block7;
                            ((BoxAuthenticationInfo)object).R(System.currentTimeMillis());
                        }
                        catch (BoxException boxException) {
                            this.f.c.remove((Object)this.c);
                            throw this.f.s(this.a, boxException, this.b, this.d);
                        }
                    }
                    BoxAuthenticationInfo.E(this.a.r(), (BoxAuthenticationInfo)object);
                    if (!this.e) {
                        this.a.B();
                        BoxAuthentication.c(this.f);
                    } else {
                        object2 = new ax.E3.e(this.a);
                        this.b.T((BoxUser)((BoxRequestsUser$GetUserInfo)((ax.E3.e)object2).d().E(h)).x());
                    }
                    this.f.m(this.a.q()).put((Object)this.b.K().G(), object);
                    this.f.n().c((Map<String, BoxAuthenticationInfo>)this.f.b, this.a.q());
                    object3 = this.f.a.iterator();
                    while (object3.hasNext()) {
                        object2 = (e)((WeakReference)object3.next()).get();
                        if (object2 == null) continue;
                        object2.g((BoxAuthenticationInfo)object);
                    }
                    if (!this.a.G().equals(this.b.K().G())) {
                        this.a.e(this.b, new BoxException("Session User Id has changed!"));
                    }
                    this.f.c.remove((Object)this.c);
                    return this.b;
                }
                object = new BoxException("client id or secret not specified", 400, "{\"error\": \"bad_request\",\n  \"error_description\": \"client id or secret not specified\"}", null);
                throw this.f.s(this.a, (BoxException)object, this.b, this.d);
            }
        });
        this.c.put((Object)string, object);
        f.execute((Runnable)object);
        return object;
    }

    private h<BoxUser> k(Context context, BoxAuthenticationInfo boxAuthenticationInfo) {
        h<BoxUser> h8 = ((BoxRequestsUser$GetUserInfo)new ax.E3.e(new BoxSession(context, boxAuthenticationInfo.C(), null)).d().E(h)).D();
        h8.a(new h.b<BoxUser>(){
            final BoxAuthenticationInfo a;
            final Context b;
            final BoxAuthentication c;
            {
                this.c = boxAuthentication;
                this.a = boxAuthenticationInfo;
                this.b = context;
            }

            @Override
            public void a(BoxResponse<BoxUser> boxResponse) {
                if (boxResponse.c()) {
                    this.a.T(boxResponse.b());
                    BoxAuthentication.o().u(this.a, this.b);
                    return;
                }
                BoxAuthentication.o().v(this.a, boxResponse.a());
            }
        });
        f.execute(h8);
        return h8;
    }

    private j.ConcurrentHashMap<String, BoxAuthenticationInfo> m(Context context) {
        if (this.b == null) {
            this.b = this.d.b(context);
        }
        return this.b;
    }

    public static BoxAuthentication o() {
        return e;
    }

    private BoxException.RefreshFailure s(BoxSession boxSession, BoxException boxException, BoxAuthenticationInfo boxAuthenticationInfo, String string) {
        if (((BoxException.RefreshFailure)(boxException = new BoxException.RefreshFailure(boxException))).g() || boxException.c() == BoxException.ErrorType.i0) {
            if (string != null && string.equals(this.n().a(boxSession.q()))) {
                this.n().d(null, boxSession.q());
            }
            this.m(boxSession.q()).remove((Object)string);
            this.n().c((Map<String, BoxAuthenticationInfo>)this.b, boxSession.q());
        }
        BoxAuthentication.o().v(boxAuthenticationInfo, boxException);
        return boxException;
    }

    public static boolean t(Context context) {
        Intent intent = new Intent("com.box.android.action.AUTHENTICATE_VIA_BOX_APP");
        return context.getPackageManager().queryIntentActivities(intent, 65600).size() > 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void x(BoxSession boxSession) {
        synchronized (this) {
            Throwable throwable2;
            block3: {
                boolean bl;
                Context context;
                try {
                    context = boxSession.q();
                    bl = BoxAuthentication.t(context) && boxSession.I();
                }
                catch (Throwable throwable2) {
                    break block3;
                }
                boxSession = OAuthActivity.j(context, boxSession, bl);
                boxSession.addFlags(0x10000000);
                context.startActivity((Intent)boxSession);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void g(e e8) {
        synchronized (this) {
            boolean bl = this.p().contains(e8);
            if (bl) {
                return;
            }
            ConcurrentLinkedQueue<WeakReference<e>> concurrentLinkedQueue = this.a;
            WeakReference<e> weakReference = new WeakReference<e>(e8);
            concurrentLinkedQueue.add(weakReference);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public FutureTask<BoxAuthenticationInfo> h(BoxSession object, String string) {
        synchronized (this) {
            object = this.i((BoxSession)object, string);
            f.submit((Runnable)object);
            return object;
        }
    }

    public BoxAuthenticationInfo l(String string, Context context) {
        if (string == null) {
            return null;
        }
        return (BoxAuthenticationInfo)this.m(context).get((Object)string);
    }

    public f n() {
        return this.d;
    }

    public Set<e> p() {
        LinkedHashSet<e> linkedHashSet = new LinkedHashSet<e>();
        Iterator<WeakReference<e>> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            e e8 = (e)iterator.next().get();
            if (e8 == null) continue;
            linkedHashSet.add(e8);
        }
        if (this.a.size() > linkedHashSet.size()) {
            this.a = new ConcurrentLinkedQueue();
            for (e e8 : linkedHashSet) {
                this.a.add(new WeakReference<e>(e8));
            }
        }
        return linkedHashSet;
    }

    public g q() {
        return null;
    }

    public Map<String, BoxAuthenticationInfo> r(Context context) {
        return this.m(context);
    }

    public void u(BoxAuthenticationInfo boxAuthenticationInfo, Context object) {
        if (!SdkUtils.k((boxAuthenticationInfo = BoxAuthenticationInfo.U(boxAuthenticationInfo)).C()) && (boxAuthenticationInfo.K() == null || SdkUtils.k(boxAuthenticationInfo.K().G()))) {
            this.k((Context)object, boxAuthenticationInfo);
            return;
        }
        this.m((Context)object).put((Object)boxAuthenticationInfo.K().G(), (Object)boxAuthenticationInfo.D());
        this.d.d(boxAuthenticationInfo.K().G(), (Context)object);
        this.d.c((Map<String, BoxAuthenticationInfo>)this.b, (Context)object);
        object = this.p().iterator();
        while (object.hasNext()) {
            ((e)object.next()).h(boxAuthenticationInfo);
        }
    }

    public void v(BoxAuthenticationInfo object, Exception exception) {
        Object object2 = this.n();
        CharSequence charSequence = "failure:";
        if (object2 != null) {
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append("failure:");
            ((StringBuilder)charSequence).append("auth storage :");
            ((StringBuilder)charSequence).append(this.n().toString());
            charSequence = ((StringBuilder)charSequence).toString();
        }
        object2 = BoxAuthenticationInfo.U((BoxAuthenticationInfo)object);
        object = charSequence;
        if (object2 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)charSequence);
            object = ((BoxAuthenticationInfo)object2).K() == null ? "null user" : (((BoxAuthenticationInfo)object2).K().G() == null ? "null user id" : Integer.valueOf(((BoxAuthenticationInfo)object2).K().G().length()));
            stringBuilder.append(object);
            object = stringBuilder.toString();
        }
        ax.H3.b.f("BoxAuthfail", (String)object, exception);
        object = this.p().iterator();
        while (object.hasNext()) {
            object.next().e((BoxAuthenticationInfo)object2, exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public FutureTask<BoxAuthenticationInfo> w(BoxSession futureTask) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                BoxAuthenticationInfo boxAuthenticationInfo;
                Object object;
                block6: {
                    block7: {
                        try {
                            boolean bl;
                            BoxUser boxUser = ((BoxSession)((Object)futureTask)).D();
                            if (boxUser == null) {
                                return this.j((BoxSession)((Object)futureTask), ((BoxSession)((Object)futureTask)).r());
                            }
                            this.m(((BoxSession)((Object)futureTask)).q());
                            object = (BoxAuthenticationInfo)this.b.get((Object)boxUser.G());
                            boxAuthenticationInfo = object;
                            if (object == null) {
                                this.b.put((Object)boxUser.G(), (Object)((BoxSession)((Object)futureTask)).r());
                                boxAuthenticationInfo = (BoxAuthenticationInfo)this.b.get((Object)boxUser.G());
                            }
                            if (((BoxSession)((Object)futureTask)).r().C() == null || !((BoxSession)((Object)futureTask)).r().C().equals(boxAuthenticationInfo.C()) && boxAuthenticationInfo.J() != null && System.currentTimeMillis() - boxAuthenticationInfo.J() < 15000L) break block6;
                            object = (FutureTask)this.c.get((Object)boxUser.G());
                            if (object == null || ((FutureTask)object).isCancelled() || (bl = ((FutureTask)object).isDone())) break block7;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                        return object;
                    }
                    return this.j((BoxSession)((Object)futureTask), boxAuthenticationInfo);
                }
                BoxAuthenticationInfo.E(((BoxSession)((Object)futureTask)).r(), boxAuthenticationInfo);
                object = new Callable<BoxAuthenticationInfo>(){
                    final BoxAuthenticationInfo a;
                    final BoxAuthentication b;
                    {
                        this.b = boxAuthentication;
                        this.a = boxAuthenticationInfo;
                    }

                    public BoxAuthenticationInfo a() throws Exception {
                        return this.a;
                    }
                };
                futureTask = new FutureTask<BoxAuthenticationInfo>((Callable<BoxAuthenticationInfo>)object);
                f.execute(futureTask);
                return futureTask;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void y(BoxSession boxSession) {
        synchronized (this) {
            this.x(boxSession);
            return;
        }
    }

    public static class BoxAuthenticationInfo
    extends BoxJsonObject {
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
            return this.u("access_token");
        }

        public BoxAuthenticationInfo D() {
            BoxAuthenticationInfo boxAuthenticationInfo = new BoxAuthenticationInfo();
            BoxAuthenticationInfo.E(boxAuthenticationInfo, this);
            return boxAuthenticationInfo;
        }

        public Long G() {
            return this.t("expires_in");
        }

        @Deprecated
        public String I() {
            return this.u("base_domain");
        }

        public Long J() {
            return this.t("refresh_time");
        }

        public BoxUser K() {
            return (BoxUser)this.r(BoxEntity.E(), "user");
        }

        public String M() {
            return this.u("refresh_token");
        }

        public void N(String string) {
            this.z("access_token", string);
        }

        @Deprecated
        public void O(String string) {
            this.z("base_domain", string);
        }

        public void P(String string) {
            this.z("client_id", string);
        }

        public void Q(Long l8) {
            this.y("expires_in", l8);
        }

        public void R(Long l8) {
            this.y("refresh_time", l8);
        }

        public void S(String string) {
            this.z("refresh_token", string);
        }

        public void T(BoxUser boxUser) {
            this.x("user", boxUser);
        }

        public static class BoxImmutableAuthenticationInfo
        extends BoxAuthenticationInfo {
            private static final long serialVersionUID = 494874517008319105L;

            BoxImmutableAuthenticationInfo(BoxAuthenticationInfo boxAuthenticationInfo) {
                super.i(boxAuthenticationInfo.B());
            }

            @Override
            public void N(String string) {
                ax.H3.b.c("trying to modify ImmutableBoxAuthenticationInfo", new RuntimeException());
            }

            @Override
            public void O(String string) {
                ax.H3.b.c("trying to modify ImmutableBoxAuthenticationInfo", new RuntimeException());
            }

            @Override
            public void P(String string) {
                ax.H3.b.c("trying to modify ImmutableBoxAuthenticationInfo", new RuntimeException());
            }

            @Override
            public void Q(Long l8) {
                ax.H3.b.c("trying to modify ImmutableBoxAuthenticationInfo", new RuntimeException());
            }

            @Override
            public void R(Long l8) {
                ax.H3.b.c("trying to modify ImmutableBoxAuthenticationInfo", new RuntimeException());
            }

            @Override
            public void S(String string) {
                ax.H3.b.c("trying to modify ImmutableBoxAuthenticationInfo", new RuntimeException());
            }

            @Override
            public void T(BoxUser boxUser) {
                ax.H3.b.c("trying to modify ImmutableBoxAuthenticationInfo", new RuntimeException());
            }

            @Override
            public void i(d d8) {
            }

            @Override
            public void k(String string) {
            }
        }
    }

    public static interface e {
        public void e(BoxAuthenticationInfo var1, Exception var2);

        public void g(BoxAuthenticationInfo var1);

        public void h(BoxAuthenticationInfo var1);
    }

    public static class f {
        private static final String a;
        private static final String b;
        private static final String c;

        static {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(f.class.getCanonicalName());
            stringBuilder.append("_SharedPref");
            a = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(f.class.getCanonicalName());
            stringBuilder.append("_authInfoMap");
            b = stringBuilder.toString();
            stringBuilder = new StringBuilder();
            stringBuilder.append(f.class.getCanonicalName());
            stringBuilder.append("_lastAuthUserId");
            c = stringBuilder.toString();
        }

        protected String a(Context context) {
            return context.getSharedPreferences(a, 0).getString(c, null);
        }

        protected j.ConcurrentHashMap<String, BoxAuthenticationInfo> b(Context object) {
            j.ConcurrentHashMap concurrentHashMap = new j.ConcurrentHashMap();
            if (((String)(object = object.getSharedPreferences(a, 0).getString(b, ""))).length() > 0) {
                BoxEntity boxEntity = new BoxEntity();
                boxEntity.k((String)object);
                for (String string : boxEntity.n()) {
                    ax.O4.g g8 = boxEntity.w(string);
                    if (g8.r()) {
                        object = new BoxAuthenticationInfo();
                        ((BoxJsonObject)object).k(g8.k());
                    } else if (g8.q()) {
                        object = new BoxAuthenticationInfo();
                        ((BoxJsonObject)object).i(g8.i());
                    } else {
                        object = null;
                    }
                    concurrentHashMap.put((Object)string, object);
                }
            }
            return concurrentHashMap;
        }

        protected void c(Map<String, BoxAuthenticationInfo> object, Context context) {
            d d8 = new d();
            for (Map.Entry entry : object.entrySet()) {
                d8.B((String)entry.getKey(), ((BoxAuthenticationInfo)entry.getValue()).B());
            }
            object = new BoxEntity(d8);
            context.getSharedPreferences(a, 0).edit().putString(b, ((BoxJsonObject)object).A()).commit();
        }

        protected void d(String string, Context context) {
            if (SdkUtils.l(string)) {
                context.getSharedPreferences(a, 0).edit().remove(c).commit();
                return;
            }
            context.getSharedPreferences(a, 0).edit().putString(c, string).commit();
        }
    }

    public static interface g {
    }
}

