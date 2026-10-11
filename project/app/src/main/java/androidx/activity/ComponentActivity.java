/*
 * Decompiled with CFR 0.152.
 */
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
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ImmLeaksCleaner;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.d;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.q;
import ax.G0.v;
import ax.Gb.g;
import ax.Gb.l;
import ax.I0.a;
import ax.P.h;
import ax.P.q;
import ax.P.r;
import ax.P.t;
import ax.c0.B;
import ax.c0.z;
import ax.i.j;
import ax.i.k;
import ax.i.p;
import ax.i.u;
import ax.i.w;
import ax.i.x;
import ax.l.a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

public class ComponentActivity
extends h
implements ax.G0.h,
v,
androidx.lifecycle.c,
ax.n2.d,
u,
ax.k.f,
ax.Q.e,
ax.Q.f,
q,
r,
ax.c0.w,
ax.i.q {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final b Companion = new b(null);
    private androidx.lifecycle.r _viewModelStore;
    private final ax.k.e activityResultRegistry;
    private int contentLayoutId;
    private final ax.j.a contextAwareHelper = new ax.j.a();
    private final ax.sb.h defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final ax.sb.h fullyDrawnReporter$delegate;
    private final z menuHostHelper = new z(new ax.i.d(this));
    private final AtomicInteger nextLocalRequestCode;
    private final ax.sb.h onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<ax.b0.a<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<ax.b0.a<ax.P.i>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<ax.b0.a<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<ax.b0.a<t>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<ax.b0.a<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final d reportFullyDrawnExecutor;
    private final ax.n2.c savedStateRegistryController;

    public ComponentActivity() {
        ax.n2.c c8;
        this.savedStateRegistryController = c8 = ax.n2.c.d.a(this);
        this.reportFullyDrawnExecutor = this.createFullyDrawnExecutor();
        this.fullyDrawnReporter$delegate = ax.sb.i.a(new ax.Fb.a<p>(this){
            final ComponentActivity q;
            {
                this.q = componentActivity;
                super(0);
            }

            public final p a() {
                return new p(this.q.reportFullyDrawnExecutor, new ax.Fb.a<ax.sb.t>(this.q){
                    final ComponentActivity q;
                    {
                        this.q = componentActivity;
                        super(0);
                    }

                    public final void a() {
                        this.q.reportFullyDrawn();
                    }
                });
            }
        });
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new ax.k.e(this){
            final ComponentActivity i;
            {
                this.i = componentActivity;
            }

            public static /* synthetic */ void q(f f8, int n8, IntentSender.SendIntentException sendIntentException) {
                f.t(f8, n8, sendIntentException);
            }

            public static /* synthetic */ void r(f f8, int n8, a.a a8) {
                f.s(f8, n8, a8);
            }

            private static final void s(f f8, int n8, a.a a8) {
                l.f(f8, "this$0");
                f8.f(n8, a8.a());
            }

            private static final void t(f f8, int n8, IntentSender.SendIntentException sendIntentException) {
                l.f(f8, "this$0");
                l.f(sendIntentException, "$e");
                f8.e(n8, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (Serializable)sendIntentException));
            }

            /*
             * WARNING - void declaration
             */
            @Override
            public <I, O> void i(int n8, ax.l.a<I, O> stringArray, I object, ax.P.c object2) {
                block11: {
                    IntentSender.SendIntentException var2_4;
                    int n9;
                    int n10;
                    Intent intent;
                    l.f(stringArray, "contract");
                    object2 = this.i;
                    Object object3 = stringArray.b((Context)object2, object);
                    if (object3 != null) {
                        new Handler(Looper.getMainLooper()).post((Runnable)new j(this, n8, (a.a)object3));
                        return;
                    }
                    if ((object = stringArray.a((Context)object2, object)).getExtras() != null) {
                        stringArray = object.getExtras();
                        l.c(stringArray);
                        if (stringArray.getClassLoader() == null) {
                            object.setExtrasClassLoader(object2.getClassLoader());
                        }
                    }
                    if (object.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                        stringArray = object.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                        object.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    } else {
                        stringArray = null;
                    }
                    if (l.a("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", object.getAction())) {
                        object = object.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                        stringArray = object;
                        if (object == null) {
                            stringArray = new String[]{};
                        }
                        ax.P.b.s((Activity)object2, stringArray, n8);
                        return;
                    }
                    if (!l.a("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", object.getAction())) break block11;
                    object3 = (ax.k.g)object.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                    try {
                        l.c(object3);
                        object = ((ax.k.g)object3).d();
                        intent = ((ax.k.g)object3).a();
                        n10 = ((ax.k.g)object3).b();
                        n9 = ((ax.k.g)object3).c();
                    }
                    catch (IntentSender.SendIntentException sendIntentException) {}
                    try {
                        ax.P.b.x((Activity)object2, object, n8, intent, n10, n9, 0, (Bundle)stringArray);
                        return;
                    }
                    catch (IntentSender.SendIntentException sendIntentException) {}
                    new Handler(Looper.getMainLooper()).post((Runnable)new k(this, n8, (IntentSender.SendIntentException)var2_4));
                    return;
                }
                ax.P.b.w((Activity)object2, object, n8, (Bundle)stringArray);
            }
        };
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList();
        this.onNewIntentListeners = new CopyOnWriteArrayList();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList();
        if (this.getLifecycle() != null) {
            this.getLifecycle().a(new ax.i.e(this));
            this.getLifecycle().a(new ax.i.f(this));
            this.getLifecycle().a(new androidx.lifecycle.f(this){
                final ComponentActivity q;
                {
                    this.q = componentActivity;
                }

                @Override
                public void b(ax.G0.h h8, d.a a8) {
                    l.f(h8, "source");
                    l.f((Object)a8, "event");
                    this.q.ensureViewModelStore();
                    this.q.getLifecycle().c(this);
                }
            });
            c8.c();
            m.c(this);
            if (Build.VERSION.SDK_INT <= 23) {
                this.getLifecycle().a(new ImmLeaksCleaner(this));
            }
            this.getSavedStateRegistry().h(ACTIVITY_RESULT_TAG, new ax.i.g(this));
            this.addOnContextAvailableListener(new ax.i.h(this));
            this.defaultViewModelProviderFactory$delegate = ax.sb.i.a(new ax.Fb.a<n>(this){
                final ComponentActivity q;
                {
                    this.q = componentActivity;
                    super(0);
                }

                public final n a() {
                    Application application = this.q.getApplication();
                    ComponentActivity componentActivity = this.q;
                    Bundle bundle = componentActivity.getIntent() != null ? this.q.getIntent().getExtras() : null;
                    return new n(application, componentActivity, bundle);
                }
            });
            this.onBackPressedDispatcher$delegate = ax.sb.i.a(new ax.Fb.a<OnBackPressedDispatcher>(this){
                final ComponentActivity q;
                {
                    this.q = componentActivity;
                    super(0);
                }

                public static /* synthetic */ void a(ComponentActivity componentActivity, OnBackPressedDispatcher onBackPressedDispatcher) {
                    i.f(componentActivity, onBackPressedDispatcher);
                }

                public static /* synthetic */ void b(ComponentActivity componentActivity) {
                    i.e(componentActivity);
                }

                private static final void e(ComponentActivity componentActivity) {
                    IllegalStateException illegalStateException2;
                    block4: {
                        l.f(componentActivity, "this$0");
                        try {
                            ComponentActivity.super.onBackPressed();
                            return;
                        }
                        catch (NullPointerException nullPointerException) {
                            if (!l.a(((Throwable)nullPointerException).getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                                throw nullPointerException;
                            }
                        }
                        catch (IllegalStateException illegalStateException2) {
                            if (!l.a(illegalStateException2.getMessage(), "Can not perform this action after onSaveInstanceState")) break block4;
                        }
                        return;
                    }
                    throw illegalStateException2;
                }

                private static final void f(ComponentActivity componentActivity, OnBackPressedDispatcher onBackPressedDispatcher) {
                    l.f(componentActivity, "this$0");
                    l.f(onBackPressedDispatcher, "$dispatcher");
                    componentActivity.addObserverForBackInvoker(onBackPressedDispatcher);
                }

                public final OnBackPressedDispatcher d() {
                    OnBackPressedDispatcher onBackPressedDispatcher = new OnBackPressedDispatcher(new androidx.activity.b(this.q));
                    ComponentActivity componentActivity = this.q;
                    if (Build.VERSION.SDK_INT >= 33) {
                        if (!l.a(Looper.myLooper(), Looper.getMainLooper())) {
                            new Handler(Looper.getMainLooper()).post((Runnable)new androidx.activity.c(componentActivity, onBackPressedDispatcher));
                            return onBackPressedDispatcher;
                        }
                        componentActivity.addObserverForBackInvoker(onBackPressedDispatcher);
                    }
                    return onBackPressedDispatcher;
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public ComponentActivity(int n8) {
        this();
        this.contentLayoutId = n8;
    }

    private static final void _init_$lambda$2(ComponentActivity componentActivity, ax.G0.h h8, d.a a8) {
        l.f(componentActivity, "this$0");
        l.f(h8, "<anonymous parameter 0>");
        l.f((Object)a8, "event");
        if (a8 == d.a.ON_STOP && (componentActivity = componentActivity.getWindow()) != null && (componentActivity = componentActivity.peekDecorView()) != null) {
            componentActivity.cancelPendingInputEvents();
        }
    }

    private static final void _init_$lambda$3(ComponentActivity componentActivity, ax.G0.h h8, d.a a8) {
        l.f(componentActivity, "this$0");
        l.f(h8, "<anonymous parameter 0>");
        l.f((Object)a8, "event");
        if (a8 == d.a.ON_DESTROY) {
            componentActivity.contextAwareHelper.b();
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().a();
            }
            componentActivity.reportFullyDrawnExecutor.j();
        }
    }

    private static final Bundle _init_$lambda$4(ComponentActivity componentActivity) {
        l.f(componentActivity, "this$0");
        Bundle bundle = new Bundle();
        componentActivity.activityResultRegistry.k(bundle);
        return bundle;
    }

    private static final void _init_$lambda$5(ComponentActivity componentActivity, Context context) {
        l.f(componentActivity, "this$0");
        l.f(context, "it");
        context = componentActivity.getSavedStateRegistry().b(ACTIVITY_RESULT_TAG);
        if (context != null) {
            componentActivity.activityResultRegistry.j((Bundle)context);
        }
    }

    private final void addObserverForBackInvoker(OnBackPressedDispatcher onBackPressedDispatcher) {
        this.getLifecycle().a(new ax.i.i(onBackPressedDispatcher, this));
    }

    private static final void addObserverForBackInvoker$lambda$7(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, ax.G0.h h8, d.a a8) {
        l.f(onBackPressedDispatcher, "$dispatcher");
        l.f(componentActivity, "this$0");
        l.f(h8, "<anonymous parameter 0>");
        l.f((Object)a8, "event");
        if (a8 == d.a.ON_CREATE) {
            onBackPressedDispatcher.n(a.a.a(componentActivity));
        }
    }

    private final d createFullyDrawnExecutor() {
        return new e(this);
    }

    private final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            c c8 = (c)this.getLastNonConfigurationInstance();
            if (c8 != null) {
                this._viewModelStore = c8.b();
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

    private static final void menuHostHelper$lambda$0(ComponentActivity componentActivity) {
        l.f(componentActivity, "this$0");
        componentActivity.invalidateMenu();
    }

    public static /* synthetic */ void u(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, ax.G0.h h8, d.a a8) {
        ComponentActivity.addObserverForBackInvoker$lambda$7(onBackPressedDispatcher, componentActivity, h8, a8);
    }

    public static /* synthetic */ void v(ComponentActivity componentActivity, Context context) {
        ComponentActivity._init_$lambda$5(componentActivity, context);
    }

    public static /* synthetic */ void w(ComponentActivity componentActivity) {
        ComponentActivity.menuHostHelper$lambda$0(componentActivity);
    }

    public static /* synthetic */ void x(ComponentActivity componentActivity, ax.G0.h h8, d.a a8) {
        ComponentActivity._init_$lambda$2(componentActivity, h8, a8);
    }

    public static /* synthetic */ void y(ComponentActivity componentActivity, ax.G0.h h8, d.a a8) {
        ComponentActivity._init_$lambda$3(componentActivity, h8, a8);
    }

    public static /* synthetic */ Bundle z(ComponentActivity componentActivity) {
        return ComponentActivity._init_$lambda$4(componentActivity);
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.initializeViewTreeOwners();
        d d8 = this.reportFullyDrawnExecutor;
        View view2 = this.getWindow().getDecorView();
        l.e(view2, "window.decorView");
        d8.W(view2);
        super.addContentView(view, layoutParams);
    }

    @Override
    public void addMenuProvider(B b8) {
        l.f(b8, "provider");
        this.menuHostHelper.c(b8);
    }

    public void addMenuProvider(B b8, ax.G0.h h8) {
        l.f(b8, "provider");
        l.f(h8, "owner");
        this.menuHostHelper.d(b8, h8);
    }

    @SuppressLint(value={"LambdaLast"})
    public void addMenuProvider(B b8, ax.G0.h h8, d.b b9) {
        l.f(b8, "provider");
        l.f(h8, "owner");
        l.f((Object)b9, "state");
        this.menuHostHelper.e(b8, h8, b9);
    }

    @Override
    public final void addOnConfigurationChangedListener(ax.b0.a<Configuration> a8) {
        l.f(a8, "listener");
        this.onConfigurationChangedListeners.add(a8);
    }

    public final void addOnContextAvailableListener(ax.j.b b8) {
        l.f(b8, "listener");
        this.contextAwareHelper.a(b8);
    }

    @Override
    public final void addOnMultiWindowModeChangedListener(ax.b0.a<ax.P.i> a8) {
        l.f(a8, "listener");
        this.onMultiWindowModeChangedListeners.add(a8);
    }

    public final void addOnNewIntentListener(ax.b0.a<Intent> a8) {
        l.f(a8, "listener");
        this.onNewIntentListeners.add(a8);
    }

    @Override
    public final void addOnPictureInPictureModeChangedListener(ax.b0.a<t> a8) {
        l.f(a8, "listener");
        this.onPictureInPictureModeChangedListeners.add(a8);
    }

    @Override
    public final void addOnTrimMemoryListener(ax.b0.a<Integer> a8) {
        l.f(a8, "listener");
        this.onTrimMemoryListeners.add(a8);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable2) {
        l.f(runnable2, "listener");
        this.onUserLeaveHintListeners.add(runnable2);
    }

    @Override
    public final ax.k.e getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override
    public ax.I0.a getDefaultViewModelCreationExtras() {
        Application application;
        Bundle bundle = null;
        ax.I0.d d8 = new ax.I0.d(null, 1, null);
        if (this.getApplication() != null) {
            a.b<Application> b8 = q.a.g;
            application = this.getApplication();
            l.e(application, "application");
            d8.c(b8, application);
        }
        d8.c(m.a, this);
        d8.c(m.b, this);
        application = this.getIntent();
        if (application != null) {
            bundle = application.getExtras();
        }
        if (bundle != null) {
            d8.c(m.c, bundle);
        }
        return d8;
    }

    public q.b getDefaultViewModelProviderFactory() {
        return (q.b)this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public p getFullyDrawnReporter() {
        return (p)this.fullyDrawnReporter$delegate.getValue();
    }

    public Object getLastCustomNonConfigurationInstance() {
        c c8 = (c)this.getLastNonConfigurationInstance();
        if (c8 != null) {
            return c8.a();
        }
        return null;
    }

    @Override
    public androidx.lifecycle.d getLifecycle() {
        return super.getLifecycle();
    }

    @Override
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher)this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override
    public final androidx.savedstate.a getSavedStateRegistry() {
        return this.savedStateRegistryController.b();
    }

    @Override
    public androidx.lifecycle.r getViewModelStore() {
        if (this.getApplication() != null) {
            this.ensureViewModelStore();
            androidx.lifecycle.r r8 = this._viewModelStore;
            l.c(r8);
            return r8;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void initializeViewTreeOwners() {
        View view = this.getWindow().getDecorView();
        l.e(view, "window.decorView");
        ax.G0.w.a(view, this);
        view = this.getWindow().getDecorView();
        l.e(view, "window.decorView");
        ax.G0.x.a(view, this);
        view = this.getWindow().getDecorView();
        l.e(view, "window.decorView");
        ax.n2.e.a(view, this);
        view = this.getWindow().getDecorView();
        l.e(view, "window.decorView");
        x.a(view, this);
        view = this.getWindow().getDecorView();
        l.e(view, "window.decorView");
        w.a(view, this);
    }

    public void invalidateMenu() {
        this.invalidateOptionsMenu();
    }

    protected void onActivityResult(int n8, int n9, Intent intent) {
        if (!this.activityResultRegistry.e(n8, n9, intent)) {
            super.onActivityResult(n8, n9, intent);
        }
    }

    public void onBackPressed() {
        this.getOnBackPressedDispatcher().k();
    }

    public void onConfigurationChanged(Configuration configuration) {
        l.f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator<ax.b0.a<Configuration>> iterator = this.onConfigurationChangedListeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(configuration);
        }
    }

    @Override
    protected void onCreate(Bundle bundle) {
        this.savedStateRegistryController.d(bundle);
        this.contextAwareHelper.c((Context)this);
        super.onCreate(bundle);
        androidx.lifecycle.k.b.c(this);
        int n8 = this.contentLayoutId;
        if (n8 != 0) {
            this.setContentView(n8);
        }
    }

    public boolean onCreatePanelMenu(int n8, Menu menu) {
        l.f(menu, "menu");
        if (n8 == 0) {
            super.onCreatePanelMenu(n8, menu);
            this.menuHostHelper.f(menu, this.getMenuInflater());
        }
        return true;
    }

    public boolean onMenuItemSelected(int n8, MenuItem menuItem) {
        l.f(menuItem, "item");
        if (super.onMenuItemSelected(n8, menuItem)) {
            return true;
        }
        if (n8 == 0) {
            return this.menuHostHelper.h(menuItem);
        }
        return false;
    }

    public void onMultiWindowModeChanged(boolean bl) {
        if (!this.dispatchingOnMultiWindowModeChanged) {
            Iterator<ax.b0.a<ax.P.i>> iterator = this.onMultiWindowModeChangedListeners.iterator();
            while (iterator.hasNext()) {
                iterator.next().accept(new ax.P.i(bl));
            }
        }
    }

    public void onMultiWindowModeChanged(boolean bl, Configuration configuration) {
        l.f(configuration, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        super.onMultiWindowModeChanged(bl, configuration);
        Iterator<ax.b0.a<ax.P.i>> iterator = this.onMultiWindowModeChangedListeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(new ax.P.i(bl, configuration));
        }
        return;
        finally {
            this.dispatchingOnMultiWindowModeChanged = false;
        }
    }

    protected void onNewIntent(Intent intent) {
        l.f(intent, "intent");
        super.onNewIntent(intent);
        Iterator<ax.b0.a<Intent>> iterator = this.onNewIntentListeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(intent);
        }
    }

    public void onPanelClosed(int n8, Menu menu) {
        l.f(menu, "menu");
        this.menuHostHelper.g(menu);
        super.onPanelClosed(n8, menu);
    }

    public void onPictureInPictureModeChanged(boolean bl) {
        if (!this.dispatchingOnPictureInPictureModeChanged) {
            Iterator<ax.b0.a<t>> iterator = this.onPictureInPictureModeChangedListeners.iterator();
            while (iterator.hasNext()) {
                iterator.next().accept(new t(bl));
            }
        }
    }

    public void onPictureInPictureModeChanged(boolean bl, Configuration configuration) {
        l.f(configuration, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        super.onPictureInPictureModeChanged(bl, configuration);
        Iterator<ax.b0.a<t>> iterator = this.onPictureInPictureModeChangedListeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(new t(bl, configuration));
        }
        return;
        finally {
            this.dispatchingOnPictureInPictureModeChanged = false;
        }
    }

    public boolean onPreparePanel(int n8, View view, Menu menu) {
        l.f(menu, "menu");
        if (n8 == 0) {
            super.onPreparePanel(n8, view, menu);
            this.menuHostHelper.i(menu);
        }
        return true;
    }

    public void onRequestPermissionsResult(int n8, String[] stringArray, int[] nArray) {
        l.f(stringArray, "permissions");
        l.f(nArray, "grantResults");
        if (!this.activityResultRegistry.e(n8, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", stringArray).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", nArray)) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(n8, stringArray, nArray);
        }
    }

    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    public final Object onRetainNonConfigurationInstance() {
        Object object = this.onRetainCustomNonConfigurationInstance();
        Object object2 = this._viewModelStore;
        androidx.lifecycle.r r8 = object2;
        if (object2 == null) {
            c c8 = (c)this.getLastNonConfigurationInstance();
            r8 = object2;
            if (c8 != null) {
                r8 = c8.b();
            }
        }
        if (r8 == null && object == null) {
            return null;
        }
        object2 = new c();
        ((c)object2).c(object);
        ((c)object2).d(r8);
        return object2;
    }

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        l.f(bundle, "outState");
        if (this.getLifecycle() instanceof androidx.lifecycle.g) {
            androidx.lifecycle.d d8 = this.getLifecycle();
            l.d(d8, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((androidx.lifecycle.g)d8).m(d.b.d0);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.e(bundle);
    }

    public void onTrimMemory(int n8) {
        super.onTrimMemory(n8);
        Iterator<ax.b0.a<Integer>> iterator = this.onTrimMemoryListeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(n8);
        }
    }

    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> iterator = this.onUserLeaveHintListeners.iterator();
        while (iterator.hasNext()) {
            iterator.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.d();
    }

    public final <I, O> ax.k.c<I> registerForActivityResult(ax.l.a<I, O> a8, ax.k.b<O> b8) {
        l.f(a8, "contract");
        l.f(b8, "callback");
        return this.registerForActivityResult(a8, this.activityResultRegistry, b8);
    }

    public final <I, O> ax.k.c<I> registerForActivityResult(ax.l.a<I, O> a8, ax.k.e e8, ax.k.b<O> b8) {
        l.f(a8, "contract");
        l.f(e8, "registry");
        l.f(b8, "callback");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("activity_rq#");
        stringBuilder.append(this.nextLocalRequestCode.getAndIncrement());
        return e8.l(stringBuilder.toString(), this, a8, b8);
    }

    @Override
    public void removeMenuProvider(B b8) {
        l.f(b8, "provider");
        this.menuHostHelper.j(b8);
    }

    @Override
    public final void removeOnConfigurationChangedListener(ax.b0.a<Configuration> a8) {
        l.f(a8, "listener");
        this.onConfigurationChangedListeners.remove(a8);
    }

    public final void removeOnContextAvailableListener(ax.j.b b8) {
        l.f(b8, "listener");
        this.contextAwareHelper.e(b8);
    }

    @Override
    public final void removeOnMultiWindowModeChangedListener(ax.b0.a<ax.P.i> a8) {
        l.f(a8, "listener");
        this.onMultiWindowModeChangedListeners.remove(a8);
    }

    public final void removeOnNewIntentListener(ax.b0.a<Intent> a8) {
        l.f(a8, "listener");
        this.onNewIntentListeners.remove(a8);
    }

    @Override
    public final void removeOnPictureInPictureModeChangedListener(ax.b0.a<t> a8) {
        l.f(a8, "listener");
        this.onPictureInPictureModeChangedListeners.remove(a8);
    }

    @Override
    public final void removeOnTrimMemoryListener(ax.b0.a<Integer> a8) {
        l.f(a8, "listener");
        this.onTrimMemoryListeners.remove(a8);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable2) {
        l.f(runnable2, "listener");
        this.onUserLeaveHintListeners.remove(runnable2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void reportFullyDrawn() {
        Throwable throwable2;
        block3: {
            block2: {
                try {
                    if (!ax.u2.b.d()) break block2;
                    ax.u2.b.a("reportFullyDrawn() for ComponentActivity");
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            super.reportFullyDrawn();
            this.getFullyDrawnReporter().b();
            ax.u2.b.b();
            return;
        }
        ax.u2.b.b();
        throw throwable2;
    }

    public void setContentView(int n8) {
        this.initializeViewTreeOwners();
        d d8 = this.reportFullyDrawnExecutor;
        View view = this.getWindow().getDecorView();
        l.e(view, "window.decorView");
        d8.W(view);
        super.setContentView(n8);
    }

    public void setContentView(View view) {
        this.initializeViewTreeOwners();
        d d8 = this.reportFullyDrawnExecutor;
        View view2 = this.getWindow().getDecorView();
        l.e(view2, "window.decorView");
        d8.W(view2);
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.initializeViewTreeOwners();
        d d8 = this.reportFullyDrawnExecutor;
        View view2 = this.getWindow().getDecorView();
        l.e(view2, "window.decorView");
        d8.W(view2);
        super.setContentView(view, layoutParams);
    }

    public void startActivityForResult(Intent intent, int n8) {
        l.f(intent, "intent");
        super.startActivityForResult(intent, n8);
    }

    public void startActivityForResult(Intent intent, int n8, Bundle bundle) {
        l.f(intent, "intent");
        super.startActivityForResult(intent, n8, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int n8, Intent intent, int n9, int n10, int n11) throws IntentSender.SendIntentException {
        l.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, n8, intent, n9, n10, n11);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int n8, Intent intent, int n9, int n10, int n11, Bundle bundle) throws IntentSender.SendIntentException {
        l.f(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, n8, intent, n9, n10, n11, bundle);
    }

    private static final class a {
        public static final a a = new a();

        private a() {
        }

        public final OnBackInvokedDispatcher a(Activity activity) {
            l.f(activity, "activity");
            activity = activity.getOnBackInvokedDispatcher();
            l.e(activity, "activity.getOnBackInvokedDispatcher()");
            return activity;
        }
    }

    private static final class b {
        private b() {
        }

        public /* synthetic */ b(g g8) {
            this();
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

        public final void c(Object object) {
            this.a = object;
        }

        public final void d(androidx.lifecycle.r r8) {
            this.b = r8;
        }
    }

    private static interface d
    extends Executor {
        public void W(View var1);

        public void j();
    }

    private final class e
    implements d,
    ViewTreeObserver.OnDrawListener,
    Runnable {
        private Runnable c0;
        private boolean d0;
        final ComponentActivity e0;
        private final long q;

        public e(ComponentActivity componentActivity) {
            this.e0 = componentActivity;
            this.q = SystemClock.uptimeMillis() + (long)10000;
        }

        public static /* synthetic */ void a(e e8) {
            e.b(e8);
        }

        private static final void b(e e8) {
            l.f(e8, "this$0");
            Runnable runnable2 = e8.c0;
            if (runnable2 != null) {
                l.c(runnable2);
                runnable2.run();
                e8.c0 = null;
            }
        }

        @Override
        public void W(View view) {
            l.f(view, "view");
            if (!this.d0) {
                this.d0 = true;
                view.getViewTreeObserver().addOnDrawListener((ViewTreeObserver.OnDrawListener)this);
            }
        }

        @Override
        public void execute(Runnable runnable2) {
            l.f(runnable2, "runnable");
            this.c0 = runnable2;
            runnable2 = this.e0.getWindow().getDecorView();
            l.e(runnable2, "window.decorView");
            if (this.d0) {
                if (l.a(Looper.myLooper(), Looper.getMainLooper())) {
                    runnable2.invalidate();
                    return;
                }
                runnable2.postInvalidate();
                return;
            }
            runnable2.postOnAnimation(new androidx.activity.a(this));
        }

        @Override
        public void j() {
            this.e0.getWindow().getDecorView().removeCallbacks((Runnable)this);
            this.e0.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener((ViewTreeObserver.OnDrawListener)this);
        }

        public void onDraw() {
            Runnable runnable2 = this.c0;
            if (runnable2 != null) {
                runnable2.run();
                this.c0 = null;
                if (this.e0.getFullyDrawnReporter().c()) {
                    this.d0 = false;
                    this.e0.getWindow().getDecorView().post((Runnable)this);
                    return;
                }
            } else if (SystemClock.uptimeMillis() > this.q) {
                this.d0 = false;
                this.e0.getWindow().getDecorView().post((Runnable)this);
            }
        }

        @Override
        public void run() {
            this.e0.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener((ViewTreeObserver.OnDrawListener)this);
        }
    }
}

