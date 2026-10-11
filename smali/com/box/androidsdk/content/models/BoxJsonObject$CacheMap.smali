.class Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/box/androidsdk/content/models/BoxJsonObject;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "CacheMap"
.end annotation


# instance fields
.field private mJsonObject:Lax/O4/d;

.field private transient q:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/box/androidsdk/content/models/BoxJsonObject;


# direct methods
.method public constructor <init>(Lcom/box/androidsdk/content/models/BoxJsonObject;Lax/O4/d;)V
    .registers 3

    .line 1
    iput-object p1, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->this$0:Lcom/box/androidsdk/content/models/BoxJsonObject;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->mJsonObject:Lax/O4/d;

    .line 7
    .line 8
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->q:Ljava/util/HashMap;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method


# virtual methods
.method public a(Ljava/lang/String;)Ljava/lang/Boolean;
    .registers 2

    .line 1
    invoke-virtual {p0, p1}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->g(Ljava/lang/String;)Lax/O4/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_8

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_8
    invoke-virtual {p1}, Lax/O4/g;->g()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public b(Ljava/lang/String;)Ljava/util/Date;
    .registers 5

    .line 1
    invoke-virtual {p0, p1}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->g(Ljava/lang/String;)Lax/O4/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2f

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/O4/g;->p()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_e

    .line 13
    .line 14
    goto :goto_2f

    .line 15
    :cond_e
    iget-object v2, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->q:Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Ljava/util/Date;

    .line 22
    .line 23
    if-eqz v2, :cond_19

    .line 24
    .line 25
    return-object v2

    .line 26
    :cond_19
    :try_start_19
    invoke-virtual {v0}, Lax/O4/g;->k()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {v0}, Lax/H3/a;->c(Ljava/lang/String;)Ljava/util/Date;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v2, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->q:Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_26
    .catch Ljava/text/ParseException; {:try_start_19 .. :try_end_26} :catch_27

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :catch_27
    move-exception p1

    .line 41
    const-string v0, "BoxJsonObject"

    .line 42
    .line 43
    const-string v2, "getAsDate"

    .line 44
    .line 45
    invoke-static {v0, v2, p1}, Lax/H3/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    :cond_2f
    :goto_2f
    return-object v1
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public c(Ljava/lang/String;)Ljava/lang/Double;
    .registers 4

    .line 1
    invoke-virtual {p0, p1}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->g(Ljava/lang/String;)Lax/O4/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_16

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/O4/g;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_d

    .line 12
    .line 13
    goto :goto_16

    .line 14
    :cond_d
    invoke-virtual {p1}, Lax/O4/g;->h()D

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_16
    :goto_16
    const/4 p1, 0x0

    .line 24
    return-object p1
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public d(Ljava/lang/String;)Lax/O4/a;
    .registers 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->g(Ljava/lang/String;)Lax/O4/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_12

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/O4/g;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_d

    .line 12
    .line 13
    goto :goto_12

    .line 14
    :cond_d
    invoke-virtual {p1}, Lax/O4/g;->e()Lax/O4/a;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_12
    :goto_12
    const/4 p1, 0x0

    .line 20
    return-object p1
    .line 21
    .line 22
.end method

.method public e(Lcom/box/androidsdk/content/models/BoxJsonObject$b;Ljava/lang/String;)Lcom/box/androidsdk/content/models/BoxJsonObject;
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/box/androidsdk/content/models/BoxJsonObject;",
            ">(",
            "Lcom/box/androidsdk/content/models/BoxJsonObject$b<",
            "TT;>;",
            "Ljava/lang/String;",
            ")TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->q:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_11

    .line 8
    .line 9
    iget-object p1, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->q:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Lcom/box/androidsdk/content/models/BoxJsonObject;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_11
    invoke-virtual {p0, p2}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->g(Ljava/lang/String;)Lax/O4/g;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_32

    .line 23
    .line 24
    invoke-virtual {v0}, Lax/O4/g;->p()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_32

    .line 29
    .line 30
    invoke-virtual {v0}, Lax/O4/g;->q()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_24

    .line 35
    .line 36
    goto :goto_32

    .line 37
    :cond_24
    invoke-virtual {v0}, Lax/O4/g;->i()Lax/O4/d;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {p1, v0}, Lcom/box/androidsdk/content/models/BoxJsonObject$b;->a(Lax/O4/d;)Lcom/box/androidsdk/content/models/BoxJsonObject;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->q:Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_32
    :goto_32
    const/4 p1, 0x0

    .line 52
    return-object p1
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method public equals(Ljava/lang/Object;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->mJsonObject:Lax/O4/d;

    .line 2
    .line 3
    check-cast p1, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;

    .line 4
    .line 5
    iget-object p1, p1, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->mJsonObject:Lax/O4/d;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lax/O4/d;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public f(Lcom/box/androidsdk/content/models/BoxJsonObject$b;Ljava/lang/String;)Ljava/util/ArrayList;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/box/androidsdk/content/models/BoxJsonObject;",
            ">(",
            "Lcom/box/androidsdk/content/models/BoxJsonObject$b<",
            "TT;>;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->q:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_11

    .line 8
    .line 9
    iget-object p1, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->q:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Ljava/util/ArrayList;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_11
    invoke-virtual {p0, p2}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->g(Ljava/lang/String;)Lax/O4/g;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_3a

    .line 23
    .line 24
    invoke-virtual {v0}, Lax/O4/g;->n()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v1, :cond_3a

    .line 29
    .line 30
    invoke-virtual {v0}, Lax/O4/g;->q()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_3a

    .line 35
    .line 36
    new-instance v1, Ljava/util/ArrayList;

    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lax/O4/g;->i()Lax/O4/d;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-interface {p1, v0}, Lcom/box/androidsdk/content/models/BoxJsonObject$b;->a(Lax/O4/d;)Lcom/box/androidsdk/content/models/BoxJsonObject;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->q:Ljava/util/HashMap;

    .line 54
    .line 55
    invoke-virtual {p1, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_3a
    invoke-virtual {p0, p2}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->d(Ljava/lang/String;)Lax/O4/a;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    if-nez v0, :cond_42

    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    return-object p1

    .line 67
    :cond_42
    new-instance v1, Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {v0}, Lax/O4/a;->size()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lax/O4/a;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    :goto_4f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_67

    .line 85
    .line 86
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Lax/O4/g;

    .line 91
    .line 92
    invoke-virtual {v2}, Lax/O4/g;->i()Lax/O4/d;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-interface {p1, v2}, Lcom/box/androidsdk/content/models/BoxJsonObject$b;->a(Lax/O4/d;)Lcom/box/androidsdk/content/models/BoxJsonObject;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_4f

    .line 104
    :cond_67
    iget-object p1, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->q:Ljava/util/HashMap;

    .line 105
    .line 106
    invoke-virtual {p1, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    return-object v1
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
.end method

.method public g(Ljava/lang/String;)Lax/O4/g;
    .registers 3

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->mJsonObject:Lax/O4/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/O4/d;->D(Ljava/lang/String;)Lax/O4/g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public h(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    .line 1
    invoke-virtual {p0, p1}, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->g(Ljava/lang/String;)Lax/O4/g;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_12

    .line 6
    .line 7
    invoke-virtual {p1}, Lax/O4/g;->p()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_d

    .line 12
    .line 13
    goto :goto_12

    .line 14
    :cond_d
    invoke-virtual {p1}, Lax/O4/g;->k()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1

    .line 19
    :cond_12
    :goto_12
    const/4 p1, 0x0

    .line 20
    return-object p1
    .line 21
    .line 22
.end method

.method public hashCode()I
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->mJsonObject:Lax/O4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/O4/d;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public i()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->mJsonObject:Lax/O4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/O4/d;->G()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public j(Ljava/lang/String;Lcom/box/androidsdk/content/models/BoxJsonObject;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->mJsonObject:Lax/O4/d;

    .line 2
    .line 3
    invoke-virtual {p2}, Lcom/box/androidsdk/content/models/BoxJsonObject;->B()Lax/O4/d;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {v0, p1, p2}, Lax/O4/d;->M(Ljava/lang/String;Lax/O4/g;)Lax/O4/d;

    .line 8
    .line 9
    .line 10
    iget-object p2, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->q:Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-eqz p2, :cond_16

    .line 17
    .line 18
    iget-object p2, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->q:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_16
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public k(Ljava/lang/String;Ljava/lang/Long;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->mJsonObject:Lax/O4/d;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    invoke-virtual {v0, p1, v1, v2}, Lax/O4/d;->K(Ljava/lang/String;J)Lax/O4/d;

    .line 8
    .line 9
    .line 10
    iget-object p2, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->q:Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    if-eqz p2, :cond_16

    .line 17
    .line 18
    iget-object p2, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->q:Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :cond_16
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public l(Ljava/lang/String;Ljava/lang/String;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->mJsonObject:Lax/O4/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lax/O4/d;->N(Ljava/lang/String;Ljava/lang/String;)Lax/O4/d;

    .line 4
    .line 5
    .line 6
    iget-object p2, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->q:Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    if-eqz p2, :cond_12

    .line 13
    .line 14
    iget-object p2, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->q:Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    :cond_12
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method public m()Ljava/lang/String;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->mJsonObject:Lax/O4/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/O4/g;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public n(Ljava/io/Writer;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/box/androidsdk/content/models/BoxJsonObject$CacheMap;->mJsonObject:Lax/O4/d;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/O4/g;->A(Ljava/io/Writer;)V

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
