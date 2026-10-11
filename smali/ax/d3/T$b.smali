.class Lax/d3/T$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/preference/Preference$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/d3/T;->A3()V
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
    iput-object p1, p0, Lax/d3/T$b;->a:Lax/d3/T;

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
    iget-object p1, p0, Lax/d3/T$b;->a:Lax/d3/T;

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
    instance-of p1, p2, Ljava/lang/Boolean;

    .line 12
    .line 13
    if-nez p1, :cond_f

    .line 14
    .line 15
    return v0

    .line 16
    :cond_f
    iget-object p1, p0, Lax/d3/T$b;->a:Lax/d3/T;

    .line 17
    .line 18
    invoke-static {p1}, Lax/d3/T;->m3(Lax/d3/T;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_71

    .line 23
    .line 24
    iget-object p1, p0, Lax/d3/T$b;->a:Lax/d3/T;

    .line 25
    .line 26
    invoke-static {p1, v0}, Lax/d3/T;->g3(Lax/d3/T;Z)Z

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Lax/d3/T$b;->a:Lax/d3/T;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object v0, p0, Lax/d3/T$b;->a:Lax/d3/T;

    .line 36
    .line 37
    invoke-static {v0}, Lax/d3/T;->h3(Lax/d3/T;)Lax/Q2/f;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v1, p0, Lax/d3/T$b;->a:Lax/d3/T;

    .line 42
    .line 43
    invoke-static {v1}, Lax/d3/T;->i3(Lax/d3/T;)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    iget-object v2, p0, Lax/d3/T$b;->a:Lax/d3/T;

    .line 48
    .line 49
    invoke-static {v2}, Lax/d3/T;->j3(Lax/d3/T;)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    const-string v3, "show_thumbnails"

    .line 54
    .line 55
    invoke-static {p1, v0, v1, v2, v3}, Lax/t3/e;->a(Landroid/content/Context;Lax/Q2/f;IZLjava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object p1, p0, Lax/d3/T$b;->a:Lax/d3/T;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->b()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iget-object p1, p0, Lax/d3/T$b;->a:Lax/d3/T;

    .line 65
    .line 66
    invoke-static {p1}, Lax/d3/T;->h3(Lax/d3/T;)Lax/Q2/f;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    iget-object p1, p0, Lax/d3/T$b;->a:Lax/d3/T;

    .line 71
    .line 72
    invoke-static {p1}, Lax/d3/T;->i3(Lax/d3/T;)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    iget-object p1, p0, Lax/d3/T$b;->a:Lax/d3/T;

    .line 77
    .line 78
    invoke-static {p1}, Lax/d3/T;->j3(Lax/d3/T;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    check-cast p2, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    const/4 v3, 0x0

    .line 89
    invoke-static/range {v0 .. v5}, Lax/t3/e;->o(Landroid/content/Context;Lax/Q2/f;ILjava/lang/String;ZZ)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lax/d3/T$b;->a:Lax/d3/T;

    .line 93
    .line 94
    const/4 p2, 0x0

    .line 95
    invoke-static {p1, p2}, Lax/d3/T;->g3(Lax/d3/T;Z)Z

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Lax/d3/T$b;->a:Lax/d3/T;

    .line 99
    .line 100
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->z0()Landroidx/fragment/app/Fragment;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    instance-of v0, p1, Lax/a3/d;

    .line 105
    .line 106
    if-eqz v0, :cond_70

    .line 107
    .line 108
    check-cast p1, Lax/a3/d;

    .line 109
    .line 110
    invoke-virtual {p1}, Lax/a3/d;->S()V

    .line 111
    .line 112
    .line 113
    :cond_70
    return p2

    .line 114
    :cond_71
    return v0
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
