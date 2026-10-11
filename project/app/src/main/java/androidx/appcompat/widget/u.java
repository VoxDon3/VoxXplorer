/*
 * Decompiled with CFR 0.152.
 */
package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.H;
import androidx.appcompat.widget.L;
import androidx.appcompat.widget.O;
import ax.b0.b;
import ax.m.j;
import ax.o.a;
import ax.u.s;
import ax.u.t;
import ax.u.x;

public class u
extends Spinner {
    @SuppressLint(value={"ResourceType"})
    private static final int[] i = new int[]{16843505};
    private final androidx.appcompat.widget.e a;
    private final Context b;
    private s c;
    private SpinnerAdapter d;
    private final boolean e;
    private h f;
    int g;
    final Rect h;

    public u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ax.m.a.M);
    }

    public u(Context context, AttributeSet attributeSet, int n8) {
        this(context, attributeSet, n8, -1);
    }

    public u(Context context, AttributeSet attributeSet, int n8, int n9) {
        this(context, attributeSet, n8, n9, null);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public u(Context context, AttributeSet charSequenceArray, int n8, int n9, Resources.Theme objectArray) {
        Object object;
        int n10;
        L l8;
        block18: {
            super(context, (AttributeSet)charSequenceArray, n8);
            this.h = new Rect();
            H.a((View)this, this.getContext());
            l8 = L.v(context, (AttributeSet)charSequenceArray, j.g2, n8, 0);
            this.a = new androidx.appcompat.widget.e((View)this);
            this.b = objectArray != null ? new ax.s.c(context, (Resources.Theme)objectArray) : ((n10 = l8.n(j.l2, 0)) != 0 ? new ax.s.c(context, n10) : context);
            object = null;
            n10 = n9;
            if (n9 == -1) {
                RuntimeException var1_4;
                block16: {
                    Object[] objectArray2;
                    block15: {
                        block17: {
                            objectArray = context.obtainStyledAttributes((AttributeSet)charSequenceArray, i, n8, 0);
                            object = objectArray;
                            n10 = n9;
                            objectArray2 = objectArray;
                            if (objectArray.hasValue(0)) {
                                object = objectArray;
                                n10 = objectArray.getInt(0, 0);
                                objectArray2 = objectArray;
                            }
                            break block15;
                            catch (Throwable throwable) {
                                charSequenceArray = object;
                                break block16;
                            }
                            catch (Exception exception) {
                                objectArray = null;
                                break block17;
                            }
                            catch (Throwable throwable) {
                                charSequenceArray = object;
                                break block16;
                            }
                            catch (Exception exception) {}
                        }
                        object = objectArray;
                        {
                            Log.i((String)"AppCompatSpinner", (String)"Could not read android:spinnerMode", (Throwable)objectArray2);
                            n10 = n9;
                            if (objectArray == null) break block18;
                            n10 = n9;
                            objectArray2 = objectArray;
                        }
                    }
                    objectArray2.recycle();
                    break block18;
                }
                if (charSequenceArray != null) {
                    charSequenceArray.recycle();
                }
                throw var1_4;
            }
        }
        if (n10 != 0) {
            if (n10 == 1) {
                objectArray = new f(this, this.b, (AttributeSet)charSequenceArray, n8);
                object = L.v(this.b, (AttributeSet)charSequenceArray, j.g2, n8, 0);
                this.g = ((L)object).m(j.k2, -2);
                objectArray.a(((L)object).g(j.i2));
                objectArray.k(l8.o(j.j2));
                ((L)object).x();
                this.f = objectArray;
                this.c = new s(this, (View)this, (f)objectArray){
                    final f j;
                    final u k;
                    {
                        this.k = u8;
                        this.j = f8;
                        super(view);
                    }

                    @Override
                    public ax.t.e b() {
                        return this.j;
                    }

                    @Override
                    public boolean c() {
                        if (!this.k.getInternalPopup().b()) {
                            this.k.b();
                        }
                        return true;
                    }
                };
            }
        } else {
            objectArray = new d(this);
            this.f = objectArray;
            objectArray.k(l8.o(j.j2));
        }
        objectArray = l8.q(j.h2);
        if (objectArray != null) {
            context = new ArrayAdapter(context, 17367048, objectArray);
            context.setDropDownViewResource(ax.m.g.r);
            this.setAdapter((SpinnerAdapter)context);
        }
        l8.x();
        this.e = true;
        context = this.d;
        if (context != null) {
            this.setAdapter((SpinnerAdapter)context);
            this.d = null;
        }
        this.a.e((AttributeSet)charSequenceArray, n8);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int n8 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int n9 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)0);
        int n10 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredHeight(), (int)0);
        int n11 = Math.max(0, this.getSelectedItemPosition());
        int n12 = Math.min(spinnerAdapter.getCount(), n11 + 15);
        int n13 = Math.max(0, n11 - (15 - (n12 - n11)));
        View view = null;
        n11 = 0;
        while (n13 < n12) {
            int n14 = spinnerAdapter.getItemViewType(n13);
            int n15 = n8;
            if (n14 != n8) {
                view = null;
                n15 = n14;
            }
            if ((view = spinnerAdapter.getView(n13, view, (ViewGroup)this)).getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(n9, n10);
            n11 = Math.max(n11, view.getMeasuredWidth());
            ++n13;
            n8 = n15;
        }
        n13 = n11;
        if (drawable != null) {
            drawable.getPadding(this.h);
            spinnerAdapter = this.h;
            n13 = n11 + (spinnerAdapter.left + spinnerAdapter.right);
        }
        return n13;
    }

    void b() {
        this.f.n(this.getTextDirection(), this.getTextAlignment());
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e e8 = this.a;
        if (e8 != null) {
            e8.b();
        }
    }

    public int getDropDownHorizontalOffset() {
        h h8 = this.f;
        if (h8 != null) {
            return h8.d();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        h h8 = this.f;
        if (h8 != null) {
            return h8.o();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.f != null) {
            return this.g;
        }
        return super.getDropDownWidth();
    }

    final h getInternalPopup() {
        return this.f;
    }

    public Drawable getPopupBackground() {
        h h8 = this.f;
        if (h8 != null) {
            return h8.i();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.b;
    }

    public CharSequence getPrompt() {
        h h8 = this.f;
        if (h8 != null) {
            return h8.g();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e e8 = this.a;
        if (e8 != null) {
            return e8.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e e8 = this.a;
        if (e8 != null) {
            return e8.d();
        }
        return null;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h h8 = this.f;
        if (h8 != null && h8.b()) {
            this.f.dismiss();
        }
    }

    protected void onMeasure(int n8, int n9) {
        super.onMeasure(n8, n9);
        if (this.f != null && View.MeasureSpec.getMode((int)n8) == Integer.MIN_VALUE) {
            this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.a(this.getAdapter(), this.getBackground())), View.MeasureSpec.getSize((int)n8)), this.getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable object) {
        object = (g)((Object)object);
        super.onRestoreInstanceState(object.getSuperState());
        if (object.q && (object = this.getViewTreeObserver()) != null) {
            object.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(this){
                final u a;
                {
                    this.a = u8;
                }

                public void onGlobalLayout() {
                    ViewTreeObserver viewTreeObserver;
                    if (!this.a.getInternalPopup().b()) {
                        this.a.b();
                    }
                    if ((viewTreeObserver = this.a.getViewTreeObserver()) != null) {
                        viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                    }
                }
            });
        }
    }

    public Parcelable onSaveInstanceState() {
        g g8 = new g(super.onSaveInstanceState());
        h h8 = this.f;
        boolean bl = h8 != null && h8.b();
        g8.q = bl;
        return g8;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        s s8 = this.c;
        if (s8 != null && s8.onTouch((View)this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean performClick() {
        h h8 = this.f;
        if (h8 != null) {
            if (!h8.b()) {
                this.b();
            }
            return true;
        }
        return super.performClick();
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f != null) {
            Context context;
            Context context2 = context = this.b;
            if (context == null) {
                context2 = this.getContext();
            }
            this.f.p(new e(spinnerAdapter, context2.getTheme()));
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e e8 = this.a;
        if (e8 != null) {
            e8.f(drawable);
        }
    }

    public void setBackgroundResource(int n8) {
        super.setBackgroundResource(n8);
        androidx.appcompat.widget.e e8 = this.a;
        if (e8 != null) {
            e8.g(n8);
        }
    }

    public void setDropDownHorizontalOffset(int n8) {
        h h8 = this.f;
        if (h8 != null) {
            h8.m(n8);
            this.f.f(n8);
            return;
        }
        super.setDropDownHorizontalOffset(n8);
    }

    public void setDropDownVerticalOffset(int n8) {
        h h8 = this.f;
        if (h8 != null) {
            h8.l(n8);
            return;
        }
        super.setDropDownVerticalOffset(n8);
    }

    public void setDropDownWidth(int n8) {
        if (this.f != null) {
            this.g = n8;
            return;
        }
        super.setDropDownWidth(n8);
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        h h8 = this.f;
        if (h8 != null) {
            h8.a(drawable);
            return;
        }
        super.setPopupBackgroundDrawable(drawable);
    }

    public void setPopupBackgroundResource(int n8) {
        this.setPopupBackgroundDrawable(ax.o.a.b(this.getPopupContext(), n8));
    }

    public void setPrompt(CharSequence charSequence) {
        h h8 = this.f;
        if (h8 != null) {
            h8.k(charSequence);
            return;
        }
        super.setPrompt(charSequence);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e e8 = this.a;
        if (e8 != null) {
            e8.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e e8 = this.a;
        if (e8 != null) {
            e8.j(mode);
        }
    }

    private static final class c {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (!ax.b0.b.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    class d
    implements h,
    DialogInterface.OnClickListener {
        androidx.appcompat.app.a a;
        private ListAdapter b;
        private CharSequence c;
        final u d;

        d(u u8) {
            this.d = u8;
        }

        @Override
        public void a(Drawable drawable) {
            Log.e((String)"AppCompatSpinner", (String)"Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override
        public boolean b() {
            androidx.appcompat.app.a a8 = this.a;
            if (a8 != null) {
                return a8.isShowing();
            }
            return false;
        }

        @Override
        public int d() {
            return 0;
        }

        @Override
        public void dismiss() {
            androidx.appcompat.app.a a8 = this.a;
            if (a8 != null) {
                a8.dismiss();
                this.a = null;
            }
        }

        @Override
        public void f(int n8) {
            Log.e((String)"AppCompatSpinner", (String)"Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override
        public CharSequence g() {
            return this.c;
        }

        @Override
        public Drawable i() {
            return null;
        }

        @Override
        public void k(CharSequence charSequence) {
            this.c = charSequence;
        }

        @Override
        public void l(int n8) {
            Log.e((String)"AppCompatSpinner", (String)"Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override
        public void m(int n8) {
            Log.e((String)"AppCompatSpinner", (String)"Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override
        public void n(int n8, int n9) {
            if (this.b == null) {
                return;
            }
            Object object = new a.a(this.d.getPopupContext());
            CharSequence charSequence = this.c;
            if (charSequence != null) {
                ((a.a)object).setTitle(charSequence);
            }
            this.a = object = ((a.a)object).n(this.b, this.d.getSelectedItemPosition(), this).create();
            object = ((androidx.appcompat.app.a)object).j();
            object.setTextDirection(n8);
            object.setTextAlignment(n9);
            this.a.show();
        }

        @Override
        public int o() {
            return 0;
        }

        public void onClick(DialogInterface dialogInterface, int n8) {
            this.d.setSelection(n8);
            if (this.d.getOnItemClickListener() != null) {
                this.d.performItemClick(null, n8, this.b.getItemId(n8));
            }
            this.dismiss();
        }

        @Override
        public void p(ListAdapter listAdapter) {
            this.b = listAdapter;
        }
    }

    private static class e
    implements ListAdapter,
    SpinnerAdapter {
        private SpinnerAdapter a;
        private ListAdapter b;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.b = (ListAdapter)spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && ax.u.f.a(spinnerAdapter)) {
                    androidx.appcompat.widget.u$c.a(ax.u.g.a(spinnerAdapter), theme);
                    return;
                }
                if (spinnerAdapter instanceof x && (spinnerAdapter = (x)spinnerAdapter).getDropDownViewTheme() == null) {
                    spinnerAdapter.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int n8, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(n8, view, viewGroup);
        }

        public Object getItem(int n8) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(n8);
        }

        public long getItemId(int n8) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(n8);
        }

        public int getItemViewType(int n8) {
            return 0;
        }

        public View getView(int n8, View view, ViewGroup viewGroup) {
            return this.getDropDownView(n8, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return this.getCount() == 0;
        }

        public boolean isEnabled(int n8) {
            ListAdapter listAdapter = this.b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(n8);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class f
    extends t
    implements h {
        private CharSequence J;
        ListAdapter K;
        private final Rect L;
        private int M;
        final u N;

        public f(u u8, Context context, AttributeSet attributeSet, int n8) {
            this.N = u8;
            super(context, attributeSet, n8);
            this.L = new Rect();
            this.D((View)u8);
            this.J(true);
            this.P(0);
            this.L(new AdapterView.OnItemClickListener(){
                final u a;
                final f b;
                {
                    this.b = f8;
                    this.a = u8;
                }

                public void onItemClick(AdapterView<?> object, View view, int n8, long l8) {
                    this.b.N.setSelection(n8);
                    if (this.b.N.getOnItemClickListener() != null) {
                        object = this.b;
                        object.N.performItemClick(view, n8, object.K.getItemId(n8));
                    }
                    this.b.dismiss();
                }
            });
        }

        void T() {
            int n8;
            Object object = this.i();
            if (object != null) {
                object.getPadding(this.N.h);
                n8 = O.b((View)this.N) ? this.N.h.right : -this.N.h.left;
            } else {
                object = this.N.h;
                ((Rect)object).right = 0;
                ((Rect)object).left = 0;
                n8 = 0;
            }
            int n9 = this.N.getPaddingLeft();
            int n10 = this.N.getPaddingRight();
            int n11 = this.N.getWidth();
            object = this.N;
            int n12 = ((u)((Object)object)).g;
            if (n12 == -2) {
                int n13 = ((u)((Object)object)).a((SpinnerAdapter)this.K, this.i());
                n12 = this.N.getContext().getResources().getDisplayMetrics().widthPixels;
                object = this.N.h;
                int n14 = n12 - ((Rect)object).left - ((Rect)object).right;
                n12 = n13;
                if (n13 > n14) {
                    n12 = n14;
                }
                this.F(Math.max(n12, n11 - n9 - n10));
            } else if (n12 == -1) {
                this.F(n11 - n9 - n10);
            } else {
                this.F(n12);
            }
            n8 = O.b((View)this.N) ? (n8 += n11 - n10 - this.z() - this.U()) : (n8 += n9 + this.U());
            this.f(n8);
        }

        public int U() {
            return this.M;
        }

        boolean V(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.L);
        }

        @Override
        public CharSequence g() {
            return this.J;
        }

        @Override
        public void k(CharSequence charSequence) {
            this.J = charSequence;
        }

        @Override
        public void m(int n8) {
            this.M = n8;
        }

        @Override
        public void n(int n8, int n9) {
            boolean bl = this.b();
            this.T();
            this.I(2);
            super.c();
            ListView listView = this.j();
            listView.setChoiceMode(1);
            listView.setTextDirection(n8);
            listView.setTextAlignment(n9);
            this.Q(this.N.getSelectedItemPosition());
            if (!bl && (listView = this.N.getViewTreeObserver()) != null) {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener(this){
                    final f a;
                    {
                        this.a = f8;
                    }

                    public void onGlobalLayout() {
                        f f8 = this.a;
                        if (!f8.V((View)f8.N)) {
                            this.a.dismiss();
                            return;
                        }
                        this.a.T();
                        f.super.c();
                    }
                };
                listView.addOnGlobalLayoutListener(onGlobalLayoutListener);
                this.K(new PopupWindow.OnDismissListener(){
                    final ViewTreeObserver.OnGlobalLayoutListener a;
                    final f b;
                    {
                        this.b = f8;
                        this.a = onGlobalLayoutListener;
                    }

                    public void onDismiss() {
                        ViewTreeObserver viewTreeObserver = this.b.N.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
                        }
                    }
                });
            }
        }

        @Override
        public void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.K = listAdapter;
        }
    }

    static class g
    extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator<g>(){

            public g a(Parcel parcel) {
                return new g(parcel);
            }

            public g[] b(int n8) {
                return new g[n8];
            }
        };
        boolean q;

        g(Parcel parcel) {
            super(parcel);
            boolean bl = parcel.readByte() != 0;
            this.q = bl;
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeByte((byte)(this.q ? 1 : 0));
        }
    }

    static interface h {
        public void a(Drawable var1);

        public boolean b();

        public int d();

        public void dismiss();

        public void f(int var1);

        public CharSequence g();

        public Drawable i();

        public void k(CharSequence var1);

        public void l(int var1);

        public void m(int var1);

        public void n(int var1, int var2);

        public int o();

        public void p(ListAdapter var1);
    }
}

