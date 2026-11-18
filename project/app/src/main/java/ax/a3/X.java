/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.fragment.app.Fragment;
import ax.a3.I;
import ax.n2.d;
import ax.t3.l;
import ax.u3.b;
import ax.u3.h;
import com.voxdon.xplorer.viewer.VideoPlayerActivity;

public class X
extends I {
    public static X i3(Fragment fragment) {
        X x8 = new X();
        x8.D2(fragment, 0);
        return x8;
    }

    @Override
    public void f3() {
        super.f3();
    }

    @Override
    public Dialog g3() {
        d d8 = this.f0();
        a.a a8 = h.a((Context)d8).p(2131952636);
        LayoutInflater layoutInflater = LayoutInflater.from((Context)d8);
        int n8 = 0;
        layoutInflater = layoutInflater.inflate(2131558524, null, false);
        SeekBar seekBar = (SeekBar)layoutInflater.findViewById(2131362920);
        TextView textView = (TextView)layoutInflater.findViewById(2131362919);
        seekBar.setMax(48);
        int n9 = l.h((Context)d8);
        textView.setTextSize(2, (float)n9);
        if ((n9 -= 16) >= 0) {
            n8 = n9;
        }
        seekBar.setProgress(n8);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){
            final TextView a;
            final X b;
            {
                this.b = x8;
                this.a = textView;
            }

            public void onProgressChanged(SeekBar object, int n8, boolean bl) {
                if (this.b.b() != null) {
                    this.a.setTextSize(2, (float)(n8 += 16));
                    l.m(this.b.b(), n8);
                    if (this.b.f0() instanceof VideoPlayerActivity) {
                        ((VideoPlayerActivity)this.b.f0()).u4();
                        return;
                    }
                    if (this.b.f0() != null) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("unknown activity:");
                        ((StringBuilder)object).append(this.b.f0().getClass().getName());
                        b.g(((StringBuilder)object).toString());
                    }
                }
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        a8.b(true);
        a8.setView((View)layoutInflater);
        a8.setPositiveButton(17039370, null);
        d8 = a8.create();
        d8.setCanceledOnTouchOutside(true);
        return d8;
    }
}

