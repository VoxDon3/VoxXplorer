/*
 * Decompiled with CFR 0.152.
 */
package ax.n;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
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
import ax.P.j;
import ax.P.w;
import ax.Y.h;
import ax.n.a;
import ax.n.b;
import ax.n.d;
import ax.n.f;

public class c
extends androidx.fragment.app.f
implements d,
w.a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private f mDelegate;
    private Resources mResources;

    public c() {
        this.initDelegate();
    }

    public c(int n8) {
        super(n8);
        this.initDelegate();
    }

    private void initDelegate() {
        this.getSavedStateRegistry().h(DELEGATE_TAG, new a.c(this){
            final c a;
            {
                this.a = c8;
            }

            @Override
            public Bundle a() {
                Bundle bundle = new Bundle();
                this.a.getDelegate().D(bundle);
                return bundle;
            }
        });
        this.addOnContextAvailableListener(new ax.j.b(this){
            final c a;
            {
                this.a = c8;
            }

            @Override
            public void a(Context object) {
                object = this.a.getDelegate();
                ((f)object).v();
                ((f)object).z(this.a.getSavedStateRegistry().b(c.DELEGATE_TAG));
            }
        });
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        return Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers((int)keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey((int)keyEvent.getKeyCode()) && (window = this.getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent);
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.initializeViewTreeOwners();
        this.getDelegate().e(view, layoutParams);
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(this.getDelegate().i(context));
    }

    public void closeOptionsMenu() {
        a a8 = this.getSupportActionBar();
        if (this.getWindow().hasFeature(0) && (a8 == null || !a8.h())) {
            super.closeOptionsMenu();
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int n8 = keyEvent.getKeyCode();
        a a8 = this.getSupportActionBar();
        if (n8 == 82 && a8 != null && a8.t(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public <T extends View> T findViewById(int n8) {
        return this.getDelegate().l(n8);
    }

    public f getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = f.j(this, this);
        }
        return this.mDelegate;
    }

    public b getDrawerToggleDelegate() {
        return this.getDelegate().p();
    }

    public MenuInflater getMenuInflater() {
        return this.getDelegate().s();
    }

    public Resources getResources() {
        Resources resources;
        if (this.mResources == null && N.d()) {
            this.mResources = new N((Context)this, super.getResources());
        }
        Resources resources2 = resources = this.mResources;
        if (resources == null) {
            resources2 = super.getResources();
        }
        return resources2;
    }

    public a getSupportActionBar() {
        return this.getDelegate().u();
    }

    @Override
    public Intent getSupportParentActivityIntent() {
        return j.a(this);
    }

    public void invalidateOptionsMenu() {
        this.getDelegate().w();
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.getDelegate().y(configuration);
        if (this.mResources != null) {
            configuration = super.getResources().getConfiguration();
            DisplayMetrics displayMetrics = super.getResources().getDisplayMetrics();
            this.mResources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public void onContentChanged() {
        this.onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(w w8) {
        w8.g(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.getDelegate().A();
    }

    public boolean onKeyDown(int n8, KeyEvent keyEvent) {
        if (this.performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(n8, keyEvent);
    }

    protected void onLocalesChanged(h h8) {
    }

    @Override
    public final boolean onMenuItemSelected(int n8, MenuItem menuItem) {
        if (super.onMenuItemSelected(n8, menuItem)) {
            return true;
        }
        a a8 = this.getSupportActionBar();
        if (menuItem.getItemId() == 16908332 && a8 != null && (a8.k() & 4) != 0) {
            return this.onSupportNavigateUp();
        }
        return false;
    }

    public boolean onMenuOpened(int n8, Menu menu) {
        return super.onMenuOpened(n8, menu);
    }

    protected void onNightModeChanged(int n8) {
    }

    @Override
    public void onPanelClosed(int n8, Menu menu) {
        super.onPanelClosed(n8, menu);
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.getDelegate().B(bundle);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        this.getDelegate().C();
    }

    public void onPrepareSupportNavigateUpTaskStack(w w8) {
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.getDelegate().E();
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.getDelegate().F();
    }

    @Override
    public void onSupportActionModeFinished(androidx.appcompat.view.a a8) {
    }

    @Override
    public void onSupportActionModeStarted(androidx.appcompat.view.a a8) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Object object = this.getSupportParentActivityIntent();
        if (object != null) {
            if (this.supportShouldUpRecreateTask((Intent)object)) {
                object = w.i((Context)this);
                this.onCreateSupportNavigateUpTaskStack((w)object);
                this.onPrepareSupportNavigateUpTaskStack((w)object);
                ((w)object).k();
                try {
                    ax.P.b.o(this);
                }
                catch (IllegalStateException illegalStateException) {
                    this.finish();
                }
            } else {
                this.supportNavigateUpTo((Intent)object);
            }
            return true;
        }
        return false;
    }

    protected void onTitleChanged(CharSequence charSequence, int n8) {
        super.onTitleChanged(charSequence, n8);
        this.getDelegate().R(charSequence);
    }

    @Override
    public androidx.appcompat.view.a onWindowStartingSupportActionMode(a.a a8) {
        return null;
    }

    public void openOptionsMenu() {
        a a8 = this.getSupportActionBar();
        if (this.getWindow().hasFeature(0) && (a8 == null || !a8.u())) {
            super.openOptionsMenu();
        }
    }

    @Override
    public void setContentView(int n8) {
        this.initializeViewTreeOwners();
        this.getDelegate().K(n8);
    }

    @Override
    public void setContentView(View view) {
        this.initializeViewTreeOwners();
        this.getDelegate().L(view);
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.initializeViewTreeOwners();
        this.getDelegate().M(view, layoutParams);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        this.getDelegate().P(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int n8) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean bl) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean bl) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean bl) {
    }

    public void setTheme(int n8) {
        super.setTheme(n8);
        this.getDelegate().Q(n8);
    }

    public androidx.appcompat.view.a startSupportActionMode(a.a a8) {
        return this.getDelegate().S(a8);
    }

    @Override
    public void supportInvalidateOptionsMenu() {
        this.getDelegate().w();
    }

    public void supportNavigateUpTo(Intent intent) {
        j.e(this, intent);
    }

    public boolean supportRequestWindowFeature(int n8) {
        return this.getDelegate().I(n8);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return j.f(this, intent);
    }
}

