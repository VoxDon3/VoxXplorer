/*
 * Decompiled with CFR 0.152.
 */
package ax.u;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import ax.m.d;
import ax.m.f;
import ax.m.g;
import ax.m.i;

class F {
    private final Context a;
    private final View b;
    private final TextView c;
    private final WindowManager.LayoutParams d;
    private final Rect e;
    private final int[] f;
    private final int[] g;

    F(Context context) {
        View view;
        WindowManager.LayoutParams layoutParams;
        this.d = layoutParams = new WindowManager.LayoutParams();
        this.e = new Rect();
        this.f = new int[2];
        this.g = new int[2];
        this.a = context;
        this.b = view = LayoutInflater.from((Context)context).inflate(ax.m.g.q, null);
        this.c = (TextView)view.findViewById(ax.m.f.s);
        layoutParams.setTitle((CharSequence)this.getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = i.a;
        layoutParams.flags = 24;
    }

    private void a(View object, int n8, int n9, boolean bl, WindowManager.LayoutParams layoutParams) {
        Object object2;
        layoutParams.token = object.getApplicationWindowToken();
        int n10 = this.a.getResources().getDimensionPixelOffset(ax.m.d.k);
        if (object.getWidth() < n10) {
            n8 = object.getWidth() / 2;
        }
        if (object.getHeight() >= n10) {
            object2 = this.a.getResources().getDimensionPixelOffset(ax.m.d.j);
            n10 = n9 + object2;
            object2 = n9 - object2;
            n9 = n10;
            n10 = object2;
        } else {
            n9 = object.getHeight();
            n10 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = this.a.getResources();
        object2 = bl ? ax.m.d.m : ax.m.d.l;
        int n11 = resources.getDimensionPixelOffset(object2);
        resources = F.b(object);
        if (resources == null) {
            Log.e((String)"TooltipPopup", (String)"Cannot find app view");
            return;
        }
        resources.getWindowVisibleDisplayFrame(this.e);
        Object object3 = this.e;
        if (object3.left < 0 && object3.top < 0) {
            object3 = this.a.getResources();
            object2 = object3.getIdentifier("status_bar_height", "dimen", "android");
            object2 = object2 != 0 ? object3.getDimensionPixelSize(object2) : 0;
            object3 = object3.getDisplayMetrics();
            this.e.set(0, object2, object3.widthPixels, object3.heightPixels);
        }
        resources.getLocationOnScreen(this.g);
        object.getLocationOnScreen(this.f);
        object = this.f;
        object2 = object[0];
        object3 = this.g;
        object[0] = (View)(object2 -= object3[0]);
        object[1] = object[1] - object3[1];
        layoutParams.x = object2 + n8 - resources.getWidth() / 2;
        n8 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
        this.b.measure(n8, n8);
        n8 = this.b.getMeasuredHeight();
        object2 = this.f[1];
        n10 = n10 + object2 - n11 - n8;
        n9 = object2 + n9 + n11;
        if (bl) {
            if (n10 >= 0) {
                layoutParams.y = n10;
                return;
            }
            layoutParams.y = n9;
            return;
        }
        if (n8 + n9 <= this.e.height()) {
            layoutParams.y = n9;
            return;
        }
        layoutParams.y = n10;
    }

    private static View b(View view) {
        View view2 = view.getRootView();
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (!(layoutParams instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams)layoutParams).type != 2) {
            view = view.getContext();
            while (view instanceof ContextWrapper) {
                if (view instanceof Activity) {
                    return ((Activity)view).getWindow().getDecorView();
                }
                view = ((ContextWrapper)view).getBaseContext();
            }
        }
        return view2;
    }

    void c() {
        if (!this.d()) {
            return;
        }
        ((WindowManager)this.a.getSystemService("window")).removeView(this.b);
    }

    boolean d() {
        return this.b.getParent() != null;
    }

    void e(View view, int n8, int n9, boolean bl, CharSequence charSequence) {
        if (this.d()) {
            this.c();
        }
        this.c.setText(charSequence);
        this.a(view, n8, n9, bl, this.d);
        ((WindowManager)this.a.getSystemService("window")).addView(this.b, (ViewGroup.LayoutParams)this.d);
    }
}

