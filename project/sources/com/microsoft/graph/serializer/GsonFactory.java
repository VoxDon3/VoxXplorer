package com.microsoft.graph.serializer;

import ax.T9.c;
import ax.r8.AbstractC3000i;
import ax.r8.C3004m;
import ax.r8.C3006o;
import ax.r8.InterfaceC2998g;
import ax.r8.InterfaceC2999h;
import ax.r8.InterfaceC3007p;
import ax.r8.InterfaceC3008q;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

/* loaded from: classes3.dex */
final class GsonFactory {
    public static Gson a(final ax.Q9.b bVar) {
        InterfaceC3008q<Calendar> interfaceC3008q = new InterfaceC3008q<Calendar>() { // from class: com.microsoft.graph.serializer.GsonFactory.1
            @Override // ax.r8.InterfaceC3008q
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public AbstractC3000i a(Calendar calendar, Type type, InterfaceC3007p interfaceC3007p) {
                if (calendar == null) {
                    return null;
                }
                try {
                    return new C3006o(ax.T9.b.b(calendar));
                } catch (Exception e) {
                    ax.Q9.b.this.b("Parsing issue on " + calendar, e);
                    return null;
                }
            }
        };
        InterfaceC2999h<Calendar> interfaceC2999h = new InterfaceC2999h<Calendar>() { // from class: com.microsoft.graph.serializer.GsonFactory.2
            @Override // ax.r8.InterfaceC2999h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Calendar a(AbstractC3000i abstractC3000i, Type type, InterfaceC2998g interfaceC2998g) throws C3004m {
                if (abstractC3000i == null) {
                    return null;
                }
                try {
                    return ax.T9.b.a(abstractC3000i.k());
                } catch (ParseException e) {
                    ax.Q9.b.this.b("Parsing issue on " + abstractC3000i.k(), e);
                    return null;
                }
            }
        };
        InterfaceC3008q<byte[]> interfaceC3008q2 = new InterfaceC3008q<byte[]>() { // from class: com.microsoft.graph.serializer.GsonFactory.3
            @Override // ax.r8.InterfaceC3008q
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public AbstractC3000i a(byte[] bArr, Type type, InterfaceC3007p interfaceC3007p) {
                if (bArr == null) {
                    return null;
                }
                try {
                    return new C3006o(ax.T9.a.b(bArr));
                } catch (Exception e) {
                    ax.Q9.b.this.b("Parsing issue on " + bArr, e);
                    return null;
                }
            }
        };
        InterfaceC2999h<byte[]> interfaceC2999h2 = new InterfaceC2999h<byte[]>() { // from class: com.microsoft.graph.serializer.GsonFactory.4
            @Override // ax.r8.InterfaceC2999h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public byte[] a(AbstractC3000i abstractC3000i, Type type, InterfaceC2998g interfaceC2998g) throws C3004m {
                if (abstractC3000i == null) {
                    return null;
                }
                try {
                    return ax.T9.a.a(abstractC3000i.k());
                } catch (ParseException e) {
                    ax.Q9.b.this.b("Parsing issue on " + abstractC3000i.k(), e);
                    return null;
                }
            }
        };
        InterfaceC3008q<ax.R9.a> interfaceC3008q3 = new InterfaceC3008q<ax.R9.a>() { // from class: com.microsoft.graph.serializer.GsonFactory.5
            @Override // ax.r8.InterfaceC3008q
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public AbstractC3000i a(ax.R9.a aVar, Type type, InterfaceC3007p interfaceC3007p) {
                if (aVar == null) {
                    return null;
                }
                return new C3006o(aVar.toString());
            }
        };
        InterfaceC2999h<ax.R9.a> interfaceC2999h3 = new InterfaceC2999h<ax.R9.a>() { // from class: com.microsoft.graph.serializer.GsonFactory.6
            @Override // ax.r8.InterfaceC2999h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ax.R9.a a(AbstractC3000i abstractC3000i, Type type, InterfaceC2998g interfaceC2998g) throws C3004m {
                if (abstractC3000i == null) {
                    return null;
                }
                try {
                    return ax.R9.a.a(abstractC3000i.k());
                } catch (ParseException e) {
                    ax.Q9.b.this.b("Parsing issue on " + abstractC3000i.k(), e);
                    return null;
                }
            }
        };
        InterfaceC3008q<EnumSet> interfaceC3008q4 = new InterfaceC3008q<EnumSet>() { // from class: com.microsoft.graph.serializer.GsonFactory.7
            @Override // ax.r8.InterfaceC3008q
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public AbstractC3000i a(EnumSet enumSet, Type type, InterfaceC3007p interfaceC3007p) {
                if (enumSet == null || enumSet.size() == 0) {
                    return null;
                }
                return c.b(enumSet);
            }
        };
        InterfaceC2999h<EnumSet> interfaceC2999h4 = new InterfaceC2999h<EnumSet>() { // from class: com.microsoft.graph.serializer.GsonFactory.8
            @Override // ax.r8.InterfaceC2999h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public EnumSet a(AbstractC3000i abstractC3000i, Type type, InterfaceC2998g interfaceC2998g) throws C3004m {
                if (abstractC3000i == null) {
                    return null;
                }
                return c.a(type, abstractC3000i.k());
            }
        };
        InterfaceC3008q<Duration> interfaceC3008q5 = new InterfaceC3008q<Duration>() { // from class: com.microsoft.graph.serializer.GsonFactory.9
            @Override // ax.r8.InterfaceC3008q
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public AbstractC3000i a(Duration duration, Type type, InterfaceC3007p interfaceC3007p) {
                return new C3006o(duration.toString());
            }
        };
        return new com.google.gson.a().c().d(Calendar.class, interfaceC3008q).d(Calendar.class, interfaceC2999h).d(GregorianCalendar.class, interfaceC3008q).d(GregorianCalendar.class, interfaceC2999h).d(byte[].class, interfaceC2999h2).d(byte[].class, interfaceC3008q2).d(ax.R9.a.class, interfaceC3008q3).d(ax.R9.a.class, interfaceC2999h3).d(EnumSet.class, interfaceC3008q4).d(EnumSet.class, interfaceC2999h4).d(Duration.class, interfaceC3008q5).d(Duration.class, new InterfaceC2999h<Duration>() { // from class: com.microsoft.graph.serializer.GsonFactory.10
            @Override // ax.r8.InterfaceC2999h
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Duration a(AbstractC3000i abstractC3000i, Type type, InterfaceC2998g interfaceC2998g) throws C3004m {
                try {
                    return DatatypeFactory.newInstance().newDuration(abstractC3000i.toString());
                } catch (Exception unused) {
                    return null;
                }
            }
        }).e(new FallBackEnumTypeAdapter()).b();
    }
}
