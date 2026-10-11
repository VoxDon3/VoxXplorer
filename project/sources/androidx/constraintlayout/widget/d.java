package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class d {
    private final ConstraintLayout a;
    e b;
    int c = -1;
    int d = -1;
    private SparseArray<a> e = new SparseArray<>();
    private SparseArray<e> f = new SparseArray<>();

    static class a {
        int a;
        ArrayList<b> b = new ArrayList<>();
        int c;
        e d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), ax.L.c.t7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ax.L.c.u7) {
                    this.a = obtainStyledAttributes.getResourceId(index, this.a);
                } else if (index == ax.L.c.v7) {
                    this.c = obtainStyledAttributes.getResourceId(index, this.c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    context.getResources().getResourceName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.d = eVar;
                        eVar.e(context, this.c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.b.add(bVar);
        }

        public int b(float f, float f2) {
            for (int i = 0; i < this.b.size(); i++) {
                if (this.b.get(i).a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    static class b {
        float a;
        float b;
        float c;
        float d;
        int e;
        e f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), ax.L.c.R7);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ax.L.c.S7) {
                    this.e = obtainStyledAttributes.getResourceId(index, this.e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                    context.getResources().getResourceName(this.e);
                    if ("layout".equals(resourceTypeName)) {
                        e eVar = new e();
                        this.f = eVar;
                        eVar.e(context, this.e);
                    }
                } else if (index == ax.L.c.T7) {
                    this.d = obtainStyledAttributes.getDimension(index, this.d);
                } else if (index == ax.L.c.U7) {
                    this.b = obtainStyledAttributes.getDimension(index, this.b);
                } else if (index == ax.L.c.V7) {
                    this.c = obtainStyledAttributes.getDimension(index, this.c);
                } else if (index == ax.L.c.W7) {
                    this.a = obtainStyledAttributes.getDimension(index, this.a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        boolean a(float f, float f2) {
            if (!Float.isNaN(this.a) && f < this.a) {
                return false;
            }
            if (!Float.isNaN(this.b) && f2 < this.b) {
                return false;
            }
            if (Float.isNaN(this.c) || f <= this.c) {
                return Float.isNaN(this.d) || f2 <= this.d;
            }
            return false;
        }
    }

    d(Context context, ConstraintLayout constraintLayout, int i) {
        this.a = constraintLayout;
        a(context, i);
    }

    private void a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                char c = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            c = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 2) {
                        aVar = new a(context, xml);
                        this.e.put(aVar.a, aVar);
                    } else if (c == 3) {
                        b bVar = new b(context, xml);
                        if (aVar != null) {
                            aVar.a(bVar);
                        }
                    } else if (c == 4) {
                        b(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        e eVar = new e();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                eVar.m(context, xmlPullParser);
                this.f.put(identifier, eVar);
                return;
            }
        }
    }

    public void d(int i, float f, float f2) {
        int b2;
        int i2 = this.c;
        if (i2 == i) {
            a valueAt = i == -1 ? this.e.valueAt(0) : this.e.get(i2);
            int i3 = this.d;
            if ((i3 == -1 || !valueAt.b.get(i3).a(f, f2)) && this.d != (b2 = valueAt.b(f, f2))) {
                e eVar = b2 == -1 ? this.b : valueAt.b.get(b2).f;
                if (b2 != -1) {
                    int i4 = valueAt.b.get(b2).e;
                }
                if (eVar == null) {
                    return;
                }
                this.d = b2;
                eVar.c(this.a);
                return;
            }
            return;
        }
        this.c = i;
        a aVar = this.e.get(i);
        int b3 = aVar.b(f, f2);
        e eVar2 = b3 == -1 ? aVar.d : aVar.b.get(b3).f;
        if (b3 != -1) {
            int i5 = aVar.b.get(b3).e;
        }
        if (eVar2 != null) {
            this.d = b3;
            eVar2.c(this.a);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
    }

    public void c(ax.L.a aVar) {
    }
}
