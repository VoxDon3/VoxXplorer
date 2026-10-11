package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.a;
import ax.u3.C3190h;
import com.voxdon.xplorer.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class H extends AbstractC1354j {
    private String t0;
    private CharSequence u0;
    private b v0;
    private boolean w0;

    class a extends AbstractDialogInterfaceOnClickListenerC1363t {
        final /* synthetic */ AtomicBoolean b;

        a(AtomicBoolean atomicBoolean) {
            this.b = atomicBoolean;
        }

        @Override // ax.a3.AbstractDialogInterfaceOnClickListenerC1363t
        public void a(DialogInterface dialogInterface, int i) {
            if (this.b.get()) {
                ax.Ha.c.h().f().d("ONRESULT CALLED TWICE").h();
                return;
            }
            this.b.set(true);
            if (i == -2) {
                H.this.v0.a(false);
            } else {
                if (i != -1) {
                    return;
                }
                H.this.v0.a(true);
            }
        }
    }

    public interface b {
        void a(boolean z);
    }

    public static H l3(String str, int i) {
        H h = new H();
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putInt("message", i);
        h.v2(bundle);
        return h;
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        super.H1();
        if (this.w0) {
            this.w0 = false;
            N2();
        }
        androidx.appcompat.app.a aVar = (androidx.appcompat.app.a) Q2();
        if (aVar != null) {
            aVar.i(-1).requestFocus();
        }
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
        String string = j0().getString("title");
        this.u0 = M0(j0().getInt("message", R.string.error));
        this.t0 = string;
    }

    @Override // ax.a3.I
    public Dialog g3() {
        Y2(false);
        a.C0006a a2 = C3190h.a(f0());
        a2.setTitle(this.t0);
        View inflate = LayoutInflater.from(f0()).inflate(R.layout.dialog_command_result, (ViewGroup) null, false);
        if (!TextUtils.isEmpty(this.u0)) {
            TextView textView = (TextView) inflate.findViewById(R.id.error_message);
            textView.setVisibility(0);
            textView.setText(this.u0);
            a2.setView(inflate);
        }
        a aVar = new a(new AtomicBoolean(false));
        a2.setPositiveButton(R.string.retry, aVar);
        a2.setNegativeButton(R.string.dialog_button_cancel, aVar);
        androidx.appcompat.app.a create = a2.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    @Override // ax.a3.AbstractC1354j
    public CharSequence i3(Context context) {
        return null;
    }

    @Override // ax.a3.AbstractC1354j
    public CharSequence j3(Context context) {
        if (this.u0 == null && j0() != null) {
            this.u0 = context.getString(j0().getInt("message", R.string.error));
        }
        return this.u0;
    }

    public void m3(b bVar) {
        this.v0 = bVar;
    }

    public void n3(boolean z) {
        this.w0 = z;
    }
}
