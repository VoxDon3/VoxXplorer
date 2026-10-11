/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.app.Dialog;
import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.app.a;
import ax.W2.j;
import ax.X2.P;
import ax.a3.j;
import ax.c3.B;
import ax.c3.t;
import ax.g3.c;
import ax.u3.b;
import ax.u3.h;
import java.util.concurrent.atomic.AtomicBoolean;

public class K
extends j {
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

    static /* synthetic */ boolean n3(K k8, boolean bl) {
        k8.z0 = bl;
        return bl;
    }

    private void r3(Context object) {
        if (this.J0 == null) {
            this.s3();
            int n8 = this.A0;
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            b.f();
                            return;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(object.getString(2131952348));
                        stringBuilder.append("<br><br><b>");
                        stringBuilder.append(this.u0);
                        stringBuilder.append("</b>");
                        this.J0 = Html.fromHtml((String)stringBuilder.toString());
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(object.getString(2131952366));
                    stringBuilder.append("<br><br><b>");
                    stringBuilder.append(this.u0);
                    stringBuilder.append("</b>");
                    this.J0 = Html.fromHtml((String)stringBuilder.toString());
                    return;
                }
                object = this.v0 ? object.getString(2131952363) : object.getString(2131952364);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)object);
                stringBuilder.append("<br><br><b>");
                stringBuilder.append(this.u0);
                stringBuilder.append("</b>");
                this.J0 = Html.fromHtml((String)stringBuilder.toString());
                return;
            }
            if (this.x0 && this.v0) {
                if (P.a()) {
                    object = object.getString(2131952354);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("<b>");
                    stringBuilder.append(this.u0);
                    stringBuilder.append("</b>");
                    object = String.format((String)object, stringBuilder.toString());
                } else {
                    object = object.getString(2131952349);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("<b>");
                    stringBuilder.append(this.u0);
                    stringBuilder.append("</b>");
                    object = String.format((String)object, stringBuilder.toString());
                }
            } else {
                object = object.getString(2131952354);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("<b>");
                stringBuilder.append(this.u0);
                stringBuilder.append("</b>");
                object = String.format((String)object, stringBuilder.toString());
            }
            this.J0 = Html.fromHtml((String)object);
        }
    }

    private void s3() {
        if (!this.M0) {
            this.t0 = this.j0().getString("progressTypeString");
            this.u0 = this.j0().getString("fileName");
            this.v0 = this.j0().getBoolean("isDirectory", false);
            this.A0 = this.j0().getInt("errCode");
            this.w0 = this.j0().getBoolean("applyToAll", false);
            this.x0 = this.j0().getBoolean("useMergeForFolder", false);
            this.y0 = this.j0().getBoolean("use_overwrite_newer", false);
            this.B0 = this.j0().getBoolean("directoryRename", false);
            this.C0 = this.j0().getBoolean("no_overwrite", false);
            this.D0 = this.j0().getString("new_file_path", "");
            this.E0 = this.j0().getLong("new_file_size", -1L);
            this.F0 = this.j0().getLong("new_file_date", -1L);
            this.G0 = this.j0().getString("old_file_path", "");
            this.H0 = this.j0().getLong("old_file_size", -1L);
            this.I0 = this.j0().getLong("old_file_date", -1L);
            this.M0 = true;
        }
    }

    private CharSequence t3(String string, long l8, long l9) {
        String string2;
        String string3;
        if (l8 < 0L) {
            string3 = "-";
            string2 = "-";
        } else {
            string3 = t.c(this.b(), l8);
            string2 = t.g(this.b(), l8);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<b>");
        stringBuilder.append(string);
        stringBuilder.append("</b>");
        if (l9 != -1L) {
            string = B.i(this.b(), l9);
            stringBuilder.append("<br>");
            stringBuilder.append(string);
        }
        stringBuilder.append("<br>");
        stringBuilder.append(string3);
        stringBuilder.append("<br>");
        stringBuilder.append(string2);
        return Html.fromHtml((String)stringBuilder.toString());
    }

    @Override
    public void H1() {
        a a8;
        super.H1();
        if (this.L0) {
            this.L0 = false;
            this.N2();
        }
        if ((a8 = (a)this.Q2()) != null && (a8 = a8.i(-1)) != null) {
            a8.requestFocus();
        }
    }

    @Override
    public void f3() {
        super.f3();
        this.s3();
        this.r3(this.b());
    }

    @Override
    public Dialog g3() {
        String string;
        TextView textView;
        this.Y2(false);
        a.a a8 = h.a((Context)this.f0());
        new AtomicBoolean(false);
        Object object = LayoutInflater.from((Context)this.f0()).inflate(2131558515, null, false);
        a8.setView((View)object);
        if (this.A0 == 1 && !this.v0) {
            object.findViewById(2131362402).setVisibility(0);
            TextView textView2 = (TextView)object.findViewById(2131362404);
            textView = (TextView)object.findViewById(2131362405);
            if (this.F0 == -1L && this.E0 == -1L && this.I0 == -1L && this.H0 == -1L) {
                textView2.setVisibility(8);
                textView.setVisibility(8);
            } else {
                string = this.M0(2131952622);
                long l8 = this.F0;
                long l9 = this.E0;
                textView2.setText(this.t3(string, l8, l9));
                textView.setText(this.t3(this.M0(2131952644), this.I0, this.H0));
            }
            if (!TextUtils.isEmpty((CharSequence)this.D0)) {
                textView2.setOnClickListener((View.OnClickListener)new c(this, (View)object){
                    final View c;
                    final K d;
                    {
                        this.d = k8;
                        this.c = view;
                    }

                    @Override
                    public void a(View view) {
                        if (this.d.f0() == null) {
                            return;
                        }
                        ax.u3.B.U(this.c, this.d.D0, 0, 12).a0();
                    }
                });
            }
            if (!TextUtils.isEmpty((CharSequence)this.G0)) {
                textView.setOnClickListener((View.OnClickListener)new c(this, (View)object){
                    final View c;
                    final K d;
                    {
                        this.d = k8;
                        this.c = view;
                    }

                    @Override
                    public void a(View view) {
                        if (this.d.f0() == null) {
                            return;
                        }
                        ax.u3.B.U(this.c, this.d.G0, 0, 12).a0();
                    }
                });
            }
        } else {
            object.findViewById(2131362402).setVisibility(8);
        }
        ((TextView)object.findViewById(2131362552)).setText(this.J0);
        object.findViewById(2131361978).setOnClickListener((View.OnClickListener)new c(this){
            final K c;
            {
                this.c = k8;
            }

            @Override
            public void a(View view) {
                this.c.K0.a(j.f.c0, this.c.z0);
                this.c.O2();
            }
        });
        object.findViewById(2131361969).setOnClickListener((View.OnClickListener)new c(this){
            final K c;
            {
                this.c = k8;
            }

            @Override
            public void a(View view) {
                this.c.K0.a(j.f.g0, this.c.z0);
                this.c.O2();
            }
        });
        if (this.A0 == 1) {
            if (!this.C0) {
                textView = (Button)object.findViewById(2131361975);
                if (this.x0 && this.v0) {
                    textView.setText(2131951814);
                } else {
                    textView.setText(2131951815);
                }
                textView.setOnClickListener((View.OnClickListener)new c(this){
                    final K c;
                    {
                        this.c = k8;
                    }

                    @Override
                    public void a(View view) {
                        this.c.K0.a(j.f.e0, this.c.z0);
                        this.c.O2();
                    }
                });
                object.findViewById(2131361976).setVisibility(8);
                if (this.y0) {
                    object.findViewById(2131361976).setOnClickListener((View.OnClickListener)new c(this){
                        final K c;
                        {
                            this.c = k8;
                        }

                        @Override
                        public void a(View view) {
                            this.c.K0.a(j.f.f0, this.c.z0);
                            this.c.O2();
                        }
                    });
                }
            } else {
                object.findViewById(2131361975).setVisibility(8);
                object.findViewById(2131361976).setVisibility(8);
            }
            if (this.v0 && !this.B0) {
                object.findViewById(2131361977).setVisibility(8);
            } else {
                object.findViewById(2131361977).setOnClickListener((View.OnClickListener)new c(this){
                    final K c;
                    {
                        this.c = k8;
                    }

                    @Override
                    public void a(View view) {
                        this.c.K0.a(j.f.d0, this.c.z0);
                        this.c.O2();
                    }
                });
            }
            if (this.w0) {
                string = (CheckBox)object.findViewById(2131362658);
                textView = (TextView)object.findViewById(2131362432);
                if (this.x0) {
                    if (this.v0) {
                        textView.setText(2131951809);
                    } else {
                        textView.setText(2131951808);
                    }
                } else {
                    textView.setText(2131951807);
                }
                string.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
                    final View a;
                    final K b;
                    {
                        this.b = k8;
                        this.a = view;
                    }

                    public void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
                        K.n3(this.b, bl);
                        if (this.b.y0 && !this.b.C0) {
                            if (bl) {
                                this.a.findViewById(2131361976).setVisibility(0);
                                return;
                            }
                            this.a.findViewById(2131361976).setVisibility(8);
                        }
                    }
                });
            } else {
                object.findViewById(2131361898).setVisibility(8);
            }
        } else {
            object.findViewById(2131361975).setVisibility(8);
            object.findViewById(2131361976).setVisibility(8);
            object.findViewById(2131361977).setVisibility(8);
            object.findViewById(2131361898).setVisibility(8);
        }
        object = a8.create();
        object.setCanceledOnTouchOutside(false);
        return object;
    }

    @Override
    public CharSequence i3(Context context) {
        this.r3(context);
        return null;
    }

    @Override
    public CharSequence j3(Context context) {
        this.r3(context);
        return this.J0;
    }

    public void u3(boolean bl) {
        this.L0 = bl;
    }

    public void v3(i i8) {
        this.K0 = i8;
    }

    public static interface i {
        public void a(j.f var1, boolean var2);
    }
}

