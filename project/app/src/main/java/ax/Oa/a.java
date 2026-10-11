/*
 * Decompiled with CFR 0.152.
 */
package ax.Oa;

import ax.Ja.b;
import ax.Ra.d;
import ax.r8.m;
import ax.r8.t;
import ax.r8.w;
import ax.t8.c;
import com.google.gson.internal.Excluder;
import com.socialnmobile.dav.gson.Response;
import com.socialnmobile.dav.util.MyReflectiveTypeAdapterFactory;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public final class a {
    private static final String[] a;
    private static final DocumentBuilderFactory b;
    private static final List<ThreadLocal<SimpleDateFormat>> c;

    static {
        Object object = new String[]{"yyyy-MM-dd'T'HH:mm:ss'Z'", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd'T'HH:mm:ss.sss'Z'", "yyyy-MM-dd'T'HH:mm:ssZ", "EEE MMM dd HH:mm:ss zzz yyyy", "EEEEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMMM d HH:mm:ss yyyy"};
        a = object;
        b = DocumentBuilderFactory.newInstance();
        object = new ArrayList(((String[])object).length);
        for (int i8 = 0; i8 < a.length; ++i8) {
            object.add(new ThreadLocal());
        }
        c = java.util.DesugarCollections.unmodifiableList((List)object);
    }

    public static QName a(String string) {
        return new QName("DAV:", string, "d");
    }

    public static String b(Document object) throws TransformerException {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        Object object2 = new Properties();
        ((Properties)object2).setProperty("indent", "yes");
        ((Properties)object2).setProperty("method", "xml");
        ((Properties)object2).setProperty("omit-xml-declaration", "no");
        ((Properties)object2).setProperty("version", "1.0");
        ((Properties)object2).setProperty("encoding", "UTF-8");
        transformer.setOutputProperties((Properties)object2);
        object2 = new DOMSource(object.getDocumentElement());
        object = new ByteArrayOutputStream();
        transformer.transform((Source)object2, new StreamResult((OutputStream)object));
        return object.toString();
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
        {
        }
    }

    public static Date d(String string) {
        Object object;
        Object object2 = null;
        if (string == null) {
            return null;
        }
        int n8 = 0;
        while (true) {
            Object object3 = c;
            object = object2;
            if (n8 >= object3.size()) break;
            ThreadLocal<SimpleDateFormat> threadLocal = object3.get(n8);
            object = object3 = threadLocal.get();
            if (object3 == null) {
                object = new SimpleDateFormat(a[n8], Locale.US);
                ((DateFormat)object).setTimeZone(java.util.DesugarTimeZone.getTimeZone((String)"UTC"));
                threadLocal.set((SimpleDateFormat)object);
            }
            try {
                object = ((DateFormat)object).parse(string);
            }
            catch (ParseException parseException) {
                ++n8;
                continue;
            }
            break;
        }
        return object;
    }

    public static <T> T e(Class<T> clazz, InputStream inputStream) throws b {
        d d8 = new d(){

            @Override
            public XmlPullParser a() {
                try {
                    XmlPullParser xmlPullParser = XmlPullParserFactory.newInstance().newPullParser();
                    return xmlPullParser;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
            }
        };
        try {
            Object object = new HashSet();
            HashSet<String> hashSet = new HashSet<String>();
            hashSet.add("getlastmodified");
            hashSet.add("getcontentlength");
            hashSet.add("creationdate");
            hashSet.add("displayname");
            hashSet.add("getcontentlanguage");
            hashSet.add("getcontenttype");
            hashSet.add("getetag");
            hashSet.add("quota-available-bytes");
            hashSet.add("quota-used-bytes");
            hashSet.add("principal-URL");
            hashSet.add("visible");
            hashSet.add("readonly");
            hashSet.add("hasthumbnail");
            hashSet.add("has-preview");
            Object object2 = new com.google.gson.a();
            HashMap hashMap = new HashMap();
            Object object3 = new ArrayList();
            Object object4 = new c(hashMap, true, (List<t>)object3);
            object3 = new MyReflectiveTypeAdapterFactory((c)object4, ax.r8.c.q, Excluder.h0, Response.class);
            ((com.google.gson.a)object2).e((w)object3);
            object4 = new ax.Ra.b();
            object2 = ((ax.Ra.b)object4).g((com.google.gson.a)object2).f(d8).d(true).e(true).c((Set<String>)object).b(hashSet).a();
            object = new InputStreamReader(inputStream);
            clazz = ((ax.Ra.a)object2).c((Reader)object, clazz);
        }
        catch (m | IllegalStateException runtimeException) {
            throw new b(runtimeException);
        }
        return (T)clazz;
    }
}

