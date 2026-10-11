.class Lcom/voxdon/xplorer/file/z$c;
.super Ljava/io/FileOutputStream;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/file/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field private c0:Ljava/lang/String;

.field private d0:Lcom/voxdon/xplorer/file/z$a;

.field private e0:Z

.field final synthetic f0:Lcom/voxdon/xplorer/file/z;

.field private q:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/file/z;Ljava/lang/String;Ljava/lang/String;Lcom/voxdon/xplorer/file/z$a;)V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/file/z$c;->f0:Lcom/voxdon/xplorer/file/z;

    .line 2
    .line 3
    invoke-direct {p0, p3}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-boolean p1, p0, Lcom/voxdon/xplorer/file/z$c;->e0:Z

    .line 8
    .line 9
    iput-object p2, p0, Lcom/voxdon/xplorer/file/z$c;->c0:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/voxdon/xplorer/file/z$c;->q:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, Lcom/voxdon/xplorer/file/z$c;->d0:Lcom/voxdon/xplorer/file/z$a;

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
.method public close()V
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-super {p0}, Ljava/io/FileOutputStream;->close()V

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lcom/voxdon/xplorer/file/z$c;->e0:Z

    .line 5
    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    return-void

    .line 9
    :cond_8
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lcom/voxdon/xplorer/file/z$c;->e0:Z

    .line 11
    .line 12
    iget-object v1, p0, Lcom/voxdon/xplorer/file/z$c;->f0:Lcom/voxdon/xplorer/file/z;

    .line 13
    .line 14
    iget-object v2, p0, Lcom/voxdon/xplorer/file/z$c;->q:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v3, p0, Lcom/voxdon/xplorer/file/z$c;->c0:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v1, v2, v3, v0}, Lcom/voxdon/xplorer/file/z;->P(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_3b

    .line 23
    .line 24
    iget-object v0, p0, Lcom/voxdon/xplorer/file/z$c;->d0:Lcom/voxdon/xplorer/file/z$a;

    .line 25
    .line 26
    if-eqz v0, :cond_32

    .line 27
    .line 28
    iget-object v1, p0, Lcom/voxdon/xplorer/file/z$c;->f0:Lcom/voxdon/xplorer/file/z;

    .line 29
    .line 30
    iget-object v2, p0, Lcom/voxdon/xplorer/file/z$c;->c0:Ljava/lang/String;

    .line 31
    .line 32
    iget v0, v0, Lcom/voxdon/xplorer/file/z$a;->c:I

    .line 33
    .line 34
    invoke-static {v1, v2, v0}, Lcom/voxdon/xplorer/file/z;->a(Lcom/voxdon/xplorer/file/z;Ljava/lang/String;I)Z

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, Lcom/voxdon/xplorer/file/z$c;->f0:Lcom/voxdon/xplorer/file/z;

    .line 38
    .line 39
    iget-object v1, p0, Lcom/voxdon/xplorer/file/z$c;->c0:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v2, p0, Lcom/voxdon/xplorer/file/z$c;->d0:Lcom/voxdon/xplorer/file/z$a;

    .line 42
    .line 43
    iget v3, v2, Lcom/voxdon/xplorer/file/z$a;->a:I

    .line 44
    .line 45
    iget v2, v2, Lcom/voxdon/xplorer/file/z$a;->b:I

    .line 46
    .line 47
    invoke-static {v0, v1, v3, v2}, Lcom/voxdon/xplorer/file/z;->b(Lcom/voxdon/xplorer/file/z;Ljava/lang/String;II)Z

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_32
    iget-object v0, p0, Lcom/voxdon/xplorer/file/z$c;->f0:Lcom/voxdon/xplorer/file/z;

    .line 52
    .line 53
    iget-object v1, p0, Lcom/voxdon/xplorer/file/z$c;->c0:Ljava/lang/String;

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    invoke-static {v0, v1, v2}, Lcom/voxdon/xplorer/file/z;->c(Lcom/voxdon/xplorer/file/z;Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_3b
    new-instance v0, Ljava/io/IOException;

    .line 61
    .line 62
    const-string v1, "Move temp file to the path failed"

    .line 63
    .line 64
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0
    .line 68
.end method
