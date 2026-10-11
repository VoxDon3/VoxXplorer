.class public Lax/Z2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/Z2/g$c;,
        Lax/Z2/g$d;
    }
.end annotation


# static fields
.field private static g:Lax/Z2/g;


# instance fields
.field private a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroid/content/Context;

.field private c:Z

.field private d:Lax/Z2/g$c;

.field e:Landroid/content/BroadcastReceiver;

.field f:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lax/Z2/g;->a:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Lax/Z2/g$a;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lax/Z2/g$a;-><init>(Lax/Z2/g;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lax/Z2/g;->e:Landroid/content/BroadcastReceiver;

    .line 17
    .line 18
    new-instance v0, Lax/Z2/g$b;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lax/Z2/g$b;-><init>(Lax/Z2/g;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lax/Z2/g;->f:Landroid/content/BroadcastReceiver;

    .line 24
    .line 25
    return-void
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

.method static synthetic a(Lax/Z2/g;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/Z2/g;->k()V

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
.end method

.method static synthetic b(Lax/Z2/g;)V
    .registers 1

    .line 1
    invoke-direct {p0}, Lax/Z2/g;->o()V

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
.end method

.method public static c(Ljava/lang/String;)Lcom/voxdon/xplorer/file/y$b;
    .registers 3

    .line 1
    if-nez p0, :cond_5

    .line 2
    .line 3
    sget-object p0, Lcom/voxdon/xplorer/file/y$b;->q:Lcom/voxdon/xplorer/file/y$b;

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_5
    const-string v0, "S"

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_10

    .line 13
    .line 14
    sget-object p0, Lcom/voxdon/xplorer/file/y$b;->d0:Lcom/voxdon/xplorer/file/y$b;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_10
    const-string v0, "L"

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1b

    .line 24
    .line 25
    sget-object p0, Lcom/voxdon/xplorer/file/y$b;->e0:Lcom/voxdon/xplorer/file/y$b;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_1b
    new-instance v0, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v1, "Unknown hiddenType:"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, Lax/u3/b;->e(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    sget-object p0, Lcom/voxdon/xplorer/file/y$b;->q:Lcom/voxdon/xplorer/file/y$b;

    .line 49
    .line 50
    return-object p0
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

.method private d(Ljava/lang/String;)Ljava/lang/String;
    .registers 3

    .line 1
    const-string v0, ".hiddenFiles"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lax/c3/d0;->Q(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

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

.method private g(Lax/c3/K;Ljava/lang/String;)Ljava/io/BufferedWriter;
    .registers 4

    .line 1
    :try_start_0
    invoke-static {p1}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/o;->u()Lcom/voxdon/xplorer/file/m;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lcom/voxdon/xplorer/file/x;

    .line 10
    .line 11
    invoke-direct {p0, p2}, Lax/Z2/g;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, p2, v0}, Lcom/voxdon/xplorer/file/x;->c(Ljava/lang/String;Z)Ljava/io/OutputStream;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance p2, Ljava/io/BufferedWriter;

    .line 21
    .line 22
    new-instance v0, Ljava/io/OutputStreamWriter;

    .line 23
    .line 24
    invoke-direct {v0, p1}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p2, v0}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V
    :try_end_1d
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_1d} :catch_1e

    .line 28
    .line 29
    .line 30
    return-object p2

    .line 31
    :catch_1e
    const/4 p1, 0x0

    .line 32
    return-object p1
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

.method public static h()Lax/Z2/g;
    .registers 1

    .line 1
    sget-object v0, Lax/Z2/g;->g:Lax/Z2/g;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Lax/Z2/g;

    .line 6
    .line 7
    invoke-direct {v0}, Lax/Z2/g;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lax/Z2/g;->g:Lax/Z2/g;

    .line 11
    .line 12
    :cond_b
    sget-object v0, Lax/Z2/g;->g:Lax/Z2/g;

    .line 13
    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private declared-synchronized k()V
    .registers 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/Z2/g;->a:Ljava/util/Map;

    .line 3
    .line 4
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lax/Z2/j;->O()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_18

    .line 16
    .line 17
    sget-object v1, Lax/c3/K;->e:Lax/c3/K;

    .line 18
    .line 19
    invoke-direct {p0, v1, v0}, Lax/Z2/g;->l(Lax/c3/K;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    goto :goto_18

    .line 23
    :catchall_16
    move-exception v0

    .line 24
    goto :goto_29

    .line 25
    :cond_18
    :goto_18
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Lax/Z2/j;->T()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_27

    .line 34
    .line 35
    sget-object v1, Lax/c3/K;->f:Lax/c3/K;

    .line 36
    .line 37
    invoke-direct {p0, v1, v0}, Lax/Z2/g;->l(Lax/c3/K;Ljava/lang/String;)V
    :try_end_27
    .catchall {:try_start_1 .. :try_end_27} :catchall_16

    .line 38
    .line 39
    .line 40
    :cond_27
    monitor-exit p0

    .line 41
    return-void

    .line 42
    :goto_29
    :try_start_29
    monitor-exit p0
    :try_end_2a
    .catchall {:try_start_29 .. :try_end_2a} :catchall_16

    .line 43
    throw v0
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

.method private declared-synchronized l(Lax/c3/K;Ljava/lang/String;)V
    .registers 9

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x0

    .line 3
    :try_start_2
    invoke-static {p1}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {p0, p2}, Lax/Z2/g;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    invoke-virtual {v1, p2}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-interface {p2}, Lax/c3/b;->n()Z

    .line 16
    .line 17
    .line 18
    move-result v2
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_12} :catch_cf
    .catch Lax/b3/j; {:try_start_2 .. :try_end_12} :catch_cd
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_12} :catch_cb
    .catchall {:try_start_2 .. :try_end_12} :catchall_c9

    .line 19
    if-nez v2, :cond_16

    .line 20
    .line 21
    monitor-exit p0

    .line 22
    return-void

    .line 23
    :cond_16
    :try_start_16
    new-instance v2, Ljava/io/BufferedReader;

    .line 24
    .line 25
    new-instance v3, Ljava/io/InputStreamReader;

    .line 26
    .line 27
    const-wide/16 v4, 0x0

    .line 28
    .line 29
    invoke-virtual {v1, p2, v4, v5}, Lcom/voxdon/xplorer/file/o;->J(Lcom/voxdon/xplorer/file/n;J)Ljava/io/InputStream;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    invoke-direct {v3, p2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_26
    .catch Ljava/io/IOException; {:try_start_16 .. :try_end_26} :catch_cf
    .catch Lax/b3/j; {:try_start_16 .. :try_end_26} :catch_cd
    .catch Ljava/lang/Exception; {:try_start_16 .. :try_end_26} :catch_cb
    .catchall {:try_start_16 .. :try_end_26} :catchall_c9

    .line 37
    .line 38
    .line 39
    :try_start_26
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    const-string v0, "HIDDENFILELIST"

    .line 47
    .line 48
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result p2
    :try_end_33
    .catch Ljava/io/IOException; {:try_start_26 .. :try_end_33} :catch_b1
    .catch Lax/b3/j; {:try_start_26 .. :try_end_33} :catch_ae
    .catch Ljava/lang/Exception; {:try_start_26 .. :try_end_33} :catch_ab
    .catchall {:try_start_26 .. :try_end_33} :catchall_a8

    .line 52
    if-nez p2, :cond_3e

    .line 53
    .line 54
    :try_start_35
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_38
    .catch Ljava/io/IOException; {:try_start_35 .. :try_end_38} :catch_3c
    .catchall {:try_start_35 .. :try_end_38} :catchall_39

    .line 55
    .line 56
    .line 57
    goto :goto_3c

    .line 58
    :catchall_39
    move-exception p1

    .line 59
    goto/16 :goto_fd

    .line 60
    .line 61
    :catch_3c
    :goto_3c
    monitor-exit p0

    .line 62
    return-void

    .line 63
    :cond_3e
    :goto_3e
    :try_start_3e
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p2
    :try_end_42
    .catch Ljava/io/IOException; {:try_start_3e .. :try_end_42} :catch_b1
    .catch Lax/b3/j; {:try_start_3e .. :try_end_42} :catch_ae
    .catch Ljava/lang/Exception; {:try_start_3e .. :try_end_42} :catch_ab
    .catchall {:try_start_3e .. :try_end_42} :catchall_a8

    .line 67
    if-nez p2, :cond_49

    .line 68
    .line 69
    :try_start_44
    invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
    :try_end_47
    .catch Ljava/io/IOException; {:try_start_44 .. :try_end_47} :catch_f5
    .catchall {:try_start_44 .. :try_end_47} :catchall_39

    .line 70
    .line 71
    .line 72
    goto/16 :goto_f5

    .line 73
    .line 74
    :cond_49
    :try_start_49
    invoke-direct {p0, p2}, Lax/Z2/g;->p(Ljava/lang/String;)[Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p2

    .line 78
    if-eqz p2, :cond_3e

    .line 79
    .line 80
    array-length v0, p2

    .line 81
    const/4 v1, 0x4

    .line 82
    if-ne v0, v1, :cond_3e

    .line 83
    .line 84
    const/4 v0, 0x0

    .line 85
    aget-object v0, p2, v0

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    const/4 v3, 0x1

    .line 92
    if-eq v1, v3, :cond_5e

    .line 93
    .line 94
    goto :goto_3e

    .line 95
    :cond_5e
    aget-object v1, p2, v3

    .line 96
    .line 97
    invoke-static {v1}, Lax/c3/K;->h(Ljava/lang/String;)Lax/c3/K;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    if-nez v1, :cond_67

    .line 102
    .line 103
    goto :goto_3e

    .line 104
    :cond_67
    const/4 v3, 0x2

    .line 105
    aget-object v3, p2, v3

    .line 106
    .line 107
    invoke-static {v3}, Lax/c3/K;->h(Ljava/lang/String;)Lax/c3/K;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    if-eq v3, p1, :cond_71

    .line 112
    .line 113
    goto :goto_3e

    .line 114
    :cond_71
    invoke-virtual {v3}, Lax/c3/K;->e()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    if-nez v3, :cond_78

    .line 119
    .line 120
    goto :goto_3e

    .line 121
    :cond_78
    const/4 v4, 0x3

    .line 122
    aget-object p2, p2, v4

    .line 123
    .line 124
    invoke-static {p2}, Lax/c3/d0;->B(Ljava/lang/String;)Z

    .line 125
    .line 126
    .line 127
    move-result v4

    .line 128
    if-nez v4, :cond_b3

    .line 129
    .line 130
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    const-string v1, "HIDE MANAGER BROKEN PATH"

    .line 139
    .line 140
    invoke-virtual {v0, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    new-instance v1, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 147
    .line 148
    .line 149
    const-string v3, "path:"

    .line 150
    .line 151
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p2

    .line 161
    invoke-virtual {v0, p2}, Lax/Ha/b;->g(Ljava/lang/Object;)Lax/Ha/b;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    invoke-virtual {p2}, Lax/Ha/b;->h()V

    .line 166
    .line 167
    .line 168
    goto :goto_3e

    .line 169
    :catchall_a8
    move-exception p1

    .line 170
    move-object v0, v2

    .line 171
    goto :goto_f7

    .line 172
    :catch_ab
    move-exception p1

    .line 173
    move-object v0, v2

    .line 174
    goto :goto_d1

    .line 175
    :catch_ae
    move-exception p1

    .line 176
    :goto_af
    move-object v0, v2

    .line 177
    goto :goto_ef

    .line 178
    :catch_b1
    move-exception p1

    .line 179
    goto :goto_af

    .line 180
    :cond_b3
    invoke-static {v3, p2}, Lax/c3/d0;->P(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p2

    .line 184
    invoke-static {p2}, Lax/c3/d0;->B(Ljava/lang/String;)Z

    .line 185
    .line 186
    .line 187
    move-result v3

    .line 188
    if-nez v3, :cond_be

    .line 189
    .line 190
    goto :goto_3e

    .line 191
    :cond_be
    invoke-static {v1, p2}, Lax/c3/B;->U(Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object p2

    .line 195
    iget-object v1, p0, Lax/Z2/g;->a:Ljava/util/Map;

    .line 196
    .line 197
    invoke-interface {v1, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_c7
    .catch Ljava/io/IOException; {:try_start_49 .. :try_end_c7} :catch_b1
    .catch Lax/b3/j; {:try_start_49 .. :try_end_c7} :catch_ae
    .catch Ljava/lang/Exception; {:try_start_49 .. :try_end_c7} :catch_ab
    .catchall {:try_start_49 .. :try_end_c7} :catchall_a8

    .line 198
    .line 199
    .line 200
    goto/16 :goto_3e

    .line 201
    .line 202
    :catchall_c9
    move-exception p1

    .line 203
    goto :goto_f7

    .line 204
    :catch_cb
    move-exception p1

    .line 205
    goto :goto_d1

    .line 206
    :catch_cd
    move-exception p1

    .line 207
    goto :goto_ef

    .line 208
    :catch_cf
    move-exception p1

    .line 209
    goto :goto_ef

    .line 210
    :goto_d1
    :try_start_d1
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 211
    .line 212
    .line 213
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    invoke-virtual {p2}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 218
    .line 219
    .line 220
    move-result-object p2

    .line 221
    const-string v1, "HIDE MANAGER LOAD"

    .line 222
    .line 223
    invoke-virtual {p2, v1}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 224
    .line 225
    .line 226
    move-result-object p2

    .line 227
    invoke-virtual {p2, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    invoke-virtual {p1}, Lax/Ha/b;->h()V
    :try_end_e9
    .catchall {:try_start_d1 .. :try_end_e9} :catchall_c9

    .line 232
    .line 233
    .line 234
    if-eqz v0, :cond_f5

    .line 235
    .line 236
    :goto_eb
    :try_start_eb
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_ee
    .catch Ljava/io/IOException; {:try_start_eb .. :try_end_ee} :catch_f5
    .catchall {:try_start_eb .. :try_end_ee} :catchall_39

    .line 237
    .line 238
    .line 239
    goto :goto_f5

    .line 240
    :goto_ef
    :try_start_ef
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
    :try_end_f2
    .catchall {:try_start_ef .. :try_end_f2} :catchall_c9

    .line 241
    .line 242
    .line 243
    if-eqz v0, :cond_f5

    .line 244
    .line 245
    goto :goto_eb

    .line 246
    :catch_f5
    :cond_f5
    :goto_f5
    monitor-exit p0

    .line 247
    return-void

    .line 248
    :goto_f7
    if-eqz v0, :cond_fc

    .line 249
    .line 250
    :try_start_f9
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_fc
    .catch Ljava/io/IOException; {:try_start_f9 .. :try_end_fc} :catch_fc
    .catchall {:try_start_f9 .. :try_end_fc} :catchall_39

    .line 251
    .line 252
    .line 253
    :catch_fc
    :cond_fc
    :try_start_fc
    throw p1

    .line 254
    :goto_fd
    monitor-exit p0
    :try_end_fe
    .catchall {:try_start_fc .. :try_end_fe} :catchall_39

    .line 255
    throw p1
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

.method private declared-synchronized o()V
    .registers 2

    .line 1
    monitor-enter p0

    .line 2
    const/4 v0, 0x1

    .line 3
    :try_start_2
    iput-boolean v0, p0, Lax/Z2/g;->c:Z
    :try_end_4
    .catchall {:try_start_2 .. :try_end_4} :catchall_6

    .line 4
    .line 5
    monitor-exit p0

    .line 6
    return-void

    .line 7
    :catchall_6
    move-exception v0

    .line 8
    :try_start_7
    monitor-exit p0
    :try_end_8
    .catchall {:try_start_7 .. :try_end_8} :catchall_6

    .line 9
    throw v0
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

.method private p(Ljava/lang/String;)[Ljava/lang/String;
    .registers 6

    .line 1
    iget-object v0, p0, Lax/Z2/g;->d:Lax/Z2/g$c;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lax/Z2/g$c;->e(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lax/Z2/g;->d:Lax/Z2/g$c;

    .line 7
    .line 8
    invoke-virtual {p1}, Lax/Z2/g$c;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p1, :cond_43

    .line 14
    .line 15
    iget-object p1, p0, Lax/Z2/g;->d:Lax/Z2/g$c;

    .line 16
    .line 17
    invoke-virtual {p1}, Lax/Z2/g$c;->b()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v1, p0, Lax/Z2/g;->d:Lax/Z2/g$c;

    .line 22
    .line 23
    invoke-virtual {v1}, Lax/Z2/g$c;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_43

    .line 28
    .line 29
    iget-object v1, p0, Lax/Z2/g;->d:Lax/Z2/g$c;

    .line 30
    .line 31
    invoke-virtual {v1}, Lax/Z2/g$c;->b()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iget-object v2, p0, Lax/Z2/g;->d:Lax/Z2/g$c;

    .line 36
    .line 37
    invoke-virtual {v2}, Lax/Z2/g$c;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_43

    .line 42
    .line 43
    iget-object v2, p0, Lax/Z2/g;->d:Lax/Z2/g$c;

    .line 44
    .line 45
    invoke-virtual {v2}, Lax/Z2/g$c;->b()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iget-object v3, p0, Lax/Z2/g;->d:Lax/Z2/g$c;

    .line 50
    .line 51
    invoke-virtual {v3}, Lax/Z2/g$c;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    if-eqz v3, :cond_43

    .line 56
    .line 57
    iget-object v0, p0, Lax/Z2/g;->d:Lax/Z2/g$c;

    .line 58
    .line 59
    invoke-virtual {v0}, Lax/Z2/g$c;->c()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    filled-new-array {p1, v1, v2, v0}, [Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    return-object p1

    .line 68
    :cond_43
    return-object v0
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
.end method


# virtual methods
.method public declared-synchronized e(Lax/c3/K;Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;
    .registers 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/Z2/g;->b:Landroid/content/Context;

    .line 3
    .line 4
    if-eqz v0, :cond_2d

    .line 5
    .line 6
    iget-boolean v0, p0, Lax/Z2/g;->c:Z

    .line 7
    .line 8
    if-nez v0, :cond_a

    .line 9
    .line 10
    goto :goto_2d

    .line 11
    :cond_a
    iget-object v0, p0, Lax/Z2/g;->a:Ljava/util/Map;

    .line 12
    .line 13
    invoke-static {p1, p3}, Lax/c3/B;->U(Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Ljava/lang/String;
    :try_end_16
    .catchall {:try_start_1 .. :try_end_16} :catchall_29

    .line 22
    .line 23
    if-eqz p1, :cond_1a

    .line 24
    .line 25
    monitor-exit p0

    .line 26
    return-object p1

    .line 27
    :cond_1a
    if-eqz p2, :cond_2b

    .line 28
    .line 29
    :try_start_1c
    iget-object p1, p0, Lax/Z2/g;->a:Ljava/util/Map;

    .line 30
    .line 31
    invoke-static {p2, p3}, Lax/c3/B;->U(Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Ljava/lang/String;
    :try_end_28
    .catchall {:try_start_1c .. :try_end_28} :catchall_29

    .line 40
    .line 41
    goto :goto_2b

    .line 42
    :catchall_29
    move-exception p1

    .line 43
    goto :goto_30

    .line 44
    :cond_2b
    :goto_2b
    monitor-exit p0

    .line 45
    return-object p1

    .line 46
    :cond_2d
    :goto_2d
    monitor-exit p0

    .line 47
    const/4 p1, 0x0

    .line 48
    return-object p1

    .line 49
    :goto_30
    :try_start_30
    monitor-exit p0
    :try_end_31
    .catchall {:try_start_30 .. :try_end_31} :catchall_29

    .line 50
    throw p1
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

.method public declared-synchronized f(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;
    .registers 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/Z2/g;->b:Landroid/content/Context;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_34

    .line 6
    .line 7
    iget-boolean v0, p0, Lax/Z2/g;->c:Z

    .line 8
    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    goto :goto_34

    .line 12
    :cond_b
    instance-of v0, p1, Lcom/voxdon/xplorer/file/v;

    .line 13
    .line 14
    if-eqz v0, :cond_26

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    move-object v1, p1

    .line 21
    check-cast v1, Lcom/voxdon/xplorer/file/v;

    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/y;->B0()Lax/c3/K;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p0, v0, v1, p1}, Lax/Z2/g;->e(Lax/c3/K;Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1
    :try_end_22
    .catchall {:try_start_1 .. :try_end_22} :catchall_24

    .line 35
    monitor-exit p0

    .line 36
    return-object p1

    .line 37
    :catchall_24
    move-exception p1

    .line 38
    goto :goto_36

    .line 39
    :cond_26
    :try_start_26
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->R()Lax/c3/K;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-virtual {p0, v0, v1, p1}, Lax/Z2/g;->e(Lax/c3/K;Lax/c3/K;Ljava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1
    :try_end_32
    .catchall {:try_start_26 .. :try_end_32} :catchall_24

    .line 51
    monitor-exit p0

    .line 52
    return-object p1

    .line 53
    :cond_34
    :goto_34
    monitor-exit p0

    .line 54
    return-object v1

    .line 55
    :goto_36
    :try_start_36
    monitor-exit p0
    :try_end_37
    .catchall {:try_start_36 .. :try_end_37} :catchall_24

    .line 56
    throw p1
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
.end method

.method public i(Landroid/content/Context;)V
    .registers 4

    .line 1
    iput-object p1, p0, Lax/Z2/g;->b:Landroid/content/Context;

    .line 2
    .line 3
    new-instance p1, Lax/Z2/g$c;

    .line 4
    .line 5
    const/16 v0, 0x7c

    .line 6
    .line 7
    invoke-direct {p1, v0}, Lax/Z2/g$c;-><init>(C)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lax/Z2/g;->d:Lax/Z2/g$c;

    .line 11
    .line 12
    invoke-virtual {p0}, Lax/Z2/g;->j()V

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    const-string v0, "local.intent.action.LOCAL_STORAGE_STATUS_CHANGED"

    .line 20
    .line 21
    iget-object v1, p0, Lax/Z2/g;->f:Landroid/content/BroadcastReceiver;

    .line 22
    .line 23
    invoke-virtual {p1, v0, v1}, Lax/u3/g;->d(Ljava/lang/String;Landroid/content/BroadcastReceiver;)V

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lax/u3/g;->a()Lax/u3/g;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v0, "local.intent.action.STORAGE_GRANTED"

    .line 31
    .line 32
    iget-object v1, p0, Lax/Z2/g;->e:Landroid/content/BroadcastReceiver;

    .line 33
    .line 34
    invoke-virtual {p1, v0, v1}, Lax/u3/g;->d(Ljava/lang/String;Landroid/content/BroadcastReceiver;)V

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
.end method

.method public declared-synchronized j()V
    .registers 3

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    new-instance v0, Lax/Z2/g$d;

    .line 3
    .line 4
    invoke-direct {v0, p0}, Lax/Z2/g$d;-><init>(Lax/Z2/g;)V

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    new-array v1, v1, [Ljava/lang/Void;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;
    :try_end_c
    .catchall {:try_start_1 .. :try_end_c} :catchall_e

    .line 11
    .line 12
    .line 13
    monitor-exit p0

    .line 14
    return-void

    .line 15
    :catchall_e
    move-exception v0

    .line 16
    :try_start_f
    monitor-exit p0
    :try_end_10
    .catchall {:try_start_f .. :try_end_10} :catchall_e

    .line 17
    throw v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public declared-synchronized m(Ljava/util/Map;)Z
    .registers 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/Z2/g;->b:Landroid/content/Context;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_194

    .line 6
    .line 7
    iget-boolean v0, p0, Lax/Z2/g;->c:Z

    .line 8
    .line 9
    if-nez v0, :cond_c

    .line 10
    .line 11
    goto/16 :goto_194

    .line 12
    .line 13
    :cond_c
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lax/Z2/j;->O()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {}, Lax/Z2/j;->F()Lax/Z2/j;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Lax/Z2/j;->T()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2
    :try_end_1c
    .catchall {:try_start_1 .. :try_end_1c} :catchall_12f

    .line 29
    const/4 v3, 0x0

    .line 30
    if-eqz v0, :cond_32

    .line 31
    .line 32
    :try_start_1f
    sget-object v4, Lax/c3/K;->e:Lax/c3/K;

    .line 33
    .line 34
    invoke-direct {p0, v4, v0}, Lax/Z2/g;->g(Lax/c3/K;Ljava/lang/String;)Ljava/io/BufferedWriter;

    .line 35
    .line 36
    .line 37
    move-result-object v4
    :try_end_25
    .catch Ljava/io/IOException; {:try_start_1f .. :try_end_25} :catch_2e
    .catch Ljava/lang/RuntimeException; {:try_start_1f .. :try_end_25} :catch_2a
    .catchall {:try_start_1f .. :try_end_25} :catchall_26

    .line 38
    goto :goto_33

    .line 39
    :catchall_26
    move-exception p1

    .line 40
    move-object v5, v3

    .line 41
    goto/16 :goto_187

    .line 42
    .line 43
    :catch_2a
    move-exception p1

    .line 44
    move-object v5, v3

    .line 45
    goto/16 :goto_139

    .line 46
    .line 47
    :catch_2e
    move-exception p1

    .line 48
    move-object v5, v3

    .line 49
    goto/16 :goto_161

    .line 50
    .line 51
    :cond_32
    move-object v4, v3

    .line 52
    :goto_33
    if-eqz v2, :cond_4b

    .line 53
    .line 54
    :try_start_35
    sget-object v5, Lax/c3/K;->f:Lax/c3/K;

    .line 55
    .line 56
    invoke-direct {p0, v5, v2}, Lax/Z2/g;->g(Lax/c3/K;Ljava/lang/String;)Ljava/io/BufferedWriter;

    .line 57
    .line 58
    .line 59
    move-result-object v5
    :try_end_3b
    .catch Ljava/io/IOException; {:try_start_35 .. :try_end_3b} :catch_46
    .catch Ljava/lang/RuntimeException; {:try_start_35 .. :try_end_3b} :catch_41
    .catchall {:try_start_35 .. :try_end_3b} :catchall_3c

    .line 60
    goto :goto_4c

    .line 61
    :catchall_3c
    move-exception p1

    .line 62
    move-object v5, v3

    .line 63
    :goto_3e
    move-object v3, v4

    .line 64
    goto/16 :goto_187

    .line 65
    .line 66
    :catch_41
    move-exception p1

    .line 67
    move-object v5, v3

    .line 68
    :goto_43
    move-object v3, v4

    .line 69
    goto/16 :goto_139

    .line 70
    .line 71
    :catch_46
    move-exception p1

    .line 72
    move-object v5, v3

    .line 73
    :goto_48
    move-object v3, v4

    .line 74
    goto/16 :goto_161

    .line 75
    .line 76
    :cond_4b
    move-object v5, v3

    .line 77
    :goto_4c
    if-eqz v4, :cond_5f

    .line 78
    .line 79
    :try_start_4e
    const-string v6, "HIDDENFILELIST\n"

    .line 80
    .line 81
    invoke-virtual {v4, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    const-string v6, "1\n"

    .line 85
    .line 86
    invoke-virtual {v4, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    goto :goto_5f

    .line 90
    :catchall_59
    move-exception p1

    .line 91
    goto :goto_3e

    .line 92
    :catch_5b
    move-exception p1

    .line 93
    goto :goto_43

    .line 94
    :catch_5d
    move-exception p1

    .line 95
    goto :goto_48

    .line 96
    :cond_5f
    :goto_5f
    if-eqz v5, :cond_6b

    .line 97
    .line 98
    const-string v6, "HIDDENFILELIST\n"

    .line 99
    .line 100
    invoke-virtual {v5, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const-string v6, "1\n"

    .line 104
    .line 105
    invoke-virtual {v5, v6}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :cond_6b
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const/4 v6, 0x1

    .line 117
    :goto_74
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    if-eqz v7, :cond_116

    .line 122
    .line 123
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    check-cast v7, Ljava/util/Map$Entry;
    :try_end_80
    .catch Ljava/io/IOException; {:try_start_4e .. :try_end_80} :catch_5d
    .catch Ljava/lang/RuntimeException; {:try_start_4e .. :try_end_80} :catch_5b
    .catchall {:try_start_4e .. :try_end_80} :catchall_59

    .line 128
    .line 129
    :try_start_80
    new-instance v8, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    check-cast v9, Ljava/lang/String;

    .line 139
    .line 140
    invoke-static {v9}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 141
    .line 142
    .line 143
    move-result-object v9

    .line 144
    invoke-static {v9}, Lax/Z2/k;->a(Landroid/net/Uri;)Lax/Z2/k;

    .line 145
    .line 146
    .line 147
    move-result-object v9

    .line 148
    invoke-virtual {v9}, Lax/Z2/k;->e()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    if-nez v10, :cond_9a

    .line 153
    .line 154
    goto :goto_74

    .line 155
    :cond_9a
    if-eqz v0, :cond_ab

    .line 156
    .line 157
    invoke-static {v0, v10}, Lax/c3/d0;->H(Ljava/lang/String;Ljava/lang/String;)Z

    .line 158
    .line 159
    .line 160
    move-result v11

    .line 161
    if-eqz v11, :cond_ab

    .line 162
    .line 163
    invoke-static {v0, v10}, Lax/c3/d0;->x(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v10

    .line 167
    sget-object v11, Lax/c3/K;->e:Lax/c3/K;

    .line 168
    .line 169
    goto :goto_bd

    .line 170
    :catch_a9
    move-exception v7

    .line 171
    goto :goto_111

    .line 172
    :cond_ab
    if-eqz v2, :cond_10c

    .line 173
    .line 174
    invoke-virtual {v10, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 175
    .line 176
    .line 177
    move-result v11

    .line 178
    if-eqz v11, :cond_10c

    .line 179
    .line 180
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 181
    .line 182
    .line 183
    move-result v11

    .line 184
    invoke-virtual {v10, v11}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v10

    .line 188
    sget-object v11, Lax/c3/K;->f:Lax/c3/K;

    .line 189
    .line 190
    :goto_bd
    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    check-cast v7, Ljava/lang/String;

    .line 195
    .line 196
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    const/16 v7, 0x7c

    .line 200
    .line 201
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v9}, Lax/Z2/k;->d()Lax/c3/K;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    invoke-virtual {v9}, Lax/c3/K;->k()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v9

    .line 212
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v11}, Lax/c3/K;->k()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v9

    .line 222
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 226
    .line 227
    .line 228
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    const-string v7, "\n"

    .line 232
    .line 233
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    sget-object v7, Lax/c3/K;->f:Lax/c3/K;

    .line 237
    .line 238
    if-ne v11, v7, :cond_fa

    .line 239
    .line 240
    if-eqz v5, :cond_fa

    .line 241
    .line 242
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    invoke-virtual {v5, v7}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    goto/16 :goto_74

    .line 250
    .line 251
    :cond_fa
    sget-object v7, Lax/c3/K;->e:Lax/c3/K;

    .line 252
    .line 253
    if-ne v11, v7, :cond_109

    .line 254
    .line 255
    if-eqz v4, :cond_109

    .line 256
    .line 257
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    invoke-virtual {v4, v7}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    goto/16 :goto_74

    .line 265
    .line 266
    :cond_109
    const/4 v6, 0x0

    .line 267
    goto/16 :goto_74

    .line 268
    .line 269
    :cond_10c
    invoke-static {}, Lax/u3/b;->f()V
    :try_end_10f
    .catch Ljava/lang/IllegalArgumentException; {:try_start_80 .. :try_end_10f} :catch_a9
    .catch Ljava/io/IOException; {:try_start_80 .. :try_end_10f} :catch_5d
    .catch Ljava/lang/RuntimeException; {:try_start_80 .. :try_end_10f} :catch_5b
    .catchall {:try_start_80 .. :try_end_10f} :catchall_59

    .line 270
    .line 271
    .line 272
    goto/16 :goto_74

    .line 273
    .line 274
    :goto_111
    :try_start_111
    invoke-virtual {v7}, Ljava/lang/Throwable;->printStackTrace()V

    .line 275
    .line 276
    .line 277
    goto/16 :goto_74

    .line 278
    .line 279
    :cond_116
    if-eqz v4, :cond_11f

    .line 280
    .line 281
    invoke-virtual {v4}, Ljava/io/BufferedWriter;->flush()V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v4}, Ljava/io/BufferedWriter;->close()V

    .line 285
    .line 286
    .line 287
    move-object v4, v3

    .line 288
    :cond_11f
    if-eqz v5, :cond_128

    .line 289
    .line 290
    invoke-virtual {v5}, Ljava/io/BufferedWriter;->flush()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v5}, Ljava/io/BufferedWriter;->close()V
    :try_end_127
    .catch Ljava/io/IOException; {:try_start_111 .. :try_end_127} :catch_5d
    .catch Ljava/lang/RuntimeException; {:try_start_111 .. :try_end_127} :catch_5b
    .catchall {:try_start_111 .. :try_end_127} :catchall_59

    .line 294
    .line 295
    .line 296
    goto :goto_129

    .line 297
    :cond_128
    move-object v3, v5

    .line 298
    :goto_129
    if-eqz v4, :cond_132

    .line 299
    .line 300
    :try_start_12b
    invoke-virtual {v4}, Ljava/io/BufferedWriter;->close()V
    :try_end_12e
    .catch Ljava/io/IOException; {:try_start_12b .. :try_end_12e} :catch_131
    .catchall {:try_start_12b .. :try_end_12e} :catchall_12f

    .line 301
    .line 302
    .line 303
    goto :goto_132

    .line 304
    :catchall_12f
    move-exception p1

    .line 305
    goto :goto_196

    .line 306
    :catch_131
    nop

    .line 307
    :cond_132
    :goto_132
    if-eqz v3, :cond_137

    .line 308
    .line 309
    :try_start_134
    invoke-virtual {v3}, Ljava/io/BufferedWriter;->close()V
    :try_end_137
    .catch Ljava/io/IOException; {:try_start_134 .. :try_end_137} :catch_137
    .catchall {:try_start_134 .. :try_end_137} :catchall_12f

    .line 310
    .line 311
    .line 312
    :catch_137
    :cond_137
    monitor-exit p0

    .line 313
    return v6

    .line 314
    :goto_139
    :try_start_139
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 315
    .line 316
    .line 317
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    const-string v2, "HIDEMANAGER SAVE 2"

    .line 326
    .line 327
    invoke-virtual {v0, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    invoke-virtual {v0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 332
    .line 333
    .line 334
    move-result-object p1

    .line 335
    invoke-virtual {p1}, Lax/Ha/b;->h()V
    :try_end_151
    .catchall {:try_start_139 .. :try_end_151} :catchall_15f

    .line 336
    .line 337
    .line 338
    if-eqz v3, :cond_158

    .line 339
    .line 340
    :try_start_153
    invoke-virtual {v3}, Ljava/io/BufferedWriter;->close()V
    :try_end_156
    .catch Ljava/io/IOException; {:try_start_153 .. :try_end_156} :catch_157
    .catchall {:try_start_153 .. :try_end_156} :catchall_12f

    .line 341
    .line 342
    .line 343
    goto :goto_158

    .line 344
    :catch_157
    nop

    .line 345
    :cond_158
    :goto_158
    if-eqz v5, :cond_15d

    .line 346
    .line 347
    :try_start_15a
    invoke-virtual {v5}, Ljava/io/BufferedWriter;->close()V
    :try_end_15d
    .catch Ljava/io/IOException; {:try_start_15a .. :try_end_15d} :catch_15d
    .catchall {:try_start_15a .. :try_end_15d} :catchall_12f

    .line 348
    .line 349
    .line 350
    :catch_15d
    :cond_15d
    monitor-exit p0

    .line 351
    return v1

    .line 352
    :catchall_15f
    move-exception p1

    .line 353
    goto :goto_187

    .line 354
    :goto_161
    :try_start_161
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 355
    .line 356
    .line 357
    invoke-static {}, Lax/Ha/c;->h()Lax/Ha/b;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    invoke-virtual {v0}, Lax/Ha/b;->f()Lax/Ha/b;

    .line 362
    .line 363
    .line 364
    move-result-object v0

    .line 365
    const-string v2, "HIDEMANAGER SAVE 1"

    .line 366
    .line 367
    invoke-virtual {v0, v2}, Lax/Ha/b;->b(Ljava/lang/String;)Lax/Ha/b;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-virtual {v0, p1}, Lax/Ha/b;->l(Ljava/lang/Throwable;)Lax/Ha/b;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    invoke-virtual {p1}, Lax/Ha/b;->h()V
    :try_end_179
    .catchall {:try_start_161 .. :try_end_179} :catchall_15f

    .line 376
    .line 377
    .line 378
    if-eqz v3, :cond_180

    .line 379
    .line 380
    :try_start_17b
    invoke-virtual {v3}, Ljava/io/BufferedWriter;->close()V
    :try_end_17e
    .catch Ljava/io/IOException; {:try_start_17b .. :try_end_17e} :catch_17f
    .catchall {:try_start_17b .. :try_end_17e} :catchall_12f

    .line 381
    .line 382
    .line 383
    goto :goto_180

    .line 384
    :catch_17f
    nop

    .line 385
    :cond_180
    :goto_180
    if-eqz v5, :cond_185

    .line 386
    .line 387
    :try_start_182
    invoke-virtual {v5}, Ljava/io/BufferedWriter;->close()V
    :try_end_185
    .catch Ljava/io/IOException; {:try_start_182 .. :try_end_185} :catch_185
    .catchall {:try_start_182 .. :try_end_185} :catchall_12f

    .line 388
    .line 389
    .line 390
    :catch_185
    :cond_185
    monitor-exit p0

    .line 391
    return v1

    .line 392
    :goto_187
    if-eqz v3, :cond_18e

    .line 393
    .line 394
    :try_start_189
    invoke-virtual {v3}, Ljava/io/BufferedWriter;->close()V
    :try_end_18c
    .catch Ljava/io/IOException; {:try_start_189 .. :try_end_18c} :catch_18d
    .catchall {:try_start_189 .. :try_end_18c} :catchall_12f

    .line 395
    .line 396
    .line 397
    goto :goto_18e

    .line 398
    :catch_18d
    nop

    .line 399
    :cond_18e
    :goto_18e
    if-eqz v5, :cond_193

    .line 400
    .line 401
    :try_start_190
    invoke-virtual {v5}, Ljava/io/BufferedWriter;->close()V
    :try_end_193
    .catch Ljava/io/IOException; {:try_start_190 .. :try_end_193} :catch_193
    .catchall {:try_start_190 .. :try_end_193} :catchall_12f

    .line 402
    .line 403
    .line 404
    :catch_193
    :cond_193
    :try_start_193
    throw p1
    :try_end_194
    .catchall {:try_start_193 .. :try_end_194} :catchall_12f

    .line 405
    :cond_194
    :goto_194
    monitor-exit p0

    .line 406
    return v1

    .line 407
    :goto_196
    :try_start_196
    monitor-exit p0
    :try_end_197
    .catchall {:try_start_196 .. :try_end_197} :catchall_12f

    .line 408
    throw p1
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
.end method

.method public declared-synchronized n(Lcom/voxdon/xplorer/file/n;Z)Z
    .registers 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/Z2/g;->b:Landroid/content/Context;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_64

    .line 6
    .line 7
    iget-boolean v0, p0, Lax/Z2/g;->c:Z

    .line 8
    .line 9
    if-nez v0, :cond_b

    .line 10
    .line 11
    goto :goto_64

    .line 12
    :cond_b
    new-instance v0, Ljava/util/HashMap;

    .line 13
    .line 14
    iget-object v2, p0, Lax/Z2/g;->a:Ljava/util/Map;

    .line 15
    .line 16
    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 17
    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    if-eqz p2, :cond_35

    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-static {p2}, Lax/Q2/f;->g0(Lax/Q2/f;)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_2b

    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->Q()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string p2, "L"

    .line 37
    .line 38
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    goto :goto_58

    .line 42
    :catchall_29
    move-exception p1

    .line 43
    goto :goto_66

    .line 44
    :cond_2b
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->Q()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    const-string p2, "S"

    .line 49
    .line 50
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    goto :goto_58

    .line 54
    :cond_35
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->Q()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-interface {v0, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    if-eqz p2, :cond_41

    .line 63
    .line 64
    const/4 p2, 0x1

    .line 65
    goto :goto_42

    .line 66
    :cond_41
    const/4 p2, 0x0

    .line 67
    :goto_42
    instance-of v3, p1, Lcom/voxdon/xplorer/file/v;

    .line 68
    .line 69
    if-eqz v3, :cond_57

    .line 70
    .line 71
    check-cast p1, Lcom/voxdon/xplorer/file/v;

    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/v;->A1()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    if-nez p2, :cond_54

    .line 82
    .line 83
    if-eqz p1, :cond_55

    .line 84
    .line 85
    :cond_54
    const/4 v1, 0x1

    .line 86
    :cond_55
    move v2, v1

    .line 87
    goto :goto_58

    .line 88
    :cond_57
    move v2, p2

    .line 89
    :goto_58
    if-eqz v2, :cond_62

    .line 90
    .line 91
    invoke-virtual {p0, v0}, Lax/Z2/g;->m(Ljava/util/Map;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_62

    .line 96
    .line 97
    iput-object v0, p0, Lax/Z2/g;->a:Ljava/util/Map;
    :try_end_62
    .catchall {:try_start_1 .. :try_end_62} :catchall_29

    .line 98
    .line 99
    :cond_62
    monitor-exit p0

    .line 100
    return v2

    .line 101
    :cond_64
    :goto_64
    monitor-exit p0

    .line 102
    return v1

    .line 103
    :goto_66
    :try_start_66
    monitor-exit p0
    :try_end_67
    .catchall {:try_start_66 .. :try_end_67} :catchall_29

    .line 104
    throw p1
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
