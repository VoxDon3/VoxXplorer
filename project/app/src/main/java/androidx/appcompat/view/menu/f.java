/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.c;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;

class f
implements DialogInterface.OnKeyListener,
DialogInterface.OnClickListener,
DialogInterface.OnDismissListener,
j.a {
    private e a;
    private a b;
    c c;
    private j.a d;

    public f(e e8) {
        this.a = e8;
    }

    @Override
    public void a(e e8, boolean bl) {
        j.a a8;
        if (bl || e8 == this.a) {
            this.c();
        }
        if ((a8 = this.d) != null) {
            a8.a(e8, bl);
        }
    }

    @Override
    public boolean b(e e8) {
        j.a a8 = this.d;
        if (a8 != null) {
            return a8.b(e8);
        }
        return false;
    }

    public void c() {
        a a8 = this.b;
        if (a8 != null) {
            a8.dismiss();
        }
    }

    public void d(IBinder iBinder) {
        c c8;
        Object object = this.a;
        a.a a8 = new a.a(((e)object).u());
        this.c = c8 = new c(a8.getContext(), ax.m.g.j);
        c8.h(this);
        this.a.b(this.c);
        a8.a(this.c.b(), this);
        c8 = ((e)object).y();
        if (c8 != null) {
            a8.c((View)c8);
        } else {
            a8.d(((e)object).w()).setTitle(((e)object).x());
        }
        a8.k(this);
        this.b = object = a8.create();
        object.setOnDismissListener((DialogInterface.OnDismissListener)this);
        object = this.b.getWindow().getAttributes();
        ((WindowManager.LayoutParams)object).type = 1003;
        if (iBinder != null) {
            ((WindowManager.LayoutParams)object).token = iBinder;
        }
        ((WindowManager.LayoutParams)object).flags |= 0x20000;
        this.b.show();
    }

    public void onClick(DialogInterface dialogInterface, int n8) {
        this.a.M((g)this.c.b().getItem(n8), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.c.a(this.a, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int n8, KeyEvent keyEvent) {
        if (n8 == 82 || n8 == 4) {
            Window window;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                dialogInterface = this.b.getWindow();
                if (dialogInterface != null && (dialogInterface = dialogInterface.getDecorView()) != null && (dialogInterface = dialogInterface.getKeyDispatcherState()) != null) {
                    dialogInterface.startTracking(keyEvent, (Object)this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (window = window.getDecorView()) != null && (window = window.getKeyDispatcherState()) != null && window.isTracking(keyEvent)) {
                this.a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.a.performShortcut(n8, keyEvent, 0);
    }
}

