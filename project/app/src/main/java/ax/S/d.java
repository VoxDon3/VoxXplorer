/*
 * Decompiled with CFR 0.152.
 */
package ax.S;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import ax.S.c;
import ax.S.f;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class d {
    private final Shader a;
    private final ColorStateList b;
    private int c;

    private d(Shader shader, ColorStateList colorStateList, int n8) {
        this.a = shader;
        this.b = colorStateList;
        this.c = n8;
    }

    private static d a(Resources object, int n8, Resources.Theme theme) throws IOException, XmlPullParserException {
        XmlResourceParser xmlResourceParser = object.getXml(n8);
        AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
        while ((n8 = xmlResourceParser.next()) != 2 && n8 != 1) {
        }
        if (n8 == 2) {
            String string = xmlResourceParser.getName();
            string.getClass();
            if (!string.equals("gradient")) {
                if (string.equals("selector")) {
                    return d.c(ax.S.c.b((Resources)object, (XmlPullParser)xmlResourceParser, attributeSet, theme));
                }
                object = new StringBuilder();
                ((StringBuilder)object).append(xmlResourceParser.getPositionDescription());
                ((StringBuilder)object).append(": unsupported complex color tag ");
                ((StringBuilder)object).append(string);
                throw new XmlPullParserException(((StringBuilder)object).toString());
            }
            return d.d(f.b((Resources)object, (XmlPullParser)xmlResourceParser, attributeSet, theme));
        }
        throw new XmlPullParserException("No start tag found");
    }

    static d b(int n8) {
        return new d(null, null, n8);
    }

    static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources object, int n8, Resources.Theme theme) {
        try {
            object = d.a(object, n8, theme);
            return object;
        }
        catch (Exception exception) {
            Log.e((String)"ComplexColorCompat", (String)"Failed to inflate ComplexColor.", (Throwable)exception);
            return null;
        }
    }

    public int e() {
        return this.c;
    }

    public Shader f() {
        return this.a;
    }

    public boolean h() {
        return this.a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.a == null && (colorStateList = this.b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] nArray) {
        ColorStateList colorStateList;
        int n8;
        if (this.i() && (n8 = (colorStateList = this.b).getColorForState(nArray, colorStateList.getDefaultColor())) != this.c) {
            this.c = n8;
            return true;
        }
        return false;
    }

    public void k(int n8) {
        this.c = n8;
    }

    public boolean l() {
        return this.h() || this.c != 0;
        {
        }
    }
}

