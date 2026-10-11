package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.d;
import androidx.savedstate.a;
import ax.P.b;
import ax.b0.InterfaceC1440a;
import ax.c0.InterfaceC1752B;
import ax.c0.InterfaceC1796w;
import ax.j.InterfaceC2300b;
import ax.k.AbstractC2354e;
import ax.k.InterfaceC2355f;
import ax.n2.InterfaceC2576d;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class f extends ComponentActivity implements b.f, b.g {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.g mFragmentLifecycleRegistry;
    final h mFragments;
    boolean mResumed;
    boolean mStopped;

    class a extends j<f> implements ax.Q.e, ax.Q.f, ax.P.q, ax.P.r, ax.G0.v, ax.i.u, InterfaceC2355f, InterfaceC2576d, ax.A0.k, InterfaceC1796w {
        public a() {
            super(f.this);
        }

        @Override // ax.A0.k
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            f.this.onAttachFragment(fragment);
        }

        @Override // ax.c0.InterfaceC1796w
        public void addMenuProvider(InterfaceC1752B interfaceC1752B) {
            f.this.addMenuProvider(interfaceC1752B);
        }

        @Override // ax.Q.e
        public void addOnConfigurationChangedListener(InterfaceC1440a<Configuration> interfaceC1440a) {
            f.this.addOnConfigurationChangedListener(interfaceC1440a);
        }

        @Override // ax.P.q
        public void addOnMultiWindowModeChangedListener(InterfaceC1440a<ax.P.i> interfaceC1440a) {
            f.this.addOnMultiWindowModeChangedListener(interfaceC1440a);
        }

        @Override // ax.P.r
        public void addOnPictureInPictureModeChangedListener(InterfaceC1440a<ax.P.t> interfaceC1440a) {
            f.this.addOnPictureInPictureModeChangedListener(interfaceC1440a);
        }

        @Override // ax.Q.f
        public void addOnTrimMemoryListener(InterfaceC1440a<Integer> interfaceC1440a) {
            f.this.addOnTrimMemoryListener(interfaceC1440a);
        }

        @Override // androidx.fragment.app.j, ax.A0.e
        public View c(int i) {
            return f.this.findViewById(i);
        }

        @Override // androidx.fragment.app.j, ax.A0.e
        public boolean d() {
            Window window = f.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // ax.k.InterfaceC2355f
        public AbstractC2354e getActivityResultRegistry() {
            return f.this.getActivityResultRegistry();
        }

        @Override // ax.G0.h
        public androidx.lifecycle.d getLifecycle() {
            return f.this.mFragmentLifecycleRegistry;
        }

        @Override // ax.i.u
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return f.this.getOnBackPressedDispatcher();
        }

        @Override // ax.n2.InterfaceC2576d
        public androidx.savedstate.a getSavedStateRegistry() {
            return f.this.getSavedStateRegistry();
        }

        @Override // ax.G0.v
        public androidx.lifecycle.r getViewModelStore() {
            return f.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.j
        public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            f.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.j
        public LayoutInflater j() {
            return f.this.getLayoutInflater().cloneInContext(f.this);
        }

        @Override // androidx.fragment.app.j
        public boolean l(String str) {
            return ax.P.b.v(f.this, str);
        }

        @Override // androidx.fragment.app.j
        public void o() {
            p();
        }

        public void p() {
            f.this.invalidateMenu();
        }

        @Override // androidx.fragment.app.j
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public f i() {
            return f.this;
        }

        @Override // ax.c0.InterfaceC1796w
        public void removeMenuProvider(InterfaceC1752B interfaceC1752B) {
            f.this.removeMenuProvider(interfaceC1752B);
        }

        @Override // ax.Q.e
        public void removeOnConfigurationChangedListener(InterfaceC1440a<Configuration> interfaceC1440a) {
            f.this.removeOnConfigurationChangedListener(interfaceC1440a);
        }

        @Override // ax.P.q
        public void removeOnMultiWindowModeChangedListener(InterfaceC1440a<ax.P.i> interfaceC1440a) {
            f.this.removeOnMultiWindowModeChangedListener(interfaceC1440a);
        }

        @Override // ax.P.r
        public void removeOnPictureInPictureModeChangedListener(InterfaceC1440a<ax.P.t> interfaceC1440a) {
            f.this.removeOnPictureInPictureModeChangedListener(interfaceC1440a);
        }

        @Override // ax.Q.f
        public void removeOnTrimMemoryListener(InterfaceC1440a<Integer> interfaceC1440a) {
            f.this.removeOnTrimMemoryListener(interfaceC1440a);
        }
    }

    public f() {
        this.mFragments = h.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.g(this);
        this.mStopped = true;
        init();
    }

    public static /* synthetic */ Bundle D(f fVar) {
        fVar.markFragmentsCreated();
        fVar.mFragmentLifecycleRegistry.h(d.a.ON_STOP);
        return new Bundle();
    }

    private void init() {
        getSavedStateRegistry().h(LIFECYCLE_TAG, new a.c() { // from class: ax.A0.a
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                return androidx.fragment.app.f.D(androidx.fragment.app.f.this);
            }
        });
        addOnConfigurationChangedListener(new InterfaceC1440a() { // from class: ax.A0.b
            @Override // ax.b0.InterfaceC1440a
            public final void accept(Object obj) {
                androidx.fragment.app.f.this.mFragments.m();
            }
        });
        addOnNewIntentListener(new InterfaceC1440a() { // from class: ax.A0.c
            @Override // ax.b0.InterfaceC1440a
            public final void accept(Object obj) {
                androidx.fragment.app.f.this.mFragments.m();
            }
        });
        addOnContextAvailableListener(new InterfaceC2300b() { // from class: ax.A0.d
            @Override // ax.j.InterfaceC2300b
            public final void a(Context context) {
                androidx.fragment.app.f.this.mFragments.a(null);
            }
        });
    }

    private static boolean markState(FragmentManager fragmentManager, d.b bVar) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.v0()) {
            if (fragment != null) {
                if (fragment.t0() != null) {
                    z |= markState(fragment.k0(), bVar);
                }
                x xVar = fragment.U;
                if (xVar != null && xVar.getLifecycle().b().h(d.b.STARTED)) {
                    fragment.U.f(bVar);
                    z = true;
                }
                if (fragment.T.b().h(d.b.STARTED)) {
                    fragment.T.m(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.n(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                ax.J0.a.c(this).b(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.l().Y(str, fileDescriptor, printWriter, strArr);
        }
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @Deprecated
    public ax.J0.a getSupportLoaderManager() {
        return ax.J0.a.c(this);
    }

    void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), d.b.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, ax.P.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.h(d.a.ON_CREATE);
        this.mFragments.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.h(d.a.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.h(d.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.m();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.m();
        super.onResume();
        this.mResumed = true;
        this.mFragments.k();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.h(d.a.ON_RESUME);
        this.mFragments.h();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.m();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.k();
        this.mFragmentLifecycleRegistry.h(d.a.ON_START);
        this.mFragments.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.h(d.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(ax.P.v vVar) {
        ax.P.b.t(this, vVar);
    }

    public void setExitSharedElementCallback(ax.P.v vVar) {
        ax.P.b.u(this, vVar);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            ax.P.b.x(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.I2(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        ax.P.b.p(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        ax.P.b.q(this);
    }

    public void supportStartPostponedEnterTransition() {
        ax.P.b.y(this);
    }

    @Override // ax.P.b.g
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            ax.P.b.w(this, intent, -1, bundle);
        } else {
            fragment.H2(intent, i, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public f(int i) {
        super(i);
        this.mFragments = h.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.g(this);
        this.mStopped = true;
        init();
    }
}
