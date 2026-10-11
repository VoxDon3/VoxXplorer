.class public abstract Lax/c5/a;
.super Lax/K0/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lax/c5/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        ">",
        "Lax/K0/c<",
        "TD;>;"
    }
.end annotation


# instance fields
.field private final i:Ljava/util/concurrent/Executor;

.field volatile j:Lax/c5/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/c5/a<",
            "TD;>.a;"
        }
    .end annotation
.end field

.field volatile k:Lax/c5/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lax/c5/a<",
            "TD;>.a;"
        }
    .end annotation
.end field

.field l:J

.field m:J

.field n:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/concurrent/Executor;)V
    .registers 5

    .line 1
    invoke-direct {p0, p1}, Lax/K0/c;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, -0x2710

    .line 5
    .line 6
    iput-wide v0, p0, Lax/c5/a;->m:J

    .line 7
    .line 8
    if-eqz p2, :cond_c

    .line 9
    .line 10
    iput-object p2, p0, Lax/c5/a;->i:Ljava/util/concurrent/Executor;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_c
    sget-object p1, Lax/c5/b;->i0:Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    iput-object p1, p0, Lax/c5/a;->i:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    return-void
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
.method public C()V
    .registers 1

    .line 1
    return-void
    .line 2
    .line 3
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

.method D(Lax/c5/a$a;Ljava/lang/Object;)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/c5/a<",
            "TD;>.a;TD;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p2}, Lax/c5/a;->I(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lax/c5/a;->k:Lax/c5/a$a;

    .line 5
    .line 6
    if-ne p2, p1, :cond_19

    .line 7
    .line 8
    invoke-virtual {p0}, Lax/K0/c;->x()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide p1

    .line 15
    iput-wide p1, p0, Lax/c5/a;->m:J

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-object p1, p0, Lax/c5/a;->k:Lax/c5/a$a;

    .line 19
    .line 20
    invoke-virtual {p0}, Lax/K0/c;->g()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lax/c5/a;->F()V

    .line 24
    .line 25
    .line 26
    :cond_19
    return-void
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

.method E(Lax/c5/a$a;Ljava/lang/Object;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lax/c5/a<",
            "TD;>.a;TD;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 2
    .line 3
    if-eq v0, p1, :cond_8

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lax/c5/a;->D(Lax/c5/a$a;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    invoke-virtual {p0}, Lax/K0/c;->l()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_12

    .line 14
    .line 15
    invoke-virtual {p0, p2}, Lax/c5/a;->I(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_12
    invoke-virtual {p0}, Lax/K0/c;->e()V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    iput-wide v0, p0, Lax/c5/a;->m:J

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    iput-object p1, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 30
    .line 31
    invoke-virtual {p0, p2}, Lax/K0/c;->h(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
.end method

.method F()V
    .registers 7

    .line 1
    iget-object v0, p0, Lax/c5/a;->k:Lax/c5/a$a;

    .line 2
    .line 3
    if-nez v0, :cond_49

    .line 4
    .line 5
    iget-object v0, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 6
    .line 7
    if-eqz v0, :cond_49

    .line 8
    .line 9
    iget-object v0, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 10
    .line 11
    iget-boolean v0, v0, Lax/c5/a$a;->m0:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1a

    .line 14
    .line 15
    iget-object v0, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput-boolean v1, v0, Lax/c5/a$a;->m0:Z

    .line 19
    .line 20
    iget-object v0, p0, Lax/c5/a;->n:Landroid/os/Handler;

    .line 21
    .line 22
    iget-object v1, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 25
    .line 26
    .line 27
    :cond_1a
    iget-wide v0, p0, Lax/c5/a;->l:J

    .line 28
    .line 29
    const-wide/16 v2, 0x0

    .line 30
    .line 31
    cmp-long v4, v0, v2

    .line 32
    .line 33
    if-lez v4, :cond_41

    .line 34
    .line 35
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    iget-wide v2, p0, Lax/c5/a;->m:J

    .line 40
    .line 41
    iget-wide v4, p0, Lax/c5/a;->l:J

    .line 42
    .line 43
    add-long/2addr v2, v4

    .line 44
    cmp-long v4, v0, v2

    .line 45
    .line 46
    if-gez v4, :cond_41

    .line 47
    .line 48
    iget-object v0, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 49
    .line 50
    const/4 v1, 0x1

    .line 51
    iput-boolean v1, v0, Lax/c5/a$a;->m0:Z

    .line 52
    .line 53
    iget-object v0, p0, Lax/c5/a;->n:Landroid/os/Handler;

    .line 54
    .line 55
    iget-object v1, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 56
    .line 57
    iget-wide v2, p0, Lax/c5/a;->m:J

    .line 58
    .line 59
    iget-wide v4, p0, Lax/c5/a;->l:J

    .line 60
    .line 61
    add-long/2addr v2, v4

    .line 62
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;J)Z

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_41
    iget-object v0, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 67
    .line 68
    iget-object v1, p0, Lax/c5/a;->i:Ljava/util/concurrent/Executor;

    .line 69
    .line 70
    const/4 v2, 0x0

    .line 71
    invoke-virtual {v0, v1, v2}, Lax/c5/b;->g(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lax/c5/b;

    .line 72
    .line 73
    .line 74
    :cond_49
    return-void
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
.end method

.method public G()Z
    .registers 2

    .line 1
    iget-object v0, p0, Lax/c5/a;->k:Lax/c5/a$a;

    .line 2
    .line 3
    if-eqz v0, :cond_6

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_6
    const/4 v0, 0x0

    .line 8
    return v0
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

.method public abstract H()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TD;"
        }
    .end annotation
.end method

.method public I(Ljava/lang/Object;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)V"
        }
    .end annotation

    .line 1
    return-void
    .line 2
    .line 3
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
    .line 22
.end method

.method protected J()Ljava/lang/Object;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TD;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lax/c5/a;->H()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public i(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .registers 9

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lax/K0/c;->i(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object p2, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 5
    .line 6
    const-string p4, " waiting="

    .line 7
    .line 8
    if-eqz p2, :cond_20

    .line 9
    .line 10
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string p2, "mTask="

    .line 14
    .line 15
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 19
    .line 20
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object p2, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 27
    .line 28
    iget-boolean p2, p2, Lax/c5/a$a;->m0:Z

    .line 29
    .line 30
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    .line 31
    .line 32
    .line 33
    :cond_20
    iget-object p2, p0, Lax/c5/a;->k:Lax/c5/a$a;

    .line 34
    .line 35
    if-eqz p2, :cond_3b

    .line 36
    .line 37
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string p2, "mCancellingTask="

    .line 41
    .line 42
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    iget-object p2, p0, Lax/c5/a;->k:Lax/c5/a$a;

    .line 46
    .line 47
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p3, p4}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, Lax/c5/a;->k:Lax/c5/a$a;

    .line 54
    .line 55
    iget-boolean p2, p2, Lax/c5/a$a;->m0:Z

    .line 56
    .line 57
    invoke-virtual {p3, p2}, Ljava/io/PrintWriter;->println(Z)V

    .line 58
    .line 59
    .line 60
    :cond_3b
    iget-wide v0, p0, Lax/c5/a;->l:J

    .line 61
    .line 62
    const-wide/16 v2, 0x0

    .line 63
    .line 64
    cmp-long p2, v0, v2

    .line 65
    .line 66
    if-eqz p2, :cond_61

    .line 67
    .line 68
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string p1, "mUpdateThrottle="

    .line 72
    .line 73
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iget-wide p1, p0, Lax/c5/a;->l:J

    .line 77
    .line 78
    invoke-static {p1, p2, p3}, Lax/b0/i;->c(JLjava/io/PrintWriter;)V

    .line 79
    .line 80
    .line 81
    const-string p1, " mLastLoadCompleteTime="

    .line 82
    .line 83
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    iget-wide p1, p0, Lax/c5/a;->m:J

    .line 87
    .line 88
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 89
    .line 90
    .line 91
    move-result-wide v0

    .line 92
    invoke-static {p1, p2, v0, v1, p3}, Lax/b0/i;->b(JJLjava/io/PrintWriter;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p3}, Ljava/io/PrintWriter;->println()V

    .line 96
    .line 97
    .line 98
    :cond_61
    return-void
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

.method protected p()Z
    .registers 5

    .line 1
    iget-object v0, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_44

    .line 5
    .line 6
    iget-object v0, p0, Lax/c5/a;->k:Lax/c5/a$a;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-eqz v0, :cond_1e

    .line 10
    .line 11
    iget-object v0, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 12
    .line 13
    iget-boolean v0, v0, Lax/c5/a$a;->m0:Z

    .line 14
    .line 15
    if-eqz v0, :cond_1b

    .line 16
    .line 17
    iget-object v0, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 18
    .line 19
    iput-boolean v1, v0, Lax/c5/a$a;->m0:Z

    .line 20
    .line 21
    iget-object v0, p0, Lax/c5/a;->n:Landroid/os/Handler;

    .line 22
    .line 23
    iget-object v3, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 24
    .line 25
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    :cond_1b
    iput-object v2, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 29
    .line 30
    return v1

    .line 31
    :cond_1e
    iget-object v0, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 32
    .line 33
    iget-boolean v0, v0, Lax/c5/a$a;->m0:Z

    .line 34
    .line 35
    if-eqz v0, :cond_32

    .line 36
    .line 37
    iget-object v0, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 38
    .line 39
    iput-boolean v1, v0, Lax/c5/a$a;->m0:Z

    .line 40
    .line 41
    iget-object v0, p0, Lax/c5/a;->n:Landroid/os/Handler;

    .line 42
    .line 43
    iget-object v3, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 44
    .line 45
    invoke-virtual {v0, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 46
    .line 47
    .line 48
    iput-object v2, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 49
    .line 50
    return v1

    .line 51
    :cond_32
    iget-object v0, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lax/c5/b;->e(Z)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-eqz v0, :cond_41

    .line 58
    .line 59
    iget-object v1, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 60
    .line 61
    iput-object v1, p0, Lax/c5/a;->k:Lax/c5/a$a;

    .line 62
    .line 63
    invoke-virtual {p0}, Lax/c5/a;->C()V

    .line 64
    .line 65
    .line 66
    :cond_41
    iput-object v2, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 67
    .line 68
    return v0

    .line 69
    :cond_44
    return v1
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
.end method

.method protected r()V
    .registers 2

    .line 1
    invoke-super {p0}, Lax/K0/c;->r()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lax/K0/c;->d()Z

    .line 5
    .line 6
    .line 7
    new-instance v0, Lax/c5/a$a;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lax/c5/a$a;-><init>(Lax/c5/a;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lax/c5/a;->j:Lax/c5/a$a;

    .line 13
    .line 14
    invoke-virtual {p0}, Lax/c5/a;->F()V

    .line 15
    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method
