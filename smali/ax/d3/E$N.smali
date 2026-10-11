.class Lax/d3/E$N;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/d3/n$p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/E;->g7(Lcom/voxdon/xplorer/file/n;ZLandroid/content/Intent;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/content/Intent;

.field final synthetic b:Lcom/voxdon/xplorer/file/n;

.field final synthetic c:Z

.field final synthetic d:Lax/d3/E;


# direct methods
.method constructor <init>(Lax/d3/E;Landroid/content/Intent;Lcom/voxdon/xplorer/file/n;Z)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lax/d3/E$N;->d:Lax/d3/E;

    .line 2
    .line 3
    iput-object p2, p0, Lax/d3/E$N;->a:Landroid/content/Intent;

    .line 4
    .line 5
    iput-object p3, p0, Lax/d3/E$N;->b:Lcom/voxdon/xplorer/file/n;

    .line 6
    .line 7
    iput-boolean p4, p0, Lax/d3/E$N;->c:Z

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public a()V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/d3/E$N;->d:Lax/d3/E;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->X0()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_9

    .line 8
    .line 9
    return-void

    .line 10
    :cond_9
    iget-object v0, p0, Lax/d3/E$N;->a:Landroid/content/Intent;

    .line 11
    .line 12
    if-eqz v0, :cond_36

    .line 13
    .line 14
    iget-object v0, p0, Lax/d3/E$N;->d:Lax/d3/E;

    .line 15
    .line 16
    iget-object v1, p0, Lax/d3/E$N;->b:Lcom/voxdon/xplorer/file/n;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->N()Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Ljava/io/File;->lastModified()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    invoke-static {v0, v1, v2, v3}, Lax/d3/E;->y5(Lax/d3/E;Lcom/voxdon/xplorer/file/n;J)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lax/d3/E$N;->d:Lax/d3/E;

    .line 30
    .line 31
    iget-object v1, p0, Lax/d3/E$N;->b:Lcom/voxdon/xplorer/file/n;

    .line 32
    .line 33
    invoke-virtual {v1}, Lcom/voxdon/xplorer/file/n;->N()Ljava/io/File;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-static {v0, v1, v2}, Lax/d3/E;->z5(Lax/d3/E;Lcom/voxdon/xplorer/file/n;Ljava/io/File;)V

    .line 38
    .line 39
    .line 40
    iget-object v0, p0, Lax/d3/E$N;->d:Lax/d3/E;

    .line 41
    .line 42
    iget-object v1, p0, Lax/d3/E$N;->a:Landroid/content/Intent;

    .line 43
    .line 44
    iget-object v2, p0, Lax/d3/E$N;->b:Lcom/voxdon/xplorer/file/n;

    .line 45
    .line 46
    invoke-virtual {v2}, Lcom/voxdon/xplorer/file/n;->A()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    const/4 v3, 0x0

    .line 51
    invoke-static {v0, v1, v3, v3, v2}, Lax/d3/E;->s5(Lax/d3/E;Landroid/content/Intent;IZLjava/lang/String;)Z

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_36
    iget-object v0, p0, Lax/d3/E$N;->d:Lax/d3/E;

    .line 56
    .line 57
    iget-object v1, p0, Lax/d3/E$N;->b:Lcom/voxdon/xplorer/file/n;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    iget-boolean v3, p0, Lax/d3/E$N;->c:Z

    .line 61
    .line 62
    invoke-static {v0, v1, v2, v3}, Lax/d3/E;->u5(Lax/d3/E;Lcom/voxdon/xplorer/file/n;Ljava/lang/String;Z)V

    .line 63
    .line 64
    .line 65
    return-void
    .line 66
    .line 67
    .line 68
.end method
