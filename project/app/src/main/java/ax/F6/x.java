/*
 * Decompiled with CFR 0.152.
 */
package ax.F6;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class x {
    private static final Comparator<View> a = new Comparator<View>(){

        public int a(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    };

    public static ActionMenuView a(Toolbar toolbar) {
        for (int i8 = 0; i8 < toolbar.getChildCount(); ++i8) {
            View view = toolbar.getChildAt(i8);
            if (!(view instanceof ActionMenuView)) continue;
            return (ActionMenuView)view;
        }
        return null;
    }

    private static ImageView b(Toolbar toolbar, Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        for (int i8 = 0; i8 < toolbar.getChildCount(); ++i8) {
            Drawable drawable2;
            View view = toolbar.getChildAt(i8);
            if (!(view instanceof ImageView) || (drawable2 = (view = (ImageView)view).getDrawable()) == null || drawable2.getConstantState() == null || !drawable2.getConstantState().equals(drawable.getConstantState())) continue;
            return view;
        }
        return null;
    }

    public static ImageView c(Toolbar toolbar) {
        return x.b(toolbar, toolbar.getLogo());
    }

    public static ImageButton d(Toolbar toolbar) {
        Drawable drawable = toolbar.getNavigationIcon();
        if (drawable == null) {
            return null;
        }
        for (int i8 = 0; i8 < toolbar.getChildCount(); ++i8) {
            View view = toolbar.getChildAt(i8);
            if (!(view instanceof ImageButton) || (view = (ImageButton)view).getDrawable() != drawable) continue;
            return view;
        }
        return null;
    }

    public static TextView e(Toolbar object) {
        if ((object = x.f((Toolbar)object, ((Toolbar)object).getSubtitle())).isEmpty()) {
            return null;
        }
        return (TextView)Collections.max(object, a);
    }

    private static List<TextView> f(Toolbar toolbar, CharSequence charSequence) {
        ArrayList<TextView> arrayList = new ArrayList<TextView>();
        for (int i8 = 0; i8 < toolbar.getChildCount(); ++i8) {
            View view = toolbar.getChildAt(i8);
            if (!(view instanceof TextView) || !TextUtils.equals((CharSequence)(view = (TextView)view).getText(), (CharSequence)charSequence)) continue;
            arrayList.add((TextView)view);
        }
        return arrayList;
    }

    public static TextView g(Toolbar object) {
        if ((object = x.f((Toolbar)object, ((Toolbar)object).getTitle())).isEmpty()) {
            return null;
        }
        return (TextView)Collections.min(object, a);
    }
}

