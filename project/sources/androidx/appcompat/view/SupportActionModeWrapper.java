package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.a;
import ax.B.k;
import ax.t.MenuC3092d;
import ax.t.MenuItemC3091c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class SupportActionModeWrapper extends ActionMode {
    final Context mContext;
    final androidx.appcompat.view.a mWrappedObject;

    public static class a implements a.InterfaceC0007a {
        final ActionMode.Callback a;
        final Context b;
        final ArrayList<SupportActionModeWrapper> c = new ArrayList<>();
        final k<Menu, Menu> d = new k<>();

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            MenuC3092d menuC3092d = new MenuC3092d(this.b, (ax.V.a) menu);
            this.d.put(menu, menuC3092d);
            return menuC3092d;
        }

        @Override // androidx.appcompat.view.a.InterfaceC0007a
        public void a(androidx.appcompat.view.a aVar) {
            this.a.onDestroyActionMode(e(aVar));
        }

        @Override // androidx.appcompat.view.a.InterfaceC0007a
        public boolean b(androidx.appcompat.view.a aVar, Menu menu) {
            return this.a.onCreateActionMode(e(aVar), f(menu));
        }

        @Override // androidx.appcompat.view.a.InterfaceC0007a
        public boolean c(androidx.appcompat.view.a aVar, Menu menu) {
            return this.a.onPrepareActionMode(e(aVar), f(menu));
        }

        @Override // androidx.appcompat.view.a.InterfaceC0007a
        public boolean d(androidx.appcompat.view.a aVar, MenuItem menuItem) {
            return this.a.onActionItemClicked(e(aVar), new MenuItemC3091c(this.b, (ax.V.b) menuItem));
        }

        public ActionMode e(androidx.appcompat.view.a aVar) {
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                SupportActionModeWrapper supportActionModeWrapper = this.c.get(i);
                if (supportActionModeWrapper != null && supportActionModeWrapper.mWrappedObject == aVar) {
                    return supportActionModeWrapper;
                }
            }
            SupportActionModeWrapper supportActionModeWrapper2 = new SupportActionModeWrapper(this.b, aVar);
            this.c.add(supportActionModeWrapper2);
            return supportActionModeWrapper2;
        }
    }

    public SupportActionModeWrapper(Context context, androidx.appcompat.view.a aVar) {
        this.mContext = context;
        this.mWrappedObject = aVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.mWrappedObject.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.mWrappedObject.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new MenuC3092d(this.mContext, (ax.V.a) this.mWrappedObject.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.mWrappedObject.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.mWrappedObject.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.mWrappedObject.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.mWrappedObject.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.mWrappedObject.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.mWrappedObject.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.mWrappedObject.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.mWrappedObject.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.mWrappedObject.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.mWrappedObject.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.mWrappedObject.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.mWrappedObject.s(z);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.mWrappedObject.n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.mWrappedObject.q(i);
    }
}
