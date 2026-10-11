/*
 * Decompiled with CFR 0.152.
 */
package com.microsoft.graph.generated;

import ax.T9.d;
import ax.T9.e;
import ax.r8.l;
import ax.s8.a;
import ax.s8.c;
import com.microsoft.graph.extensions.Entity;
import com.microsoft.graph.extensions.Location;
import com.microsoft.graph.extensions.PersonType;
import java.util.List;

public class BasePerson
extends Entity
implements d {
    @a
    @c(value="displayName")
    public String f;
    @a
    @c(value="givenName")
    public String g;
    @a
    @c(value="surname")
    public String h;
    @a
    @c(value="birthday")
    public String i;
    @a
    @c(value="personNotes")
    public String j;
    @a
    @c(value="isFavorite")
    public Boolean k;
    @a
    @c(value="scoredEmailAddresses")
    public List<Object> l;
    @a
    @c(value="phones")
    public List<Object> m;
    @a
    @c(value="postalAddresses")
    public List<Location> n;
    @a
    @c(value="websites")
    public List<Object> o;
    @a
    @c(value="jobTitle")
    public String p;
    @a
    @c(value="companyName")
    public String q;
    @a
    @c(value="yomiCompany")
    public String r;
    @a
    @c(value="department")
    public String s;
    @a
    @c(value="officeLocation")
    public String t;
    @a
    @c(value="profession")
    public String u;
    @a
    @c(value="personType")
    public PersonType v;
    @a
    @c(value="userPrincipalName")
    public String w;
    @a
    @c(value="imAddress")
    public String x;
    private transient l y;
    private transient e z;

    @Override
    public void d(e e8, l l8) {
        this.z = e8;
        this.y = l8;
    }
}

