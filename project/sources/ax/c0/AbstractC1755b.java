package ax.c0;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: ax.c0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1755b {
    private final Context a;
    private a b;
    private InterfaceC0265b c;

    /* renamed from: ax.c0.b$a */
    public interface a {
    }

    /* renamed from: ax.c0.b$b, reason: collision with other inner class name */
    public interface InterfaceC0265b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC1755b(Context context) {
        this.a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.c = null;
        this.b = null;
    }

    public void i(a aVar) {
        this.b = aVar;
    }

    public void j(InterfaceC0265b interfaceC0265b) {
        if (this.c != null && interfaceC0265b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.c = interfaceC0265b;
    }

    public void f(SubMenu subMenu) {
    }
}
