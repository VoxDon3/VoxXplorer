/*
 * Decompiled with CFR 0.152.
 */
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
import androidx.preference.h;
import ax.b2.f;
import ax.b2.l;

public class SeekBarPreference
extends Preference {
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
    private final SeekBar.OnSeekBarChangeListener b1 = new SeekBar.OnSeekBarChangeListener(this){
        final SeekBarPreference a;
        {
            this.a = seekBarPreference;
        }

        public void onProgressChanged(SeekBar object, int n8, boolean bl) {
            if (bl) {
                SeekBarPreference seekBarPreference = this.a;
                if (seekBarPreference.a1 || !seekBarPreference.V0) {
                    seekBarPreference.X0((SeekBar)object);
                    return;
                }
            }
            object = this.a;
            ((SeekBarPreference)object).Y0(n8 + ((SeekBarPreference)object).S0);
        }

        public void onStartTrackingTouch(SeekBar seekBar) {
            this.a.V0 = true;
        }

        public void onStopTrackingTouch(SeekBar seekBar) {
            this.a.V0 = false;
            int n8 = seekBar.getProgress();
            SeekBarPreference seekBarPreference = this.a;
            if (n8 + seekBarPreference.S0 != seekBarPreference.R0) {
                seekBarPreference.X0(seekBar);
            }
        }
    };
    private final View.OnKeyListener c1 = new View.OnKeyListener(this){
        final SeekBarPreference a;
        {
            this.a = seekBarPreference;
        }

        public boolean onKey(View object, int n8, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            object = this.a;
            if (!(object.Y0 || n8 != 21 && n8 != 22)) {
                return false;
            }
            if (n8 != 23 && n8 != 66) {
                object = object.W0;
                if (object == null) {
                    Log.e((String)"SeekBarPreference", (String)"SeekBar view is null and hence cannot be adjusted.");
                    return false;
                }
                return object.onKeyDown(n8, keyEvent);
            }
            return false;
        }
    };

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.j);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int n8) {
        this(context, attributeSet, n8, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int n8, int n9) {
        super(context, attributeSet, n8, n9);
        context = context.obtainStyledAttributes(attributeSet, l.H0, n8, n9);
        this.S0 = context.getInt(l.K0, 0);
        this.T0(context.getInt(l.I0, 100));
        this.U0(context.getInt(l.L0, 0));
        this.Y0 = context.getBoolean(l.J0, true);
        this.Z0 = context.getBoolean(l.M0, false);
        this.a1 = context.getBoolean(l.N0, false);
        context.recycle();
    }

    private void W0(int n8, boolean bl) {
        int n9 = this.S0;
        int n10 = n8;
        if (n8 < n9) {
            n10 = n9;
        }
        n9 = this.T0;
        n8 = n10;
        if (n10 > n9) {
            n8 = n9;
        }
        if (n8 != this.R0) {
            this.R0 = n8;
            this.Y0(n8);
            this.r0(n8);
            if (bl) {
                this.W();
            }
        }
    }

    public final void T0(int n8) {
        int n9 = this.S0;
        int n10 = n8;
        if (n8 < n9) {
            n10 = n9;
        }
        if (n10 != this.T0) {
            this.T0 = n10;
            this.W();
        }
    }

    public final void U0(int n8) {
        if (n8 != this.U0) {
            this.U0 = Math.min(this.T0 - this.S0, Math.abs(n8));
            this.W();
        }
    }

    public void V0(int n8) {
        this.W0(n8, true);
    }

    void X0(SeekBar seekBar) {
        int n8 = this.S0 + seekBar.getProgress();
        if (n8 != this.R0) {
            if (this.h(n8)) {
                this.W0(n8, false);
                return;
            }
            seekBar.setProgress(this.R0 - this.S0);
            this.Y0(this.R0);
        }
    }

    void Y0(int n8) {
        TextView textView = this.X0;
        if (textView != null) {
            textView.setText((CharSequence)String.valueOf(n8));
        }
    }

    @Override
    public void c0(h h8) {
        super.c0(h8);
        h8.a.setOnKeyListener(this.c1);
        this.W0 = (SeekBar)h8.N(ax.b2.h.c);
        h8 = (TextView)h8.N(ax.b2.h.d);
        this.X0 = h8;
        if (this.Z0) {
            h8.setVisibility(0);
        } else {
            h8.setVisibility(8);
            this.X0 = null;
        }
        h8 = this.W0;
        if (h8 == null) {
            Log.e((String)"SeekBarPreference", (String)"SeekBar view is null in onBindViewHolder.");
            return;
        }
        h8.setOnSeekBarChangeListener(this.b1);
        this.W0.setMax(this.T0 - this.S0);
        int n8 = this.U0;
        if (n8 != 0) {
            this.W0.setKeyProgressIncrement(n8);
        } else {
            this.U0 = this.W0.getKeyProgressIncrement();
        }
        this.W0.setProgress(this.R0 - this.S0);
        this.Y0(this.R0);
        this.W0.setEnabled(this.S());
    }

    @Override
    protected Object g0(TypedArray typedArray, int n8) {
        return typedArray.getInt(n8, 0);
    }

    @Override
    protected void k0(Parcelable object) {
        if (object != null && object.getClass().equals(c.class)) {
            object = (c)((Object)object);
            super.k0(object.getSuperState());
            this.R0 = object.q;
            this.S0 = object.c0;
            this.T0 = object.d0;
            this.W();
            return;
        }
        super.k0((Parcelable)object);
    }

    @Override
    protected Parcelable l0() {
        Object object = super.l0();
        if (this.T()) {
            return object;
        }
        object = new c((Parcelable)object);
        object.q = this.R0;
        object.c0 = this.S0;
        object.d0 = this.T0;
        return object;
    }

    @Override
    protected void m0(Object object) {
        Object object2 = object;
        if (object == null) {
            object2 = 0;
        }
        this.V0(this.G((Integer)object2));
    }

    private static class c
    extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new Parcelable.Creator<c>(){

            public c a(Parcel parcel) {
                return new c(parcel);
            }

            public c[] b(int n8) {
                return new c[n8];
            }
        };
        int c0;
        int d0;
        int q;

        c(Parcel parcel) {
            super(parcel);
            this.q = parcel.readInt();
            this.c0 = parcel.readInt();
            this.d0 = parcel.readInt();
        }

        c(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int n8) {
            super.writeToParcel(parcel, n8);
            parcel.writeInt(this.q);
            parcel.writeInt(this.c0);
            parcel.writeInt(this.d0);
        }
    }
}

