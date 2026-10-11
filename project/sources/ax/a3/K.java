package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.a;
import ax.W2.j;
import ax.c3.C1809B;
import ax.c3.C1831t;
import ax.u3.C3180B;
import ax.u3.C3184b;
import ax.u3.C3190h;
import com.voxdon.xplorer.R;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public class K extends AbstractC1354j {
    private int A0;
    private boolean B0;
    private boolean C0;
    private String D0;
    private long E0;
    private long F0;
    private String G0;
    private long H0;
    private long I0;
    private CharSequence J0;
    private i K0;
    private boolean L0;
    private boolean M0;
    private String t0;
    private String u0;
    private boolean v0;
    private boolean w0;
    private boolean x0;
    private boolean y0;
    private boolean z0 = false;

    class a extends ax.g3.c {
        final /* synthetic */ View c;

        a(View view) {
            this.c = view;
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (K.this.f0() == null) {
                return;
            }
            C3180B.U(this.c, K.this.D0, 0, 12).a0();
        }
    }

    class b extends ax.g3.c {
        final /* synthetic */ View c;

        b(View view) {
            this.c = view;
        }

        @Override // ax.g3.c
        public void a(View view) {
            if (K.this.f0() == null) {
                return;
            }
            C3180B.U(this.c, K.this.G0, 0, 12).a0();
        }
    }

    class c extends ax.g3.c {
        c() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            K.this.K0.a(j.f.SKIP, K.this.z0);
            K.this.O2();
        }
    }

    class d extends ax.g3.c {
        d() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            K.this.K0.a(j.f.CANCEL, K.this.z0);
            K.this.O2();
        }
    }

    class e extends ax.g3.c {
        e() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            K.this.K0.a(j.f.OVERWRITE, K.this.z0);
            K.this.O2();
        }
    }

    class f extends ax.g3.c {
        f() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            K.this.K0.a(j.f.OVERWRITE_NEWER, K.this.z0);
            K.this.O2();
        }
    }

    class g extends ax.g3.c {
        g() {
        }

        @Override // ax.g3.c
        public void a(View view) {
            K.this.K0.a(j.f.RENAME, K.this.z0);
            K.this.O2();
        }
    }

    class h implements CompoundButton.OnCheckedChangeListener {
        final /* synthetic */ View a;

        h(View view) {
            this.a = view;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            K.this.z0 = z;
            if (!K.this.y0 || K.this.C0) {
                return;
            }
            if (z) {
                this.a.findViewById(R.id.btn_overwrite_newer).setVisibility(0);
            } else {
                this.a.findViewById(R.id.btn_overwrite_newer).setVisibility(8);
            }
        }
    }

    public interface i {
        void a(j.f fVar, boolean z);
    }

    private void r3(Context context) {
        String format;
        if (this.J0 == null) {
            s3();
            int i2 = this.A0;
            if (i2 == 1) {
                if (!this.x0 || !this.v0) {
                    format = String.format(context.getString(R.string.msg_overwrite_file), "<b>" + this.u0 + "</b>");
                } else if (ax.X2.P.a()) {
                    format = String.format(context.getString(R.string.msg_overwrite_file), "<b>" + this.u0 + "</b>");
                } else {
                    format = String.format(context.getString(R.string.msg_merge_folder), "<b>" + this.u0 + "</b>");
                }
                this.J0 = Html.fromHtml(format);
                return;
            }
            if (i2 == 2) {
                this.J0 = Html.fromHtml((this.v0 ? context.getString(R.string.msg_same_file_name_differnt_type) : context.getString(R.string.msg_same_folder_name_differnt_type)) + "<br><br><b>" + this.u0 + "</b>");
                return;
            }
            if (i2 == 3) {
                this.J0 = Html.fromHtml(context.getString(R.string.msg_subfolder_of_source) + "<br><br><b>" + this.u0 + "</b>");
                return;
            }
            if (i2 != 4) {
                C3184b.f();
                return;
            }
            this.J0 = Html.fromHtml(context.getString(R.string.msg_is_same_file) + "<br><br><b>" + this.u0 + "</b>");
        }
    }

    private void s3() {
        if (this.M0) {
            return;
        }
        this.t0 = j0().getString("progressTypeString");
        this.u0 = j0().getString("fileName");
        this.v0 = j0().getBoolean("isDirectory", false);
        this.A0 = j0().getInt("errCode");
        this.w0 = j0().getBoolean("applyToAll", false);
        this.x0 = j0().getBoolean("useMergeForFolder", false);
        this.y0 = j0().getBoolean("use_overwrite_newer", false);
        this.B0 = j0().getBoolean("directoryRename", false);
        this.C0 = j0().getBoolean("no_overwrite", false);
        this.D0 = j0().getString("new_file_path", HttpUrl.FRAGMENT_ENCODE_SET);
        this.E0 = j0().getLong("new_file_size", -1L);
        this.F0 = j0().getLong("new_file_date", -1L);
        this.G0 = j0().getString("old_file_path", HttpUrl.FRAGMENT_ENCODE_SET);
        this.H0 = j0().getLong("old_file_size", -1L);
        this.I0 = j0().getLong("old_file_date", -1L);
        this.M0 = true;
    }

    private CharSequence t3(String str, long j, long j2) {
        String g2;
        String str2;
        if (j < 0) {
            str2 = "-";
            g2 = "-";
        } else {
            String c2 = C1831t.c(b(), j);
            g2 = C1831t.g(b(), j);
            str2 = c2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<b>");
        sb.append(str);
        sb.append("</b>");
        if (j2 != -1) {
            String i2 = C1809B.i(b(), j2);
            sb.append("<br>");
            sb.append(i2);
        }
        sb.append("<br>");
        sb.append(str2);
        sb.append("<br>");
        sb.append(g2);
        return Html.fromHtml(sb.toString());
    }

    @Override // androidx.fragment.app.Fragment
    public void H1() {
        Button i2;
        super.H1();
        if (this.L0) {
            this.L0 = false;
            N2();
        }
        androidx.appcompat.app.a aVar = (androidx.appcompat.app.a) Q2();
        if (aVar == null || (i2 = aVar.i(-1)) == null) {
            return;
        }
        i2.requestFocus();
    }

    @Override // ax.a3.I
    public void f3() {
        super.f3();
        s3();
        r3(b());
    }

    @Override // ax.a3.I
    public Dialog g3() {
        K k;
        Y2(false);
        a.C0006a a2 = C3190h.a(f0());
        new AtomicBoolean(false);
        View inflate = LayoutInflater.from(f0()).inflate(R.layout.dialog_overwrite_file, (ViewGroup) null, false);
        a2.setView(inflate);
        if (this.A0 != 1 || this.v0) {
            k = this;
            inflate.findViewById(R.id.info_container).setVisibility(8);
        } else {
            inflate.findViewById(R.id.info_container).setVisibility(0);
            TextView textView = (TextView) inflate.findViewById(R.id.info_new);
            TextView textView2 = (TextView) inflate.findViewById(R.id.info_old);
            if (this.F0 == -1 && this.E0 == -1 && this.I0 == -1 && this.H0 == -1) {
                textView.setVisibility(8);
                textView2.setVisibility(8);
                k = this;
            } else {
                k = this;
                textView.setText(k.t3(M0(R.string.source), this.F0, this.E0));
                textView2.setText(k.t3(M0(R.string.target), k.I0, k.H0));
            }
            if (!TextUtils.isEmpty(k.D0)) {
                textView.setOnClickListener(new a(inflate));
            }
            if (!TextUtils.isEmpty(k.G0)) {
                textView2.setOnClickListener(new b(inflate));
            }
        }
        ((TextView) inflate.findViewById(R.id.message)).setText(k.J0);
        inflate.findViewById(R.id.btn_skip).setOnClickListener(new c());
        inflate.findViewById(R.id.btn_cancel).setOnClickListener(new d());
        if (k.A0 == 1) {
            if (k.C0) {
                inflate.findViewById(R.id.btn_overwrite).setVisibility(8);
                inflate.findViewById(R.id.btn_overwrite_newer).setVisibility(8);
            } else {
                Button button = (Button) inflate.findViewById(R.id.btn_overwrite);
                if (k.x0 && k.v0) {
                    button.setText(R.string.dialog_button_merge);
                } else {
                    button.setText(R.string.dialog_button_overwrite);
                }
                button.setOnClickListener(new e());
                inflate.findViewById(R.id.btn_overwrite_newer).setVisibility(8);
                if (k.y0) {
                    inflate.findViewById(R.id.btn_overwrite_newer).setOnClickListener(new f());
                }
            }
            if (!k.v0 || k.B0) {
                inflate.findViewById(R.id.btn_rename).setOnClickListener(new g());
            } else {
                inflate.findViewById(R.id.btn_rename).setVisibility(8);
            }
            if (k.w0) {
                CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.overwrite_file_dialog_cb_apply_to_all);
                TextView textView3 = (TextView) inflate.findViewById(R.id.label_apply_to_all);
                if (!k.x0) {
                    textView3.setText(R.string.dialog_button_apply_to_all);
                } else if (k.v0) {
                    textView3.setText(R.string.dialog_button_apply_to_all_folders);
                } else {
                    textView3.setText(R.string.dialog_button_apply_to_all_files);
                }
                checkBox.setOnCheckedChangeListener(new h(inflate));
            } else {
                inflate.findViewById(R.id.apply_all_container).setVisibility(8);
            }
        } else {
            inflate.findViewById(R.id.btn_overwrite).setVisibility(8);
            inflate.findViewById(R.id.btn_overwrite_newer).setVisibility(8);
            inflate.findViewById(R.id.btn_rename).setVisibility(8);
            inflate.findViewById(R.id.apply_all_container).setVisibility(8);
        }
        androidx.appcompat.app.a create = a2.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    @Override // ax.a3.AbstractC1354j
    public CharSequence i3(Context context) {
        r3(context);
        return null;
    }

    @Override // ax.a3.AbstractC1354j
    public CharSequence j3(Context context) {
        r3(context);
        return this.J0;
    }

    public void u3(boolean z) {
        this.L0 = z;
    }

    public void v3(i iVar) {
        this.K0 = iVar;
    }
}
