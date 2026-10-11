/*
 * Decompiled with CFR 0.152.
 */
package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import ax.L.c;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

public class b {
    private boolean a;
    String b;
    private b c;
    private int d;
    private float e;
    private String f;
    boolean g;
    private int h;

    public b(b b8, Object object) {
        this.a = false;
        this.b = b8.b;
        this.c = b8.c;
        this.f(object);
    }

    public b(String string, b b8, Object object, boolean bl) {
        this.b = string;
        this.c = b8;
        this.a = bl;
        this.f(object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HashMap<String, b> a(HashMap<String, b> hashMap, View view) {
        HashMap<String, b> hashMap2 = new HashMap<String, b>();
        Class<?> clazz = view.getClass();
        Iterator<String> iterator = hashMap.keySet().iterator();
        while (true) {
            NoSuchMethodException noSuchMethodException2;
            block9: {
                IllegalAccessException illegalAccessException2;
                block8: {
                    InvocationTargetException invocationTargetException2;
                    block7: {
                        Object object;
                        if (!iterator.hasNext()) {
                            return hashMap2;
                        }
                        String string = iterator.next();
                        b b8 = hashMap.get(string);
                        try {
                            if (string.equals("BackgroundColor")) {
                                int n8 = ((ColorDrawable)view.getBackground()).getColor();
                                object = new b(b8, n8);
                                hashMap2.put(string, (b)object);
                                continue;
                            }
                        }
                        catch (InvocationTargetException invocationTargetException2) {
                            break block7;
                        }
                        catch (IllegalAccessException illegalAccessException2) {
                            break block8;
                        }
                        catch (NoSuchMethodException noSuchMethodException2) {
                            break block9;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append("getMap");
                        ((StringBuilder)object).append(string);
                        Object object2 = clazz.getMethod(((StringBuilder)object).toString(), null).invoke(view, null);
                        object = new b(b8, object2);
                        hashMap2.put(string, (b)object);
                        continue;
                    }
                    invocationTargetException2.printStackTrace();
                    continue;
                }
                illegalAccessException2.printStackTrace();
                continue;
            }
            noSuchMethodException2.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void d(Context context, XmlPullParser object, HashMap<String, b> hashMap) {
        TypedArray typedArray = context.obtainStyledAttributes(Xml.asAttributeSet((XmlPullParser)object), ax.L.c.X4);
        int n8 = typedArray.getIndexCount();
        String string = null;
        Boolean bl = null;
        b b8 = null;
        boolean bl2 = false;
        for (int i8 = 0; i8 < n8; ++i8) {
            boolean bl3;
            b b9;
            Object object2;
            block12: {
                block16: {
                    int n9;
                    int n10;
                    block22: {
                        block21: {
                            block20: {
                                block19: {
                                    block18: {
                                        block17: {
                                            block15: {
                                                block14: {
                                                    block13: {
                                                        block11: {
                                                            n10 = typedArray.getIndex(i8);
                                                            if (n10 != ax.L.c.Y4) break block11;
                                                            string = typedArray.getString(n10);
                                                            object = string;
                                                            object2 = bl;
                                                            b9 = b8;
                                                            bl3 = bl2;
                                                            if (string != null) {
                                                                object = string;
                                                                object2 = bl;
                                                                b9 = b8;
                                                                bl3 = bl2;
                                                                if (string.length() > 0) {
                                                                    object = new StringBuilder();
                                                                    ((StringBuilder)object).append(Character.toUpperCase(string.charAt(0)));
                                                                    ((StringBuilder)object).append(string.substring(1));
                                                                    object = ((StringBuilder)object).toString();
                                                                    object2 = bl;
                                                                    b9 = b8;
                                                                    bl3 = bl2;
                                                                }
                                                            }
                                                            break block12;
                                                        }
                                                        if (n10 != ax.L.c.i5) break block13;
                                                        object = typedArray.getString(n10);
                                                        bl3 = true;
                                                        object2 = bl;
                                                        b9 = b8;
                                                        break block12;
                                                    }
                                                    if (n10 != ax.L.c.Z4) break block14;
                                                    object2 = typedArray.getBoolean(n10, false);
                                                    b9 = androidx.constraintlayout.widget.b$b.g0;
                                                    object = string;
                                                    bl3 = bl2;
                                                    break block12;
                                                }
                                                if (n10 != ax.L.c.b5) break block15;
                                                object = androidx.constraintlayout.widget.b$b.d0;
                                                object2 = typedArray.getColor(n10, 0);
                                                break block16;
                                            }
                                            if (n10 != ax.L.c.a5) break block17;
                                            object = androidx.constraintlayout.widget.b$b.e0;
                                            object2 = typedArray.getColor(n10, 0);
                                            break block16;
                                        }
                                        if (n10 != ax.L.c.f5) break block18;
                                        object = androidx.constraintlayout.widget.b$b.h0;
                                        object2 = Float.valueOf(TypedValue.applyDimension((int)1, (float)typedArray.getDimension(n10, 0.0f), (DisplayMetrics)context.getResources().getDisplayMetrics()));
                                        break block16;
                                    }
                                    if (n10 != ax.L.c.c5) break block19;
                                    object = androidx.constraintlayout.widget.b$b.h0;
                                    object2 = Float.valueOf(typedArray.getDimension(n10, 0.0f));
                                    break block16;
                                }
                                if (n10 != ax.L.c.d5) break block20;
                                object = androidx.constraintlayout.widget.b$b.c0;
                                object2 = Float.valueOf(typedArray.getFloat(n10, Float.NaN));
                                break block16;
                            }
                            if (n10 != ax.L.c.e5) break block21;
                            object = androidx.constraintlayout.widget.b$b.q;
                            object2 = typedArray.getInteger(n10, -1);
                            break block16;
                        }
                        if (n10 != ax.L.c.h5) break block22;
                        object = androidx.constraintlayout.widget.b$b.f0;
                        object2 = typedArray.getString(n10);
                        break block16;
                    }
                    object = string;
                    object2 = bl;
                    b9 = b8;
                    bl3 = bl2;
                    if (n10 != ax.L.c.g5) break block12;
                    object = androidx.constraintlayout.widget.b$b.i0;
                    int n11 = n9 = typedArray.getResourceId(n10, -1);
                    if (n9 == -1) {
                        n11 = typedArray.getInt(n10, -1);
                    }
                    object2 = n11;
                }
                b9 = object;
                object = string;
                bl3 = bl2;
            }
            string = object;
            bl = object2;
            b8 = b9;
            bl2 = bl3;
        }
        if (string != null && bl != null) {
            hashMap.put(string, new b(string, b8, bl, bl2));
        }
        typedArray.recycle();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void e(View view, HashMap<String, b> hashMap) {
        Class<?> clazz = view.getClass();
        Iterator<String> iterator = hashMap.keySet().iterator();
        block15: while (true) {
            NoSuchMethodException noSuchMethodException2;
            CharSequence charSequence;
            Object object;
            CharSequence charSequence2;
            block21: {
                IllegalAccessException illegalAccessException2;
                block20: {
                    InvocationTargetException invocationTargetException2;
                    block19: {
                        GenericDeclaration genericDeclaration;
                        ColorDrawable colorDrawable;
                        int n8;
                        if (!iterator.hasNext()) {
                            return;
                        }
                        charSequence2 = iterator.next();
                        object = hashMap.get(charSequence2);
                        if (!((b)object).a) {
                            charSequence = new StringBuilder();
                            ((StringBuilder)charSequence).append("set");
                            ((StringBuilder)charSequence).append((String)charSequence2);
                            charSequence = ((StringBuilder)charSequence).toString();
                        } else {
                            charSequence = charSequence2;
                        }
                        try {
                            n8 = androidx.constraintlayout.widget.b$a.a[((b)object).c.ordinal()];
                            colorDrawable = Float.TYPE;
                            genericDeclaration = Integer.TYPE;
                        }
                        catch (InvocationTargetException invocationTargetException2) {
                            break block19;
                        }
                        catch (IllegalAccessException illegalAccessException2) {
                            break block20;
                        }
                        catch (NoSuchMethodException noSuchMethodException2) {
                            break block21;
                        }
                        switch (n8) {
                            default: {
                                continue block15;
                            }
                            case 8: {
                                clazz.getMethod((String)charSequence, new Class[]{colorDrawable}).invoke(view, Float.valueOf(((b)object).e));
                                continue block15;
                            }
                            case 7: {
                                clazz.getMethod((String)charSequence, new Class[]{colorDrawable}).invoke(view, Float.valueOf(((b)object).e));
                                continue block15;
                            }
                            case 6: {
                                clazz.getMethod((String)charSequence, new Class[]{genericDeclaration}).invoke(view, ((b)object).d);
                                continue block15;
                            }
                            case 5: {
                                genericDeclaration = clazz.getMethod((String)charSequence, Drawable.class);
                                colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(((b)object).h);
                                ((Method)genericDeclaration).invoke(view, colorDrawable);
                                continue block15;
                            }
                            case 4: {
                                clazz.getMethod((String)charSequence, new Class[]{genericDeclaration}).invoke(view, ((b)object).h);
                                continue block15;
                            }
                            case 3: {
                                clazz.getMethod((String)charSequence, CharSequence.class).invoke(view, ((b)object).f);
                                continue block15;
                            }
                            case 2: {
                                clazz.getMethod((String)charSequence, Boolean.TYPE).invoke(view, ((b)object).g);
                                continue block15;
                            }
                            case 1: 
                        }
                        clazz.getMethod((String)charSequence, new Class[]{genericDeclaration}).invoke(view, ((b)object).d);
                        continue;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append(" Custom Attribute \"");
                    ((StringBuilder)object).append((String)charSequence2);
                    ((StringBuilder)object).append("\" not found on ");
                    ((StringBuilder)object).append(clazz.getName());
                    Log.e((String)"TransitionLayout", (String)((StringBuilder)object).toString());
                    invocationTargetException2.printStackTrace();
                    continue;
                }
                charSequence = new StringBuilder();
                ((StringBuilder)charSequence).append(" Custom Attribute \"");
                ((StringBuilder)charSequence).append((String)charSequence2);
                ((StringBuilder)charSequence).append("\" not found on ");
                ((StringBuilder)charSequence).append(clazz.getName());
                Log.e((String)"TransitionLayout", (String)((StringBuilder)charSequence).toString());
                illegalAccessException2.printStackTrace();
                continue;
            }
            Log.e((String)"TransitionLayout", (String)noSuchMethodException2.getMessage());
            object = new StringBuilder();
            ((StringBuilder)object).append(" Custom Attribute \"");
            ((StringBuilder)object).append((String)charSequence2);
            ((StringBuilder)object).append("\" not found on ");
            ((StringBuilder)object).append(clazz.getName());
            Log.e((String)"TransitionLayout", (String)((StringBuilder)object).toString());
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append(clazz.getName());
            ((StringBuilder)charSequence2).append(" must have a method ");
            ((StringBuilder)charSequence2).append((String)charSequence);
            Log.e((String)"TransitionLayout", (String)((StringBuilder)charSequence2).toString());
        }
    }

    public String b() {
        return this.b;
    }

    public b c() {
        return this.c;
    }

    public void f(Object object) {
        switch (androidx.constraintlayout.widget.b$a.a[this.c.ordinal()]) {
            default: {
                return;
            }
            case 8: {
                this.e = ((Float)object).floatValue();
                return;
            }
            case 7: {
                this.e = ((Float)object).floatValue();
                return;
            }
            case 4: 
            case 5: {
                this.h = (Integer)object;
                return;
            }
            case 3: {
                this.f = (String)object;
                return;
            }
            case 2: {
                this.g = (Boolean)object;
                return;
            }
            case 1: 
            case 6: 
        }
        this.d = (Integer)object;
    }

    public static final class b
    extends Enum<b> {
        public static final /* enum */ b c0;
        public static final /* enum */ b d0;
        public static final /* enum */ b e0;
        public static final /* enum */ b f0;
        public static final /* enum */ b g0;
        public static final /* enum */ b h0;
        public static final /* enum */ b i0;
        private static final b[] j0;
        public static final /* enum */ b q;

        static {
            q = new b();
            c0 = new b();
            d0 = new b();
            e0 = new b();
            f0 = new b();
            g0 = new b();
            h0 = new b();
            i0 = new b();
            j0 = androidx.constraintlayout.widget.b$b.d();
        }

        private static /* synthetic */ b[] d() {
            return new b[]{q, c0, d0, e0, f0, g0, h0, i0};
        }

        public static b valueOf(String string) {
            return Enum.valueOf(b.class, string);
        }

        public static b[] values() {
            return (b[])j0.clone();
        }
    }
}

