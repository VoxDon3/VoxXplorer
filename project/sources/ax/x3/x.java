package ax.x3;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import ax.u3.C3180B;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class x {
    private Context a;
    private PopupWindow b;
    private LinearLayout c;

    public x(Context context) {
        this.a = context;
        LinearLayout linearLayout = new LinearLayout(context);
        this.c = linearLayout;
        linearLayout.setOrientation(1);
        int e = C3180B.e(context, 8);
        int e2 = C3180B.e(context, 8);
        this.c.setPadding(e, e, e, e);
        this.b = new PopupWindow((View) this.c, -2, -2, true);
        this.c.setBackgroundDrawable(ax.u3.z.h(context, R.attr.popupMenuBackground));
        this.b.setElevation(e2);
        this.b.setBackgroundDrawable(new ColorDrawable(0));
    }

    public static /* synthetic */ void a(x xVar, View.OnClickListener onClickListener, View view) {
        xVar.getClass();
        onClickListener.onClick(view);
        xVar.b.dismiss();
    }

    public void b(int i, int i2, final View.OnClickListener onClickListener) {
        View inflate = LayoutInflater.from(this.a).inflate(R.layout.my_popup_menu_item_layout, (ViewGroup) this.c, false);
        ((ImageView) inflate.findViewById(R.id.icon)).setImageResource(i);
        ((TextView) inflate.findViewById(R.id.title)).setText(i2);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: ax.x3.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.a(x.this, onClickListener, view);
            }
        });
        this.c.addView(inflate);
    }

    public void c(View view, int i, int i2, PopupWindow.OnDismissListener onDismissListener) {
        this.c.measure(0, 0);
        int i3 = (-(this.c.getMeasuredHeight() + view.getHeight())) + i2;
        this.b.setWidth(this.c.getMeasuredWidth());
        this.b.showAsDropDown(view, i, i3, 53);
        if (onDismissListener != null) {
            this.b.setOnDismissListener(onDismissListener);
        }
    }
}
