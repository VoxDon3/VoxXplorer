/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import ax.P0.P;
import ax.P0.Q;
import ax.P0.V;
import ax.P0.v;
import ax.S0.a;
import ax.a2.B;
import ax.a2.D;
import ax.a2.G;
import ax.a2.f;
import ax.r7.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrackSelectionView
extends LinearLayout {
    private final int a;
    private final LayoutInflater b;
    private final CheckedTextView c;
    private final CheckedTextView d;
    private final b e;
    private final List<V.a> f;
    private final Map<P, Q> g;
    private boolean h;
    private boolean i;
    private G j;
    private CheckedTextView[][] k;
    private boolean l;
    private Comparator<c> m;

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context object, AttributeSet attributeSet, int n8) {
        super(object, attributeSet, n8);
        CheckedTextView checkedTextView;
        this.setOrientation(1);
        this.setSaveFromParentEnabled(false);
        attributeSet = object.getTheme().obtainStyledAttributes(new int[]{16843534});
        this.a = n8 = attributeSet.getResourceId(0, 0);
        attributeSet.recycle();
        attributeSet = LayoutInflater.from((Context)object);
        this.b = attributeSet;
        object = new b(this);
        this.e = object;
        this.j = new f(this.getResources());
        this.f = new ArrayList<V.a>();
        this.g = new HashMap<P, Q>();
        this.c = checkedTextView = (CheckedTextView)attributeSet.inflate(17367055, (ViewGroup)this, false);
        checkedTextView.setBackgroundResource(n8);
        checkedTextView.setText(D.x);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener((View.OnClickListener)object);
        checkedTextView.setVisibility(8);
        this.addView((View)checkedTextView);
        this.addView(attributeSet.inflate(B.a, (ViewGroup)this, false));
        attributeSet = (CheckedTextView)attributeSet.inflate(17367055, (ViewGroup)this, false);
        this.d = attributeSet;
        attributeSet.setBackgroundResource(n8);
        attributeSet.setText(D.w);
        attributeSet.setEnabled(false);
        attributeSet.setFocusable(true);
        attributeSet.setOnClickListener((View.OnClickListener)object);
        this.addView((View)attributeSet);
    }

    public static Map<P, Q> b(Map<P, Q> map, List<V.a> list, boolean bl) {
        HashMap<P, Q> hashMap = new HashMap<P, Q>();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            Q q8 = map.get(list.get(i8).a());
            if (q8 == null || !bl && !hashMap.isEmpty()) continue;
            hashMap.put(q8.a, q8);
        }
        return hashMap;
    }

    private void c(View view) {
        if (view == this.c) {
            this.e();
        } else if (view == this.d) {
            this.d();
        } else {
            this.f(view);
        }
        this.i();
    }

    private void d() {
        this.l = false;
        this.g.clear();
    }

    private void e() {
        this.l = true;
        this.g.clear();
    }

    private void f(View view) {
        boolean bl = false;
        this.l = false;
        c c8 = (c)ax.S0.a.e(view.getTag());
        P p8 = c8.a.a();
        int n8 = c8.b;
        Object object = this.g.get(p8);
        if (object == null) {
            if (!this.i && !this.g.isEmpty()) {
                this.g.clear();
            }
            this.g.put(p8, new Q(p8, z.A(n8)));
            return;
        }
        object = new ArrayList<Integer>(((Q)object).b);
        boolean bl2 = ((CheckedTextView)view).isChecked();
        boolean bl3 = this.g(c8.a);
        if (bl3 || this.h()) {
            bl = true;
        }
        if (bl2 && bl) {
            ((ArrayList)object).remove((Object)n8);
            if (((ArrayList)object).isEmpty()) {
                this.g.remove(p8);
                return;
            }
            this.g.put(p8, new Q(p8, (List<Integer>)object));
            return;
        }
        if (!bl2) {
            if (bl3) {
                ((ArrayList)object).add(n8);
                this.g.put(p8, new Q(p8, (List<Integer>)object));
                return;
            }
            this.g.put(p8, new Q(p8, z.A(n8)));
        }
    }

    private boolean g(V.a a8) {
        return this.h && a8.e();
    }

    private boolean h() {
        return this.i && this.f.size() > 1;
    }

    private void i() {
        this.c.setChecked(this.l);
        Object object = this.d;
        boolean bl = !this.l && this.g.isEmpty();
        object.setChecked(bl);
        for (int i8 = 0; i8 < this.k.length; ++i8) {
            Object object2;
            object = this.g.get(this.f.get(i8).a());
            for (int i9 = 0; i9 < ((CheckedTextView[])(object2 = this.k[i8])).length; ++i9) {
                if (object != null) {
                    object2 = (c)ax.S0.a.e(object2[i9].getTag());
                    this.k[i8][i9].setChecked(object.b.contains(object2.b));
                    continue;
                }
                object2[i9].setChecked(false);
            }
        }
    }

    private void j() {
        int n8;
        for (n8 = this.getChildCount() - 1; n8 >= 3; --n8) {
            this.removeViewAt(n8);
        }
        if (this.f.isEmpty()) {
            this.c.setEnabled(false);
            this.d.setEnabled(false);
            return;
        }
        this.c.setEnabled(true);
        this.d.setEnabled(true);
        this.k = new CheckedTextView[this.f.size()][];
        boolean bl = this.h();
        for (n8 = 0; n8 < this.f.size(); ++n8) {
            int n9;
            V.a a8 = this.f.get(n8);
            boolean bl2 = this.g(a8);
            CheckedTextView[][] checkedTextViewArray = this.k;
            int n10 = a8.a;
            checkedTextViewArray[n8] = new CheckedTextView[n10];
            checkedTextViewArray = new c[n10];
            for (n9 = 0; n9 < a8.a; ++n9) {
                checkedTextViewArray[n9] = new c(a8, n9);
            }
            CheckedTextView checkedTextView = this.m;
            if (checkedTextView != null) {
                Arrays.sort(checkedTextViewArray, checkedTextView);
            }
            for (n9 = 0; n9 < n10; ++n9) {
                if (n9 == 0) {
                    this.addView(this.b.inflate(B.a, (ViewGroup)this, false));
                }
                int n11 = !bl2 && !bl ? 17367055 : 0x1090010;
                checkedTextView = (CheckedTextView)this.b.inflate(n11, (ViewGroup)this, false);
                checkedTextView.setBackgroundResource(this.a);
                checkedTextView.setText((CharSequence)this.j.a(checkedTextViewArray[n9].a()));
                checkedTextView.setTag((Object)checkedTextViewArray[n9]);
                if (a8.j(n9)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener((View.OnClickListener)this.e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.k[n8][n9] = checkedTextView;
                this.addView((View)checkedTextView);
            }
        }
        this.i();
    }

    public boolean getIsDisabled() {
        return this.l;
    }

    public Map<P, Q> getOverrides() {
        return this.g;
    }

    public void setAllowAdaptiveSelections(boolean bl) {
        if (this.h != bl) {
            this.h = bl;
            this.j();
        }
    }

    public void setAllowMultipleOverrides(boolean bl) {
        if (this.i != bl) {
            this.i = bl;
            if (!bl && this.g.size() > 1) {
                Map<P, Q> map = TrackSelectionView.b(this.g, this.f, false);
                this.g.clear();
                this.g.putAll(map);
            }
            this.j();
        }
    }

    public void setShowDisableOption(boolean bl) {
        CheckedTextView checkedTextView = this.c;
        int n8 = bl ? 0 : 8;
        checkedTextView.setVisibility(n8);
    }

    public void setTrackNameProvider(G g8) {
        this.j = ax.S0.a.e(g8);
        this.j();
    }

    private class b
    implements View.OnClickListener {
        final TrackSelectionView a;

        private b(TrackSelectionView trackSelectionView) {
            this.a = trackSelectionView;
        }

        public void onClick(View view) {
            this.a.c(view);
        }
    }

    private static final class c {
        public final V.a a;
        public final int b;

        public c(V.a a8, int n8) {
            this.a = a8;
            this.b = n8;
        }

        public v a() {
            return this.a.b(this.b);
        }
    }
}

