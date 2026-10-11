/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.media3.ui.F;
import androidx.media3.ui.SubtitleView;
import androidx.media3.ui.a;
import androidx.media3.ui.c;
import androidx.media3.ui.z;
import ax.S0.d0;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class H
extends FrameLayout
implements SubtitleView.a {
    private final a a;
    private final WebView b;
    private List<ax.R0.a> c = Collections.EMPTY_LIST;
    private ax.a2.a d = ax.a2.a.g;
    private float e = 0.0533f;
    private int f = 0;
    private float g = 0.08f;

    public H(Context context) {
        this(context, null);
    }

    public H(Context object, AttributeSet attributeSet) {
        super(object, attributeSet);
        a a8;
        this.a = a8 = new a((Context)object, attributeSet);
        object = new WebView(this, (Context)object, attributeSet){
            final H a;
            {
                this.a = h8;
                super(context, attributeSet);
            }

            public boolean onTouchEvent(MotionEvent motionEvent) {
                super.onTouchEvent(motionEvent);
                return false;
            }

            public boolean performClick() {
                super.performClick();
                return false;
            }
        };
        this.b = object;
        object.setBackgroundColor(0);
        this.addView(a8);
        this.addView((View)object);
    }

    private static int b(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                return 0;
            }
            return -100;
        }
        return -50;
    }

    private static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int n8 = androidx.media3.ui.H$b.a[alignment.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                return "center";
            }
            return "end";
        }
        return "start";
    }

    private static String d(ax.a2.a a8) {
        int n8 = a8.d;
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 != 3) {
                    if (n8 != 4) {
                        return "unset";
                    }
                    return d0.G("-0.05em -0.05em 0.15em %s", androidx.media3.ui.c.b(a8.e));
                }
                return d0.G("0.06em 0.08em 0.15em %s", androidx.media3.ui.c.b(a8.e));
            }
            return d0.G("0.1em 0.12em 0.15em %s", androidx.media3.ui.c.b(a8.e));
        }
        return d0.G("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", androidx.media3.ui.c.b(a8.e));
    }

    private String e(int n8, float f8) {
        if ((f8 = F.f(n8, f8, this.getHeight(), this.getHeight() - this.getPaddingTop() - this.getPaddingBottom())) == -3.4028235E38f) {
            return "unset";
        }
        return d0.G("%.2fpx", Float.valueOf(f8 / this.getContext().getResources().getDisplayMetrics().density));
    }

    private static String f(int n8) {
        if (n8 != 1) {
            if (n8 != 2) {
                return "horizontal-tb";
            }
            return "vertical-lr";
        }
        return "vertical-rl";
    }

    private static String h(ax.R0.a object) {
        float f8 = ((ax.R0.a)object).q;
        if (f8 != 0.0f) {
            int n8 = ((ax.R0.a)object).p;
            object = n8 != 2 && n8 != 1 ? "skewX" : "skewY";
            return d0.G("%s(%.2fdeg)", object, Float.valueOf(f8));
        }
        return "";
    }

    /*
     * Enabled aggressive block sorting
     */
    private void i() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(d0.G("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", androidx.media3.ui.c.b(this.d.a), this.e(this.f, this.e), Float.valueOf(1.2f), H.d(this.d)));
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put(androidx.media3.ui.c.a("default_bg"), d0.G("background-color:%s;", androidx.media3.ui.c.b(this.d.b)));
        int n8 = 0;
        while (true) {
            Iterator iterator;
            z.b b8;
            Object object;
            Object object2;
            Object object3;
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            int n9;
            int n10;
            String string6;
            float f8;
            ax.R0.a a8;
            block22: {
                block12: {
                    int n11;
                    int n12;
                    block20: {
                        block21: {
                            block18: {
                                block19: {
                                    float f9;
                                    block15: {
                                        block17: {
                                            block13: {
                                                block16: {
                                                    block14: {
                                                        if (n8 >= this.c.size()) break block12;
                                                        a8 = this.c.get(n8);
                                                        f8 = a8.h;
                                                        f8 = f8 != -3.4028235E38f ? (f8 *= 100.0f) : 50.0f;
                                                        n12 = H.b(a8.i);
                                                        f9 = a8.e;
                                                        if (f9 == -3.4028235E38f) break block13;
                                                        if (a8.f == 1) break block14;
                                                        string6 = d0.G("%.2f%%", Float.valueOf(f9 * 100.0f));
                                                        n10 = a8.p == 1 ? -H.b(a8.g) : H.b(a8.g);
                                                        n9 = 0;
                                                        break block15;
                                                    }
                                                    if (!(f9 >= 0.0f)) break block16;
                                                    string6 = d0.G("%.2fem", Float.valueOf(f9 * 1.2f));
                                                    n10 = 0;
                                                    break block17;
                                                }
                                                string6 = d0.G("%.2fem", Float.valueOf((-f9 - 1.0f) * 1.2f));
                                                n10 = 0;
                                                n9 = 1;
                                                break block15;
                                            }
                                            string6 = d0.G("%.2f%%", Float.valueOf((1.0f - this.g) * 100.0f));
                                            n10 = -100;
                                        }
                                        n9 = 0;
                                    }
                                    f9 = a8.j;
                                    string5 = f9 != -3.4028235E38f ? d0.G("%.2f%%", Float.valueOf(f9 * 100.0f)) : "fit-content";
                                    string4 = H.c(a8.b);
                                    string3 = H.f(a8.p);
                                    string2 = this.e(a8.n, a8.o);
                                    n11 = a8.l ? a8.m : this.d.c;
                                    string = androidx.media3.ui.c.b(n11);
                                    n11 = a8.p;
                                    object3 = "right";
                                    object2 = "top";
                                    if (n11 == 1) break block18;
                                    if (n11 == 2) break block19;
                                    object3 = object2;
                                    if (n9 != 0) {
                                        object3 = "bottom";
                                    }
                                    object = "left";
                                    break block20;
                                }
                                if (n9 == 0) break block21;
                                object = object2;
                                break block20;
                            }
                            object = object2;
                            if (n9 == 0) break block20;
                        }
                        object3 = "left";
                        object = object2;
                    }
                    if (n11 != 2 && n11 != 1) {
                        object2 = "width";
                        n9 = n10;
                        n10 = n12;
                    } else {
                        object2 = "height";
                        n9 = n12;
                    }
                    b8 = z.a(a8.a, this.getContext().getResources().getDisplayMetrics().density);
                    iterator = hashMap.keySet().iterator();
                    break block22;
                }
                stringBuilder.append("</div></body></html>");
                object3 = new StringBuilder();
                ((StringBuilder)object3).append("<html><head><style>");
                object2 = hashMap.keySet().iterator();
                while (true) {
                    if (!object2.hasNext()) {
                        ((StringBuilder)object3).append("</style></head>");
                        stringBuilder.insert(0, (CharSequence)object3);
                        this.b.loadData(Base64.encodeToString((byte[])stringBuilder.toString().getBytes(StandardCharsets.UTF_8), (int)1), "text/html", "base64");
                        return;
                    }
                    string6 = (String)object2.next();
                    ((StringBuilder)object3).append(string6);
                    ((StringBuilder)object3).append("{");
                    ((StringBuilder)object3).append((String)hashMap.get(string6));
                    ((StringBuilder)object3).append("}");
                }
            }
            while (iterator.hasNext()) {
                String string7 = (String)iterator.next();
                String string8 = hashMap.put(string7, (String)hashMap.get(string7));
                boolean bl = string8 == null || string8.equals(hashMap.get(string7));
                ax.S0.a.g(bl);
            }
            stringBuilder.append(d0.G("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", n8, object, Float.valueOf(f8), object3, string6, object2, string5, string4, string3, string2, string, n10, n9, H.h(a8)));
            stringBuilder.append(d0.G("<span class='%s'>", "default_bg"));
            string6 = a8.c;
            if (string6 != null) {
                stringBuilder.append(d0.G("<span style='display:inline-block; text-align:%s;'>", H.c((Layout.Alignment)string6)));
                stringBuilder.append(b8.a);
                stringBuilder.append("</span>");
            } else {
                stringBuilder.append(b8.a);
            }
            stringBuilder.append("</span>");
            stringBuilder.append("</div>");
            ++n8;
        }
    }

    @Override
    public void a(List<ax.R0.a> list, ax.a2.a a8, float f8, int n8, float f9) {
        this.d = a8;
        this.e = f8;
        this.f = n8;
        this.g = f9;
        ArrayList<ax.R0.a> arrayList = new ArrayList<ax.R0.a>();
        ArrayList<ax.R0.a> arrayList2 = new ArrayList<ax.R0.a>();
        for (int i8 = 0; i8 < list.size(); ++i8) {
            ax.R0.a a9 = list.get(i8);
            if (a9.d != null) {
                arrayList.add(a9);
                continue;
            }
            arrayList2.add(a9);
        }
        if (!this.c.isEmpty() || !arrayList2.isEmpty()) {
            this.c = arrayList2;
            this.i();
        }
        this.a.a(arrayList, a8, f8, n8, f9);
        this.invalidate();
    }

    public void g() {
        this.b.destroy();
    }

    protected void onLayout(boolean bl, int n8, int n9, int n10, int n11) {
        super.onLayout(bl, n8, n9, n10, n11);
        if (bl && !this.c.isEmpty()) {
            this.i();
        }
    }
}

