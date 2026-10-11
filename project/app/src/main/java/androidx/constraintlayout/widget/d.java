/*
 * Decompiled with CFR 0.152.
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import ax.L.c;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class d {
    private final ConstraintLayout a;
    e b;
    int c = -1;
    int d = -1;
    private SparseArray<a> e = new SparseArray();
    private SparseArray<e> f = new SparseArray();

    d(Context context, ConstraintLayout constraintLayout, int n8) {
        this.a = constraintLayout;
        this.a(context, n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(Context context, int n8) {
        String string;
        XmlResourceParser xmlResourceParser;
        block16: {
            XmlPullParserException xmlPullParserException2;
            block17: {
                xmlResourceParser = context.getResources().getXml(n8);
                try {
                    n8 = xmlResourceParser.getEventType();
                    string = null;
                    break block16;
                }
                catch (IOException iOException) {
                }
                catch (XmlPullParserException xmlPullParserException2) {
                    break block17;
                }
                iOException.printStackTrace();
                return;
            }
            xmlPullParserException2.printStackTrace();
            return;
        }
        while (true) {
            Object object;
            block18: {
                block19: {
                    block22: {
                        block21: {
                            int n9;
                            block20: {
                                n9 = 1;
                                if (n8 == 1) return;
                                if (n8 == 0) break block19;
                                if (n8 == 2) break block20;
                                object = string;
                                break block18;
                            }
                            object = xmlResourceParser.getName();
                            switch (((String)object).hashCode()) {
                                default: {
                                    break;
                                }
                                case 1901439077: {
                                    if (!((String)object).equals("Variant")) break;
                                    n8 = 3;
                                    break block21;
                                }
                                case 1657696882: {
                                    if (!((String)object).equals("layoutDescription")) break;
                                    n8 = 0;
                                    break block21;
                                }
                                case 1382829617: {
                                    if (!((String)object).equals("StateSet")) break;
                                    n8 = n9;
                                    break block21;
                                }
                                case 80204913: {
                                    if (!((String)object).equals("State")) break;
                                    n8 = 2;
                                    break block21;
                                }
                                case -1349929691: {
                                    if (!((String)object).equals("ConstraintSet")) break;
                                    n8 = 4;
                                    break block21;
                                }
                            }
                            n8 = -1;
                        }
                        if (n8 == 2) break block22;
                        if (n8 != 3) {
                            if (n8 != 4) {
                                object = string;
                                break block18;
                            } else {
                                this.b(context, (XmlPullParser)xmlResourceParser);
                                object = string;
                            }
                            break block18;
                        } else {
                            b b8 = new b(context, (XmlPullParser)xmlResourceParser);
                            object = string;
                            if (string != null) {
                                ((a)((Object)string)).a(b8);
                                object = string;
                            }
                        }
                        break block18;
                    }
                    object = new a(context, (XmlPullParser)xmlResourceParser);
                    this.e.put(((a)object).a, object);
                    break block18;
                }
                xmlResourceParser.getName();
                object = string;
            }
            n8 = xmlResourceParser.next();
            string = object;
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        e e8 = new e();
        int n8 = xmlPullParser.getAttributeCount();
        for (int i8 = 0; i8 < n8; ++i8) {
            String string = xmlPullParser.getAttributeName(i8);
            String string2 = xmlPullParser.getAttributeValue(i8);
            if (string == null || string2 == null || !"id".equals(string)) continue;
            if (string2.contains("/")) {
                string = string2.substring(string2.indexOf(47) + 1);
                i8 = context.getResources().getIdentifier(string, "id", context.getPackageName());
            } else {
                i8 = -1;
            }
            n8 = i8;
            if (i8 == -1) {
                if (string2.length() > 1) {
                    n8 = Integer.parseInt(string2.substring(1));
                } else {
                    Log.e((String)"ConstraintLayoutStates", (String)"error in parsing id");
                    n8 = i8;
                }
            }
            e8.m(context, xmlPullParser);
            this.f.put(n8, (Object)e8);
            return;
        }
    }

    public void c(ax.L.a a8) {
    }

    public void d(int n8, float f8, float f9) {
        int n9;
        block6: {
            e e8;
            block8: {
                block7: {
                    n9 = this.c;
                    if (n9 != n8) break block6;
                    a a8 = n8 == -1 ? (a)this.e.valueAt(0) : (a)this.e.get(n9);
                    n8 = this.d;
                    if (n8 != -1 && a8.b.get(n8).a(f8, f9) || this.d == (n9 = a8.b(f8, f9))) break block7;
                    e8 = n9 == -1 ? this.b : a8.b.get((int)n9).f;
                    if (n9 != -1) {
                        n8 = a8.b.get((int)n9).e;
                    }
                    if (e8 != null) break block8;
                }
                return;
            }
            this.d = n9;
            e8.c(this.a);
            return;
        }
        this.c = n8;
        a a9 = (a)this.e.get(n8);
        int n10 = a9.b(f8, f9);
        Object object = n10 == -1 ? a9.d : a9.b.get((int)n10).f;
        if (n10 != -1) {
            n9 = a9.b.get((int)n10).e;
        }
        if (object == null) {
            object = new StringBuilder();
            ((StringBuilder)object).append("NO Constraint set found ! id=");
            ((StringBuilder)object).append(n8);
            ((StringBuilder)object).append(", dim =");
            ((StringBuilder)object).append(f8);
            ((StringBuilder)object).append(", ");
            ((StringBuilder)object).append(f9);
            Log.v((String)"ConstraintLayoutStates", (String)((StringBuilder)object).toString());
            return;
        }
        this.d = n10;
        ((e)object).c(this.a);
    }

    static class a {
        int a;
        ArrayList<b> b = new ArrayList();
        int c = -1;
        e d;

        public a(Context context, XmlPullParser xmlPullParser) {
            xmlPullParser = context.obtainStyledAttributes(Xml.asAttributeSet((XmlPullParser)xmlPullParser), ax.L.c.t7);
            int n8 = xmlPullParser.getIndexCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                int n9 = xmlPullParser.getIndex(i8);
                if (n9 == ax.L.c.u7) {
                    this.a = xmlPullParser.getResourceId(n9, this.a);
                    continue;
                }
                if (n9 != ax.L.c.v7) continue;
                this.c = xmlPullParser.getResourceId(n9, this.c);
                Object object = context.getResources().getResourceTypeName(this.c);
                context.getResources().getResourceName(this.c);
                if (!"layout".equals(object)) continue;
                this.d = object = new e();
                ((e)object).e(context, this.c);
            }
            xmlPullParser.recycle();
        }

        void a(b b8) {
            this.b.add(b8);
        }

        public int b(float f8, float f9) {
            for (int i8 = 0; i8 < this.b.size(); ++i8) {
                if (!this.b.get(i8).a(f8, f9)) continue;
                return i8;
            }
            return -1;
        }
    }

    static class b {
        float a = Float.NaN;
        float b = Float.NaN;
        float c = Float.NaN;
        float d = Float.NaN;
        int e = -1;
        e f;

        public b(Context context, XmlPullParser xmlPullParser) {
            xmlPullParser = context.obtainStyledAttributes(Xml.asAttributeSet((XmlPullParser)xmlPullParser), ax.L.c.R7);
            int n8 = xmlPullParser.getIndexCount();
            for (int i8 = 0; i8 < n8; ++i8) {
                int n9 = xmlPullParser.getIndex(i8);
                if (n9 == ax.L.c.S7) {
                    this.e = xmlPullParser.getResourceId(n9, this.e);
                    Object object = context.getResources().getResourceTypeName(this.e);
                    context.getResources().getResourceName(this.e);
                    if (!"layout".equals(object)) continue;
                    this.f = object = new e();
                    ((e)object).e(context, this.e);
                    continue;
                }
                if (n9 == ax.L.c.T7) {
                    this.d = xmlPullParser.getDimension(n9, this.d);
                    continue;
                }
                if (n9 == ax.L.c.U7) {
                    this.b = xmlPullParser.getDimension(n9, this.b);
                    continue;
                }
                if (n9 == ax.L.c.V7) {
                    this.c = xmlPullParser.getDimension(n9, this.c);
                    continue;
                }
                if (n9 == ax.L.c.W7) {
                    this.a = xmlPullParser.getDimension(n9, this.a);
                    continue;
                }
                Log.v((String)"ConstraintLayoutStates", (String)"Unknown tag");
            }
            xmlPullParser.recycle();
        }

        boolean a(float f8, float f9) {
            if (!Float.isNaN(this.a) && f8 < this.a) {
                return false;
            }
            if (!Float.isNaN(this.b) && f9 < this.b) {
                return false;
            }
            if (!Float.isNaN(this.c) && f8 > this.c) {
                return false;
            }
            return Float.isNaN(this.d) || !(f9 > this.d);
        }
    }
}

