.class Lax/a3/V$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/a3/V;->g3()Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lax/a3/V;


# direct methods
.method constructor <init>(Lax/a3/V;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a3/V$a;->a:Lax/a3/V;

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
.method public onClick(Landroid/content/DialogInterface;I)V
    .registers 5

    .line 1
    iget-object v0, p0, Lax/a3/V$a;->a:Lax/a3/V;

    .line 2
    .line 3
    invoke-static {v0}, Lax/a3/V;->i3(Lax/a3/V;)Lax/a3/V$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_19

    .line 8
    .line 9
    iget-object v0, p0, Lax/a3/V$a;->a:Lax/a3/V;

    .line 10
    .line 11
    invoke-static {v0}, Lax/a3/V;->i3(Lax/a3/V;)Lax/a3/V$b;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lax/a3/V$a;->a:Lax/a3/V;

    .line 16
    .line 17
    invoke-static {v1}, Lax/a3/V;->j3(Lax/a3/V;)[Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    aget-object p2, v1, p2

    .line 22
    .line 23
    invoke-interface {v0, p2}, Lax/a3/V$b;->a(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_19
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 27
    .line 28
    .line 29
    return-void
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
