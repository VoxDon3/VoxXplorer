package ax.Oa;

import ax.Ja.b;
import ax.Ra.d;
import ax.r8.C3004m;
import ax.r8.EnumC2994c;
import ax.t8.c;
import com.google.gson.internal.Excluder;
import com.socialnmobile.dav.gson.Response;
import com.socialnmobile.dav.util.MyReflectiveTypeAdapterFactory;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes3.dex */
public final class a {
    private static final String[] a;
    private static final DocumentBuilderFactory b = DocumentBuilderFactory.newInstance();
    private static final List<ThreadLocal<SimpleDateFormat>> c;

    /* renamed from: ax.Oa.a$a, reason: collision with other inner class name */
    class C0161a implements d {
        C0161a() {
        }

        @Override // ax.Ra.d
        public XmlPullParser a() {
            try {
                return XmlPullParserFactory.newInstance().newPullParser();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    static {
        String[] strArr = {"yyyy-MM-dd'T'HH:mm:ss'Z'", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd'T'HH:mm:ss.sss'Z'", "yyyy-MM-dd'T'HH:mm:ssZ", "EEE MMM dd HH:mm:ss zzz yyyy", "EEEEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMMM d HH:mm:ss yyyy"};
        a = strArr;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (int i = 0; i < a.length; i++) {
            arrayList.add(new ThreadLocal());
        }
        c = DesugarCollections.unmodifiableList(arrayList);
    }

    public static QName a(String str) {
        return new QName("DAV:", str, ax.ba.d.d);
    }

    public static String b(Document document) throws TransformerException {
        Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
        Properties properties = new Properties();
        properties.setProperty("indent", "yes");
        properties.setProperty("method", "xml");
        properties.setProperty("omit-xml-declaration", "no");
        properties.setProperty("version", "1.0");
        properties.setProperty("encoding", "UTF-8");
        newTransformer.setOutputProperties(properties);
        DOMSource dOMSource = new DOMSource(document.getDocumentElement());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        newTransformer.transform(dOMSource, new StreamResult(byteArrayOutputStream));
        return byteArrayOutputStream.toString();
    }

    public static boolean c(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static Date d(String str) {
        Date date = null;
        if (str == null) {
            return null;
        }
        int i = 0;
        while (true) {
            List<ThreadLocal<SimpleDateFormat>> list = c;
            if (i >= list.size()) {
                break;
            }
            ThreadLocal<SimpleDateFormat> threadLocal = list.get(i);
            SimpleDateFormat simpleDateFormat = threadLocal.get();
            if (simpleDateFormat == null) {
                simpleDateFormat = new SimpleDateFormat(a[i], Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                threadLocal.set(simpleDateFormat);
            }
            try {
                continue;
                date = simpleDateFormat.parse(str);
                break;
            } catch (ParseException unused) {
                i++;
            }
        }
        return date;
    }

    public static <T> T e(Class<T> cls, InputStream inputStream) throws b {
        C0161a c0161a = new C0161a();
        try {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            hashSet2.add("getlastmodified");
            hashSet2.add("getcontentlength");
            hashSet2.add("creationdate");
            hashSet2.add("displayname");
            hashSet2.add("getcontentlanguage");
            hashSet2.add("getcontenttype");
            hashSet2.add("getetag");
            hashSet2.add("quota-available-bytes");
            hashSet2.add("quota-used-bytes");
            hashSet2.add("principal-URL");
            hashSet2.add("visible");
            hashSet2.add("readonly");
            hashSet2.add("hasthumbnail");
            hashSet2.add("has-preview");
            com.google.gson.a aVar = new com.google.gson.a();
            aVar.e(new MyReflectiveTypeAdapterFactory(new c(new HashMap(), true, new ArrayList()), EnumC2994c.q, Excluder.h0, Response.class));
            return (T) new ax.Ra.b().g(aVar).f(c0161a).d(true).e(true).c(hashSet).b(hashSet2).a().c(new InputStreamReader(inputStream), cls);
        } catch (C3004m | IllegalStateException e) {
            throw new b(e);
        }
    }
}
