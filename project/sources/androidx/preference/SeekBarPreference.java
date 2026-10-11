package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import ax.b2.C1478f;
import ax.b2.C1480h;
import ax.b2.C1484l;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    int R0;
    int S0;
    private int T0;
    private int U0;
    boolean V0;
    SeekBar W0;
    private TextView X0;
    boolean Y0;
    private boolean Z0;
    boolean a1;
    private final SeekBar.OnSeekBarChangeListener b1;
    private final View.OnKeyListener c1;

    class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.a1 || !seekBarPreference.V0) {
                    seekBarPreference.X0(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.Y0(i + seekBarPreference2.S0);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.V0 = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.V0 = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.S0 != seekBarPreference.R0) {
                seekBarPreference.X0(seekBar);
            }
        }
    }

    class b implements View.OnKeyListener {
        b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.Y0 && (i == 21 || i == 22)) || i == 23 || i == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.W0;
            if (seekBar != null) {
                return seekBar.onKeyDown(i, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b1 = new a();
        this.c1 = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1484l.H0, i, i2);
        this.S0 = obtainStyledAttributes.getInt(C1484l.K0, 0);
        T0(obtainStyledAttributes.getInt(C1484l.I0, 100));
        U0(obtainStyledAttributes.getInt(C1484l.L0, 0));
        this.Y0 = obtainStyledAttributes.getBoolean(C1484l.J0, true);
        this.Z0 = obtainStyledAttributes.getBoolean(C1484l.M0, false);
        this.a1 = obtainStyledAttributes.getBoolean(C1484l.N0, false);
        obtainStyledAttributes.recycle();
    }

    private void W0(int i, boolean z) {
        int i2 = this.S0;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.T0;
        if (i > i3) {
            i = i3;
        }
        if (i != this.R0) {
            this.R0 = i;
            Y0(i);
            r0(i);
            if (z) {
                W();
            }
        }
    }

    public final void T0(int i) {
        int i2 = this.S0;
        if (i < i2) {
            i = i2;
        }
        if (i != this.T0) {
            this.T0 = i;
            W();
        }
    }

    public final void U0(int i) {
        if (i != this.U0) {
            this.U0 = Math.min(this.T0 - this.S0, Math.abs(i));
            W();
        }
    }

    public void V0(int i) {
        W0(i, true);
    }

    void X0(SeekBar seekBar) {
        int progress = this.S0 + seekBar.getProgress();
        if (progress != this.R0) {
            if (h(Integer.valueOf(progress))) {
                W0(progress, false);
            } else {
                seekBar.setProgress(this.R0 - this.S0);
                Y0(this.R0);
            }
        }
    }

    void Y0(int i) {
        TextView textView = this.X0;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    @Override // androidx.preference.Preference
    public void c0(h hVar) {
        super.c0(hVar);
        hVar.a.setOnKeyListener(this.c1);
        this.W0 = (SeekBar) hVar.N(C1480h.c);
        TextView textView = (TextView) hVar.N(C1480h.d);
        this.X0 = textView;
        if (this.Z0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.X0 = null;
        }
        SeekBar seekBar = this.W0;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.b1);
        this.W0.setMax(this.T0 - this.S0);
        int i = this.U0;
        if (i != 0) {
            this.W0.setKeyProgressIncrement(i);
        } else {
            this.U0 = this.W0.getKeyProgressIncrement();
        }
        this.W0.setProgress(this.R0 - this.S0);
        Y0(this.R0);
        this.W0.setEnabled(S());
    }

    @Override // androidx.preference.Preference
    protected Object g0(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    protected void k0(Parcelable parcelable) {
        if (parcelable == null || !parcelable.getClass().equals(c.class)) {
            super.k0(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.k0(cVar.getSuperState());
        this.R0 = cVar.q;
        this.S0 = cVar.c0;
        this.T0 = cVar.d0;
        W();
    }

    @Override // androidx.preference.Preference
    protected Parcelable l0() {
        Parcelable l0 = super.l0();
        if (T()) {
            return l0;
        }
        c cVar = new c(l0);
        cVar.q = this.R0;
        cVar.c0 = this.S0;
        cVar.d0 = this.T0;
        return cVar;
    }

    @Override // androidx.preference.Preference
    protected void m0(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        V0(G(((Integer) obj).intValue()));
    }

    private static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new a();
        int c0;
        int d0;
        int q;

        class a implements Parcelable.Creator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        c(Parcel parcel) {
            super(parcel);
            this.q = parcel.readInt();
            this.c0 = parcel.readInt();
            this.d0 = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.q);
            parcel.writeInt(this.c0);
            parcel.writeInt(this.d0);
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1478f.j);
    }
}
