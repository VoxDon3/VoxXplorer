.class Lcom/voxdon/xplorer/file/I$a;
.super Lax/la/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/file/I;->x0(Lcom/voxdon/xplorer/file/n;Lax/c3/G;Ljava/lang/String;JLjava/lang/Long;ZLax/u3/c;Lax/g3/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lax/u3/c;

.field final synthetic c:Lax/c3/G;

.field final synthetic d:J

.field final synthetic e:Lcom/voxdon/xplorer/file/I;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/file/I;Lax/u3/c;Lax/c3/G;J)V
    .registers 6

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/I$a;->e:Lcom/voxdon/xplorer/file/I;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/file/I$a;->b:Lax/u3/c;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/voxdon/xplorer/file/I$a;->c:Lax/c3/G;

    .line 6
    .line 7
    iput-wide p4, p0, Lcom/voxdon/xplorer/file/I$a;->d:J

    .line 8
    .line 9
    invoke-direct {p0}, Lax/la/m;-><init>()V

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


# virtual methods
.method public a()J
    .registers 3

    .line 1
    iget-wide v0, p0, Lcom/voxdon/xplorer/file/I$a;->d:J

    .line 2
    .line 3
    return-wide v0
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

.method public b(Lax/xc/f;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/voxdon/xplorer/file/I$a;->b:Lax/u3/c;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/file/I;->l0(Lax/u3/c;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/voxdon/xplorer/file/I$a;->c:Lax/c3/G;

    .line 7
    .line 8
    invoke-virtual {v0}, Lax/c3/G;->b()Ljava/io/InputStream;

    .line 9
    .line 10
    .line 11
    move-result-object v0
    :try_end_b
    .catch Lax/b3/j; {:try_start_0 .. :try_end_b} :catch_23

    .line 12
    const/16 v1, 0x2000

    .line 13
    .line 14
    :try_start_d
    new-array v1, v1, [B

    .line 15
    .line 16
    :goto_f
    iget-object v2, p0, Lcom/voxdon/xplorer/file/I$a;->b:Lax/u3/c;

    .line 17
    .line 18
    invoke-static {v2}, Lcom/voxdon/xplorer/file/I;->l0(Lax/u3/c;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I

    .line 22
    .line 23
    .line 24
    move-result v2
    :try_end_18
    .catchall {:try_start_d .. :try_end_18} :catchall_2d

    .line 25
    if-gez v2, :cond_25

    .line 26
    .line 27
    :try_start_1a
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/voxdon/xplorer/file/I$a;->b:Lax/u3/c;

    .line 31
    .line 32
    invoke-static {p1}, Lcom/voxdon/xplorer/file/I;->l0(Lax/u3/c;)V
    :try_end_22
    .catch Lax/b3/j; {:try_start_1a .. :try_end_22} :catch_23

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catch_23
    move-exception p1

    .line 37
    goto :goto_39

    .line 38
    :cond_25
    if-nez v2, :cond_28

    .line 39
    .line 40
    goto :goto_f

    .line 41
    :cond_28
    const/4 v3, 0x0

    .line 42
    :try_start_29
    invoke-interface {p1, v1, v3, v2}, Lax/xc/f;->write([BII)Lax/xc/f;
    :try_end_2c
    .catchall {:try_start_29 .. :try_end_2c} :catchall_2d

    .line 43
    .line 44
    .line 45
    goto :goto_f

    .line 46
    :catchall_2d
    move-exception p1

    .line 47
    if-eqz v0, :cond_38

    .line 48
    .line 49
    :try_start_30
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_33
    .catchall {:try_start_30 .. :try_end_33} :catchall_34

    .line 50
    .line 51
    .line 52
    goto :goto_38

    .line 53
    :catchall_34
    move-exception v0

    .line 54
    :try_start_35
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    :cond_38
    :goto_38
    throw p1
    :try_end_39
    .catch Lax/b3/j; {:try_start_35 .. :try_end_39} :catch_23

    .line 58
    :goto_39
    new-instance v0, Ljava/io/IOException;

    .line 59
    .line 60
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    throw v0
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
.end method
