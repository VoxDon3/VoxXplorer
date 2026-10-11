.class Lax/a3/r$b;
.super Lax/a3/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lax/a3/r;->g3()Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lax/a3/r;


# direct methods
.method constructor <init>(Lax/a3/r;)V
    .registers 2

    .line 1
    iput-object p1, p0, Lax/a3/r$b;->b:Lax/a3/r;

    .line 2
    .line 3
    invoke-direct {p0}, Lax/a3/t;-><init>()V

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
.method public a(Landroid/content/DialogInterface;I)V
    .registers 3

    .line 1
    iget-object p2, p0, Lax/a3/r$b;->b:Lax/a3/r;

    .line 2
    .line 3
    invoke-static {p2}, Lax/a3/r;->v3(Lax/a3/r;)Landroid/content/DialogInterface$OnCancelListener;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    if-eqz p2, :cond_11

    .line 8
    .line 9
    iget-object p2, p0, Lax/a3/r$b;->b:Lax/a3/r;

    .line 10
    .line 11
    invoke-static {p2}, Lax/a3/r;->v3(Lax/a3/r;)Landroid/content/DialogInterface$OnCancelListener;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-interface {p2, p1}, Landroid/content/DialogInterface$OnCancelListener;->onCancel(Landroid/content/DialogInterface;)V

    .line 16
    .line 17
    .line 18
    :cond_11
    return-void
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
