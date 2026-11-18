.class public Lax/T2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/T2/h$g;,
        Lax/T2/h$f;,
        Lax/T2/h$i;,
        Lax/T2/h$h;,
        Lax/T2/h$e;
    }
.end annotation


# static fields
.field private static final p:Ljava/util/logging/Logger;

.field private static q:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lax/c3/K;",
            "Lax/T2/h;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final a:Lax/c3/K;

.field b:Z

.field c:Lax/T2/h$f;

.field d:Lax/T2/h$i;

.field e:Z

.field f:Z

.field private g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/T2/h$g;",
            ">;"
        }
    .end annotation
.end field

.field final h:Ljava/lang/Object;

.field final i:Ljava/lang/Object;

.field private j:Ljava/util/concurrent/CountDownLatch;

.field private k:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private l:Z

.field final m:Ljava/util/concurrent/atomic/AtomicInteger;

.field private n:Z

.field o:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lax/T2/h$h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-class v0, Lax/T2/h;

    .line 2
    .line 3
    invoke-static {v0}, Lax/Q2/g;->a(Ljava/lang/Class;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/T2/h;->p:Ljava/util/logging/Logger;

    .line 8
    .line 9
    new-instance v0, Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lax/T2/h;->q:Ljava/util/HashMap;

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method constructor <init>(Lax/c3/K;)V
    .registers 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/T2/h;->g:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lax/T2/h;->h:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lax/T2/h;->i:Ljava/lang/Object;

    .line 24
    .line 25
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lax/T2/h;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 32
    .line 33
    iput-boolean v1, p0, Lax/T2/h;->n:Z

    .line 34
    .line 35
    new-instance v0, Lax/T2/h$a;

    .line 36
    .line 37
    invoke-direct {v0, p0}, Lax/T2/h$a;-><init>(Lax/T2/h;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lax/T2/h;->o:Ljava/util/Comparator;

    .line 41
    .line 42
    iput-object p1, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 43
    .line 44
    iput-boolean v1, p0, Lax/T2/h;->e:Z

    .line 45
    .line 46
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, Lax/Q2/f;->x0(Lax/Q2/f;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iput-boolean p1, p0, Lax/T2/h;->l:Z

    .line 55
    .line 56
    return-void
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method static A(Landroid/content/Context;Lax/c3/K;)Ljava/io/File;
    .registers 4

    .line 1
    invoke-static {p0}, Lax/Q2/e;->q(Landroid/content/Context;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1}, Lax/c3/K;->b()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const-string v1, "analysis_"

    .line 10
    .line 11
    if-nez v0, :cond_24

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    goto :goto_47

    .line 37
    :cond_24
    new-instance v0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lax/c3/K;->d()Lax/Q2/f;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Lax/Q2/f;->I()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    const-string v1, ":"

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lax/c3/K;->b()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    :goto_47
    new-instance v0, Ljava/io/File;

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-direct {v0, p0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
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
.end method

.method public static B(Lax/c3/K;)Lax/c3/K;
    .registers 2

    .line 1
    sget-object v0, Lax/Q2/f;->i1:Lax/Q2/f;

    .line 2
    .line 3
    invoke-static {p0}, Lax/T2/h;->r(Lax/c3/K;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {v0, p0}, Lax/c3/K;->a(Lax/Q2/f;I)Lax/c3/K;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
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

.method public static C0(I)Z
    .registers 1

    .line 1
    if-nez p0, :cond_4

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_4
    const/4 p0, 0x0

    .line 6
    return p0
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

.method private D0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Lax/T2/h$e;)V
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    iget-object v0, p3, Lax/T2/h$e;->a:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {p0, v0, v1}, Lax/T2/h;->e0(Ljava/lang/String;Z)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-wide v2, p3, Lax/T2/h$e;->d:J

    .line 9
    .line 10
    invoke-direct {p0, p2, v0, v2, v3}, Lax/T2/h;->E0(Lax/T2/h$f;Ljava/lang/String;J)V

    .line 11
    .line 12
    .line 13
    iget-wide v2, p3, Lax/T2/h$e;->d:J

    .line 14
    .line 15
    const-wide/32 v4, 0x3200000

    .line 16
    .line 17
    .line 18
    cmp-long v6, v2, v4

    .line 19
    .line 20
    if-lez v6, :cond_26

    .line 21
    .line 22
    iget-object v4, p2, Lax/T2/h$f;->f:Ljava/util/ArrayList;

    .line 23
    .line 24
    new-instance v5, Lax/T2/h$h;

    .line 25
    .line 26
    invoke-direct {v5, v0, v2, v3, v1}, Lax/T2/h$h;-><init>(Ljava/lang/String;JZ)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    iget-wide v2, p2, Lax/T2/h$f;->p:J

    .line 33
    .line 34
    iget-wide v4, p3, Lax/T2/h$e;->d:J

    .line 35
    .line 36
    add-long/2addr v2, v4

    .line 37
    iput-wide v2, p2, Lax/T2/h$f;->p:J

    .line 38
    .line 39
    :cond_26
    invoke-static {v0}, Lax/U2/d;->Q(Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const-wide/16 v3, 0x0

    .line 44
    .line 45
    if-eqz v2, :cond_38

    .line 46
    .line 47
    iget-object v2, p2, Lax/T2/h$f;->h:Ljava/util/ArrayList;

    .line 48
    .line 49
    new-instance v5, Lax/T2/h$h;

    .line 50
    .line 51
    invoke-direct {v5, v0, v3, v4, v1}, Lax/T2/h$h;-><init>(Ljava/lang/String;JZ)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    :cond_38
    iget-wide v0, p3, Lax/T2/h$e;->e:J

    .line 58
    .line 59
    cmp-long v2, v0, v3

    .line 60
    .line 61
    if-lez v2, :cond_45

    .line 62
    .line 63
    iget-object v2, p2, Lax/T2/h$f;->e:Ljava/util/HashMap;

    .line 64
    .line 65
    sget-object v5, Lax/c3/z;->f0:Lax/c3/z;

    .line 66
    .line 67
    invoke-direct {p0, v2, v5, v0, v1}, Lax/T2/h;->e(Ljava/util/HashMap;Lax/c3/z;J)V

    .line 68
    .line 69
    .line 70
    :cond_45
    iget-wide v0, p3, Lax/T2/h$e;->f:J

    .line 71
    .line 72
    cmp-long v2, v0, v3

    .line 73
    .line 74
    if-lez v2, :cond_52

    .line 75
    .line 76
    iget-object v2, p2, Lax/T2/h$f;->e:Ljava/util/HashMap;

    .line 77
    .line 78
    sget-object v5, Lax/c3/z;->c0:Lax/c3/z;

    .line 79
    .line 80
    invoke-direct {p0, v2, v5, v0, v1}, Lax/T2/h;->e(Ljava/util/HashMap;Lax/c3/z;J)V

    .line 81
    .line 82
    .line 83
    :cond_52
    iget-wide v0, p3, Lax/T2/h$e;->g:J

    .line 84
    .line 85
    cmp-long v2, v0, v3

    .line 86
    .line 87
    if-lez v2, :cond_5f

    .line 88
    .line 89
    iget-object v2, p2, Lax/T2/h$f;->e:Ljava/util/HashMap;

    .line 90
    .line 91
    sget-object v5, Lax/c3/z;->e0:Lax/c3/z;

    .line 92
    .line 93
    invoke-direct {p0, v2, v5, v0, v1}, Lax/T2/h;->e(Ljava/util/HashMap;Lax/c3/z;J)V

    .line 94
    .line 95
    .line 96
    :cond_5f
    iget-wide v0, p3, Lax/T2/h$e;->h:J

    .line 97
    .line 98
    cmp-long v2, v0, v3

    .line 99
    .line 100
    if-lez v2, :cond_6c

    .line 101
    .line 102
    iget-object v2, p2, Lax/T2/h$f;->e:Ljava/util/HashMap;

    .line 103
    .line 104
    sget-object v5, Lax/c3/z;->v0:Lax/c3/z;

    .line 105
    .line 106
    invoke-direct {p0, v2, v5, v0, v1}, Lax/T2/h;->e(Ljava/util/HashMap;Lax/c3/z;J)V

    .line 107
    .line 108
    .line 109
    :cond_6c
    iget-wide v0, p3, Lax/T2/h$e;->i:J

    .line 110
    .line 111
    cmp-long v2, v0, v3

    .line 112
    .line 113
    if-lez v2, :cond_79

    .line 114
    .line 115
    iget-object v2, p2, Lax/T2/h$f;->e:Ljava/util/HashMap;

    .line 116
    .line 117
    sget-object v5, Lax/c3/z;->r0:Lax/c3/z;

    .line 118
    .line 119
    invoke-direct {p0, v2, v5, v0, v1}, Lax/T2/h;->e(Ljava/util/HashMap;Lax/c3/z;J)V

    .line 120
    .line 121
    .line 122
    :cond_79
    iget-wide v0, p3, Lax/T2/h$e;->j:J

    .line 123
    .line 124
    cmp-long v2, v0, v3

    .line 125
    .line 126
    if-lez v2, :cond_86

    .line 127
    .line 128
    iget-object v2, p2, Lax/T2/h$f;->e:Ljava/util/HashMap;

    .line 129
    .line 130
    sget-object v3, Lax/c3/z;->u0:Lax/c3/z;

    .line 131
    .line 132
    invoke-direct {p0, v2, v3, v0, v1}, Lax/T2/h;->e(Ljava/util/HashMap;Lax/c3/z;J)V

    .line 133
    .line 134
    .line 135
    :cond_86
    iget-boolean v0, p3, Lax/T2/h$e;->k:Z

    .line 136
    .line 137
    if-nez v0, :cond_8c

    .line 138
    .line 139
    goto/16 :goto_108

    .line 140
    .line 141
    :cond_8c
    iget-object v0, p3, Lax/T2/h$e;->b:Lcom/voxdon/xplorer/file/n;

    .line 142
    .line 143
    if-nez v0, :cond_98

    .line 144
    .line 145
    iget-object v0, p3, Lax/T2/h$e;->a:Ljava/lang/String;

    .line 146
    .line 147
    invoke-virtual {p1, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iput-object v0, p3, Lax/T2/h$e;->b:Lcom/voxdon/xplorer/file/n;

    .line 152
    .line 153
    :cond_98
    iget-object v0, p3, Lax/T2/h$e;->b:Lcom/voxdon/xplorer/file/n;

    .line 154
    .line 155
    invoke-interface {v0}, Lax/c3/b;->isDirectory()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-nez v0, :cond_ac

    .line 160
    .line 161
    iget-object p1, p3, Lax/T2/h$e;->b:Lcom/voxdon/xplorer/file/n;

    .line 162
    .line 163
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    const-string p2, ".android_secure"

    .line 168
    .line 169
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_ac
    :try_start_ac
    iget-object p3, p3, Lax/T2/h$e;->b:Lcom/voxdon/xplorer/file/n;

    .line 174
    .line 175
    invoke-direct {p0, p1, p3}, Lax/T2/h;->z0(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object p1
    :try_end_b2
    .catch Lax/b3/e; {:try_start_ac .. :try_end_b2} :catch_b3

    .line 179
    goto :goto_b4

    .line 180
    :catch_b3
    const/4 p1, 0x0

    .line 181
    :goto_b4
    if-eqz p1, :cond_108

    .line 182
    .line 183
    new-instance p3, Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    :cond_bf
    :goto_bf
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v0

    .line 196
    if-eqz v0, :cond_d5

    .line 197
    .line 198
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    check-cast v0, Lcom/voxdon/xplorer/file/n;

    .line 203
    .line 204
    invoke-interface {v0}, Lax/c3/b;->isDirectory()Z

    .line 205
    .line 206
    .line 207
    move-result v1

    .line 208
    if-nez v1, :cond_bf

    .line 209
    .line 210
    invoke-virtual {p3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    goto :goto_bf

    .line 214
    :cond_d5
    invoke-virtual {p3}, Ljava/util/ArrayList;->size()I

    .line 215
    .line 216
    .line 217
    move-result p1

    .line 218
    const/4 v0, 0x0

    .line 219
    const/4 v1, 0x0

    .line 220
    :cond_db
    :goto_db
    if-ge v1, p1, :cond_108

    .line 221
    .line 222
    invoke-virtual {p3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v2

    .line 226
    add-int/lit8 v1, v1, 0x1

    .line 227
    .line 228
    check-cast v2, Lcom/voxdon/xplorer/file/n;

    .line 229
    .line 230
    invoke-interface {v2}, Lax/c3/b;->p()J

    .line 231
    .line 232
    .line 233
    move-result-wide v3

    .line 234
    const-wide/32 v5, 0xa00000

    .line 235
    .line 236
    .line 237
    cmp-long v7, v3, v5

    .line 238
    .line 239
    if-lez v7, :cond_db

    .line 240
    .line 241
    iget-object v5, p2, Lax/T2/h$f;->g:Ljava/util/ArrayList;

    .line 242
    .line 243
    new-instance v6, Lax/T2/h$h;

    .line 244
    .line 245
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    invoke-direct {p0, v2, v0}, Lax/T2/h;->e0(Ljava/lang/String;Z)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    invoke-direct {v6, v2, v3, v4, v0}, Lax/T2/h$h;-><init>(Ljava/lang/String;JZ)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    iget-wide v5, p2, Lax/T2/h$f;->o:J

    .line 260
    .line 261
    add-long/2addr v5, v3

    .line 262
    iput-wide v5, p2, Lax/T2/h$f;->o:J

    .line 263
    .line 264
    goto :goto_db

    .line 265
    :cond_108
    :goto_108
    return-void
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

.method private E0(Lax/T2/h$f;Ljava/lang/String;J)V
    .registers 9

    .line 1
    :goto_0
    iget-object v0, p1, Lax/T2/h$f;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Long;

    .line 8
    .line 9
    if-eqz v0, :cond_19

    .line 10
    .line 11
    iget-object v1, p1, Lax/T2/h$f;->d:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    add-long/2addr v2, p3

    .line 18
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v1, p2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    goto :goto_22

    .line 26
    :cond_19
    iget-object v0, p1, Lax/T2/h$f;->d:Ljava/util/HashMap;

    .line 27
    .line 28
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, p2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :goto_22
    const-string v0, "/"

    .line 36
    .line 37
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-eqz v0, :cond_2b

    .line 42
    .line 43
    return-void

    .line 44
    :cond_2b
    invoke-static {p2}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    goto :goto_0
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

.method private K0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Ljava/lang/String;[Ljava/lang/String;)V
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    const/4 v0, 0x2

    .line 2
    aget-object p4, p4, v0

    .line 3
    .line 4
    const-string v1, "/"

    .line 5
    .line 6
    invoke-virtual {p4, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p4

    .line 10
    new-instance v1, Lax/T2/h$e;

    .line 11
    .line 12
    invoke-direct {v1}, Lax/T2/h$e;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    aget-object v3, p4, v2

    .line 17
    .line 18
    invoke-static {v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide v3

    .line 26
    iput-wide v3, v1, Lax/T2/h$e;->d:J

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    aget-object v3, p4, v3

    .line 30
    .line 31
    invoke-static {v3}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    iput-wide v3, v1, Lax/T2/h$e;->e:J

    .line 40
    .line 41
    aget-object v0, p4, v0

    .line 42
    .line 43
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    iput-wide v3, v1, Lax/T2/h$e;->f:J

    .line 52
    .line 53
    const/4 v0, 0x3

    .line 54
    aget-object v0, p4, v0

    .line 55
    .line 56
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 61
    .line 62
    .line 63
    move-result-wide v3

    .line 64
    iput-wide v3, v1, Lax/T2/h$e;->g:J

    .line 65
    .line 66
    const/4 v0, 0x4

    .line 67
    aget-object v0, p4, v0

    .line 68
    .line 69
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 74
    .line 75
    .line 76
    move-result-wide v3

    .line 77
    iput-wide v3, v1, Lax/T2/h$e;->h:J

    .line 78
    .line 79
    const/4 v0, 0x5

    .line 80
    aget-object v0, p4, v0

    .line 81
    .line 82
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 87
    .line 88
    .line 89
    move-result-wide v3

    .line 90
    iput-wide v3, v1, Lax/T2/h$e;->i:J

    .line 91
    .line 92
    const/4 v0, 0x6

    .line 93
    aget-object v0, p4, v0

    .line 94
    .line 95
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v3

    .line 103
    iput-wide v3, v1, Lax/T2/h$e;->j:J

    .line 104
    .line 105
    const/4 v0, 0x7

    .line 106
    aget-object v0, p4, v0

    .line 107
    .line 108
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    iput-boolean v0, v1, Lax/T2/h$e;->k:Z

    .line 117
    .line 118
    const/16 v0, 0x8

    .line 119
    .line 120
    aget-object v0, p4, v0

    .line 121
    .line 122
    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 127
    .line 128
    .line 129
    move-result-wide v3

    .line 130
    iput-wide v3, v1, Lax/T2/h$e;->l:J

    .line 131
    .line 132
    const/16 v0, 0x9

    .line 133
    .line 134
    aget-object p4, p4, v0

    .line 135
    .line 136
    invoke-static {p4}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 137
    .line 138
    .line 139
    move-result-object p4

    .line 140
    invoke-virtual {p4}, Ljava/lang/Long;->longValue()J

    .line 141
    .line 142
    .line 143
    move-result-wide v3

    .line 144
    iput-wide v3, v1, Lax/T2/h$e;->m:J

    .line 145
    .line 146
    iput-boolean v2, v1, Lax/T2/h$e;->c:Z

    .line 147
    .line 148
    const/4 p4, 0x0

    .line 149
    iput-object p4, v1, Lax/T2/h$e;->b:Lcom/voxdon/xplorer/file/n;

    .line 150
    .line 151
    iput-object p3, v1, Lax/T2/h$e;->a:Ljava/lang/String;

    .line 152
    .line 153
    invoke-direct {p0, p1, p2, v1}, Lax/T2/h;->D0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Lax/T2/h$e;)V

    .line 154
    .line 155
    .line 156
    return-void
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
.end method

.method private M0(Ljava/util/List;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/T2/h$h;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/T2/h;->o:Ljava/util/Comparator;

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

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

.method private Q0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Lcom/voxdon/xplorer/file/n;Ljava/util/List;Ljava/io/Writer;Z)V
    .registers 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/o;",
            "Lax/T2/h$f;",
            "Lcom/voxdon/xplorer/file/n;",
            "Ljava/util/List<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;",
            "Ljava/io/Writer;",
            "Z)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p3}, Lax/T2/h;->d0(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lax/T2/h$e;

    .line 6
    .line 7
    invoke-direct {v0}, Lax/T2/h$e;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p3, v0, Lax/T2/h$e;->b:Lcom/voxdon/xplorer/file/n;

    .line 11
    .line 12
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, v0, Lax/T2/h$e;->a:Ljava/lang/String;

    .line 17
    .line 18
    if-eqz p6, :cond_18

    .line 19
    .line 20
    const-wide/16 v1, 0x1

    .line 21
    .line 22
    iput-wide v1, v0, Lax/T2/h$e;->m:J

    .line 23
    .line 24
    goto :goto_1e

    .line 25
    :cond_18
    invoke-interface {p3}, Lax/c3/b;->q()J

    .line 26
    .line 27
    .line 28
    move-result-wide v1

    .line 29
    iput-wide v1, v0, Lax/T2/h$e;->m:J

    .line 30
    .line 31
    :goto_1e
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p4

    .line 35
    :cond_22
    :goto_22
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result p6

    .line 39
    const/4 v1, 0x0

    .line 40
    const/4 v2, 0x1

    .line 41
    if-eqz p6, :cond_ae

    .line 42
    .line 43
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p6

    .line 47
    check-cast p6, Lcom/voxdon/xplorer/file/n;

    .line 48
    .line 49
    :try_start_30
    invoke-interface {p6}, Lax/c3/b;->p()J

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    invoke-virtual {p6}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-static {v5}, Lax/c3/d0;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-static {v5}, Lax/c3/A;->g(Ljava/lang/String;)Lax/c3/z;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-static {v5}, Lax/c3/A;->i(Lax/c3/z;)Lax/c3/z;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    iget-wide v7, v0, Lax/T2/h$e;->d:J

    .line 70
    .line 71
    add-long/2addr v7, v3

    .line 72
    iput-wide v7, v0, Lax/T2/h$e;->d:J

    .line 73
    .line 74
    sget-object v7, Lax/c3/z;->v0:Lax/c3/z;

    .line 75
    .line 76
    if-ne v7, v6, :cond_55

    .line 77
    .line 78
    iget-wide v6, v0, Lax/T2/h$e;->h:J

    .line 79
    .line 80
    add-long/2addr v6, v3

    .line 81
    iput-wide v6, v0, Lax/T2/h$e;->h:J

    .line 82
    .line 83
    goto :goto_82

    .line 84
    :catch_53
    nop

    .line 85
    goto :goto_22

    .line 86
    :cond_55
    sget-object v6, Lax/c3/z;->f0:Lax/c3/z;

    .line 87
    .line 88
    if-ne v6, v5, :cond_5f

    .line 89
    .line 90
    iget-wide v6, v0, Lax/T2/h$e;->e:J

    .line 91
    .line 92
    add-long/2addr v6, v3

    .line 93
    iput-wide v6, v0, Lax/T2/h$e;->e:J

    .line 94
    .line 95
    goto :goto_82

    .line 96
    :cond_5f
    sget-object v6, Lax/c3/z;->c0:Lax/c3/z;

    .line 97
    .line 98
    if-ne v6, v5, :cond_69

    .line 99
    .line 100
    iget-wide v6, v0, Lax/T2/h$e;->f:J

    .line 101
    .line 102
    add-long/2addr v6, v3

    .line 103
    iput-wide v6, v0, Lax/T2/h$e;->f:J

    .line 104
    .line 105
    goto :goto_82

    .line 106
    :cond_69
    sget-object v6, Lax/c3/z;->e0:Lax/c3/z;

    .line 107
    .line 108
    if-ne v6, v5, :cond_73

    .line 109
    .line 110
    iget-wide v6, v0, Lax/T2/h$e;->g:J

    .line 111
    .line 112
    add-long/2addr v6, v3

    .line 113
    iput-wide v6, v0, Lax/T2/h$e;->g:J

    .line 114
    .line 115
    goto :goto_82

    .line 116
    :cond_73
    sget-object v6, Lax/c3/z;->r0:Lax/c3/z;

    .line 117
    .line 118
    if-ne v6, v5, :cond_7d

    .line 119
    .line 120
    iget-wide v6, v0, Lax/T2/h$e;->i:J

    .line 121
    .line 122
    add-long/2addr v6, v3

    .line 123
    iput-wide v6, v0, Lax/T2/h$e;->i:J

    .line 124
    .line 125
    goto :goto_82

    .line 126
    :cond_7d
    iget-wide v6, v0, Lax/T2/h$e;->j:J

    .line 127
    .line 128
    add-long/2addr v6, v3

    .line 129
    iput-wide v6, v0, Lax/T2/h$e;->j:J

    .line 130
    .line 131
    :goto_82
    iget-object v6, p2, Lax/T2/h$f;->e:Ljava/util/HashMap;

    .line 132
    .line 133
    invoke-direct {p0, v6, v5, v3, v4}, Lax/T2/h;->e(Ljava/util/HashMap;Lax/c3/z;J)V

    .line 134
    .line 135
    .line 136
    const-wide/32 v5, 0xa00000

    .line 137
    .line 138
    .line 139
    cmp-long v7, v3, v5

    .line 140
    .line 141
    if-lez v7, :cond_22

    .line 142
    .line 143
    iput-boolean v2, v0, Lax/T2/h$e;->k:Z

    .line 144
    .line 145
    iget-wide v5, v0, Lax/T2/h$e;->l:J

    .line 146
    .line 147
    add-long/2addr v5, v3

    .line 148
    iput-wide v5, v0, Lax/T2/h$e;->l:J

    .line 149
    .line 150
    iget-object v2, p2, Lax/T2/h$f;->g:Ljava/util/ArrayList;

    .line 151
    .line 152
    new-instance v5, Lax/T2/h$h;

    .line 153
    .line 154
    invoke-virtual {p6}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p6

    .line 158
    invoke-direct {p0, p6, v1}, Lax/T2/h;->e0(Ljava/lang/String;Z)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p6

    .line 162
    invoke-direct {v5, p6, v3, v4, v1}, Lax/T2/h$h;-><init>(Ljava/lang/String;JZ)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    iget-wide v1, p2, Lax/T2/h$f;->o:J

    .line 169
    .line 170
    add-long/2addr v1, v3

    .line 171
    iput-wide v1, p2, Lax/T2/h$f;->o:J
    :try_end_ac
    .catch Ljava/lang/IllegalArgumentException; {:try_start_30 .. :try_end_ac} :catch_53

    .line 172
    .line 173
    goto/16 :goto_22

    .line 174
    .line 175
    :cond_ae
    new-instance p4, Ljava/lang/StringBuffer;

    .line 176
    .line 177
    invoke-direct {p4}, Ljava/lang/StringBuffer;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p3

    .line 184
    invoke-static {p3}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p3

    .line 188
    invoke-virtual {p4, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 189
    .line 190
    .line 191
    const-string p3, "\u0000"

    .line 192
    .line 193
    invoke-virtual {p4, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 194
    .line 195
    .line 196
    iget-wide v3, v0, Lax/T2/h$e;->m:J

    .line 197
    .line 198
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p6

    .line 202
    invoke-virtual {p4, p6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p4, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 206
    .line 207
    .line 208
    iget-wide v3, v0, Lax/T2/h$e;->d:J

    .line 209
    .line 210
    invoke-virtual {p4, v3, v4}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 211
    .line 212
    .line 213
    const-string p3, "/"

    .line 214
    .line 215
    invoke-virtual {p4, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 216
    .line 217
    .line 218
    iget-wide v3, v0, Lax/T2/h$e;->e:J

    .line 219
    .line 220
    invoke-virtual {p4, v3, v4}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p4, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 224
    .line 225
    .line 226
    iget-wide v3, v0, Lax/T2/h$e;->f:J

    .line 227
    .line 228
    invoke-virtual {p4, v3, v4}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p4, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 232
    .line 233
    .line 234
    iget-wide v3, v0, Lax/T2/h$e;->g:J

    .line 235
    .line 236
    invoke-virtual {p4, v3, v4}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 237
    .line 238
    .line 239
    invoke-virtual {p4, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 240
    .line 241
    .line 242
    iget-wide v3, v0, Lax/T2/h$e;->h:J

    .line 243
    .line 244
    invoke-virtual {p4, v3, v4}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 245
    .line 246
    .line 247
    invoke-virtual {p4, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 248
    .line 249
    .line 250
    iget-wide v3, v0, Lax/T2/h$e;->i:J

    .line 251
    .line 252
    invoke-virtual {p4, v3, v4}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 253
    .line 254
    .line 255
    invoke-virtual {p4, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 256
    .line 257
    .line 258
    iget-wide v3, v0, Lax/T2/h$e;->j:J

    .line 259
    .line 260
    invoke-virtual {p4, v3, v4}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 261
    .line 262
    .line 263
    invoke-virtual {p4, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 264
    .line 265
    .line 266
    iget-boolean p6, v0, Lax/T2/h$e;->k:Z

    .line 267
    .line 268
    invoke-virtual {p4, p6}, Ljava/lang/StringBuffer;->append(Z)Ljava/lang/StringBuffer;

    .line 269
    .line 270
    .line 271
    invoke-virtual {p4, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 272
    .line 273
    .line 274
    iget-wide v3, v0, Lax/T2/h$e;->l:J

    .line 275
    .line 276
    invoke-virtual {p4, v3, v4}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 277
    .line 278
    .line 279
    invoke-virtual {p4, p3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 280
    .line 281
    .line 282
    iget-wide v3, v0, Lax/T2/h$e;->m:J

    .line 283
    .line 284
    invoke-virtual {p4, v3, v4}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;

    .line 285
    .line 286
    .line 287
    iput-boolean v2, v0, Lax/T2/h$e;->c:Z

    .line 288
    .line 289
    invoke-static {p1}, Lax/U2/d;->Q(Ljava/lang/String;)Z

    .line 290
    .line 291
    .line 292
    move-result p3

    .line 293
    if-eqz p3, :cond_132

    .line 294
    .line 295
    iget-object p3, p2, Lax/T2/h$f;->h:Ljava/util/ArrayList;

    .line 296
    .line 297
    new-instance p6, Lax/T2/h$h;

    .line 298
    .line 299
    const-wide/16 v3, 0x0

    .line 300
    .line 301
    invoke-direct {p6, p1, v3, v4, v2}, Lax/T2/h$h;-><init>(Ljava/lang/String;JZ)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {p3, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    :cond_132
    iget-wide v3, v0, Lax/T2/h$e;->d:J

    .line 308
    .line 309
    const-wide/32 v5, 0x3200000

    .line 310
    .line 311
    .line 312
    cmp-long p3, v3, v5

    .line 313
    .line 314
    if-lez p3, :cond_14c

    .line 315
    .line 316
    iget-object p3, p2, Lax/T2/h$f;->f:Ljava/util/ArrayList;

    .line 317
    .line 318
    new-instance p6, Lax/T2/h$h;

    .line 319
    .line 320
    invoke-direct {p6, p1, v3, v4, v2}, Lax/T2/h$h;-><init>(Ljava/lang/String;JZ)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {p3, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 324
    .line 325
    .line 326
    iget-wide v2, p2, Lax/T2/h$f;->p:J

    .line 327
    .line 328
    iget-wide v4, v0, Lax/T2/h$e;->d:J

    .line 329
    .line 330
    add-long/2addr v2, v4

    .line 331
    iput-wide v2, p2, Lax/T2/h$f;->p:J

    .line 332
    .line 333
    :cond_14c
    iget-wide v2, v0, Lax/T2/h$e;->d:J

    .line 334
    .line 335
    invoke-direct {p0, p2, p1, v2, v3}, Lax/T2/h;->E0(Lax/T2/h$f;Ljava/lang/String;J)V

    .line 336
    .line 337
    .line 338
    const-string p2, "\n"

    .line 339
    .line 340
    invoke-virtual {p4, p2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 341
    .line 342
    .line 343
    if-eqz p5, :cond_15f

    .line 344
    .line 345
    invoke-virtual {p4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object p2

    .line 349
    invoke-virtual {p5, p2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 350
    .line 351
    .line 352
    :cond_15f
    invoke-direct {p0, p1, v1}, Lax/T2/h;->v(Ljava/lang/String;Z)V

    .line 353
    .line 354
    .line 355
    return-void
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

.method public static S(Lax/c3/K;)Lax/T2/h;
    .registers 3

    .line 1
    sget-object v0, Lax/T2/h;->q:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lax/T2/h;

    .line 8
    .line 9
    if-nez v0, :cond_1f

    .line 10
    .line 11
    invoke-virtual {p0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-static {v0}, Lax/Q2/f;->U(Lax/Q2/f;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Lax/T2/h;

    .line 23
    .line 24
    invoke-direct {v0, p0}, Lax/T2/h;-><init>(Lax/c3/K;)V

    .line 25
    .line 26
    .line 27
    sget-object v1, Lax/T2/h;->q:Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-virtual {v1, p0, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :cond_1f
    return-object v0
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

.method public static T(Lcom/voxdon/xplorer/file/n;)Lax/T2/h;
    .registers 3

    .line 1
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v1}, Lax/Q2/f;->U(Lax/Q2/f;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_13

    .line 14
    .line 15
    invoke-static {v0}, Lax/T2/h;->S(Lax/c3/K;)Lax/T2/h;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_13
    invoke-virtual {v0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lax/Q2/f;->S(Lax/Q2/f;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2a

    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/voxdon/xplorer/file/n;->L()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {p0}, Lax/T2/h;->q(I)Lax/c3/K;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-static {p0}, Lax/T2/h;->S(Lax/c3/K;)Lax/T2/h;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :cond_2a
    const-string p0, "NOT REACHABLE : invalid fileinfo"

    .line 44
    .line 45
    invoke-static {p0}, Lax/u3/b;->g(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 p0, 0x0

    .line 49
    return-object p0
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

.method static synthetic a(Lax/T2/h;Ljava/lang/String;Z)V
    .registers 3

    .line 1
    invoke-direct {p0, p1, p2}, Lax/T2/h;->v(Ljava/lang/String;Z)V

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
.end method

.method public static a0()Lax/T2/h;
    .registers 3

    .line 1
    sget-object v0, Lax/Q2/f;->o1:Lax/Q2/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lax/c3/K;->a(Lax/Q2/f;I)Lax/c3/K;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sget-object v1, Lax/T2/h;->q:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, Lax/T2/h;

    .line 15
    .line 16
    if-nez v1, :cond_1b

    .line 17
    .line 18
    new-instance v1, Lax/T2/h;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lax/T2/h;-><init>(Lax/c3/K;)V

    .line 21
    .line 22
    .line 23
    sget-object v2, Lax/T2/h;->q:Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_1b
    return-object v1
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
.end method

.method public static b0(Lax/c3/K;)Lax/c3/K;
    .registers 2

    .line 1
    sget-object v0, Lax/Q2/f;->o1:Lax/Q2/f;

    .line 2
    .line 3
    invoke-static {p0}, Lax/T2/h;->r(Lax/c3/K;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    invoke-static {v0, p0}, Lax/c3/K;->a(Lax/Q2/f;I)Lax/c3/K;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
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

.method private d(Ljava/util/HashMap;Ljava/lang/String;J)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Lax/c3/z;",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/lang/String;",
            "J)V"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lax/c3/A;->g(Ljava/lang/String;)Lax/c3/z;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-nez p2, :cond_8

    .line 6
    .line 7
    sget-object p2, Lax/c3/z;->u0:Lax/c3/z;

    .line 8
    .line 9
    :cond_8
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Long;

    .line 14
    .line 15
    if-eqz v0, :cond_1d

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    add-long/2addr v0, p3

    .line 22
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object p3

    .line 26
    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1d
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    return-void
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
.end method

.method private d0(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {v0, v1, p1}, Lax/c3/d0;->v(Lax/c3/K;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
    .line 20
    .line 21
    .line 22
.end method

.method private e(Ljava/util/HashMap;Lax/c3/z;J)V
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashMap<",
            "Lax/c3/z;",
            "Ljava/lang/Long;",
            ">;",
            "Lax/c3/z;",
            "J)V"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_4

    .line 2
    .line 3
    sget-object p2, Lax/c3/z;->u0:Lax/c3/z;

    .line 4
    .line 5
    :cond_4
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Long;

    .line 10
    .line 11
    if-eqz v0, :cond_19

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    add-long/2addr v0, p3

    .line 18
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_19
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    invoke-virtual {p1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-void
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
.end method

.method private e0(Ljava/lang/String;Z)Ljava/lang/String;
    .registers 4

    .line 1
    iget-object v0, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 2
    .line 3
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-static {v0, p1, p2}, Lax/c3/d0;->v(Lax/c3/K;Ljava/lang/String;Ljava/lang/Boolean;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
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
.end method

.method private g(Landroid/content/Context;Lax/T2/h$f;Lax/c3/K;)V
    .registers 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual/range {p3 .. p3}, Lax/c3/K;->e()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    if-nez v2, :cond_c

    .line 10
    .line 11
    goto/16 :goto_100

    .line 12
    .line 13
    :cond_c
    invoke-static {v0}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Lax/U2/d;->B()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string v3, "storage"

    .line 22
    .line 23
    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    check-cast v3, Landroid/os/storage/StorageManager;

    .line 28
    .line 29
    :try_start_1c
    new-instance v4, Ljava/io/File;

    .line 30
    .line 31
    invoke-virtual/range {p3 .. p3}, Lax/c3/K;->e()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v3, v4}, Lax/T2/a;->a(Landroid/os/storage/StorageManager;Ljava/io/File;)Ljava/util/UUID;

    .line 39
    .line 40
    .line 41
    move-result-object v3
    :try_end_29
    .catch Ljava/io/IOException; {:try_start_1c .. :try_end_29} :catch_100

    .line 42
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    :cond_2d
    :goto_2d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_43

    .line 51
    .line 52
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Lax/U2/f;

    .line 57
    .line 58
    invoke-virtual {v5}, Lax/U2/f;->F()Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-eqz v5, :cond_2d

    .line 63
    .line 64
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 65
    .line 66
    .line 67
    goto :goto_2d

    .line 68
    :cond_43
    invoke-static {}, Lax/T2/b;->a()Ljava/util/UUID;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-virtual {v4, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    const-wide/16 v5, 0x0

    .line 77
    .line 78
    if-eqz v4, :cond_8b

    .line 79
    .line 80
    invoke-static {v0}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const/4 v3, 0x1

    .line 85
    invoke-virtual {v0, v2, v3}, Lax/U2/d;->i(Ljava/util/List;Z)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    move-wide v3, v5

    .line 93
    move-wide v7, v3

    .line 94
    move-wide v9, v7

    .line 95
    :goto_5e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v11

    .line 99
    if-eqz v11, :cond_d1

    .line 100
    .line 101
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v11

    .line 105
    check-cast v11, Lax/U2/f;

    .line 106
    .line 107
    invoke-virtual {v11}, Lax/U2/f;->z()Z

    .line 108
    .line 109
    .line 110
    move-result v12

    .line 111
    if-eqz v12, :cond_85

    .line 112
    .line 113
    invoke-virtual {v11}, Lax/U2/f;->u()J

    .line 114
    .line 115
    .line 116
    move-result-wide v12

    .line 117
    add-long/2addr v5, v12

    .line 118
    invoke-virtual {v11}, Lax/U2/f;->v()J

    .line 119
    .line 120
    .line 121
    move-result-wide v12

    .line 122
    add-long/2addr v3, v12

    .line 123
    invoke-virtual {v11}, Lax/U2/f;->w()J

    .line 124
    .line 125
    .line 126
    move-result-wide v12

    .line 127
    add-long/2addr v7, v12

    .line 128
    invoke-virtual {v11}, Lax/U2/f;->e()J

    .line 129
    .line 130
    .line 131
    move-result-wide v11

    .line 132
    add-long/2addr v9, v11

    .line 133
    goto :goto_5e

    .line 134
    :cond_85
    invoke-virtual {v11}, Lax/U2/f;->b()J

    .line 135
    .line 136
    .line 137
    move-result-wide v11

    .line 138
    add-long/2addr v5, v11

    .line 139
    goto :goto_5e

    .line 140
    :cond_8b
    const-string v4, "storagestats"

    .line 141
    .line 142
    invoke-virtual {v0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-static {v0}, Lax/T2/c;->a(Ljava/lang/Object;)Landroid/app/usage/StorageStatsManager;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-static {}, Landroid/os/Process;->myUserHandle()Landroid/os/UserHandle;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v8

    .line 158
    move-wide v9, v5

    .line 159
    move-wide v11, v9

    .line 160
    move-wide v13, v11

    .line 161
    :goto_a0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v0

    .line 165
    if-eqz v0, :cond_cd

    .line 166
    .line 167
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    check-cast v0, Lax/U2/f;

    .line 172
    .line 173
    :try_start_ac
    invoke-virtual {v0}, Lax/U2/f;->r()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-static {v4, v3, v0, v7}, Lax/T2/d;->a(Landroid/app/usage/StorageStatsManager;Ljava/util/UUID;Ljava/lang/String;Landroid/os/UserHandle;)Landroid/app/usage/StorageStats;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-static {v0}, Lax/T2/e;->a(Landroid/app/usage/StorageStats;)J

    .line 182
    .line 183
    .line 184
    move-result-wide v15

    .line 185
    add-long/2addr v11, v15

    .line 186
    invoke-static {v0}, Lax/T2/f;->a(Landroid/app/usage/StorageStats;)J

    .line 187
    .line 188
    .line 189
    move-result-wide v15

    .line 190
    add-long/2addr v9, v15

    .line 191
    invoke-static {v0}, Lax/T2/g;->a(Landroid/app/usage/StorageStats;)J

    .line 192
    .line 193
    .line 194
    move-result-wide v15
    :try_end_c2
    .catch Ljava/io/IOException; {:try_start_ac .. :try_end_c2} :catch_c8
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_ac .. :try_end_c2} :catch_c6
    .catch Ljava/lang/SecurityException; {:try_start_ac .. :try_end_c2} :catch_c4

    .line 195
    add-long/2addr v13, v15

    .line 196
    goto :goto_a0

    .line 197
    :catch_c4
    move-exception v0

    .line 198
    goto :goto_c9

    .line 199
    :catch_c6
    move-exception v0

    .line 200
    goto :goto_c9

    .line 201
    :catch_c8
    move-exception v0

    .line 202
    :goto_c9
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 203
    .line 204
    .line 205
    goto :goto_a0

    .line 206
    :cond_cd
    move-wide v3, v9

    .line 207
    move-wide v7, v13

    .line 208
    move-wide v9, v5

    .line 209
    move-wide v5, v11

    .line 210
    :cond_d1
    const-string v0, "SizeDown"

    .line 211
    .line 212
    invoke-static {v0}, Lax/U2/f;->d(Ljava/lang/String;)Ljava/util/Comparator;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    if-eqz v0, :cond_e0

    .line 217
    .line 218
    :try_start_d9
    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 219
    .line 220
    .line 221
    iput-object v2, v1, Lax/T2/h$f;->j:Ljava/util/List;
    :try_end_de
    .catch Ljava/lang/IllegalArgumentException; {:try_start_d9 .. :try_end_de} :catch_df

    .line 222
    .line 223
    goto :goto_e0

    .line 224
    :catch_df
    nop

    .line 225
    :cond_e0
    :goto_e0
    iput-wide v5, v1, Lax/T2/h$f;->s:J

    .line 226
    .line 227
    iput-wide v3, v1, Lax/T2/h$f;->t:J

    .line 228
    .line 229
    iput-wide v7, v1, Lax/T2/h$f;->u:J

    .line 230
    .line 231
    iput-wide v9, v1, Lax/T2/h$f;->v:J

    .line 232
    .line 233
    invoke-static {}, Lax/X2/Q;->V0()Z

    .line 234
    .line 235
    .line 236
    move-result v0

    .line 237
    if-eqz v0, :cond_100

    .line 238
    .line 239
    new-instance v0, Ljava/util/ArrayList;

    .line 240
    .line 241
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 242
    .line 243
    .line 244
    const-string v2, "ExternalCacheSizeDown"

    .line 245
    .line 246
    invoke-static {v2}, Lax/U2/f;->d(Ljava/lang/String;)Ljava/util/Comparator;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    if-eqz v2, :cond_100

    .line 251
    .line 252
    :try_start_fb
    invoke-static {v0, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 253
    .line 254
    .line 255
    iput-object v0, v1, Lax/T2/h$f;->l:Ljava/util/List;
    :try_end_100
    .catch Ljava/lang/IllegalArgumentException; {:try_start_fb .. :try_end_100} :catch_100

    .line 256
    .line 257
    :catch_100
    :cond_100
    :goto_100
    return-void
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

.method private g0()J
    .registers 3

    .line 1
    const-wide v0, 0x7fffffffffffffffL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    return-wide v0
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

.method private h(Lax/T2/h$i;Lax/c3/K;)V
    .registers 12
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lax/T2/h;->b0(Lax/c3/K;)Lax/c3/K;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p2}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p2}, Lax/c3/K;->e()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {v0, p2}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-virtual {v0, p2}, Lcom/voxdon/xplorer/file/o;->f0(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    const-string v0, "DateDownNoSeparate"

    .line 22
    .line 23
    invoke-static {v0}, Lax/c3/q;->c(Ljava/lang/String;)Lax/c3/q;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {p2, v0}, Lax/c3/q;->g(Ljava/util/List;Lax/c3/q;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    const-wide/16 v0, 0x0

    .line 36
    .line 37
    const/4 v2, 0x0

    .line 38
    :goto_25
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_57

    .line 43
    .line 44
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Lcom/voxdon/xplorer/file/n;

    .line 49
    .line 50
    invoke-interface {v3}, Lax/c3/b;->p()J

    .line 51
    .line 52
    .line 53
    move-result-wide v4

    .line 54
    add-long/2addr v0, v4

    .line 55
    add-int/lit8 v6, v2, 0x1

    .line 56
    .line 57
    const/4 v7, 0x5

    .line 58
    if-ge v2, v7, :cond_55

    .line 59
    .line 60
    invoke-static {v3}, Lax/c3/d0;->s(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->B()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-static {v2, v7}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget-object v7, p1, Lax/T2/h$i;->a:Ljava/util/ArrayList;

    .line 73
    .line 74
    new-instance v8, Lax/T2/h$h;

    .line 75
    .line 76
    invoke-interface {v3}, Lax/c3/b;->isDirectory()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    invoke-direct {v8, v2, v4, v5, v3}, Lax/T2/h$h;-><init>(Ljava/lang/String;JZ)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    :cond_55
    move v2, v6

    .line 87
    goto :goto_25

    .line 88
    :cond_57
    iput-wide v0, p1, Lax/T2/h$i;->b:J

    .line 89
    .line 90
    return-void
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

.method private j(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Lax/u3/c;)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/a;
        }
    .end annotation

    .line 1
    const-string v0, "location:"

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/o;->t()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 8
    .line 9
    invoke-static {v1, v2}, Lax/T2/h;->A(Landroid/content/Context;Lax/c3/K;)Ljava/io/File;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    :try_start_c
    invoke-direct {p0, p1, p2, v1, p3}, Lax/T2/h;->p0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Ljava/io/File;Lax/u3/c;)V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_c .. :try_end_f} :catch_125
    .catch Lax/b3/j; {:try_start_c .. :try_end_f} :catch_123
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_c .. :try_end_f} :catch_f4
    .catch Ljava/lang/IllegalStateException; {:try_start_c .. :try_end_f} :catch_a5
    .catch Ljava/lang/NumberFormatException; {:try_start_c .. :try_end_f} :catch_75
    .catch Ljava/lang/StackOverflowError; {:try_start_c .. :try_end_f} :catch_45
    .catch Ljava/lang/IllegalArgumentException; {:try_start_c .. :try_end_f} :catch_15
    .catch Lax/b3/a; {:try_start_c .. :try_end_f} :catch_10

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_10
    move-exception p1

    .line 18
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :catch_15
    move-exception v2

    .line 23
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-string v4, "ANALYSIS4"

    .line 31
    .line 32
    invoke-virtual {v3, v4}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3, v2}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    new-instance v3, Ljava/lang/StringBuilder;

    .line 41
    .line 42
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 49
    .line 50
    invoke-virtual {v0}, Lax/c3/K;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v2, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 66
    .line 67
    .line 68
    goto/16 :goto_129

    .line 69
    .line 70
    :catch_45
    move-exception v2

    .line 71
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    const-string v4, "ANALYSIS STACK!!!"

    .line 79
    .line 80
    invoke-virtual {v3, v4}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    invoke-virtual {v3, v2}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    new-instance v3, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 97
    .line 98
    invoke-virtual {v0}, Lax/c3/K;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v2, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 114
    .line 115
    .line 116
    goto/16 :goto_129

    .line 117
    .line 118
    :catch_75
    move-exception v2

    .line 119
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 120
    .line 121
    .line 122
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    const-string v4, "ANALYSIS3"

    .line 127
    .line 128
    invoke-virtual {v3, v4}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v3, v2}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    new-instance v3, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    iget-object v0, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 145
    .line 146
    invoke-virtual {v0}, Lax/c3/K;->toString()Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v2, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 162
    .line 163
    .line 164
    goto/16 :goto_129

    .line 165
    .line 166
    :catch_a5
    move-exception v2

    .line 167
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v3

    .line 174
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 175
    .line 176
    .line 177
    move-result v3

    .line 178
    if-eqz v3, :cond_de

    .line 179
    .line 180
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    const-string v4, "ANALYSIS2:"

    .line 185
    .line 186
    invoke-virtual {v3, v4}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-virtual {v3, v2}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    new-instance v3, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    iget-object v0, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 203
    .line 204
    invoke-virtual {v0}, Lax/c3/K;->toString()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {v2, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 220
    .line 221
    .line 222
    goto :goto_129

    .line 223
    :cond_de
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    const-string v3, "ANALYSIS2-2"

    .line 228
    .line 229
    invoke-virtual {v0, v3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    invoke-virtual {v0, v2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 242
    .line 243
    .line 244
    goto :goto_129

    .line 245
    :catch_f4
    move-exception v2

    .line 246
    invoke-virtual {v2}, Ljava/lang/Throwable;->printStackTrace()V

    .line 247
    .line 248
    .line 249
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 250
    .line 251
    .line 252
    move-result-object v3

    .line 253
    const-string v4, "ANALYSIS1:"

    .line 254
    .line 255
    invoke-virtual {v3, v4}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    invoke-virtual {v3, v2}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    new-instance v3, Ljava/lang/StringBuilder;

    .line 264
    .line 265
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 266
    .line 267
    .line 268
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 269
    .line 270
    .line 271
    iget-object v0, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 272
    .line 273
    invoke-virtual {v0}, Lax/c3/K;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 278
    .line 279
    .line 280
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-virtual {v2, v0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 289
    .line 290
    .line 291
    goto :goto_129

    .line 292
    :catch_123
    move-exception v0

    .line 293
    goto :goto_126

    .line 294
    :catch_125
    move-exception v0

    .line 295
    :goto_126
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 296
    .line 297
    .line 298
    :goto_129
    sget-object v0, Lax/T2/h;->p:Ljava/util/logging/Logger;

    .line 299
    .line 300
    const-string v2, "Retry Incremental Scan."

    .line 301
    .line 302
    invoke-virtual {v0, v2}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    :try_start_130
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 306
    .line 307
    .line 308
    invoke-direct {p0, p1, p2, v1, p3}, Lax/T2/h;->p0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Ljava/io/File;Lax/u3/c;)V
    :try_end_136
    .catch Ljava/io/IOException; {:try_start_130 .. :try_end_136} :catch_13d
    .catch Lax/b3/j; {:try_start_130 .. :try_end_136} :catch_13b
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_130 .. :try_end_136} :catch_139
    .catch Lax/b3/a; {:try_start_130 .. :try_end_136} :catch_137

    .line 309
    .line 310
    .line 311
    goto :goto_173

    .line 312
    :catch_137
    move-exception p1

    .line 313
    goto :goto_13f

    .line 314
    :catch_139
    move-exception p1

    .line 315
    goto :goto_143

    .line 316
    :catch_13b
    move-exception p1

    .line 317
    goto :goto_169

    .line 318
    :catch_13d
    move-exception p1

    .line 319
    goto :goto_169

    .line 320
    :goto_13f
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 321
    .line 322
    .line 323
    throw p1

    .line 324
    :goto_143
    sget-object p2, Lax/T2/h;->p:Ljava/util/logging/Logger;

    .line 325
    .line 326
    const-string p3, "Incremental Scan Failed."

    .line 327
    .line 328
    invoke-virtual {p2, p3}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 332
    .line 333
    .line 334
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 335
    .line 336
    .line 337
    move-result-object p2

    .line 338
    const-string p3, "ANALYSIS OOB"

    .line 339
    .line 340
    invoke-virtual {p2, p3}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 341
    .line 342
    .line 343
    move-result-object p2

    .line 344
    invoke-virtual {p2, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 345
    .line 346
    .line 347
    move-result-object p1

    .line 348
    iget-object p2, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 349
    .line 350
    invoke-virtual {p2}, Lax/c3/K;->toString()Ljava/lang/String;

    .line 351
    .line 352
    .line 353
    move-result-object p2

    .line 354
    invoke-virtual {p1, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 355
    .line 356
    .line 357
    move-result-object p1

    .line 358
    invoke-virtual {p1}, Lax/Ha/b;->h()V

    .line 359
    .line 360
    .line 361
    goto :goto_173

    .line 362
    :goto_169
    sget-object p2, Lax/T2/h;->p:Ljava/util/logging/Logger;

    .line 363
    .line 364
    const-string p3, "Incremental Analysis Failed."

    .line 365
    .line 366
    invoke-virtual {p2, p3}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 370
    .line 371
    .line 372
    :goto_173
    return-void
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

.method private k(Landroid/content/Context;Lax/T2/h$f;)V
    .registers 14

    .line 1
    const-string v0, "usagestats"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, Landroid/app/usage/UsageStatsManager;

    .line 9
    .line 10
    invoke-static {p1}, Lax/U2/d;->F(Landroid/content/Context;)Lax/U2/d;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lax/U2/d;->B()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :try_start_11
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x2

    .line 23
    const/4 v3, -0x5

    .line 24
    invoke-virtual {v0, v1, v3}, Ljava/util/Calendar;->add(II)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 32
    .line 33
    .line 34
    move-result-wide v5

    .line 35
    move-object v1, p0

    .line 36
    invoke-virtual/range {v1 .. v6}, Lax/T2/h;->F0(Landroid/app/usage/UsageStatsManager;JJ)Ljava/util/Map;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-wide/16 v2, 0x0

    .line 50
    .line 51
    :cond_32
    :goto_32
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_77

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    check-cast v4, Lax/U2/f;

    .line 62
    .line 63
    invoke-virtual {v4}, Lax/U2/f;->F()Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_45

    .line 68
    .line 69
    goto :goto_32

    .line 70
    :cond_45
    invoke-virtual {v4}, Lax/U2/f;->r()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, Landroid/app/usage/UsageStats;

    .line 79
    .line 80
    if-nez v5, :cond_5d

    .line 81
    .line 82
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Lax/U2/f;->s()J

    .line 86
    .line 87
    .line 88
    move-result-wide v4

    .line 89
    :goto_58
    add-long/2addr v2, v4

    .line 90
    goto :goto_32

    .line 91
    :catch_5a
    move-exception v0

    .line 92
    move-object p1, v0

    .line 93
    goto :goto_8a

    .line 94
    :cond_5d
    invoke-virtual {v5}, Landroid/app/usage/UsageStats;->getLastTimeUsed()J

    .line 95
    .line 96
    .line 97
    move-result-wide v5

    .line 98
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 99
    .line 100
    .line 101
    move-result-wide v7

    .line 102
    const-wide v9, 0x134fd9000L

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    sub-long/2addr v7, v9

    .line 108
    cmp-long v9, v5, v7

    .line 109
    .line 110
    if-gez v9, :cond_32

    .line 111
    .line 112
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4}, Lax/U2/f;->s()J

    .line 116
    .line 117
    .line 118
    move-result-wide v4

    .line 119
    goto :goto_58

    .line 120
    :cond_77
    const-string p1, "SizeDown"

    .line 121
    .line 122
    invoke-static {p1}, Lax/U2/f;->d(Ljava/lang/String;)Ljava/util/Comparator;

    .line 123
    .line 124
    .line 125
    move-result-object p1
    :try_end_7d
    .catch Ljava/lang/SecurityException; {:try_start_11 .. :try_end_7d} :catch_5a

    .line 126
    if-eqz p1, :cond_8d

    .line 127
    .line 128
    :try_start_7f
    invoke-static {v1, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 129
    .line 130
    .line 131
    iput-object v1, p2, Lax/T2/h$f;->k:Ljava/util/List;

    .line 132
    .line 133
    iput-wide v2, p2, Lax/T2/h$f;->x:J

    .line 134
    .line 135
    const/4 p1, 0x1

    .line 136
    iput-boolean p1, p2, Lax/T2/h$f;->w:Z
    :try_end_89
    .catch Ljava/lang/IllegalArgumentException; {:try_start_7f .. :try_end_89} :catch_8d
    .catch Ljava/lang/SecurityException; {:try_start_7f .. :try_end_89} :catch_5a

    .line 137
    .line 138
    goto :goto_8d

    .line 139
    :goto_8a
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 140
    .line 141
    .line 142
    :catch_8d
    :cond_8d
    :goto_8d
    return-void
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
.end method

.method private l(Lax/T2/h$f;ZLcom/voxdon/xplorer/file/o;Lax/u3/c;)V
    .registers 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/o;->V()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p3, v0}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lcom/voxdon/xplorer/file/y;

    .line 10
    .line 11
    iput-object v0, p1, Lax/T2/h$f;->a:Lcom/voxdon/xplorer/file/y;

    .line 12
    .line 13
    invoke-direct {p0}, Lax/T2/h;->g0()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    iput-wide v0, p1, Lax/T2/h$f;->b:J

    .line 18
    .line 19
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/o;->W()Lax/c3/k0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p1, Lax/T2/h$f;->c:Lax/c3/k0;

    .line 24
    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    const v2, 0x7f130031

    .line 30
    .line 31
    .line 32
    invoke-direct {p0, v2}, Lax/T2/h;->w(I)V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, p3, p1, p4}, Lax/T2/h;->j(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Lax/u3/c;)V

    .line 36
    .line 37
    .line 38
    iget-boolean v2, p0, Lax/T2/h;->l:Z

    .line 39
    .line 40
    if-nez v2, :cond_4f

    .line 41
    .line 42
    if-eqz p2, :cond_4f

    .line 43
    .line 44
    const p2, 0x7f130030

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, p2}, Lax/T2/h;->w(I)V

    .line 48
    .line 49
    .line 50
    new-instance p2, Lax/T2/l;

    .line 51
    .line 52
    invoke-virtual {p3}, Lcom/voxdon/xplorer/file/o;->t()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {p0}, Lax/T2/h;->X()Lax/c3/K;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    new-instance v4, Lax/T2/h$b;

    .line 61
    .line 62
    invoke-direct {v4, p0}, Lax/T2/h$b;-><init>(Lax/T2/h;)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p2, v2, v3, v4}, Lax/T2/l;-><init>(Landroid/content/Context;Lax/c3/K;Lax/T2/l$a;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Lax/T2/l;->e()V

    .line 69
    .line 70
    .line 71
    invoke-static {p3, p1, p2, p4}, Lax/T2/i;->a(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Lax/T2/l;Lax/u3/c;)V

    .line 72
    .line 73
    .line 74
    invoke-static {p3, p1, p2, p4}, Lax/T2/i;->b(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Lax/T2/l;Lax/u3/c;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Lax/T2/l;->g()V

    .line 78
    .line 79
    .line 80
    :cond_4f
    sget-object p1, Lax/T2/h;->p:Ljava/util/logging/Logger;

    .line 81
    .line 82
    new-instance p2, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 85
    .line 86
    .line 87
    const-string p3, "AnalyzeStorage time :"

    .line 88
    .line 89
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 93
    .line 94
    .line 95
    move-result-wide p3

    .line 96
    sub-long/2addr p3, v0

    .line 97
    invoke-virtual {p2, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    invoke-virtual {p1, p2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

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
.end method

.method private declared-synchronized m(Lax/T2/h$f;Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)V
    .registers 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    monitor-enter p0

    .line 6
    :try_start_5
    new-instance v2, Ljava/util/Stack;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/util/Stack;-><init>()V

    .line 9
    .line 10
    .line 11
    move-object/from16 v3, p3

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1}, Lax/T2/h;->g0()J

    .line 17
    .line 18
    .line 19
    :goto_12
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x0

    .line 24
    const-wide/16 v5, 0x0

    .line 25
    .line 26
    if-lez v3, :cond_f0

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    check-cast v3, Lcom/voxdon/xplorer/file/n;

    .line 33
    .line 34
    invoke-interface {v3}, Lax/c3/b;->isDirectory()Z

    .line 35
    .line 36
    .line 37
    move-result v7
    :try_end_25
    .catchall {:try_start_5 .. :try_end_25} :catchall_2e

    .line 38
    if-eqz v7, :cond_b9

    .line 39
    .line 40
    move-object/from16 v7, p2

    .line 41
    .line 42
    :try_start_29
    invoke-direct {v1, v7, v3}, Lax/T2/h;->z0(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 43
    .line 44
    .line 45
    move-result-object v10
    :try_end_2d
    .catch Lax/b3/e; {:try_start_29 .. :try_end_2d} :catch_33
    .catch Lax/b3/j; {:try_start_29 .. :try_end_2d} :catch_31
    .catchall {:try_start_29 .. :try_end_2d} :catchall_2e

    .line 46
    goto :goto_34

    .line 47
    :catchall_2e
    move-exception v0

    .line 48
    goto/16 :goto_140

    .line 49
    .line 50
    :catch_31
    move-wide v11, v5

    .line 51
    goto :goto_84

    .line 52
    :catch_33
    const/4 v10, 0x0

    .line 53
    :goto_34
    if-eqz v10, :cond_8c

    .line 54
    .line 55
    :try_start_36
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v10
    :try_end_3a
    .catch Lax/b3/j; {:try_start_36 .. :try_end_3a} :catch_31
    .catchall {:try_start_36 .. :try_end_3a} :catchall_2e

    .line 59
    move-wide v11, v5

    .line 60
    :cond_3b
    :goto_3b
    :try_start_3b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v13

    .line 64
    if-eqz v13, :cond_8d

    .line 65
    .line 66
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v13

    .line 70
    check-cast v13, Lcom/voxdon/xplorer/file/n;

    .line 71
    .line 72
    invoke-static {v13}, Lcom/voxdon/xplorer/file/J;->j2(Lcom/voxdon/xplorer/file/n;)Z

    .line 73
    .line 74
    .line 75
    move-result v14

    .line 76
    if-eqz v14, :cond_4e

    .line 77
    .line 78
    goto :goto_3b

    .line 79
    :cond_4e
    invoke-interface {v13}, Lax/c3/b;->isDirectory()Z

    .line 80
    .line 81
    .line 82
    move-result v14

    .line 83
    if-eqz v14, :cond_5b

    .line 84
    .line 85
    invoke-virtual {v2, v13}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    const-wide/32 v16, 0xa00000

    .line 89
    .line 90
    .line 91
    goto :goto_3b

    .line 92
    :cond_5b
    invoke-interface {v13}, Lax/c3/b;->p()J

    .line 93
    .line 94
    .line 95
    move-result-wide v14

    .line 96
    add-long/2addr v11, v14

    .line 97
    const-wide/32 v16, 0xa00000

    .line 98
    .line 99
    .line 100
    iget-object v8, v0, Lax/T2/h$f;->e:Ljava/util/HashMap;

    .line 101
    .line 102
    invoke-virtual {v13}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    invoke-direct {v1, v8, v9, v14, v15}, Lax/T2/h;->d(Ljava/util/HashMap;Ljava/lang/String;J)V

    .line 107
    .line 108
    .line 109
    cmp-long v8, v14, v16

    .line 110
    .line 111
    if-lez v8, :cond_3b

    .line 112
    .line 113
    iget-object v8, v0, Lax/T2/h$f;->g:Ljava/util/ArrayList;

    .line 114
    .line 115
    new-instance v9, Lax/T2/h$h;

    .line 116
    .line 117
    invoke-direct {v1, v13}, Lax/T2/h;->d0(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v13

    .line 121
    invoke-direct {v9, v13, v14, v15, v4}, Lax/T2/h$h;-><init>(Ljava/lang/String;JZ)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    iget-wide v8, v0, Lax/T2/h$f;->o:J

    .line 128
    .line 129
    add-long/2addr v8, v14

    .line 130
    iput-wide v8, v0, Lax/T2/h$f;->o:J
    :try_end_83
    .catch Lax/b3/j; {:try_start_3b .. :try_end_83} :catch_84
    .catchall {:try_start_3b .. :try_end_83} :catchall_2e

    .line 131
    .line 132
    goto :goto_3b

    .line 133
    :catch_84
    :goto_84
    :try_start_84
    sget-object v4, Lax/T2/h;->p:Ljava/util/logging/Logger;

    .line 134
    .line 135
    const-string v8, "getDirectorySize Error!"

    .line 136
    .line 137
    invoke-virtual {v4, v8}, Ljava/util/logging/Logger;->severe(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    goto :goto_8d

    .line 141
    :cond_8c
    move-wide v11, v5

    .line 142
    :cond_8d
    :goto_8d
    invoke-direct {v1, v3}, Lax/T2/h;->d0(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    const-wide/32 v8, 0x3200000

    .line 147
    .line 148
    .line 149
    const/4 v4, 0x1

    .line 150
    cmp-long v10, v11, v8

    .line 151
    .line 152
    if-lez v10, :cond_a8

    .line 153
    .line 154
    iget-object v8, v0, Lax/T2/h$f;->f:Ljava/util/ArrayList;

    .line 155
    .line 156
    new-instance v9, Lax/T2/h$h;

    .line 157
    .line 158
    invoke-direct {v9, v3, v11, v12, v4}, Lax/T2/h$h;-><init>(Ljava/lang/String;JZ)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    iget-wide v8, v0, Lax/T2/h$f;->p:J

    .line 165
    .line 166
    add-long/2addr v8, v11

    .line 167
    iput-wide v8, v0, Lax/T2/h$f;->p:J

    .line 168
    .line 169
    :cond_a8
    invoke-static {v3}, Lax/U2/d;->Q(Ljava/lang/String;)Z

    .line 170
    .line 171
    .line 172
    move-result v8

    .line 173
    if-eqz v8, :cond_eb

    .line 174
    .line 175
    iget-object v8, v0, Lax/T2/h$f;->h:Ljava/util/ArrayList;

    .line 176
    .line 177
    new-instance v9, Lax/T2/h$h;

    .line 178
    .line 179
    invoke-direct {v9, v3, v5, v6, v4}, Lax/T2/h$h;-><init>(Ljava/lang/String;JZ)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    goto :goto_eb

    .line 186
    :cond_b9
    move-object/from16 v7, p2

    .line 187
    .line 188
    const-wide/32 v16, 0xa00000

    .line 189
    .line 190
    .line 191
    invoke-direct {v1, v3}, Lax/T2/h;->d0(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-static {v5}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    invoke-interface {v3}, Lax/c3/b;->p()J

    .line 200
    .line 201
    .line 202
    move-result-wide v11

    .line 203
    iget-object v6, v0, Lax/T2/h$f;->e:Ljava/util/HashMap;

    .line 204
    .line 205
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    invoke-direct {v1, v6, v8, v11, v12}, Lax/T2/h;->d(Ljava/util/HashMap;Ljava/lang/String;J)V

    .line 210
    .line 211
    .line 212
    cmp-long v6, v11, v16

    .line 213
    .line 214
    if-lez v6, :cond_ea

    .line 215
    .line 216
    iget-object v6, v0, Lax/T2/h$f;->g:Ljava/util/ArrayList;

    .line 217
    .line 218
    new-instance v8, Lax/T2/h$h;

    .line 219
    .line 220
    invoke-direct {v1, v3}, Lax/T2/h;->d0(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    invoke-direct {v8, v3, v11, v12, v4}, Lax/T2/h$h;-><init>(Ljava/lang/String;JZ)V

    .line 225
    .line 226
    .line 227
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    iget-wide v3, v0, Lax/T2/h$f;->o:J

    .line 231
    .line 232
    add-long/2addr v3, v11

    .line 233
    iput-wide v3, v0, Lax/T2/h$f;->o:J

    .line 234
    .line 235
    :cond_ea
    move-object v3, v5

    .line 236
    :cond_eb
    :goto_eb
    invoke-direct {v1, v0, v3, v11, v12}, Lax/T2/h;->E0(Lax/T2/h$f;Ljava/lang/String;J)V

    .line 237
    .line 238
    .line 239
    goto/16 :goto_12

    .line 240
    .line 241
    :cond_f0
    iget-object v2, v0, Lax/T2/h$f;->i:Ljava/util/ArrayList;

    .line 242
    .line 243
    invoke-direct {v1, v2}, Lax/T2/h;->M0(Ljava/util/List;)V

    .line 244
    .line 245
    .line 246
    iget-object v2, v0, Lax/T2/h$f;->g:Ljava/util/ArrayList;

    .line 247
    .line 248
    invoke-direct {v1, v2}, Lax/T2/h;->M0(Ljava/util/List;)V

    .line 249
    .line 250
    .line 251
    iget-object v2, v0, Lax/T2/h$f;->f:Ljava/util/ArrayList;

    .line 252
    .line 253
    invoke-direct {v1, v2}, Lax/T2/h;->M0(Ljava/util/List;)V

    .line 254
    .line 255
    .line 256
    iput-wide v5, v0, Lax/T2/h$f;->q:J

    .line 257
    .line 258
    iget-object v2, v0, Lax/T2/h$f;->h:Ljava/util/ArrayList;

    .line 259
    .line 260
    if-eqz v2, :cond_13e

    .line 261
    .line 262
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 263
    .line 264
    .line 265
    move-result v2

    .line 266
    if-lez v2, :cond_13e

    .line 267
    .line 268
    iget-object v2, v0, Lax/T2/h$f;->h:Ljava/util/ArrayList;

    .line 269
    .line 270
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 271
    .line 272
    .line 273
    move-result v3

    .line 274
    :cond_111
    :goto_111
    if-ge v4, v3, :cond_139

    .line 275
    .line 276
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v5

    .line 280
    add-int/lit8 v4, v4, 0x1

    .line 281
    .line 282
    check-cast v5, Lax/T2/h$h;

    .line 283
    .line 284
    iget-object v6, v0, Lax/T2/h$f;->d:Ljava/util/HashMap;

    .line 285
    .line 286
    invoke-virtual {v5}, Lax/T2/h$h;->a()Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v7

    .line 290
    invoke-virtual {v6, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v6

    .line 294
    check-cast v6, Ljava/lang/Long;

    .line 295
    .line 296
    if-eqz v6, :cond_111

    .line 297
    .line 298
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 299
    .line 300
    .line 301
    move-result-wide v7

    .line 302
    iput-wide v7, v5, Lax/T2/h$h;->b:J

    .line 303
    .line 304
    iget-wide v7, v0, Lax/T2/h$f;->q:J

    .line 305
    .line 306
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 307
    .line 308
    .line 309
    move-result-wide v5

    .line 310
    add-long/2addr v7, v5

    .line 311
    iput-wide v7, v0, Lax/T2/h$f;->q:J

    .line 312
    .line 313
    goto :goto_111

    .line 314
    :cond_139
    iget-object v0, v0, Lax/T2/h$f;->h:Ljava/util/ArrayList;

    .line 315
    .line 316
    invoke-direct {v1, v0}, Lax/T2/h;->M0(Ljava/util/List;)V
    :try_end_13e
    .catchall {:try_start_84 .. :try_end_13e} :catchall_2e

    .line 317
    .line 318
    .line 319
    :cond_13e
    monitor-exit p0

    .line 320
    return-void

    .line 321
    :goto_140
    :try_start_140
    monitor-exit p0
    :try_end_141
    .catchall {:try_start_140 .. :try_end_141} :catchall_2e

    .line 322
    throw v0
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

.method public static n0(Lax/c3/K;)Z
    .registers 2

    .line 1
    invoke-virtual {p0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lax/Q2/f;->U(Lax/Q2/f;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_c

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0

    .line 13
    :cond_c
    invoke-static {p0}, Lax/T2/h;->S(Lax/c3/K;)Lax/T2/h;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, Lax/T2/h;->k0()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
    .line 22
.end method

.method private p(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Lax/Z2/i;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :goto_0
    invoke-virtual {p3}, Lax/Z2/i;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_21

    .line 6
    .line 7
    const-string v0, "\u0000"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    aget-object p1, p1, v0

    .line 15
    .line 16
    invoke-static {p1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-virtual {p2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_21

    .line 29
    .line 30
    invoke-virtual {p3}, Lax/Z2/i;->a()V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_21
    return-void
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
.end method

.method private declared-synchronized p0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Ljava/io/File;Lax/u3/c;)V
    .registers 15
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_2
    invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p3}, Ljava/io/File;->exists()Z

    .line 8
    .line 9
    .line 10
    move-result v2
    :try_end_a
    .catchall {:try_start_2 .. :try_end_a} :catchall_103

    .line 11
    if-eqz v2, :cond_1d

    .line 12
    .line 13
    :try_start_c
    new-instance v2, Ljava/io/BufferedReader;

    .line 14
    .line 15
    new-instance v3, Ljava/io/FileReader;

    .line 16
    .line 17
    invoke-direct {v3, v0}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_16
    .catchall {:try_start_c .. :try_end_16} :catchall_17

    .line 21
    .line 22
    .line 23
    goto :goto_1e

    .line 24
    :catchall_17
    move-exception v0

    .line 25
    move-object p1, v0

    .line 26
    move-object v3, p0

    .line 27
    :goto_1a
    move-object v7, v1

    .line 28
    goto/16 :goto_108

    .line 29
    .line 30
    :cond_1d
    move-object v2, v1

    .line 31
    :goto_1e
    :try_start_1e
    new-instance v7, Ljava/io/BufferedWriter;

    .line 32
    .line 33
    new-instance v3, Ljava/io/FileWriter;

    .line 34
    .line 35
    new-instance v4, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v5, ".tmp"

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-direct {v3, v4}, Ljava/io/FileWriter;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {v7, v3}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_39
    .catchall {:try_start_1e .. :try_end_39} :catchall_100

    .line 56
    .line 57
    .line 58
    if-eqz v2, :cond_46

    .line 59
    .line 60
    :try_start_3b
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3
    :try_end_3f
    .catchall {:try_start_3b .. :try_end_3f} :catchall_40

    .line 64
    goto :goto_47

    .line 65
    :catchall_40
    move-exception v0

    .line 66
    move-object p1, v0

    .line 67
    move-object v3, p0

    .line 68
    :goto_43
    move-object v1, v2

    .line 69
    goto/16 :goto_108

    .line 70
    .line 71
    :cond_46
    move-object v3, v1

    .line 72
    :goto_47
    :try_start_47
    const-string v4, "6"

    .line 73
    .line 74
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v3
    :try_end_4d
    .catchall {:try_start_47 .. :try_end_4d} :catchall_fc

    .line 78
    if-nez v3, :cond_5e

    .line 79
    .line 80
    if-eqz v2, :cond_5e

    .line 81
    .line 82
    :try_start_51
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_54
    .catchall {:try_start_51 .. :try_end_54} :catchall_40

    .line 83
    .line 84
    .line 85
    :try_start_54
    invoke-virtual {p3}, Ljava/io/File;->delete()Z
    :try_end_57
    .catchall {:try_start_54 .. :try_end_57} :catchall_59

    .line 86
    .line 87
    .line 88
    move-object v2, v1

    .line 89
    goto :goto_5e

    .line 90
    :catchall_59
    move-exception v0

    .line 91
    move-object p1, v0

    .line 92
    move-object v3, p0

    .line 93
    goto/16 :goto_108

    .line 94
    .line 95
    :cond_5e
    :goto_5e
    :try_start_5e
    const-string v3, "6\n"

    .line 96
    .line 97
    invoke-virtual {v7, v3}, Ljava/io/Writer;->write(Ljava/lang/String;)V
    :try_end_63
    .catchall {:try_start_5e .. :try_end_63} :catchall_fc

    .line 98
    .line 99
    .line 100
    if-eqz v2, :cond_68

    .line 101
    .line 102
    :try_start_65
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
    :try_end_68
    .catchall {:try_start_65 .. :try_end_68} :catchall_40

    .line 103
    .line 104
    .line 105
    :cond_68
    :try_start_68
    new-instance v8, Lax/Z2/i;

    .line 106
    .line 107
    invoke-direct {v8, v2}, Lax/Z2/i;-><init>(Ljava/io/BufferedReader;)V

    .line 108
    .line 109
    .line 110
    iget-object v6, p2, Lax/T2/h$f;->a:Lcom/voxdon/xplorer/file/y;
    :try_end_6f
    .catchall {:try_start_68 .. :try_end_6f} :catchall_fc

    .line 111
    .line 112
    move-object v3, p0

    .line 113
    move-object v4, p1

    .line 114
    move-object v5, p2

    .line 115
    move-object v9, p4

    .line 116
    :try_start_73
    invoke-direct/range {v3 .. v9}, Lax/T2/h;->q0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Lcom/voxdon/xplorer/file/n;Ljava/io/BufferedWriter;Lax/Z2/i;Lax/u3/c;)V

    .line 117
    .line 118
    .line 119
    if-eqz v2, :cond_80

    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V

    .line 122
    .line 123
    .line 124
    move-object v2, v1

    .line 125
    goto :goto_80

    .line 126
    :catchall_7d
    move-exception v0

    .line 127
    :goto_7e
    move-object p1, v0

    .line 128
    goto :goto_43

    .line 129
    :cond_80
    :goto_80
    invoke-virtual {v7}, Ljava/io/BufferedWriter;->close()V
    :try_end_83
    .catchall {:try_start_73 .. :try_end_83} :catchall_7d

    .line 130
    .line 131
    .line 132
    :try_start_83
    invoke-virtual {p3}, Ljava/io/File;->delete()Z

    .line 133
    .line 134
    .line 135
    new-instance p1, Ljava/io/File;

    .line 136
    .line 137
    new-instance p2, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string p4, ".tmp"

    .line 146
    .line 147
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    invoke-direct {p1, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p3}, Ljava/io/File;->getAbsoluteFile()Ljava/io/File;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    invoke-virtual {p1, p2}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 162
    .line 163
    .line 164
    iget-object p1, v5, Lax/T2/h$f;->i:Ljava/util/ArrayList;

    .line 165
    .line 166
    invoke-direct {p0, p1}, Lax/T2/h;->M0(Ljava/util/List;)V

    .line 167
    .line 168
    .line 169
    iget-object p1, v5, Lax/T2/h$f;->g:Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-direct {p0, p1}, Lax/T2/h;->M0(Ljava/util/List;)V

    .line 172
    .line 173
    .line 174
    iget-object p1, v5, Lax/T2/h$f;->f:Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-direct {p0, p1}, Lax/T2/h;->M0(Ljava/util/List;)V

    .line 177
    .line 178
    .line 179
    iget-object p1, v5, Lax/T2/h$f;->h:Ljava/util/ArrayList;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 182
    .line 183
    .line 184
    move-result p2

    .line 185
    const/4 p3, 0x0

    .line 186
    :cond_b9
    :goto_b9
    if-ge p3, p2, :cond_e6

    .line 187
    .line 188
    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p4

    .line 192
    add-int/lit8 p3, p3, 0x1

    .line 193
    .line 194
    check-cast p4, Lax/T2/h$h;

    .line 195
    .line 196
    iget-object v0, v5, Lax/T2/h$f;->d:Ljava/util/HashMap;

    .line 197
    .line 198
    invoke-virtual {p4}, Lax/T2/h$h;->a()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    check-cast v0, Ljava/lang/Long;

    .line 207
    .line 208
    if-eqz v0, :cond_b9

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 211
    .line 212
    .line 213
    move-result-wide v6

    .line 214
    iput-wide v6, p4, Lax/T2/h$h;->b:J

    .line 215
    .line 216
    iget-wide v6, v5, Lax/T2/h$f;->q:J

    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 219
    .line 220
    .line 221
    move-result-wide v8

    .line 222
    add-long/2addr v6, v8

    .line 223
    iput-wide v6, v5, Lax/T2/h$f;->q:J

    .line 224
    .line 225
    goto :goto_b9

    .line 226
    :catchall_e1
    move-exception v0

    .line 227
    :goto_e2
    move-object p1, v0

    .line 228
    move-object v7, v1

    .line 229
    goto/16 :goto_43

    .line 230
    .line 231
    :cond_e6
    iget-object p1, v5, Lax/T2/h$f;->h:Ljava/util/ArrayList;

    .line 232
    .line 233
    invoke-direct {p0, p1}, Lax/T2/h;->M0(Ljava/util/List;)V

    .line 234
    .line 235
    .line 236
    const-string p1, ""

    .line 237
    .line 238
    const/4 p2, 0x1

    .line 239
    invoke-direct {p0, p1, p2}, Lax/T2/h;->v(Ljava/lang/String;Z)V
    :try_end_f1
    .catchall {:try_start_83 .. :try_end_f1} :catchall_e1

    .line 240
    .line 241
    .line 242
    if-eqz v2, :cond_fa

    .line 243
    .line 244
    :try_start_f3
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_f6
    .catch Ljava/io/IOException; {:try_start_f3 .. :try_end_f6} :catch_fa
    .catchall {:try_start_f3 .. :try_end_f6} :catchall_f7

    .line 245
    .line 246
    .line 247
    goto :goto_fa

    .line 248
    :catchall_f7
    move-exception v0

    .line 249
    move-object p1, v0

    .line 250
    goto :goto_113

    .line 251
    :catch_fa
    :cond_fa
    :goto_fa
    monitor-exit p0

    .line 252
    return-void

    .line 253
    :catchall_fc
    move-exception v0

    .line 254
    move-object v3, p0

    .line 255
    goto/16 :goto_7e

    .line 256
    .line 257
    :catchall_100
    move-exception v0

    .line 258
    move-object v3, p0

    .line 259
    goto :goto_e2

    .line 260
    :catchall_103
    move-exception v0

    .line 261
    move-object v3, p0

    .line 262
    move-object p1, v0

    .line 263
    goto/16 :goto_1a

    .line 264
    .line 265
    :goto_108
    if-eqz v1, :cond_10d

    .line 266
    .line 267
    :try_start_10a
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V

    .line 268
    .line 269
    .line 270
    :cond_10d
    if-eqz v7, :cond_112

    .line 271
    .line 272
    invoke-virtual {v7}, Ljava/io/BufferedWriter;->close()V
    :try_end_112
    .catch Ljava/io/IOException; {:try_start_10a .. :try_end_112} :catch_112
    .catchall {:try_start_10a .. :try_end_112} :catchall_f7

    .line 273
    .line 274
    .line 275
    :catch_112
    :cond_112
    :try_start_112
    throw p1

    .line 276
    :goto_113
    monitor-exit p0
    :try_end_114
    .catchall {:try_start_112 .. :try_end_114} :catchall_f7

    .line 277
    throw p1
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
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
.end method

.method public static q(I)Lax/c3/K;
    .registers 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, v0, :cond_6

    .line 3
    .line 4
    sget-object p0, Lax/c3/K;->e:Lax/c3/K;

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_6
    const/4 v0, 0x2

    .line 8
    if-ne p0, v0, :cond_c

    .line 9
    .line 10
    sget-object p0, Lax/c3/K;->f:Lax/c3/K;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_c
    const/16 v0, 0x64

    .line 14
    .line 15
    if-lt p0, v0, :cond_40

    .line 16
    .line 17
    sget-object v0, Lax/Q2/f;->v0:Lax/Q2/f;

    .line 18
    .line 19
    add-int/lit8 v1, p0, -0x64

    .line 20
    .line 21
    invoke-static {v0, v1}, Lax/c3/K;->a(Lax/Q2/f;I)Lax/c3/K;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1, v0}, Lax/Z2/j;->B0(Lax/c3/K;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_3f

    .line 34
    .line 35
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v2, "INVALID USB LOCATION KEY"

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v1}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {v1, p0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 62
    .line 63
    .line 64
    :cond_3f
    return-object v0

    .line 65
    :cond_40
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    const-string v1, "INVALID LOCATION KEY"

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Lax/Ha/b;->j()Lax/Ha/b;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-virtual {v0, p0}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p0}, Lax/Ha/b;->h()V

    .line 88
    .line 89
    .line 90
    sget-object p0, Lax/c3/K;->e:Lax/c3/K;

    .line 91
    .line 92
    return-object p0
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

.method private q0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Lcom/voxdon/xplorer/file/n;Ljava/io/BufferedWriter;Lax/Z2/i;Lax/u3/c;)V
    .registers 24
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v7, p5

    .line 8
    .line 9
    move-object v2, v3

    .line 10
    check-cast v2, Lcom/voxdon/xplorer/file/y;

    .line 11
    .line 12
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->w0()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-nez v2, :cond_12

    .line 17
    .line 18
    goto :goto_2b

    .line 19
    :cond_12
    if-eqz p6, :cond_21

    .line 20
    .line 21
    invoke-interface/range {p6 .. p6}, Lax/u3/c;->isCancelled()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-nez v2, :cond_1b

    .line 26
    .line 27
    goto :goto_21

    .line 28
    :cond_1b
    new-instance v1, Lax/b3/a;

    .line 29
    .line 30
    invoke-direct {v1}, Lax/b3/a;-><init>()V

    .line 31
    .line 32
    .line 33
    throw v1

    .line 34
    :cond_21
    :goto_21
    const/4 v8, 0x0

    .line 35
    :try_start_22
    invoke-direct {v0, v1, v3}, Lax/T2/h;->z0(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v2
    :try_end_26
    .catch Lax/b3/e; {:try_start_22 .. :try_end_26} :catch_27

    .line 39
    goto :goto_29

    .line 40
    :catch_27
    nop

    .line 41
    move-object v2, v8

    .line 42
    :goto_29
    if-nez v2, :cond_2c

    .line 43
    .line 44
    :goto_2b
    return-void

    .line 45
    :cond_2c
    new-instance v9, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance v4, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    :goto_3a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_54

    .line 64
    .line 65
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    check-cast v5, Lcom/voxdon/xplorer/file/n;

    .line 70
    .line 71
    invoke-interface {v5}, Lax/c3/b;->isDirectory()Z

    .line 72
    .line 73
    .line 74
    move-result v6

    .line 75
    if-eqz v6, :cond_50

    .line 76
    .line 77
    invoke-virtual {v9, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    goto :goto_3a

    .line 81
    :cond_50
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    goto :goto_3a

    .line 85
    :cond_54
    new-instance v2, Lax/T2/h$c;

    .line 86
    .line 87
    invoke-direct {v2, v0}, Lax/T2/h$c;-><init>(Lax/T2/h;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v9, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 91
    .line 92
    .line 93
    const/4 v6, 0x0

    .line 94
    move-object/from16 v2, p2

    .line 95
    .line 96
    move-object/from16 v5, p4

    .line 97
    .line 98
    invoke-direct/range {v0 .. v6}, Lax/T2/h;->Q0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Lcom/voxdon/xplorer/file/n;Ljava/util/List;Ljava/io/Writer;Z)V

    .line 99
    .line 100
    .line 101
    move-object v10, v3

    .line 102
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-nez v2, :cond_6f

    .line 107
    .line 108
    invoke-direct {v0, v1, v10, v7}, Lax/T2/h;->p(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Lax/Z2/i;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_6f
    invoke-virtual {v7}, Lax/Z2/i;->c()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    const/4 v11, 0x0

    .line 117
    move-object v6, v2

    .line 118
    const/4 v12, 0x0

    .line 119
    :goto_76
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-ge v12, v2, :cond_121

    .line 124
    .line 125
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    move-object v3, v2

    .line 130
    check-cast v3, Lcom/voxdon/xplorer/file/n;

    .line 131
    .line 132
    invoke-virtual {v3}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    if-nez v6, :cond_8d

    .line 137
    .line 138
    const/4 v2, -0x1

    .line 139
    move-object v4, v8

    .line 140
    move-object v5, v4

    .line 141
    goto :goto_9d

    .line 142
    :cond_8d
    const-string v4, "\u0000"

    .line 143
    .line 144
    invoke-virtual {v6, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    aget-object v5, v4, v11

    .line 149
    .line 150
    invoke-static {v5}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    invoke-virtual {v2, v5}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    :goto_9d
    if-nez v2, :cond_100

    .line 159
    .line 160
    const/4 v2, 0x1

    .line 161
    aget-object v2, v4, v2

    .line 162
    .line 163
    invoke-static {v2}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 168
    .line 169
    .line 170
    move-result-wide v13

    .line 171
    invoke-interface {v3}, Lax/c3/b;->q()J

    .line 172
    .line 173
    .line 174
    move-result-wide v15

    .line 175
    cmp-long v2, v13, v15

    .line 176
    .line 177
    if-nez v2, :cond_e6

    .line 178
    .line 179
    new-instance v2, Ljava/lang/StringBuilder;

    .line 180
    .line 181
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string v3, "\n"

    .line 188
    .line 189
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    move-object/from16 v3, p4

    .line 197
    .line 198
    invoke-virtual {v3, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    move-object/from16 v2, p2

    .line 202
    .line 203
    invoke-direct {v0, v1, v2, v5, v4}, Lax/T2/h;->K0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Ljava/lang/String;[Ljava/lang/String;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v7}, Lax/Z2/i;->a()V

    .line 207
    .line 208
    .line 209
    move-object/from16 v6, p6

    .line 210
    .line 211
    move-object v4, v3

    .line 212
    move-object v3, v5

    .line 213
    move-object v5, v7

    .line 214
    invoke-direct/range {v0 .. v6}, Lax/T2/h;->t0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Ljava/lang/String;Ljava/io/BufferedWriter;Lax/Z2/i;Lax/u3/c;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual/range {p5 .. p5}, Lax/Z2/i;->c()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    add-int/lit8 v12, v12, 0x1

    .line 222
    .line 223
    move-object/from16 v1, p1

    .line 224
    .line 225
    move-object/from16 v7, p5

    .line 226
    .line 227
    :goto_e2
    move-object v6, v0

    .line 228
    move-object/from16 v0, p0

    .line 229
    .line 230
    goto :goto_76

    .line 231
    :cond_e6
    invoke-virtual/range {p5 .. p5}, Lax/Z2/i;->a()V

    .line 232
    .line 233
    .line 234
    move-object/from16 v0, p0

    .line 235
    .line 236
    move-object/from16 v1, p1

    .line 237
    .line 238
    move-object/from16 v2, p2

    .line 239
    .line 240
    move-object/from16 v4, p4

    .line 241
    .line 242
    move-object/from16 v5, p5

    .line 243
    .line 244
    move-object/from16 v6, p6

    .line 245
    .line 246
    invoke-direct/range {v0 .. v6}, Lax/T2/h;->q0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Lcom/voxdon/xplorer/file/n;Ljava/io/BufferedWriter;Lax/Z2/i;Lax/u3/c;)V

    .line 247
    .line 248
    .line 249
    move-object v7, v5

    .line 250
    invoke-virtual {v7}, Lax/Z2/i;->c()Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    add-int/lit8 v12, v12, 0x1

    .line 255
    .line 256
    goto :goto_e2

    .line 257
    :cond_100
    if-gez v2, :cond_113

    .line 258
    .line 259
    move-object/from16 v0, p0

    .line 260
    .line 261
    move-object/from16 v1, p1

    .line 262
    .line 263
    move-object/from16 v2, p2

    .line 264
    .line 265
    move-object/from16 v4, p4

    .line 266
    .line 267
    move-object/from16 v5, p6

    .line 268
    .line 269
    invoke-direct/range {v0 .. v5}, Lax/T2/h;->s0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Lcom/voxdon/xplorer/file/n;Ljava/io/Writer;Lax/u3/c;)V

    .line 270
    .line 271
    .line 272
    add-int/lit8 v12, v12, 0x1

    .line 273
    .line 274
    goto/16 :goto_76

    .line 275
    .line 276
    :cond_113
    move-object/from16 v0, p0

    .line 277
    .line 278
    move-object/from16 v1, p1

    .line 279
    .line 280
    invoke-virtual {v7}, Lax/Z2/i;->a()V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v7}, Lax/Z2/i;->c()Ljava/lang/String;

    .line 284
    .line 285
    .line 286
    move-result-object v2

    .line 287
    move-object v6, v2

    .line 288
    goto/16 :goto_76

    .line 289
    .line 290
    :cond_121
    invoke-direct {v0, v1, v10, v7}, Lax/T2/h;->p(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;Lax/Z2/i;)V

    .line 291
    .line 292
    .line 293
    return-void
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

.method public static r(Lax/c3/K;)I
    .registers 3

    .line 1
    sget-object v0, Lax/c3/K;->e:Lax/c3/K;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lax/c3/K;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_a

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_a
    sget-object v0, Lax/c3/K;->f:Lax/c3/K;

    .line 12
    .line 13
    invoke-virtual {v0, p0}, Lax/c3/K;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_14

    .line 18
    .line 19
    const/4 p0, 0x2

    .line 20
    return p0

    .line 21
    :cond_14
    if-eqz p0, :cond_25

    .line 22
    .line 23
    sget-object v0, Lax/Q2/f;->v0:Lax/Q2/f;

    .line 24
    .line 25
    invoke-virtual {p0}, Lax/c3/K;->d()Lax/Q2/f;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-ne v0, v1, :cond_25

    .line 30
    .line 31
    invoke-virtual {p0}, Lax/c3/K;->b()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    add-int/lit8 p0, p0, 0x64

    .line 36
    .line 37
    return p0

    .line 38
    :cond_25
    const/4 p0, 0x0

    .line 39
    return p0
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

.method private r0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Ljava/util/Stack;Ljava/io/Writer;)V
    .registers 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/o;",
            "Lax/T2/h$f;",
            "Ljava/util/Stack<",
            "Lcom/voxdon/xplorer/file/n;",
            ">;",
            "Ljava/io/Writer;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/b3/j;
        }
    .end annotation

    .line 1
    invoke-virtual {p3}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move-object v4, v0

    .line 6
    check-cast v4, Lcom/voxdon/xplorer/file/n;

    .line 7
    .line 8
    invoke-static {v4}, Lcom/voxdon/xplorer/file/J;->j2(Lcom/voxdon/xplorer/file/n;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_10

    .line 13
    .line 14
    :goto_d
    move-object v1, p0

    .line 15
    goto/16 :goto_8a

    .line 16
    .line 17
    :cond_10
    invoke-direct {p0, v4}, Lax/T2/h;->x0(Lcom/voxdon/xplorer/file/n;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_17

    .line 22
    .line 23
    goto :goto_d

    .line 24
    :cond_17
    invoke-interface {v4}, Lax/c3/b;->n()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_33

    .line 29
    .line 30
    :try_start_1d
    invoke-direct {p0, p1, v4}, Lax/T2/h;->z0(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object v0
    :try_end_21
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1d .. :try_end_21} :catch_22
    .catch Lax/b3/e; {:try_start_1d .. :try_end_21} :catch_33

    .line 34
    goto :goto_34

    .line 35
    :catch_22
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const-string v1, "Analysis: listFiles OUT OF MEMORY"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Lax/Ha/b;->h()V

    .line 50
    .line 51
    .line 52
    :catch_33
    :cond_33
    const/4 v0, 0x0

    .line 53
    :goto_34
    new-instance v8, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    new-instance v5, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    if-nez v0, :cond_49

    .line 64
    .line 65
    const/4 v7, 0x1

    .line 66
    move-object v1, p0

    .line 67
    move-object v2, p1

    .line 68
    move-object v3, p2

    .line 69
    move-object v6, p4

    .line 70
    invoke-direct/range {v1 .. v7}, Lax/T2/h;->Q0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Lcom/voxdon/xplorer/file/n;Ljava/util/List;Ljava/io/Writer;Z)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_49
    move-object v2, p1

    .line 75
    move-object v3, p2

    .line 76
    move-object v6, p4

    .line 77
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    :goto_50
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-eqz p2, :cond_6a

    .line 86
    .line 87
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    check-cast p2, Lcom/voxdon/xplorer/file/n;

    .line 92
    .line 93
    invoke-interface {p2}, Lax/c3/b;->isDirectory()Z

    .line 94
    .line 95
    .line 96
    move-result p4

    .line 97
    if-eqz p4, :cond_66

    .line 98
    .line 99
    invoke-virtual {v8, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_50

    .line 103
    :cond_66
    invoke-virtual {v5, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    goto :goto_50

    .line 107
    :cond_6a
    const/4 v7, 0x0

    .line 108
    move-object v1, p0

    .line 109
    invoke-direct/range {v1 .. v7}, Lax/T2/h;->Q0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Lcom/voxdon/xplorer/file/n;Ljava/util/List;Ljava/io/Writer;Z)V

    .line 110
    .line 111
    .line 112
    new-instance p1, Lax/T2/h$d;

    .line 113
    .line 114
    invoke-direct {p1, p0}, Lax/T2/h$d;-><init>(Lax/T2/h;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v8, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 121
    .line 122
    .line 123
    move-result p1

    .line 124
    const/4 p2, 0x0

    .line 125
    :goto_7c
    if-ge p2, p1, :cond_8a

    .line 126
    .line 127
    invoke-virtual {v8, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p4

    .line 131
    add-int/lit8 p2, p2, 0x1

    .line 132
    .line 133
    check-cast p4, Lcom/voxdon/xplorer/file/n;

    .line 134
    .line 135
    invoke-virtual {p3, p4}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    goto :goto_7c

    .line 139
    :cond_8a
    :goto_8a
    return-void
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

.method private s0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Lcom/voxdon/xplorer/file/n;Ljava/io/Writer;Lax/u3/c;)V
    .registers 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/Stack;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    :goto_8
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    if-nez p3, :cond_21

    .line 14
    .line 15
    if-eqz p5, :cond_1d

    .line 16
    .line 17
    invoke-interface {p5}, Lax/u3/c;->isCancelled()Z

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-nez p3, :cond_17

    .line 22
    .line 23
    goto :goto_1d

    .line 24
    :cond_17
    new-instance p1, Lax/b3/a;

    .line 25
    .line 26
    invoke-direct {p1}, Lax/b3/a;-><init>()V

    .line 27
    .line 28
    .line 29
    throw p1

    .line 30
    :cond_1d
    :goto_1d
    invoke-direct {p0, p1, p2, v0, p4}, Lax/T2/h;->r0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Ljava/util/Stack;Ljava/io/Writer;)V

    .line 31
    .line 32
    .line 33
    goto :goto_8

    .line 34
    :cond_21
    return-void
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
.end method

.method private t0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Ljava/lang/String;Ljava/io/BufferedWriter;Lax/Z2/i;Lax/u3/c;)V
    .registers 14
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    new-instance v3, Ljava/util/Stack;

    .line 2
    .line 3
    invoke-direct {v3}, Ljava/util/Stack;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v3, p3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    :goto_8
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    if-nez p3, :cond_2c

    .line 14
    .line 15
    if-eqz p6, :cond_16

    .line 16
    .line 17
    invoke-interface {p6}, Lax/u3/c;->isCancelled()Z

    .line 18
    .line 19
    .line 20
    move-result p3

    .line 21
    if-nez p3, :cond_1d

    .line 22
    .line 23
    :cond_16
    move-object v0, p0

    .line 24
    move-object v1, p1

    .line 25
    move-object v2, p2

    .line 26
    move-object v4, p4

    .line 27
    move-object v5, p5

    .line 28
    move-object v6, p6

    .line 29
    goto :goto_23

    .line 30
    :cond_1d
    new-instance p1, Lax/b3/a;

    .line 31
    .line 32
    invoke-direct {p1}, Lax/b3/a;-><init>()V

    .line 33
    .line 34
    .line 35
    throw p1

    .line 36
    :goto_23
    invoke-direct/range {v0 .. v6}, Lax/T2/h;->u0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Ljava/util/Stack;Ljava/io/BufferedWriter;Lax/Z2/i;Lax/u3/c;)V

    .line 37
    .line 38
    .line 39
    move-object p1, v1

    .line 40
    move-object p2, v2

    .line 41
    move-object p4, v4

    .line 42
    move-object p5, v5

    .line 43
    move-object p6, v6

    .line 44
    goto :goto_8

    .line 45
    :cond_2c
    return-void
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
.end method

.method private u()V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/T2/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/T2/h;->g:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_a
    if-ge v3, v2, :cond_1a

    .line 12
    .line 13
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    add-int/lit8 v3, v3, 0x1

    .line 18
    .line 19
    check-cast v4, Lax/T2/h$g;

    .line 20
    .line 21
    invoke-interface {v4}, Lax/T2/h$g;->b()V

    .line 22
    .line 23
    .line 24
    goto :goto_a

    .line 25
    :catchall_18
    move-exception v1

    .line 26
    goto :goto_1c

    .line 27
    :cond_1a
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :goto_1c
    monitor-exit v0
    :try_end_1d
    .catchall {:try_start_3 .. :try_end_1d} :catchall_18

    .line 30
    throw v1
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
.end method

.method private u0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Ljava/util/Stack;Ljava/io/BufferedWriter;Lax/Z2/i;Lax/u3/c;)V
    .registers 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/o;",
            "Lax/T2/h$f;",
            "Ljava/util/Stack<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/io/BufferedWriter;",
            "Lax/Z2/i;",
            "Lax/u3/c;",
            ")V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    move-object v3, v2

    .line 11
    :goto_a
    invoke-virtual/range {p5 .. p5}, Lax/Z2/i;->c()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    if-eqz v4, :cond_df

    .line 16
    .line 17
    const-string v5, "\u0000"

    .line 18
    .line 19
    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    const/4 v6, 0x0

    .line 24
    aget-object v6, v5, v6

    .line 25
    .line 26
    invoke-static {v6}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-static {v6}, Lax/c3/d0;->B(Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    if-nez v7, :cond_56

    .line 35
    .line 36
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    const-string v7, "ANALYSIS ISCD:"

    .line 41
    .line 42
    invoke-virtual {v5, v7}, Lax/Ha/b;->d(Ljava/lang/String;)Lax/Ha/b;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    new-instance v7, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v6, ":"

    .line 55
    .line 56
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    invoke-virtual {v5, v4}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-virtual {v4}, Lax/Ha/b;->h()V

    .line 81
    .line 82
    .line 83
    invoke-virtual/range {p5 .. p5}, Lax/Z2/i;->a()V

    .line 84
    .line 85
    .line 86
    goto :goto_a

    .line 87
    :cond_56
    invoke-static {v6}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v7

    .line 91
    invoke-virtual {v7, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-nez v7, :cond_62

    .line 96
    .line 97
    if-nez v1, :cond_df

    .line 98
    .line 99
    :cond_62
    if-eqz v2, :cond_6e

    .line 100
    .line 101
    if-eqz v3, :cond_6e

    .line 102
    .line 103
    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v7

    .line 107
    if-eqz v7, :cond_6e

    .line 108
    .line 109
    :goto_6c
    move-object v10, v3

    .line 110
    goto :goto_8e

    .line 111
    :cond_6e
    invoke-virtual {p1, v6}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-interface {v3}, Lax/c3/b;->q()J

    .line 116
    .line 117
    .line 118
    move-result-wide v7

    .line 119
    const-wide/16 v9, 0x0

    .line 120
    .line 121
    cmp-long v2, v7, v9

    .line 122
    .line 123
    if-nez v2, :cond_8c

    .line 124
    .line 125
    invoke-static {}, Lax/X2/Q;->L()Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eqz v2, :cond_8c

    .line 130
    .line 131
    instance-of v2, v3, Lcom/voxdon/xplorer/file/y;

    .line 132
    .line 133
    if-eqz v2, :cond_8c

    .line 134
    .line 135
    move-object v2, v3

    .line 136
    check-cast v2, Lcom/voxdon/xplorer/file/y;

    .line 137
    .line 138
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/y;->q1()V

    .line 139
    .line 140
    .line 141
    :cond_8c
    move-object v2, v6

    .line 142
    goto :goto_6c

    .line 143
    :goto_8e
    invoke-direct {p0, v10}, Lax/T2/h;->x0(Lcom/voxdon/xplorer/file/n;)Z

    .line 144
    .line 145
    .line 146
    move-result v3

    .line 147
    if-eqz v3, :cond_98

    .line 148
    .line 149
    invoke-virtual/range {p5 .. p5}, Lax/Z2/i;->a()V

    .line 150
    .line 151
    .line 152
    goto :goto_dc

    .line 153
    :cond_98
    invoke-interface {v10}, Lax/c3/b;->q()J

    .line 154
    .line 155
    .line 156
    move-result-wide v7

    .line 157
    const/4 v3, 0x1

    .line 158
    aget-object v3, v5, v3

    .line 159
    .line 160
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 161
    .line 162
    .line 163
    move-result-wide v11

    .line 164
    cmp-long v3, v7, v11

    .line 165
    .line 166
    if-nez v3, :cond_cc

    .line 167
    .line 168
    new-instance v2, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    const-string v3, "\n"

    .line 177
    .line 178
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    move-object/from16 v11, p4

    .line 186
    .line 187
    invoke-virtual {v11, v2}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    move-object/from16 v9, p2

    .line 191
    .line 192
    invoke-direct {p0, p1, v9, v6, v5}, Lax/T2/h;->K0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Ljava/lang/String;[Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual/range {p5 .. p5}, Lax/Z2/i;->a()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0, v1}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v6}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :cond_cc
    move-object/from16 v9, p2

    .line 206
    .line 207
    move-object/from16 v11, p4

    .line 208
    .line 209
    invoke-virtual/range {p5 .. p5}, Lax/Z2/i;->a()V

    .line 210
    .line 211
    .line 212
    move-object v7, p0

    .line 213
    move-object v8, p1

    .line 214
    move-object/from16 v12, p5

    .line 215
    .line 216
    move-object/from16 v13, p6

    .line 217
    .line 218
    invoke-direct/range {v7 .. v13}, Lax/T2/h;->q0(Lcom/voxdon/xplorer/file/o;Lax/T2/h$f;Lcom/voxdon/xplorer/file/n;Ljava/io/BufferedWriter;Lax/Z2/i;Lax/u3/c;)V

    .line 219
    .line 220
    .line 221
    :goto_dc
    move-object v3, v10

    .line 222
    goto/16 :goto_a

    .line 223
    .line 224
    :cond_df
    return-void
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

.method private v(Ljava/lang/String;Z)V
    .registers 8

    .line 1
    iget-object v0, p0, Lax/T2/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/T2/h;->g:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_a
    if-ge v3, v2, :cond_1a

    .line 12
    .line 13
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    add-int/lit8 v3, v3, 0x1

    .line 18
    .line 19
    check-cast v4, Lax/T2/h$g;

    .line 20
    .line 21
    invoke-interface {v4, p1, p2}, Lax/T2/h$g;->c(Ljava/lang/String;Z)V

    .line 22
    .line 23
    .line 24
    goto :goto_a

    .line 25
    :catchall_18
    move-exception p1

    .line 26
    goto :goto_1c

    .line 27
    :cond_1a
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :goto_1c
    monitor-exit v0
    :try_end_1d
    .catchall {:try_start_3 .. :try_end_1d} :catchall_18

    .line 30
    throw p1
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

.method private w(I)V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/T2/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/T2/h;->g:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_a
    if-ge v3, v2, :cond_1a

    .line 12
    .line 13
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    add-int/lit8 v3, v3, 0x1

    .line 18
    .line 19
    check-cast v4, Lax/T2/h$g;

    .line 20
    .line 21
    invoke-interface {v4, p1}, Lax/T2/h$g;->d(I)V

    .line 22
    .line 23
    .line 24
    goto :goto_a

    .line 25
    :catchall_18
    move-exception p1

    .line 26
    goto :goto_1c

    .line 27
    :cond_1a
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :goto_1c
    monitor-exit v0
    :try_end_1d
    .catchall {:try_start_3 .. :try_end_1d} :catchall_18

    .line 30
    throw p1
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

.method private x0(Lcom/voxdon/xplorer/file/n;)Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/T2/h;->k:Ljava/util/Set;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_6
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private z0(Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/voxdon/xplorer/file/o;",
            "Lcom/voxdon/xplorer/file/n;",
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
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/file/o;->f0(Lcom/voxdon/xplorer/file/n;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
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
.end method


# virtual methods
.method public A0(Lax/T2/h$g;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/T2/h;->j:Ljava/util/concurrent/CountDownLatch;

    .line 2
    .line 3
    if-nez v0, :cond_8

    .line 4
    .line 5
    invoke-static {}, Lax/u3/b;->f()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    if-eqz p1, :cond_10

    .line 10
    .line 11
    :try_start_a
    invoke-virtual {p0, p1}, Lax/T2/h;->c(Lax/T2/h$g;)V

    .line 12
    .line 13
    .line 14
    goto :goto_10

    .line 15
    :catchall_e
    move-exception v0

    .line 16
    goto :goto_24

    .line 17
    :cond_10
    :goto_10
    iget-object v0, p0, Lax/T2/h;->j:Ljava/util/concurrent/CountDownLatch;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_15
    .catch Ljava/lang/InterruptedException; {:try_start_a .. :try_end_15} :catch_1b
    .catchall {:try_start_a .. :try_end_15} :catchall_e

    .line 20
    .line 21
    .line 22
    if-eqz p1, :cond_23

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lax/T2/h;->I0(Lax/T2/h$g;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catch_1b
    :try_start_1b
    invoke-static {}, Lax/u3/b;->f()V
    :try_end_1e
    .catchall {:try_start_1b .. :try_end_1e} :catchall_e

    .line 29
    .line 30
    .line 31
    if-eqz p1, :cond_23

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lax/T2/h;->I0(Lax/T2/h$g;)V

    .line 34
    .line 35
    .line 36
    :cond_23
    return-void

    .line 37
    :goto_24
    if-eqz p1, :cond_29

    .line 38
    .line 39
    invoke-virtual {p0, p1}, Lax/T2/h;->I0(Lax/T2/h$g;)V

    .line 40
    .line 41
    .line 42
    :cond_29
    throw v0
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

.method public B0()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/T2/h;->n:Z

    .line 2
    .line 3
    return v0
    .line 4
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

.method public C()Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    iget-object v1, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 10
    .line 11
    iget-object v1, v1, Lax/T2/h$f;->j:Ljava/util/List;

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 14
    .line 15
    .line 16
    return-object v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public D()J
    .registers 6

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    iget-wide v1, v0, Lax/T2/h$f;->s:J

    .line 4
    .line 5
    iget-wide v3, v0, Lax/T2/h$f;->u:J

    .line 6
    .line 7
    add-long/2addr v1, v3

    .line 8
    iget-wide v3, v0, Lax/T2/h$f;->t:J

    .line 9
    .line 10
    add-long/2addr v1, v3

    .line 11
    return-wide v1
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

.method public E(Lcom/voxdon/xplorer/file/n;)J
    .registers 5

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_7

    .line 6
    .line 7
    return-wide v1

    .line 8
    :cond_7
    iget-object v0, v0, Lax/T2/h$f;->d:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lax/T2/h;->d0(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/Long;

    .line 19
    .line 20
    if-eqz p1, :cond_1a

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    return-wide v0

    .line 27
    :cond_1a
    return-wide v1
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

.method public F(Lcom/voxdon/xplorer/file/n;)J
    .registers 4

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_5

    .line 5
    :cond_4
    const/4 v0, 0x0

    .line 6
    :goto_5
    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Lax/u3/b;->c(Z)V

    .line 14
    .line 15
    .line 16
    check-cast p1, Lcom/voxdon/xplorer/file/y;

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/y;->F0()Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljava/io/File;->getTotalSpace()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    return-wide v0
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

.method public F0(Landroid/app/usage/UsageStatsManager;JJ)Ljava/util/Map;
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/usage/UsageStatsManager;",
            "JJ)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/app/usage/UsageStats;",
            ">;"
        }
    .end annotation

    .line 1
    const/4 v1, 0x2

    .line 2
    move-object v0, p1

    .line 3
    move-wide v2, p2

    .line 4
    move-wide v4, p4

    .line 5
    invoke-virtual/range {v0 .. v5}, Landroid/app/usage/UsageStatsManager;->queryUsageStats(IJJ)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_11

    .line 14
    .line 15
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_11
    new-instance p2, Landroid/util/ArrayMap;

    .line 19
    .line 20
    invoke-direct {p2}, Landroid/util/ArrayMap;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result p3

    .line 27
    const/4 p4, 0x0

    .line 28
    :goto_1b
    if-ge p4, p3, :cond_3d

    .line 29
    .line 30
    invoke-interface {p1, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p5

    .line 34
    check-cast p5, Landroid/app/usage/UsageStats;

    .line 35
    .line 36
    invoke-virtual {p5}, Landroid/app/usage/UsageStats;->getPackageName()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {p2, v0}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Landroid/app/usage/UsageStats;

    .line 45
    .line 46
    if-nez v0, :cond_37

    .line 47
    .line 48
    invoke-virtual {p5}, Landroid/app/usage/UsageStats;->getPackageName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p2, v0, p5}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    goto :goto_3a

    .line 56
    :cond_37
    invoke-virtual {v0, p5}, Landroid/app/usage/UsageStats;->add(Landroid/app/usage/UsageStats;)V

    .line 57
    .line 58
    .line 59
    :goto_3a
    add-int/lit8 p4, p4, 0x1

    .line 60
    .line 61
    goto :goto_1b

    .line 62
    :cond_3d
    return-object p2
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

.method public G()Ljava/util/List;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/T2/h$h;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-eqz v0, :cond_11

    .line 4
    .line 5
    iget-object v0, v0, Lax/T2/h$f;->m:Lax/T2/j;

    .line 6
    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_11

    .line 10
    :cond_9
    iget-object v1, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 11
    .line 12
    const/4 v2, 0x5

    .line 13
    invoke-virtual {v0, v1, v2}, Lax/T2/j;->b(Lax/c3/K;I)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_11
    :goto_11
    const/4 v0, 0x0

    .line 19
    return-object v0
    .line 20
    .line 21
.end method

.method public G0()V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/T2/h;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/T2/h;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_18

    .line 11
    .line 12
    sget-object v1, Lax/T2/h;->p:Ljava/util/logging/Logger;

    .line 13
    .line 14
    const-string v2, "analysis instance all released : clear"

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lax/T2/h;->n()V

    .line 20
    .line 21
    .line 22
    goto :goto_18

    .line 23
    :catchall_16
    move-exception v1

    .line 24
    goto :goto_1a

    .line 25
    :cond_18
    :goto_18
    monitor-exit v0

    .line 26
    return-void

    .line 27
    :goto_1a
    monitor-exit v0
    :try_end_1b
    .catchall {:try_start_3 .. :try_end_1b} :catchall_16

    .line 28
    throw v1
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
.end method

.method public H()Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/T2/h$h;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-eqz v0, :cond_10

    .line 4
    .line 5
    iget-object v0, v0, Lax/T2/h$f;->m:Lax/T2/j;

    .line 6
    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_10

    .line 10
    :cond_9
    iget-object v1, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lax/T2/j;->c(Lax/c3/K;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :cond_10
    :goto_10
    const/4 v0, 0x0

    .line 18
    return-object v0
    .line 19
    .line 20
    .line 21
.end method

.method public H0(Landroid/content/Context;)V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/T2/h;->A(Landroid/content/Context;Lax/c3/K;)Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 8
    .line 9
    .line 10
    return-void
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

.method public I()Lax/T2/j;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_6
    iget-object v0, v0, Lax/T2/h$f;->m:Lax/T2/j;

    .line 8
    .line 9
    return-object v0
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

.method public I0(Lax/T2/h$g;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/T2/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/T2/h;->g:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_a
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_3 .. :try_end_c} :catchall_a

    .line 13
    throw p1
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

.method public J()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    iget-object v0, v0, Lax/T2/h$f;->m:Lax/T2/j;

    .line 6
    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_c

    .line 10
    :cond_9
    iget-wide v0, v0, Lax/T2/j;->b:J

    .line 11
    .line 12
    return-wide v0

    .line 13
    :cond_c
    :goto_c
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    return-wide v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public J0()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/T2/h;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/T2/h;->m:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_a
    move-exception v1

    .line 12
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_3 .. :try_end_c} :catchall_a

    .line 13
    throw v1
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public K()Ljava/util/List;
    .registers 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/T2/h$h;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-eqz v0, :cond_11

    .line 4
    .line 5
    iget-object v0, v0, Lax/T2/h$f;->n:Lax/T2/j;

    .line 6
    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_11

    .line 10
    :cond_9
    iget-object v1, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 11
    .line 12
    const/4 v2, 0x5

    .line 13
    invoke-virtual {v0, v1, v2}, Lax/T2/j;->b(Lax/c3/K;I)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_11
    :goto_11
    const/4 v0, 0x0

    .line 19
    return-object v0
    .line 20
    .line 21
.end method

.method public L()Lax/T2/j;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_6
    iget-object v0, v0, Lax/T2/h$f;->n:Lax/T2/j;

    .line 8
    .line 9
    return-object v0
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

.method public L0()V
    .registers 2

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lax/T2/h;->n:Z

    .line 8
    .line 9
    return-void
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

.method public M()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-eqz v0, :cond_c

    .line 4
    .line 5
    iget-object v0, v0, Lax/T2/h$f;->n:Lax/T2/j;

    .line 6
    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_c

    .line 10
    :cond_9
    iget-wide v0, v0, Lax/T2/j;->b:J

    .line 11
    .line 12
    return-wide v0

    .line 13
    :cond_c
    :goto_c
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    return-wide v0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public N()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/T2/h$h;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_6
    iget-object v0, v0, Lax/T2/h$f;->h:Ljava/util/ArrayList;

    .line 8
    .line 9
    return-object v0
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

.method public N0(J)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    iget-wide v1, v0, Lax/T2/h$f;->q:J

    .line 7
    .line 8
    sub-long/2addr v1, p1

    .line 9
    iput-wide v1, v0, Lax/T2/h$f;->q:J

    .line 10
    .line 11
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

.method public O()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_7
    iget-wide v0, v0, Lax/T2/h$f;->q:J

    .line 9
    .line 10
    return-wide v0
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

.method public O0(J)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    iget-wide v1, v0, Lax/T2/h$f;->o:J

    .line 7
    .line 8
    sub-long/2addr v1, p1

    .line 9
    iput-wide v1, v0, Lax/T2/h$f;->o:J

    .line 10
    .line 11
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

.method public P()Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-eqz v0, :cond_13

    .line 4
    .line 5
    iget-object v0, v0, Lax/T2/h$f;->l:Ljava/util/List;

    .line 6
    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_13

    .line 10
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v1, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 13
    .line 14
    iget-object v1, v1, Lax/T2/h$f;->l:Ljava/util/List;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_13
    :goto_13
    const/4 v0, 0x0

    .line 21
    return-object v0
.end method

.method public P0(Ljava/util/List;)V
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-eqz v0, :cond_64

    .line 4
    .line 5
    iget-object v0, v0, Lax/T2/h$f;->k:Ljava/util/List;

    .line 6
    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_64

    .line 10
    :cond_9
    invoke-virtual {p0}, Lax/T2/h;->h0()Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_10

    .line 15
    .line 16
    goto :goto_64

    .line 17
    :cond_10
    new-instance v1, Ljava/util/HashSet;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    :goto_19
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2d

    .line 31
    .line 32
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lax/U2/f;

    .line 37
    .line 38
    invoke-virtual {v2}, Lax/U2/f;->r()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    goto :goto_19

    .line 46
    :cond_2d
    iget-object p1, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 47
    .line 48
    iget-wide v2, p1, Lax/T2/h$f;->s:J

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const/4 v4, 0x0

    .line 55
    const/4 v5, 0x0

    .line 56
    :cond_37
    :goto_37
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    const/4 v7, 0x1

    .line 61
    if-eqz v6, :cond_58

    .line 62
    .line 63
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    check-cast v6, Lax/U2/f;

    .line 68
    .line 69
    invoke-virtual {v6}, Lax/U2/f;->r()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    invoke-virtual {v1, v8}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-nez v8, :cond_37

    .line 78
    .line 79
    invoke-interface {p1}, Ljava/util/ListIterator;->remove()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v6}, Lax/U2/f;->s()J

    .line 83
    .line 84
    .line 85
    move-result-wide v5

    .line 86
    sub-long/2addr v2, v5

    .line 87
    const/4 v5, 0x1

    .line 88
    goto :goto_37

    .line 89
    :cond_58
    if-eqz v5, :cond_62

    .line 90
    .line 91
    iget-object p1, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 92
    .line 93
    iput-object v0, p1, Lax/T2/h$f;->k:Ljava/util/List;

    .line 94
    .line 95
    iput-wide v2, p1, Lax/T2/h$f;->x:J

    .line 96
    .line 97
    iput-boolean v7, p1, Lax/T2/h$f;->w:Z

    .line 98
    .line 99
    :cond_62
    iput-boolean v4, p0, Lax/T2/h;->n:Z

    .line 100
    .line 101
    :cond_64
    :goto_64
    return-void
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

.method public Q(Lax/c3/z;)J
    .registers 4

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    invoke-virtual {p0, v0, p1}, Lax/T2/h;->R(Lax/T2/h$f;Lax/c3/z;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method public R(Lax/T2/h$f;Lax/c3/z;)J
    .registers 8

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_5

    .line 4
    .line 5
    return-wide v0

    .line 6
    :cond_5
    invoke-static {p2}, Lax/c3/A;->H(Lax/c3/z;)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-nez v2, :cond_1b

    .line 11
    .line 12
    iget-object p1, p1, Lax/T2/h$f;->e:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Ljava/lang/Long;

    .line 19
    .line 20
    if-nez p1, :cond_16

    .line 21
    .line 22
    return-wide v0

    .line 23
    :cond_16
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    return-wide p1

    .line 28
    :cond_1b
    invoke-static {p2}, Lax/c3/A;->j(Lax/c3/z;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-nez v2, :cond_22

    .line 33
    .line 34
    return-wide v0

    .line 35
    :cond_22
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    :cond_26
    :goto_26
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_42

    .line 44
    .line 45
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Lax/c3/z;

    .line 50
    .line 51
    iget-object v4, p1, Lax/T2/h$f;->e:Ljava/util/HashMap;

    .line 52
    .line 53
    invoke-virtual {v4, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Ljava/lang/Long;

    .line 58
    .line 59
    if-eqz v3, :cond_26

    .line 60
    .line 61
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 62
    .line 63
    .line 64
    move-result-wide v3

    .line 65
    add-long/2addr v0, v3

    .line 66
    goto :goto_26

    .line 67
    :cond_42
    iget-object p1, p1, Lax/T2/h$f;->e:Ljava/util/HashMap;

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    check-cast p1, Ljava/lang/Long;

    .line 74
    .line 75
    if-eqz p1, :cond_51

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 78
    .line 79
    .line 80
    move-result-wide p1

    .line 81
    add-long/2addr v0, p1

    .line 82
    :cond_51
    return-wide v0
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

.method public U()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/T2/h$h;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_6
    iget-object v0, v0, Lax/T2/h$f;->f:Ljava/util/ArrayList;

    .line 8
    .line 9
    return-object v0
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

.method public V()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/T2/h$h;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_6
    iget-object v0, v0, Lax/T2/h$f;->g:Ljava/util/ArrayList;

    .line 8
    .line 9
    return-object v0
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

.method public W()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_7
    iget-wide v0, v0, Lax/T2/h$f;->o:J

    .line 9
    .line 10
    return-wide v0
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

.method public X()Lax/c3/K;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 2
    .line 3
    return-object v0
    .line 4
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

.method public Y(Lcom/voxdon/xplorer/file/n;)J
    .registers 4

    .line 1
    invoke-interface {p1}, Lax/c3/b;->isDirectory()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_b

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Lax/T2/h;->E(Lcom/voxdon/xplorer/file/n;)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_b
    invoke-interface {p1}, Lax/c3/b;->p()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public Z()Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/T2/h$h;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/T2/h;->d:Lax/T2/h$i;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_6
    iget-object v0, v0, Lax/T2/h$i;->a:Ljava/util/ArrayList;

    .line 8
    .line 9
    return-object v0
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

.method public b(Lcom/voxdon/xplorer/file/n;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 2
    .line 3
    invoke-static {v0}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 8
    .line 9
    invoke-direct {p0, v1, v0, p1}, Lax/T2/h;->m(Lax/T2/h$f;Lcom/voxdon/xplorer/file/o;Lcom/voxdon/xplorer/file/n;)V

    .line 10
    .line 11
    .line 12
    return-void
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

.method public c(Lax/T2/h$g;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lax/T2/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/T2/h;->g:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_a
    move-exception p1

    .line 12
    monitor-exit v0
    :try_end_c
    .catchall {:try_start_3 .. :try_end_c} :catchall_a

    .line 13
    throw p1
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

.method public c0()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/T2/h;->d:Lax/T2/h$i;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_7
    iget-wide v0, v0, Lax/T2/h$i;->b:J

    .line 9
    .line 10
    return-wide v0
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

.method public f(ZLax/T2/h$g;Lax/u3/c;)V
    .registers 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lax/b3/j;,
            Lax/b3/a;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_ed

    .line 8
    .line 9
    :try_start_8
    invoke-virtual {p0}, Lax/T2/h;->J0()V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lax/T2/h;->i:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v0
    :try_end_e
    .catch Lax/b3/a; {:try_start_8 .. :try_end_e} :catch_20
    .catchall {:try_start_8 .. :try_end_e} :catchall_1d

    .line 15
    :try_start_e
    new-instance v1, Ljava/util/concurrent/CountDownLatch;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-direct {v1, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, Lax/T2/h;->j:Ljava/util/concurrent/CountDownLatch;

    .line 22
    .line 23
    monitor-exit v0
    :try_end_17
    .catchall {:try_start_e .. :try_end_17} :catchall_d5

    .line 24
    if-eqz p2, :cond_23

    .line 25
    .line 26
    :try_start_19
    invoke-virtual {p0, p2}, Lax/T2/h;->c(Lax/T2/h$g;)V

    .line 27
    .line 28
    .line 29
    goto :goto_23

    .line 30
    :catchall_1d
    move-exception p1

    .line 31
    goto/16 :goto_dc

    .line 32
    .line 33
    :catch_20
    move-exception p1

    .line 34
    goto/16 :goto_d8

    .line 35
    .line 36
    :cond_23
    :goto_23
    iget-object v0, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 37
    .line 38
    invoke-static {v0}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {}, Lax/X2/Q;->L()Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_4b

    .line 47
    .line 48
    iget-object v1, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 49
    .line 50
    sget-object v3, Lax/c3/K;->f:Lax/c3/K;

    .line 51
    .line 52
    if-ne v1, v3, :cond_4b

    .line 53
    .line 54
    new-instance v1, Ljava/util/HashSet;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object v1, p0, Lax/T2/h;->k:Ljava/util/Set;

    .line 60
    .line 61
    iget-object v3, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 62
    .line 63
    invoke-virtual {v3}, Lax/c3/K;->e()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    const-string v4, "/Android/data"

    .line 68
    .line 69
    invoke-static {v3, v4}, Lax/c3/d0;->P(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-interface {v1, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    :cond_4b
    new-instance v1, Lax/T2/h$f;

    .line 77
    .line 78
    invoke-direct {v1}, Lax/T2/h$f;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object v1, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 82
    .line 83
    new-instance v1, Lax/T2/h$i;

    .line 84
    .line 85
    invoke-direct {v1}, Lax/T2/h$i;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object v1, p0, Lax/T2/h;->d:Lax/T2/h$i;

    .line 89
    .line 90
    iget-object v1, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 91
    .line 92
    invoke-direct {p0, v1, p1, v0, p3}, Lax/T2/h;->l(Lax/T2/h$f;ZLcom/voxdon/xplorer/file/o;Lax/u3/c;)V

    .line 93
    .line 94
    .line 95
    if-eqz p3, :cond_6d

    .line 96
    .line 97
    invoke-interface {p3}, Lax/u3/c;->isCancelled()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-nez v1, :cond_67

    .line 102
    .line 103
    goto :goto_6d

    .line 104
    :cond_67
    new-instance p1, Lax/b3/a;

    .line 105
    .line 106
    invoke-direct {p1}, Lax/b3/a;-><init>()V

    .line 107
    .line 108
    .line 109
    throw p1

    .line 110
    :cond_6d
    :goto_6d
    iget-boolean v1, p0, Lax/T2/h;->l:Z

    .line 111
    .line 112
    if-nez v1, :cond_bd

    .line 113
    .line 114
    iget-object v1, p0, Lax/T2/h;->d:Lax/T2/h$i;

    .line 115
    .line 116
    iget-object v3, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 117
    .line 118
    invoke-direct {p0, v1, v3}, Lax/T2/h;->h(Lax/T2/h$i;Lax/c3/K;)V

    .line 119
    .line 120
    .line 121
    if-eqz p3, :cond_87

    .line 122
    .line 123
    invoke-interface {p3}, Lax/u3/c;->isCancelled()Z

    .line 124
    .line 125
    .line 126
    move-result p3

    .line 127
    if-nez p3, :cond_81

    .line 128
    .line 129
    goto :goto_87

    .line 130
    :cond_81
    new-instance p1, Lax/b3/a;

    .line 131
    .line 132
    invoke-direct {p1}, Lax/b3/a;-><init>()V

    .line 133
    .line 134
    .line 135
    throw p1

    .line 136
    :cond_87
    :goto_87
    if-eqz p1, :cond_bd

    .line 137
    .line 138
    invoke-static {}, Lax/X2/Q;->J1()Z

    .line 139
    .line 140
    .line 141
    move-result p3

    .line 142
    if-eqz p3, :cond_bd

    .line 143
    .line 144
    iget-object p3, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 145
    .line 146
    sget-object v1, Lax/c3/K;->e:Lax/c3/K;

    .line 147
    .line 148
    if-ne p3, v1, :cond_bd

    .line 149
    .line 150
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 151
    .line 152
    .line 153
    move-result-object p3

    .line 154
    invoke-virtual {p3}, Lax/Z2/j;->o0()Z

    .line 155
    .line 156
    .line 157
    move-result p3

    .line 158
    if-nez p3, :cond_bd

    .line 159
    .line 160
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->t()Landroid/content/Context;

    .line 161
    .line 162
    .line 163
    move-result-object p3

    .line 164
    invoke-static {p3}, Lax/u3/o;->d(Landroid/content/Context;)Z

    .line 165
    .line 166
    .line 167
    move-result p3

    .line 168
    if-eqz p3, :cond_bd

    .line 169
    .line 170
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->t()Landroid/content/Context;

    .line 171
    .line 172
    .line 173
    move-result-object p3

    .line 174
    iget-object v1, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 175
    .line 176
    iget-object v3, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 177
    .line 178
    invoke-direct {p0, p3, v1, v3}, Lax/T2/h;->g(Landroid/content/Context;Lax/T2/h$f;Lax/c3/K;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v0}, Lcom/voxdon/xplorer/file/o;->t()Landroid/content/Context;

    .line 182
    .line 183
    .line 184
    move-result-object p3

    .line 185
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 186
    .line 187
    invoke-direct {p0, p3, v0}, Lax/T2/h;->k(Landroid/content/Context;Lax/T2/h$f;)V

    .line 188
    .line 189
    .line 190
    :cond_bd
    iput-boolean p1, p0, Lax/T2/h;->b:Z

    .line 191
    .line 192
    iput-boolean v2, p0, Lax/T2/h;->e:Z

    .line 193
    .line 194
    const/4 p1, 0x0

    .line 195
    iput-boolean p1, p0, Lax/T2/h;->f:Z
    :try_end_c4
    .catch Lax/b3/a; {:try_start_19 .. :try_end_c4} :catch_20
    .catchall {:try_start_19 .. :try_end_c4} :catchall_1d

    .line 196
    .line 197
    invoke-virtual {p0}, Lax/T2/h;->G0()V

    .line 198
    .line 199
    .line 200
    invoke-direct {p0}, Lax/T2/h;->u()V

    .line 201
    .line 202
    .line 203
    if-eqz p2, :cond_cf

    .line 204
    .line 205
    invoke-virtual {p0, p2}, Lax/T2/h;->I0(Lax/T2/h$g;)V

    .line 206
    .line 207
    .line 208
    :cond_cf
    iget-object p1, p0, Lax/T2/h;->j:Ljava/util/concurrent/CountDownLatch;

    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :catchall_d5
    move-exception p1

    .line 215
    :try_start_d6
    monitor-exit v0
    :try_end_d7
    .catchall {:try_start_d6 .. :try_end_d7} :catchall_d5

    .line 216
    :try_start_d7
    throw p1
    :try_end_d8
    .catch Lax/b3/a; {:try_start_d7 .. :try_end_d8} :catch_20
    .catchall {:try_start_d7 .. :try_end_d8} :catchall_1d

    .line 217
    :goto_d8
    :try_start_d8
    invoke-virtual {p0}, Lax/T2/h;->t()V

    .line 218
    .line 219
    .line 220
    throw p1
    :try_end_dc
    .catchall {:try_start_d8 .. :try_end_dc} :catchall_1d

    .line 221
    :goto_dc
    invoke-virtual {p0}, Lax/T2/h;->G0()V

    .line 222
    .line 223
    .line 224
    invoke-direct {p0}, Lax/T2/h;->u()V

    .line 225
    .line 226
    .line 227
    if-eqz p2, :cond_e7

    .line 228
    .line 229
    invoke-virtual {p0, p2}, Lax/T2/h;->I0(Lax/T2/h$g;)V

    .line 230
    .line 231
    .line 232
    :cond_e7
    iget-object p2, p0, Lax/T2/h;->j:Ljava/util/concurrent/CountDownLatch;

    .line 233
    .line 234
    invoke-virtual {p2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 235
    .line 236
    .line 237
    throw p1

    .line 238
    :cond_ed
    new-instance p1, Lax/b3/j;

    .line 239
    .line 240
    const-string p2, "ROOT PATH IS NULL"

    .line 241
    .line 242
    invoke-direct {p1, p2}, Lax/b3/j;-><init>(Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    throw p1
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

.method public f0()Lax/c3/k0;
    .registers 2

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    :cond_6
    iget-object v0, v0, Lax/T2/h$f;->c:Lax/c3/k0;

    .line 8
    .line 9
    return-object v0
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

.method public h0()Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lax/U2/f;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-eqz v0, :cond_13

    .line 4
    .line 5
    iget-object v0, v0, Lax/T2/h$f;->k:Ljava/util/List;

    .line 6
    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    goto :goto_13

    .line 10
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    iget-object v1, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 13
    .line 14
    iget-object v1, v1, Lax/T2/h$f;->k:Ljava/util/List;

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_13
    :goto_13
    const/4 v0, 0x0

    .line 21
    return-object v0
.end method

.method public i()Z
    .registers 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_1
    invoke-virtual {p0}, Lax/T2/h;->J0()V

    .line 3
    .line 4
    .line 5
    new-instance v1, Lax/T2/h$i;

    .line 6
    .line 7
    invoke-direct {v1}, Lax/T2/h$i;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Lax/T2/h;->d:Lax/T2/h$i;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {p0, v1, v2}, Lax/T2/h;->h(Lax/T2/h$i;Lax/c3/K;)V

    .line 14
    .line 15
    .line 16
    iput-boolean v0, p0, Lax/T2/h;->b:Z

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    iput-boolean v1, p0, Lax/T2/h;->e:Z

    .line 20
    .line 21
    iput-boolean v0, p0, Lax/T2/h;->f:Z
    :try_end_16
    .catch Lax/b3/j; {:try_start_1 .. :try_end_16} :catch_1f
    .catchall {:try_start_1 .. :try_end_16} :catchall_1a

    .line 22
    .line 23
    invoke-virtual {p0}, Lax/T2/h;->G0()V

    .line 24
    .line 25
    .line 26
    return v1

    .line 27
    :catchall_1a
    move-exception v0

    .line 28
    invoke-virtual {p0}, Lax/T2/h;->G0()V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :catch_1f
    invoke-virtual {p0}, Lax/T2/h;->G0()V

    .line 33
    .line 34
    .line 35
    return v0
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
.end method

.method public i0()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    iget-wide v0, v0, Lax/T2/h$f;->x:J

    .line 4
    .line 5
    return-wide v0
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

.method public j0()J
    .registers 3

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    return-wide v0

    .line 8
    :cond_7
    iget-wide v0, v0, Lax/T2/h$f;->v:J

    .line 9
    .line 10
    return-wide v0
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

.method public k0()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/T2/h;->e:Z

    .line 2
    .line 3
    return v0
    .line 4
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

.method public l0()Z
    .registers 9

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_6

    .line 5
    .line 6
    return v1

    .line 7
    :cond_6
    iget-object v2, v0, Lax/T2/h$f;->h:Ljava/util/ArrayList;

    .line 8
    .line 9
    if-eqz v2, :cond_38

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x1

    .line 16
    if-ge v2, v3, :cond_12

    .line 17
    .line 18
    goto :goto_38

    .line 19
    :cond_12
    iget-object v2, v0, Lax/T2/h$f;->h:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-ne v2, v3, :cond_2f

    .line 26
    .line 27
    iget-object v2, v0, Lax/T2/h$f;->h:Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    check-cast v2, Lax/T2/h$h;

    .line 34
    .line 35
    const-string v4, "/Android/data/com.voxdon.xplorer/cache"

    .line 36
    .line 37
    invoke-virtual {v2}, Lax/T2/h$h;->a()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_2f

    .line 46
    .line 47
    return v1

    .line 48
    :cond_2f
    iget-wide v4, v0, Lax/T2/h$f;->q:J

    .line 49
    .line 50
    const-wide/16 v6, 0x0

    .line 51
    .line 52
    cmp-long v0, v4, v6

    .line 53
    .line 54
    if-lez v0, :cond_38

    .line 55
    .line 56
    return v3

    .line 57
    :cond_38
    :goto_38
    return v1
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
.end method

.method public m0()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/T2/h;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_a

    .line 4
    .line 5
    iget-boolean v0, p0, Lax/T2/h;->e:Z

    .line 6
    .line 7
    if-eqz v0, :cond_a

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_a
    const/4 v0, 0x0

    .line 12
    return v0
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

.method public n()V
    .registers 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lax/T2/h;->e:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Lax/T2/h;->b:Z

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
.end method

.method public o()V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    iget-object v1, v0, Lax/T2/h$f;->h:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    iput-wide v1, v0, Lax/T2/h$f;->q:J

    .line 14
    .line 15
    iget-object v3, v0, Lax/T2/h$f;->l:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 18
    .line 19
    .line 20
    iput-wide v1, v0, Lax/T2/h$f;->v:J

    .line 21
    .line 22
    return-void
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
.end method

.method public o0()Z
    .registers 3

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_12

    .line 5
    .line 6
    iget-object v0, v0, Lax/T2/h$f;->k:Ljava/util/List;

    .line 7
    .line 8
    if-nez v0, :cond_a

    .line 9
    .line 10
    goto :goto_12

    .line 11
    :cond_a
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-lez v0, :cond_12

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    return v0

    .line 19
    :cond_12
    :goto_12
    return v1
    .line 20
    .line 21
.end method

.method public s(Lcom/voxdon/xplorer/file/n;J)V
    .registers 9

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lax/T2/h;->d0(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    :goto_6
    iget-object v1, v0, Lax/T2/h$f;->d:Ljava/util/HashMap;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/Long;

    .line 14
    .line 15
    if-eqz v1, :cond_1e

    .line 16
    .line 17
    iget-object v2, v0, Lax/T2/h$f;->d:Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 20
    .line 21
    .line 22
    move-result-wide v3

    .line 23
    sub-long/2addr v3, p2

    .line 24
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_1e
    const-string v1, "/"

    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_27

    .line 38
    .line 39
    return-void

    .line 40
    :cond_27
    invoke-static {p1}, Lax/c3/d0;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    goto :goto_6
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

.method public t()V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/T2/h;->h:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/T2/h;->g:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    const/4 v3, 0x0

    .line 11
    :goto_a
    if-ge v3, v2, :cond_1a

    .line 12
    .line 13
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    add-int/lit8 v3, v3, 0x1

    .line 18
    .line 19
    check-cast v4, Lax/T2/h$g;

    .line 20
    .line 21
    invoke-interface {v4}, Lax/T2/h$g;->a()V

    .line 22
    .line 23
    .line 24
    goto :goto_a

    .line 25
    :catchall_18
    move-exception v1

    .line 26
    goto :goto_1c

    .line 27
    :cond_1a
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :goto_1c
    monitor-exit v0
    :try_end_1d
    .catchall {:try_start_3 .. :try_end_1d} :catchall_18

    .line 30
    throw v1
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
.end method

.method public v0()V
    .registers 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lax/T2/h;->f:Z

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

.method public w0()Z
    .registers 7

    .line 1
    iget-object v0, p0, Lax/T2/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_3
    iget-object v1, p0, Lax/T2/h;->j:Ljava/util/concurrent/CountDownLatch;

    .line 5
    .line 6
    if-eqz v1, :cond_15

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->getCount()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    cmp-long v5, v1, v3

    .line 15
    .line 16
    if-lez v5, :cond_15

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    goto :goto_16

    .line 20
    :catchall_13
    move-exception v1

    .line 21
    goto :goto_18

    .line 22
    :cond_15
    const/4 v1, 0x0

    .line 23
    :goto_16
    monitor-exit v0

    .line 24
    return v1

    .line 25
    :goto_18
    monitor-exit v0
    :try_end_19
    .catchall {:try_start_3 .. :try_end_19} :catchall_13

    .line 26
    throw v1
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
.end method

.method public x()V
    .registers 3

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-nez v0, :cond_5

    .line 4
    .line 5
    return-void

    .line 6
    :cond_5
    const/4 v1, 0x0

    .line 7
    iput-object v1, v0, Lax/T2/h$f;->m:Lax/T2/j;

    .line 8
    .line 9
    return-void
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

.method public y()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/T2/h;->c:Lax/T2/h$f;

    .line 2
    .line 3
    if-nez v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_6
    iget-boolean v0, v0, Lax/T2/h$f;->w:Z

    .line 8
    .line 9
    return v0
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

.method public y0()Z
    .registers 2

    .line 1
    iget-boolean v0, p0, Lax/T2/h;->f:Z

    .line 2
    .line 3
    return v0
    .line 4
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

.method public z(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    .line 1
    iget-object v0, p0, Lax/T2/h;->a:Lax/c3/K;

    .line 2
    .line 3
    invoke-virtual {v0}, Lax/c3/K;->e()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0, p1}, Lax/c3/d0;->P(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
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
