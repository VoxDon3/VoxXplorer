/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c {
    private static final Date h = new Date(0L);
    private JSONObject a;
    private JSONObject b;
    private Date c;
    private JSONArray d;
    private JSONObject e;
    private long f;
    private JSONArray g;

    private c(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long l8, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", (Object)jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", (Object)jSONArray);
        jSONObject3.put("personalization_metadata_key", (Object)jSONObject2);
        jSONObject3.put("template_version_number_key", l8);
        jSONObject3.put("rollout_metadata_key", (Object)jSONArray2);
        this.b = jSONObject;
        this.c = date;
        this.d = jSONArray;
        this.e = jSONObject2;
        this.f = l8;
        this.g = jSONArray2;
        this.a = jSONObject3;
    }

    static /* synthetic */ Date a() {
        return h;
    }

    static c b(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONObject jSONObject3 = jSONObject2 = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObject2 == null) {
            jSONObject3 = new JSONObject();
        }
        JSONArray jSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        jSONObject2 = jSONArray;
        if (jSONArray == null) {
            jSONObject2 = new JSONArray();
        }
        return new c(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject3, jSONObject.optLong("template_version_number_key"), (JSONArray)jSONObject2);
    }

    private Map<String, Map<String, String>> c() throws JSONException {
        HashMap<String, Map<String, String>> hashMap = new HashMap<String, Map<String, String>>();
        for (int i8 = 0; i8 < this.j().length(); ++i8) {
            JSONObject jSONObject = this.j().getJSONObject(i8);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            jSONObject = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i9 = 0; i9 < jSONObject.length(); ++i9) {
                Object object = jSONObject.getString(i9);
                if (!hashMap.containsKey(object)) {
                    hashMap.put((String)object, new HashMap());
                }
                if ((object = (Map)hashMap.get(object)) == null) continue;
                object.put(string, string2);
            }
        }
        return hashMap;
    }

    private static c d(JSONObject jSONObject) throws JSONException {
        return com.google.firebase.remoteconfig.internal.c.b(new JSONObject(jSONObject.toString()));
    }

    public static b l() {
        return new b();
    }

    public JSONArray e() {
        return this.d;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        object = (c)object;
        return this.a.toString().equals(((c)object).toString());
    }

    public Set<String> f(c object) throws JSONException {
        JSONObject jSONObject = com.google.firebase.remoteconfig.internal.c.d(((c)object).a).g();
        Map<String, Map<String, String>> map = this.c();
        Map<String, Map<String, String>> map2 = ((c)object).c();
        HashSet<String> hashSet = new HashSet<String>();
        Iterator iterator = this.g().keys();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            if (!((c)object).g().has(string)) {
                hashSet.add(string);
                continue;
            }
            if (!this.g().get(string).equals(((c)object).g().get(string))) {
                hashSet.add(string);
                continue;
            }
            if (this.i().has(string) && !((c)object).i().has(string) || !this.i().has(string) && ((c)object).i().has(string)) {
                hashSet.add(string);
                continue;
            }
            if (this.i().has(string) && ((c)object).i().has(string) && !this.i().getJSONObject(string).toString().equals(((c)object).i().getJSONObject(string).toString())) {
                hashSet.add(string);
                continue;
            }
            if (map.containsKey(string) != map2.containsKey(string)) {
                hashSet.add(string);
                continue;
            }
            if (map.containsKey(string) && map2.containsKey(string) && !map.get(string).equals(map2.get(string))) {
                hashSet.add(string);
                continue;
            }
            jSONObject.remove(string);
        }
        object = jSONObject.keys();
        while (object.hasNext()) {
            hashSet.add((String)object.next());
        }
        return hashSet;
    }

    public JSONObject g() {
        return this.b;
    }

    public Date h() {
        return this.c;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public JSONObject i() {
        return this.e;
    }

    public JSONArray j() {
        return this.g;
    }

    public long k() {
        return this.f;
    }

    public String toString() {
        return this.a.toString();
    }

    public static class b {
        private JSONObject a = new JSONObject();
        private Date b = com.google.firebase.remoteconfig.internal.c.a();
        private JSONArray c = new JSONArray();
        private JSONObject d = new JSONObject();
        private long e = 0L;
        private JSONArray f = new JSONArray();

        private b() {
        }

        public c a() throws JSONException {
            return new c(this.a, this.b, this.c, this.d, this.e, this.f);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public b b(JSONObject jSONObject) {
            try {
                JSONObject jSONObject2;
                this.a = jSONObject2 = new JSONObject(jSONObject.toString());
                return this;
            }
            catch (JSONException jSONException) {
                return this;
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public b c(JSONArray jSONArray) {
            try {
                JSONArray jSONArray2;
                this.c = jSONArray2 = new JSONArray(jSONArray.toString());
                return this;
            }
            catch (JSONException jSONException) {
                return this;
            }
        }

        public b d(Date date) {
            this.b = date;
            return this;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public b e(JSONObject jSONObject) {
            try {
                JSONObject jSONObject2;
                this.d = jSONObject2 = new JSONObject(jSONObject.toString());
                return this;
            }
            catch (JSONException jSONException) {
                return this;
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public b f(JSONArray jSONArray) {
            try {
                JSONArray jSONArray2;
                this.f = jSONArray2 = new JSONArray(jSONArray.toString());
                return this;
            }
            catch (JSONException jSONException) {
                return this;
            }
        }

        public b g(long l8) {
            this.e = l8;
            return this;
        }
    }
}

