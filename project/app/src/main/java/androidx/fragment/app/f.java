/*
 * Decompiled with CFR 0.152.
 */
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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.h;
import androidx.fragment.app.j;
import androidx.fragment.app.x;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import ax.A0.b;
import ax.A0.c;
import ax.A0.d;
import ax.A0.k;
import ax.G0.v;
import ax.P.b;
import ax.P.i;
import ax.P.q;
import ax.P.r;
import ax.P.t;
import ax.c0.B;
import ax.c0.w;
import ax.i.u;
import ax.k.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;

public class f
extends ComponentActivity
implements b.f,
b.g {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final g mFragmentLifecycleRegistry;
    final h mFragments = h.b(new a(this));
    boolean mResumed;
    boolean mStopped = true;

    public f() {
        this.mFragmentLifecycleRegistry = new g(this);
        this.init();
    }

    public f(int n8) {
        super(n8);
        this.mFragmentLifecycleRegistry = new g(this);
        this.init();
    }

    public static /* synthetic */ void B(f f8, Context context) {
        f8.mFragments.a(null);
    }

    public static /* synthetic */ void C(f f8, Configuration configuration) {
        f8.mFragments.m();
    }

    public static /* synthetic */ Bundle D(f f8) {
        f8.markFragmentsCreated();
        f8.mFragmentLifecycleRegistry.h(d.a.ON_STOP);
        return new Bundle();
    }

    public static /* synthetic */ void E(f f8, Intent intent) {
        f8.mFragments.m();
    }

    private void init() {
        this.getSavedStateRegistry().h(LIFECYCLE_TAG, new ax.A0.a(this));
        this.addOnConfigurationChangedListener(new b(this));
        this.addOnNewIntentListener(new c(this));
        this.addOnContextAvailableListener(new d(this));
    }

    private static boolean markState(FragmentManager object, d.b b8) {
        Iterator iterator = ((FragmentManager)object).v0().iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            Fragment fragment = (Fragment)iterator.next();
            if (fragment == null) continue;
            boolean bl2 = bl;
            if (fragment.t0() != null) {
                bl2 = bl | f.markState(fragment.k0(), b8);
            }
            object = fragment.U;
            bl = bl2;
            if (object != null) {
                bl = bl2;
                if (((x)object).getLifecycle().b().h(d.b.e0)) {
                    fragment.U.f(b8);
                    bl = true;
                }
            }
            if (!fragment.T.b().h(d.b.e0)) continue;
            fragment.T.m(b8);
            bl = true;
        }
        return bl;
    }

    final View dispatchFragmentsOnCreateView(View view, String string, Context context, AttributeSet attributeSet) {
        return this.mFragments.n(view, string, context, attributeSet);
    }

    public void dump(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        super.dump(string, fileDescriptor, printWriter, stringArray);
        if (!this.shouldDumpInternalState(stringArray)) {
            return;
        }
        printWriter.print(string);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        CharSequence charSequence = new StringBuilder();
        charSequence.append(string);
        charSequence.append("  ");
        charSequence = charSequence.toString();
        printWriter.print((String)charSequence);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (this.getApplication() != null) {
            ax.J0.a.c(this).b((String)charSequence, fileDescriptor, printWriter, stringArray);
        }
        this.mFragments.l().Y(string, fileDescriptor, printWriter, stringArray);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.l();
    }

    @Deprecated
    public ax.J0.a getSupportLoaderManager() {
        return ax.J0.a.c(this);
    }

    void markFragmentsCreated() {
        while (f.markState(this.getSupportFragmentManager(), d.b.d0)) {
        }
    }

    @Override
    protected void onActivityResult(int n8, int n9, Intent intent) {
        this.mFragments.m();
        super.onActivityResult(n8, n9, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.h(d.a.ON_CREATE);
        this.mFragments.e();
    }

    public View onCreateView(View view, String string, Context context, AttributeSet attributeSet) {
        View view2 = this.dispatchFragmentsOnCreateView(view, string, context, attributeSet);
        if (view2 == null) {
            return super.onCreateView(view, string, context, attributeSet);
        }
        return view2;
    }

    public View onCreateView(String string, Context context, AttributeSet attributeSet) {
        View view = this.dispatchFragmentsOnCreateView(null, string, context, attributeSet);
        if (view == null) {
            return super.onCreateView(string, context, attributeSet);
        }
        return view;
    }

    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.f();
        this.mFragmentLifecycleRegistry.h(d.a.ON_DESTROY);
    }

    @Override
    public boolean onMenuItemSelected(int n8, MenuItem menuItem) {
        if (super.onMenuItemSelected(n8, menuItem)) {
            return true;
        }
        if (n8 == 6) {
            return this.mFragments.d(menuItem);
        }
        return false;
    }

    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.g();
        this.mFragmentLifecycleRegistry.h(d.a.ON_PAUSE);
    }

    protected void onPostResume() {
        super.onPostResume();
        this.onResumeFragments();
    }

    @Override
    public void onRequestPermissionsResult(int n8, String[] stringArray, int[] nArray) {
        this.mFragments.m();
        super.onRequestPermissionsResult(n8, stringArray, nArray);
    }

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

    public void onStateNotSaved() {
        this.mFragments.m();
    }

    protected void onStop() {
        super.onStop();
        this.mStopped = true;
        this.markFragmentsCreated();
        this.mFragments.j();
        this.mFragmentLifecycleRegistry.h(d.a.ON_STOP);
    }

    public void setEnterSharedElementCallback(ax.P.v v8) {
        ax.P.b.t(this, v8);
    }

    public void setExitSharedElementCallback(ax.P.v v8) {
        ax.P.b.u(this, v8);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint(value={"UnknownNullness"}) Intent intent, int n8) {
        this.startActivityFromFragment(fragment, intent, n8, null);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint(value={"UnknownNullness"}) Intent intent, int n8, Bundle bundle) {
        if (n8 == -1) {
            ax.P.b.w(this, intent, -1, bundle);
            return;
        }
        fragment.H2(intent, n8, bundle);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint(value={"UnknownNullness"}) IntentSender intentSender, int n8, Intent intent, int n9, int n10, int n11, Bundle bundle) throws IntentSender.SendIntentException {
        if (n8 == -1) {
            ax.P.b.x(this, intentSender, n8, intent, n9, n10, n11, bundle);
            return;
        }
        fragment.I2(intentSender, n8, intent, n9, n10, n11, bundle);
    }

    public void supportFinishAfterTransition() {
        ax.P.b.p(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        this.invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        ax.P.b.q(this);
    }

    public void supportStartPostponedEnterTransition() {
        ax.P.b.y(this);
    }

    @Override
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int n8) {
    }

    class a
    extends j<f>
    implements ax.Q.e,
    ax.Q.f,
    q,
    r,
    v,
    u,
    ax.k.f,
    ax.n2.d,
    k,
    w {
        final f f;

        public a(f f8) {
            this.f = f8;
            super(f8);
        }

        @Override
        public void a(FragmentManager fragmentManager, Fragment fragment) {
            this.f.onAttachFragment(fragment);
        }

        @Override
        public void addMenuProvider(B b8) {
            this.f.addMenuProvider(b8);
        }

        @Override
        public void addOnConfigurationChangedListener(ax.b0.a<Configuration> a8) {
            this.f.addOnConfigurationChangedListener(a8);
        }

        @Override
        public void addOnMultiWindowModeChangedListener(ax.b0.a<i> a8) {
            this.f.addOnMultiWindowModeChangedListener(a8);
        }

        @Override
        public void addOnPictureInPictureModeChangedListener(ax.b0.a<t> a8) {
            this.f.addOnPictureInPictureModeChangedListener(a8);
        }

        @Override
        public void addOnTrimMemoryListener(ax.b0.a<Integer> a8) {
            this.f.addOnTrimMemoryListener(a8);
        }

        @Override
        public View c(int n8) {
            return this.f.findViewById(n8);
        }

        @Override
        public boolean d() {
            Window window = this.f.getWindow();
            return window != null && window.peekDecorView() != null;
        }

        @Override
        public e getActivityResultRegistry() {
            return this.f.getActivityResultRegistry();
        }

        @Override
        public androidx.lifecycle.d getLifecycle() {
            return this.f.mFragmentLifecycleRegistry;
        }

        @Override
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return this.f.getOnBackPressedDispatcher();
        }

        @Override
        public androidx.savedstate.a getSavedStateRegistry() {
            return this.f.getSavedStateRegistry();
        }

        @Override
        public androidx.lifecycle.r getViewModelStore() {
            return this.f.getViewModelStore();
        }

        @Override
        public void h(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
            this.f.dump(string, fileDescriptor, printWriter, stringArray);
        }

        @Override
        public LayoutInflater j() {
            return this.f.getLayoutInflater().cloneInContext((Context)this.f);
        }

        @Override
        public boolean l(String string) {
            return ax.P.b.v(this.f, string);
        }

        @Override
        public void o() {
            this.p();
        }

        public void p() {
            this.f.invalidateMenu();
        }

        public f q() {
            return this.f;
        }

        @Override
        public void removeMenuProvider(B b8) {
            this.f.removeMenuProvider(b8);
        }

        @Override
        public void removeOnConfigurationChangedListener(ax.b0.a<Configuration> a8) {
            this.f.removeOnConfigurationChangedListener(a8);
        }

        @Override
        public void removeOnMultiWindowModeChangedListener(ax.b0.a<i> a8) {
            this.f.removeOnMultiWindowModeChangedListener(a8);
        }

        @Override
        public void removeOnPictureInPictureModeChangedListener(ax.b0.a<t> a8) {
            this.f.removeOnPictureInPictureModeChangedListener(a8);
        }

        @Override
        public void removeOnTrimMemoryListener(ax.b0.a<Integer> a8) {
            this.f.removeOnTrimMemoryListener(a8);
        }
    }
}

