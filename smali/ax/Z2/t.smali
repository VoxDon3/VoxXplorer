.class public Lax/Z2/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/Z2/t$b;
    }
.end annotation


# static fields
.field private static final f:Ljava/util/logging/Logger;

.field private static g:Lax/Z2/t;


# instance fields
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lax/Z2/t$b;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lax/Z2/t$b;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lax/Z2/t$b;",
            ">;"
        }
    .end annotation
.end field

.field private d:J

.field private e:Lcom/voxdon/xplorer/file/o;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1
    const-string v0, "FileManager.TempFileManager"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lax/Z2/t;->f:Ljava/util/logging/Logger;

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

.method constructor <init>()V
    .registers 2

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
    iput-object v0, p0, Lax/Z2/t;->a:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lax/Z2/t;->b:Ljava/util/HashMap;

    .line 17
    .line 18
    new-instance v0, Lax/Z2/t$a;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lax/Z2/t$a;-><init>(Lax/Z2/t;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lax/Z2/t;->c:Ljava/util/Comparator;

    .line 24
    .line 25
    sget-object v0, Lax/c3/K;->e:Lax/c3/K;

    .line 26
    .line 27
    invoke-static {v0}, Lax/c3/x;->e(Lax/c3/K;)Lcom/voxdon/xplorer/file/o;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lax/Z2/t;->e:Lcom/voxdon/xplorer/file/o;

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
.end method

.method public static b()Lax/Z2/t;
    .registers 1

    .line 1
    sget-object v0, Lax/Z2/t;->g:Lax/Z2/t;

    .line 2
    .line 3
    if-nez v0, :cond_b

    .line 4
    .line 5
    new-instance v0, Lax/Z2/t;

    .line 6
    .line 7
    invoke-direct {v0}, Lax/Z2/t;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lax/Z2/t;->g:Lax/Z2/t;

    .line 11
    .line 12
    :cond_b
    sget-object v0, Lax/Z2/t;->g:Lax/Z2/t;

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

.method private d(Ljava/lang/String;)V
    .registers 6

    .line 1
    iget-object v0, p0, Lax/Z2/t;->a:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_28

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lax/Z2/t$b;

    .line 18
    .line 19
    iget-object v2, v1, Lax/Z2/t$b;->c:Lcom/voxdon/xplorer/file/n;

    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_6

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 32
    .line 33
    .line 34
    iget-wide v2, p0, Lax/Z2/t;->d:J

    .line 35
    .line 36
    iget-wide v0, v1, Lax/Z2/t$b;->b:J

    .line 37
    .line 38
    sub-long/2addr v2, v0

    .line 39
    iput-wide v2, p0, Lax/Z2/t;->d:J

    .line 40
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


# virtual methods
.method public declared-synchronized a()V
    .registers 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-wide v0, p0, Lax/Z2/t;->d:J
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_48

    .line 3
    .line 4
    const-wide/32 v2, 0x11e1a300

    .line 5
    .line 6
    .line 7
    cmp-long v4, v0, v2

    .line 8
    .line 9
    if-gez v4, :cond_c

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :cond_c
    :try_start_c
    iget-object v0, p0, Lax/Z2/t;->a:Ljava/util/ArrayList;

    .line 14
    .line 15
    iget-object v1, p0, Lax/Z2/t;->c:Ljava/util/Comparator;

    .line 16
    .line 17
    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lax/Z2/t;->a:Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_54

    .line 31
    .line 32
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Lax/Z2/t$b;

    .line 37
    .line 38
    invoke-virtual {v1}, Lax/Z2/t$b;->a()Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_54

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 45
    .line 46
    .line 47
    iget-object v4, p0, Lax/Z2/t;->b:Ljava/util/HashMap;

    .line 48
    .line 49
    iget-object v5, v1, Lax/Z2/t$b;->c:Lcom/voxdon/xplorer/file/n;

    .line 50
    .line 51
    invoke-virtual {v5}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    iget-wide v4, p0, Lax/Z2/t;->d:J

    .line 59
    .line 60
    iget-wide v6, v1, Lax/Z2/t$b;->b:J

    .line 61
    .line 62
    sub-long/2addr v4, v6

    .line 63
    iput-wide v4, p0, Lax/Z2/t;->d:J
    :try_end_40
    .catchall {:try_start_c .. :try_end_40} :catchall_48

    .line 64
    .line 65
    :try_start_40
    iget-object v4, p0, Lax/Z2/t;->e:Lcom/voxdon/xplorer/file/o;

    .line 66
    .line 67
    iget-object v1, v1, Lax/Z2/t$b;->c:Lcom/voxdon/xplorer/file/n;

    .line 68
    .line 69
    invoke-virtual {v4, v1}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V
    :try_end_47
    .catch Lax/b3/j; {:try_start_40 .. :try_end_47} :catch_4a
    .catchall {:try_start_40 .. :try_end_47} :catchall_48

    .line 70
    .line 71
    .line 72
    goto :goto_4e

    .line 73
    :catchall_48
    move-exception v0

    .line 74
    goto :goto_56

    .line 75
    :catch_4a
    move-exception v1

    .line 76
    :try_start_4b
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 77
    .line 78
    .line 79
    :goto_4e
    iget-wide v4, p0, Lax/Z2/t;->d:J
    :try_end_50
    .catchall {:try_start_4b .. :try_end_50} :catchall_48

    .line 80
    .line 81
    cmp-long v1, v4, v2

    .line 82
    .line 83
    if-gez v1, :cond_19

    .line 84
    .line 85
    :cond_54
    monitor-exit p0

    .line 86
    return-void

    .line 87
    :goto_56
    :try_start_56
    monitor-exit p0
    :try_end_57
    .catchall {:try_start_56 .. :try_end_57} :catchall_48

    .line 88
    throw v0
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
.end method

.method public declared-synchronized c(Ljava/io/File;)V
    .registers 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    iget-object v0, p0, Lax/Z2/t;->e:Lcom/voxdon/xplorer/file/o;

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {v0, p1}, Lcom/voxdon/xplorer/file/o;->z(Ljava/lang/String;)Lcom/voxdon/xplorer/file/n;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Lax/c3/b;->n()Z

    .line 13
    .line 14
    .line 15
    move-result v0
    :try_end_f
    .catch Lax/b3/j; {:try_start_1 .. :try_end_f} :catch_46
    .catchall {:try_start_1 .. :try_end_f} :catchall_2c

    .line 16
    if-nez v0, :cond_13

    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return-void

    .line 20
    :cond_13
    :try_start_13
    new-instance v0, Lax/Z2/t$b;

    .line 21
    .line 22
    invoke-direct {v0, p1}, Lax/Z2/t$b;-><init>(Lcom/voxdon/xplorer/file/n;)V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lax/Z2/t;->b:Ljava/util/HashMap;

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_2e

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-direct {p0, v1}, Lax/Z2/t;->d(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    goto :goto_2e

    .line 45
    :catchall_2c
    move-exception p1

    .line 46
    goto :goto_44

    .line 47
    :cond_2e
    :goto_2e
    iget-object v1, p0, Lax/Z2/t;->a:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lax/Z2/t;->b:Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->E()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    iget-wide v1, p0, Lax/Z2/t;->d:J

    .line 62
    .line 63
    iget-wide v3, v0, Lax/Z2/t$b;->b:J

    .line 64
    .line 65
    add-long/2addr v1, v3

    .line 66
    iput-wide v1, p0, Lax/Z2/t;->d:J
    :try_end_43
    .catch Lax/b3/j; {:try_start_13 .. :try_end_43} :catch_46
    .catchall {:try_start_13 .. :try_end_43} :catchall_2c

    .line 67
    .line 68
    goto :goto_46

    .line 69
    :goto_44
    :try_start_44
    monitor-exit p0
    :try_end_45
    .catchall {:try_start_44 .. :try_end_45} :catchall_2c

    .line 70
    throw p1

    .line 71
    :catch_46
    :goto_46
    monitor-exit p0

    .line 72
    return-void
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

.method public declared-synchronized e(Ljava/io/File;)V
    .registers 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_1
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 3
    .line 4
    .line 5
    move-result-wide v0

    .line 6
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    cmp-long v4, v0, v2

    .line 11
    .line 12
    if-gez v4, :cond_2b

    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    invoke-virtual {p1, v0, v1}, Ljava/io/File;->setLastModified(J)Z

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lax/Z2/t;->b:Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Lax/Z2/t$b;

    .line 32
    .line 33
    if-eqz v0, :cond_28

    .line 34
    .line 35
    invoke-virtual {v0}, Lax/Z2/t$b;->b()V

    .line 36
    .line 37
    .line 38
    goto :goto_2b

    .line 39
    :catchall_26
    move-exception p1

    .line 40
    goto :goto_2d

    .line 41
    :cond_28
    invoke-virtual {p0, p1}, Lax/Z2/t;->c(Ljava/io/File;)V
    :try_end_2b
    .catchall {:try_start_1 .. :try_end_2b} :catchall_26

    .line 42
    .line 43
    .line 44
    :cond_2b
    :goto_2b
    monitor-exit p0

    .line 45
    return-void

    .line 46
    :goto_2d
    :try_start_2d
    monitor-exit p0
    :try_end_2e
    .catchall {:try_start_2d .. :try_end_2e} :catchall_26

    .line 47
    throw p1
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
