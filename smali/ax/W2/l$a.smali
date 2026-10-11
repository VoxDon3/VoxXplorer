.class Lax/W2/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lax/a3/K$i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/W2/l;->J0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/W2/l;


# direct methods
.method constructor <init>(Lax/W2/l;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/W2/l$a;->a:Lax/W2/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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


# virtual methods
.method public a(Lax/W2/j$f;Z)V
    .registers 5

    .line 1
    :try_start_0
    sget-object p2, Lax/W2/l$b;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, p2, p1

    .line 8
    .line 9
    const/4 p2, 0x1

    .line 10
    const/4 v0, 0x0

    .line 11
    if-eq p1, p2, :cond_4f

    .line 12
    .line 13
    const/4 p2, 0x2

    .line 14
    if-eq p1, p2, :cond_24

    .line 15
    .line 16
    const/4 p2, 0x3

    .line 17
    if-eq p1, p2, :cond_1e

    .line 18
    .line 19
    const/4 p2, 0x4

    .line 20
    if-eq p1, p2, :cond_16

    .line 21
    .line 22
    goto :goto_79

    .line 23
    :cond_16
    iget-object p1, p0, Lax/W2/l$a;->a:Lax/W2/l;

    .line 24
    .line 25
    invoke-virtual {p1}, Lax/W2/j;->i()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :catch_1c
    move-exception p1

    .line 30
    goto :goto_76

    .line 31
    :cond_1e
    iget-object p1, p0, Lax/W2/l$a;->a:Lax/W2/l;

    .line 32
    .line 33
    invoke-virtual {p1}, Lax/W2/j;->i()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_24
    iget-object p1, p0, Lax/W2/l$a;->a:Lax/W2/l;

    .line 38
    .line 39
    invoke-static {p1}, Lax/W2/l;->y0(Lax/W2/l;)Lcom/voxdon/xplorer/file/o;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    iget-object v1, p0, Lax/W2/l$a;->a:Lax/W2/l;

    .line 44
    .line 45
    invoke-static {v1}, Lax/W2/l;->w0(Lax/W2/l;)Lcom/voxdon/xplorer/file/n;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {p2, v1, v0}, Lcom/voxdon/xplorer/file/o;->X(Lcom/voxdon/xplorer/file/n;Z)Lcom/voxdon/xplorer/file/n;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-static {p1, p2}, Lax/W2/l;->x0(Lax/W2/l;Lcom/voxdon/xplorer/file/n;)Lcom/voxdon/xplorer/file/n;

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lax/W2/l$a;->a:Lax/W2/l;

    .line 57
    .line 58
    new-instance p2, Lax/W2/l$c;

    .line 59
    .line 60
    iget-object v1, p0, Lax/W2/l$a;->a:Lax/W2/l;

    .line 61
    .line 62
    invoke-direct {p2, v1}, Lax/W2/l$c;-><init>(Lax/W2/l;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p1, p2}, Lax/W2/l;->A0(Lax/W2/l;Lax/W2/l$c;)Lax/W2/l$c;

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lax/W2/l$a;->a:Lax/W2/l;

    .line 69
    .line 70
    invoke-static {p1}, Lax/W2/l;->z0(Lax/W2/l;)Lax/W2/l$c;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    new-array p2, v0, [Ljava/lang/Void;

    .line 75
    .line 76
    invoke-virtual {p1, p2}, Lax/u3/q;->h([Ljava/lang/Object;)Lax/u3/q;

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_4f
    iget-object p1, p0, Lax/W2/l$a;->a:Lax/W2/l;

    .line 81
    .line 82
    invoke-static {p1}, Lax/W2/l;->y0(Lax/W2/l;)Lcom/voxdon/xplorer/file/o;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iget-object p2, p0, Lax/W2/l$a;->a:Lax/W2/l;

    .line 87
    .line 88
    invoke-static {p2}, Lax/W2/l;->w0(Lax/W2/l;)Lcom/voxdon/xplorer/file/n;

    .line 89
    .line 90
    .line 91
    move-result-object p2

    .line 92
    invoke-virtual {p1, p2}, Lcom/voxdon/xplorer/file/o;->P(Lcom/voxdon/xplorer/file/n;)V

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lax/W2/l$a;->a:Lax/W2/l;

    .line 96
    .line 97
    new-instance p2, Lax/W2/l$c;

    .line 98
    .line 99
    iget-object v1, p0, Lax/W2/l$a;->a:Lax/W2/l;

    .line 100
    .line 101
    invoke-direct {p2, v1}, Lax/W2/l$c;-><init>(Lax/W2/l;)V

    .line 102
    .line 103
    .line 104
    invoke-static {p1, p2}, Lax/W2/l;->A0(Lax/W2/l;Lax/W2/l$c;)Lax/W2/l$c;

    .line 105
    .line 106
    .line 107
    iget-object p1, p0, Lax/W2/l$a;->a:Lax/W2/l;

    .line 108
    .line 109
    invoke-static {p1}, Lax/W2/l;->z0(Lax/W2/l;)Lax/W2/l$c;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    new-array p2, v0, [Ljava/lang/Void;

    .line 114
    .line 115
    invoke-virtual {p1, p2}, Lax/u3/q;->h([Ljava/lang/Object;)Lax/u3/q;
    :try_end_75
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_75} :catch_1c

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :goto_76
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 120
    .line 121
    .line 122
    :goto_79
    return-void
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
