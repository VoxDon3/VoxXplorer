package ax.a3;

import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.fragment.app.Fragment;
import ax.u3.C3184b;
import ax.u3.C3190h;
import com.voxdon.xplorer.viewer.VideoPlayerActivity;
import com.voxdon.xplorer.R;

/* loaded from: classes.dex */
public class X extends I {
    public static X i3(Fragment fragment) {
        X x = new X();
        x.D2(fragment, 0);
        return x;
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
    }

    @Override // ax.a3.I
    public Dialog g3() {
        androidx.fragment.app.f f0 = f0();
        a.C0006a p = C3190h.a(f0).p(R.string.subtitle_size);
        View inflate = LayoutInflater.from(f0).inflate(R.layout.dialog_video_subtitle, (ViewGroup) null, false);
        SeekBar seekBar = (SeekBar) inflate.findViewById(R.id.subtitle_size_bar);
        TextView textView = (TextView) inflate.findViewById(R.id.subtitle_example);
        seekBar.setMax(48);
        int h = ax.t3.l.h(f0);
        textView.setTextSize(2, h);
        int i = h - 16;
        seekBar.setProgress(i >= 0 ? i : 0);
        seekBar.setOnSeekBarChangeListener(new a(textView));
        p.b(true);
        p.setView(inflate);
        p.setPositiveButton(android.R.string.ok, null);
        androidx.appcompat.app.a create = p.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }

    class a implements SeekBar.OnSeekBarChangeListener {
        final /* synthetic */ TextView a;

        a(TextView textView) {
            this.a = textView;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (X.this.b() == null) {
                return;
            }
            int i2 = i + 16;
            this.a.setTextSize(2, i2);
            ax.t3.l.m(X.this.b(), i2);
            if (X.this.f0() instanceof VideoPlayerActivity) {
                ((VideoPlayerActivity) X.this.f0()).u4();
            } else if (X.this.f0() != null) {
                C3184b.g("unknown activity:" + X.this.f0().getClass().getName());
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }
}
