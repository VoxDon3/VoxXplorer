/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.a;
import ax.B.k;
import ax.V.b;
import ax.t.c;
import ax.t.d;
import java.util.ArrayList;

public class SupportActionModeWrapper
extends ActionMode {
    final Context mContext;
    final androidx.appcompat.view.a mWrappedObject;

    public SupportActionModeWrapper(Context context, androidx.appcompat.view.a a8) {
        this.mContext = context;
        this.mWrappedObject = a8;
    }

    public void finish() {
        this.mWrappedObject.c();
    }

    public View getCustomView() {
        return this.mWrappedObject.d();
    }

    public Menu getMenu() {
        return new d(this.mContext, (ax.V.a)this.mWrappedObject.e());
    }

    public MenuInflater getMenuInflater() {
        return this.mWrappedObject.f();
    }

    public CharSequence getSubtitle() {
        return this.mWrappedObject.g();
    }

    public Object getTag() {
        return this.mWrappedObject.h();
    }

    public CharSequence getTitle() {
        return this.mWrappedObject.i();
    }

    public boolean getTitleOptionalHint() {
        return this.mWrappedObject.j();
    }

    public void invalidate() {
        this.mWrappedObject.k();
    }

    public boolean isTitleOptional() {
        return this.mWrappedObject.l();
    }

    public void setCustomView(View view) {
        this.mWrappedObject.m(view);
    }

    public void setSubtitle(int n8) {
        this.mWrappedObject.n(n8);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.mWrappedObject.o(charSequence);
    }

    public void setTag(Object object) {
        this.mWrappedObject.p(object);
    }

    public void setTitle(int n8) {
        this.mWrappedObject.q(n8);
    }

    public void setTitle(CharSequence charSequence) {
        this.mWrappedObject.r(charSequence);
    }

    public void setTitleOptionalHint(boolean bl) {
        this.mWrappedObject.s(bl);
    }

    public static class a
    implements a.a {
        final ActionMode.Callback a;
        final Context b;
        final ArrayList<SupportActionModeWrapper> c;
        final k<Menu, Menu> d;

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
            this.c = new ArrayList();
            this.d = new k();
        }

        private Menu f(Menu menu) {
            Menu menu2;
            Menu menu3 = menu2 = this.d.get(menu);
            if (menu2 == null) {
                menu3 = new d(this.b, (ax.V.a)menu);
                this.d.put(menu, menu3);
            }
            return menu3;
        }

        @Override
        public void a(androidx.appcompat.view.a a8) {
            this.a.onDestroyActionMode(this.e(a8));
        }

        @Override
        public boolean b(androidx.appcompat.view.a a8, Menu menu) {
            return this.a.onCreateActionMode(this.e(a8), this.f(menu));
        }

        @Override
        public boolean c(androidx.appcompat.view.a a8, Menu menu) {
            return this.a.onPrepareActionMode(this.e(a8), this.f(menu));
        }

        @Override
        public boolean d(androidx.appcompat.view.a a8, MenuItem menuItem) {
            return this.a.onActionItemClicked(this.e(a8), (MenuItem)new c(this.b, (b)menuItem));
        }

        public ActionMode e(androidx.appcompat.view.a object) {
            int n8 = this.c.size();
            for (int i8 = 0; i8 < n8; ++i8) {
                SupportActionModeWrapper supportActionModeWrapper = this.c.get(i8);
                if (supportActionModeWrapper == null || supportActionModeWrapper.mWrappedObject != object) continue;
                return supportActionModeWrapper;
            }
            object = new SupportActionModeWrapper(this.b, (androidx.appcompat.view.a)object);
            this.c.add((SupportActionModeWrapper)((Object)object));
            return object;
        }
    }
}

