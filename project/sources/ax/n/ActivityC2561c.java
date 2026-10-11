package ax.n;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.a;
import androidx.appcompat.widget.N;
import androidx.appcompat.widget.Toolbar;
import androidx.savedstate.a;
import ax.P.w;
import ax.j.InterfaceC2300b;

/* renamed from: ax.n.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ActivityC2561c extends androidx.fragment.app.f implements InterfaceC2562d, w.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AbstractC2564f mDelegate;
    private Resources mResources;

    /* renamed from: ax.n.c$a */
    class a implements a.c {
        a() {
        }

        @Override // androidx.savedstate.a.c
        public Bundle a() {
            Bundle bundle = new Bundle();
            ActivityC2561c.this.getDelegate().D(bundle);
            return bundle;
        }
    }

    /* renamed from: ax.n.c$b */
    class b implements InterfaceC2300b {
        b() {
        }

        @Override // ax.j.InterfaceC2300b
        public void a(Context context) {
            AbstractC2564f delegate = ActivityC2561c.this.getDelegate();
            delegate.v();
            delegate.z(ActivityC2561c.this.getSavedStateRegistry().b(ActivityC2561c.DELEGATE_TAG));
        }
    }

    public ActivityC2561c() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().h(DELEGATE_TAG, new a());
        addOnContextAvailableListener(new b());
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().i(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC2559a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.h()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // ax.P.h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC2559a supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.t(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().l(i);
    }

    public AbstractC2564f getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AbstractC2564f.j(this, this);
        }
        return this.mDelegate;
    }

    public InterfaceC2560b getDrawerToggleDelegate() {
        return getDelegate().p();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().s();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && N.d()) {
            this.mResources = new N(this, super.getResources());
        }
        Resources resources = this.mResources;
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC2559a getSupportActionBar() {
        return getDelegate().u();
    }

    @Override // ax.P.w.a
    public Intent getSupportParentActivityIntent() {
        return ax.P.j.a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().w();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().y(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(ax.P.w wVar) {
        wVar.g(this);
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        getDelegate().A();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.f, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        AbstractC2559a supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() != 16908332 || supportActionBar == null || (supportActionBar.k() & 4) == 0) {
            return false;
        }
        return onSupportNavigateUp();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().B(bundle);
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        getDelegate().C();
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onStart() {
        super.onStart();
        getDelegate().E();
    }

    @Override // androidx.fragment.app.f, android.app.Activity
    protected void onStop() {
        super.onStop();
        getDelegate().F();
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent == null) {
            return false;
        }
        if (!supportShouldUpRecreateTask(supportParentActivityIntent)) {
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        ax.P.w i = ax.P.w.i(this);
        onCreateSupportNavigateUpTaskStack(i);
        onPrepareSupportNavigateUpTaskStack(i);
        i.k();
        try {
            ax.P.b.o(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().R(charSequence);
    }

    @Override // ax.n.InterfaceC2562d
    public androidx.appcompat.view.a onWindowStartingSupportActionMode(a.InterfaceC0007a interfaceC0007a) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC2559a supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.u()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        getDelegate().K(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().P(toolbar);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().Q(i);
    }

    public androidx.appcompat.view.a startSupportActionMode(a.InterfaceC0007a interfaceC0007a) {
        return getDelegate().S(interfaceC0007a);
    }

    @Override // androidx.fragment.app.f
    public void supportInvalidateOptionsMenu() {
        getDelegate().w();
    }

    public void supportNavigateUpTo(Intent intent) {
        ax.P.j.e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().I(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return ax.P.j.f(this, intent);
    }

    public ActivityC2561c(int i) {
        super(i);
        initDelegate();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        getDelegate().L(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        getDelegate().M(view, layoutParams);
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    protected void onLocalesChanged(ax.Y.h hVar) {
    }

    protected void onNightModeChanged(int i) {
    }

    public void onPrepareSupportNavigateUpTaskStack(ax.P.w wVar) {
    }

    @Override // ax.n.InterfaceC2562d
    public void onSupportActionModeFinished(androidx.appcompat.view.a aVar) {
    }

    @Override // ax.n.InterfaceC2562d
    public void onSupportActionModeStarted(androidx.appcompat.view.a aVar) {
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }
}
