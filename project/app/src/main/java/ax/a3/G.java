/*
 * Decompiled with CFR 0.152.
 */
package ax.a3;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import ax.Ha.c;
import ax.Q2.f;
import ax.X2.Q;
import ax.a3.E;
import ax.a3.F;
import ax.a3.t;
import ax.c3.K;
import ax.c3.u;
import ax.t3.k;
import ax.u3.B;
import ax.u3.h;
import java.util.Locale;

@TargetApi(value=21)
public class G
extends e {
    private boolean t0;
    private int u0;
    private K v0;
    private String w0;

    private boolean g3() {
        K k8 = this.v0;
        if (k8 == null) {
            return true;
        }
        return f.t0(k8.d());
    }

    private boolean h3() {
        K k8 = this.v0;
        if (k8 == null) {
            return false;
        }
        return f.x0(k8.d());
    }

    @Override
    public void H1() {
        View view;
        super.H1();
        if (this.Q2() != null && this.Q2().getWindow() != null && (view = this.Q2().getWindow().findViewById(2131362371)) != null && view.getVisibility() == 0 && this.f3((Context)this.f0())) {
            view.setVisibility(8);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Dialog T2(Bundle object) {
        View view;
        boolean bl;
        a.a a8;
        block35: {
            View view2;
            Object object2;
            TextView textView;
            block32: {
                block34: {
                    block33: {
                        Object object3;
                        block24: {
                            int n8;
                            StringBuilder stringBuilder;
                            int n9;
                            int n10;
                            int n11;
                            block26: {
                                block25: {
                                    boolean bl2;
                                    block27: {
                                        block30: {
                                            block31: {
                                                block28: {
                                                    block29: {
                                                        object3 = this.b();
                                                        a8 = h.a((Context)this.f0());
                                                        a8.p(2131952494);
                                                        bl = this.g3();
                                                        bl2 = this.h3();
                                                        view = LayoutInflater.from((Context)this.f0()).inflate(2131558511, null, false);
                                                        if (this.u0 == 0) break block27;
                                                        object = (TextView)view.findViewById(2131362144);
                                                        object.setVisibility(0);
                                                        if (!bl) break block28;
                                                        n11 = this.u0;
                                                        if (n11 != 1) break block29;
                                                        object.setText(2131951905);
                                                        break block27;
                                                    }
                                                    if (n11 == 2) {
                                                        object.setText(2131951908);
                                                        break block27;
                                                    } else if (n11 == 3) {
                                                        object.setText(2131951911);
                                                    }
                                                    break block27;
                                                }
                                                if (!bl2) break block30;
                                                n11 = this.u0;
                                                if (n11 != 1) break block31;
                                                object.setText(2131951907);
                                                break block27;
                                            }
                                            if (n11 == 2) {
                                                object.setText(2131951910);
                                                break block27;
                                            } else if (n11 == 3) {
                                                object.setText(2131951913);
                                            }
                                            break block27;
                                        }
                                        n11 = this.u0;
                                        if (n11 == 1) {
                                            object.setText(2131951906);
                                        } else if (n11 == 2) {
                                            object.setText(2131951909);
                                        } else if (n11 == 3) {
                                            object.setText(2131951912);
                                        }
                                    }
                                    object = (TextView)view.findViewById(2131362370);
                                    if (bl) {
                                        object.setText(2131952092);
                                    } else if (bl2) {
                                        object.setText(2131952099);
                                    } else {
                                        object.setText(2131952098);
                                    }
                                    object = (TextView)view.findViewById(2131362371);
                                    object.setText(2131952093);
                                    if (!this.f3((Context)this.f0())) {
                                        object.setVisibility(0);
                                    }
                                    object = (TextView)view.findViewById(2131362372);
                                    textView = (TextView)view.findViewById(2131362373);
                                    object2 = (TextView)view.findViewById(2131362374);
                                    view2 = view.findViewById(2131362361);
                                    if (!Q.X()) break block32;
                                    object = this.v0;
                                    object = object != null ? ((K)object).f(this.b()) : (!bl ? this.M0(2131952191) : this.M0(2131952181));
                                    object2 = this.N0(2131952091, "[]");
                                    n10 = ((String)object2).indexOf("[");
                                    n9 = ((String)object2).indexOf("]");
                                    if (n10 == -1 || n9 == -1 || n10 >= n9) break block33;
                                    try {
                                        stringBuilder = new StringBuilder((String)object2);
                                        n8 = n10 + 1;
                                    }
                                    catch (Exception exception) {
                                        // empty catch block
                                        break block24;
                                    }
                                    try {
                                        stringBuilder.replace(n10, n8, " ");
                                        stringBuilder.replace(n9, n9 + 1, " ");
                                        if (!Q.c0()) break block25;
                                        object = this.M0(2131951667);
                                        n11 = ((String)object).length();
                                        break block26;
                                    }
                                    catch (Exception exception) {
                                        break block24;
                                    }
                                }
                                object = this.N0(2131951666, object);
                                n11 = ((String)object).length();
                            }
                            stringBuilder.replace(n8, n9, ((String)object).toUpperCase(object3.getResources().getConfiguration().locale));
                            object = Spannable.Factory.getInstance().newSpannable((CharSequence)stringBuilder);
                            object3 = new BackgroundColorSpan(-12417314);
                            n11 = n11 + n8 + 1;
                            object.setSpan(object3, n10, n11, 33);
                            object3 = new ForegroundColorSpan(-1);
                            object.setSpan(object3, n10, n11, 33);
                            if (Build.VERSION.SDK_INT >= 28) {
                                F.a();
                                object.setSpan((Object)E.a(Typeface.DEFAULT_BOLD), n10, n11, 33);
                            }
                            textView.setText((CharSequence)object);
                            break block34;
                        }
                        object = c.h().f().b("GUIDE DOCUMENT TREE ERROR").l((Throwable)object);
                        object3 = new StringBuilder();
                        ((StringBuilder)object3).append("lang:");
                        ((StringBuilder)object3).append(Locale.getDefault().getLanguage());
                        ((ax.Ha.b)object).g(((StringBuilder)object3).toString()).h();
                        textView.setText((CharSequence)object2);
                        break block34;
                    }
                    textView.setText((CharSequence)object2);
                }
                view2.setVisibility(8);
                break block35;
            }
            object.setText(2131952094);
            if (!bl) {
                textView.setText(2131952096);
            } else {
                textView.setText(2131952095);
            }
            object2.setText(2131952097);
            view2.setVisibility(0);
        }
        a8.setView(view);
        if (this.t0) {
            a8.setNegativeButton(0x1040000, new t(this, bl){
                final boolean b;
                final G c;
                {
                    this.c = g8;
                    this.b = bl;
                }

                @Override
                public void a(DialogInterface dialogInterface, int n8) {
                    if (this.b) {
                        k.s(this.c.b());
                    }
                }
            });
        }
        a8.setPositiveButton(17039370, null);
        object = a8.create();
        this.Y2(false);
        object.setCanceledOnTouchOutside(false);
        object.setOnShowListener(new DialogInterface.OnShowListener(){
            final a a;
            final G b;
            {
                this.b = g8;
                this.a = a8;
            }

            public void onShow(DialogInterface dialogInterface) {
                this.a.i(-1).setOnClickListener((View.OnClickListener)new ax.g3.c(this){
                    final b c;
                    {
                        this.c = b8;
                    }

                    @Override
                    public void a(View object) {
                        if (this.c.b.f0() != null && !((com.alphainventor.filemanager.activity.a)this.c.b.f0()).U(this.c.b.v0, this.c.b.w0) && !((G)(object = this.c.b)).f3((Context)((Fragment)object).f0())) {
                            object = this.c.b;
                            ((G)object).i3((Context)((Fragment)object).f0());
                            return;
                        }
                        this.c.b.O2();
                    }
                });
            }
        });
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    boolean f3(Context context) {
        if (Q.L0()) {
            try {
                return context.getPackageManager().getApplicationInfo((String)"com.google.android.documentsui", (int)0).enabled;
            }
            catch (Exception exception) {}
        }
        try {
            return context.getPackageManager().getApplicationInfo((String)"com.android.documentsui", (int)0).enabled;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return true;
        }
    }

    void i3(Context object) {
        Object object2;
        String string = "com.google.android.documentsui";
        boolean bl = Q.L0();
        Object object3 = object2 = null;
        if (bl) {
            try {
                bl = object.getPackageManager().getApplicationInfo((String)"com.google.android.documentsui", (int)0).enabled;
                object = !bl ? string : null;
                object3 = object;
            }
            catch (Exception exception) {
                object3 = object2;
            }
        }
        object = object3;
        if (object3 == null) {
            object = "com.android.documentsui";
        }
        object = u.d((String)object);
        try {
            u.p0(this, (Intent)object);
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            B.S(this.f0().findViewById(0x1020002), 2131952448, 0).a0();
        }
    }

    @Override
    public void n1(Bundle object) {
        super.n1((Bundle)object);
        object = this.j0();
        int n8 = 0;
        if (object != null) {
            this.u0 = this.j0().getInt("ERROR_CAUSE", 0);
            this.t0 = this.j0().getBoolean("SHOW_CANCEL", true);
            f f8 = (f)((Object)this.j0().getSerializable("LOCATION"));
            int n9 = this.j0().getInt("LOCATION_KEY");
            this.w0 = this.j0().getString("TREE_PATH");
            n8 = n9;
            object = f8;
            if (f8 == null) {
                ax.Ha.b b8 = c.h().b("INVALID DOCUMENT TREE LOCATION");
                object = new StringBuilder();
                object.append("location:");
                object.append((Object)f8);
                b8.g(object.toString()).h();
                n8 = n9;
                object = f8;
            }
        } else {
            this.u0 = 0;
            object = f.p0;
        }
        if (object != null) {
            this.v0 = K.a((f)((Object)object), n8);
            return;
        }
        ax.u3.b.f();
    }
}

