package com.box.androidsdk.content.models;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import ax.E3.e;
import ax.E3.g;
import ax.E3.h;
import ax.I3.d;
import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.auth.BoxAuthentication;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.utils.SdkUtils;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class BoxSession extends BoxObject implements BoxAuthentication.e {
    private static final transient ThreadPoolExecutor e0 = SdkUtils.f(1, 20, 3600, TimeUnit.SECONDS);
    private static final long serialVersionUID = 8122900496609434013L;
    private transient BoxAuthentication.e c0;
    private transient WeakReference<h<BoxSession>> d0;
    protected String mAccountEmail;
    protected BoxAuthentication.BoxAuthenticationInfo mAuthInfo;
    protected String mClientId;
    protected String mClientRedirectUrl;
    protected String mClientSecret;
    protected String mDeviceId;
    protected String mDeviceName;
    protected boolean mEnableBoxAppAuthentication;
    protected Long mExpiresAt;
    private String mLastAuthCreationTaskId;
    protected BoxMDMData mMDMData;
    protected BoxAuthentication.g mRefreshProvider;
    private boolean mSuppressAuthErrorUIAfterLogin;
    private String mUserAgent;
    private String mUserId;
    private transient Context q;

    private static class BoxSessionAuthCreationRequest extends BoxRequest<BoxSession, BoxSessionAuthCreationRequest> implements BoxAuthentication.e {
        private static final long serialVersionUID = 8123965031279971545L;
        private boolean mIsWaitingForLoginUi;
        private final BoxSession mSession;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                BoxSessionAuthCreationRequest.this.mSession.B();
                BoxSessionAuthCreationRequest.this.mSession.U();
            }
        }

        static class b extends h<BoxSession> {
            public b(Class<BoxSession> cls, BoxRequest boxRequest) {
                super(cls, boxRequest);
            }

            public void b() {
                BoxRequest boxRequest = this.q;
                if ((boxRequest instanceof BoxSessionAuthCreationRequest) && ((BoxSessionAuthCreationRequest) boxRequest).mIsWaitingForLoginUi) {
                    ((BoxSessionAuthCreationRequest) this.q).mSession.U();
                }
            }
        }

        public BoxSessionAuthCreationRequest(BoxSession boxSession, boolean z) {
            super(null, " ", null);
            this.mSession = boxSession;
        }

        private void G() {
            synchronized (this.mSession) {
                this.mIsWaitingForLoginUi = true;
                new Handler(Looper.getMainLooper()).post(new a());
                while (this.mIsWaitingForLoginUi) {
                    try {
                        this.mSession.wait();
                    } catch (InterruptedException unused) {
                        ax.H3.b.a(getClass().getSimpleName(), "could not launch auth UI");
                    }
                }
            }
        }

        private void H() {
            synchronized (this.mSession) {
                this.mIsWaitingForLoginUi = false;
                this.mSession.notify();
            }
        }

        @Override // com.box.androidsdk.content.requests.BoxRequest
        public h<BoxSession> D() {
            return new b(BoxSession.class, this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.box.androidsdk.content.requests.BoxRequest
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public BoxSession t() throws BoxException {
            synchronized (this.mSession) {
                try {
                    if (this.mSession.D() == null) {
                        if (this.mSession.r() != null && !SdkUtils.k(this.mSession.r().C()) && this.mSession.D() == null) {
                            try {
                                BoxUser boxUser = (BoxUser) new e(this.mSession).d().E(BoxAuthentication.h).x();
                                this.mSession.S(boxUser.G());
                                this.mSession.r().T(boxUser);
                                BoxAuthentication.o().u(this.mSession.r(), this.mSession.q());
                                return this.mSession;
                            } catch (BoxException e) {
                                ax.H3.b.b("BoxSession", "Unable to repair user", e);
                                if ((e instanceof BoxException.RefreshFailure) && ((BoxException.RefreshFailure) e).g()) {
                                    BoxSession.W(this.mSession.q(), d.o);
                                } else {
                                    if (e.c() != BoxException.ErrorType.TERMS_OF_SERVICE_REQUIRED) {
                                        this.mSession.e(null, e);
                                        throw e;
                                    }
                                    BoxSession.W(this.mSession.q(), d.q);
                                }
                            }
                        }
                        BoxAuthentication.o().g(this);
                        G();
                        return this.mSession;
                    }
                    BoxAuthentication.BoxAuthenticationInfo l = BoxAuthentication.o().l(this.mSession.G(), this.mSession.q());
                    if (l != null) {
                        BoxAuthentication.BoxAuthenticationInfo.E(this.mSession.mAuthInfo, l);
                        if (SdkUtils.k(this.mSession.r().C()) && SdkUtils.k(this.mSession.r().M())) {
                            BoxAuthentication.o().g(this);
                            G();
                        } else {
                            if (l.K() == null || SdkUtils.k(l.K().G())) {
                                try {
                                    BoxUser boxUser2 = (BoxUser) new e(this.mSession).d().E(BoxAuthentication.h).x();
                                    this.mSession.S(boxUser2.G());
                                    this.mSession.r().T(boxUser2);
                                    BoxSession boxSession = this.mSession;
                                    boxSession.h(boxSession.r());
                                    return this.mSession;
                                } catch (BoxException e2) {
                                    ax.H3.b.b("BoxSession", "Unable to repair user", e2);
                                    if ((e2 instanceof BoxException.RefreshFailure) && ((BoxException.RefreshFailure) e2).g()) {
                                        BoxSession.W(this.mSession.q(), d.o);
                                    } else {
                                        if (e2.c() != BoxException.ErrorType.TERMS_OF_SERVICE_REQUIRED) {
                                            this.mSession.e(null, e2);
                                            throw e2;
                                        }
                                        BoxSession.W(this.mSession.q(), d.q);
                                    }
                                }
                            }
                            BoxSession boxSession2 = this.mSession;
                            boxSession2.h(boxSession2.r());
                        }
                    } else {
                        this.mSession.mAuthInfo.T(null);
                        G();
                    }
                    return this.mSession;
                } catch (Throwable th) {
                    throw th;
                }
                throw th;
            }
        }

        @Override // com.box.androidsdk.content.auth.BoxAuthentication.e
        public void e(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo, Exception exc) {
            H();
        }

        @Override // com.box.androidsdk.content.requests.BoxRequest
        public boolean equals(Object obj) {
            if ((obj instanceof BoxSessionAuthCreationRequest) && ((BoxSessionAuthCreationRequest) obj).mSession.equals(this.mSession)) {
                return super.equals(obj);
            }
            return false;
        }

        @Override // com.box.androidsdk.content.auth.BoxAuthentication.e
        public void g(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
        }

        @Override // com.box.androidsdk.content.auth.BoxAuthentication.e
        public void h(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
            H();
        }

        @Override // com.box.androidsdk.content.requests.BoxRequest
        public int hashCode() {
            return this.mSession.hashCode() + super.hashCode();
        }
    }

    private static class BoxSessionRefreshRequest extends BoxRequest<BoxSession, BoxSessionRefreshRequest> {
        private static final long serialVersionUID = 8123965031279971587L;
        private BoxSession mSession;

        public BoxSessionRefreshRequest(BoxSession boxSession) {
            super(null, " ", null);
            this.mSession = boxSession;
        }

        @Override // com.box.androidsdk.content.requests.BoxRequest
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public BoxSession t() throws BoxException {
            try {
                BoxAuthentication.o().w(this.mSession).get();
            } catch (Exception e) {
                ax.H3.b.b("BoxSession", "Unable to repair user", e);
                Exception exc = e.getCause() instanceof BoxException ? (Exception) e.getCause() : e;
                if (!(exc instanceof BoxException)) {
                    throw new BoxException("BoxSessionRefreshRequest failed", exc);
                }
                if (!this.mSession.mSuppressAuthErrorUIAfterLogin) {
                    if ((exc instanceof BoxException.RefreshFailure) && ((BoxException.RefreshFailure) exc).g()) {
                        BoxSession.W(this.mSession.q(), d.o);
                        this.mSession.U();
                        BoxSession boxSession = this.mSession;
                        boxSession.e(boxSession.r(), exc);
                        throw ((BoxException) exc);
                    }
                    if (((BoxException) e).c() != BoxException.ErrorType.TERMS_OF_SERVICE_REQUIRED) {
                        this.mSession.e(null, exc);
                        throw ((BoxException) exc);
                    }
                    BoxSession.W(this.mSession.q(), d.q);
                    this.mSession.U();
                    BoxSession boxSession2 = this.mSession;
                    boxSession2.e(boxSession2.r(), exc);
                    ax.H3.b.b("BoxSession", "TOS refresh exception ", exc);
                    throw ((BoxException) exc);
                }
                this.mSession.e(null, exc);
            }
            BoxAuthentication.BoxAuthenticationInfo.E(this.mSession.mAuthInfo, BoxAuthentication.o().l(this.mSession.G(), this.mSession.q()));
            return this.mSession;
        }
    }

    class a extends Thread {
        final /* synthetic */ h q;

        a(h hVar) {
            this.q = hVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.q.run();
        }
    }

    static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[BoxException.ErrorType.values().length];
            a = iArr;
            try {
                iArr[BoxException.ErrorType.NETWORK_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[BoxException.ErrorType.IP_BLOCKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public BoxSession(Context context, String str) {
        this(context, str, g.c, g.d, g.f);
        if (!SdkUtils.l(g.g)) {
            Q(g.g);
        }
        if (SdkUtils.l(g.h)) {
            return;
        }
        Q(g.h);
    }

    private boolean K(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
        return (boxAuthenticationInfo == null || boxAuthenticationInfo.K() == null || G() == null || !G().equals(boxAuthenticationInfo.K().G())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void W(Context context, int i) {
        SdkUtils.t(context, i, 1);
    }

    private static BoxAuthentication.BoxAuthenticationInfo p(String str) {
        BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo = new BoxAuthentication.BoxAuthenticationInfo();
        boxAuthenticationInfo.N(str);
        return boxAuthenticationInfo;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Context context = g.i;
        if (context != null) {
            M(context);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
    }

    public String A() {
        return this.mClientRedirectUrl;
    }

    public BoxAuthentication.g B() {
        BoxAuthentication.o().q();
        return null;
    }

    public Long C() {
        return this.mExpiresAt;
    }

    public BoxUser D() {
        return this.mAuthInfo.K();
    }

    public String E() {
        return this.mUserAgent;
    }

    public String G() {
        return this.mUserId;
    }

    public boolean I() {
        return this.mEnableBoxAppAuthentication;
    }

    public h<BoxSession> J() {
        WeakReference<h<BoxSession>> weakReference = this.d0;
        if (weakReference != null && weakReference.get() != null) {
            h<BoxSession> hVar = this.d0.get();
            if (!hVar.isCancelled() && !hVar.isDone()) {
                return hVar;
            }
        }
        h<BoxSession> D = new BoxSessionRefreshRequest(this).D();
        new a(D).start();
        this.d0 = new WeakReference<>(D);
        return D;
    }

    public void M(Context context) {
        this.q = context.getApplicationContext();
    }

    protected void N(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
        if (boxAuthenticationInfo == null) {
            BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo2 = new BoxAuthentication.BoxAuthenticationInfo();
            this.mAuthInfo = boxAuthenticationInfo2;
            boxAuthenticationInfo2.P(this.mClientId);
        } else {
            this.mAuthInfo = boxAuthenticationInfo;
        }
        if (this.mAuthInfo.K() == null || SdkUtils.k(this.mAuthInfo.K().G())) {
            S(null);
        } else {
            S(this.mAuthInfo.K().G());
        }
    }

    public void O(String str) {
        this.mAccountEmail = str;
    }

    public void P(String str) {
        this.mDeviceId = str;
    }

    public void Q(String str) {
        this.mDeviceName = str;
    }

    public void R(BoxAuthentication.e eVar) {
        this.c0 = eVar;
    }

    protected void S(String str) {
        this.mUserId = str;
    }

    protected void T() {
        boolean z = false;
        try {
            Context context = this.q;
            if (context != null && context.getPackageManager() != null) {
                if (g.i == null) {
                    g.i = this.q;
                }
                if ((this.q.getPackageManager().getPackageInfo(this.q.getPackageName(), 0).applicationInfo.flags & 2) != 0) {
                    z = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        g.b = z;
        BoxAuthentication.o().g(this);
    }

    protected void U() {
        BoxAuthentication.o().y(this);
    }

    public boolean V() {
        return this.mSuppressAuthErrorUIAfterLogin;
    }

    @Override // com.box.androidsdk.content.auth.BoxAuthentication.e
    public void e(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo, Exception exc) {
        if (K(boxAuthenticationInfo) || (boxAuthenticationInfo == null && G() == null)) {
            BoxAuthentication.e eVar = this.c0;
            if (eVar != null) {
                eVar.e(boxAuthenticationInfo, exc);
            }
            if (exc instanceof BoxException) {
                if (b.a[((BoxException) exc).c().ordinal()] != 1) {
                    return;
                }
                W(this.q, d.p);
            }
        }
    }

    @Override // com.box.androidsdk.content.auth.BoxAuthentication.e
    public void g(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
        if (K(boxAuthenticationInfo)) {
            BoxAuthentication.BoxAuthenticationInfo.E(this.mAuthInfo, boxAuthenticationInfo);
            BoxAuthentication.e eVar = this.c0;
            if (eVar != null) {
                eVar.g(boxAuthenticationInfo);
            }
        }
    }

    @Override // com.box.androidsdk.content.auth.BoxAuthentication.e
    public void h(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
        if (K(boxAuthenticationInfo) || G() == null) {
            BoxAuthentication.BoxAuthenticationInfo.E(this.mAuthInfo, boxAuthenticationInfo);
            if (boxAuthenticationInfo.K() != null) {
                S(boxAuthenticationInfo.K().G());
            }
            BoxAuthentication.e eVar = this.c0;
            if (eVar != null) {
                eVar.h(boxAuthenticationInfo);
            }
        }
    }

    public h<BoxSession> l(Context context) {
        return n(context, null);
    }

    public h<BoxSession> n(Context context, h.b<BoxSession> bVar) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            this.q = applicationContext;
            g.i = applicationContext;
        }
        if (!SdkUtils.k(this.mLastAuthCreationTaskId)) {
            ThreadPoolExecutor threadPoolExecutor = e0;
            if (threadPoolExecutor instanceof ax.H3.g) {
                Runnable a2 = ((ax.H3.g) threadPoolExecutor).a(this.mLastAuthCreationTaskId);
                if (a2 instanceof BoxSessionAuthCreationRequest.b) {
                    BoxSessionAuthCreationRequest.b bVar2 = (BoxSessionAuthCreationRequest.b) a2;
                    if (bVar != null) {
                        bVar2.a(bVar);
                    }
                    bVar2.b();
                    return bVar2;
                }
            }
        }
        h<BoxSession> D = new BoxSessionAuthCreationRequest(this, this.mEnableBoxAppAuthentication).D();
        if (bVar != null) {
            D.a(bVar);
        }
        this.mLastAuthCreationTaskId = D.toString();
        e0.execute(D);
        return D;
    }

    public Context q() {
        return this.q;
    }

    public BoxAuthentication.BoxAuthenticationInfo r() {
        return this.mAuthInfo;
    }

    public String s() {
        return this.mAccountEmail;
    }

    public File t() {
        return new File(q().getFilesDir(), G());
    }

    public String u() {
        return this.mClientId;
    }

    public String w() {
        return this.mClientSecret;
    }

    public String x() {
        return this.mDeviceId;
    }

    public String y() {
        return this.mDeviceName;
    }

    public BoxMDMData z() {
        return this.mMDMData;
    }

    public BoxSession(Context context, String str, String str2, String str3, String str4) {
        this.mUserAgent = "com.box.sdk.android/" + g.j;
        this.q = g.i;
        this.mSuppressAuthErrorUIAfterLogin = false;
        this.mEnableBoxAppAuthentication = g.e;
        this.mClientId = str2;
        this.mClientSecret = str3;
        this.mClientRedirectUrl = str4;
        B();
        if (!SdkUtils.l(this.mClientId) && !SdkUtils.l(this.mClientSecret)) {
            this.q = context.getApplicationContext();
            if (!SdkUtils.l(str)) {
                this.mAuthInfo = BoxAuthentication.o().l(str, context);
                this.mUserId = str;
            }
            if (this.mAuthInfo == null) {
                this.mUserId = str;
                this.mAuthInfo = new BoxAuthentication.BoxAuthenticationInfo();
            }
            this.mAuthInfo.P(this.mClientId);
            T();
            return;
        }
        throw new RuntimeException("Session must have a valid client id and client secret specified.");
    }

    public <E extends BoxAuthentication.g & Serializable> BoxSession(Context context, BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo, E e) {
        this.mUserAgent = "com.box.sdk.android/" + g.j;
        this.q = g.i;
        this.mSuppressAuthErrorUIAfterLogin = false;
        this.mEnableBoxAppAuthentication = g.e;
        this.q = context.getApplicationContext();
        N(boxAuthenticationInfo);
        T();
    }

    public <E extends BoxAuthentication.g & Serializable> BoxSession(Context context, String str, E e) {
        this(context, p(str), e);
    }
}
