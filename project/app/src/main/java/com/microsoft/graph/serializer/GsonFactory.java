/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.serializer;

import ax.Q9.b;
import ax.T9.c;
import ax.r8.g;
import ax.r8.h;
import ax.r8.i;
import ax.r8.m;
import ax.r8.o;
import ax.r8.p;
import ax.r8.q;
import com.google.gson.Gson;
import com.google.gson.a;
import com.microsoft.graph.serializer.FallBackEnumTypeAdapter;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;

final class GsonFactory {
    public static Gson a(b object) {
        q<Calendar> q8 = new q<Calendar>((b)object){
            final b a;
            {
                this.a = b8;
            }

            public i b(Calendar calendar, Type object, p object2) {
                if (calendar == null) {
                    return null;
                }
                try {
                    object = new o(ax.T9.b.b(calendar));
                    return object;
                }
                catch (Exception exception) {
                    object2 = this.a;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Parsing issue on ");
                    ((StringBuilder)object).append(calendar);
                    object2.b(((StringBuilder)object).toString(), exception);
                    return null;
                }
            }
        };
        h<Calendar> h8 = new h<Calendar>((b)object){
            final b a;
            {
                this.a = b8;
            }

            public Calendar b(i i8, Type object, g g8) throws m {
                if (i8 == null) {
                    return null;
                }
                try {
                    object = ax.T9.b.a(i8.k());
                    return object;
                }
                catch (ParseException parseException) {
                    b b8 = this.a;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Parsing issue on ");
                    ((StringBuilder)object).append(i8.k());
                    b8.b(((StringBuilder)object).toString(), parseException);
                    return null;
                }
            }
        };
        q<byte[]> q9 = new q<byte[]>((b)object){
            final b a;
            {
                this.a = b8;
            }

            public i b(byte[] byArray, Type object, p p8) {
                if (byArray == null) {
                    return null;
                }
                try {
                    object = new o(ax.T9.a.b(byArray));
                    return object;
                }
                catch (Exception exception) {
                    object = this.a;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Parsing issue on ");
                    stringBuilder.append(byArray);
                    object.b(stringBuilder.toString(), exception);
                    return null;
                }
            }
        };
        h<byte[]> h9 = new h<byte[]>((b)object){
            final b a;
            {
                this.a = b8;
            }

            public byte[] b(i i8, Type object, g object2) throws m {
                if (i8 == null) {
                    return null;
                }
                try {
                    object = ax.T9.a.a(i8.k());
                    return object;
                }
                catch (ParseException parseException) {
                    object2 = this.a;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Parsing issue on ");
                    ((StringBuilder)object).append(i8.k());
                    object2.b(((StringBuilder)object).toString(), parseException);
                    return null;
                }
            }
        };
        q<ax.R9.a> q10 = new q<ax.R9.a>(){

            public i b(ax.R9.a a8, Type type, p p8) {
                if (a8 == null) {
                    return null;
                }
                return new o(a8.toString());
            }
        };
        h<ax.R9.a> h10 = new h<ax.R9.a>((b)object){
            final b a;
            {
                this.a = b8;
            }

            public ax.R9.a b(i i8, Type object, g g8) throws m {
                if (i8 == null) {
                    return null;
                }
                try {
                    object = ax.R9.a.a(i8.k());
                    return object;
                }
                catch (ParseException parseException) {
                    b b8 = this.a;
                    object = new StringBuilder();
                    ((StringBuilder)object).append("Parsing issue on ");
                    ((StringBuilder)object).append(i8.k());
                    b8.b(((StringBuilder)object).toString(), parseException);
                    return null;
                }
            }
        };
        q<EnumSet> q11 = new q<EnumSet>(){

            public i b(EnumSet enumSet, Type type, p p8) {
                if (enumSet != null && enumSet.size() != 0) {
                    return c.b(enumSet);
                }
                return null;
            }
        };
        h<EnumSet> h11 = new h<EnumSet>(){

            public EnumSet b(i i8, Type type, g g8) throws m {
                if (i8 == null) {
                    return null;
                }
                return c.a(type, i8.k());
            }
        };
        q<Duration> q12 = new q<Duration>(){

            public i b(Duration duration, Type type, p p8) {
                return new o(duration.toString());
            }
        };
        object = new h<Duration>(){

            public Duration b(i object, Type type, g g8) throws m {
                try {
                    object = DatatypeFactory.newInstance().newDuration(((i)object).toString());
                    return object;
                }
                catch (Exception exception) {
                    return null;
                }
            }
        };
        return new a().c().d((Type)((Object)Calendar.class), q8).d((Type)((Object)Calendar.class), h8).d((Type)((Object)GregorianCalendar.class), q8).d((Type)((Object)GregorianCalendar.class), h8).d((Type)((Object)byte[].class), h9).d((Type)((Object)byte[].class), q9).d((Type)((Object)ax.R9.a.class), q10).d((Type)((Object)ax.R9.a.class), h10).d((Type)((Object)EnumSet.class), q11).d((Type)((Object)EnumSet.class), h11).d((Type)((Object)Duration.class), q12).d((Type)((Object)Duration.class), object).e(new FallBackEnumTypeAdapter()).b();
    }
}

