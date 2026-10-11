/*
 * Decompiled with CFR 0.152.
 */
package ax.s;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.L;
import ax.c0.A;
import ax.m.j;
import ax.t.c;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class d
extends MenuInflater {
    static final Class<?>[] e;
    static final Class<?>[] f;
    final Object[] a;
    final Object[] b;
    Context c;
    private Object d;

    static {
        Class[] classArray = new Class[]{Context.class};
        e = classArray;
        f = classArray;
    }

    public d(Context context) {
        super(context);
        this.c = context;
        Object[] objectArray = new Object[]{context};
        this.a = objectArray;
        this.b = objectArray;
    }

    private Object a(Object object) {
        if (object instanceof Activity) {
            return object;
        }
        Object object2 = object;
        if (object instanceof ContextWrapper) {
            object2 = this.a(((ContextWrapper)object).getBaseContext());
        }
        return object2;
    }

    private void c(XmlPullParser object, AttributeSet attributeSet, Menu object2) throws XmlPullParserException, IOException {
        int n8;
        int n9;
        b b8;
        block27: {
            b8 = new b(this, (Menu)object2);
            n9 = object.getEventType();
            do {
                if (n9 == 2) {
                    object2 = object.getName();
                    if (((String)object2).equals("menu")) {
                        n9 = object.next();
                        break block27;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Expecting menu, got ");
                    ((StringBuilder)object).append((String)object2);
                    throw new RuntimeException(((StringBuilder)object).toString());
                }
                n9 = n8 = object.next();
            } while (n8 != 1);
            n9 = n8;
        }
        Object object3 = null;
        n8 = 0;
        int n10 = 0;
        while (n8 == 0) {
            if (n9 != 1) {
                int n11;
                if (n9 != 2) {
                    if (n9 != 3) {
                        n11 = n8;
                        n9 = n10;
                        object2 = object3;
                    } else {
                        String string = object.getName();
                        if (n10 != 0 && string.equals(object3)) {
                            object2 = null;
                            n9 = 0;
                            n11 = n8;
                        } else if (string.equals("group")) {
                            b8.h();
                            n11 = n8;
                            n9 = n10;
                            object2 = object3;
                        } else if (string.equals("item")) {
                            n11 = n8;
                            n9 = n10;
                            object2 = object3;
                            if (!b8.d()) {
                                object2 = b8.A;
                                if (object2 != null && ((ax.c0.b)object2).a()) {
                                    b8.b();
                                    n11 = n8;
                                    n9 = n10;
                                    object2 = object3;
                                } else {
                                    b8.a();
                                    n11 = n8;
                                    n9 = n10;
                                    object2 = object3;
                                }
                            }
                        } else {
                            n11 = n8;
                            n9 = n10;
                            object2 = object3;
                            if (string.equals("menu")) {
                                n11 = 1;
                                n9 = n10;
                                object2 = object3;
                            }
                        }
                    }
                } else if (n10 != 0) {
                    n11 = n8;
                    n9 = n10;
                    object2 = object3;
                } else {
                    object2 = object.getName();
                    if (((String)object2).equals("group")) {
                        b8.f(attributeSet);
                        n11 = n8;
                        n9 = n10;
                        object2 = object3;
                    } else if (((String)object2).equals("item")) {
                        b8.g(attributeSet);
                        n11 = n8;
                        n9 = n10;
                        object2 = object3;
                    } else if (((String)object2).equals("menu")) {
                        this.c((XmlPullParser)object, attributeSet, (Menu)b8.b());
                        n11 = n8;
                        n9 = n10;
                        object2 = object3;
                    } else {
                        n9 = 1;
                        n11 = n8;
                    }
                }
                int n12 = object.next();
                n8 = n11;
                n10 = n9;
                object3 = object2;
                n9 = n12;
                continue;
            }
            throw new RuntimeException("Unexpected end of document");
        }
    }

    Object b() {
        if (this.d == null) {
            this.d = this.a(this.c);
        }
        return this.d;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void inflate(int n8, Menu menu) {
        Throwable throwable222;
        int n9;
        int n10;
        int n11;
        XmlResourceParser xmlResourceParser;
        Object object;
        Object object2;
        block11: {
            XmlResourceParser xmlResourceParser2;
            int n12;
            if (!(menu instanceof ax.V.a)) {
                super.inflate(n8, menu);
                return;
            }
            object2 = null;
            object = null;
            xmlResourceParser = null;
            int n13 = 0;
            int n14 = 0;
            int n15 = 0;
            n11 = n12 = 0;
            n10 = n13;
            n9 = n14;
            try {
                xmlResourceParser = xmlResourceParser2 = this.c.getResources().getLayout(n8);
                n11 = n12;
                object2 = xmlResourceParser2;
                n10 = n13;
                object = xmlResourceParser2;
                n9 = n14;
                AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser2);
                xmlResourceParser = xmlResourceParser2;
                n11 = n12;
                object2 = xmlResourceParser2;
                n10 = n13;
                object = xmlResourceParser2;
                n9 = n14;
                n8 = n15;
                if (menu instanceof e) {
                    xmlResourceParser = xmlResourceParser2;
                    n11 = n12;
                    object2 = xmlResourceParser2;
                    n10 = n13;
                    object = xmlResourceParser2;
                    n9 = n14;
                    e e8 = (e)menu;
                    xmlResourceParser = xmlResourceParser2;
                    n11 = n12;
                    object2 = xmlResourceParser2;
                    n10 = n13;
                    object = xmlResourceParser2;
                    n9 = n14;
                    n8 = n15;
                    if (e8.F()) {
                        xmlResourceParser = xmlResourceParser2;
                        n11 = n12;
                        object2 = xmlResourceParser2;
                        n10 = n13;
                        object = xmlResourceParser2;
                        n9 = n14;
                        e8.f0();
                        n8 = 1;
                    }
                }
                xmlResourceParser = xmlResourceParser2;
                n11 = n8;
                object2 = xmlResourceParser2;
                n10 = n8;
                object = xmlResourceParser2;
                n9 = n8;
                this.c((XmlPullParser)xmlResourceParser2, attributeSet, menu);
                if (n8 != 0) {
                    ((e)menu).e0();
                }
                if (xmlResourceParser2 == null) break block11;
            }
            catch (Throwable throwable222) {}
            xmlResourceParser2.close();
        }
        return;
        if (n11 != 0) {
            ((e)menu).e0();
        }
        if (xmlResourceParser != null) {
            xmlResourceParser.close();
        }
        throw throwable222;
        catch (IOException iOException) {}
        xmlResourceParser = object2;
        n11 = n10;
        {
            xmlResourceParser = object2;
            n11 = n10;
            object = new InflateException("Error inflating menu XML", (Throwable)iOException);
            xmlResourceParser = object2;
            n11 = n10;
            throw object;
            catch (XmlPullParserException xmlPullParserException) {}
            xmlResourceParser = object;
            n11 = n9;
            xmlResourceParser = object;
            n11 = n9;
            object2 = new InflateException("Error inflating menu XML", (Throwable)xmlPullParserException);
            xmlResourceParser = object;
            n11 = n9;
            throw object2;
        }
    }

    private static class a
    implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] c = new Class[]{MenuItem.class};
        private Object a;
        private Method b;

        public a(Object object, String object2) {
            this.a = object;
            Class<?> clazz = object.getClass();
            try {
                this.b = clazz.getMethod((String)object2, c);
                return;
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Couldn't resolve menu item onClick handler ");
                stringBuilder.append((String)object2);
                stringBuilder.append(" in class ");
                stringBuilder.append(clazz.getName());
                object2 = new InflateException(stringBuilder.toString());
                ((Throwable)object2).initCause(exception);
                throw object2;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return (Boolean)this.b.invoke(this.a, menuItem);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException(exception);
            }
            this.b.invoke(this.a, menuItem);
            return true;
        }
    }

    private class b {
        ax.c0.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D;
        private PorterDuff.Mode E;
        final d F;
        private Menu a;
        private int b;
        private int c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
        private int i;
        private int j;
        private CharSequence k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(d d8, Menu menu) {
            this.F = d8;
            this.D = null;
            this.E = null;
            this.a = menu;
            this.h();
        }

        private char c(String string) {
            if (string == null) {
                return '\u0000';
            }
            return string.charAt(0);
        }

        private <T> T e(String string, Class<?>[] object, Object[] object2) {
            try {
                object = Class.forName(string, false, this.F.c.getClassLoader()).getConstructor((Class<?>)object);
                object.setAccessible(true);
                object = object.newInstance((Object[])object2);
            }
            catch (Exception exception) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Cannot instantiate class: ");
                ((StringBuilder)object2).append(string);
                Log.w((String)"SupportMenuInflater", (String)((StringBuilder)object2).toString(), (Throwable)exception);
                return null;
            }
            return (T)object;
        }

        private void i(MenuItem menuItem) {
            Object object = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
            int n8 = this.r;
            boolean bl = false;
            boolean bl2 = n8 >= 1;
            object.setCheckable(bl2).setTitleCondensed(this.l).setIcon(this.m);
            n8 = this.v;
            if (n8 >= 0) {
                menuItem.setShowAsAction(n8);
            }
            if (this.z != null) {
                if (!this.F.c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)new a(this.F.b(), this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof g) {
                    ((g)menuItem).t(true);
                } else if (menuItem instanceof c) {
                    ((c)menuItem).h(true);
                }
            }
            if ((object = this.x) != null) {
                menuItem.setActionView((View)this.e((String)object, e, this.F.a));
                bl = true;
            }
            if ((n8 = this.w) > 0) {
                if (!bl) {
                    menuItem.setActionView(n8);
                } else {
                    Log.w((String)"SupportMenuInflater", (String)"Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if ((object = this.A) != null) {
                ax.c0.A.b(menuItem, (ax.c0.b)object);
            }
            ax.c0.A.d(menuItem, this.B);
            ax.c0.A.i(menuItem, this.C);
            ax.c0.A.c(menuItem, this.n, this.o);
            ax.c0.A.g(menuItem, this.p, this.q);
            object = this.E;
            if (object != null) {
                ax.c0.A.f(menuItem, (PorterDuff.Mode)object);
            }
            if ((object = this.D) != null) {
                ax.c0.A.e(menuItem, (ColorStateList)object);
            }
        }

        public void a() {
            this.h = true;
            this.i(this.a.add(this.b, this.i, this.j, this.k));
        }

        public SubMenu b() {
            this.h = true;
            SubMenu subMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            this.i(subMenu.getItem());
            return subMenu;
        }

        public boolean d() {
            return this.h;
        }

        public void f(AttributeSet attributeSet) {
            attributeSet = this.F.c.obtainStyledAttributes(attributeSet, ax.m.j.o1);
            this.b = attributeSet.getResourceId(ax.m.j.q1, 0);
            this.c = attributeSet.getInt(ax.m.j.s1, 0);
            this.d = attributeSet.getInt(ax.m.j.t1, 0);
            this.e = attributeSet.getInt(ax.m.j.u1, 0);
            this.f = attributeSet.getBoolean(ax.m.j.r1, true);
            this.g = attributeSet.getBoolean(ax.m.j.p1, true);
            attributeSet.recycle();
        }

        public void g(AttributeSet object) {
            L l8 = L.u(this.F.c, object, ax.m.j.v1);
            this.i = l8.n(ax.m.j.y1, 0);
            this.j = l8.k(ax.m.j.B1, this.c) & 0xFFFF0000 | l8.k(ax.m.j.C1, this.d) & 0xFFFF;
            this.k = l8.p(ax.m.j.D1);
            this.l = l8.p(ax.m.j.E1);
            this.m = l8.n(ax.m.j.w1, 0);
            this.n = this.c(l8.o(ax.m.j.F1));
            this.o = l8.k(ax.m.j.M1, 4096);
            this.p = this.c(l8.o(ax.m.j.G1));
            this.q = l8.k(ax.m.j.Q1, 4096);
            int n8 = ax.m.j.H1;
            this.r = l8.s(n8) ? (int)(l8.a(n8, false) ? 1 : 0) : this.e;
            this.s = l8.a(ax.m.j.z1, false);
            this.t = l8.a(ax.m.j.A1, this.f);
            this.u = l8.a(ax.m.j.x1, this.g);
            this.v = l8.k(ax.m.j.R1, -1);
            this.z = l8.o(ax.m.j.I1);
            this.w = l8.n(ax.m.j.J1, 0);
            this.x = l8.o(ax.m.j.L1);
            object = l8.o(ax.m.j.K1);
            this.y = object;
            n8 = object != null ? 1 : 0;
            if (n8 != 0 && this.w == 0 && this.x == null) {
                this.A = (ax.c0.b)this.e((String)object, f, this.F.b);
            } else {
                if (n8 != 0) {
                    Log.w((String)"SupportMenuInflater", (String)"Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = l8.p(ax.m.j.N1);
            this.C = l8.p(ax.m.j.S1);
            n8 = ax.m.j.P1;
            this.E = l8.s(n8) ? androidx.appcompat.widget.A.e(l8.k(n8, -1), this.E) : null;
            n8 = ax.m.j.O1;
            this.D = l8.s(n8) ? l8.c(n8) : null;
            l8.x();
            this.h = false;
        }

        public void h() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }
    }
}

