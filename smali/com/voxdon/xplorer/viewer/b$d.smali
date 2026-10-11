.class Lcom/voxdon/xplorer/viewer/b$d;
.super Lax/u3/q;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/voxdon/xplorer/viewer/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lax/u3/q<",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field h:I

.field final synthetic i:Lcom/voxdon/xplorer/viewer/b;


# direct methods
.method constructor <init>(Lcom/voxdon/xplorer/viewer/b;I)V
    .registers 3

    .line 1
    iput-object p1, p0, Lcom/voxdon/xplorer/viewer/b$d;->i:Lcom/voxdon/xplorer/viewer/b;

    .line 2
    .line 3
    sget-object p1, Lax/u3/q$e;->e0:Lax/u3/q$e;

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lax/u3/q;-><init>(Lax/u3/q$e;)V

    .line 6
    .line 7
    .line 8
    iput p2, p0, Lcom/voxdon/xplorer/viewer/b$d;->h:I

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

.method private w(I)V
    .registers 4

    .line 1
    invoke-virtual {p0}, Lax/u3/q;->isCancelled()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    goto :goto_48

    .line 8
    :cond_7
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/b$d;->i:Lcom/voxdon/xplorer/viewer/b;

    .line 9
    .line 10
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/b;->K0(Lcom/voxdon/xplorer/viewer/b;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_48

    .line 15
    .line 16
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/b$d;->i:Lcom/voxdon/xplorer/viewer/b;

    .line 17
    .line 18
    invoke-static {v1, p1}, Lcom/voxdon/xplorer/viewer/b;->L0(Lcom/voxdon/xplorer/viewer/b;I)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_48

    .line 23
    .line 24
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lcom/voxdon/xplorer/file/n;

    .line 29
    .line 30
    invoke-static {p1}, Lax/c3/B;->P(Lcom/voxdon/xplorer/file/n;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_2b

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/voxdon/xplorer/file/n;->P()Lax/Q2/f;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    sget-object v1, Lax/Q2/f;->b1:Lax/Q2/f;

    .line 41
    .line 42
    if-ne v0, v1, :cond_48

    .line 43
    .line 44
    :cond_2b
    invoke-static {p1}, Lax/c3/B;->Y(Lcom/voxdon/xplorer/file/n;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, Lcom/voxdon/xplorer/viewer/b$d;->i:Lcom/voxdon/xplorer/viewer/b;

    .line 49
    .line 50
    invoke-virtual {v1}, Lcom/android/ex/photo/f;->O()Lcom/android/ex/photo/f$g;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-interface {v1}, Lcom/android/ex/photo/f$g;->b()Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v1, v0}, Lax/r3/d;->l(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-nez v0, :cond_48

    .line 63
    .line 64
    iget-object v0, p0, Lcom/voxdon/xplorer/viewer/b$d;->i:Lcom/voxdon/xplorer/viewer/b;

    .line 65
    .line 66
    invoke-static {v0}, Lcom/voxdon/xplorer/viewer/b;->M0(Lcom/voxdon/xplorer/viewer/b;)Lax/r3/d;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0, p1}, Lax/r3/d;->t(Lcom/voxdon/xplorer/file/n;)V

    .line 71
    .line 72
    .line 73
    :cond_48
    :goto_48
    return-void
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
.method protected bridge synthetic g([Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    .line 1
    check-cast p1, [Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/voxdon/xplorer/viewer/b$d;->x([Ljava/lang/Void;)Ljava/lang/Void;

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

.method protected varargs x([Ljava/lang/Void;)Ljava/lang/Void;
    .registers 3

    .line 1
    iget-object p1, p0, Lcom/voxdon/xplorer/viewer/b$d;->i:Lcom/voxdon/xplorer/viewer/b;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/voxdon/xplorer/viewer/b;->J0(Lcom/voxdon/xplorer/viewer/b;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_a

    .line 9
    .line 10
    return-object v0

    .line 11
    :cond_a
    iget p1, p0, Lcom/voxdon/xplorer/viewer/b$d;->h:I

    .line 12
    .line 13
    add-int/lit8 p1, p1, -0x1

    .line 14
    .line 15
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/b$d;->w(I)V

    .line 16
    .line 17
    .line 18
    iget p1, p0, Lcom/voxdon/xplorer/viewer/b$d;->h:I

    .line 19
    .line 20
    add-int/lit8 p1, p1, 0x1

    .line 21
    .line 22
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/b$d;->w(I)V

    .line 23
    .line 24
    .line 25
    iget p1, p0, Lcom/voxdon/xplorer/viewer/b$d;->h:I

    .line 26
    .line 27
    add-int/lit8 p1, p1, -0x2

    .line 28
    .line 29
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/b$d;->w(I)V

    .line 30
    .line 31
    .line 32
    iget p1, p0, Lcom/voxdon/xplorer/viewer/b$d;->h:I

    .line 33
    .line 34
    add-int/lit8 p1, p1, 0x2

    .line 35
    .line 36
    invoke-direct {p0, p1}, Lcom/voxdon/xplorer/viewer/b$d;->w(I)V

    .line 37
    .line 38
    .line 39
    return-object v0
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
