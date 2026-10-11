/*
 * Decompiled with CFR 0.152.
 */
package ax.u;

import android.content.Context;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HeaderViewListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import ax.u.q;
import ax.u.t;
import ax.u.u;
import java.lang.reflect.Method;

public class v
extends t
implements u {
    private static Method K;
    private u J;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                K = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        }
        catch (NoSuchMethodException noSuchMethodException) {
            Log.i((String)"MenuPopupWindow", (String)"Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public v(Context context, AttributeSet attributeSet, int n8, int n9) {
        super(context, attributeSet, n8, n9);
    }

    public void S(Object object) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.a(this.F, (Transition)object);
        }
    }

    public void T(Object object) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.b(this.F, (Transition)object);
        }
    }

    public void U(u u8) {
        this.J = u8;
    }

    public void V(boolean bl) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = K;
            if (method != null) {
                try {
                    method.invoke(this.F, bl);
                    return;
                }
                catch (Exception exception) {
                    Log.i((String)"MenuPopupWindow", (String)"Could not invoke setTouchModal() on PopupWindow. Oh well.");
                }
            }
            return;
        }
        b.a(this.F, bl);
    }

    @Override
    public void e(e e8, MenuItem menuItem) {
        u u8 = this.J;
        if (u8 != null) {
            u8.e(e8, menuItem);
        }
    }

    @Override
    public void h(e e8, MenuItem menuItem) {
        u u8 = this.J;
        if (u8 != null) {
            u8.h(e8, menuItem);
        }
    }

    @Override
    q s(Context object, boolean bl) {
        object = new c((Context)object, bl);
        ((c)((Object)object)).setHoverListener(this);
        return object;
    }

    static class a {
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class b {
        static void a(PopupWindow popupWindow, boolean bl) {
            popupWindow.setTouchModal(bl);
        }
    }

    public static class c
    extends q {
        final int n;
        final int o;
        private u p;
        private MenuItem q;

        public c(Context context, boolean bl) {
            super(context, bl);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.n = 21;
                this.o = 22;
                return;
            }
            this.n = 22;
            this.o = 21;
        }

        @Override
        public boolean onHoverEvent(MotionEvent motionEvent) {
            if (this.p != null) {
                int n8;
                int n9;
                Object object = this.getAdapter();
                if (object instanceof HeaderViewListAdapter) {
                    object = (HeaderViewListAdapter)object;
                    n9 = object.getHeadersCount();
                    object = (d)object.getWrappedAdapter();
                } else {
                    object = (d)((Object)object);
                    n9 = 0;
                }
                g g8 = motionEvent.getAction() != 10 && (n8 = this.pointToPosition((int)motionEvent.getX(), (int)motionEvent.getY())) != -1 && (n9 = n8 - n9) >= 0 && n9 < ((d)((Object)object)).getCount() ? ((d)((Object)object)).c(n9) : null;
                MenuItem menuItem = this.q;
                if (menuItem != g8) {
                    object = ((d)((Object)object)).b();
                    if (menuItem != null) {
                        this.p.h((e)object, menuItem);
                    }
                    this.q = g8;
                    if (g8 != null) {
                        this.p.e((e)object, g8);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int n8, KeyEvent object) {
            ListMenuItemView listMenuItemView = (ListMenuItemView)this.getSelectedView();
            if (listMenuItemView != null && n8 == this.n) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    this.performItemClick((View)listMenuItemView, this.getSelectedItemPosition(), this.getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView != null && n8 == this.o) {
                this.setSelection(-1);
                object = this.getAdapter();
                object = object instanceof HeaderViewListAdapter ? (d)((HeaderViewListAdapter)object).getWrappedAdapter() : (d)((Object)object);
                object.b().e(false);
                return true;
            }
            return super.onKeyDown(n8, object);
        }

        public void setHoverListener(u u8) {
            this.p = u8;
        }
    }
}

