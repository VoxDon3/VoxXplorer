.class Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$a;
.super Lax/g3/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->R3(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$a;->c:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/g3/c;-><init>()V

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

.method public static synthetic b(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$a;Ljava/lang/Integer;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$a;->c:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sget v1, Lax/w3/d;->j:I

    .line 17
    .line 18
    if-ne v0, v1, :cond_19

    .line 19
    .line 20
    iget-object p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$a;->c:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->z3()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_19
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    sget v0, Lax/w3/d;->k:I

    .line 31
    .line 32
    if-ne p1, v0, :cond_29

    .line 33
    .line 34
    iget-object p0, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$a;->c:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 35
    .line 36
    const p1, 0x7f130137

    .line 37
    .line 38
    .line 39
    invoke-static {p0, p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->k0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;I)V

    .line 40
    .line 41
    .line 42
    :cond_29
    return-void
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
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .registers 5

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$a;->c:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;->j0(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Lax/w3/d;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$a;->c:Lcom/voxdon/xplorer/viewer/VideoPlayerActivity;

    .line 14
    .line 15
    new-instance v2, Lcom/voxdon/xplorer/viewer/f;

    .line 16
    .line 17
    invoke-direct {v2, p0}, Lcom/voxdon/xplorer/viewer/f;-><init>(Lcom/voxdon/xplorer/viewer/VideoPlayerActivity$a;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, v1, v2}, Lax/w3/d;-><init>(Landroid/content/Context;Lax/b0/a;)V

    .line 21
    .line 22
    .line 23
    new-array v0, v0, [Ljava/lang/Void;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Lax/u3/q;->i([Ljava/lang/Object;)Lax/u3/q;

    .line 26
    .line 27
    .line 28
    return-void
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
