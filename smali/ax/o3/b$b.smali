.class Lax/o3/b$b;
.super Landroid/os/FileObserver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/o3/b;->r(Lax/o3/b$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/o3/b$c;

.field final synthetic b:Lax/o3/b;


# direct methods
.method constructor <init>(Lax/o3/b;Ljava/lang/String;Lax/o3/b$c;)V
    .registers 4

    .line 1
    iput-object p1, p0, Lax/o3/b$b;->b:Lax/o3/b;

    .line 2
    .line 3
    iput-object p3, p0, Lax/o3/b$b;->a:Lax/o3/b$c;

    .line 4
    .line 5
    invoke-direct {p0, p2}, Landroid/os/FileObserver;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
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


# virtual methods
.method public onEvent(ILjava/lang/String;)V
    .registers 4

    .line 1
    iget-object p2, p0, Lax/o3/b$b;->a:Lax/o3/b$c;

    .line 2
    .line 3
    invoke-static {p2}, Lax/o3/b$c;->r(Lax/o3/b$c;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-nez p2, :cond_81

    .line 8
    .line 9
    iget-object p2, p0, Lax/o3/b$b;->a:Lax/o3/b$c;

    .line 10
    .line 11
    invoke-static {p2}, Lax/o3/b$c;->b(Lax/o3/b$c;)Z

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    if-eqz p2, :cond_11

    .line 16
    .line 17
    goto :goto_81

    .line 18
    :cond_11
    const/16 p2, 0x20

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    if-ne p1, p2, :cond_23

    .line 22
    .line 23
    iget-object p1, p0, Lax/o3/b$b;->b:Lax/o3/b;

    .line 24
    .line 25
    const-string p2, "observer : open"

    .line 26
    .line 27
    invoke-static {p1, p2}, Lax/o3/b;->a(Lax/o3/b;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lax/o3/b$b;->a:Lax/o3/b$c;

    .line 31
    .line 32
    invoke-static {p1, v0}, Lax/o3/b$c;->g(Lax/o3/b$c;I)I

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_23
    const/16 p2, 0x8

    .line 37
    .line 38
    if-ne p1, p2, :cond_36

    .line 39
    .line 40
    iget-object p1, p0, Lax/o3/b$b;->b:Lax/o3/b;

    .line 41
    .line 42
    const-string p2, "observer : close write"

    .line 43
    .line 44
    invoke-static {p1, p2}, Lax/o3/b;->a(Lax/o3/b;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lax/o3/b$b;->b:Lax/o3/b;

    .line 48
    .line 49
    iget-object p2, p0, Lax/o3/b$b;->a:Lax/o3/b$c;

    .line 50
    .line 51
    invoke-static {p1, p2, v0}, Lax/o3/b;->d(Lax/o3/b;Lax/o3/b$c;Z)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_36
    const/16 p2, 0x400

    .line 56
    .line 57
    if-ne p1, p2, :cond_50

    .line 58
    .line 59
    iget-object p1, p0, Lax/o3/b$b;->b:Lax/o3/b;

    .line 60
    .line 61
    const-string p2, "observer : delete_self"

    .line 62
    .line 63
    invoke-static {p1, p2}, Lax/o3/b;->a(Lax/o3/b;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iget-object p1, p0, Lax/o3/b$b;->b:Lax/o3/b;

    .line 67
    .line 68
    iget-object p2, p0, Lax/o3/b$b;->a:Lax/o3/b$c;

    .line 69
    .line 70
    invoke-static {p1, p2, v0}, Lax/o3/b;->d(Lax/o3/b;Lax/o3/b$c;Z)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lax/o3/b$b;->b:Lax/o3/b;

    .line 74
    .line 75
    iget-object p2, p0, Lax/o3/b$b;->a:Lax/o3/b$c;

    .line 76
    .line 77
    invoke-static {p1, p2}, Lax/o3/b;->b(Lax/o3/b;Lax/o3/b$c;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_50
    const/4 p2, 0x2

    .line 82
    if-ne p1, p2, :cond_61

    .line 83
    .line 84
    iget-object p1, p0, Lax/o3/b$b;->b:Lax/o3/b;

    .line 85
    .line 86
    const-string p2, "observer : modify"

    .line 87
    .line 88
    invoke-static {p1, p2}, Lax/o3/b;->a(Lax/o3/b;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Lax/o3/b$b;->a:Lax/o3/b$c;

    .line 92
    .line 93
    const/4 p2, 0x1

    .line 94
    invoke-static {p1, p2}, Lax/o3/b$c;->p(Lax/o3/b$c;Z)Z

    .line 95
    .line 96
    .line 97
    return-void

    .line 98
    :cond_61
    const p2, 0x8000

    .line 99
    .line 100
    .line 101
    if-ne p1, p2, :cond_81

    .line 102
    .line 103
    iget-object p1, p0, Lax/o3/b$b;->b:Lax/o3/b;

    .line 104
    .line 105
    const-string p2, "observer : ignored"

    .line 106
    .line 107
    invoke-static {p1, p2}, Lax/o3/b;->a(Lax/o3/b;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object p1, p0, Lax/o3/b$b;->a:Lax/o3/b$c;

    .line 111
    .line 112
    invoke-static {p1}, Lax/o3/b$c;->f(Lax/o3/b$c;)I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    if-gtz p1, :cond_81

    .line 117
    .line 118
    iget-object p1, p0, Lax/o3/b$b;->a:Lax/o3/b$c;

    .line 119
    .line 120
    invoke-static {p1}, Lax/o3/b$c;->h(Lax/o3/b$c;)I

    .line 121
    .line 122
    .line 123
    iget-object p1, p0, Lax/o3/b$b;->b:Lax/o3/b;

    .line 124
    .line 125
    iget-object p2, p0, Lax/o3/b$b;->a:Lax/o3/b$c;

    .line 126
    .line 127
    invoke-static {p1, p2}, Lax/o3/b;->b(Lax/o3/b;Lax/o3/b$c;)V

    .line 128
    .line 129
    .line 130
    :cond_81
    :goto_81
    return-void
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
