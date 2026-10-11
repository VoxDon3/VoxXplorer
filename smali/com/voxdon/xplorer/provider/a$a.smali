.class Lcom/voxdon/xplorer/provider/a$a;
.super Landroid/os/ProxyFileDescriptorCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/provider/a;->b(Lax/Z2/k;I)Landroid/os/ParcelFileDescriptor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private a:Lax/l3/a;

.field private b:Z

.field final synthetic c:Lcom/voxdon/xplorer/file/o;

.field final synthetic d:Lax/Z2/k;

.field final synthetic e:I

.field final synthetic f:Lcom/voxdon/xplorer/provider/a;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/provider/a;Lcom/voxdon/xplorer/file/o;Lax/Z2/k;I)V
    .registers 5

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/provider/a$a;->f:Lcom/voxdon/xplorer/provider/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/voxdon/xplorer/provider/a$a;->c:Lcom/voxdon/xplorer/file/o;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/voxdon/xplorer/provider/a$a;->d:Lax/Z2/k;

    .line 6
    .line 7
    iput p4, p0, Lcom/voxdon/xplorer/provider/a$a;->e:I

    .line 8
    .line 9
    invoke-direct {p0}, Landroid/os/ProxyFileDescriptorCallback;-><init>()V

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

.method private a()V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/system/ErrnoException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/voxdon/xplorer/provider/a$a;->b:Z

    .line 2
    .line 3
    if-nez v0, :cond_1f

    .line 4
    .line 5
    :try_start_4
    iget-object v0, p0, Lcom/voxdon/xplorer/provider/a$a;->c:Lcom/voxdon/xplorer/file/o;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/voxdon/xplorer/provider/a$a;->d:Lax/Z2/k;

    .line 8
    .line 9
    invoke-virtual {v1}, Lax/Z2/k;->e()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget v2, p0, Lcom/voxdon/xplorer/provider/a$a;->e:I

    .line 14
    .line 15
    invoke-virtual {v0, v1, v2}, Lcom/voxdon/xplorer/file/o;->j0(Ljava/lang/String;I)Lax/l3/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lcom/voxdon/xplorer/provider/a$a;->a:Lax/l3/a;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Lcom/voxdon/xplorer/provider/a$a;->b:Z
    :try_end_17
    .catch Lax/b3/j; {:try_start_4 .. :try_end_17} :catch_18

    .line 23
    .line 24
    return-void

    .line 25
    :catch_18
    move-exception v0

    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-static {v0, v1}, Lcom/voxdon/xplorer/provider/a;->a(Lax/b3/j;Ljava/lang/String;)Landroid/system/ErrnoException;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    throw v0

    .line 32
    :cond_1f
    return-void
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


# virtual methods
.method public onFsync()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/system/ErrnoException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/provider/a$a;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/provider/a$a;->a:Lax/l3/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/l3/a;->a()V

    .line 7
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

.method public onGetSize()J
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/system/ErrnoException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/provider/a$a;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/provider/a$a;->a:Lax/l3/a;

    .line 5
    .line 6
    invoke-virtual {v0}, Lax/l3/a;->b()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

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

.method public onRead(JI[B)I
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/system/ErrnoException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/provider/a$a;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/provider/a$a;->a:Lax/l3/a;

    .line 5
    .line 6
    const/4 v4, 0x0

    .line 7
    move-wide v1, p1

    .line 8
    move v5, p3

    .line 9
    move-object v3, p4

    .line 10
    invoke-virtual/range {v0 .. v5}, Lax/l3/a;->c(J[BII)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
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

.method public onRelease()V
    .registers 2

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/provider/a$a;->a:Lax/l3/a;

    .line 2
    .line 3
    if-eqz v0, :cond_7

    .line 4
    .line 5
    invoke-virtual {v0}, Lax/l3/a;->d()V

    .line 6
    .line 7
    .line 8
    :cond_7
    return-void
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

.method public onWrite(JI[B)I
    .registers 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/system/ErrnoException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lcom/voxdon/xplorer/provider/a$a;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/voxdon/xplorer/provider/a$a;->a:Lax/l3/a;

    .line 5
    .line 6
    const/4 v4, 0x0

    .line 7
    move-wide v1, p1

    .line 8
    move v5, p3

    .line 9
    move-object v3, p4

    .line 10
    invoke-virtual/range {v0 .. v5}, Lax/l3/a;->e(J[BII)J

    .line 11
    .line 12
    .line 13
    move-result-wide p1

    .line 14
    long-to-int p2, p1

    .line 15
    return p2
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
