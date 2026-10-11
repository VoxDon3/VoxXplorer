/*
 * Decompiled with CFR 0.152.
 */
package ax.h0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import ax.a0.s;
import ax.b0.g;
import ax.h0.i;
import ax.h0.k;
import ax.h0.n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class j {
    public static int a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    private static int c(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 1;
        }
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if (textDirectionHeuristic == textDirectionHeuristic3) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic3) {
            return 6;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 7;
        }
        return 1;
    }

    private static TextDirectionHeuristic d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        int n8 = Build.VERSION.SDK_INT;
        byte by = 1;
        if (n8 >= 28 && (textView.getInputType() & 0xF) == 3) {
            by = Character.getDirectionality(c.b(b.a(textView.getTextLocale()))[0].codePointAt(0));
            if (by != 1 && by != 2) {
                return TextDirectionHeuristics.LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        if (textView.getLayoutDirection() != 1) {
            by = 0;
        }
        switch (textView.getTextDirection()) {
            default: {
                if (by != 0) {
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            case 7: {
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            }
            case 6: {
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            case 5: {
                return TextDirectionHeuristics.LOCALE;
            }
            case 4: {
                return TextDirectionHeuristics.RTL;
            }
            case 3: {
                return TextDirectionHeuristics.LTR;
            }
            case 2: 
        }
        return TextDirectionHeuristics.ANYRTL_LTR;
    }

    public static s.a e(TextView textView) {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 28) {
            return new s.a(c.c(textView));
        }
        s.a.a a8 = new s.a.a(new TextPaint((Paint)textView.getPaint()));
        if (n8 >= 23) {
            a8.b(a.a(textView));
            a8.c(a.d(textView));
        }
        a8.d(j.d(textView));
        return a8.a();
    }

    public static void f(TextView textView, ColorStateList colorStateList) {
        g.g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            a.f(textView, colorStateList);
            return;
        }
        if (textView instanceof n) {
            ((n)textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    public static void g(TextView textView, PorterDuff.Mode mode) {
        g.g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            a.g(textView, mode);
            return;
        }
        if (textView instanceof n) {
            ((n)textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    public static void h(TextView textView, int n8) {
        g.d(n8);
        if (Build.VERSION.SDK_INT >= 28) {
            c.d(textView, n8);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int n9 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (n8 > Math.abs(n9)) {
            textView.setPadding(textView.getPaddingLeft(), n8 + n9, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void i(TextView textView, int n8) {
        g.d(n8);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int n9 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (n8 > Math.abs(n9)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), n8 - n9);
        }
    }

    public static void j(TextView textView, int n8) {
        g.d(n8);
        int n9 = textView.getPaint().getFontMetricsInt(null);
        if (n8 != n9) {
            textView.setLineSpacing((float)(n8 - n9), 1.0f);
        }
    }

    public static void k(TextView textView, int n8, float f8) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.a(textView, n8, f8);
            return;
        }
        j.j(textView, Math.round(TypedValue.applyDimension((int)n8, (float)f8, (DisplayMetrics)textView.getResources().getDisplayMetrics())));
    }

    public static void l(TextView textView, s s8) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(c.a(s8.b()));
            return;
        }
        if (j.e(textView).a(s8.a())) {
            textView.setText((CharSequence)((Object)s8));
            return;
        }
        throw new IllegalArgumentException("Given text can not be applied to TextView.");
    }

    public static void m(TextView textView, int n8) {
        if (Build.VERSION.SDK_INT >= 23) {
            i.a(textView, n8);
            return;
        }
        textView.setTextAppearance(textView.getContext(), n8);
    }

    public static void n(TextView textView, s.a a8) {
        textView.setTextDirection(j.c(a8.d()));
        if (Build.VERSION.SDK_INT < 23) {
            float f8 = a8.e().getTextScaleX();
            textView.getPaint().set(a8.e());
            if (f8 == textView.getTextScaleX()) {
                textView.setTextScaleX(f8 / 2.0f + 1.0f);
            }
            textView.setTextScaleX(f8);
            return;
        }
        textView.getPaint().set(a8.e());
        a.e(textView, a8.b());
        a.h(textView, a8.c());
    }

    public static ActionMode.Callback o(ActionMode.Callback callback) {
        ActionMode.Callback callback2 = callback;
        if (callback instanceof e) {
            callback2 = callback;
            if (Build.VERSION.SDK_INT >= 26) {
                callback2 = ((e)callback).d();
            }
        }
        return callback2;
    }

    public static ActionMode.Callback p(TextView textView, ActionMode.Callback callback) {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 26 && n8 <= 27 && !(callback instanceof e) && callback != null) {
            return new e(callback, textView);
        }
        return callback;
    }

    static class a {
        static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        static ColorStateList b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        static PorterDuff.Mode c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        static int d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        static void e(TextView textView, int n8) {
            textView.setBreakStrategy(n8);
        }

        static void f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static void g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        static void h(TextView textView, int n8) {
            textView.setHyphenationFrequency(n8);
        }
    }

    static class b {
        static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance((Locale)locale);
        }
    }

    static class c {
        static CharSequence a(PrecomputedText precomputedText) {
            return precomputedText;
        }

        static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        static PrecomputedText.Params c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        static void d(TextView textView, int n8) {
            textView.setFirstBaselineToTopHeight(n8);
        }
    }

    static class d {
        public static void a(TextView textView, int n8, float f8) {
            textView.setLineHeight(n8, f8);
        }
    }

    private static class e
    implements ActionMode.Callback {
        private final ActionMode.Callback a;
        private final TextView b;
        private Class<?> c;
        private Method d;
        private boolean e;
        private boolean f;

        e(ActionMode.Callback callback, TextView textView) {
            this.a = callback;
            this.b = textView;
            this.f = false;
        }

        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent b(ResolveInfo resolveInfo, TextView textView) {
            textView = this.a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", this.e(textView) ^ true);
            resolveInfo = resolveInfo.activityInfo;
            return textView.setClassName(resolveInfo.packageName, resolveInfo.name);
        }

        private List<ResolveInfo> c(Context context, PackageManager packageManager2) {
            ArrayList<ResolveInfo> arrayList = new ArrayList<ResolveInfo>();
            if (context instanceof Activity) {
                for (PackageManager packageManager2 : packageManager2.queryIntentActivities(this.a(), 0)) {
                    if (!this.f((ResolveInfo)packageManager2, context)) continue;
                    arrayList.add((ResolveInfo)packageManager2);
                }
            }
            return arrayList;
        }

        private boolean e(TextView textView) {
            return textView instanceof Editable && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private boolean f(ResolveInfo object, Context context) {
            if (context.getPackageName().equals(object.activityInfo.packageName)) {
                return true;
            }
            object = object.activityInfo;
            if (!object.exported) {
                return false;
            }
            object = object.permission;
            return object == null || k.a(context, (String)object) == 0;
            {
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        private void g(Menu menu) {
            int n8;
            MenuItem menuItem;
            Context context = this.b.getContext();
            PackageManager packageManager = context.getPackageManager();
            boolean bl = this.f;
            Object object = Integer.TYPE;
            if (!bl) {
                this.f = true;
                try {
                    menuItem = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.c = menuItem;
                    this.d = menuItem.getDeclaredMethod("removeItemAt", new Class[]{object});
                    this.e = true;
                }
                catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
                    this.c = null;
                    this.d = null;
                    this.e = false;
                }
            }
            try {
                object = this.e && this.c.isInstance(menu) ? this.d : menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{object});
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
                return;
            }
            for (n8 = menu.size() - 1; n8 >= 0; --n8) {
                menuItem = menu.getItem(n8);
                if (menuItem.getIntent() == null || !"android.intent.action.PROCESS_TEXT".equals(menuItem.getIntent().getAction())) continue;
                ((Method)object).invoke(menu, n8);
                continue;
            }
            object = this.c(context, packageManager);
            for (n8 = 0; n8 < object.size(); ++n8) {
                context = (ResolveInfo)object.get(n8);
                menu.add(0, 0, n8 + 100, context.loadLabel(packageManager)).setIntent(this.b((ResolveInfo)context, this.b)).setShowAsAction(1);
            }
            return;
        }

        ActionMode.Callback d() {
            return this.a;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            this.g(menu);
            return this.a.onPrepareActionMode(actionMode, menu);
        }
    }
}

