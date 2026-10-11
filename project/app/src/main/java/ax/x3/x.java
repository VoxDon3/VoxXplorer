/*
 * Decompiled with CFR 0.152.
 */
package ax.x3;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import ax.u3.B;
import ax.u3.z;
import ax.x3.w;

public class x {
    private Context a;
    private PopupWindow b;
    private LinearLayout c;

    public x(Context context) {
        LinearLayout linearLayout;
        this.a = context;
        this.c = linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        int n8 = B.e(context, 8);
        int n9 = B.e(context, 8);
        this.c.setPadding(n8, n8, n8, n8);
        this.b = new PopupWindow((View)this.c, -2, -2, true);
        context = z.h(context, 2130969647);
        this.c.setBackgroundDrawable((Drawable)context);
        this.b.setElevation((float)n9);
        this.b.setBackgroundDrawable((Drawable)new ColorDrawable(0));
    }

    public static /* synthetic */ void a(x x8, View.OnClickListener onClickListener, View view) {
        x8.getClass();
        onClickListener.onClick(view);
        x8.b.dismiss();
    }

    public void b(int n8, int n9, View.OnClickListener onClickListener) {
        View view = LayoutInflater.from((Context)this.a).inflate(2131558637, (ViewGroup)this.c, false);
        ((ImageView)view.findViewById(2131362383)).setImageResource(n8);
        ((TextView)view.findViewById(2131362963)).setText(n9);
        view.setOnClickListener((View.OnClickListener)new w(this, onClickListener));
        this.c.addView(view);
    }

    public void c(View view, int n8, int n9, PopupWindow.OnDismissListener onDismissListener) {
        this.c.measure(0, 0);
        int n10 = -(this.c.getMeasuredHeight() + view.getHeight());
        this.b.setWidth(this.c.getMeasuredWidth());
        this.b.showAsDropDown(view, n8, n10 + n9, 53);
        if (onDismissListener != null) {
            this.b.setOnDismissListener(onDismissListener);
        }
    }
}

