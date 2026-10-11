.class public Lcom/voxdon/xplorer/file/u;
.super Lcom/voxdon/xplorer/file/x;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/voxdon/xplorer/file/u$a;
    }
.end annotation


# static fields
.field private static final B:Ljava/util/logging/Logger;

.field static C:Ljava/text/SimpleDateFormat;

.field private static final D:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lax/c3/z;",
            "Lcom/voxdon/xplorer/file/u$a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private A:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation
.end field

.field private z:Lax/c3/z;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    .line 1
    const-string v0, "FileManager.LibraryFileHelper"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcom/voxdon/xplorer/file/u;->B:Ljava/util/logging/Logger;

    .line 8
    .line 9
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 10
    .line 11
    const-string v1, "yyyy:MM:dd HH:mm:ss"

    .line 12
    .line 13
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/voxdon/xplorer/file/u;->C:Ljava/text/SimpleDateFormat;

    .line 19
    .line 20
    new-instance v0, Ljava/util/HashMap;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lcom/voxdon/xplorer/file/u;->D:Ljava/util/Map;

    .line 26
    .line 27
    sget-object v1, Lax/c3/z;->f0:Lax/c3/z;

    .line 28
    .line 29
    new-instance v2, Lcom/voxdon/xplorer/file/u$a;

    .line 30
    .line 31
    invoke-direct {v2, v1}, Lcom/voxdon/xplorer/file/u$a;-><init>(Lax/c3/z;)V

    .line 32
    .line 33
    .line 34
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    sget-object v1, Lax/c3/z;->e0:Lax/c3/z;

    .line 38
    .line 39
    new-instance v2, Lcom/voxdon/xplorer/file/u$a;

    .line 40
    .line 41
    invoke-direct {v2, v1}, Lcom/voxdon/xplorer/file/u$a;-><init>(Lax/c3/z;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    sget-object v1, Lax/c3/z;->c0:Lax/c3/z;

    .line 48
    .line 49
    new-instance v2, Lcom/voxdon/xplorer/file/u$a;

    .line 50
    .line 51
    invoke-direct {v2, v1}, Lcom/voxdon/xplorer/file/u$a;-><init>(Lax/c3/z;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    sget-object v1, Lax/c3/z;->h0:Lax/c3/z;

    .line 58
    .line 59
    new-instance v2, Lcom/voxdon/xplorer/file/u$a;

    .line 60
    .line 61
    invoke-direct {v2, v1}, Lcom/voxdon/xplorer/file/u$a;-><init>(Lax/c3/z;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    sget-object v1, Lax/c3/z;->o0:Lax/c3/z;

    .line 68
    .line 69
    new-instance v2, Lcom/voxdon/xplorer/file/u$a;

    .line 70
    .line 71
    invoke-direct {v2, v1}, Lcom/voxdon/xplorer/file/u$a;-><init>(Lax/c3/z;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    sget-object v1, Lax/c3/z;->p0:Lax/c3/z;

    .line 78
    .line 79
    new-instance v2, Lcom/voxdon/xplorer/file/u$a;

    .line 80
    .line 81
    invoke-direct {v2, v1}, Lcom/voxdon/xplorer/file/u$a;-><init>(Lax/c3/z;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    sget-object v1, Lax/c3/z;->r0:Lax/c3/z;

    .line 88
    .line 89
    new-instance v2, Lcom/voxdon/xplorer/file/u$a;

    .line 90
    .line 91
    invoke-direct {v2, v1}, Lcom/voxdon/xplorer/file/u$a;-><init>(Lax/c3/z;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    sget-object v1, Lax/c3/z;->v0:Lax/c3/z;

    .line 98
    .line 99
    new-instance v2, Lcom/voxdon/xplorer/file/u$a;

    .line 100
    .line 101
    invoke-direct {v2, v1}, Lcom/voxdon/xplorer/file/u$a;-><init>(Lax/c3/z;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    return-void
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
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
.end method

.method public constructor <init>()V
    .registers 1

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/file/x;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
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
.end method

.method public static V1(Lcom/voxdon/xplorer/file/m;Lcom/voxdon/xplorer/file/n;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->x()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p0, v0}, Lcom/voxdon/xplorer/file/c;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p0}, Lax/Z2/b;->g(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_24

    .line 18
    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_24

    .line 29
    .line 30
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1, p0, v1}, Lax/Z2/b;->m(Lcom/voxdon/xplorer/file/n;Ljava/util/List;)V

    .line 35
    .line 36
    .line 37
    :cond_24
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method private W1(Lcom/voxdon/xplorer/file/n;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/u;->A:Ljava/util/HashSet;

    .line 2
    .line 3
    if-eqz v0, :cond_28

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_8
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_28

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lcom/voxdon/xplorer/file/n;

    .line 20
    .line 21
    if-eqz v1, :cond_8

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_8

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 38
    .line 39
    .line 40
    goto :goto_8

    .line 41
    :cond_28
    return-void
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

.method private Z1(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;
    .registers 7

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/file/u;->D:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/u;->Y1()Lax/c3/z;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/voxdon/xplorer/file/u$a;

    .line 12
    .line 13
    check-cast p1, Lcom/voxdon/xplorer/file/v;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/v;->F1()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    if-eqz v1, :cond_2d

    .line 24
    .line 25
    new-instance v3, Ljava/io/File;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-direct {v3, v4, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2d

    .line 39
    .line 40
    new-instance p1, Lcom/voxdon/xplorer/file/v;

    .line 41
    .line 42
    invoke-direct {p1, p0, v3, v0, v2}, Lcom/voxdon/xplorer/file/v;-><init>(Lcom/voxdon/xplorer/file/u;Ljava/io/File;Lcom/voxdon/xplorer/file/u$a;Lax/c3/K;)V

    .line 43
    .line 44
    .line 45
    return-object p1

    .line 46
    :cond_2d
    sget-object v0, Lcom/voxdon/xplorer/file/u;->B:Ljava/util/logging/Logger;

    .line 47
    .line 48
    const-string v1, "WARN : GetFirstFileInfoFromDirectory ListFiles"

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/u;->f2(Lcom/voxdon/xplorer/file/v;)Lcom/voxdon/xplorer/file/n;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method private a2(Ljava/lang/String;)Lcom/voxdon/xplorer/file/v;
    .registers 5

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->x()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/u;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/voxdon/xplorer/file/v;

    .line 10
    .line 11
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1, v0}, Lax/Z2/b;->g(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_31

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_31

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lcom/voxdon/xplorer/file/n;

    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_18

    .line 46
    .line 47
    check-cast v1, Lcom/voxdon/xplorer/file/v;

    .line 48
    .line 49
    return-object v1

    .line 50
    :cond_31
    const/4 p1, 0x0

    .line 51
    return-object p1
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

.method private b2(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;
    .registers 6

    .line 1
    sget-object v0, Lcom/voxdon/xplorer/file/u;->D:Ljava/util/Map;

    .line 2
    .line 3
    sget-object v1, Lax/c3/z;->f0:Lax/c3/z;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/voxdon/xplorer/file/u$a;

    .line 10
    .line 11
    check-cast p1, Lcom/voxdon/xplorer/file/v;

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1, v0}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    array-length v2, v1

    .line 22
    if-lez v2, :cond_24

    .line 23
    .line 24
    new-instance v2, Lcom/voxdon/xplorer/file/v;

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    aget-object v1, v1, v3

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-direct {v2, p0, v1, v0, p1}, Lcom/voxdon/xplorer/file/v;-><init>(Lcom/voxdon/xplorer/file/u;Ljava/io/File;Lcom/voxdon/xplorer/file/u$a;Lax/c3/K;)V

    .line 34
    .line 35
    .line 36
    return-object v2

    .line 37
    :cond_24
    const/4 p1, 0x0

    .line 38
    return-object p1
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

.method public static c2(Lax/Q2/f;)Ljava/lang/String;
    .registers 4

    .line 1
    sget-object v0, Lax/Q2/f;->A0:Lax/Q2/f;

    .line 2
    .line 3
    if-ne p0, v0, :cond_b

    .line 4
    .line 5
    sget-object p0, Landroid/os/Environment;->DIRECTORY_MUSIC:Ljava/lang/String;

    .line 6
    .line 7
    invoke-static {p0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    goto :goto_58

    .line 12
    :cond_b
    sget-object v0, Lax/Q2/f;->B0:Lax/Q2/f;

    .line 13
    .line 14
    if-ne p0, v0, :cond_16

    .line 15
    .line 16
    sget-object p0, Landroid/os/Environment;->DIRECTORY_MOVIES:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {p0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    goto :goto_58

    .line 23
    :cond_16
    sget-object v0, Lax/Q2/f;->z0:Lax/Q2/f;

    .line 24
    .line 25
    if-ne p0, v0, :cond_21

    .line 26
    .line 27
    sget-object p0, Landroid/os/Environment;->DIRECTORY_PICTURES:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {p0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    goto :goto_58

    .line 34
    :cond_21
    sget-object v0, Lax/Q2/f;->C0:Lax/Q2/f;

    .line 35
    .line 36
    if-ne p0, v0, :cond_3e

    .line 37
    .line 38
    invoke-static {}, Lax/X2/Q;->H0()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_32

    .line 43
    .line 44
    sget-object p0, Landroid/os/Environment;->DIRECTORY_DOCUMENTS:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {p0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    goto :goto_58

    .line 51
    :cond_32
    new-instance p0, Ljava/io/File;

    .line 52
    .line 53
    invoke-static {}, Lax/X2/K;->y()Ljava/io/File;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const-string v1, "Documents"

    .line 58
    .line 59
    invoke-direct {p0, v0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    goto :goto_58

    .line 63
    :cond_3e
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    const-string v2, "UNKNOWN LIBRARY LOCATION!!!!!!"

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {p0}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {v1, p0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 86
    .line 87
    .line 88
    move-object p0, v0

    .line 89
    :goto_58
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_61

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z

    .line 96
    .line 97
    .line 98
    :cond_61
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0
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
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method private d2(Ljava/lang/String;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/u;->a2(Ljava/lang/String;)Lcom/voxdon/xplorer/file/v;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_a

    .line 6
    .line 7
    const/4 v0, -0x3

    .line 8
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/file/n;->d0(I)V

    .line 9
    .line 10
    .line 11
    :cond_a
    return-void
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

.method private declared-synchronized e2(Lcom/voxdon/xplorer/file/n;)Z
    .registers 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/u;->A:Ljava/util/HashSet;
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_2b

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-nez v0, :cond_8

    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return v1

    .line 9
    :cond_8
    :try_start_8
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_c
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_2d

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lcom/voxdon/xplorer/file/n;

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_c

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V
    :try_end_29
    .catchall {:try_start_8 .. :try_end_29} :catchall_2b

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    goto :goto_c

    .line 44
    :catchall_2b
    move-exception p1

    .line 45
    goto :goto_2f

    .line 46
    :cond_2d
    monitor-exit p0

    .line 47
    return v1

    .line 48
    :goto_2f
    :try_start_2f
    monitor-exit p0
    :try_end_30
    .catchall {:try_start_2f .. :try_end_30} :catchall_2b

    .line 49
    throw p1
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


# virtual methods
.method public A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;
    .registers 5

    .line 1
    if-eqz p1, :cond_29

    .line 2
    .line 3
    invoke-static {p1}, Lax/c3/B;->I(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_29

    .line 8
    .line 9
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/file/u;->a2(Ljava/lang/String;)Lcom/voxdon/xplorer/file/v;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_15

    .line 14
    .line 15
    invoke-virtual {p0, p2}, Lcom/voxdon/xplorer/file/u;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    move-object v0, p2

    .line 20
    check-cast v0, Lcom/voxdon/xplorer/file/v;

    .line 21
    .line 22
    :cond_15
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/u;->X1(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-eqz p2, :cond_24

    .line 27
    .line 28
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-super {p0, p1, p2, p3}, Lcom/voxdon/xplorer/file/x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    return-object p1

    .line 37
    :cond_24
    invoke-static {}, Lax/r3/b;->n()Ljava/io/InputStream;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_29
    invoke-super {p0, p1, p2, p3}, Lcom/voxdon/xplorer/file/x;->A(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/io/InputStream;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    return-object p1
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
.end method

.method public C(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;)Ljava/util/List;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            "Lcom/voxdon/xplorer/file/m$f;",
            ")",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lcom/voxdon/xplorer/file/v;

    .line 3
    .line 4
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lax/c3/d0;->E(Lcom/voxdon/xplorer/file/n;)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_47

    .line 14
    .line 15
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    invoke-virtual {p2, p1}, Lax/Z2/b;->f(Lcom/voxdon/xplorer/file/n;)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_26

    .line 24
    .line 25
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {p2, p1}, Lax/Z2/b;->g(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-virtual {p0, p1, p2, v0}, Lcom/voxdon/xplorer/file/u;->g2(Lcom/voxdon/xplorer/file/n;Ljava/util/List;Z)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1

    .line 39
    :cond_26
    :try_start_26
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->p()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    const/4 v0, 0x0

    .line 44
    invoke-static {p2, v0}, Lcom/voxdon/xplorer/file/w;->C(Landroid/content/Context;Lcom/voxdon/xplorer/file/w$d;)Lcom/voxdon/xplorer/file/w;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    invoke-virtual {p2}, Lax/u3/q;->l()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p2, p1}, Lax/Z2/b;->g(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object p1
    :try_end_3a
    .catch Ljava/lang/InterruptedException; {:try_start_26 .. :try_end_3a} :catch_3d
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_26 .. :try_end_3a} :catch_3b

    .line 59
    return-object p1

    .line 60
    :catch_3b
    move-exception p1

    .line 61
    goto :goto_3f

    .line 62
    :catch_3d
    move-exception p1

    .line 63
    goto :goto_43

    .line 64
    :goto_3f
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 65
    .line 66
    .line 67
    goto :goto_78

    .line 68
    :goto_43
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 69
    .line 70
    .line 71
    goto :goto_78

    .line 72
    :cond_47
    invoke-super {p0, v0, p2}, Lcom/voxdon/xplorer/file/x;->C(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/m$f;)Ljava/util/List;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-eqz p1, :cond_78

    .line 77
    .line 78
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/v;->C1()Lcom/voxdon/xplorer/file/u$a;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    :cond_55
    :goto_55
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_78

    .line 91
    .line 92
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, Lcom/voxdon/xplorer/file/n;

    .line 97
    .line 98
    if-eqz p2, :cond_6d

    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {p2, v2}, Lcom/voxdon/xplorer/file/u$a;->b(Ljava/lang/String;)Z

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    if-eqz v2, :cond_55

    .line 109
    .line 110
    :cond_6d
    new-instance v2, Lcom/voxdon/xplorer/file/v;

    .line 111
    .line 112
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 113
    .line 114
    invoke-direct {v2, p0, v0, p2}, Lcom/voxdon/xplorer/file/v;-><init>(Lcom/voxdon/xplorer/file/x;Lcom/voxdon/xplorer/file/y;Lcom/voxdon/xplorer/file/u$a;)V

    .line 115
    .line 116
    .line 117
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    goto :goto_55

    .line 121
    :cond_78
    :goto_78
    return-object v1
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

.method public D(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-super/range {p0 .. p10}, Lcom/voxdon/xplorer/file/x;->D(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;Lcom/voxdon/xplorer/file/p;ZLax/u3/c;Lax/g3/i;)V

    .line 2
    .line 3
    .line 4
    move-object p2, p1

    .line 5
    move-object p1, p0

    .line 6
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/file/u;->d2(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
    .line 14
    .line 15
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
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
.end method

.method public E(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    .registers 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/voxdon/xplorer/file/x;->E(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/u;->T1(Lcom/voxdon/xplorer/file/n;)Z

    .line 5
    .line 6
    .line 7
    move-result p3

    .line 8
    if-eqz p3, :cond_58

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->x()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    invoke-virtual {p0, p3}, Lcom/voxdon/xplorer/file/u;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 15
    .line 16
    .line 17
    move-result-object p3

    .line 18
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    invoke-virtual {p4, p3}, Lax/Z2/b;->g(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    if-eqz p4, :cond_58

    .line 27
    .line 28
    invoke-interface {p4, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_58

    .line 33
    .line 34
    new-instance v0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v0, p4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/u;->e2(Lcom/voxdon/xplorer/file/n;)Z

    .line 43
    .line 44
    .line 45
    move-result p4

    .line 46
    invoke-static {p2}, Lcom/voxdon/xplorer/file/J;->j2(Lcom/voxdon/xplorer/file/n;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_51

    .line 51
    .line 52
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/file/u;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    if-eqz p4, :cond_51

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p4

    .line 69
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {p4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p4

    .line 77
    if-eqz p4, :cond_51

    .line 78
    .line 79
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/file/u;->U1(Lcom/voxdon/xplorer/file/n;)V

    .line 80
    .line 81
    .line 82
    :cond_51
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 83
    .line 84
    .line 85
    move-result-object p4

    .line 86
    invoke-virtual {p4, p3, v0}, Lax/Z2/b;->m(Lcom/voxdon/xplorer/file/n;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    :cond_58
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p3

    .line 93
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p4

    .line 97
    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p3

    .line 101
    if-nez p3, :cond_74

    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/u;->d2(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/u;->d2(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    :cond_74
    return-void
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
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public F(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/voxdon/xplorer/file/x;->F(Lcom/voxdon/xplorer/file/n;Lcom/voxdon/xplorer/file/n;Lax/u3/c;Lax/g3/i;)V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
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
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method public G(Ljava/lang/String;Ljava/lang/String;)I
    .registers 4

    .line 1
    if-eqz p1, :cond_26

    .line 2
    .line 3
    invoke-static {p1}, Lax/c3/B;->I(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_26

    .line 8
    .line 9
    invoke-direct {p0, p2}, Lcom/voxdon/xplorer/file/u;->a2(Ljava/lang/String;)Lcom/voxdon/xplorer/file/v;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_15

    .line 14
    .line 15
    invoke-virtual {p0, p2}, Lcom/voxdon/xplorer/file/u;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    move-object v0, p2

    .line 20
    check-cast v0, Lcom/voxdon/xplorer/file/v;

    .line 21
    .line 22
    :cond_15
    invoke-virtual {p0, v0}, Lcom/voxdon/xplorer/file/u;->X1(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-eqz p2, :cond_24

    .line 27
    .line 28
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-super {p0, p1, p2}, Lcom/voxdon/xplorer/file/x;->G(Ljava/lang/String;Ljava/lang/String;)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    return p1

    .line 37
    :cond_24
    const/4 p1, 0x0

    .line 38
    return p1

    .line 39
    :cond_26
    invoke-super {p0, p1, p2}, Lcom/voxdon/xplorer/file/x;->G(Ljava/lang/String;Ljava/lang/String;)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    return p1
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

.method public H(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;
    .registers 4

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->m0(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_28

    .line 10
    .line 11
    invoke-static {}, Lax/X2/Q;->r1()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_19

    .line 16
    .line 17
    sget-object v0, Lax/c3/z;->n0:Lax/c3/z;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->G()Lax/c3/z;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-ne v0, v1, :cond_19

    .line 24
    .line 25
    goto :goto_28

    .line 26
    :cond_19
    const-string v0, "epub"

    .line 27
    .line 28
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_26

    .line 37
    .line 38
    goto :goto_28

    .line 39
    :cond_26
    const/4 p1, 0x0

    .line 40
    return-object p1

    .line 41
    :cond_28
    :goto_28
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_33

    .line 46
    .line 47
    invoke-static {p1}, Lax/c3/B;->T(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    :cond_33
    invoke-static {p1}, Lax/c3/B;->W(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method protected I0(Lcom/voxdon/xplorer/file/n;Ljava/util/List;ZLjava/lang/String;ZLax/g3/h;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;Z",
            "Ljava/lang/String;",
            "Z",
            "Lax/g3/h;",
            ")V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p2, p4, p5, v0}, Lax/c3/B;->h(Ljava/util/List;Ljava/lang/String;ZZ)Ljava/util/List;

    .line 3
    .line 4
    .line 5
    move-result-object p2

    .line 6
    if-nez p2, :cond_8

    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    instance-of p4, p1, Lcom/voxdon/xplorer/file/v;

    .line 10
    .line 11
    if-eqz p4, :cond_32

    .line 12
    .line 13
    check-cast p1, Lcom/voxdon/xplorer/file/v;

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/v;->C1()Lcom/voxdon/xplorer/file/u$a;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_35

    .line 20
    .line 21
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p4

    .line 25
    :cond_18
    :goto_18
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result p5

    .line 29
    if-eqz p5, :cond_35

    .line 30
    .line 31
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p5

    .line 35
    check-cast p5, Lcom/voxdon/xplorer/file/n;

    .line 36
    .line 37
    invoke-virtual {p5}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p5

    .line 41
    invoke-virtual {p1, p5}, Lcom/voxdon/xplorer/file/u$a;->b(Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result p5

    .line 45
    if-nez p5, :cond_18

    .line 46
    .line 47
    invoke-interface {p4}, Ljava/util/Iterator;->remove()V

    .line 48
    .line 49
    .line 50
    goto :goto_18

    .line 51
    :cond_32
    invoke-static {}, Lax/u3/b;->f()V

    .line 52
    .line 53
    .line 54
    :cond_35
    invoke-interface {p6, p2, p3}, Lax/g3/h;->Y(Ljava/util/List;Z)V

    .line 55
    .line 56
    .line 57
    return-void
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
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
.end method

.method public M(Lcom/voxdon/xplorer/file/n;)Z
    .registers 3

    .line 1
    invoke-super {p0, p1}, Lcom/voxdon/xplorer/file/x;->M(Lcom/voxdon/xplorer/file/n;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_9

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/u;->U1(Lcom/voxdon/xplorer/file/n;)V

    .line 8
    .line 9
    .line 10
    :cond_9
    return v0
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

.method public P(Lcom/voxdon/xplorer/file/n;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_30

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/m;->b0(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_16

    .line 16
    .line 17
    invoke-static {p0, p1}, Lcom/voxdon/xplorer/file/u;->V1(Lcom/voxdon/xplorer/file/m;Lcom/voxdon/xplorer/file/n;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/u;->W1(Lcom/voxdon/xplorer/file/n;)V

    .line 21
    .line 22
    .line 23
    :cond_16
    instance-of v0, p1, Lcom/voxdon/xplorer/file/y;

    .line 24
    .line 25
    if-eqz v0, :cond_37

    .line 26
    .line 27
    move-object v0, p1

    .line 28
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_37

    .line 47
    .line 48
    return-void

    .line 49
    :cond_30
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-direct {p0, v0}, Lcom/voxdon/xplorer/file/u;->d2(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_37
    invoke-super {p0, p1}, Lcom/voxdon/xplorer/file/x;->P(Lcom/voxdon/xplorer/file/n;)V

    .line 57
    .line 58
    .line 59
    return-void
    .line 60
    .line 61
.end method

.method protected T1(Lcom/voxdon/xplorer/file/n;)Z
    .registers 2

    .line 1
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
    .line 6
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

.method public declared-synchronized U1(Lcom/voxdon/xplorer/file/n;)V
    .registers 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->T()Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    if-eqz v0, :cond_38

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-static {v1}, Lcom/voxdon/xplorer/file/u;->c2(Lax/Q2/f;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_38

    .line 21
    .line 22
    iget-object v0, p0, Lcom/voxdon/xplorer/file/u;->A:Ljava/util/HashSet;

    .line 23
    .line 24
    if-nez v0, :cond_23

    .line 25
    .line 26
    new-instance v0, Ljava/util/HashSet;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcom/voxdon/xplorer/file/u;->A:Ljava/util/HashSet;

    .line 32
    .line 33
    goto :goto_23

    .line 34
    :catchall_21
    move-exception p1

    .line 35
    goto :goto_3a

    .line 36
    :cond_23
    :goto_23
    iget-object v0, p0, Lcom/voxdon/xplorer/file/u;->A:Ljava/util/HashSet;

    .line 37
    .line 38
    invoke-static {v0, p1}, Lcom/voxdon/xplorer/file/m;->k(Ljava/util/Collection;Lcom/voxdon/xplorer/file/n;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_38

    .line 43
    .line 44
    iget-object v0, p0, Lcom/voxdon/xplorer/file/u;->A:Ljava/util/HashSet;

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/u;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_38
    .catchall {:try_start_1 .. :try_end_38} :catchall_21

    .line 55
    .line 56
    .line 57
    :cond_38
    monitor-exit p0

    .line 58
    return-void

    .line 59
    :goto_3a
    :try_start_3a
    monitor-exit p0
    :try_end_3b
    .catchall {:try_start_3a .. :try_end_3b} :catchall_21

    .line 60
    throw p1
    .line 61
.end method

.method public X1(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;
    .registers 5

    .line 1
    new-instance v0, Ljava/io/File;

    .line 2
    .line 3
    move-object v1, p1

    .line 4
    check-cast v1, Lcom/voxdon/xplorer/file/y;

    .line 5
    .line 6
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, ".folderimage"

    .line 11
    .line 12
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_30

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_30

    .line 26
    .line 27
    sget-object v1, Lcom/voxdon/xplorer/file/u;->D:Ljava/util/Map;

    .line 28
    .line 29
    sget-object v2, Lax/c3/z;->f0:Lax/c3/z;

    .line 30
    .line 31
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lcom/voxdon/xplorer/file/u$a;

    .line 36
    .line 37
    new-instance v2, Lcom/voxdon/xplorer/file/v;

    .line 38
    .line 39
    check-cast p1, Lcom/voxdon/xplorer/file/v;

    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {v2, p0, v0, v1, p1}, Lcom/voxdon/xplorer/file/v;-><init>(Lcom/voxdon/xplorer/file/u;Ljava/io/File;Lcom/voxdon/xplorer/file/u$a;Lax/c3/K;)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :cond_30
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/u;->Z1(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    sget-object v2, Lax/Q2/f;->A0:Lax/Q2/f;

    .line 58
    .line 59
    if-ne v1, v2, :cond_50

    .line 60
    .line 61
    if-eqz v0, :cond_50

    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {p0, v1}, Lcom/voxdon/xplorer/file/x;->K0(Ljava/lang/String;)Ljava/io/InputStream;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    if-nez v1, :cond_4d

    .line 72
    .line 73
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/file/u;->b2(Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    return-object p1

    .line 78
    :cond_4d
    :try_start_4d
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_50
    .catch Ljava/io/IOException; {:try_start_4d .. :try_end_50} :catch_50

    .line 79
    .line 80
    .line 81
    :catch_50
    :cond_50
    return-object v0
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
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public Y1()Lax/c3/z;
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/file/u;->z:Lax/c3/z;

    .line 2
    .line 3
    if-nez v0, :cond_e

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/m;->u()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lax/c3/A;->h(Lax/Q2/f;)Lax/c3/z;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/voxdon/xplorer/file/u;->z:Lax/c3/z;

    .line 14
    .line 15
    :cond_e
    iget-object v0, p0, Lcom/voxdon/xplorer/file/u;->z:Lax/c3/z;

    .line 16
    .line 17
    return-object v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public f2(Lcom/voxdon/xplorer/file/v;)Lcom/voxdon/xplorer/file/n;
    .registers 12

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/file/m;->b0(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    if-eqz v1, :cond_3c

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    move-object v5, v0

    .line 15
    :cond_e
    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    if-eqz v6, :cond_34

    .line 20
    .line 21
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    check-cast v6, Lcom/voxdon/xplorer/file/n;

    .line 26
    .line 27
    invoke-interface {v6}, Lax/c3/b;->h()Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-eqz v7, :cond_21

    .line 32
    .line 33
    goto :goto_e

    .line 34
    :cond_21
    if-nez v5, :cond_29

    .line 35
    .line 36
    invoke-interface {v6}, Lax/c3/b;->q()J

    .line 37
    .line 38
    .line 39
    move-result-wide v2

    .line 40
    move-object v5, v6

    .line 41
    goto :goto_e

    .line 42
    :cond_29
    invoke-interface {v6}, Lax/c3/b;->q()J

    .line 43
    .line 44
    .line 45
    move-result-wide v7

    .line 46
    cmp-long v9, v7, v2

    .line 47
    .line 48
    if-lez v9, :cond_e

    .line 49
    .line 50
    move-object v5, v6

    .line 51
    move-wide v2, v7

    .line 52
    goto :goto_e

    .line 53
    :cond_34
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    invoke-virtual {p1, v1}, Lcom/voxdon/xplorer/file/n;->d0(I)V

    .line 58
    .line 59
    .line 60
    goto :goto_3d

    .line 61
    :cond_3c
    move-object v5, v0

    .line 62
    :goto_3d
    if-eqz v5, :cond_4a

    .line 63
    .line 64
    invoke-virtual {v5}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {p1, v1}, Lcom/voxdon/xplorer/file/v;->I1(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v2, v3}, Lcom/voxdon/xplorer/file/v;->H1(J)V
    :try_end_49
    .catch Lax/b3/j; {:try_start_1 .. :try_end_49} :catch_4a

    .line 72
    .line 73
    .line 74
    return-object v5

    .line 75
    :catch_4a
    :cond_4a
    return-object v0
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
    .line 140
    .line 141
    .line 142
    .line 143
.end method

.method public g2(Lcom/voxdon/xplorer/file/n;Ljava/util/List;Z)Ljava/util/List;
    .registers 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/n;",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;Z)",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_4

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_4
    invoke-static {p1}, Lax/c3/d0;->E(Lcom/voxdon/xplorer/file/n;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_41

    .line 10
    .line 11
    iget-object v0, p0, Lcom/voxdon/xplorer/file/u;->A:Ljava/util/HashSet;

    .line 12
    .line 13
    if-eqz v0, :cond_41

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lcom/voxdon/xplorer/file/u;->A:Ljava/util/HashSet;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v2, 0x0

    .line 27
    :cond_1a
    :goto_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_37

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Lcom/voxdon/xplorer/file/n;

    .line 38
    .line 39
    invoke-interface {v3}, Lax/c3/b;->n()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_1a

    .line 44
    .line 45
    invoke-static {p2, v3}, Lcom/voxdon/xplorer/file/m;->k(Ljava/util/Collection;Lcom/voxdon/xplorer/file/n;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-nez v4, :cond_1a

    .line 50
    .line 51
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x1

    .line 55
    goto :goto_1a

    .line 56
    :cond_37
    if-eqz v2, :cond_41

    .line 57
    .line 58
    invoke-static {}, Lax/Z2/b;->k()Lax/Z2/b;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p2, p1, v0}, Lax/Z2/b;->m(Lcom/voxdon/xplorer/file/n;Ljava/util/List;)V

    .line 63
    .line 64
    .line 65
    move-object p2, v0

    .line 66
    :cond_41
    if-eqz p3, :cond_5f

    .line 67
    .line 68
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :cond_47
    :goto_47
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result p3

    .line 76
    if-eqz p3, :cond_5f

    .line 77
    .line 78
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    check-cast p3, Lcom/voxdon/xplorer/file/n;

    .line 83
    .line 84
    check-cast p3, Lcom/voxdon/xplorer/file/v;

    .line 85
    .line 86
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/y;->q0()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_47

    .line 91
    .line 92
    invoke-virtual {p0, p3}, Lcom/voxdon/xplorer/file/u;->f2(Lcom/voxdon/xplorer/file/v;)Lcom/voxdon/xplorer/file/n;

    .line 93
    .line 94
    .line 95
    goto :goto_47

    .line 96
    :cond_5f
    return-object p2
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
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
.end method

.method public z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;
    .registers 5

    .line 1
    new-instance v0, Lcom/voxdon/xplorer/file/v;

    .line 2
    .line 3
    new-instance v1, Ljava/io/File;

    .line 4
    .line 5
    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, Lcom/voxdon/xplorer/file/u;->D:Ljava/util/Map;

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/u;->Y1()Lax/c3/z;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lcom/voxdon/xplorer/file/u$a;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    invoke-direct {v0, p0, v1, p1, v2}, Lcom/voxdon/xplorer/file/v;-><init>(Lcom/voxdon/xplorer/file/u;Ljava/io/File;Lcom/voxdon/xplorer/file/u$a;Lax/c3/K;)V

    .line 22
    .line 23
    .line 24
    return-object v0
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

.method public z0(Ljava/io/File;Lax/c3/K;Z)Lcom/voxdon/xplorer/file/y;
    .registers 6

    .line 1
    if-eqz p3, :cond_1a

    .line 2
    .line 3
    new-instance p3, Lcom/voxdon/xplorer/file/y;

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-direct {p3, p0, p1, p2, v0}, Lcom/voxdon/xplorer/file/y;-><init>(Lcom/voxdon/xplorer/file/x;Ljava/io/File;Lax/c3/K;Z)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lcom/voxdon/xplorer/file/v;

    .line 10
    .line 11
    sget-object p2, Lcom/voxdon/xplorer/file/u;->D:Ljava/util/Map;

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/u;->Y1()Lax/c3/z;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    check-cast p2, Lcom/voxdon/xplorer/file/u$a;

    .line 22
    .line 23
    invoke-direct {p1, p0, p3, p2}, Lcom/voxdon/xplorer/file/v;-><init>(Lcom/voxdon/xplorer/file/x;Lcom/voxdon/xplorer/file/y;Lcom/voxdon/xplorer/file/u$a;)V

    .line 24
    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1a
    new-instance p3, Lcom/voxdon/xplorer/file/v;

    .line 28
    .line 29
    sget-object v0, Lcom/voxdon/xplorer/file/u;->D:Ljava/util/Map;

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/u;->Y1()Lax/c3/z;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, Lcom/voxdon/xplorer/file/u$a;

    .line 40
    .line 41
    invoke-direct {p3, p0, p1, v0, p2}, Lcom/voxdon/xplorer/file/v;-><init>(Lcom/voxdon/xplorer/file/u;Ljava/io/File;Lcom/voxdon/xplorer/file/u$a;Lax/c3/K;)V

    .line 42
    .line 43
    .line 44
    return-object p3
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
.end method
