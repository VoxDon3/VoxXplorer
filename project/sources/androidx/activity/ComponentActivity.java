package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.d;
import androidx.lifecycle.k;
import androidx.lifecycle.n;
import androidx.lifecycle.q;
import androidx.savedstate.a;
import ax.G0.v;
import ax.G0.w;
import ax.G0.x;
import ax.Gb.l;
import ax.Gb.m;
import ax.I0.a;
import ax.P.q;
import ax.P.r;
import ax.P.t;
import ax.b0.InterfaceC1440a;
import ax.c0.C1802z;
import ax.c0.InterfaceC1752B;
import ax.c0.InterfaceC1796w;
import ax.i.C2200p;
import ax.i.u;
import ax.j.C2299a;
import ax.j.InterfaceC2300b;
import ax.k.AbstractC2352c;
import ax.k.AbstractC2354e;
import ax.k.C2356g;
import ax.k.InterfaceC2351b;
import ax.k.InterfaceC2355f;
import ax.l.AbstractC2438a;
import ax.n2.C2575c;
import ax.n2.InterfaceC2576d;
import ax.sb.C3077i;
import ax.sb.InterfaceC3076h;
import ax.u2.C3177b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ComponentActivity extends ax.P.h implements ax.G0.h, v, androidx.lifecycle.c, InterfaceC2576d, u, InterfaceC2355f, ax.Q.e, ax.Q.f, q, r, InterfaceC1796w, ax.i.q {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final b Companion = new b(null);
    private androidx.lifecycle.r _viewModelStore;
    private final AbstractC2354e activityResultRegistry;
    private int contentLayoutId;
    private final C2299a contextAwareHelper;
    private final InterfaceC3076h defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final InterfaceC3076h fullyDrawnReporter$delegate;
    private final C1802z menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final InterfaceC3076h onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<InterfaceC1440a<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC1440a<ax.P.i>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC1440a<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<InterfaceC1440a<t>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<InterfaceC1440a<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final d reportFullyDrawnExecutor;
    private final C2575c savedStateRegistryController;

    private static final class a {
        public static final a a = new a();

        private a() {
        }

        public final OnBackInvokedDispatcher a(Activity activity) {
            l.f(activity, "activity");
            OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            l.e(onBackInvokedDispatcher, "activity.getOnBackInvokedDispatcher()");
            return onBackInvokedDispatcher;
        }
    }

    private static final class b {
        public /* synthetic */ b(ax.Gb.g gVar) {
            this();
        }

        private b() {
        }
    }

    public static final class c {
        private Object a;
        private androidx.lifecycle.r b;

        public final Object a() {
            return this.a;
        }

        public final androidx.lifecycle.r b() {
            return this.b;
        }

        public final void c(Object obj) {
            this.a = obj;
        }

        public final void d(androidx.lifecycle.r rVar) {
            this.b = rVar;
        }
    }

    private interface d extends Executor {
        void W(View view);

        void j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class e implements d, ViewTreeObserver.OnDrawListener, Runnable {
        private Runnable c0;
        private boolean d0;
        private final long q = SystemClock.uptimeMillis() + 10000;

        public e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(e eVar) {
            l.f(eVar, "this$0");
            Runnable runnable = eVar.c0;
            if (runnable != null) {
                l.c(runnable);
                runnable.run();
                eVar.c0 = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.d
        public void W(View view) {
            l.f(view, "view");
            if (this.d0) {
                return;
            }
            this.d0 = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            l.f(runnable, "runnable");
            this.c0 = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            l.e(decorView, "window.decorView");
            if (!this.d0) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.e.b(ComponentActivity.e.this);
                    }
                });
            } else if (l.a(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // androidx.activity.ComponentActivity.d
        public void j() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.c0;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.q) {
                    this.d0 = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.c0 = null;
            if (ComponentActivity.this.getFullyDrawnReporter().c()) {
                this.d0 = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public static final class f extends AbstractC2354e {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void s(f fVar, int i, AbstractC2438a.C0356a c0356a) {
            l.f(fVar, "this$0");
            fVar.f(i, c0356a.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(f fVar, int i, IntentSender.SendIntentException sendIntentException) {
            l.f(fVar, "this$0");
            l.f(sendIntentException, "$e");
            fVar.e(i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override // ax.k.AbstractC2354e
        public <I, O> void i(final int i, AbstractC2438a<I, O> abstractC2438a, I i2, ax.P.c cVar) {
            Bundle bundle;
            final int i3;
            l.f(abstractC2438a, "contract");
            ComponentActivity componentActivity = ComponentActivity.this;
            final AbstractC2438a.C0356a<O> b = abstractC2438a.b(componentActivity, i2);
            if (b != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ax.i.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.f.s(ComponentActivity.f.this, i, b);
                    }
                });
                return;
            }
            Intent a = abstractC2438a.a(componentActivity, i2);
            if (a.getExtras() != null) {
                Bundle extras = a.getExtras();
                l.c(extras);
                if (extras.getClassLoader() == null) {
                    a.setExtrasClassLoader(componentActivity.getClassLoader());
                }
            }
            if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundle = null;
            }
            Bundle bundle2 = bundle;
            if (l.a("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", a.getAction())) {
                String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                ax.P.b.s(componentActivity, stringArrayExtra, i);
                return;
            }
            if (!l.a("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", a.getAction())) {
                ax.P.b.w(componentActivity, a, i, bundle2);
                return;
            }
            C2356g c2356g = (C2356g) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                l.c(c2356g);
                i3 = i;
                try {
                    ax.P.b.x(componentActivity, c2356g.d(), i3, c2356g.a(), c2356g.b(), c2356g.c(), 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    e = e;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ax.i.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            ComponentActivity.f.t(ComponentActivity.f.this, i3, sendIntentException);
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                i3 = i;
            }
        }
    }

    static final class g extends m implements ax.Fb.a<n> {
        g() {
            super(0);
        }

        @Override // ax.Fb.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n invoke() {
            Application application = ComponentActivity.this.getApplication();
            ComponentActivity componentActivity = ComponentActivity.this;
            return new n(application, componentActivity, componentActivity.getIntent() != null ? ComponentActivity.this.getIntent().getExtras() : null);
        }
    }

    static final class h extends m implements ax.Fb.a<C2200p> {

        static final class a extends m implements ax.Fb.a<ax.sb.t> {
            final /* synthetic */ ComponentActivity q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ComponentActivity componentActivity) {
                super(0);
                this.q = componentActivity;
            }

            public final void a() {
                this.q.reportFullyDrawn();
            }

            @Override // ax.Fb.a
            public /* bridge */ /* synthetic */ ax.sb.t invoke() {
                a();
                return ax.sb.t.a;
            }
        }

        h() {
            super(0);
        }

        @Override // ax.Fb.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2200p invoke() {
            return new C2200p(ComponentActivity.this.reportFullyDrawnExecutor, new a(ComponentActivity.this));
        }
    }

    static final class i extends m implements ax.Fb.a<OnBackPressedDispatcher> {
        i() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(ComponentActivity componentActivity) {
            l.f(componentActivity, "this$0");
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (!l.a(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e;
                }
            } catch (NullPointerException e2) {
                if (!l.a(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e2;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(ComponentActivity componentActivity, OnBackPressedDispatcher onBackPressedDispatcher) {
            l.f(componentActivity, "this$0");
            l.f(onBackPressedDispatcher, "$dispatcher");
            componentActivity.addObserverForBackInvoker(onBackPressedDispatcher);
        }

        @Override // ax.Fb.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final OnBackPressedDispatcher invoke() {
            final ComponentActivity componentActivity = ComponentActivity.this;
            final OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new Runnable() { // from class: androidx.activity.b
                @Override // java.lang.Runnable
                public final void run() {
                    ComponentActivity.i.e(ComponentActivity.this);
                }
            });
            final ComponentActivity componentActivity2 = ComponentActivity.this;
            if (Build.VERSION.SDK_INT >= 33) {
                if (!l.a(Looper.myLooper(), Looper.getMainLooper())) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: androidx.activity.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            ComponentActivity.i.f(ComponentActivity.this, onBackPressedDispatcher);
                        }
                    });
                    return onBackPressedDispatcher;
                }
                componentActivity2.addObserverForBackInvoker(onBackPressedDispatcher);
            }
            return onBackPressedDispatcher;
        }
    }

    public ComponentActivity() {
        this.contextAwareHelper = new C2299a();
        this.menuHostHelper = new C1802z(new Runnable() { // from class: ax.i.d
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.menuHostHelper$lambda$0(ComponentActivity.this);
            }
        });
        C2575c a2 = C2575c.d.a(this);
        this.savedStateRegistryController = a2;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter$delegate = C3077i.a(new h());
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new f();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().a(new androidx.lifecycle.f() { // from class: ax.i.e
            @Override // androidx.lifecycle.f
            public final void b(ax.G0.h hVar, d.a aVar) {
                ComponentActivity._init_$lambda$2(ComponentActivity.this, hVar, aVar);
            }
        });
        getLifecycle().a(new androidx.lifecycle.f() { // from class: ax.i.f
            @Override // androidx.lifecycle.f
            public final void b(ax.G0.h hVar, d.a aVar) {
                ComponentActivity._init_$lambda$3(ComponentActivity.this, hVar, aVar);
            }
        });
        getLifecycle().a(new androidx.lifecycle.f() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.f
            public void b(ax.G0.h hVar, d.a aVar) {
                l.f(hVar, "source");
                l.f(aVar, "event");
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().c(this);
            }
        });
        a2.c();
        androidx.lifecycle.m.c(this);
        if (Build.VERSION.SDK_INT <= 23) {
            getLifecycle().a(new ImmLeaksCleaner(this));
        }
        getSavedStateRegistry().h(ACTIVITY_RESULT_TAG, new a.c() { // from class: ax.i.g
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle _init_$lambda$4;
                _init_$lambda$4 = ComponentActivity._init_$lambda$4(ComponentActivity.this);
                return _init_$lambda$4;
            }
        });
        addOnContextAvailableListener(new InterfaceC2300b() { // from class: ax.i.h
            @Override // ax.j.InterfaceC2300b
            public final void a(Context context) {
                ComponentActivity._init_$lambda$5(ComponentActivity.this, context);
            }
        });
        this.defaultViewModelProviderFactory$delegate = C3077i.a(new g());
        this.onBackPressedDispatcher$delegate = C3077i.a(new i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity componentActivity, ax.G0.h hVar, d.a aVar) {
        Window window;
        View peekDecorView;
        l.f(componentActivity, "this$0");
        l.f(hVar, "<anonymous parameter 0>");
        l.f(aVar, "event");
        if (aVar != d.a.ON_STOP || (window = componentActivity.getWindow()) == null || (peekDecorView = window.peekDecorView()) == null) {
            return;
        }
        peekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$3(ComponentActivity componentActivity, ax.G0.h hVar, d.a aVar) {
        l.f(componentActivity, "this$0");
        l.f(hVar, "<anonymous parameter 0>");
        l.f(aVar, "event");
        if (aVar == d.a.ON_DESTROY) {
            componentActivity.contextAwareHelper.b();
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().a();
            }
            componentActivity.reportFullyDrawnExecutor.j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$4(ComponentActivity componentActivity) {
        l.f(componentActivity, "this$0");
        Bundle bundle = new Bundle();
        componentActivity.activityResultRegistry.k(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$5(ComponentActivity componentActivity, Context context) {
        l.f(componentActivity, "this$0");
        l.f(context, "it");
        Bundle b2 = componentActivity.getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (b2 != null) {
            componentActivity.activityResultRegistry.j(b2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final OnBackPressedDispatcher onBackPressedDispatcher) {
        getLifecycle().a(new androidx.lifecycle.f() { // from class: ax.i.i
            @Override // androidx.lifecycle.f
            public final void b(ax.G0.h hVar, d.a aVar) {
                ComponentActivity.addObserverForBackInvoker$lambda$7(OnBackPressedDispatcher.this, this, hVar, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$7(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, ax.G0.h hVar, d.a aVar) {
        l.f(onBackPressedDispatcher, "$dispatcher");
        l.f(componentActivity, "this$0");
        l.f(hVar, "<anonymous parameter 0>");
        l.f(aVar, "event");
        if (aVar == d.a.ON_CREATE) {
            onBackPressedDispatcher.n(a.a.a(componentActivity));
        }
    }

    private final d createFullyDrawnExecutor() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this._viewModelStore = cVar.b();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new androidx.lifecycle.r();
            }
        }
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void menuHostHelper$lambda$0(ComponentActivity componentActivity) {
        l.f(componentActivity, "this$0");
        componentActivity.invalidateMenu();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        l.e(decorView, "window.decorView");
        dVar.W(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // ax.c0.InterfaceC1796w
    public void addMenuProvider(InterfaceC1752B interfaceC1752B) {
        l.f(interfaceC1752B, "provider");
        this.menuHostHelper.c(interfaceC1752B);
    }

    @Override // ax.Q.e
    public final void addOnConfigurationChangedListener(InterfaceC1440a<Configuration> interfaceC1440a) {
        l.f(interfaceC1440a, "listener");
        this.onConfigurationChangedListeners.add(interfaceC1440a);
    }

    public final void addOnContextAvailableListener(InterfaceC2300b interfaceC2300b) {
        l.f(interfaceC2300b, "listener");
        this.contextAwareHelper.a(interfaceC2300b);
    }

    @Override // ax.P.q
    public final void addOnMultiWindowModeChangedListener(InterfaceC1440a<ax.P.i> interfaceC1440a) {
        l.f(interfaceC1440a, "listener");
        this.onMultiWindowModeChangedListeners.add(interfaceC1440a);
    }

    public final void addOnNewIntentListener(InterfaceC1440a<Intent> interfaceC1440a) {
        l.f(interfaceC1440a, "listener");
        this.onNewIntentListeners.add(interfaceC1440a);
    }

    @Override // ax.P.r
    public final void addOnPictureInPictureModeChangedListener(InterfaceC1440a<t> interfaceC1440a) {
        l.f(interfaceC1440a, "listener");
        this.onPictureInPictureModeChangedListeners.add(interfaceC1440a);
    }

    @Override // ax.Q.f
    public final void addOnTrimMemoryListener(InterfaceC1440a<Integer> interfaceC1440a) {
        l.f(interfaceC1440a, "listener");
        this.onTrimMemoryListeners.add(interfaceC1440a);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        l.f(runnable, "listener");
        this.onUserLeaveHintListeners.add(runnable);
    }

    @Override // ax.k.InterfaceC2355f
    public final AbstractC2354e getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.c
    public ax.I0.a getDefaultViewModelCreationExtras() {
        ax.I0.d dVar = new ax.I0.d(null, 1, null);
        if (getApplication() != null) {
            a.b<Application> bVar = q.a.g;
            Application application = getApplication();
            l.e(application, "application");
            dVar.c(bVar, application);
        }
        dVar.c(androidx.lifecycle.m.a, this);
        dVar.c(androidx.lifecycle.m.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            dVar.c(androidx.lifecycle.m.c, extras);
        }
        return dVar;
    }

    public q.b getDefaultViewModelProviderFactory() {
        return (q.b) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public C2200p getFullyDrawnReporter() {
        return (C2200p) this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    @Override // ax.P.h, ax.G0.h
    public androidx.lifecycle.d getLifecycle() {
        return super.getLifecycle();
    }

    @Override // ax.i.u
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // ax.n2.InterfaceC2576d
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.savedStateRegistryController.b();
    }

    @Override // ax.G0.v
    public androidx.lifecycle.r getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        androidx.lifecycle.r rVar = this._viewModelStore;
        l.c(rVar);
        return rVar;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        l.e(decorView, "window.decorView");
        w.a(decorView, this);
        View decorView2 = getWindow().getDecorView();
        l.e(decorView2, "window.decorView");
        x.a(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        l.e(decorView3, "window.decorView");
        ax.n2.e.a(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        l.e(decorView4, "window.decorView");
        ax.i.x.a(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        l.e(decorView5, "window.decorView");
        ax.i.w.a(decorView5, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i2, int i3, Intent intent) {
        if (this.activityResultRegistry.e(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        getOnBackPressedDispatcher().k();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        l.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator<InterfaceC1440a<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.savedStateRegistryController.d(bundle);
        this.contextAwareHelper.c(this);
        super.onCreate(bundle);
        k.b.c(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        l.f(menu, "menu");
        if (i2 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        this.menuHostHelper.f(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        l.f(menuItem, "item");
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.menuHostHelper.h(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<InterfaceC1440a<ax.P.i>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new ax.P.i(z));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        l.f(intent, "intent");
        super.onNewIntent(intent);
        Iterator<InterfaceC1440a<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        l.f(menu, "menu");
        this.menuHostHelper.g(menu);
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<InterfaceC1440a<t>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new t(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        l.f(menu, "menu");
        if (i2 != 0) {
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        this.menuHostHelper.i(menu);
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        l.f(strArr, "permissions");
        l.f(iArr, "grantResults");
        if (this.activityResultRegistry.e(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        androidx.lifecycle.r rVar = this._viewModelStore;
        if (rVar == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            rVar = cVar.b();
        }
        if (rVar == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.c(onRetainCustomNonConfigurationInstance);
        cVar2.d(rVar);
        return cVar2;
    }

    @Override // ax.P.h, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        l.f(bundle, "outState");
        if (getLifecycle() instanceof androidx.lifecycle.g) {
            androidx.lifecycle.d lifecycle = getLifecycle();
            l.d(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((androidx.lifecycle.g) lifecycle).m(d.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator<InterfaceC1440a<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i2));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.d();
    }

    public final <I, O> AbstractC2352c<I> registerForActivityResult(AbstractC2438a<I, O> abstractC2438a, AbstractC2354e abstractC2354e, InterfaceC2351b<O> interfaceC2351b) {
        l.f(abstractC2438a, "contract");
        l.f(abstractC2354e, "registry");
        l.f(interfaceC2351b, "callback");
        return abstractC2354e.l("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, abstractC2438a, interfaceC2351b);
    }

    @Override // ax.c0.InterfaceC1796w
    public void removeMenuProvider(InterfaceC1752B interfaceC1752B) {
        l.f(interfaceC1752B, "provider");
        this.menuHostHelper.j(interfaceC1752B);
    }

    @Override // ax.Q.e
    public final void removeOnConfigurationChangedListener(InterfaceC1440a<Configuration> interfaceC1440a) {
        l.f(interfaceC1440a, "listener");
        this.onConfigurationChangedListeners.remove(interfaceC1440a);
    }

    public final void removeOnContextAvailableListener(InterfaceC2300b interfaceC2300b) {
        l.f(interfaceC2300b, "listener");
        this.contextAwareHelper.e(interfaceC2300b);
    }

    @Override // ax.P.q
    public final void removeOnMultiWindowModeChangedListener(InterfaceC1440a<ax.P.i> interfaceC1440a) {
        l.f(interfaceC1440a, "listener");
        this.onMultiWindowModeChangedListeners.remove(interfaceC1440a);
    }

    public final void removeOnNewIntentListener(InterfaceC1440a<Intent> interfaceC1440a) {
        l.f(interfaceC1440a, "listener");
        this.onNewIntentListeners.remove(interfaceC1440a);
    }

    @Override // ax.P.r
    public final void removeOnPictureInPictureModeChangedListener(InterfaceC1440a<t> interfaceC1440a) {
        l.f(interfaceC1440a, "listener");
        this.onPictureInPictureModeChangedListeners.remove(interfaceC1440a);
    }

    @Override // ax.Q.f
    public final void removeOnTrimMemoryListener(InterfaceC1440a<Integer> interfaceC1440a) {
        l.f(interfaceC1440a, "listener");
        this.onTrimMemoryListeners.remove(interfaceC1440a);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        l.f(runnable, "listener");
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C3177b.d()) {
                C3177b.a("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().b();
            C3177b.b();
        } catch (Throwable th) {
            C3177b.b();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        l.e(decorView, "window.decorView");
        dVar.W(decorView);
        super.setContentView(i2);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i2) {
        l.f(intent, "intent");
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        l.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    public void addMenuProvider(InterfaceC1752B interfaceC1752B, ax.G0.h hVar) {
        l.f(interfaceC1752B, "provider");
        l.f(hVar, "owner");
        this.menuHostHelper.d(interfaceC1752B, hVar);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        l.f(intent, "intent");
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        l.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(InterfaceC1752B interfaceC1752B, ax.G0.h hVar, d.b bVar) {
        l.f(interfaceC1752B, "provider");
        l.f(hVar, "owner");
        l.f(bVar, "state");
        this.menuHostHelper.e(interfaceC1752B, hVar, bVar);
    }

    public final <I, O> AbstractC2352c<I> registerForActivityResult(AbstractC2438a<I, O> abstractC2438a, InterfaceC2351b<O> interfaceC2351b) {
        l.f(abstractC2438a, "contract");
        l.f(interfaceC2351b, "callback");
        return registerForActivityResult(abstractC2438a, this.activityResultRegistry, interfaceC2351b);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        l.f(configuration, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<InterfaceC1440a<ax.P.i>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new ax.P.i(z, configuration));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        l.f(configuration, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<InterfaceC1440a<t>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new t(z, configuration));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        l.e(decorView, "window.decorView");
        dVar.W(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        l.e(decorView, "window.decorView");
        dVar.W(decorView);
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i2) {
        this();
        this.contentLayoutId = i2;
    }
}
