/*
 * Decompiled with CFR 0.152.
 */
package com.box.androidsdk.content.models;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import ax.E3.e;
import ax.E3.h;
import ax.H3.g;
import ax.I3.d;
import com.box.androidsdk.content.BoxException;
import com.box.androidsdk.content.auth.BoxAuthentication;
import com.box.androidsdk.content.models.BoxEntity;
import com.box.androidsdk.content.models.BoxMDMData;
import com.box.androidsdk.content.models.BoxObject;
import com.box.androidsdk.content.models.BoxUser;
import com.box.androidsdk.content.requests.BoxRequest;
import com.box.androidsdk.content.requests.BoxRequestsUser$GetUserInfo;
import com.box.androidsdk.content.utils.SdkUtils;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BoxSession
extends BoxObject
implements BoxAuthentication.e {
    private static final transient ThreadPoolExecutor e0 = SdkUtils.f(1, 20, 3600L, TimeUnit.SECONDS);
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

    public <E extends BoxAuthentication.g & Serializable> BoxSession(Context context, BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo, E object) {
        object = new StringBuilder();
        ((StringBuilder)object).append("com.box.sdk.android/");
        ((StringBuilder)object).append(ax.E3.g.j);
        this.mUserAgent = ((StringBuilder)object).toString();
        this.q = ax.E3.g.i;
        this.mSuppressAuthErrorUIAfterLogin = false;
        this.mEnableBoxAppAuthentication = ax.E3.g.e;
        this.q = context.getApplicationContext();
        this.N(boxAuthenticationInfo);
        this.T();
    }

    public BoxSession(Context context, String string) {
        this(context, string, ax.E3.g.c, ax.E3.g.d, ax.E3.g.f);
        if (!SdkUtils.l(ax.E3.g.g)) {
            this.Q(ax.E3.g.g);
        }
        if (!SdkUtils.l(ax.E3.g.h)) {
            this.Q(ax.E3.g.h);
        }
    }

    public <E extends BoxAuthentication.g & Serializable> BoxSession(Context context, String string, E e8) {
        this(context, BoxSession.p(string), e8);
    }

    public BoxSession(Context context, String string, String string2, String string3, String string4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("com.box.sdk.android/");
        stringBuilder.append(ax.E3.g.j);
        this.mUserAgent = stringBuilder.toString();
        this.q = ax.E3.g.i;
        this.mSuppressAuthErrorUIAfterLogin = false;
        this.mEnableBoxAppAuthentication = ax.E3.g.e;
        this.mClientId = string2;
        this.mClientSecret = string3;
        this.mClientRedirectUrl = string4;
        this.B();
        if (!SdkUtils.l(this.mClientId) && !SdkUtils.l(this.mClientSecret)) {
            this.q = context.getApplicationContext();
            if (!SdkUtils.l(string)) {
                this.mAuthInfo = BoxAuthentication.o().l(string, context);
                this.mUserId = string;
            }
            if (this.mAuthInfo == null) {
                this.mUserId = string;
                this.mAuthInfo = new BoxAuthentication.BoxAuthenticationInfo();
            }
            this.mAuthInfo.P(this.mClientId);
            this.T();
            return;
        }
        throw new RuntimeException("Session must have a valid client id and client secret specified.");
    }

    private boolean K(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
        return boxAuthenticationInfo != null && boxAuthenticationInfo.K() != null && this.G() != null && this.G().equals(boxAuthenticationInfo.K().G());
    }

    private static void W(Context context, int n8) {
        SdkUtils.t(context, n8, 1);
    }

    private static BoxAuthentication.BoxAuthenticationInfo p(String string) {
        BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo = new BoxAuthentication.BoxAuthenticationInfo();
        boxAuthenticationInfo.N(string);
        return boxAuthenticationInfo;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        objectInputStream = ax.E3.g.i;
        if (objectInputStream != null) {
            this.M((Context)objectInputStream);
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
        if (weakReference != null && weakReference.get() != null && !((FutureTask)((Object)(weakReference = (h)this.d0.get()))).isCancelled() && !((FutureTask)((Object)weakReference)).isDone()) {
            return weakReference;
        }
        weakReference = new BoxSessionRefreshRequest(this).D();
        new Thread(this, (h)((Object)weakReference)){
            final BoxSession c0;
            final h q;
            {
                this.c0 = boxSession;
                this.q = h8;
            }

            @Override
            public void run() {
                this.q.run();
            }
        }.start();
        this.d0 = new WeakReference<Object>(weakReference);
        return weakReference;
    }

    public void M(Context context) {
        this.q = context.getApplicationContext();
    }

    protected void N(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
        if (boxAuthenticationInfo == null) {
            this.mAuthInfo = boxAuthenticationInfo = new BoxAuthentication.BoxAuthenticationInfo();
            boxAuthenticationInfo.P(this.mClientId);
        } else {
            this.mAuthInfo = boxAuthenticationInfo;
        }
        if (this.mAuthInfo.K() != null && !SdkUtils.k(this.mAuthInfo.K().G())) {
            this.S(this.mAuthInfo.K().G());
            return;
        }
        this.S(null);
    }

    public void O(String string) {
        this.mAccountEmail = string;
    }

    public void P(String string) {
        this.mDeviceId = string;
    }

    public void Q(String string) {
        this.mDeviceName = string;
    }

    public void R(BoxAuthentication.e e8) {
        this.c0 = e8;
    }

    protected void S(String string) {
        this.mUserId = string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void T() {
        boolean bl;
        block4: {
            boolean bl2 = false;
            try {
                Context context = this.q;
                bl = bl2;
                if (context == null) break block4;
                bl = bl2;
                if (context.getPackageManager() == null) break block4;
                if (ax.E3.g.i == null) {
                    ax.E3.g.i = this.q;
                }
                int n8 = this.q.getPackageManager().getPackageInfo((String)this.q.getPackageName(), (int)0).applicationInfo.flags;
                bl = bl2;
                if ((n8 & 2) != 0) {
                    bl = true;
                }
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                bl = bl2;
            }
        }
        ax.E3.g.b = bl;
        BoxAuthentication.o().g(this);
    }

    protected void U() {
        BoxAuthentication.o().y(this);
    }

    public boolean V() {
        return this.mSuppressAuthErrorUIAfterLogin;
    }

    @Override
    public void e(BoxAuthentication.BoxAuthenticationInfo object, Exception exception) {
        block4: {
            BoxAuthentication.e e8;
            block2: {
                block3: {
                    if (this.K((BoxAuthentication.BoxAuthenticationInfo)object)) break block2;
                    if (object != null) break block3;
                    if (this.G() != null) break block4;
                    break block2;
                }
                return;
            }
            if ((e8 = this.c0) != null) {
                e8.e((BoxAuthentication.BoxAuthenticationInfo)object, exception);
            }
            if (exception instanceof BoxException && b.a[((Enum)(object = ((BoxException)exception).c())).ordinal()] == 1) {
                BoxSession.W(this.q, d.p);
            }
        }
    }

    @Override
    public void g(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
        if (this.K(boxAuthenticationInfo)) {
            BoxAuthentication.BoxAuthenticationInfo.E(this.mAuthInfo, boxAuthenticationInfo);
            BoxAuthentication.e e8 = this.c0;
            if (e8 != null) {
                e8.g(boxAuthenticationInfo);
            }
        }
    }

    @Override
    public void h(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
        if (this.K(boxAuthenticationInfo) || this.G() == null) {
            BoxAuthentication.e e8;
            BoxAuthentication.BoxAuthenticationInfo.E(this.mAuthInfo, boxAuthenticationInfo);
            if (boxAuthenticationInfo.K() != null) {
                this.S(boxAuthenticationInfo.K().G());
            }
            if ((e8 = this.c0) != null) {
                e8.h(boxAuthenticationInfo);
            }
        }
    }

    public h<BoxSession> l(Context context) {
        return this.n(context, null);
    }

    public h<BoxSession> n(Context object, h.b<BoxSession> b8) {
        if (object != null) {
            object = object.getApplicationContext();
            this.q = object;
            ax.E3.g.i = object;
        }
        if (!SdkUtils.k(this.mLastAuthCreationTaskId) && (object = e0) instanceof g && (object = ((g)object).a(this.mLastAuthCreationTaskId)) instanceof BoxSessionAuthCreationRequest.b) {
            object = (BoxSessionAuthCreationRequest.b)object;
            if (b8 != null) {
                ((h)object).a(b8);
            }
            ((BoxSessionAuthCreationRequest.b)object).b();
            return object;
        }
        object = new BoxSessionAuthCreationRequest(this, this.mEnableBoxAppAuthentication).D();
        if (b8 != null) {
            ((h)object).a(b8);
        }
        this.mLastAuthCreationTaskId = object.toString();
        e0.execute((Runnable)object);
        return object;
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
        return new File(this.q().getFilesDir(), this.G());
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

    private static class BoxSessionAuthCreationRequest
    extends BoxRequest<BoxSession, BoxSessionAuthCreationRequest>
    implements BoxAuthentication.e {
        private static final long serialVersionUID = 8123965031279971545L;
        private boolean mIsWaitingForLoginUi;
        private final BoxSession mSession;

        public BoxSessionAuthCreationRequest(BoxSession boxSession, boolean bl) {
            super(null, " ", null);
            this.mSession = boxSession;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void G() {
            BoxSession boxSession = this.mSession;
            synchronized (boxSession) {
                Throwable throwable2;
                block7: {
                    try {
                        this.mIsWaitingForLoginUi = true;
                        Handler handler = new Handler(Looper.getMainLooper());
                        Runnable runnable2 = new Runnable(this){
                            final BoxSessionAuthCreationRequest q;
                            {
                                this.q = boxSessionAuthCreationRequest;
                            }

                            @Override
                            public void run() {
                                this.q.mSession.B();
                                this.q.mSession.U();
                            }
                        };
                        handler.post(runnable2);
                        try {
                            while (this.mIsWaitingForLoginUi) {
                                this.mSession.wait();
                            }
                        }
                        catch (InterruptedException interruptedException) {
                            ax.H3.b.a(this.getClass().getSimpleName(), "could not launch auth UI");
                        }
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
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
        private void H() {
            BoxSession boxSession = this.mSession;
            synchronized (boxSession) {
                this.mIsWaitingForLoginUi = false;
                this.mSession.notify();
                return;
            }
        }

        @Override
        public h<BoxSession> D() {
            return new b(BoxSession.class, (BoxRequest)this);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public BoxSession I() throws BoxException {
            BoxSession boxSession = this.mSession;
            synchronized (boxSession) {
                Throwable throwable2;
                block16: {
                    block14: {
                        block15: {
                            try {
                                Object object;
                                if (this.mSession.D() != null) break block14;
                                if (this.mSession.r() == null || SdkUtils.k(this.mSession.r().C()) || (object = this.mSession.D()) != null) break block15;
                                try {
                                    object = new e(this.mSession);
                                    object = (BoxUser)((BoxRequestsUser$GetUserInfo)((e)object).d().E(BoxAuthentication.h)).x();
                                    this.mSession.S(((BoxEntity)object).G());
                                    this.mSession.r().T((BoxUser)object);
                                    BoxAuthentication.o().u(this.mSession.r(), this.mSession.q());
                                    return this.mSession;
                                }
                                catch (BoxException boxException) {
                                    ax.H3.b.b("BoxSession", "Unable to repair user", boxException);
                                    if (boxException instanceof BoxException.RefreshFailure && ((BoxException.RefreshFailure)boxException).g()) {
                                        BoxSession.W(this.mSession.q(), d.o);
                                    } else {
                                        if (boxException.c() != BoxException.ErrorType.i0) {
                                            this.mSession.e(null, boxException);
                                            throw boxException;
                                        }
                                        BoxSession.W(this.mSession.q(), d.q);
                                    }
                                }
                            }
                            catch (Throwable throwable2) {
                                break block16;
                            }
                        }
                        BoxAuthentication.o().g(this);
                        this.G();
                        return this.mSession;
                    }
                    Object object = BoxAuthentication.o().l(this.mSession.G(), this.mSession.q());
                    if (object != null) {
                        BoxException boxException2;
                        block17: {
                            boolean bl;
                            BoxAuthentication.BoxAuthenticationInfo.E(this.mSession.mAuthInfo, (BoxAuthentication.BoxAuthenticationInfo)object);
                            if (SdkUtils.k(this.mSession.r().C()) && SdkUtils.k(this.mSession.r().M())) {
                                BoxAuthentication.o().g(this);
                                this.G();
                                return this.mSession;
                            }
                            if (((BoxAuthentication.BoxAuthenticationInfo)object).K() == null || (bl = SdkUtils.k(((BoxAuthentication.BoxAuthenticationInfo)object).K().G()))) {
                                try {
                                    object = new e(this.mSession);
                                    object = (BoxUser)((BoxRequestsUser$GetUserInfo)((e)object).d().E(BoxAuthentication.h)).x();
                                    this.mSession.S(((BoxEntity)object).G());
                                    this.mSession.r().T((BoxUser)object);
                                    object = this.mSession;
                                    ((BoxSession)object).h(((BoxSession)object).r());
                                    return this.mSession;
                                }
                                catch (BoxException boxException2) {
                                    ax.H3.b.b("BoxSession", "Unable to repair user", boxException2);
                                    if (boxException2 instanceof BoxException.RefreshFailure && ((BoxException.RefreshFailure)boxException2).g()) {
                                        BoxSession.W(this.mSession.q(), d.o);
                                    }
                                    if (boxException2.c() != BoxException.ErrorType.i0) break block17;
                                    BoxSession.W(this.mSession.q(), d.q);
                                }
                            }
                            object = this.mSession;
                            ((BoxSession)object).h(((BoxSession)object).r());
                            return this.mSession;
                        }
                        this.mSession.e(null, boxException2);
                        throw boxException2;
                    }
                    this.mSession.mAuthInfo.T(null);
                    this.G();
                    return this.mSession;
                }
                throw throwable2;
            }
        }

        @Override
        public void e(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo, Exception exception) {
            this.H();
        }

        @Override
        public boolean equals(Object object) {
            if (object instanceof BoxSessionAuthCreationRequest && ((BoxSessionAuthCreationRequest)object).mSession.equals(this.mSession)) {
                return super.equals(object);
            }
            return false;
        }

        @Override
        public void g(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
        }

        @Override
        public void h(BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo) {
            this.H();
        }

        @Override
        public int hashCode() {
            return this.mSession.hashCode() + super.hashCode();
        }

        static class b
        extends h<BoxSession> {
            public b(Class<BoxSession> clazz, BoxRequest boxRequest) {
                super(clazz, boxRequest);
            }

            public void b() {
                BoxRequest boxRequest = this.q;
                if (boxRequest instanceof BoxSessionAuthCreationRequest && ((BoxSessionAuthCreationRequest)boxRequest).mIsWaitingForLoginUi) {
                    ((BoxSessionAuthCreationRequest)this.q).mSession.U();
                }
            }
        }
    }

    private static class BoxSessionRefreshRequest
    extends BoxRequest<BoxSession, BoxSessionRefreshRequest> {
        private static final long serialVersionUID = 8123965031279971587L;
        private BoxSession mSession;

        public BoxSessionRefreshRequest(BoxSession boxSession) {
            super(null, " ", null);
            this.mSession = boxSession;
        }

        public BoxSession E() throws BoxException {
            Exception exception;
            block4: {
                Exception exception22;
                block5: {
                    try {
                        BoxAuthentication.BoxAuthenticationInfo boxAuthenticationInfo = BoxAuthentication.o().w(this.mSession).get();
                    }
                    catch (Exception exception22) {
                        ax.H3.b.b("BoxSession", "Unable to repair user", exception22);
                        exception = exception22.getCause() instanceof BoxException ? (Exception)exception22.getCause() : exception22;
                        if (!(exception instanceof BoxException)) break block4;
                        if (!this.mSession.mSuppressAuthErrorUIAfterLogin) break block5;
                        this.mSession.e(null, exception);
                    }
                    BoxAuthentication.BoxAuthenticationInfo.E(this.mSession.mAuthInfo, BoxAuthentication.o().l(this.mSession.G(), this.mSession.q()));
                    return this.mSession;
                }
                if (exception instanceof BoxException.RefreshFailure && ((BoxException.RefreshFailure)exception).g()) {
                    BoxSession.W(this.mSession.q(), d.o);
                    this.mSession.U();
                    BoxSession boxSession = this.mSession;
                    boxSession.e(boxSession.r(), exception);
                    throw (BoxException)exception;
                }
                if (((BoxException)exception22).c() == BoxException.ErrorType.i0) {
                    BoxSession.W(this.mSession.q(), d.q);
                    this.mSession.U();
                    BoxSession boxSession = this.mSession;
                    boxSession.e(boxSession.r(), exception);
                    ax.H3.b.b("BoxSession", "TOS refresh exception ", exception);
                    throw (BoxException)exception;
                }
                this.mSession.e(null, exception);
                throw (BoxException)exception;
            }
            throw new BoxException("BoxSessionRefreshRequest failed", exception);
        }
    }
}

