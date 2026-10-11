.class Lax/d3/T$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/preference/Preference$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/T;->B3()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/d3/T;


# direct methods
.method constructor <init>(Lax/d3/T;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/d3/T$j;->a:Lax/d3/T;

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
.method public a(Landroidx/preference/Preference;Ljava/lang/Object;)Z
    .registers 9

    .line 1
    iget-object p1, p0, Lax/d3/T$j;->a:Lax/d3/T;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    if-nez p1, :cond_a

    .line 9
    .line 10
    return v0

    .line 11
    :cond_a
    instance-of p1, p2, Ljava/lang/String;

    .line 12
    .line 13
    if-nez p1, :cond_f

    .line 14
    .line 15
    return v0

    .line 16
    :cond_f
    iget-object p1, p0, Lax/d3/T$j;->a:Lax/d3/T;

    .line 17
    .line 18
    invoke-static {p1}, Lax/d3/T;->m3(Lax/d3/T;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_6e

    .line 23
    .line 24
    iget-object p1, p0, Lax/d3/T$j;->a:Lax/d3/T;

    .line 25
    .line 26
    invoke-static {p1, v0}, Lax/d3/T;->g3(Lax/d3/T;Z)Z

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lax/d3/T$j;->a:Lax/d3/T;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object v0, p0, Lax/d3/T$j;->a:Lax/d3/T;

    .line 36
    .line 37
    invoke-static {v0}, Lax/d3/T;->h3(Lax/d3/T;)Lax/Q2/f;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v1, p0, Lax/d3/T$j;->a:Lax/d3/T;

    .line 42
    .line 43
    invoke-static {v1}, Lax/d3/T;->i3(Lax/d3/T;)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-object v2, p0, Lax/d3/T$j;->a:Lax/d3/T;

    .line 48
    .line 49
    invoke-static {v2}, Lax/d3/T;->j3(Lax/d3/T;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    const-string v3, "sort_type"

    .line 54
    .line 55
    invoke-static {p1, v0, v1, v2, v3}, Lax/t3/e;->a(Landroid/content/Context;Lax/Q2/f;IZLjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lax/d3/T$j;->a:Lax/d3/T;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object p1, p0, Lax/d3/T$j;->a:Lax/d3/T;

    .line 65
    .line 66
    invoke-static {p1}, Lax/d3/T;->h3(Lax/d3/T;)Lax/Q2/f;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object p1, p0, Lax/d3/T$j;->a:Lax/d3/T;

    .line 71
    .line 72
    invoke-static {p1}, Lax/d3/T;->i3(Lax/d3/T;)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    iget-object p1, p0, Lax/d3/T$j;->a:Lax/d3/T;

    .line 77
    .line 78
    invoke-static {p1}, Lax/d3/T;->j3(Lax/d3/T;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    move-object v5, p2

    .line 83
    check-cast v5, Ljava/lang/String;

    .line 84
    .line 85
    const/4 v3, 0x0

    .line 86
    invoke-static/range {v0 .. v5}, Lax/t3/e;->p(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;ZLjava/lang/String;)V

    .line 87
    .line 88
    .line 89
    iget-object p1, p0, Lax/d3/T$j;->a:Lax/d3/T;

    .line 90
    .line 91
    const/4 p2, 0x0

    .line 92
    invoke-static {p1, p2}, Lax/d3/T;->g3(Lax/d3/T;Z)Z

    .line 93
    .line 94
    .line 95
    iget-object p1, p0, Lax/d3/T$j;->a:Lax/d3/T;

    .line 96
    .line 97
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->z0()Landroidx/fragment/app/Fragment;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    instance-of v0, p1, Lax/a3/d;

    .line 102
    .line 103
    if-eqz v0, :cond_6d

    .line 104
    .line 105
    check-cast p1, Lax/a3/d;

    .line 106
    .line 107
    invoke-virtual {p1}, Lax/a3/d;->S()V

    .line 108
    .line 109
    .line 110
    :cond_6d
    return p2

    .line 111
    :cond_6e
    return v0
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
