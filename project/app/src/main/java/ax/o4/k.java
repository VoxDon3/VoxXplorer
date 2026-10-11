/*
 * Decompiled with CFR 0.152.
 */
package ax.o4;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import ax.o4.b;
import ax.o4.e;
import ax.o4.g;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class k {
    private ax.o4.g a = null;
    private g.J b = null;
    private boolean c = false;
    private int d;
    private boolean e = false;
    private h f = null;
    private StringBuilder g = null;
    private boolean h = false;
    private StringBuilder i = null;

    k() {
    }

    private void A(g.d d8, Attributes attributes) throws ax.o4.j {
        block5: for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            Object object = attributes.getValue(i8).trim();
            switch (ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()]) {
                default: {
                    continue block5;
                }
                case 14: {
                    d8.q = object = k.o0((String)object);
                    if (!((g.p)object).j()) continue block5;
                    throw new ax.o4.j("Invalid <circle> element. r cannot be negative");
                }
                case 13: {
                    d8.p = k.o0((String)object);
                    continue block5;
                }
                case 12: {
                    d8.o = k.o0((String)object);
                }
            }
        }
    }

    private static Set<String> A0(String object) {
        i i8 = new i((String)object);
        object = new HashSet();
        while (!i8.h()) {
            ((HashSet)object).add(i8.r());
            i8.A();
        }
        return object;
    }

    private void B(g.e e8, Attributes attributes) throws ax.o4.j {
        for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            String string = attributes.getValue(i8).trim();
            if (ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()] != 38) continue;
            if ("objectBoundingBox".equals(string)) {
                e8.p = Boolean.FALSE;
                continue;
            }
            if ("userSpaceOnUse".equals(string)) {
                e8.p = Boolean.TRUE;
                continue;
            }
            throw new ax.o4.j("Invalid value for attribute clipPathUnits");
        }
    }

    private static g.p[] B0(String object) {
        object = new i((String)object);
        ((i)object).A();
        if (((i)object).h()) {
            return null;
        }
        g.p p8 = ((i)object).p();
        if (p8 == null) {
            return null;
        }
        if (p8.j()) {
            return null;
        }
        float f8 = p8.b();
        ArrayList<g.p> arrayList = new ArrayList<g.p>();
        arrayList.add(p8);
        while (!((i)object).h()) {
            ((i)object).z();
            p8 = ((i)object).p();
            if (p8 == null) {
                return null;
            }
            if (p8.j()) {
                return null;
            }
            arrayList.add(p8);
            f8 += p8.b();
        }
        if (f8 == 0.0f) {
            return null;
        }
        return arrayList.toArray(new g.p[arrayList.size()]);
    }

    private void C(g.G g8, Attributes attributes) throws ax.o4.j {
        block7: for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            HashSet<String> hashSet = attributes.getValue(i8).trim();
            switch (ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()]) {
                default: {
                    continue block7;
                }
                case 25: {
                    List<String> list = k.i0((String)((Object)hashSet));
                    hashSet = list != null ? new HashSet<String>(list) : new HashSet<String>(0);
                    g8.e(hashSet);
                    continue block7;
                }
                case 24: {
                    g8.c(k.A0((String)((Object)hashSet)));
                    continue block7;
                }
                case 23: {
                    g8.k(k.F0((String)((Object)hashSet)));
                    continue block7;
                }
                case 22: {
                    g8.i((String)((Object)hashSet));
                    continue block7;
                }
                case 21: {
                    g8.g(k.z0((String)((Object)hashSet)));
                }
            }
        }
    }

    private static g.E.c C0(String string) {
        if ("butt".equals(string)) {
            return g.E.c.q;
        }
        if ("round".equals(string)) {
            return g.E.c.c0;
        }
        if ("square".equals(string)) {
            return g.E.c.d0;
        }
        return null;
    }

    private void D(g.L object, Attributes object2) throws ax.o4.j {
        for (int i8 = 0; i8 < object2.getLength(); ++i8) {
            String string = object2.getQName(i8);
            if (!string.equals("id") && !string.equals("xml:id")) {
                if (!string.equals("xml:space")) continue;
                if ("default".equals(object2 = object2.getValue(i8).trim())) {
                    ((g.L)object).d = Boolean.FALSE;
                    return;
                }
                if ("preserve".equals(object2)) {
                    ((g.L)object).d = Boolean.TRUE;
                    return;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Invalid value for \"xml:space\" attribute: ");
                ((StringBuilder)object).append((String)object2);
                throw new ax.o4.j(((StringBuilder)object).toString());
            }
            ((g.L)object).c = object2.getValue(i8).trim();
            break;
        }
    }

    private static g.E.d D0(String string) {
        if ("miter".equals(string)) {
            return g.E.d.q;
        }
        if ("round".equals(string)) {
            return g.E.d.c0;
        }
        if ("bevel".equals(string)) {
            return g.E.d.d0;
        }
        return null;
    }

    private void E(g.i i8, Attributes attributes) throws ax.o4.j {
        block6: for (int i9 = 0; i9 < attributes.getLength(); ++i9) {
            block7: {
                Object object = attributes.getValue(i9).trim();
                switch (ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i9)).ordinal()]) {
                    default: {
                        continue block6;
                    }
                    case 13: {
                        i8.p = k.o0((String)object);
                        continue block6;
                    }
                    case 12: {
                        i8.o = k.o0((String)object);
                        continue block6;
                    }
                    case 11: {
                        i8.r = object = k.o0((String)object);
                        if (!((g.p)object).j()) continue block6;
                        throw new ax.o4.j("Invalid <ellipse> element. ry cannot be negative");
                    }
                    case 10: {
                        i8.q = object = k.o0((String)object);
                        if (((g.p)object).j()) break block7;
                    }
                }
                continue;
            }
            throw new ax.o4.j("Invalid <ellipse> element. rx cannot be negative");
        }
    }

    private static void E0(g.L l8, String string) {
        i i8 = new i(string.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String string2;
            block6: {
                block5: {
                    string2 = i8.s(':');
                    i8.A();
                    if (!i8.f(':')) break block5;
                    i8.A();
                    string = i8.u(';');
                    if (string != null) break block6;
                }
                return;
            }
            i8.A();
            if (!i8.h() && !i8.f(';')) continue;
            if (l8.f == null) {
                l8.f = new g.E();
            }
            k.S0(l8.f, string2, string);
            i8.A();
        }
    }

    private void F(g.j j8, Attributes attributes) throws ax.o4.j {
        block7: for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            String string = attributes.getValue(i8).trim();
            int n8 = ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()];
            if (n8 != 6) {
                switch (n8) {
                    default: {
                        continue block7;
                    }
                    case 34: {
                        try {
                            j8.k = g.k.valueOf(string);
                            continue block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Invalid spreadMethod attribute. \"");
                            stringBuilder.append(string);
                            stringBuilder.append("\" is not a valid value.");
                            throw new ax.o4.j(stringBuilder.toString());
                        }
                    }
                    case 33: {
                        j8.j = this.J0(string);
                        continue block7;
                    }
                    case 32: {
                        if ("objectBoundingBox".equals(string)) {
                            j8.i = Boolean.FALSE;
                            continue block7;
                        }
                        if ("userSpaceOnUse".equals(string)) {
                            j8.i = Boolean.TRUE;
                            continue block7;
                        }
                        throw new ax.o4.j("Invalid value for attribute gradientUnits");
                    }
                }
            }
            if (!"".equals(attributes.getURI(i8)) && !"http://www.w3.org/1999/xlink".equals(attributes.getURI(i8))) continue;
            j8.l = string;
        }
    }

    private static Set<String> F0(String string) {
        i i8 = new i(string);
        HashSet<String> hashSet = new HashSet<String>();
        while (!i8.h()) {
            String string2 = i8.r();
            int n8 = string2.indexOf(45);
            string = string2;
            if (n8 != -1) {
                string = string2.substring(0, n8);
            }
            hashSet.add(new Locale(string, "", "").getLanguage());
            i8.A();
        }
        return hashSet;
    }

    private void G(g.o o8, Attributes attributes) throws ax.o4.j {
        for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            Object object = attributes.getValue(i8).trim();
            int n8 = ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 != 6) {
                                if (n8 != 7) continue;
                                k.w0(o8, (String)object);
                                continue;
                            }
                            if (!"".equals(attributes.getURI(i8)) && !"http://www.w3.org/1999/xlink".equals(attributes.getURI(i8))) continue;
                            o8.p = object;
                            continue;
                        }
                        o8.t = object = k.o0((String)object);
                        if (!((g.p)object).j()) continue;
                        throw new ax.o4.j("Invalid <use> element. height cannot be negative");
                    }
                    o8.s = object = k.o0((String)object);
                    if (!((g.p)object).j()) continue;
                    throw new ax.o4.j("Invalid <use> element. width cannot be negative");
                }
                o8.r = k.o0((String)object);
                continue;
            }
            o8.q = k.o0((String)object);
        }
    }

    private static g.E.f G0(String string) {
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 109757538: {
                if (!string.equals("start")) break;
                n8 = 2;
                break;
            }
            case 100571: {
                if (!string.equals("end")) break;
                n8 = 1;
                break;
            }
            case -1074341483: {
                if (!string.equals("middle")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return null;
            }
            case 2: {
                return g.E.f.q;
            }
            case 1: {
                return g.E.f.d0;
            }
            case 0: 
        }
        return g.E.f.c0;
    }

    private void H(g.q q8, Attributes attributes) throws ax.o4.j {
        block6: for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            String string = attributes.getValue(i8).trim();
            switch (ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()]) {
                default: {
                    continue block6;
                }
                case 18: {
                    q8.r = k.o0(string);
                    continue block6;
                }
                case 17: {
                    q8.q = k.o0(string);
                    continue block6;
                }
                case 16: {
                    q8.p = k.o0(string);
                    continue block6;
                }
                case 15: {
                    q8.o = k.o0(string);
                }
            }
        }
    }

    private static g.E.g H0(String string) {
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 529818312: {
                if (!string.equals("overline")) break;
                n8 = 4;
                break;
            }
            case 93826908: {
                if (!string.equals("blink")) break;
                n8 = 3;
                break;
            }
            case 3387192: {
                if (!string.equals("none")) break;
                n8 = 2;
                break;
            }
            case -1026963764: {
                if (!string.equals("underline")) break;
                n8 = 1;
                break;
            }
            case -1171789332: {
                if (!string.equals("line-through")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return null;
            }
            case 4: {
                return g.E.g.d0;
            }
            case 3: {
                return g.E.g.f0;
            }
            case 2: {
                return g.E.g.q;
            }
            case 1: {
                return g.E.g.c0;
            }
            case 0: 
        }
        return g.E.g.e0;
    }

    private void I(g.M m8, Attributes attributes) throws ax.o4.j {
        block6: for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            String string = attributes.getValue(i8).trim();
            switch (ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()]) {
                default: {
                    continue block6;
                }
                case 18: {
                    m8.p = k.o0(string);
                    continue block6;
                }
                case 17: {
                    m8.o = k.o0(string);
                    continue block6;
                }
                case 16: {
                    m8.n = k.o0(string);
                    continue block6;
                }
                case 15: {
                    m8.m = k.o0(string);
                }
            }
        }
    }

    private static g.E.h I0(String string) {
        string.getClass();
        if (!string.equals("ltr")) {
            if (!string.equals("rtl")) {
                return null;
            }
            return g.E.h.c0;
        }
        return g.E.h.q;
    }

    private void J(g.r r8, Attributes attributes) throws ax.o4.j {
        block8: for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            Object object = attributes.getValue(i8).trim();
            switch (ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()]) {
                default: {
                    continue block8;
                }
                case 31: {
                    if ("auto".equals(object)) {
                        r8.v = Float.valueOf(Float.NaN);
                        continue block8;
                    }
                    r8.v = Float.valueOf(k.f0((String)object));
                    continue block8;
                }
                case 30: {
                    if ("strokeWidth".equals(object)) {
                        r8.q = false;
                        continue block8;
                    }
                    if ("userSpaceOnUse".equals(object)) {
                        r8.q = true;
                        continue block8;
                    }
                    throw new ax.o4.j("Invalid value for attribute markerUnits");
                }
                case 29: {
                    r8.u = object = k.o0((String)object);
                    if (!((g.p)object).j()) continue block8;
                    throw new ax.o4.j("Invalid <marker> element. markerHeight cannot be negative");
                }
                case 28: {
                    r8.t = object = k.o0((String)object);
                    if (!((g.p)object).j()) continue block8;
                    throw new ax.o4.j("Invalid <marker> element. markerWidth cannot be negative");
                }
                case 27: {
                    r8.s = k.o0((String)object);
                    continue block8;
                }
                case 26: {
                    r8.r = k.o0((String)object);
                }
            }
        }
    }

    private Matrix J0(String charSequence) throws ax.o4.j {
        Matrix matrix = new Matrix();
        Object object = new i((String)charSequence);
        ((i)object).A();
        while (!((i)object).h()) {
            block26: {
                block27: {
                    String string = ((i)object).o();
                    if (string == null) break block26;
                    int n8 = -1;
                    switch (string.hashCode()) {
                        default: {
                            break;
                        }
                        case 1052832078: {
                            if (!string.equals("translate")) break;
                            n8 = 5;
                            break;
                        }
                        case 109493391: {
                            if (!string.equals("skewY")) break;
                            n8 = 4;
                            break;
                        }
                        case 109493390: {
                            if (!string.equals("skewX")) break;
                            n8 = 3;
                            break;
                        }
                        case 109250890: {
                            if (!string.equals("scale")) break;
                            n8 = 2;
                            break;
                        }
                        case -925180581: {
                            if (!string.equals("rotate")) break;
                            n8 = 1;
                            break;
                        }
                        case -1081239615: {
                            if (!string.equals("matrix")) break;
                            n8 = 0;
                        }
                    }
                    switch (n8) {
                        default: {
                            charSequence = new StringBuilder();
                            ((StringBuilder)charSequence).append("Invalid transform list fn: ");
                            ((StringBuilder)charSequence).append(string);
                            ((StringBuilder)charSequence).append(")");
                            throw new ax.o4.j(((StringBuilder)charSequence).toString());
                        }
                        case 5: {
                            ((i)object).A();
                            float f8 = ((i)object).n();
                            float f9 = ((i)object).x();
                            ((i)object).A();
                            if (!Float.isNaN(f8) && ((i)object).f(')')) {
                                if (Float.isNaN(f9)) {
                                    matrix.preTranslate(f8, 0.0f);
                                    break;
                                }
                                matrix.preTranslate(f8, f9);
                                break;
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append("Invalid transform list: ");
                            ((StringBuilder)object).append((String)charSequence);
                            throw new ax.o4.j(((StringBuilder)object).toString());
                        }
                        case 4: {
                            ((i)object).A();
                            float f9 = ((i)object).n();
                            ((i)object).A();
                            if (!Float.isNaN(f9) && ((i)object).f(')')) {
                                matrix.preSkew(0.0f, (float)Math.tan(Math.toRadians(f9)));
                                break;
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append("Invalid transform list: ");
                            ((StringBuilder)object).append((String)charSequence);
                            throw new ax.o4.j(((StringBuilder)object).toString());
                        }
                        case 3: {
                            ((i)object).A();
                            float f9 = ((i)object).n();
                            ((i)object).A();
                            if (!Float.isNaN(f9) && ((i)object).f(')')) {
                                matrix.preSkew((float)Math.tan(Math.toRadians(f9)), 0.0f);
                                break;
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append("Invalid transform list: ");
                            ((StringBuilder)object).append((String)charSequence);
                            throw new ax.o4.j(((StringBuilder)object).toString());
                        }
                        case 2: {
                            ((i)object).A();
                            float f8 = ((i)object).n();
                            float f9 = ((i)object).x();
                            ((i)object).A();
                            if (!Float.isNaN(f8) && ((i)object).f(')')) {
                                if (Float.isNaN(f9)) {
                                    matrix.preScale(f8, f8);
                                    break;
                                }
                                matrix.preScale(f8, f9);
                                break;
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append("Invalid transform list: ");
                            ((StringBuilder)object).append((String)charSequence);
                            throw new ax.o4.j(((StringBuilder)object).toString());
                        }
                        case 1: {
                            ((i)object).A();
                            float f10 = ((i)object).n();
                            float f8 = ((i)object).x();
                            float f9 = ((i)object).x();
                            ((i)object).A();
                            if (!Float.isNaN(f10) && ((i)object).f(')')) {
                                if (Float.isNaN(f8)) {
                                    matrix.preRotate(f10);
                                    break;
                                }
                                if (!Float.isNaN(f9)) {
                                    matrix.preRotate(f10, f8, f9);
                                    break;
                                }
                                object = new StringBuilder();
                                ((StringBuilder)object).append("Invalid transform list: ");
                                ((StringBuilder)object).append((String)charSequence);
                                throw new ax.o4.j(((StringBuilder)object).toString());
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append("Invalid transform list: ");
                            ((StringBuilder)object).append((String)charSequence);
                            throw new ax.o4.j(((StringBuilder)object).toString());
                        }
                        case 0: {
                            ((i)object).A();
                            float f11 = ((i)object).n();
                            ((i)object).z();
                            float f8 = ((i)object).n();
                            ((i)object).z();
                            float f9 = ((i)object).n();
                            ((i)object).z();
                            float f10 = ((i)object).n();
                            ((i)object).z();
                            float f12 = ((i)object).n();
                            ((i)object).z();
                            float f13 = ((i)object).n();
                            ((i)object).A();
                            if (Float.isNaN(f13) || !((i)object).f(')')) break block27;
                            string = new Matrix();
                            string.setValues(new float[]{f11, f9, f12, f8, f10, f13, 0.0f, 0.0f, 1.0f});
                            matrix.preConcat((Matrix)string);
                        }
                    }
                    if (((i)object).h()) break;
                    ((i)object).z();
                    continue;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Invalid transform list: ");
                ((StringBuilder)object).append((String)charSequence);
                throw new ax.o4.j(((StringBuilder)object).toString());
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Bad transform function encountered in transform list: ");
            ((StringBuilder)object).append((String)charSequence);
            throw new ax.o4.j(((StringBuilder)object).toString());
        }
        return matrix;
    }

    private void K(g.s s8, Attributes attributes) throws ax.o4.j {
        for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            Object object = attributes.getValue(i8).trim();
            int n8 = ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 != 43) {
                                if (n8 != 44) continue;
                                if ("objectBoundingBox".equals(object)) {
                                    s8.p = Boolean.FALSE;
                                    continue;
                                }
                                if ("userSpaceOnUse".equals(object)) {
                                    s8.p = Boolean.TRUE;
                                    continue;
                                }
                                throw new ax.o4.j("Invalid value for attribute maskContentUnits");
                            }
                            if ("objectBoundingBox".equals(object)) {
                                s8.o = Boolean.FALSE;
                                continue;
                            }
                            if ("userSpaceOnUse".equals(object)) {
                                s8.o = Boolean.TRUE;
                                continue;
                            }
                            throw new ax.o4.j("Invalid value for attribute maskUnits");
                        }
                        s8.t = object = k.o0((String)object);
                        if (!((g.p)object).j()) continue;
                        throw new ax.o4.j("Invalid <mask> element. height cannot be negative");
                    }
                    s8.s = object = k.o0((String)object);
                    if (!((g.p)object).j()) continue;
                    throw new ax.o4.j("Invalid <mask> element. width cannot be negative");
                }
                s8.r = k.o0((String)object);
                continue;
            }
            s8.q = k.o0((String)object);
        }
    }

    private void K0(InputStream inputStream) throws ax.o4.j {
        ParserConfigurationException parserConfigurationException2;
        block5: {
            SAXException sAXException2;
            block4: {
                Log.d((String)"SVGParser", (String)"Falling back to SAX parser");
                try {
                    Object object = SAXParserFactory.newInstance();
                    ((SAXParserFactory)object).setFeature("http://xml.org/sax/features/external-general-entities", false);
                    ((SAXParserFactory)object).setFeature("http://xml.org/sax/features/external-parameter-entities", false);
                    object = ((SAXParserFactory)object).newSAXParser().getXMLReader();
                    Object object2 = new f(this);
                    object.setContentHandler((ContentHandler)object2);
                    object.setProperty("http://xml.org/sax/properties/lexical-handler", object2);
                    object2 = new InputSource(inputStream);
                    object.parse((InputSource)object2);
                    return;
                }
                catch (IOException iOException) {
                }
                catch (SAXException sAXException2) {
                    break block4;
                }
                catch (ParserConfigurationException parserConfigurationException2) {
                    break block5;
                }
                throw new ax.o4.j("Stream error", iOException);
            }
            throw new ax.o4.j("SVG parse error", sAXException2);
        }
        throw new ax.o4.j("XML parser problem", parserConfigurationException2);
    }

    private void L(g.v v8, Attributes attributes) throws ax.o4.j {
        for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            Object object = attributes.getValue(i8).trim();
            int n8 = ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()];
            if (n8 != 8) {
                if (n8 != 9) continue;
                v8.p = object = Float.valueOf(k.f0((String)object));
                if (!(((Float)object).floatValue() < 0.0f)) continue;
                throw new ax.o4.j("Invalid <path> element. pathLength cannot be negative");
            }
            v8.o = k.u0((String)object);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void L0(InputStream var1_1, boolean var2_5) throws ax.o4.j {
        try {
            var8_6 = Xml.newPullParser();
            var7_7 = new j(this, var8_6);
            var8_6.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
            var8_6.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            var8_6.setInput(var1_1, null);
            var3_8 = var8_6.getEventType();
            while (var3_8 != 1) {
                block13: {
                    block14: {
                        block15: {
                            if (var3_8 == 0) ** GOTO lbl74
                            if (var3_8 == 8) ** GOTO lbl64
                            if (var3_8 == 10) break block13;
                            if (var3_8 == 2) break block14;
                            if (var3_8 == 3) break block15;
                            if (var3_8 != 4) {
                                if (var3_8 == 5) {
                                    this.c1(var8_6.getText());
                                }
                            } else {
                                var5_10 = new int[2];
                                this.e1(var8_6.getTextCharacters((int[])var5_10), (int)var5_10[0], (int)var5_10[1]);
                            }
                            ** GOTO lbl75
                        }
                        var6_11 = var8_6.getName();
                        var5_10 = var6_11;
                        if (var8_6.getPrefix() != null) {
                            var5_10 = new StringBuilder();
                            var5_10.append(var8_6.getPrefix());
                            var5_10.append(':');
                            var5_10.append(var6_11);
                            var5_10 = var5_10.toString();
                        }
                        this.p(var8_6.getNamespace(), var8_6.getName(), (String)var5_10);
                        ** GOTO lbl75
                    }
                    var6_11 = var8_6.getName();
                    var5_10 = var6_11;
                    if (var8_6.getPrefix() != null) {
                        var5_10 = new StringBuilder();
                        var5_10.append(var8_6.getPrefix());
                        var5_10.append(':');
                        var5_10.append(var6_11);
                        var5_10 = var5_10.toString();
                    }
                    this.X0(var8_6.getNamespace(), var8_6.getName(), (String)var5_10, var7_7);
                    ** GOTO lbl75
                }
                if (!var2_5 || this.a.m() != null || !(var4_9 = var8_6.getText().contains("<!ENTITY "))) ** GOTO lbl75
            }
            ** GOTO lbl78
            {
                try {
                    Log.d((String)"SVGParser", (String)"Switching to SAX parser to process entities");
                    var1_1.reset();
                    this.K0(var1_1);
                    return;
                }
                catch (IOException var1_4) {
                    try {
                        block16: {
                            Log.w((String)"SVGParser", (String)"Detected internal entity definitions, but could not parse them.");
                            return;
lbl64:
                            // 1 sources

                            var5_10 = new StringBuilder();
                            var5_10.append("PROC INSTR: ");
                            var5_10.append(var8_6.getText());
                            Log.d((String)"SVGParser", (String)var5_10.toString());
                            var5_10 = new i(var8_6.getText());
                            this.r(var5_10.r(), this.x0((i)var5_10));
                            break block16;
lbl74:
                            // 1 sources

                            this.W0();
                        }
                        var3_8 = var8_6.nextToken();
                        continue;
lbl78:
                        // 1 sources

                        this.o();
                        return;
                    }
                    catch (IOException var1_2) {
                        throw new ax.o4.j("Stream error", var1_2);
                        break;
                    }
                }
            }
        }
        catch (XmlPullParserException var1_3) {
            throw new ax.o4.j("XML parser problem", (Exception)var1_3);
        }
    }

    private void M(g.y y8, Attributes attributes) throws ax.o4.j {
        block5: for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            Object object = attributes.getValue(i8).trim();
            int n8 = ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 != 6) {
                                switch (n8) {
                                    default: {
                                        continue block5;
                                    }
                                    case 42: {
                                        y8.s = this.J0((String)object);
                                        continue block5;
                                    }
                                    case 41: {
                                        if ("objectBoundingBox".equals(object)) {
                                            y8.r = Boolean.FALSE;
                                            continue block5;
                                        }
                                        if ("userSpaceOnUse".equals(object)) {
                                            y8.r = Boolean.TRUE;
                                            continue block5;
                                        }
                                        throw new ax.o4.j("Invalid value for attribute patternContentUnits");
                                    }
                                    case 40: {
                                        if ("objectBoundingBox".equals(object)) {
                                            y8.q = Boolean.FALSE;
                                            continue block5;
                                        }
                                        if ("userSpaceOnUse".equals(object)) {
                                            y8.q = Boolean.TRUE;
                                            continue block5;
                                        }
                                        throw new ax.o4.j("Invalid value for attribute patternUnits");
                                    }
                                }
                            }
                            if (!"".equals(attributes.getURI(i8)) && !"http://www.w3.org/1999/xlink".equals(attributes.getURI(i8))) continue;
                            y8.x = object;
                            continue;
                        }
                        y8.w = object = k.o0((String)object);
                        if (!((g.p)object).j()) continue;
                        throw new ax.o4.j("Invalid <pattern> element. height cannot be negative");
                    }
                    y8.v = object = k.o0((String)object);
                    if (!((g.p)object).j()) continue;
                    throw new ax.o4.j("Invalid <pattern> element. width cannot be negative");
                }
                y8.u = k.o0((String)object);
                continue;
            }
            y8.t = k.o0((String)object);
        }
    }

    private static g.E.i M0(String string) {
        string.getClass();
        if (!string.equals("none")) {
            if (!string.equals("non-scaling-stroke")) {
                return null;
            }
            return g.E.i.c0;
        }
        return g.E.i.q;
    }

    private void N(g.z object, Attributes attributes, String string) throws ax.o4.j {
        for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            float f8;
            if (ax.o4.k$g.d(attributes.getLocalName(i8)) != ax.o4.k$g.W0) continue;
            i i9 = new i(attributes.getValue(i8));
            ArrayList<Float> arrayList = new ArrayList<Float>();
            i9.A();
            while (!i9.h()) {
                f8 = i9.n();
                if (!Float.isNaN(f8)) {
                    i9.z();
                    float f9 = i9.n();
                    if (!Float.isNaN(f9)) {
                        i9.z();
                        arrayList.add(Float.valueOf(f8));
                        arrayList.add(Float.valueOf(f9));
                        continue;
                    }
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Invalid <");
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append("> points attribute. There should be an even number of coordinates.");
                    throw new ax.o4.j(((StringBuilder)object).toString());
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Invalid <");
                ((StringBuilder)object).append(string);
                ((StringBuilder)object).append("> points attribute. Non-coordinate content found in list.");
                throw new ax.o4.j(((StringBuilder)object).toString());
            }
            ((g.z)object).o = new float[arrayList.size()];
            int n8 = arrayList.size();
            int n9 = 0;
            int n10 = 0;
            while (n10 < n8) {
                i9 = arrayList.get(n10);
                ++n10;
                ((g.z)object).o[n9] = f8 = ((Float)((Object)i9)).floatValue();
                ++n9;
            }
        }
    }

    private static g.b N0(String object) throws ax.o4.j {
        object = new i((String)object);
        ((i)object).A();
        float f8 = ((i)object).n();
        ((i)object).z();
        float f9 = ((i)object).n();
        ((i)object).z();
        float f10 = ((i)object).n();
        ((i)object).z();
        float f11 = ((i)object).n();
        if (!(Float.isNaN(f8) || Float.isNaN(f9) || Float.isNaN(f10) || Float.isNaN(f11))) {
            if (!(f10 < 0.0f)) {
                if (!(f11 < 0.0f)) {
                    return new g.b(f8, f9, f10, f11);
                }
                throw new ax.o4.j("Invalid viewBox. height cannot be negative");
            }
            throw new ax.o4.j("Invalid viewBox. width cannot be negative");
        }
        throw new ax.o4.j("Invalid viewBox definition - should have four numbers");
    }

    private void O(g.Q q8, Attributes attributes) throws ax.o4.j {
        for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            Object object = attributes.getValue(i8).trim();
            int n8 = ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()];
            if (n8 != 35) {
                if (n8 != 36) {
                    switch (n8) {
                        default: {
                            break;
                        }
                        case 14: {
                            q8.o = object = k.o0((String)object);
                            if (!((g.p)object).j()) break;
                            throw new ax.o4.j("Invalid <radialGradient> element. r cannot be negative");
                        }
                        case 13: {
                            q8.n = k.o0((String)object);
                            break;
                        }
                        case 12: {
                            q8.m = k.o0((String)object);
                            break;
                        }
                    }
                    continue;
                }
                q8.q = k.o0((String)object);
                continue;
            }
            q8.p = k.o0((String)object);
        }
    }

    private void O0(Attributes attributes) throws ax.o4.j {
        this.l("<path>", new Object[0]);
        if (this.b != null) {
            g.v v8 = new g.v();
            v8.a = this.a;
            v8.b = this.b;
            this.D(v8, attributes);
            this.S(v8, attributes);
            this.W(v8, attributes);
            this.C(v8, attributes);
            this.L(v8, attributes);
            this.b.m(v8);
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private void P(g.B b8, Attributes attributes) throws ax.o4.j {
        for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            Object object = attributes.getValue(i8).trim();
            int n8 = ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 != 10) {
                                if (n8 != 11) continue;
                                b8.t = object = k.o0((String)object);
                                if (!((g.p)object).j()) continue;
                                throw new ax.o4.j("Invalid <rect> element. ry cannot be negative");
                            }
                            b8.s = object = k.o0((String)object);
                            if (!((g.p)object).j()) continue;
                            throw new ax.o4.j("Invalid <rect> element. rx cannot be negative");
                        }
                        b8.r = object = k.o0((String)object);
                        if (!((g.p)object).j()) continue;
                        throw new ax.o4.j("Invalid <rect> element. height cannot be negative");
                    }
                    b8.q = object = k.o0((String)object);
                    if (!((g.p)object).j()) continue;
                    throw new ax.o4.j("Invalid <rect> element. width cannot be negative");
                }
                b8.p = k.o0((String)object);
                continue;
            }
            b8.o = k.o0((String)object);
        }
    }

    private void P0(Attributes attributes) throws ax.o4.j {
        this.l("<pattern>", new Object[0]);
        if (this.b != null) {
            g.y y8 = new g.y();
            y8.a = this.a;
            y8.b = this.b;
            this.D(y8, attributes);
            this.S(y8, attributes);
            this.C(y8, attributes);
            this.Y(y8, attributes);
            this.M(y8, attributes);
            this.b.m(y8);
            this.b = y8;
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private void Q(g.F f8, Attributes attributes) throws ax.o4.j {
        for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            Object object = attributes.getValue(i8).trim();
            int n8 = ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 != 5) continue;
                            f8.u = object;
                            continue;
                        }
                        f8.t = object = k.o0((String)object);
                        if (!((g.p)object).j()) continue;
                        throw new ax.o4.j("Invalid <svg> element. height cannot be negative");
                    }
                    f8.s = object = k.o0((String)object);
                    if (!((g.p)object).j()) continue;
                    throw new ax.o4.j("Invalid <svg> element. width cannot be negative");
                }
                f8.r = k.o0((String)object);
                continue;
            }
            f8.q = k.o0((String)object);
        }
    }

    private void Q0(Attributes attributes) throws ax.o4.j {
        this.l("<polygon>", new Object[0]);
        if (this.b != null) {
            g.A a8 = new g.A();
            a8.a = this.a;
            a8.b = this.b;
            this.D(a8, attributes);
            this.S(a8, attributes);
            this.W(a8, attributes);
            this.C(a8, attributes);
            this.N(a8, attributes, "polygon");
            this.b.m(a8);
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private void R(g.D d8, Attributes attributes) throws ax.o4.j {
        for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            String string = attributes.getValue(i8).trim();
            if (ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()] != 37) continue;
            d8.h = this.n0(string);
        }
    }

    private void R0(Attributes attributes) throws ax.o4.j {
        this.l("<polyline>", new Object[0]);
        if (this.b != null) {
            g.z z8 = new g.z();
            z8.a = this.a;
            z8.b = this.b;
            this.D(z8, attributes);
            this.S(z8, attributes);
            this.W(z8, attributes);
            this.C(z8, attributes);
            this.N(z8, attributes, "polyline");
            this.b.m(z8);
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private void S(g.L l8, Attributes attributes) throws ax.o4.j {
        for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            String string = attributes.getValue(i8).trim();
            if (string.length() == 0) continue;
            int n8 = ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()];
            if (n8 != 45) {
                if (n8 != 46) {
                    if (l8.e == null) {
                        l8.e = new g.E();
                    }
                    k.S0(l8.e, attributes.getLocalName(i8), attributes.getValue(i8).trim());
                    continue;
                }
                l8.g = ax.o4.b.f(string);
                continue;
            }
            k.E0(l8, string);
        }
    }

    /*
     * Loose catch block
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static void S0(g.E e8, String object, String string) {
        if (string.length() != 0 && !string.equals("inherit")) {
            switch (ax.o4.k$a.b[ax.o4.k$g.d((String)object).ordinal()]) {
                default: {
                    return;
                }
                case 86: {
                    object = k.y0(string);
                    e8.N0 = object;
                    if (object == null) break;
                    e8.q |= 0x2000000000L;
                    return;
                }
                case 85: {
                    object = k.M0(string);
                    e8.M0 = object;
                    if (object == null) break;
                    e8.q |= 0x800000000L;
                    return;
                }
                case 84: {
                    e8.L0 = k.r0(string);
                    e8.q |= 0x400000000L;
                    return;
                }
                case 83: {
                    if (string.equals("currentColor")) {
                        e8.K0 = g.g.b();
                    } else {
                        e8.K0 = k.b0(string);
                    }
                    e8.q |= 0x200000000L;
                    return;
                    catch (ax.o4.j j8) {
                        Log.w((String)"SVGParser", (String)((Throwable)j8).getMessage());
                        return;
                    }
                }
                case 82: {
                    e8.J0 = k.r0(string);
                    e8.q |= 0x100000000L;
                    return;
                }
                case 81: {
                    if (string.equals("currentColor")) {
                        e8.I0 = g.g.b();
                    } else {
                        e8.I0 = k.b0(string);
                    }
                    e8.q |= 0x80000000L;
                    return;
                    catch (ax.o4.j j9) {
                        Log.w((String)"SVGParser", (String)((Throwable)j9).getMessage());
                        return;
                    }
                }
                case 80: {
                    e8.H0 = k.m0(string, (String)object);
                    e8.q |= 0x40000000L;
                    return;
                }
                case 79: {
                    e8.G0 = k.e0(string);
                    e8.q |= 0x20000000L;
                    return;
                }
                case 78: {
                    e8.F0 = k.m0(string, (String)object);
                    e8.q |= 0x10000000L;
                    return;
                }
                case 77: {
                    object = k.a0(string);
                    e8.x0 = object;
                    if (object == null) break;
                    e8.q |= 0x100000L;
                    return;
                }
                case 76: {
                    e8.E0 = k.r0(string);
                    e8.q |= 0x8000000L;
                    return;
                }
                case 75: {
                    if (string.equals("currentColor")) {
                        e8.D0 = g.g.b();
                    } else {
                        e8.D0 = k.b0(string);
                    }
                    e8.q |= 0x4000000L;
                    return;
                    catch (ax.o4.j j10) {
                        Log.w((String)"SVGParser", (String)((Throwable)j10).getMessage());
                        return;
                    }
                }
                case 74: {
                    if (string.indexOf(124) >= 0) break;
                    object = new StringBuilder();
                    ((StringBuilder)object).append('|');
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append('|');
                    if (!"|visible|hidden|collapse|".contains(((StringBuilder)object).toString())) break;
                    e8.C0 = string.equals("visible");
                    e8.q |= 0x2000000L;
                    return;
                }
                case 73: {
                    if (string.indexOf(124) >= 0) break;
                    object = new StringBuilder();
                    ((StringBuilder)object).append('|');
                    ((StringBuilder)object).append(string);
                    ((StringBuilder)object).append('|');
                    if (!"|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains(((StringBuilder)object).toString())) break;
                    e8.B0 = string.equals("none") ^ true;
                    e8.q |= 0x1000000L;
                    return;
                }
                case 72: {
                    e8.A0 = k.m0(string, (String)object);
                    e8.q |= 0x800000L;
                    return;
                }
                case 71: {
                    e8.z0 = k.m0(string, (String)object);
                    e8.q |= 0x400000L;
                    return;
                }
                case 70: {
                    e8.y0 = k.m0(string, (String)object);
                    e8.q |= 0x200000L;
                    return;
                }
                case 69: {
                    object = k.m0(string, (String)object);
                    e8.y0 = object;
                    e8.z0 = object;
                    e8.A0 = object;
                    e8.q |= 0xE00000L;
                    return;
                }
                case 68: {
                    object = k.s0(string);
                    e8.w0 = object;
                    if (object == null) break;
                    e8.q |= 0x80000L;
                    return;
                }
                case 67: {
                    object = k.G0(string);
                    e8.v0 = object;
                    if (object == null) break;
                    e8.q |= 0x40000L;
                    return;
                }
                case 66: {
                    object = k.I0(string);
                    e8.u0 = object;
                    if (object == null) break;
                    e8.q |= 0x1000000000L;
                    return;
                }
                case 65: {
                    object = k.H0(string);
                    e8.t0 = object;
                    if (object == null) break;
                    e8.q |= 0x20000L;
                    return;
                }
                case 64: {
                    object = k.k0(string);
                    e8.s0 = object;
                    if (object == null) break;
                    e8.q |= 0x10000L;
                    return;
                }
                case 63: {
                    object = k.l0(string);
                    e8.r0 = object;
                    if (object == null) break;
                    e8.q |= 0x8000L;
                    return;
                }
                case 62: {
                    object = k.j0(string);
                    e8.q0 = object;
                    if (object == null) break;
                    e8.q |= 0x4000L;
                    return;
                }
                case 61: {
                    object = k.i0(string);
                    e8.p0 = object;
                    if (object == null) break;
                    e8.q |= 0x2000L;
                    return;
                }
                case 60: {
                    k.h0(e8, string);
                    return;
                }
                case 59: {
                    e8.o0 = k.b0(string);
                    e8.q |= 0x1000L;
                    return;
                }
                case 58: {
                    e8.n0 = k.r0(string);
                    e8.q |= 0x800L;
                    return;
                }
                case 57: {
                    e8.m0 = k.o0(string);
                    e8.q |= 0x400L;
                    return;
                }
                case 56: {
                    if ("none".equals(string)) {
                        e8.l0 = null;
                        e8.q |= 0x200L;
                        return;
                    }
                    object = k.B0(string);
                    e8.l0 = object;
                    if (object == null) break;
                    e8.q |= 0x200L;
                    return;
                }
                case 55: {
                    e8.k0 = Float.valueOf(k.f0(string));
                    e8.q |= 0x100L;
                    return;
                }
                case 54: {
                    object = k.D0(string);
                    e8.j0 = object;
                    if (object == null) break;
                    e8.q |= 0x80L;
                    return;
                }
                case 53: {
                    object = k.C0(string);
                    e8.i0 = object;
                    if (object == null) break;
                    e8.q |= 0x40L;
                    return;
                }
                case 52: {
                    e8.h0 = k.o0(string);
                    e8.q |= 0x20L;
                    return;
                }
                case 51: {
                    object = k.r0(string);
                    e8.g0 = object;
                    if (object == null) break;
                    e8.q |= 0x10L;
                    return;
                }
                case 50: {
                    object = k.t0(string);
                    e8.f0 = object;
                    if (object == null) break;
                    e8.q |= 8L;
                    return;
                }
                case 49: {
                    object = k.r0(string);
                    e8.e0 = object;
                    if (object == null) break;
                    e8.q |= 4L;
                    return;
                }
                case 48: {
                    object = k.e0(string);
                    e8.d0 = object;
                    if (object == null) break;
                    e8.q |= 2L;
                    return;
                }
                case 47: {
                    object = k.t0(string);
                    e8.c0 = object;
                    if (object == null) break;
                    e8.q |= 1L;
                }
            }
        }
        return;
        catch (ax.o4.j j11) {
            return;
        }
    }

    private void T(g.U u8, Attributes attributes) {
        for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            String string = attributes.getValue(i8).trim();
            if (ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()] != 6 || !"".equals(attributes.getURI(i8)) && !"http://www.w3.org/1999/xlink".equals(attributes.getURI(i8))) continue;
            u8.o = string;
        }
    }

    private void T0(Attributes attributes) throws ax.o4.j {
        this.l("<radialGradient>", new Object[0]);
        if (this.b != null) {
            g.Q q8 = new g.Q();
            q8.a = this.a;
            q8.b = this.b;
            this.D(q8, attributes);
            this.S(q8, attributes);
            this.F(q8, attributes);
            this.O(q8, attributes);
            this.b.m(q8);
            this.b = q8;
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private void U(g.Z z8, Attributes attributes) throws ax.o4.j {
        for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            String string = attributes.getValue(i8).trim();
            int n8 = ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()];
            if (n8 != 6) {
                if (n8 != 39) continue;
                z8.p = k.o0(string);
                continue;
            }
            if (!"".equals(attributes.getURI(i8)) && !"http://www.w3.org/1999/xlink".equals(attributes.getURI(i8))) continue;
            z8.o = string;
        }
    }

    private void U0(Attributes attributes) throws ax.o4.j {
        this.l("<rect>", new Object[0]);
        if (this.b != null) {
            g.B b8 = new g.B();
            b8.a = this.a;
            b8.b = this.b;
            this.D(b8, attributes);
            this.S(b8, attributes);
            this.W(b8, attributes);
            this.C(b8, attributes);
            this.P(b8, attributes);
            this.b.m(b8);
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private void V(g.a0 a02, Attributes attributes) throws ax.o4.j {
        for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            String string = attributes.getValue(i8).trim();
            int n8 = ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 19) {
                        if (n8 != 20) continue;
                        a02.r = k.p0(string);
                        continue;
                    }
                    a02.q = k.p0(string);
                    continue;
                }
                a02.p = k.p0(string);
                continue;
            }
            a02.o = k.p0(string);
        }
    }

    private void V0(Attributes attributes) throws ax.o4.j {
        this.l("<solidColor>", new Object[0]);
        if (this.b != null) {
            g.C c8 = new g.C();
            c8.a = this.a;
            c8.b = this.b;
            this.D(c8, attributes);
            this.S(c8, attributes);
            this.b.m(c8);
            this.b = c8;
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private void W(g.n n8, Attributes attributes) throws ax.o4.j {
        for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            if (ax.o4.k$g.d(attributes.getLocalName(i8)) != ax.o4.k$g.z1) continue;
            n8.j(this.J0(attributes.getValue(i8)));
        }
    }

    private void W0() {
        this.a = new ax.o4.g();
    }

    private void X(g.e0 e02, Attributes attributes) throws ax.o4.j {
        for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            Object object = attributes.getValue(i8).trim();
            int n8 = ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 != 4) {
                            if (n8 != 6 || !"".equals(attributes.getURI(i8)) && !"http://www.w3.org/1999/xlink".equals(attributes.getURI(i8))) continue;
                            e02.p = object;
                            continue;
                        }
                        e02.t = object = k.o0((String)object);
                        if (!((g.p)object).j()) continue;
                        throw new ax.o4.j("Invalid <use> element. height cannot be negative");
                    }
                    e02.s = object = k.o0((String)object);
                    if (!((g.p)object).j()) continue;
                    throw new ax.o4.j("Invalid <use> element. width cannot be negative");
                }
                e02.r = k.o0((String)object);
                continue;
            }
            e02.q = k.o0((String)object);
        }
    }

    private void X0(String object, String string, String string2, Attributes attributes) throws ax.o4.j {
        if (this.c) {
            ++this.d;
            return;
        }
        if (!"http://www.w3.org/2000/svg".equals(object) && !"".equals(object)) {
            return;
        }
        if (string.length() <= 0) {
            string = string2;
        }
        object = ax.o4.k$h.d(string);
        switch (ax.o4.k$a.a[((Enum)object).ordinal()]) {
            default: {
                this.c = true;
                this.d = 1;
                return;
            }
            case 31: {
                this.V0(attributes);
                return;
            }
            case 30: {
                this.Z0(attributes);
                return;
            }
            case 29: {
                this.y(attributes);
                return;
            }
            case 28: {
                this.j1(attributes);
                return;
            }
            case 27: {
                this.u(attributes);
                return;
            }
            case 26: {
                this.P0(attributes);
                return;
            }
            case 25: {
                this.f1(attributes);
                return;
            }
            case 24: {
                this.k(attributes);
                return;
            }
            case 22: 
            case 23: {
                this.e = true;
                this.f = object;
                return;
            }
            case 21: {
                this.Y0(attributes);
                return;
            }
            case 20: {
                this.T0(attributes);
                return;
            }
            case 19: {
                this.w(attributes);
                return;
            }
            case 18: {
                this.x(attributes);
                return;
            }
            case 17: {
                this.b1(attributes);
                return;
            }
            case 16: {
                this.k1(attributes);
                return;
            }
            case 15: {
                this.g1(attributes);
                return;
            }
            case 14: {
                this.h1(attributes);
                return;
            }
            case 13: {
                this.d1(attributes);
                return;
            }
            case 12: {
                this.Q0(attributes);
                return;
            }
            case 11: {
                this.R0(attributes);
                return;
            }
            case 10: {
                this.v(attributes);
                return;
            }
            case 9: {
                this.n(attributes);
                return;
            }
            case 8: {
                this.i(attributes);
                return;
            }
            case 7: {
                this.U0(attributes);
                return;
            }
            case 6: {
                this.O0(attributes);
                return;
            }
            case 5: {
                this.i1(attributes);
                return;
            }
            case 4: {
                this.m(attributes);
                return;
            }
            case 2: 
            case 3: {
                this.q(attributes);
                return;
            }
            case 1: 
        }
        this.a1(attributes);
    }

    private void Y(g.R r8, Attributes attributes) throws ax.o4.j {
        for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
            String string = attributes.getValue(i8).trim();
            int n8 = ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()];
            if (n8 != 7) {
                if (n8 != 87) continue;
                r8.p = k.N0(string);
                continue;
            }
            k.w0(r8, string);
        }
    }

    private void Y0(Attributes attributes) throws ax.o4.j {
        this.l("<stop>", new Object[0]);
        g.J j8 = this.b;
        if (j8 != null) {
            if (j8 instanceof g.j) {
                j8 = new g.D();
                ((g.N)((Object)j8)).a = this.a;
                ((g.N)((Object)j8)).b = this.b;
                this.D((g.L)((Object)j8), attributes);
                this.S((g.L)((Object)j8), attributes);
                this.R((g.D)j8, attributes);
                this.b.m((g.N)((Object)j8));
                this.b = j8;
                return;
            }
            throw new ax.o4.j("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private void Z(String string) {
        ax.o4.b b8 = new ax.o4.b(b.f.i0, b.u.q);
        this.a.a(b8.d(string));
    }

    private void Z0(Attributes attributes) throws ax.o4.j {
        this.l("<style>", new Object[0]);
        if (this.b != null) {
            String string = "all";
            boolean bl = true;
            for (int i8 = 0; i8 < attributes.getLength(); ++i8) {
                String string2 = attributes.getValue(i8).trim();
                int n8 = ax.o4.k$a.b[ax.o4.k$g.d(attributes.getLocalName(i8)).ordinal()];
                if (n8 != 88) {
                    if (n8 != 89) continue;
                    string = string2;
                    continue;
                }
                bl = string2.equals("text/css");
            }
            if (bl && ax.o4.b.b(string, b.f.i0)) {
                this.h = true;
                return;
            }
            this.c = true;
            this.d = 1;
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private static g.c a0(String object) {
        if ("auto".equals(object)) {
            return null;
        }
        if (!((String)object).startsWith("rect(")) {
            return null;
        }
        i i8 = new i(((String)object).substring(5));
        i8.A();
        g.p p8 = k.q0(i8);
        i8.z();
        g.p p9 = k.q0(i8);
        i8.z();
        g.p p10 = k.q0(i8);
        i8.z();
        object = k.q0(i8);
        i8.A();
        if (!i8.f(')') && !i8.h()) {
            return null;
        }
        return new g.c(p8, p9, p10, (g.p)object);
    }

    private void a1(Attributes object) throws ax.o4.j {
        this.l("<svg>", new Object[0]);
        g.F f8 = new g.F();
        f8.a = this.a;
        f8.b = this.b;
        this.D(f8, (Attributes)object);
        this.S(f8, (Attributes)object);
        this.C(f8, (Attributes)object);
        this.Y(f8, (Attributes)object);
        this.Q(f8, (Attributes)object);
        object = this.b;
        if (object == null) {
            this.a.t(f8);
        } else {
            object.m(f8);
        }
        this.b = f8;
    }

    private static g.f b0(String string) throws ax.o4.j {
        float f8;
        float f9;
        float f10;
        int n8 = string.charAt(0);
        int n9 = 5;
        if (n8 == 35) {
            Object object = ax.o4.c.b(string, 1, string.length());
            if (object != null) {
                n9 = ((ax.o4.c)object).a();
                if (n9 != 4) {
                    if (n9 != 5) {
                        if (n9 != 7) {
                            if (n9 == 9) {
                                n9 = ((ax.o4.c)object).d();
                                return new g.f(((ax.o4.c)object).d() >>> 8 | n9 << 24);
                            }
                            object = new StringBuilder();
                            ((StringBuilder)object).append("Bad hex colour value: ");
                            ((StringBuilder)object).append(string);
                            throw new ax.o4.j(((StringBuilder)object).toString());
                        }
                        return new g.f(((ax.o4.c)object).d() | 0xFF000000);
                    }
                    int n10 = ((ax.o4.c)object).d();
                    int n11 = 0xF000 & n10;
                    n8 = n10 & 0xF00;
                    n9 = n10 & 0xF0;
                    return new g.f((n10 &= 0xF) << 24 | n10 << 28 | n11 << 8 | n11 << 4 | n8 << 4 | n8 | n9 | n9 >> 4);
                }
                int n12 = ((ax.o4.c)object).d();
                n8 = n12 & 0xF00;
                n9 = n12 & 0xF0;
                return new g.f((n12 &= 0xF) | (n8 << 8 | (0xFF000000 | n8 << 12) | n9 << 8 | n9 << 4 | n12 << 4));
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Bad hex colour value: ");
            ((StringBuilder)object).append(string);
            throw new ax.o4.j(((StringBuilder)object).toString());
        }
        Object object = string.toLowerCase(Locale.US);
        boolean bl = ((String)object).startsWith("rgba(");
        if (!bl && !((String)object).startsWith("rgb(")) {
            float f11;
            bl = ((String)object).startsWith("hsla(");
            if (!bl && !((String)object).startsWith("hsl(")) {
                return k.c0((String)object);
            }
            if (!bl) {
                n9 = 4;
            }
            object = new i(string.substring(n9));
            ((i)object).A();
            float f12 = ((i)object).n();
            float f13 = ((i)object).d(f12);
            if (!Float.isNaN(f13)) {
                ((i)object).f('%');
            }
            if (!Float.isNaN(f11 = ((i)object).d(f13))) {
                ((i)object).f('%');
            }
            if (bl) {
                float f14 = ((i)object).d(f11);
                ((i)object).A();
                if (!Float.isNaN(f14) && ((i)object).f(')')) {
                    return new g.f(k.j(f14 * 256.0f) << 24 | k.s(f12, f13, f11));
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Bad hsla() colour value: ");
                ((StringBuilder)object).append(string);
                throw new ax.o4.j(((StringBuilder)object).toString());
            }
            ((i)object).A();
            if (!Float.isNaN(f11) && ((i)object).f(')')) {
                return new g.f(k.s(f12, f13, f11) | 0xFF000000);
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Bad hsl() colour value: ");
            ((StringBuilder)object).append(string);
            throw new ax.o4.j(((StringBuilder)object).toString());
        }
        if (!bl) {
            n9 = 4;
        }
        object = new i(string.substring(n9));
        ((i)object).A();
        float f15 = f10 = ((i)object).n();
        if (!Float.isNaN(f10)) {
            f15 = f10;
            if (((i)object).f('%')) {
                f15 = f10 * 256.0f / 100.0f;
            }
        }
        f10 = f9 = ((i)object).d(f15);
        if (!Float.isNaN(f9)) {
            f10 = f9;
            if (((i)object).f('%')) {
                f10 = f9 * 256.0f / 100.0f;
            }
        }
        f9 = f8 = ((i)object).d(f10);
        if (!Float.isNaN(f8)) {
            f9 = f8;
            if (((i)object).f('%')) {
                f9 = f8 * 256.0f / 100.0f;
            }
        }
        if (bl) {
            f8 = ((i)object).d(f9);
            ((i)object).A();
            if (!Float.isNaN(f8) && ((i)object).f(')')) {
                return new g.f(k.j(f8 * 256.0f) << 24 | k.j(f15) << 16 | k.j(f10) << 8 | k.j(f9));
            }
            object = new StringBuilder();
            ((StringBuilder)object).append("Bad rgba() colour value: ");
            ((StringBuilder)object).append(string);
            throw new ax.o4.j(((StringBuilder)object).toString());
        }
        ((i)object).A();
        if (!Float.isNaN(f9) && ((i)object).f(')')) {
            return new g.f(k.j(f15) << 16 | 0xFF000000 | k.j(f10) << 8 | k.j(f9));
        }
        object = new StringBuilder();
        ((StringBuilder)object).append("Bad rgb() colour value: ");
        ((StringBuilder)object).append(string);
        throw new ax.o4.j(((StringBuilder)object).toString());
    }

    private void b1(Attributes attributes) throws ax.o4.j {
        this.l("<symbol>", new Object[0]);
        if (this.b != null) {
            g.T t8 = new g.T();
            t8.a = this.a;
            t8.b = this.b;
            this.D(t8, attributes);
            this.S(t8, attributes);
            this.C(t8, attributes);
            this.Y(t8, attributes);
            this.b.m(t8);
            this.b = t8;
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private static g.f c0(String string) throws ax.o4.j {
        Comparable<Integer> comparable = ax.o4.k$c.a(string);
        if (comparable != null) {
            return new g.f((Integer)comparable);
        }
        comparable = new StringBuilder();
        ((StringBuilder)comparable).append("Invalid colour keyword: ");
        ((StringBuilder)comparable).append(string);
        throw new ax.o4.j(((StringBuilder)comparable).toString());
    }

    private void c1(String string) throws ax.o4.j {
        if (!this.c) {
            if (this.e) {
                if (this.g == null) {
                    this.g = new StringBuilder(string.length());
                }
                this.g.append(string);
                return;
            }
            if (this.h) {
                if (this.i == null) {
                    this.i = new StringBuilder(string.length());
                }
                this.i.append(string);
                return;
            }
            if (this.b instanceof g.Y) {
                this.h(string);
            }
        }
    }

    private static g.O d0(String object) {
        object.getClass();
        if (!((String)object).equals("none")) {
            if (!((String)object).equals("currentColor")) {
                try {
                    object = k.b0((String)object);
                    return object;
                }
                catch (ax.o4.j j8) {
                    return null;
                }
            }
            return g.g.b();
        }
        return g.f.d0;
    }

    private void d1(Attributes attributes) throws ax.o4.j {
        this.l("<text>", new Object[0]);
        if (this.b != null) {
            g.W w8 = new g.W();
            w8.a = this.a;
            w8.b = this.b;
            this.D(w8, attributes);
            this.S(w8, attributes);
            this.W(w8, attributes);
            this.C(w8, attributes);
            this.V(w8, attributes);
            this.b.m(w8);
            this.b = w8;
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private static g.E.a e0(String string) {
        if ("nonzero".equals(string)) {
            return g.E.a.q;
        }
        if ("evenodd".equals(string)) {
            return g.E.a.c0;
        }
        return null;
    }

    private void e1(char[] cArray, int n8, int n9) throws ax.o4.j {
        if (!this.c) {
            if (this.e) {
                if (this.g == null) {
                    this.g = new StringBuilder(n9);
                }
                this.g.append(cArray, n8, n9);
                return;
            }
            if (this.h) {
                if (this.i == null) {
                    this.i = new StringBuilder(n9);
                }
                this.i.append(cArray, n8, n9);
                return;
            }
            if (this.b instanceof g.Y) {
                this.h(new String(cArray, n8, n9));
            }
        }
    }

    private static float f0(String string) throws ax.o4.j {
        int n8 = string.length();
        if (n8 != 0) {
            return k.g0(string, 0, n8);
        }
        throw new ax.o4.j("Invalid float value (empty string)");
    }

    private void f1(Attributes object) throws ax.o4.j {
        this.l("<textPath>", new Object[0]);
        if (this.b != null) {
            g.Z z8 = new g.Z();
            z8.a = this.a;
            z8.b = this.b;
            this.D(z8, (Attributes)object);
            this.S(z8, (Attributes)object);
            this.C(z8, (Attributes)object);
            this.U(z8, (Attributes)object);
            this.b.m(z8);
            this.b = z8;
            object = z8.b;
            if (object instanceof g.b0) {
                z8.p((g.b0)object);
                return;
            }
            z8.p(((g.X)object).f());
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private static float g0(String string, int n8, int n9) throws ax.o4.j {
        float f8 = new ax.o4.d().b(string, n8, n9);
        if (!Float.isNaN(f8)) {
            return f8;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid float value: ");
        stringBuilder.append(string);
        throw new ax.o4.j(stringBuilder.toString());
    }

    private void g1(Attributes object) throws ax.o4.j {
        this.l("<tref>", new Object[0]);
        g.J j8 = this.b;
        if (j8 != null) {
            if (j8 instanceof g.Y) {
                j8 = new g.U();
                ((g.N)((Object)j8)).a = this.a;
                ((g.N)((Object)j8)).b = this.b;
                this.D((g.L)((Object)j8), (Attributes)object);
                this.S((g.L)((Object)j8), (Attributes)object);
                this.C((g.G)((Object)j8), (Attributes)object);
                this.T((g.U)j8, (Attributes)object);
                this.b.m((g.N)((Object)j8));
                object = ((g.N)((Object)j8)).b;
                if (object instanceof g.b0) {
                    ((g.U)j8).p((g.b0)object);
                    return;
                }
                ((g.U)j8).p(((g.X)object).f());
                return;
            }
            throw new ax.o4.j("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private void h(String string) throws ax.o4.j {
        g.N n8 = (g.H)this.b;
        int n9 = n8.i.size();
        n8 = n9 == 0 ? null : n8.i.get(n9 - 1);
        if (n8 instanceof g.c0) {
            StringBuilder stringBuilder = new StringBuilder();
            n8 = (g.c0)n8;
            stringBuilder.append(((g.c0)n8).c);
            stringBuilder.append(string);
            ((g.c0)n8).c = stringBuilder.toString();
            return;
        }
        this.b.m(new g.c0(string));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void h0(g.E e8, String object) {
        Object var1_15;
        Object var3_23;
        Object object2;
        Object object3;
        String string;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('|');
        stringBuilder.append((String)object);
        stringBuilder.append('|');
        if (!"|caption|icon|menu|message-box|small-caption|status-bar|".contains(stringBuilder.toString())) {
            return;
        }
        i i8 = new i((String)object);
        Object var1_3 = null;
        Object var3_17 = null;
        String string2 = null;
        while (true) {
            Object var1_9;
            Object var3_18;
            Object var1_4;
            string = i8.s('/');
            i8.A();
            if (string == null) {
                return;
            }
            if (var1_4 != null && var3_18 != null) {
                object3 = var1_4;
                break;
            }
            if (string.equals("normal")) continue;
            object2 = var1_4;
            if (var1_4 == null) {
                Integer n8 = ax.o4.k$e.a(string);
                object2 = n8;
                if (n8 != null) continue;
            }
            void var1_6 = var3_18;
            if (var3_18 == null) {
                g.E.b b8;
                g.E.b b9 = b8 = k.k0(string);
                if (b8 != null) {
                    Object object4 = object2;
                    continue;
                }
            }
            void var3_20 = var1_9;
            object3 = object2;
            if (string2 != null) break;
            void var3_21 = var1_9;
            object3 = object2;
            if (!string.equals("small-caps")) break;
            string2 = string;
            void var3_22 = var1_9;
            Object object5 = object2;
        }
        g.p p8 = k.j0(string);
        if (i8.f('/')) {
            i8.A();
            object2 = i8.r();
            if (object2 != null) {
                try {
                    k.o0((String)object2);
                }
                catch (ax.o4.j j8) {
                    return;
                }
            }
            i8.A();
        }
        e8.p0 = k.i0(i8.y());
        e8.q0 = p8;
        int n9 = object3 == null ? 400 : (Integer)object3;
        e8.r0 = n9;
        void var1_13 = var3_23;
        if (var3_23 == null) {
            g.E.b b10 = g.E.b.q;
        }
        e8.s0 = var1_15;
        e8.q |= 0x1E000L;
    }

    private void h1(Attributes object) throws ax.o4.j {
        this.l("<tspan>", new Object[0]);
        g.J j8 = this.b;
        if (j8 != null) {
            if (j8 instanceof g.Y) {
                j8 = new g.V();
                ((g.N)((Object)j8)).a = this.a;
                ((g.N)((Object)j8)).b = this.b;
                this.D((g.L)((Object)j8), (Attributes)object);
                this.S((g.L)((Object)j8), (Attributes)object);
                this.C((g.G)((Object)j8), (Attributes)object);
                this.V((g.a0)j8, (Attributes)object);
                this.b.m((g.N)((Object)j8));
                this.b = j8;
                object = ((g.N)((Object)j8)).b;
                if (object instanceof g.b0) {
                    ((g.V)j8).p((g.b0)object);
                    return;
                }
                ((g.V)j8).p(((g.X)object).f());
                return;
            }
            throw new ax.o4.j("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private void i(Attributes attributes) throws ax.o4.j {
        this.l("<circle>", new Object[0]);
        if (this.b != null) {
            g.d d8 = new g.d();
            d8.a = this.a;
            d8.b = this.b;
            this.D(d8, attributes);
            this.S(d8, attributes);
            this.W(d8, attributes);
            this.C(d8, attributes);
            this.A(d8, attributes);
            this.b.m(d8);
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private static List<String> i0(String string) {
        Object object;
        i i8 = new i(string);
        Object object2 = null;
        do {
            object = i8.q();
            string = object;
            if (object == null) {
                string = i8.u(',');
            }
            if (string == null) {
                return object2;
            }
            object = object2;
            if (object2 == null) {
                object = new ArrayList();
            }
            object.add(string);
            i8.z();
            object2 = object;
        } while (!i8.h());
        return object;
    }

    private void i1(Attributes attributes) throws ax.o4.j {
        this.l("<use>", new Object[0]);
        if (this.b != null) {
            g.e0 e02 = new g.e0();
            e02.a = this.a;
            e02.b = this.b;
            this.D(e02, attributes);
            this.S(e02, attributes);
            this.W(e02, attributes);
            this.C(e02, attributes);
            this.X(e02, attributes);
            this.b.m(e02);
            this.b = e02;
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private static int j(float f8) {
        if (f8 < 0.0f) {
            return 0;
        }
        if (f8 > 255.0f) {
            return 255;
        }
        return Math.round(f8);
    }

    private static g.p j0(String object) {
        g.p p8;
        block3: {
            try {
                p8 = ax.o4.k$d.a((String)object);
                if (p8 != null) break block3;
            }
            catch (ax.o4.j j8) {
                return null;
            }
            object = k.o0((String)object);
            return object;
        }
        return p8;
    }

    private void j1(Attributes attributes) throws ax.o4.j {
        this.l("<view>", new Object[0]);
        if (this.b != null) {
            g.f0 f02 = new g.f0();
            f02.a = this.a;
            f02.b = this.b;
            this.D(f02, attributes);
            this.C(f02, attributes);
            this.Y(f02, attributes);
            this.b.m(f02);
            this.b = f02;
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private void k(Attributes attributes) throws ax.o4.j {
        this.l("<clipPath>", new Object[0]);
        if (this.b != null) {
            g.e e8 = new g.e();
            e8.a = this.a;
            e8.b = this.b;
            this.D(e8, attributes);
            this.S(e8, attributes);
            this.W(e8, attributes);
            this.C(e8, attributes);
            this.B(e8, attributes);
            this.b.m(e8);
            this.b = e8;
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private static g.E.b k0(String string) {
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case -1039745817: {
                if (!string.equals("normal")) break;
                n8 = 2;
                break;
            }
            case -1178781136: {
                if (!string.equals("italic")) break;
                n8 = 1;
                break;
            }
            case -1657669071: {
                if (!string.equals("oblique")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return null;
            }
            case 2: {
                return g.E.b.q;
            }
            case 1: {
                return g.E.b.c0;
            }
            case 0: 
        }
        return g.E.b.d0;
    }

    private void k1(Attributes attributes) throws ax.o4.j {
        this.l("<switch>", new Object[0]);
        if (this.b != null) {
            g.S s8 = new g.S();
            s8.a = this.a;
            s8.b = this.b;
            this.D(s8, attributes);
            this.S(s8, attributes);
            this.W(s8, attributes);
            this.C(s8, attributes);
            this.b.m(s8);
            this.b = s8;
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private void l(String string, Object ... objectArray) {
    }

    private static Integer l0(String string) {
        return ax.o4.k$e.a(string);
    }

    private void m(Attributes attributes) throws ax.o4.j {
        this.l("<defs>", new Object[0]);
        if (this.b != null) {
            g.h h8 = new g.h();
            h8.a = this.a;
            h8.b = this.b;
            this.D(h8, attributes);
            this.S(h8, attributes);
            this.W(h8, attributes);
            this.b.m(h8);
            this.b = h8;
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private static String m0(String string, String string2) {
        if (string.equals("none")) {
            return null;
        }
        if (!string.startsWith("url(")) {
            return null;
        }
        if (string.endsWith(")")) {
            return string.substring(4, string.length() - 1).trim();
        }
        return string.substring(4).trim();
    }

    private void n(Attributes attributes) throws ax.o4.j {
        this.l("<ellipse>", new Object[0]);
        if (this.b != null) {
            g.i i8 = new g.i();
            i8.a = this.a;
            i8.b = this.b;
            this.D(i8, attributes);
            this.S(i8, attributes);
            this.W(i8, attributes);
            this.C(i8, attributes);
            this.E(i8, attributes);
            this.b.m(i8);
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private Float n0(String string) throws ax.o4.j {
        if (string.length() != 0) {
            float f8;
            float f9;
            block8: {
                int n8 = string.length();
                int n9 = string.length();
                boolean bl = true;
                if (string.charAt(n9 - 1) == '%') {
                    --n8;
                } else {
                    bl = false;
                }
                try {
                    float f10 = k.g0(string, 0, n8);
                    f9 = 100.0f;
                    f8 = f10;
                    if (!bl) break block8;
                    f8 = f10 / 100.0f;
                }
                catch (NumberFormatException numberFormatException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Invalid offset value in <stop>: ");
                    stringBuilder.append(string);
                    throw new ax.o4.j(stringBuilder.toString(), numberFormatException);
                }
            }
            if (f8 < 0.0f) {
                f8 = 0.0f;
            } else if (f8 > 100.0f) {
                f8 = f9;
            }
            return Float.valueOf(f8);
        }
        throw new ax.o4.j("Invalid offset value in <stop> (empty string)");
    }

    private void o() {
    }

    static g.p o0(String string) throws ax.o4.j {
        if (string.length() != 0) {
            Object object;
            int n8;
            int n9 = string.length();
            Object object2 = g.d0.q;
            char c8 = string.charAt(n9 - 1);
            if (c8 == '%') {
                n8 = n9 - 1;
                object = g.d0.j0;
            } else {
                n8 = n9;
                object = object2;
                if (n9 > 2) {
                    n8 = n9;
                    object = object2;
                    if (Character.isLetter(c8)) {
                        n8 = n9;
                        object = object2;
                        if (Character.isLetter(string.charAt(n9 - 2))) {
                            n8 = n9 - 2;
                            object = string.substring(n8);
                            try {
                                object = g.d0.valueOf(((String)object).toLowerCase(Locale.US));
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Invalid length unit specifier: ");
                                stringBuilder.append(string);
                                throw new ax.o4.j(stringBuilder.toString());
                            }
                        }
                    }
                }
            }
            try {
                object = new g.p(k.g0(string, 0, n8), (g.d0)((Object)object));
                return object;
            }
            catch (NumberFormatException numberFormatException) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append("Invalid length value: ");
                ((StringBuilder)object2).append(string);
                throw new ax.o4.j(((StringBuilder)object2).toString(), numberFormatException);
            }
        }
        throw new ax.o4.j("Invalid length value (empty string)");
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void p(String charSequence, String object, String string) throws ax.o4.j {
        String var2_4;
        int n8;
        if (this.c) {
            this.d = n8 = this.d - 1;
            if (n8 == 0) {
                this.c = false;
                return;
            }
        }
        if (!"http://www.w3.org/2000/svg".equals(charSequence) && !"".equals(charSequence)) return;
        if (((String)object).length() <= 0) {
            Object var3_6;
            void var2_3 = var3_6;
        }
        n8 = ax.o4.k$a.a[ax.o4.k$h.d((String)var2_4).ordinal()];
        if (n8 != 1 && n8 != 2 && n8 != 4 && n8 != 5 && n8 != 13 && n8 != 14) {
            switch (n8) {
                default: {
                    return;
                }
                case 30: {
                    charSequence = this.i;
                    if (charSequence == null) return;
                    this.h = false;
                    this.Z(((StringBuilder)charSequence).toString());
                    this.i.setLength(0);
                    return;
                }
                case 22: 
                case 23: {
                    this.e = false;
                    charSequence = this.g;
                    if (charSequence == null) return;
                    h h8 = this.f;
                    if (h8 == ax.o4.k$h.B0) {
                        this.a.u(((StringBuilder)charSequence).toString());
                    } else if (h8 == ax.o4.k$h.g0) {
                        this.a.s(((StringBuilder)charSequence).toString());
                    }
                    this.g.setLength(0);
                    return;
                }
                case 16: 
                case 17: 
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 31: 
            }
        }
        this.b = ((g.N)((Object)this.b)).b;
    }

    private static List<g.p> p0(String object) throws ax.o4.j {
        if (((String)object).length() != 0) {
            ArrayList<g.p> arrayList = new ArrayList<g.p>(1);
            i i8 = new i((String)object);
            i8.A();
            while (!i8.h()) {
                float f8 = i8.n();
                if (!Float.isNaN(f8)) {
                    g.d0 d02 = i8.v();
                    object = d02;
                    if (d02 == null) {
                        object = g.d0.q;
                    }
                    arrayList.add(new g.p(f8, (g.d0)((Object)object)));
                    i8.z();
                    continue;
                }
                object = new StringBuilder();
                ((StringBuilder)object).append("Invalid length list value: ");
                ((StringBuilder)object).append(i8.b());
                throw new ax.o4.j(((StringBuilder)object).toString());
            }
            return arrayList;
        }
        throw new ax.o4.j("Invalid length list (empty string)");
    }

    private void q(Attributes attributes) throws ax.o4.j {
        this.l("<g>", new Object[0]);
        if (this.b != null) {
            g.m m8 = new g.m();
            m8.a = this.a;
            m8.b = this.b;
            this.D(m8, attributes);
            this.S(m8, attributes);
            this.W(m8, attributes);
            this.C(m8, attributes);
            this.b.m(m8);
            this.b = m8;
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private static g.p q0(i i8) {
        if (i8.g("auto")) {
            return new g.p(0.0f);
        }
        return i8.p();
    }

    private void r(String string, Map<String, String> map) {
        if (string.equals("xml-stylesheet")) {
            ax.o4.g.k();
        }
    }

    private static Float r0(String string) {
        float f8;
        float f9;
        try {
            f9 = k.f0(string);
        }
        catch (ax.o4.j j8) {
            return null;
        }
        if (f9 < 0.0f) {
            f8 = 0.0f;
        } else {
            f8 = f9;
            if (f9 > 1.0f) {
                f8 = 1.0f;
            }
        }
        return Float.valueOf(f8);
    }

    private static int s(float f8, float f9, float f10) {
        float f11 = 0.0f;
        float f12 = f8 % 360.0f;
        f8 = f8 >= 0.0f ? f12 : f12 + 360.0f;
        float f13 = f8 / 60.0f;
        f12 = f9 / 100.0f;
        f9 = f10 / 100.0f;
        if (f12 < 0.0f) {
            f8 = 0.0f;
        } else {
            f8 = f12;
            if (f12 > 1.0f) {
                f8 = 1.0f;
            }
        }
        if (f9 < 0.0f) {
            f9 = f11;
        } else if (f9 > 1.0f) {
            f9 = 1.0f;
        }
        f8 = f9 <= 0.5f ? (f8 + 1.0f) * f9 : f9 + f8 - f8 * f9;
        f11 = f9 * 2.0f - f8;
        f10 = k.t(f11, f8, f13 + 2.0f);
        f9 = k.t(f11, f8, f13);
        f8 = k.t(f11, f8, f13 - 2.0f);
        int n8 = k.j(f10 * 256.0f);
        int n9 = k.j(f9 * 256.0f);
        return k.j(f8 * 256.0f) | (n8 << 16 | n9 << 8);
    }

    private static Boolean s0(String string) {
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 466743410: {
                if (!string.equals("visible")) break;
                n8 = 3;
                break;
            }
            case 3005871: {
                if (!string.equals("auto")) break;
                n8 = 2;
                break;
            }
            case -907680051: {
                if (!string.equals("scroll")) break;
                n8 = 1;
                break;
            }
            case -1217487446: {
                if (!string.equals("hidden")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return null;
            }
            case 2: 
            case 3: {
                return Boolean.TRUE;
            }
            case 0: 
            case 1: 
        }
        return Boolean.FALSE;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static float t(float f8, float f9, float f10) {
        float f11 = f10;
        if (f10 < 0.0f) {
            f11 = f10 + 6.0f;
        }
        f10 = f11;
        if (f11 >= 6.0f) {
            f10 = f11 - 6.0f;
        }
        if (f10 < 1.0f) {
            f9 = (f9 - f8) * f10;
            return f9 + f8;
        }
        if (f10 < 3.0f) {
            return f9;
        }
        if (!(f10 < 4.0f)) return f8;
        f9 = (f9 - f8) * (4.0f - f10);
        return f9 + f8;
    }

    private static g.O t0(String object) {
        if (((String)object).startsWith("url(")) {
            int n8 = ((String)object).indexOf(")");
            Object var2_2 = null;
            if (n8 != -1) {
                String string = ((String)object).substring(4, n8).trim();
                String string2 = ((String)object).substring(n8 + 1).trim();
                object = var2_2;
                if (string2.length() > 0) {
                    object = k.d0(string2);
                }
                return new g.u(string, (g.O)object);
            }
            return new g.u(((String)object).substring(4).trim(), null);
        }
        return k.d0((String)object);
    }

    private void u(Attributes attributes) throws ax.o4.j {
        this.l("<image>", new Object[0]);
        if (this.b != null) {
            g.o o8 = new g.o();
            o8.a = this.a;
            o8.b = this.b;
            this.D(o8, attributes);
            this.S(o8, attributes);
            this.W(o8, attributes);
            this.C(o8, attributes);
            this.G(o8, attributes);
            this.b.m(o8);
            this.b = o8;
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    /*
     * Unable to fully structure code
     */
    private static g.w u0(String var0) {
        var19_1 = new i((String)var0);
        var0 = new g.w();
        if (var19_1.h() || (var17_2 = var19_1.l().intValue()) != 77 && var17_2 != 109) ** GOTO lbl278
        var1_3 = 0.0f;
        var2_4 = 0.0f;
        var9_5 = 0.0f;
        var10_6 = 0.0f;
        var6_7 = 0.0f;
        var5_8 = 0.0f;
        block12: while (true) {
            block40: {
                block39: {
                    var19_1.A();
                    var18_19 = 108;
                    block0 : switch (var17_2) {
                        default: {
                            break block39;
                        }
                        case 90: 
                        case 122: {
                            var0.close();
                            var2_4 = var3_9 = var6_7;
                            var1_3 = var5_8;
lbl20:
                            // 2 sources

                            while (true) {
                                var4_10 = var1_3;
                                var7_11 = var1_3;
                                var1_3 = var3_9;
lbl24:
                                // 2 sources

                                while (true) {
                                    var3_9 = var7_11;
                                    break block0;
                                    break;
                                }
                                break;
                            }
                        }
                        case 86: 
                        case 118: {
                            var4_10 = var19_1.n();
                            if (Float.isNaN(var4_10)) {
                                var19_1 = new StringBuilder();
                                var19_1.append("Bad path coords for ");
                                var19_1.append((char)var17_2);
                                var19_1.append(" path segment");
                                Log.e((String)"SVGParser", (String)var19_1.toString());
                                return var0;
                            }
                            var3_9 = var4_10;
                            if (var17_2 == 118) {
                                var3_9 = var4_10 + var9_5;
                            }
                            var4_10 = var3_9;
                            var0.e(var1_3, var4_10);
                            var3_9 = var1_3;
                            var1_3 = var4_10;
                            ** continue;
                        }
                        case 84: 
                        case 116: {
                            var8_12 = var1_3 * 2.0f - var2_4;
                            var4_10 = 2.0f * var9_5 - var10_6;
                            var10_6 = var19_1.n();
                            var7_11 = var19_1.d(var10_6);
                            if (Float.isNaN(var7_11)) {
                                var19_1 = new StringBuilder();
                                var19_1.append("Bad path coords for ");
                                var19_1.append((char)var17_2);
                                var19_1.append(" path segment");
                                Log.e((String)"SVGParser", (String)var19_1.toString());
                                return var0;
                            }
                            var3_9 = var10_6;
                            var2_4 = var7_11;
                            if (var17_2 == 116) {
                                var3_9 = var10_6 + var1_3;
                                var2_4 = var7_11 + var9_5;
                            }
                            var1_3 = var3_9;
                            var7_11 = var2_4;
                            var0.a(var8_12, var4_10, var1_3, var7_11);
                            var2_4 = var8_12;
                            ** continue;
                        }
                        case 83: 
                        case 115: {
                            var12_14 = var19_1.n();
                            var11_13 = var19_1.d(var12_14);
                            var14_16 = var19_1.d(var11_13);
                            var13_15 = var19_1.d(var14_16);
                            if (Float.isNaN(var13_15)) {
                                var19_1 = new StringBuilder();
                                var19_1.append("Bad path coords for ");
                                var19_1.append((char)var17_2);
                                var19_1.append(" path segment");
                                Log.e((String)"SVGParser", (String)var19_1.toString());
                                return var0;
                            }
                            var8_12 = var12_14;
                            var7_11 = var11_13;
                            var4_10 = var14_16;
                            var3_9 = var13_15;
                            if (var17_2 == 115) {
                                var4_10 = var14_16 + var1_3;
                                var3_9 = var13_15 + var9_5;
                                var8_12 = var12_14 + var1_3;
                                var7_11 = var11_13 + var9_5;
                            }
                            var0.c(var1_3 * 2.0f - var2_4, 2.0f * var9_5 - var10_6, var8_12, var7_11, var4_10, var3_9);
                            var1_3 = var3_9;
                            var2_4 = var4_10;
                            var4_10 = var7_11;
                            var3_9 = var8_12;
lbl104:
                            // 2 sources

                            while (true) {
                                var7_11 = var1_3;
                                var1_3 = var2_4;
                                var2_4 = var3_9;
                                var3_9 = var7_11;
                                break block0;
                                break;
                            }
                        }
                        case 81: 
                        case 113: {
                            var10_6 = var19_1.n();
                            var8_12 = var19_1.d(var10_6);
                            var12_14 = var19_1.d(var8_12);
                            var11_13 = var19_1.d(var12_14);
                            if (Float.isNaN(var11_13)) {
                                var19_1 = new StringBuilder();
                                var19_1.append("Bad path coords for ");
                                var19_1.append((char)var17_2);
                                var19_1.append(" path segment");
                                Log.e((String)"SVGParser", (String)var19_1.toString());
                                return var0;
                            }
                            var3_9 = var10_6;
                            var4_10 = var8_12;
                            var7_11 = var12_14;
                            var2_4 = var11_13;
                            if (var17_2 == 113) {
                                var7_11 = var12_14 + var1_3;
                                var2_4 = var11_13 + var9_5;
                                var3_9 = var10_6 + var1_3;
                                var4_10 = var8_12 + var9_5;
                            }
                            var1_3 = var7_11;
                            var7_11 = var2_4;
                            var0.a(var3_9, var4_10, var1_3, var7_11);
                            var2_4 = var3_9;
                            var3_9 = var7_11;
                            break;
                        }
                        case 77: 
                        case 109: {
                            var5_8 = var19_1.n();
                            var4_10 = var19_1.d(var5_8);
                            if (Float.isNaN(var4_10)) {
                                var19_1 = new StringBuilder();
                                var19_1.append("Bad path coords for ");
                                var19_1.append((char)var17_2);
                                var19_1.append(" path segment");
                                Log.e((String)"SVGParser", (String)var19_1.toString());
                                return var0;
                            }
                            var2_4 = var5_8;
                            var3_9 = var4_10;
                            if (var17_2 == 109) {
                                var2_4 = var5_8;
                                var3_9 = var4_10;
                                if (!var0.i()) {
                                    var2_4 = var5_8 + var1_3;
                                    var3_9 = var4_10 + var9_5;
                                }
                            }
                            var1_3 = var2_4;
                            var0.b(var1_3, var3_9);
                            var17_2 = var17_2 == 109 ? var18_19 : 76;
                            var6_7 = var2_4 = var1_3;
                            var5_8 = var4_10 = var3_9;
                            break;
                        }
                        case 76: 
                        case 108: {
                            var7_11 = var19_1.n();
                            var4_10 = var19_1.d(var7_11);
                            if (Float.isNaN(var4_10)) {
                                var19_1 = new StringBuilder();
                                var19_1.append("Bad path coords for ");
                                var19_1.append((char)var17_2);
                                var19_1.append(" path segment");
                                Log.e((String)"SVGParser", (String)var19_1.toString());
                                return var0;
                            }
                            var3_9 = var7_11;
                            var2_4 = var4_10;
                            if (var17_2 == 108) {
                                var3_9 = var7_11 + var1_3;
                                var2_4 = var4_10 + var9_5;
                            }
                            var1_3 = var3_9;
                            var3_9 = var2_4;
                            var0.e(var1_3, var3_9);
                            var2_4 = var1_3;
lbl192:
                            // 2 sources

                            while (true) {
                                var4_10 = var3_9;
                                break block0;
                                break;
                            }
                        }
                        case 72: 
                        case 104: {
                            var3_9 = var19_1.n();
                            if (Float.isNaN(var3_9)) {
                                var19_1 = new StringBuilder();
                                var19_1.append("Bad path coords for ");
                                var19_1.append((char)var17_2);
                                var19_1.append(" path segment");
                                Log.e((String)"SVGParser", (String)var19_1.toString());
                                return var0;
                            }
                            var2_4 = var3_9;
                            if (var17_2 == 104) {
                                var2_4 = var3_9 + var1_3;
                            }
                            var1_3 = var2_4;
                            var0.e(var1_3, var9_5);
                            var2_4 = var1_3;
                            var3_9 = var9_5;
                            var4_10 = var10_6;
                            break;
                        }
                        case 67: 
                        case 99: {
                            var14_16 = var19_1.n();
                            var13_15 = var19_1.d(var14_16);
                            var12_14 = var19_1.d(var13_15);
                            var11_13 = var19_1.d(var12_14);
                            var16_18 = var19_1.d(var11_13);
                            var15_17 = var19_1.d(var16_18);
                            if (Float.isNaN(var15_17)) {
                                var19_1 = new StringBuilder();
                                var19_1.append("Bad path coords for ");
                                var19_1.append((char)var17_2);
                                var19_1.append(" path segment");
                                Log.e((String)"SVGParser", (String)var19_1.toString());
                                return var0;
                            }
                            var10_6 = var14_16;
                            var8_12 = var13_15;
                            var7_11 = var12_14;
                            var4_10 = var11_13;
                            var3_9 = var16_18;
                            var2_4 = var15_17;
                            if (var17_2 == 99) {
                                var3_9 = var16_18 + var1_3;
                                var2_4 = var15_17 + var9_5;
                                var10_6 = var14_16 + var1_3;
                                var8_12 = var13_15 + var9_5;
                                var7_11 = var12_14 + var1_3;
                                var4_10 = var11_13 + var9_5;
                            }
                            var9_5 = var7_11;
                            var7_11 = var3_9;
                            var1_3 = var2_4;
                            var0.c(var10_6, var8_12, var9_5, var4_10, var7_11, var1_3);
                            var3_9 = var9_5;
                            var2_4 = var7_11;
                            ** continue;
                        }
                        case 65: 
                        case 97: {
                            var11_13 = var19_1.n();
                            var10_6 = var19_1.d(var11_13);
                            var8_12 = var19_1.d(var10_6);
                            var20_20 = var19_1.c(Float.valueOf(var8_12));
                            var21_21 = var19_1.c(var20_20);
                            var7_11 = var19_1.e(var21_21);
                            var4_10 = var19_1.d(var7_11);
                            if (Float.isNaN(var4_10) || var11_13 < 0.0f || var10_6 < 0.0f) break block12;
                            var3_9 = var7_11;
                            var2_4 = var4_10;
                            if (var17_2 == 97) {
                                var3_9 = var7_11 + var1_3;
                                var2_4 = var4_10 + var9_5;
                            }
                            var0.d(var11_13, var10_6, var8_12, var20_20, var21_21, var3_9, var2_4);
                            var3_9 = var1_3 = var3_9;
                            var4_10 = var2_4;
                            var2_4 = var3_9;
                            var3_9 = var4_10;
                            ** continue;
                        }
                    }
                    var19_1.z();
                    if (!var19_1.h()) break block40;
                }
                return var0;
            }
            if (var19_1.i()) {
                var17_2 = var19_1.l();
            }
            var9_5 = var3_9;
            var10_6 = var4_10;
        }
        var19_1 = new StringBuilder();
        var19_1.append("Bad path coords for ");
        var19_1.append((char)var17_2);
        var19_1.append(" path segment");
        Log.e((String)"SVGParser", (String)var19_1.toString());
        return var0;
    }

    private void v(Attributes attributes) throws ax.o4.j {
        this.l("<line>", new Object[0]);
        if (this.b != null) {
            g.q q8 = new g.q();
            q8.a = this.a;
            q8.b = this.b;
            this.D(q8, attributes);
            this.S(q8, attributes);
            this.W(q8, attributes);
            this.C(q8, attributes);
            this.H(q8, attributes);
            this.b.m(q8);
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    static ax.o4.e v0(String object) throws ax.o4.j {
        e.b var0_4;
        i i8 = new i((String)object);
        i8.A();
        String string = i8.r();
        Object object2 = string;
        if ("defer".equals(string)) {
            i8.A();
            object2 = i8.r();
        }
        object2 = ax.o4.k$b.a((String)object2);
        i8.A();
        if (i8.h()) return new ax.o4.e((e.a)((Object)object2), (e.b)var0_4);
        string = i8.r();
        string.getClass();
        if (string.equals("meet")) {
            e.b b8 = e.b.q;
            return new ax.o4.e((e.a)((Object)object2), (e.b)var0_4);
        }
        if (string.equals("slice")) {
            e.b b9 = e.b.c0;
            return new ax.o4.e((e.a)((Object)object2), (e.b)var0_4);
        }
        object2 = new StringBuilder();
        ((StringBuilder)object2).append("Invalid preserveAspectRatio definition: ");
        ((StringBuilder)object2).append((String)object);
        throw new ax.o4.j(((StringBuilder)object2).toString());
    }

    private void w(Attributes attributes) throws ax.o4.j {
        this.l("<linearGradient>", new Object[0]);
        if (this.b != null) {
            g.M m8 = new g.M();
            m8.a = this.a;
            m8.b = this.b;
            this.D(m8, attributes);
            this.S(m8, attributes);
            this.F(m8, attributes);
            this.I(m8, attributes);
            this.b.m(m8);
            this.b = m8;
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private static void w0(g.P p8, String string) throws ax.o4.j {
        p8.o = k.v0(string);
    }

    private void x(Attributes attributes) throws ax.o4.j {
        this.l("<marker>", new Object[0]);
        if (this.b != null) {
            g.r r8 = new g.r();
            r8.a = this.a;
            r8.b = this.b;
            this.D(r8, attributes);
            this.S(r8, attributes);
            this.C(r8, attributes);
            this.Y(r8, attributes);
            this.J(r8, attributes);
            this.b.m(r8);
            this.b = r8;
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private Map<String, String> x0(i i8) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        i8.A();
        String string = i8.s('=');
        while (string != null) {
            i8.f('=');
            hashMap.put(string, i8.q());
            i8.A();
            string = i8.s('=');
        }
        return hashMap;
    }

    private void y(Attributes attributes) throws ax.o4.j {
        this.l("<mask>", new Object[0]);
        if (this.b != null) {
            g.s s8 = new g.s();
            s8.a = this.a;
            s8.b = this.b;
            this.D(s8, attributes);
            this.S(s8, attributes);
            this.C(s8, attributes);
            this.K(s8, attributes);
            this.b.m(s8);
            this.b = s8;
            return;
        }
        throw new ax.o4.j("Invalid document. Root element must be <svg>");
    }

    private static g.E.e y0(String string) {
        string.getClass();
        int n8 = -1;
        switch (string.hashCode()) {
            default: {
                break;
            }
            case 362741610: {
                if (!string.equals("optimizeSpeed")) break;
                n8 = 2;
                break;
            }
            case 3005871: {
                if (!string.equals("auto")) break;
                n8 = 1;
                break;
            }
            case -933002398: {
                if (!string.equals("optimizeQuality")) break;
                n8 = 0;
            }
        }
        switch (n8) {
            default: {
                return null;
            }
            case 2: {
                return g.E.e.d0;
            }
            case 1: {
                return g.E.e.q;
            }
            case 0: 
        }
        return g.E.e.c0;
    }

    private static Set<String> z0(String object) {
        i i8 = new i((String)object);
        object = new HashSet();
        while (!i8.h()) {
            String string = i8.r();
            if (string.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                ((HashSet)object).add(string.substring(35));
            } else {
                ((HashSet)object).add("UNSUPPORTED");
            }
            i8.A();
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    ax.o4.g z(InputStream inputStream, boolean bl) throws ax.o4.j {
        InputStream inputStream2 = inputStream;
        if (!inputStream.markSupported()) {
            inputStream2 = new BufferedInputStream(inputStream);
        }
        try {
            inputStream2.mark(3);
            int n8 = inputStream2.read();
            int n9 = inputStream2.read();
            inputStream2.reset();
            inputStream = inputStream2;
            if (n8 + (n9 << 8) == 35615) {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(inputStream2);
                inputStream = new BufferedInputStream(gZIPInputStream);
            }
        }
        catch (IOException iOException) {
            inputStream = inputStream2;
        }
        try {
            inputStream.mark(4096);
            this.L0(inputStream, bl);
            return this.a;
        }
        finally {
            try {
                inputStream.close();
            }
            catch (IOException iOException) {
                Log.e((String)"SVGParser", (String)"Exception thrown closing input stream");
            }
        }
    }

    private static class b {
        private static final Map<String, e.a> a;

        static {
            HashMap<String, e.a> hashMap = new HashMap<String, e.a>(10);
            a = hashMap;
            hashMap.put("none", e.a.q);
            hashMap.put("xMinYMin", e.a.c0);
            hashMap.put("xMidYMin", e.a.d0);
            hashMap.put("xMaxYMin", e.a.e0);
            hashMap.put("xMinYMid", e.a.f0);
            hashMap.put("xMidYMid", e.a.g0);
            hashMap.put("xMaxYMid", e.a.h0);
            hashMap.put("xMinYMax", e.a.i0);
            hashMap.put("xMidYMax", e.a.j0);
            hashMap.put("xMaxYMax", e.a.k0);
        }

        static e.a a(String string) {
            return a.get(string);
        }
    }

    private static class c {
        private static final Map<String, Integer> a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<String, Integer>(47);
            a = hashMap;
            hashMap.put("aliceblue", -984833);
            hashMap.put("antiquewhite", -332841);
            Integer n8 = -16711681;
            hashMap.put("aqua", n8);
            hashMap.put("aquamarine", -8388652);
            hashMap.put("azure", -983041);
            hashMap.put("beige", -657956);
            hashMap.put("bisque", -6972);
            hashMap.put("black", -16777216);
            hashMap.put("blanchedalmond", -5171);
            hashMap.put("blue", -16776961);
            hashMap.put("blueviolet", -7722014);
            hashMap.put("brown", -5952982);
            hashMap.put("burlywood", -2180985);
            hashMap.put("cadetblue", -10510688);
            hashMap.put("chartreuse", -8388864);
            hashMap.put("chocolate", -2987746);
            hashMap.put("coral", -32944);
            hashMap.put("cornflowerblue", -10185235);
            hashMap.put("cornsilk", -1828);
            hashMap.put("crimson", -2354116);
            hashMap.put("cyan", n8);
            hashMap.put("darkblue", -16777077);
            hashMap.put("darkcyan", -16741493);
            hashMap.put("darkgoldenrod", -4684277);
            n8 = -5658199;
            hashMap.put("darkgray", n8);
            hashMap.put("darkgreen", -16751616);
            hashMap.put("darkgrey", n8);
            hashMap.put("darkkhaki", -4343957);
            hashMap.put("darkmagenta", -7667573);
            hashMap.put("darkolivegreen", -11179217);
            hashMap.put("darkorange", -29696);
            hashMap.put("darkorchid", -6737204);
            hashMap.put("darkred", -7667712);
            hashMap.put("darksalmon", -1468806);
            hashMap.put("darkseagreen", -7357297);
            hashMap.put("darkslateblue", -12042869);
            n8 = -13676721;
            hashMap.put("darkslategray", n8);
            hashMap.put("darkslategrey", n8);
            hashMap.put("darkturquoise", -16724271);
            hashMap.put("darkviolet", -7077677);
            hashMap.put("deeppink", -60269);
            hashMap.put("deepskyblue", -16728065);
            n8 = -9868951;
            hashMap.put("dimgray", n8);
            hashMap.put("dimgrey", n8);
            hashMap.put("dodgerblue", -14774017);
            hashMap.put("firebrick", -5103070);
            hashMap.put("floralwhite", -1296);
            hashMap.put("forestgreen", -14513374);
            n8 = -65281;
            hashMap.put("fuchsia", n8);
            hashMap.put("gainsboro", -2302756);
            hashMap.put("ghostwhite", -460545);
            hashMap.put("gold", -10496);
            hashMap.put("goldenrod", -2448096);
            Integer n9 = -8355712;
            hashMap.put("gray", n9);
            hashMap.put("green", -16744448);
            hashMap.put("greenyellow", -5374161);
            hashMap.put("grey", n9);
            hashMap.put("honeydew", -983056);
            hashMap.put("hotpink", -38476);
            hashMap.put("indianred", -3318692);
            hashMap.put("indigo", -11861886);
            hashMap.put("ivory", -16);
            hashMap.put("khaki", -989556);
            hashMap.put("lavender", -1644806);
            hashMap.put("lavenderblush", -3851);
            hashMap.put("lawngreen", -8586240);
            hashMap.put("lemonchiffon", -1331);
            hashMap.put("lightblue", -5383962);
            hashMap.put("lightcoral", -1015680);
            hashMap.put("lightcyan", -2031617);
            hashMap.put("lightgoldenrodyellow", -329006);
            n9 = -2894893;
            hashMap.put("lightgray", n9);
            hashMap.put("lightgreen", -7278960);
            hashMap.put("lightgrey", n9);
            hashMap.put("lightpink", -18751);
            hashMap.put("lightsalmon", -24454);
            hashMap.put("lightseagreen", -14634326);
            hashMap.put("lightskyblue", -7876870);
            n9 = -8943463;
            hashMap.put("lightslategray", n9);
            hashMap.put("lightslategrey", n9);
            hashMap.put("lightsteelblue", -5192482);
            hashMap.put("lightyellow", -32);
            hashMap.put("lime", -16711936);
            hashMap.put("limegreen", -13447886);
            hashMap.put("linen", -331546);
            hashMap.put("magenta", n8);
            hashMap.put("maroon", -8388608);
            hashMap.put("mediumaquamarine", -10039894);
            hashMap.put("mediumblue", -16777011);
            hashMap.put("mediumorchid", -4565549);
            hashMap.put("mediumpurple", -7114533);
            hashMap.put("mediumseagreen", -12799119);
            hashMap.put("mediumslateblue", -8689426);
            hashMap.put("mediumspringgreen", -16713062);
            hashMap.put("mediumturquoise", -12004916);
            hashMap.put("mediumvioletred", -3730043);
            hashMap.put("midnightblue", -15132304);
            hashMap.put("mintcream", -655366);
            hashMap.put("mistyrose", -6943);
            hashMap.put("moccasin", -6987);
            hashMap.put("navajowhite", -8531);
            hashMap.put("navy", -16777088);
            hashMap.put("oldlace", -133658);
            hashMap.put("olive", -8355840);
            hashMap.put("olivedrab", -9728477);
            hashMap.put("orange", -23296);
            hashMap.put("orangered", -47872);
            hashMap.put("orchid", -2461482);
            hashMap.put("palegoldenrod", -1120086);
            hashMap.put("palegreen", -6751336);
            hashMap.put("paleturquoise", -5247250);
            hashMap.put("palevioletred", -2396013);
            hashMap.put("papayawhip", -4139);
            hashMap.put("peachpuff", -9543);
            hashMap.put("peru", -3308225);
            hashMap.put("pink", -16181);
            hashMap.put("plum", -2252579);
            hashMap.put("powderblue", -5185306);
            hashMap.put("purple", -8388480);
            hashMap.put("rebeccapurple", -10079335);
            hashMap.put("red", -65536);
            hashMap.put("rosybrown", -4419697);
            hashMap.put("royalblue", -12490271);
            hashMap.put("saddlebrown", -7650029);
            hashMap.put("salmon", -360334);
            hashMap.put("sandybrown", -744352);
            hashMap.put("seagreen", -13726889);
            hashMap.put("seashell", -2578);
            hashMap.put("sienna", -6270419);
            hashMap.put("silver", -4144960);
            hashMap.put("skyblue", -7876885);
            hashMap.put("slateblue", -9807155);
            n8 = -9404272;
            hashMap.put("slategray", n8);
            hashMap.put("slategrey", n8);
            hashMap.put("snow", -1286);
            hashMap.put("springgreen", -16711809);
            hashMap.put("steelblue", -12156236);
            hashMap.put("tan", -2968436);
            hashMap.put("teal", -16744320);
            hashMap.put("thistle", -2572328);
            hashMap.put("tomato", -40121);
            hashMap.put("turquoise", -12525360);
            hashMap.put("violet", -1146130);
            hashMap.put("wheat", -663885);
            hashMap.put("white", -1);
            hashMap.put("whitesmoke", -657931);
            hashMap.put("yellow", -256);
            hashMap.put("yellowgreen", -6632142);
            hashMap.put("transparent", 0);
        }

        static Integer a(String string) {
            return a.get(string);
        }
    }

    private static class d {
        private static final Map<String, g.p> a;

        static {
            HashMap<String, g.p> hashMap = new HashMap<String, g.p>(9);
            a = hashMap;
            g.d0 d02 = g.d0.h0;
            hashMap.put("xx-small", new g.p(0.694f, d02));
            hashMap.put("x-small", new g.p(0.833f, d02));
            hashMap.put("small", new g.p(10.0f, d02));
            hashMap.put("medium", new g.p(12.0f, d02));
            hashMap.put("large", new g.p(14.4f, d02));
            hashMap.put("x-large", new g.p(17.3f, d02));
            hashMap.put("xx-large", new g.p(20.7f, d02));
            d02 = g.d0.j0;
            hashMap.put("smaller", new g.p(83.33f, d02));
            hashMap.put("larger", new g.p(120.0f, d02));
        }

        static g.p a(String string) {
            return a.get(string);
        }
    }

    private static class e {
        private static final Map<String, Integer> a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<String, Integer>(13);
            a = hashMap;
            Integer n8 = 400;
            hashMap.put("normal", n8);
            Integer n9 = 700;
            hashMap.put("bold", n9);
            hashMap.put("bolder", 1);
            hashMap.put("lighter", -1);
            hashMap.put("100", 100);
            hashMap.put("200", 200);
            hashMap.put("300", 300);
            hashMap.put("400", n8);
            hashMap.put("500", 500);
            hashMap.put("600", 600);
            hashMap.put("700", n9);
            hashMap.put("800", 800);
            hashMap.put("900", 900);
        }

        static Integer a(String string) {
            return a.get(string);
        }
    }

    private class f
    extends DefaultHandler2 {
        final k a;

        private f(k k8) {
            this.a = k8;
        }

        @Override
        public void characters(char[] cArray, int n8, int n9) throws SAXException {
            this.a.c1(new String(cArray, n8, n9));
        }

        @Override
        public void endDocument() throws SAXException {
            this.a.o();
        }

        @Override
        public void endElement(String string, String string2, String string3) throws SAXException {
            this.a.p(string, string2, string3);
        }

        @Override
        public void processingInstruction(String string, String object) throws SAXException {
            object = new i((String)object);
            object = this.a.x0((i)object);
            this.a.r(string, (Map)object);
        }

        @Override
        public void startDocument() throws SAXException {
            this.a.W0();
        }

        @Override
        public void startElement(String string, String string2, String string3, Attributes attributes) throws SAXException {
            this.a.X0(string, string2, string3, attributes);
        }
    }

    private static final class g
    extends Enum<g> {
        public static final /* enum */ g A0;
        public static final /* enum */ g A1;
        public static final /* enum */ g B0;
        public static final /* enum */ g B1;
        public static final /* enum */ g C0;
        public static final /* enum */ g C1;
        public static final /* enum */ g D0;
        public static final /* enum */ g D1;
        public static final /* enum */ g E0;
        public static final /* enum */ g E1;
        public static final /* enum */ g F0;
        public static final /* enum */ g F1;
        public static final /* enum */ g G0;
        public static final /* enum */ g G1;
        public static final /* enum */ g H0;
        public static final /* enum */ g H1;
        public static final /* enum */ g I0;
        public static final /* enum */ g I1;
        public static final /* enum */ g J0;
        public static final /* enum */ g J1;
        public static final /* enum */ g K0;
        public static final /* enum */ g K1;
        public static final /* enum */ g L0;
        public static final /* enum */ g L1;
        public static final /* enum */ g M0;
        public static final /* enum */ g M1;
        public static final /* enum */ g N0;
        public static final /* enum */ g N1;
        public static final /* enum */ g O0;
        public static final /* enum */ g O1;
        public static final /* enum */ g P0;
        private static final Map<String, g> P1;
        public static final /* enum */ g Q0;
        private static final g[] Q1;
        public static final /* enum */ g R0;
        public static final /* enum */ g S0;
        public static final /* enum */ g T0;
        public static final /* enum */ g U0;
        public static final /* enum */ g V0;
        public static final /* enum */ g W0;
        public static final /* enum */ g X0;
        public static final /* enum */ g Y0;
        public static final /* enum */ g Z0;
        public static final /* enum */ g a1;
        public static final /* enum */ g b1;
        public static final /* enum */ g c0;
        public static final /* enum */ g c1;
        public static final /* enum */ g d0;
        public static final /* enum */ g d1;
        public static final /* enum */ g e0;
        public static final /* enum */ g e1;
        public static final /* enum */ g f0;
        public static final /* enum */ g f1;
        public static final /* enum */ g g0;
        public static final /* enum */ g g1;
        public static final /* enum */ g h0;
        public static final /* enum */ g h1;
        public static final /* enum */ g i0;
        public static final /* enum */ g i1;
        public static final /* enum */ g j0;
        public static final /* enum */ g j1;
        public static final /* enum */ g k0;
        public static final /* enum */ g k1;
        public static final /* enum */ g l0;
        public static final /* enum */ g l1;
        public static final /* enum */ g m0;
        public static final /* enum */ g m1;
        public static final /* enum */ g n0;
        public static final /* enum */ g n1;
        public static final /* enum */ g o0;
        public static final /* enum */ g o1;
        public static final /* enum */ g p0;
        public static final /* enum */ g p1;
        public static final /* enum */ g q;
        public static final /* enum */ g q0;
        public static final /* enum */ g q1;
        public static final /* enum */ g r0;
        public static final /* enum */ g r1;
        public static final /* enum */ g s0;
        public static final /* enum */ g s1;
        public static final /* enum */ g t0;
        public static final /* enum */ g t1;
        public static final /* enum */ g u0;
        public static final /* enum */ g u1;
        public static final /* enum */ g v0;
        public static final /* enum */ g v1;
        public static final /* enum */ g w0;
        public static final /* enum */ g w1;
        public static final /* enum */ g x0;
        public static final /* enum */ g x1;
        public static final /* enum */ g y0;
        public static final /* enum */ g y1;
        public static final /* enum */ g z0;
        public static final /* enum */ g z1;

        static {
            g g8;
            g g9;
            g g10;
            g g11;
            g g12;
            g g13;
            g g14;
            g g15;
            g g16;
            g g17;
            g g18;
            g g19;
            g g20;
            g g21;
            g g22;
            g g23;
            g g24;
            g g25;
            g g26;
            g g27;
            g g28;
            g g29;
            g g30;
            g g31;
            g g32;
            g g33;
            g g34;
            g g35;
            g g36;
            g g37;
            g g38;
            g g39;
            g g40;
            g g41;
            g g42;
            g g43;
            g g44;
            g g45;
            g g46;
            g g47;
            g g48;
            g g49;
            g g50;
            g g51;
            g g52;
            g g53;
            g g54;
            g g55;
            g g56;
            g g57;
            g g58;
            g g59;
            g g60;
            g g61;
            g g62;
            g g63;
            g g64;
            g g65;
            g g66;
            g g67;
            g g68;
            g g69;
            g g70;
            g g71;
            g g72;
            g g73;
            g g74;
            g g75;
            g g76;
            g g77;
            g g78;
            g g79;
            g g80;
            g g81;
            g g82;
            Object object;
            g g83;
            g g84;
            g g85;
            g g86;
            g g872;
            g g88;
            g g89;
            g g90;
            g g91;
            g g92;
            g g93;
            g g94;
            g g95;
            g g96;
            g g97;
            q = g97 = new g();
            c0 = g96 = new g();
            d0 = g95 = new g();
            e0 = g94 = new g();
            f0 = g93 = new g();
            g0 = g92 = new g();
            h0 = g91 = new g();
            i0 = g90 = new g();
            j0 = g89 = new g();
            k0 = g88 = new g();
            l0 = g872 = new g();
            m0 = g86 = new g();
            n0 = g85 = new g();
            o0 = g84 = new g();
            p0 = g83 = new g();
            q0 = object = new g();
            r0 = g82 = new g();
            s0 = g81 = new g();
            t0 = g80 = new g();
            u0 = g79 = new g();
            v0 = g78 = new g();
            w0 = g77 = new g();
            x0 = g76 = new g();
            y0 = g75 = new g();
            z0 = g74 = new g();
            A0 = g73 = new g();
            B0 = g72 = new g();
            C0 = g71 = new g();
            D0 = g70 = new g();
            E0 = g69 = new g();
            F0 = g68 = new g();
            G0 = g67 = new g();
            H0 = g66 = new g();
            I0 = g65 = new g();
            J0 = g64 = new g();
            K0 = g63 = new g();
            L0 = g62 = new g();
            M0 = g61 = new g();
            N0 = g60 = new g();
            O0 = g59 = new g();
            P0 = g58 = new g();
            Q0 = g57 = new g();
            R0 = g56 = new g();
            S0 = g55 = new g();
            T0 = g54 = new g();
            U0 = g53 = new g();
            V0 = g52 = new g();
            W0 = g51 = new g();
            X0 = g50 = new g();
            Y0 = g49 = new g();
            Z0 = g48 = new g();
            a1 = g47 = new g();
            b1 = g46 = new g();
            c1 = g45 = new g();
            d1 = g44 = new g();
            e1 = g43 = new g();
            f1 = g42 = new g();
            g1 = g41 = new g();
            h1 = g40 = new g();
            i1 = g39 = new g();
            j1 = g38 = new g();
            k1 = g37 = new g();
            l1 = g36 = new g();
            m1 = g35 = new g();
            n1 = g34 = new g();
            o1 = g33 = new g();
            p1 = g32 = new g();
            q1 = g31 = new g();
            r1 = g30 = new g();
            s1 = g29 = new g();
            t1 = g28 = new g();
            u1 = g27 = new g();
            v1 = g26 = new g();
            w1 = g25 = new g();
            x1 = g24 = new g();
            g[] gArray = new g();
            y1 = gArray;
            z1 = g23 = new g();
            A1 = g22 = new g();
            B1 = g21 = new g();
            C1 = g20 = new g();
            D1 = g19 = new g();
            E1 = g18 = new g();
            F1 = g17 = new g();
            G1 = g16 = new g();
            H1 = g15 = new g();
            I1 = g14 = new g();
            J1 = g13 = new g();
            K1 = g12 = new g();
            L1 = g11 = new g();
            M1 = g10 = new g();
            N1 = g9 = new g();
            O1 = g8 = new g();
            Q1 = new g[]{g97, g96, g95, g94, g93, g92, g91, g90, g89, g88, g872, g86, g85, g84, g83, object, g82, g81, g80, g79, g78, g77, g76, g75, g74, g73, g72, g71, g70, g69, g68, g67, g66, g65, g64, g63, g62, g61, g60, g59, g58, g57, g56, g55, g54, g53, g52, g51, g50, g49, g48, g47, g46, g45, g44, g43, g42, g41, g40, g39, g38, g37, g36, g35, g34, g33, g32, g31, g30, g29, g28, g27, g26, g25, g24, gArray, g23, g22, g21, g20, g19, g18, g17, g16, g15, g14, g13, g12, g11, g10, g9, g8};
            P1 = new HashMap<String, g>();
            for (g g872 : ax.o4.k$g.values()) {
                if (g872 == q) {
                    P1.put("class", g872);
                    continue;
                }
                if (g872 == O1) continue;
                object = g872.name().replace('_', '-');
                P1.put((String)object, g872);
            }
        }

        public static g d(String object) {
            if ((object = P1.get(object)) != null) {
                return object;
            }
            return O1;
        }

        public static g valueOf(String string) {
            return Enum.valueOf(g.class, string);
        }

        public static g[] values() {
            return (g[])Q1.clone();
        }
    }

    private static final class h
    extends Enum<h> {
        public static final /* enum */ h A0;
        public static final /* enum */ h B0;
        public static final /* enum */ h C0;
        public static final /* enum */ h D0;
        public static final /* enum */ h E0;
        public static final /* enum */ h F0;
        public static final /* enum */ h G0;
        private static final Map<String, h> H0;
        private static final h[] I0;
        public static final /* enum */ h c0;
        public static final /* enum */ h d0;
        public static final /* enum */ h e0;
        public static final /* enum */ h f0;
        public static final /* enum */ h g0;
        public static final /* enum */ h h0;
        public static final /* enum */ h i0;
        public static final /* enum */ h j0;
        public static final /* enum */ h k0;
        public static final /* enum */ h l0;
        public static final /* enum */ h m0;
        public static final /* enum */ h n0;
        public static final /* enum */ h o0;
        public static final /* enum */ h p0;
        public static final /* enum */ h q;
        public static final /* enum */ h q0;
        public static final /* enum */ h r0;
        public static final /* enum */ h s0;
        public static final /* enum */ h t0;
        public static final /* enum */ h u0;
        public static final /* enum */ h v0;
        public static final /* enum */ h w0;
        public static final /* enum */ h x0;
        public static final /* enum */ h y0;
        public static final /* enum */ h z0;

        static {
            h h8;
            h h9;
            h h10;
            h h11;
            h h12;
            h h13;
            h h14;
            h h15;
            h h16;
            h h17;
            Object object;
            h h18;
            h h19;
            h h20;
            h h21;
            h h22;
            h h23;
            h h24;
            h h25;
            h h26;
            h h27;
            h h28;
            h h29;
            h h30;
            h h31;
            h h32;
            h h33;
            h h342;
            h h35;
            h h36;
            h h37;
            q = h37 = new h();
            c0 = h36 = new h();
            d0 = h35 = new h();
            e0 = h342 = new h();
            f0 = h33 = new h();
            g0 = h32 = new h();
            h0 = h31 = new h();
            i0 = h30 = new h();
            j0 = h29 = new h();
            k0 = h28 = new h();
            l0 = h27 = new h();
            m0 = h26 = new h();
            n0 = h25 = new h();
            o0 = h24 = new h();
            p0 = h23 = new h();
            q0 = h22 = new h();
            r0 = h21 = new h();
            s0 = h20 = new h();
            t0 = h19 = new h();
            u0 = h18 = new h();
            v0 = object = new h();
            w0 = h17 = new h();
            x0 = h16 = new h();
            y0 = h15 = new h();
            z0 = h14 = new h();
            h[] hArray = new h();
            A0 = hArray;
            B0 = h13 = new h();
            C0 = h12 = new h();
            D0 = h11 = new h();
            E0 = h10 = new h();
            F0 = h9 = new h();
            G0 = h8 = new h();
            I0 = new h[]{h37, h36, h35, h342, h33, h32, h31, h30, h29, h28, h27, h26, h25, h24, h23, h22, h21, h20, h19, h18, object, h17, h16, h15, h14, hArray, h13, h12, h11, h10, h9, h8};
            H0 = new HashMap<String, h>();
            for (h h342 : ax.o4.k$h.values()) {
                if (h342 == x0) {
                    H0.put("switch", h342);
                    continue;
                }
                if (h342 == G0) continue;
                object = h342.name();
                H0.put((String)object, h342);
            }
        }

        public static h d(String object) {
            if ((object = H0.get(object)) != null) {
                return object;
            }
            return G0;
        }

        public static h valueOf(String string) {
            return Enum.valueOf(h.class, string);
        }

        public static h[] values() {
            return (h[])I0.clone();
        }
    }

    static class i {
        String a;
        int b = 0;
        int c = 0;
        private ax.o4.d d = new ax.o4.d();

        i(String string) {
            this.a = string = string.trim();
            this.c = string.length();
        }

        void A() {
            int n8;
            while ((n8 = this.b++) < this.c && this.k(this.a.charAt(n8))) {
            }
        }

        int a() {
            int n8 = this.b;
            int n9 = this.c;
            if (n8 == n9) {
                return -1;
            }
            this.b = ++n8;
            if (n8 < n9) {
                return this.a.charAt(n8);
            }
            return -1;
        }

        String b() {
            int n8 = this.b;
            while (!this.h() && !this.k(this.a.charAt(this.b))) {
                ++this.b;
            }
            String string = this.a.substring(n8, this.b);
            this.b = n8;
            return string;
        }

        Boolean c(Object object) {
            if (object == null) {
                return null;
            }
            this.z();
            return this.m();
        }

        float d(float f8) {
            if (Float.isNaN(f8)) {
                return Float.NaN;
            }
            this.z();
            return this.n();
        }

        float e(Boolean bl) {
            if (bl == null) {
                return Float.NaN;
            }
            this.z();
            return this.n();
        }

        boolean f(char c8) {
            int n8 = this.b;
            boolean bl = n8 < this.c && this.a.charAt(n8) == c8;
            if (bl) {
                ++this.b;
            }
            return bl;
        }

        boolean g(String string) {
            int n8 = this.b;
            int n9 = string.length();
            boolean bl = n8 <= this.c - n9 && this.a.substring(n8, n8 + n9).equals(string);
            if (bl) {
                this.b += n9;
            }
            return bl;
        }

        boolean h() {
            return this.b == this.c;
        }

        boolean i() {
            int n8 = this.b;
            if (n8 == this.c) {
                return false;
            }
            return (n8 = (int)this.a.charAt(n8)) >= 97 && n8 <= 122 || n8 >= 65 && n8 <= 90;
        }

        boolean j(int n8) {
            return n8 == 10 || n8 == 13;
            {
            }
        }

        boolean k(int n8) {
            return n8 == 32 || n8 == 10 || n8 == 13 || n8 == 9;
            {
            }
        }

        Integer l() {
            int n8 = this.b;
            if (n8 == this.c) {
                return null;
            }
            String string = this.a;
            this.b = n8 + 1;
            return string.charAt(n8);
        }

        Boolean m() {
            int n8 = this.b;
            if (n8 == this.c) {
                return null;
            }
            char c8 = this.a.charAt(n8);
            if (c8 != '0' && c8 != '1') {
                return null;
            }
            n8 = this.b;
            boolean bl = true;
            this.b = n8 + 1;
            if (c8 != '1') {
                bl = false;
            }
            return bl;
        }

        float n() {
            float f8 = this.d.b(this.a, this.b, this.c);
            if (!Float.isNaN(f8)) {
                this.b = this.d.a();
            }
            return f8;
        }

        String o() {
            if (this.h()) {
                return null;
            }
            int n8 = this.b;
            int n9 = this.a.charAt(n8);
            while (n9 >= 97 && n9 <= 122 || n9 >= 65 && n9 <= 90) {
                n9 = this.a();
            }
            int n10 = this.b;
            while (this.k(n9)) {
                n9 = this.a();
            }
            if (n9 == 40) {
                ++this.b;
                return this.a.substring(n8, n10);
            }
            this.b = n8;
            return null;
        }

        g.p p() {
            float f8 = this.n();
            if (Float.isNaN(f8)) {
                return null;
            }
            g.d0 d02 = this.v();
            if (d02 == null) {
                return new g.p(f8, g.d0.q);
            }
            return new g.p(f8, d02);
        }

        String q() {
            if (this.h()) {
                return null;
            }
            int n8 = this.b;
            char c8 = this.a.charAt(n8);
            if (c8 != '\'' && c8 != '\"') {
                return null;
            }
            int n9 = this.a();
            while (n9 != -1 && n9 != c8) {
                n9 = this.a();
            }
            if (n9 == -1) {
                this.b = n8;
                return null;
            }
            n9 = this.b;
            this.b = n9 + 1;
            return this.a.substring(n8 + 1, n9);
        }

        String r() {
            return this.t(' ', false);
        }

        String s(char c8) {
            return this.t(c8, false);
        }

        String t(char c8, boolean bl) {
            if (this.h()) {
                return null;
            }
            int n8 = this.a.charAt(this.b);
            if (!bl && this.k(n8) || n8 == c8) {
                return null;
            }
            int n9 = this.b;
            n8 = this.a();
            while (n8 != -1 && n8 != c8 && (bl || !this.k(n8))) {
                n8 = this.a();
            }
            return this.a.substring(n9, this.b);
        }

        String u(char c8) {
            return this.t(c8, true);
        }

        g.d0 v() {
            if (this.h()) {
                return null;
            }
            if (this.a.charAt(this.b) == '%') {
                ++this.b;
                return g.d0.j0;
            }
            int n8 = this.b;
            if (n8 > this.c - 2) {
                return null;
            }
            try {
                g.d0 d02 = g.d0.valueOf(this.a.substring(n8, n8 + 2).toLowerCase(Locale.US));
                this.b += 2;
                return d02;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return null;
            }
        }

        String w() {
            if (this.h()) {
                return null;
            }
            int n8 = this.b;
            int n9 = this.a.charAt(n8);
            if (n9 >= 65 && n9 <= 90 || n9 >= 97 && n9 <= 122) {
                n9 = this.a();
                while (n9 >= 65 && n9 <= 90 || n9 >= 97 && n9 <= 122) {
                    n9 = this.a();
                }
                return this.a.substring(n8, this.b);
            }
            this.b = n8;
            return null;
        }

        float x() {
            this.z();
            float f8 = this.d.b(this.a, this.b, this.c);
            if (!Float.isNaN(f8)) {
                this.b = this.d.a();
            }
            return f8;
        }

        String y() {
            if (this.h()) {
                return null;
            }
            int n8 = this.b;
            this.b = this.c;
            return this.a.substring(n8);
        }

        boolean z() {
            this.A();
            int n8 = this.b++;
            if (n8 == this.c) {
                return false;
            }
            if (this.a.charAt(n8) != ',') {
                return false;
            }
            this.A();
            return true;
        }
    }

    private class j
    implements Attributes {
        private XmlPullParser a;
        final k b;

        public j(k k8, XmlPullParser xmlPullParser) {
            this.b = k8;
            this.a = xmlPullParser;
        }

        @Override
        public int getIndex(String string) {
            return -1;
        }

        @Override
        public int getIndex(String string, String string2) {
            return -1;
        }

        @Override
        public int getLength() {
            return this.a.getAttributeCount();
        }

        @Override
        public String getLocalName(int n8) {
            return this.a.getAttributeName(n8);
        }

        @Override
        public String getQName(int n8) {
            String string = this.a.getAttributeName(n8);
            if (this.a.getAttributePrefix(n8) != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.a.getAttributePrefix(n8));
                stringBuilder.append(':');
                stringBuilder.append(string);
                return stringBuilder.toString();
            }
            return string;
        }

        @Override
        public String getType(int n8) {
            return null;
        }

        @Override
        public String getType(String string) {
            return null;
        }

        @Override
        public String getType(String string, String string2) {
            return null;
        }

        @Override
        public String getURI(int n8) {
            return this.a.getAttributeNamespace(n8);
        }

        @Override
        public String getValue(int n8) {
            return this.a.getAttributeValue(n8);
        }

        @Override
        public String getValue(String string) {
            return null;
        }

        @Override
        public String getValue(String string, String string2) {
            return null;
        }
    }
}

