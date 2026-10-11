/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.x;
import ax.m.j;
import ax.t.e;
import ax.u.s;

public class ActionMenuItemView
extends x
implements k.a,
View.OnClickListener,
ActionMenuView.a {
    g h;
    private CharSequence i;
    private Drawable j;
    e.b k;
    private s l;
    b m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private int r;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int n8) {
        super(context, attributeSet, n8);
        Resources resources = context.getResources();
        this.n = this.t();
        context = context.obtainStyledAttributes(attributeSet, ax.m.j.v, n8, 0);
        this.p = context.getDimensionPixelSize(ax.m.j.w, 0);
        context.recycle();
        this.r = (int)(resources.getDisplayMetrics().density * 32.0f + 0.5f);
        this.setOnClickListener(this);
        this.q = -1;
        this.setSaveEnabled(false);
    }

    private boolean t() {
        Configuration configuration = this.getContext().getResources().getConfiguration();
        int n8 = configuration.screenWidthDp;
        int n9 = configuration.screenHeightDp;
        return n8 >= 480 || n8 >= 640 && n9 >= 480 || configuration.orientation == 2;
        {
        }
    }

    /*
     * Exception decompiling
     */
    private void u() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public boolean a() {
        return this.s();
    }

    @Override
    public boolean b() {
        return this.s() && this.h.getIcon() == null;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public void e(g g8, int n8) {
        this.h = g8;
        this.setIcon(g8.getIcon());
        this.setTitle(g8.i(this));
        this.setId(g8.getItemId());
        n8 = g8.isVisible() ? 0 : 8;
        this.setVisibility(n8);
        this.setEnabled(g8.isEnabled());
        if (g8.hasSubMenu() && this.l == null) {
            this.l = new a(this);
        }
    }

    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override
    public g getItemData() {
        return this.h;
    }

    public void onClick(View object) {
        object = this.k;
        if (object != null) {
            object.a(this.h);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.n = this.t();
        this.u();
    }

    @Override
    protected void onMeasure(int n8, int n9) {
        int n10;
        boolean bl = this.s();
        if (bl && (n10 = this.q) >= 0) {
            super.setPadding(n10, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
        super.onMeasure(n8, n9);
        n10 = View.MeasureSpec.getMode((int)n8);
        n8 = View.MeasureSpec.getSize((int)n8);
        int n11 = this.getMeasuredWidth();
        n8 = n10 == Integer.MIN_VALUE ? Math.min(n8, this.p) : this.p;
        if (n10 != 0x40000000 && this.p > 0 && n11 < n8) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)n8, (int)0x40000000), n9);
        }
        if (!bl && this.j != null) {
            super.setPadding((this.getMeasuredWidth() - this.j.getBounds().width()) / 2, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        s s8;
        if (this.h.hasSubMenu() && (s8 = this.l) != null && s8.onTouch((View)this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean s() {
        return TextUtils.isEmpty((CharSequence)this.getText()) ^ true;
    }

    public void setCheckable(boolean bl) {
    }

    public void setChecked(boolean bl) {
    }

    public void setExpandedFormat(boolean bl) {
        if (this.o != bl) {
            this.o = bl;
            g g8 = this.h;
            if (g8 != null) {
                g8.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.j = drawable;
        if (drawable != null) {
            float f8;
            int n8 = drawable.getIntrinsicWidth();
            int n9 = drawable.getIntrinsicHeight();
            int n10 = this.r;
            int n11 = n8;
            int n12 = n9;
            if (n8 > n10) {
                f8 = (float)n10 / (float)n8;
                n12 = (int)((float)n9 * f8);
                n11 = n10;
            }
            if (n12 > n10) {
                f8 = (float)n10 / (float)n12;
                n11 = (int)((float)n11 * f8);
            } else {
                n10 = n12;
            }
            drawable.setBounds(0, 0, n11, n10);
        }
        this.setCompoundDrawables(drawable, null, null, null);
        this.u();
    }

    public void setItemInvoker(e.b b8) {
        this.k = b8;
    }

    public void setPadding(int n8, int n9, int n10, int n11) {
        this.q = n8;
        super.setPadding(n8, n9, n10, n11);
    }

    public void setPopupCallback(b b8) {
        this.m = b8;
    }

    public void setTitle(CharSequence charSequence) {
        this.i = charSequence;
        this.u();
    }

    private class a
    extends s {
        final ActionMenuItemView j;

        public a(ActionMenuItemView actionMenuItemView) {
            this.j = actionMenuItemView;
            super((View)actionMenuItemView);
        }

        @Override
        public e b() {
            b b8 = this.j.m;
            if (b8 != null) {
                return b8.a();
            }
            return null;
        }

        @Override
        protected boolean c() {
            ActionMenuItemView actionMenuItemView = this.j;
            Object object = actionMenuItemView.k;
            return object != null && object.a(actionMenuItemView.h) && (object = this.b()) != null && object.b();
        }
    }

    public static abstract class b {
        public abstract e a();
    }
}

