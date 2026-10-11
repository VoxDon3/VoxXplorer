/*
 * Decompiled with CFR 0.152.
 */
package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SwitchPreference;
import androidx.preference.g;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class f {
    private static final Class<?>[] e = new Class[]{Context.class, AttributeSet.class};
    private static final HashMap<String, Constructor<?>> f = new HashMap();
    private final Context a;
    private final Object[] b = new Object[2];
    private g c;
    private String[] d;

    public f(Context context, g g8) {
        this.a = context;
        this.f(g8);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Preference a(String var1_1, String[] var2_3, AttributeSet var3_5) throws ClassNotFoundException, InflateException {
        block9: {
            var7_6 = androidx.preference.f.f.get(var1_1);
            var6_8 = var7_6;
            if (var7_6 != null) ** GOTO lbl49
            try {
                var9_9 = this.a.getClassLoader();
                if (var2_3 != null && ((Object[])var2_3).length != 0) {
                    var5_10 = ((Object[])var2_3).length;
                    var8_11 = null;
                    var7_6 = null;
                    var4_12 = 0;
                }
                ** GOTO lbl44
            }
            catch (Exception var2_4) {
                break block9;
            }
            catch (ClassNotFoundException var1_2) {
                throw var1_2;
            }
            while (true) {
                var6_8 = var8_11;
                if (var4_12 >= var5_10) break;
                var10_13 = var2_3[var4_12];
                try {
                    var6_8 = new StringBuilder();
                    var6_8.append((String)var10_13);
                    var6_8.append(var1_1);
                    var6_8 = Class.forName(var6_8.toString(), false, var9_9);
                }
                catch (ClassNotFoundException var7_7) {
                    ++var4_12;
                    continue;
                }
                break;
            }
            var2_3 = var6_8;
            if (var6_8 != null) ** GOTO lbl45
            if (var7_6 != null) throw var7_6;
            {
                var2_3 = new StringBuilder();
                var2_3.append(var3_5.getPositionDescription());
                var2_3.append(": Error inflating class ");
                var2_3.append(var1_1);
                var6_8 = new InflateException(var2_3.toString());
                throw var6_8;
lbl44:
                // 1 sources

                var2_3 = Class.forName(var1_1, false, var9_9);
lbl45:
                // 2 sources

                var6_8 = var2_3.getConstructor(androidx.preference.f.e);
                var6_8.setAccessible(true);
                androidx.preference.f.f.put(var1_1, (Constructor<?>)var6_8);
lbl49:
                // 2 sources

                var2_3 = this.b;
                var2_3[1] = var3_5;
            }
            return (Preference)var6_8.newInstance((Object[])var2_3);
        }
        var6_8 = new StringBuilder();
        var6_8.append(var3_5.getPositionDescription());
        var6_8.append(": Error inflating class ");
        var6_8.append(var1_1);
        var1_1 = new InflateException(var6_8.toString());
        var1_1.initCause(var2_4);
        throw var1_1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Preference b(String object, AttributeSet attributeSet) {
        ClassNotFoundException classNotFoundException2;
        block4: {
            try {
                if (-1 != ((String)object).indexOf(46)) return this.a((String)object, null, attributeSet);
                return this.g((String)object, attributeSet);
            }
            catch (Exception exception) {
            }
            catch (ClassNotFoundException classNotFoundException2) {
                break block4;
            }
            catch (InflateException inflateException) {
                throw inflateException;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(attributeSet.getPositionDescription());
            stringBuilder.append(": Error inflating class ");
            stringBuilder.append((String)object);
            object = new InflateException(stringBuilder.toString());
            ((Throwable)object).initCause(exception);
            throw object;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(attributeSet.getPositionDescription());
        stringBuilder.append(": Error inflating class (not found)");
        stringBuilder.append((String)object);
        object = new InflateException(stringBuilder.toString());
        ((Throwable)object).initCause(classNotFoundException2);
        throw object;
    }

    private void f(g object) {
        this.c = object;
        object = new StringBuilder();
        ((StringBuilder)object).append(Preference.class.getPackage().getName());
        ((StringBuilder)object).append(".");
        String string = ((StringBuilder)object).toString();
        object = new StringBuilder();
        ((StringBuilder)object).append(SwitchPreference.class.getPackage().getName());
        ((StringBuilder)object).append(".");
        this.j(new String[]{string, ((StringBuilder)object).toString()});
    }

    private PreferenceGroup h(PreferenceGroup preferenceGroup, PreferenceGroup preferenceGroup2) {
        if (preferenceGroup == null) {
            preferenceGroup2.a0(this.c);
            return preferenceGroup2;
        }
        return preferenceGroup;
    }

    private void i(XmlPullParser object, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int n8;
        int n9 = object.getDepth();
        while (((n8 = object.next()) != 3 || object.getDepth() > n9) && n8 != 1) {
            if (n8 != 2) continue;
            Object object2 = object.getName();
            if ("intent".equals(object2)) {
                try {
                    object2 = Intent.parseIntent((Resources)this.c().getResources(), (XmlPullParser)object, (AttributeSet)attributeSet);
                    preference.C0((Intent)object2);
                    continue;
                }
                catch (IOException iOException) {
                    object = new XmlPullParserException("Error parsing preference");
                    ((Throwable)object).initCause(iOException);
                    throw object;
                }
            }
            if ("extra".equals(object2)) {
                this.c().getResources().parseBundleExtra("extra", attributeSet, preference.t());
                try {
                    androidx.preference.f.k((XmlPullParser)object);
                    continue;
                }
                catch (IOException iOException) {
                    object = new XmlPullParserException("Error parsing preference");
                    ((Throwable)object).initCause(iOException);
                    throw object;
                }
            }
            object2 = this.b((String)object2, attributeSet);
            ((PreferenceGroup)preference).T0((Preference)object2);
            this.i((XmlPullParser)object, (Preference)object2, attributeSet);
        }
    }

    private static void k(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int n8;
        int n9 = xmlPullParser.getDepth();
        while ((n8 = xmlPullParser.next()) != 1 && (n8 != 3 || xmlPullParser.getDepth() > n9)) {
        }
    }

    public Context c() {
        return this.a;
    }

    public Preference d(int n8, PreferenceGroup preference) {
        XmlResourceParser xmlResourceParser = this.c().getResources().getXml(n8);
        try {
            preference = this.e((XmlPullParser)xmlResourceParser, (PreferenceGroup)preference);
            return preference;
        }
        finally {
            xmlResourceParser.close();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public Preference e(XmlPullParser xmlPullParser, PreferenceGroup object) {
        Object[] objectArray = this.b;
        synchronized (objectArray) {
            Throwable throwable2;
            block9: {
                InflateException inflateException2;
                block12: {
                    XmlPullParserException xmlPullParserException2;
                    block11: {
                        IOException iOException2;
                        Object object2;
                        block10: {
                            block13: {
                                int n8;
                                object2 = Xml.asAttributeSet((XmlPullParser)xmlPullParser);
                                this.b[0] = this.a;
                                while ((n8 = xmlPullParser.next()) != 2 && n8 != 1) {
                                }
                                if (n8 == 2) {
                                    object = this.h((PreferenceGroup)object, (PreferenceGroup)this.b(xmlPullParser.getName(), (AttributeSet)object2));
                                    this.i(xmlPullParser, (Preference)object, (AttributeSet)object2);
                                    return object;
                                }
                                break block13;
                                catch (Throwable throwable2) {
                                    break block9;
                                }
                                catch (IOException iOException2) {
                                    break block10;
                                }
                                catch (XmlPullParserException xmlPullParserException2) {
                                    break block11;
                                }
                                catch (InflateException inflateException2) {
                                    break block12;
                                }
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append(xmlPullParser.getPositionDescription());
                            ((StringBuilder)object).append(": No start tag found!");
                            object2 = new InflateException(((StringBuilder)object).toString());
                            throw object2;
                        }
                        object = new StringBuilder();
                        ((StringBuilder)object).append(xmlPullParser.getPositionDescription());
                        ((StringBuilder)object).append(": ");
                        ((StringBuilder)object).append(iOException2.getMessage());
                        object2 = new InflateException(((StringBuilder)object).toString());
                        ((Throwable)object2).initCause(iOException2);
                        throw object2;
                    }
                    object = new InflateException(xmlPullParserException2.getMessage());
                    ((Throwable)object).initCause(xmlPullParserException2);
                    throw object;
                }
                throw inflateException2;
            }
            throw throwable2;
        }
    }

    protected Preference g(String string, AttributeSet attributeSet) throws ClassNotFoundException {
        return this.a(string, this.d, attributeSet);
    }

    public void j(String[] stringArray) {
        this.d = stringArray;
    }
}

